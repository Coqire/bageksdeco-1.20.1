package com.coqire.bageksdeco.item;

import com.coqire.bageksdeco.bageksdeco;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BagekItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(
                    ForgeRegistries.ITEMS,
                    bageksdeco.MOD_ID
            );
}