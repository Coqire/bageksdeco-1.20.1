package com.coqire.bageksdeco.item;

import com.coqire.bageksdeco.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class BageksCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> REGISTRY;
    public static final RegistryObject<CreativeModeTab> MAIN;

    public BageksCreativeModTab() {
    }

    public static void init(IEventBus bus) {REGISTRY.register(bus);
    }

    static {
        REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "bageksdeco");
        MAIN = REGISTRY.register("bagfence_tab", () -> CreativeModeTab.builder()
                .title(Component.translatable("creativetab.bagfence_tab"))
                .icon(() -> new ItemStack(ModItems.FENCELOGO.get()))
                .displayItems((pParameters, pOutput) -> {
                    ModBlocks.BLOCKS.getEntries().forEach((registeredItem) -> {
                        Block block = registeredItem.get();
                        pOutput.accept(block);
                    });


                })
                .withSearchBar().build());
    }

}
