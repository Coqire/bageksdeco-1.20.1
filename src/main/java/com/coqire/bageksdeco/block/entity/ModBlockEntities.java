package com.coqire.bageksdeco.block.entity;

import com.coqire.bageksdeco.bageksdeco;
import com.coqire.bageksdeco.block.ModBlocks;
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
                            ModBlocks.LGATEONE_1.get()
                    ).build(null)
            );
}