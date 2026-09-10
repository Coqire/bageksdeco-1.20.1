package com.coqire.bageksdeco.block.entity;

import com.coqire.bageksdeco.block.ImprovedFenceBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ImprovedGateBlockEntity extends BlockEntity {

    private BlockPos masterPos;

    public ImprovedGateBlockEntity(
            BlockPos pos,
            BlockState state
    ) {
        super(
                ModBlockEntities.IMPROVED_GATE.get(),
                pos,
                state
        );

        this.masterPos = pos;
    }

    public BlockPos getMasterPos() {
        return masterPos;
    }

    public void setMasterPos(BlockPos masterPos) {
        this.masterPos = masterPos;
        setChanged();
    }

    public boolean isMaster() {
        return getBlockState().getValue(ImprovedFenceBlock.PART) == 0;
    }
}