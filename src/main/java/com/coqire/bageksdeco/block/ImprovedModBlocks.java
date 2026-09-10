package com.coqire.bageksdeco.block;

import com.coqire.bageksdeco.bageksdeco;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ImprovedModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(
                    ForgeRegistries.BLOCKS,
                    bageksdeco.MOD_ID
            );

    public static final RegistryObject<Block> IMPROVED_FENCE =
            BLOCKS.register(
                    "improved_fence",
                    () -> new ImprovedFenceBlock(
                            BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                    )
            );
}