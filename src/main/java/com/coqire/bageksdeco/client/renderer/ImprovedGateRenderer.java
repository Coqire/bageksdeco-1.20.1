package com.coqire.bageksdeco.client.renderer;

import com.coqire.bageksdeco.block.GateSwing;
import com.coqire.bageksdeco.block.ImprovedFenceBlock;
import com.coqire.bageksdeco.block.entity.ImprovedGateBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.data.ModelData;

public class ImprovedGateRenderer implements BlockEntityRenderer<ImprovedGateBlockEntity> {

    private final BlockRenderDispatcher blockRenderer;

    public ImprovedGateRenderer(BlockEntityRendererProvider.Context context) {
        this.blockRenderer = context.getBlockRenderDispatcher();
    }

    @Override
    public void render(
            ImprovedGateBlockEntity blockEntity,
            float partialTick,
            PoseStack poseStack,
            MultiBufferSource buffer,
            int packedLight,
            int packedOverlay
    ) {
        BlockState state = blockEntity.getBlockState();

        if (state.getValue(ImprovedFenceBlock.PART) != 0) return;
        if (!state.getValue(ImprovedFenceBlock.OPEN)) return;
        if (!(state.getBlock() instanceof ImprovedFenceBlock gate)) return;

        BlockState modelState =
                state.setValue(ImprovedFenceBlock.OPEN, false);

        boolean rightSwing =
                gate.getSwing() == GateSwing.RIGHT;

        float hingeX;
        float hingeZ;

        switch (state.getValue(ImprovedFenceBlock.FACING)) {
            case SOUTH -> {
                hingeX = rightSwing
                        ? -15.25F / 16.0F
                        : 31.25F / 16.0F;
                hingeZ = 0.0F;
            }

            case NORTH -> {
                hingeX = rightSwing
                        ? 31.25F / 16.0F
                        : -15.25F / 16.0F;
                hingeZ = 1.0F;
            }

            case EAST -> {
                hingeX = 0.0F;
                hingeZ = rightSwing
                        ? 31.25F / 16.0F
                        : -15.25F / 16.0F;
            }

            case WEST -> {
                hingeX = 1.0F;
                hingeZ = rightSwing
                        ? -15.25F / 16.0F
                        : 31.25F / 16.0F;
            }

            default -> {
                hingeX = rightSwing
                        ? -15.25F / 16.0F
                        : 31.25F / 16.0F;
                hingeZ = 0.0F;
            }
        }

        float openRotation =
                rightSwing ? -90.0F : 90.0F;

        poseStack.pushPose();

        poseStack.translate(
                hingeX,
                0.0F,
                hingeZ
        );

        poseStack.mulPose(
                Axis.YP.rotationDegrees(openRotation)
        );

        poseStack.translate(
                -hingeX,
                0.0F,
                -hingeZ
        );

        blockRenderer.renderSingleBlock(
                modelState,
                poseStack,
                buffer,
                packedLight,
                packedOverlay,
                ModelData.EMPTY,
                RenderType.cutout()
        );

        poseStack.popPose();
    }
}