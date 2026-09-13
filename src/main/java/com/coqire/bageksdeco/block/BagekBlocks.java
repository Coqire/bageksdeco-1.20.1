package com.coqire.bageksdeco.block;

import com.coqire.bageksdeco.bageksdeco;
import com.coqire.bageksdeco.item.BagekItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BagekBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(
                    ForgeRegistries.BLOCKS,
                    bageksdeco.MOD_ID
            );

    public static final RegistryObject<Block> LGATEONE_1 =
            registerBlock(
                    "lgateone_1",
                    () -> new ImprovedFenceBlock(
                            BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                                    .noOcclusion()
                                    .strength(1.0F, 6.0F),
                            GateSwing.LEFT
                    )
            );

    public static final RegistryObject<Block> RGATEONE_1 =
            registerBlock(
                    "rgateone_1",
                    () -> new ImprovedFenceBlock(
                            BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                                    .noOcclusion()
                                    .strength(1.0F, 6.0F),
                            GateSwing.RIGHT
                    )
            );

    public static final RegistryObject<Block> LGATETWO_1 =
            registerBlock(
                    "lgatetwo_1",
                    () -> new ImprovedFenceBlock(
                            BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                                    .noOcclusion()
                                    .strength(1.0F, 6.0F),
                            GateSwing.LEFT
                    )
            );

    public static final RegistryObject<Block> RGATETWO_1 =
            registerBlock(
                    "rgatetwo_1",
                    () -> new ImprovedFenceBlock(
                            BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                                    .noOcclusion()
                                    .strength(1.0F, 6.0F),
                            GateSwing.RIGHT
                    )
            );

    public static final RegistryObject<Block> LGATETHREE_1 =
            registerBlock(
                    "lgatethree_1",
                    () -> new ImprovedFenceBlock(
                            BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                                    .noOcclusion()
                                    .strength(1.0F, 6.0F),
                            GateSwing.LEFT
                    )
            );

    public static final RegistryObject<Block> RGATETHREE_1 =
            registerBlock(
                    "rgatethree_1",
                    () -> new ImprovedFenceBlock(
                            BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                                    .noOcclusion()
                                    .strength(1.0F, 6.0F),
                            GateSwing.RIGHT
                    )
            );

    public static final RegistryObject<Block> LGATEFOUR_1 =
            registerBlock(
                    "lgatefour_1",
                    () -> new ImprovedFenceBlock(
                            BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                                    .noOcclusion()
                                    .strength(1.0F, 6.0F),
                            GateSwing.LEFT
                    )
            );

    public static final RegistryObject<Block> RGATEFOUR_1 =
            registerBlock(
                    "rgatefour_1",
                    () -> new ImprovedFenceBlock(
                            BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                                    .noOcclusion()
                                    .strength(1.0F, 6.0F),
                            GateSwing.RIGHT
                    )
            );

    public static final RegistryObject<Block> LGATEFIVE_1 =
            registerBlock(
                    "lgatefive_1",
                    () -> new ImprovedFenceBlock(
                            BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                                    .noOcclusion()
                                    .strength(1.0F, 6.0F),
                            GateSwing.LEFT
                    )
            );

    public static final RegistryObject<Block> RGATEFIVE_1 =
            registerBlock(
                    "rgatefive_1",
                    () -> new ImprovedFenceBlock(
                            BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                                    .noOcclusion()
                                    .strength(1.0F, 6.0F),
                            GateSwing.RIGHT
                    )
            );

    private static <T extends Block> RegistryObject<T> registerBlock(
            String name,
            java.util.function.Supplier<T> block
    ) {
        RegistryObject<T> registryObject =
                BLOCKS.register(name, block);

        registerBlockItem(name, registryObject);

        return registryObject;
    }

    private static <T extends Block> void registerBlockItem(
            String name,
            RegistryObject<T> block
    ) {
        BagekItems.ITEMS.register(
                name,
                () -> new BlockItem(
                        block.get(),
                        new Item.Properties()
                )
        );
    }
}