package com.coqire.bageksdeco.client.renderer;

import com.coqire.bageksdeco.block.ImprovedFenceBlock;
import com.coqire.bageksdeco.block.entity.ImprovedGateBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.data.ModelData;

public class ImprovedGateRenderer
        implements BlockEntityRenderer<ImprovedGateBlockEntity> {

    private final BlockRenderDispatcher blockRenderer;

    public ImprovedGateRenderer(
            BlockEntityRendererProvider.Context context
    ) {
        this.blockRenderer =
                Minecraft.getInstance().getBlockRenderer();
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

        // Only the master block renders the complete gate.
        if (state.getValue(ImprovedFenceBlock.PART) != 0) {
            return;
        }

        // Only use this renderer while the gate is open.
        if (!state.getValue(ImprovedFenceBlock.OPEN)) {
            return;
        }


        BlockState modelState = state.setValue(
                ImprovedFenceBlock.OPEN,
                false
        );

        poseStack.pushPose();

        float hingeX;
        float hingeZ;

        switch (state.getValue(ImprovedFenceBlock.FACING)) {
            case SOUTH -> {
                hingeX = 31.25F / 16.0F;
                hingeZ = 0.0F;
            }

            case NORTH -> {
                hingeX = -15.25F / 16.0F;
                hingeZ = 1.0F;
            }

            case EAST -> {
                hingeX = 0.0F;
                hingeZ = -15.25F / 16.0F;
            }

            case WEST -> {
                hingeX = 1.0F;
                hingeZ = 31.25F / 16.0F;
            }

            default -> {
                hingeX = 31.25F / 16.0F;
                hingeZ = 0.0F;
            }
        }

        poseStack.translate(
                hingeX,
                0.0F,
                hingeZ
        );

        float openRotation;

        switch (state.getValue(ImprovedFenceBlock.FACING)) {
            case SOUTH -> openRotation = 90.0F;
            case NORTH -> openRotation = 90.0F;
            case EAST -> openRotation = 90.0F;
            case WEST -> openRotation = 90.0F;
            default -> openRotation = -90.0F;
        }

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