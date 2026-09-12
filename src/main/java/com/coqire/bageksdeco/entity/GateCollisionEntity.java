package com.coqire.bageksdeco.entity;

import com.coqire.bageksdeco.block.ImprovedFenceBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.network.NetworkHooks;

public class GateCollisionEntity extends Entity {

    private static final EntityDataAccessor<BlockPos> MASTER_POS =
            SynchedEntityData.defineId(
                    GateCollisionEntity.class,
                    EntityDataSerializers.BLOCK_POS
            );

    public GateCollisionEntity(
            EntityType<? extends GateCollisionEntity> type,
            Level level
    ) {
        super(type, level);

        this.setNoGravity(true);
        this.setInvulnerable(true);
        this.setSilent(true);
        this.setInvisible(true);
    }

    @Override
    protected void defineSynchedData() {
        this.entityData.define(
                MASTER_POS,
                BlockPos.ZERO
        );
    }

    public void setMasterPos(BlockPos pos) {
        this.entityData.set(
                MASTER_POS,
                pos.immutable()
        );
    }

    public BlockPos getMasterPos() {
        return this.entityData.get(MASTER_POS);
    }

    @Override
    public void tick() {
        super.tick();

        BlockPos masterPos = getMasterPos();

        if (masterPos.equals(BlockPos.ZERO)) {
            if (!level().isClientSide) {
                discard();
            }
            return;
        }

        BlockState state = level().getBlockState(masterPos);

        // Remove ourselves if the gate no longer exists.
        if (!(state.getBlock() instanceof ImprovedFenceBlock)
                || state.getValue(ImprovedFenceBlock.PART) != 0
                || !state.getValue(ImprovedFenceBlock.OPEN)) {

            if (!level().isClientSide) {
                discard();
            }

            return;
        }

        // Keep the collision box synchronized on both sides.
        AABB box = createCollisionBox(
                masterPos,
                state
        );

        this.setPosRaw(
                box.getCenter().x,
                box.getCenter().y,
                box.getCenter().z
        );

        this.setBoundingBox(box);
    }

    public static AABB createCollisionBox(
            BlockPos masterPos,
            BlockState state
    ) {
        double x = masterPos.getX();
        double y = masterPos.getY();
        double z = masterPos.getZ();

        return switch (state.getValue(ImprovedFenceBlock.FACING)) {

            case SOUTH -> new AABB(
                    x + 1.75,
                    y,
                    z,
                    x + 2.25,
                    y + 2.0,
                    z + 3.0
            );

            case NORTH -> new AABB(
                    x - 1.25,
                    y,
                    z - 2.0,
                    x - 0.75,
                    y + 2.0,
                    z + 1.0
            );

            case EAST -> new AABB(
                    x,
                    y,
                    z - 1.0,
                    x + 3.0,
                    y + 2.0,
                    z - 0.5
            );

            case WEST -> new AABB(
                    x - 2.0,
                    y,
                    z + 1.75,
                    x + 1.0,
                    y + 2.0,
                    z + 2.25
            );

            default -> new AABB(
                    x,
                    y,
                    z,
                    x + 1,
                    y + 2,
                    z + 1
            );
        };
    }

    public static void spawnForGate(
            ServerLevel level,
            BlockPos masterPos
    ) {

        // Don't create duplicates.
        if (!level.getEntitiesOfClass(
                GateCollisionEntity.class,
                new AABB(masterPos).inflate(6),
                entity -> entity.getMasterPos().equals(masterPos)
        ).isEmpty()) {
            return;
        }

        GateCollisionEntity entity =
                ModEntities.GATE_COLLISION.get().create(level);

        if (entity == null) {
            return;
        }

        entity.setMasterPos(masterPos);

        BlockState state =
                level.getBlockState(masterPos);

        AABB box =
                createCollisionBox(
                        masterPos,
                        state
                );

        entity.setPosRaw(
                box.getCenter().x,
                box.getCenter().y,
                box.getCenter().z
        );

        entity.setBoundingBox(box);

        level.addFreshEntity(entity);
    }

    public static void removeForGate(
            ServerLevel level,
            BlockPos masterPos
    ) {

        level.getEntitiesOfClass(
                GateCollisionEntity.class,
                new AABB(masterPos).inflate(6),
                entity -> entity.getMasterPos().equals(masterPos)
        ).forEach(Entity::discard);
    }

    @Override
    public boolean canBeCollidedWith() {
        return true;
    }

    @Override
    public boolean isPickable() {
        return false;
    }

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    public void push(Entity entity) {
        // Do nothing.
    }

    @Override
    public void push(
            double x,
            double y,
            double z
    ) {
        // Do nothing.
    }

    @Override
    public boolean canCollideWith(Entity entity) {
        return true;
    }

    @Override
    protected void readAdditionalSaveData(
            CompoundTag tag
    ) {
        if (tag.contains("MasterX")) {
            setMasterPos(
                    new BlockPos(
                            tag.getInt("MasterX"),
                            tag.getInt("MasterY"),
                            tag.getInt("MasterZ")
                    )
            );
        }
    }

    @Override
    protected void addAdditionalSaveData(
            CompoundTag tag
    ) {
        BlockPos pos = getMasterPos();

        tag.putInt("MasterX", pos.getX());
        tag.putInt("MasterY", pos.getY());
        tag.putInt("MasterZ", pos.getZ());
    }

    @Override
    public Packet<ClientGamePacketListener> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}