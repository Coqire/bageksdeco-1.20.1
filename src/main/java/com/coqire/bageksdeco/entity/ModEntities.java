package com.coqire.bageksdeco.entity;

import com.coqire.bageksdeco.bageksdeco;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, bageksdeco.MOD_ID);

    public static final RegistryObject<EntityType<GateCollisionEntity>> GATE_COLLISION =
            ENTITIES.register(
                    "gate_collision",
                    () -> EntityType.Builder
                            .of(GateCollisionEntity::new, MobCategory.MISC)
                            .sized(0.01F, 0.01F)
                            .clientTrackingRange(10)
                            .updateInterval(1)
                            .build("gate_collision")
            );
}