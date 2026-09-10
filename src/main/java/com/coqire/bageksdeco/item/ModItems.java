package com.coqire.bageksdeco.item;

import com.coqire.bageksdeco.bageksdeco;
import com.coqire.bageksdeco.block.ImprovedModBlocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(
                    ForgeRegistries.ITEMS,
                    bageksdeco.MOD_ID
            );

    public static final RegistryObject<Item> FENCELOGO =
            ITEMS.register(
                    "fencelogo",
                    () -> new Item(new Item.Properties())
            );

    public static final RegistryObject<Item> IMPROVED_FENCE =
            ITEMS.register(
                    "improved_fence",
                    () -> new BlockItem(
                            ImprovedModBlocks.IMPROVED_FENCE.get(),
                            new Item.Properties()
                    )
            );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}