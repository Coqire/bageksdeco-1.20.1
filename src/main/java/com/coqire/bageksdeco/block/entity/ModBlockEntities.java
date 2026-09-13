package com.coqire.bageksdeco.block.entity;

import com.coqire.bageksdeco.bageksdeco;
import com.coqire.bageksdeco.block.BagekBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(
                    ForgeRegistries.BLOCK_ENTITY_TYPES,
                    bageksdeco.MOD_ID
            );

    public static final RegistryObject<BlockEntityType<ImprovedGateBlockEntity>> IMPROVED_GATE =
            BLOCK_ENTITIES.register(
                    "improved_gate",
                    () -> BlockEntityType.Builder.of(
                            ImprovedGateBlockEntity::new,
                            BagekBlocks.LGATEONE_1.get(),
                            BagekBlocks.RGATEONE_1.get(),
                            BagekBlocks.LGATETWO_1.get(),
                            BagekBlocks.RGATETWO_1.get(),
                            BagekBlocks.LGATETHREE_1.get(),
                            BagekBlocks.RGATETHREE_1.get(),
                            BagekBlocks.LGATEFOUR_1.get(),
                            BagekBlocks.RGATEFOUR_1.get(),
                            BagekBlocks.LGATEFIVE_1.get(),
                            BagekBlocks.RGATEFIVE_1.get()
                    ).build(null)
            );
}