package com.coqire.bageksdeco.client;

import com.coqire.bageksdeco.bageksdeco;
import com.coqire.bageksdeco.block.entity.ModBlockEntities;
import com.coqire.bageksdeco.client.renderer.ImprovedGateRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = bageksdeco.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = Dist.CLIENT
)
public class ClientModEvents {

    @SubscribeEvent
    public static void registerRenderers(
            EntityRenderersEvent.RegisterRenderers event
    ) {
        event.registerBlockEntityRenderer(
                ModBlockEntities.IMPROVED_GATE.get(),
                ImprovedGateRenderer::new
        );
    }
}