package com.coqire.bageksdeco.block;

import com.coqire.bageksdeco.block.entity.ImprovedGateBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ImprovedFenceBlock extends BaseEntityBlock {

    public static final IntegerProperty PART =
            IntegerProperty.create("part", 0, 5);

    public static final BooleanProperty OPEN =
            BooleanProperty.create("open");

    public static final DirectionProperty FACING =
            DirectionProperty.create("facing", Direction.Plane.HORIZONTAL);

    /*
     * PARTS:
     *
     *        4 | 3 | 5
     *       ---+---+---
     *        1 | 0 | 2
     *
     * PART 0 = master / center bottom
     */

    private static final VoxelShape SOUTH_SHAPE =
            Block.box(0, 0, 0, 16, 16, 3);

    private static final VoxelShape NORTH_SHAPE =
            Block.box(0, 0, 13, 16, 16, 16);

    private static final VoxelShape EAST_SHAPE =
            Block.box(0, 0, 0, 3, 16, 16);

    private static final VoxelShape WEST_SHAPE =
            Block.box(13, 0, 0, 16, 16, 16);

    private static final VoxelShape OPEN_SHAPE =
            Shapes.empty();

    private static final ThreadLocal<Boolean> REMOVING_MULTIBLOCK =
            ThreadLocal.withInitial(() -> false);

    public ImprovedFenceBlock(Properties properties) {
        super(properties);

        registerDefaultState(
                stateDefinition.any()
                        .setValue(PART, 0)
                        .setValue(OPEN, false)
                        .setValue(FACING, Direction.NORTH)
        );
    }

    @Override
    protected void createBlockStateDefinition(
            StateDefinition.Builder<Block, BlockState> builder
    ) {
        builder.add(
                PART,
                OPEN,
                FACING
        );
    }

    /*
     * Gets the direction the player is looking toward when placing.
     */
    @Override
    public BlockState getStateForPlacement(
            BlockPlaceContext context
    ) {

        Level level = context.getLevel();
        BlockPos masterPos = context.getClickedPos();

        Direction facing =
                context.getHorizontalDirection();

        Direction left = getLeftDirection(facing);
        Direction right = getRightDirection(facing);

        BlockPos leftPos =
                masterPos.relative(left);

        BlockPos rightPos =
                masterPos.relative(right);

        BlockPos top =
                masterPos.above();

        BlockPos topLeft =
                top.relative(left);

        BlockPos topRight =
                top.relative(right);

        if (!level.getBlockState(masterPos).canBeReplaced(context)) {
            return null;
        }

        if (!level.getBlockState(leftPos).canBeReplaced(context)) {
            return null;
        }

        if (!level.getBlockState(rightPos).canBeReplaced(context)) {
            return null;
        }

        if (!level.getBlockState(top).canBeReplaced(context)) {
            return null;
        }

        if (!level.getBlockState(topLeft).canBeReplaced(context)) {
            return null;
        }

        if (!level.getBlockState(topRight).canBeReplaced(context)) {
            return null;
        }

        return defaultBlockState()
                .setValue(PART, 0)
                .setValue(OPEN, false)
                .setValue(FACING, facing);
    }

    private static Direction getLeftDirection(Direction facing) {

        if (facing == Direction.NORTH || facing == Direction.WEST) {
            return facing.getClockWise();
        }

        return facing.getCounterClockWise();
    }

    /*
     * Returns the direction used for the right side of the gate.
     */
    private static Direction getRightDirection(Direction facing) {

        if (facing == Direction.NORTH || facing == Direction.WEST) {
            return facing.getCounterClockWise();
        }

        return facing.getClockWise();
    }

    /*
     * Creates the other five blocks.
     */
    @Override
    public void setPlacedBy(
            Level level,
            BlockPos pos,
            BlockState state,
            LivingEntity placer,
            ItemStack stack
    ) {

        super.setPlacedBy(
                level,
                pos,
                state,
                placer,
                stack
        );

        if (level.isClientSide) {
            return;
        }

        Direction facing =
                state.getValue(FACING);

        Direction left =
                getLeftDirection(facing);

        Direction right =
                getRightDirection(facing);

        setPart(
                level,
                pos.relative(left),
                1,
                facing
        );

        setPart(
                level,
                pos.relative(right),
                2,
                facing
        );

        BlockPos top =
                pos.above();

        setPart(
                level,
                top,
                3,
                facing
        );

        setPart(
                level,
                top.relative(left),
                4,
                facing
        );

        setPart(
                level,
                top.relative(right),
                5,
                facing
        );

        BlockEntity blockEntity =
                level.getBlockEntity(pos);

        if (blockEntity instanceof ImprovedGateBlockEntity gate) {
            gate.setMasterPos(pos);
        }
    }

    private void setPart(
            Level level,
            BlockPos pos,
            int part,
            Direction facing
    ) {

        level.setBlock(
                pos,
                defaultBlockState()
                        .setValue(PART, part)
                        .setValue(OPEN, false)
                        .setValue(FACING, facing),
                Block.UPDATE_ALL
        );
    }

    /*
     * Right-click instantly opens/closes the gate.
     */
    @Override
    public InteractionResult use(
            BlockState state,
            Level level,
            BlockPos pos,
            net.minecraft.world.entity.player.Player player,
            InteractionHand hand,
            BlockHitResult hit
    ) {

        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        }

        BlockPos masterPos =
                findMasterPosition(pos, state);

        BlockState masterState =
                level.getBlockState(masterPos);

        if (!(masterState.getBlock()
                instanceof ImprovedFenceBlock)) {
            return InteractionResult.PASS;
        }

        boolean newOpen =
                !masterState.getValue(OPEN);

        setOpenState(
                level,
                masterPos,
                newOpen
        );

        return InteractionResult.SUCCESS;
    }

    private void setOpenState(
            Level level,
            BlockPos masterPos,
            boolean open
    ) {

        BlockState master =
                level.getBlockState(masterPos);

        Direction facing =
                master.getValue(FACING);

        Direction left =
                getLeftDirection(facing);

        Direction right =
                getRightDirection(facing);

        setOpen(
                level,
                masterPos,
                0,
                facing,
                open
        );

        setOpen(
                level,
                masterPos.relative(left),
                1,
                facing,
                open
        );

        setOpen(
                level,
                masterPos.relative(right),
                2,
                facing,
                open
        );

        BlockPos top =
                masterPos.above();

        setOpen(
                level,
                top,
                3,
                facing,
                open
        );

        setOpen(
                level,
                top.relative(left),
                4,
                facing,
                open
        );

        setOpen(
                level,
                top.relative(right),
                5,
                facing,
                open
        );
    }

    private void setOpen(
            Level level,
            BlockPos pos,
            int part,
            Direction facing,
            boolean open
    ) {

        BlockState state =
                level.getBlockState(pos);

        if (state.getBlock() instanceof ImprovedFenceBlock) {

            level.setBlock(
                    pos,
                    defaultBlockState()
                            .setValue(PART, part)
                            .setValue(OPEN, open)
                            .setValue(FACING, facing),
                    Block.UPDATE_ALL
            );
        }
    }

    /*
     * Finds the master block from any part.
     */
    private BlockPos findMasterPosition(
            BlockPos pos,
            BlockState state
    ) {

        int part =
                state.getValue(PART);

        Direction facing =
                state.getValue(FACING);

        Direction left =
                getLeftDirection(facing);

        Direction right =
                getRightDirection(facing);

        return switch (part) {

            case 0 -> pos;

            case 1 -> pos.relative(right);

            case 2 -> pos.relative(left);

            case 3 -> pos.below();

            case 4 -> pos.below().relative(right);

            case 5 -> pos.below().relative(left);

            default -> pos;
        };
    }

    @Override
    public VoxelShape getCollisionShape(
            BlockState state,
            BlockGetter level,
            BlockPos pos,
            CollisionContext context
    ) {
        if (state.getValue(OPEN)) {
            return OPEN_SHAPE;
        }

        return switch (state.getValue(FACING)) {
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case EAST -> EAST_SHAPE;
            case WEST -> WEST_SHAPE;
            default -> SOUTH_SHAPE;
        };
    }

    @Override
    public VoxelShape getShape(
            BlockState state,
            BlockGetter level,
            BlockPos pos,
            CollisionContext context
    ) {
        if (state.getValue(OPEN)) {
            return OPEN_SHAPE;
        }

        return switch (state.getValue(FACING)) {
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case EAST -> EAST_SHAPE;
            case WEST -> WEST_SHAPE;
            default -> SOUTH_SHAPE;
        };
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        if (state.getValue(OPEN)) {
            return RenderShape.ENTITYBLOCK_ANIMATED;
        }

        return RenderShape.MODEL;
    }

    /*
     * Breaking ANY part removes the entire gate.
     */
    @Override
    public void onRemove(
            BlockState state,
            Level level,
            BlockPos pos,
            BlockState newState,
            boolean movedByPiston
    ) {

        if (state.getBlock() != newState.getBlock()) {

            if (!REMOVING_MULTIBLOCK.get()) {

                REMOVING_MULTIBLOCK.set(true);

                try {

                    int part =
                            state.getValue(PART);

                    Direction facing =
                            state.getValue(FACING);

                    Direction left =
                            getLeftDirection(facing);

                    Direction right =
                            getRightDirection(facing);

                    BlockPos masterPos =
                            switch (part) {

                                case 0 -> pos;

                                case 1 -> pos.relative(right);

                                case 2 -> pos.relative(left);

                                case 3 -> pos.below();

                                case 4 -> pos.below().relative(right);

                                case 5 -> pos.below().relative(left);

                                default -> pos;
                            };

                    removePart(
                            level,
                            masterPos
                    );

                    removePart(
                            level,
                            masterPos.relative(left)
                    );

                    removePart(
                            level,
                            masterPos.relative(right)
                    );

                    BlockPos top =
                            masterPos.above();

                    removePart(
                            level,
                            top
                    );

                    removePart(
                            level,
                            top.relative(left)
                    );

                    removePart(
                            level,
                            top.relative(right)
                    );

                } finally {

                    REMOVING_MULTIBLOCK.set(false);
                }
            }
        }

        super.onRemove(
                state,
                level,
                pos,
                newState,
                movedByPiston
        );
    }

    private void removePart(
            Level level,
            BlockPos pos
    ) {

        if (level.getBlockState(pos)
                .getBlock() instanceof ImprovedFenceBlock) {

            level.removeBlock(
                    pos,
                    false
            );
        }
    }

    @Override
    public BlockEntity newBlockEntity(
            BlockPos pos,
            BlockState state
    ) {

        if (state.getValue(PART) != 0) {
            return null;
        }

        return new ImprovedGateBlockEntity(
                pos,
                state
        );
    }
}