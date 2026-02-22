package com.coqire.bageksdeco.block;

import com.coqire.bageksdeco.bageksdeco;
import com.coqire.bageksdeco.block.custom.*;
import com.coqire.bageksdeco.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, bageksdeco.MOD_ID);


    //CROSSBUCKS
    public static final RegistryObject<Block> CROSSBUCK_1 = registerBlock("crossbuck_1",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()
                    .strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> CROSSBUCK_2 = registerBlock("crossbuck_2",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()
                    .strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSBUCK_3 = registerBlock("crossbuck_3",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()
                    .strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSBUCK_4 = registerBlock("crossbuck_4",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()
                    .strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSBUCK_5 = registerBlock("crossbuck_5",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()
                    .strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSBUCK_6 = registerBlock("crossbuck_6",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()
                    .strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSBUCK_7 = registerBlock("crossbuck_7",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()
                    .strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSBUCK_8 = registerBlock("crossbuck_8",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()
                    .strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSBUCK_9 = registerBlock("crossbuck_9",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()
                    .strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSBUCK_10 = registerBlock("crossbuck_10",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()
                    .strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSBUCK_11 = registerBlock("crossbuck_11",
            () -> new CrossbuckFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()
                    .strength(1.0F, 6.0F)));
            

//CROSSESTATES
    public static final RegistryObject<Block> CROSSESTATE_1 = registerBlock("crossestate_1",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSESTATE_2 = registerBlock("crossestate_2",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSESTATE_3 = registerBlock("crossestate_3",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSESTATE_4 = registerBlock("crossestate_4",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSESTATE_5 = registerBlock("crossestate_5",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSESTATE_6 = registerBlock("crossestate_6",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSESTATE_7 = registerBlock("crossestate_7",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSESTATE_8 = registerBlock("crossestate_8",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSESTATE_9 = registerBlock("crossestate_9",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSESTATE_10 = registerBlock("crossestate_10",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> CROSSESTATE_11 = registerBlock("crossestate_11",
            () -> new CrossestateFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            

    //ESTATETHREE
    public static final RegistryObject<Block> ESTATETHREE_1 = registerBlock("estatethree_1",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATETHREE_2 = registerBlock("estatethree_2",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATETHREE_3 = registerBlock("estatethree_3",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATETHREE_4 = registerBlock("estatethree_4",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATETHREE_5 = registerBlock("estatethree_5",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATETHREE_6 = registerBlock("estatethree_6",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATETHREE_7 = registerBlock("estatethree_7",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATETHREE_8 = registerBlock("estatethree_8",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATETHREE_9 = registerBlock("estatethree_9",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATETHREE_10 = registerBlock("estatethree_10",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATETHREE_11 = registerBlock("estatethree_11",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            

    //ESTATEFOUR
    public static final RegistryObject<Block> ESTATEFOUR_1 = registerBlock("estatefour_1",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATEFOUR_2 = registerBlock("estatefour_2",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATEFOUR_3 = registerBlock("estatefour_3",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATEFOUR_4 = registerBlock("estatefour_4",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATEFOUR_5 = registerBlock("estatefour_5",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATEFOUR_6 = registerBlock("estatefour_6",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATEFOUR_7 = registerBlock("estatefour_7",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATEFOUR_8 = registerBlock("estatefour_8",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATEFOUR_9 = registerBlock("estatefour_9",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATEFOUR_10 = registerBlock("estatefour_10",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ESTATEFOUR_11 = registerBlock("estatefour_11",
            () -> new EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            

    //DOUBLE FOUR ESTATE
    public static final RegistryObject<Block> DBLESTATEFOUR_1 = registerBlock("dblestatefour_1",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATEFOUR_2 = registerBlock("dblestatefour_2",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATEFOUR_3 = registerBlock("dblestatefour_3",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATEFOUR_4 = registerBlock("dblestatefour_4",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATEFOUR_5 = registerBlock("dblestatefour_5",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATEFOUR_6 = registerBlock("dblestatefour_6",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATEFOUR_7 = registerBlock("dblestatefour_7",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATEFOUR_8 = registerBlock("dblestatefour_8",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATEFOUR_9 = registerBlock("dblestatefour_9",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATEFOUR_10 = registerBlock("dblestatefour_10",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATEFOUR_11 = registerBlock("dblestatefour_11",
            () -> new DblEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            

    // DOUBLE THREE ESTATE
    public static final RegistryObject<Block> DBLESTATETHREE_1 = registerBlock("dblestatethree_1",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATETHREE_2 = registerBlock("dblestatethree_2",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATETHREE_3 = registerBlock("dblestatethree_3",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATETHREE_4 = registerBlock("dblestatethree_4",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATETHREE_5 = registerBlock("dblestatethree_5",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATETHREE_6 = registerBlock("dblestatethree_6",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATETHREE_7 = registerBlock("dblestatethree_7",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATETHREE_8 = registerBlock("dblestatethree_8",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATETHREE_9 = registerBlock("dblestatethree_9",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATETHREE_10 = registerBlock("dblestatethree_10",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> DBLESTATETHREE_11 = registerBlock("dblestatethree_11",
            () -> new DblEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            

    // ANGLED THREE ESTATE
    public static final RegistryObject<Block> ANGESTATETHREE_1 = registerBlock("angestatethree_1",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATETHREE_2 = registerBlock("angestatethree_2",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATETHREE_3 = registerBlock("angestatethree_3",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATETHREE_4 = registerBlock("angestatethree_4",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATETHREE_5 = registerBlock("angestatethree_5",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATETHREE_6 = registerBlock("angestatethree_6",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATETHREE_7 = registerBlock("angestatethree_7",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATETHREE_8 = registerBlock("angestatethree_8",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATETHREE_9 = registerBlock("angestatethree_9",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATETHREE_10 = registerBlock("angestatethree_10",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATETHREE_11 = registerBlock("angestatethree_11",
            () -> new AngEstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            


    // ANGLED OPPO THREE ESTATE

    public static final RegistryObject<Block> ANG1ESTATETHREE_1 = registerBlock("ang1estatethree_1",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATETHREE_2 = registerBlock("ang1estatethree_2",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATETHREE_3 = registerBlock("ang1estatethree_3",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATETHREE_4 = registerBlock("ang1estatethree_4",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATETHREE_5 = registerBlock("ang1estatethree_5",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATETHREE_6 = registerBlock("ang1estatethree_6",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATETHREE_7 = registerBlock("ang1estatethree_7",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATETHREE_8 = registerBlock("ang1estatethree_8",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATETHREE_9 = registerBlock("ang1estatethree_9",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATETHREE_10 = registerBlock("ang1estatethree_10",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATETHREE_11 = registerBlock("ang1estatethree_11",
            () -> new Ang1EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            

    // ANGLED FOUR ESTATE
    public static final RegistryObject<Block> ANGESTATEFOUR_1 = registerBlock("angestatefour_1",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATEFOUR_2 = registerBlock("angestatefour_2",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATEFOUR_3 = registerBlock("angestatefour_3",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATEFOUR_4 = registerBlock("angestatefour_4",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATEFOUR_5 = registerBlock("angestatefour_5",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATEFOUR_6 = registerBlock("angestatefour_6",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATEFOUR_7 = registerBlock("angestatefour_7",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATEFOUR_8 = registerBlock("angestatefour_8",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATEFOUR_9 = registerBlock("angestatefour_9",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATEFOUR_10 = registerBlock("angestatefour_10",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANGESTATEFOUR_11 = registerBlock("angestatefour_11",
            () -> new AngEstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            

    // ANGLED OPPO FOUR ESTATE

    public static final RegistryObject<Block> ANG1ESTATEFOUR_1 = registerBlock("ang1estatefour_1",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATEFOUR_2 = registerBlock("ang1estatefour_2",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATEFOUR_3 = registerBlock("ang1estatefour_3",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATEFOUR_4 = registerBlock("ang1estatefour_4",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATEFOUR_5 = registerBlock("ang1estatefour_5",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATEFOUR_6 = registerBlock("ang1estatefour_6",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATEFOUR_7 = registerBlock("ang1estatefour_7",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATEFOUR_8 = registerBlock("ang1estatefour_8",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATEFOUR_9 = registerBlock("ang1estatefour_9",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATEFOUR_10 = registerBlock("ang1estatefour_10",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> ANG1ESTATEFOUR_11 = registerBlock("ang1estatefour_11",
            () -> new Ang1EstatefourFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    //LEFT GATES
    public static final RegistryObject<Block> LGATEONE_1 = registerBlock("lgateone_1",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEONE_2 = registerBlock("lgateone_2",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEONE_3 = registerBlock("lgateone_3",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEONE_4 = registerBlock("lgateone_4",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEONE_5 = registerBlock("lgateone_5",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEONE_6 = registerBlock("lgateone_6",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEONE_7 = registerBlock("lgateone_7",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEONE_8 = registerBlock("lgateone_8",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEONE_9 = registerBlock("lgateone_9",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEONE_10 = registerBlock("lgateone_10",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEONE_11 = registerBlock("lgateone_11",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            

    public static final RegistryObject<Block> LGATETWO_1 = registerBlock("lgatetwo_1",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETWO_2 = registerBlock("lgatetwo_2",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETWO_3 = registerBlock("lgatetwo_3",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETWO_4 = registerBlock("lgatetwo_4",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETWO_5 = registerBlock("lgatetwo_5",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETWO_6 = registerBlock("lgatetwo_6",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETWO_7 = registerBlock("lgatetwo_7",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETWO_8 = registerBlock("lgatetwo_8",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETWO_9 = registerBlock("lgatetwo_9",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETWO_10 = registerBlock("lgatetwo_10",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETWO_11 = registerBlock("lgatetwo_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            

    public static final RegistryObject<Block> LGATETHREE_1 = registerBlock("lgatethree_1",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETHREE_2 = registerBlock("lgatethree_2",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETHREE_3 = registerBlock("lgatethree_3",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETHREE_4 = registerBlock("lgatethree_4",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETHREE_5 = registerBlock("lgatethree_5",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETHREE_6 = registerBlock("lgatethree_6",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETHREE_7 = registerBlock("lgatethree_7",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETHREE_8 = registerBlock("lgatethree_8",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETHREE_9 = registerBlock("lgatethree_9",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETHREE_10 = registerBlock("lgatethree_10",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATETHREE_11 = registerBlock("lgatethree_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            

    public static final RegistryObject<Block> LGATEFOUR_1 = registerBlock("lgatefour_1",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFOUR_2 = registerBlock("lgatefour_2",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFOUR_3 = registerBlock("lgatefour_3",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFOUR_4 = registerBlock("lgatefour_4",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFOUR_5 = registerBlock("lgatefour_5",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFOUR_6 = registerBlock("lgatefour_6",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFOUR_7 = registerBlock("lgatefour_7",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFOUR_8 = registerBlock("lgatefour_8",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFOUR_9 = registerBlock("lgatefour_9",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFOUR_10 = registerBlock("lgatefour_10",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFOUR_11 = registerBlock("lgatefour_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            

    public static final RegistryObject<Block> LGATEFIVE_1 = registerBlock("lgatefive_1",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFIVE_2 = registerBlock("lgatefive_2",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFIVE_3 = registerBlock("lgatefive_3",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFIVE_4 = registerBlock("lgatefive_4",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFIVE_5 = registerBlock("lgatefive_5",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFIVE_6 = registerBlock("lgatefive_6",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFIVE_7 = registerBlock("lgatefive_7",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFIVE_8 = registerBlock("lgatefive_8",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFIVE_9 = registerBlock("lgatefive_9",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFIVE_10 = registerBlock("lgatefive_10",
            () -> new LeftGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LGATEFIVE_11 = registerBlock("lgatefive_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            



    // RIGHT GATES
    public static final RegistryObject<Block> RGATEONE_1 = registerBlock("rgateone_1",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEONE_2 = registerBlock("rgateone_2",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEONE_3 = registerBlock("rgateone_3",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEONE_4 = registerBlock("rgateone_4",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEONE_5 = registerBlock("rgateone_5",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEONE_6 = registerBlock("rgateone_6",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEONE_7 = registerBlock("rgateone_7",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEONE_8 = registerBlock("rgateone_8",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEONE_9 = registerBlock("rgateone_9",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEONE_10 = registerBlock("rgateone_10",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEONE_11 = registerBlock("rgateone_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            

    public static final RegistryObject<Block> RGATETWO_1 = registerBlock("rgatetwo_1",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETWO_2 = registerBlock("rgatetwo_2",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETWO_3 = registerBlock("rgatetwo_3",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETWO_4 = registerBlock("rgatetwo_4",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETWO_5 = registerBlock("rgatetwo_5",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETWO_6 = registerBlock("rgatetwo_6",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETWO_7 = registerBlock("rgatetwo_7",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETWO_8 = registerBlock("rgatetwo_8",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETWO_9 = registerBlock("rgatetwo_9",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETWO_10 = registerBlock("rgatetwo_10",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETWO_11 = registerBlock("rgatetwo_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            

    public static final RegistryObject<Block> RGATETHREE_1 = registerBlock("rgatethree_1",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETHREE_2 = registerBlock("rgatethree_2",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETHREE_3 = registerBlock("rgatethree_3",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETHREE_4 = registerBlock("rgatethree_4",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETHREE_5 = registerBlock("rgatethree_5",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETHREE_6 = registerBlock("rgatethree_6",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETHREE_7 = registerBlock("rgatethree_7",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETHREE_8 = registerBlock("rgatethree_8",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETHREE_9 = registerBlock("rgatethree_9",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETHREE_10 = registerBlock("rgatethree_10",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATETHREE_11 = registerBlock("rgatethree_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            

    public static final RegistryObject<Block> RGATEFOUR_1 = registerBlock("rgatefour_1",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFOUR_2 = registerBlock("rgatefour_2",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFOUR_3 = registerBlock("rgatefour_3",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFOUR_4 = registerBlock("rgatefour_4",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFOUR_5 = registerBlock("rgatefour_5",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFOUR_6 = registerBlock("rgatefour_6",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFOUR_7 = registerBlock("rgatefour_7",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFOUR_8 = registerBlock("rgatefour_8",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFOUR_9 = registerBlock("rgatefour_9",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFOUR_10 = registerBlock("rgatefour_10",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFOUR_11 = registerBlock("rgatefour_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            

    public static final RegistryObject<Block> RGATEFIVE_1 = registerBlock("rgatefive_1",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFIVE_2 = registerBlock("rgatefive_2",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFIVE_3 = registerBlock("rgatefive_3",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFIVE_4 = registerBlock("rgatefive_4",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFIVE_5 = registerBlock("rgatefive_5",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFIVE_6 = registerBlock("rgatefive_6",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFIVE_7 = registerBlock("rgatefive_7",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFIVE_8 = registerBlock("rgatefive_8",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFIVE_9 = registerBlock("rgatefive_9",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFIVE_10 = registerBlock("rgatefive_10",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RGATEFIVE_11 = registerBlock("rgatefive_11",
            () -> new RightGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));


    //CROSSCOUNTRY
    public static final RegistryObject<Block> TROLLTOP_1 = registerBlock("trolltop_1",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TROLLTOP_2 = registerBlock("trolltop_2",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TROLLTOP_3 = registerBlock("trolltop_3",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TROLLTOP_4 = registerBlock("trolltop_4",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TROLLTOP_5 = registerBlock("trolltop_5",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TROLLTOP_6 = registerBlock("trolltop_6",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TROLLTOP_7 = registerBlock("trolltop_7",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TROLLTOP_8 = registerBlock("trolltop_8",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TROLLTOP_9 = registerBlock("trolltop_9",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            

    public static final RegistryObject<Block> hrolltop_1 = registerBlock("hrolltop_1",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> hrolltop_2 = registerBlock("hrolltop_2",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> hrolltop_3 = registerBlock("hrolltop_3",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> hrolltop_4 = registerBlock("hrolltop_4",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> hrolltop_5 = registerBlock("hrolltop_5",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> hrolltop_6 = registerBlock("hrolltop_6",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> hrolltop_7 = registerBlock("hrolltop_7",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> hrolltop_8 = registerBlock("hrolltop_8",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> hrolltop_9 = registerBlock("hrolltop_9",
            () -> new TRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> FROLLTOP_1 = registerBlock("frolltop_1",
            () -> new FRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> FROLLTOP_2 = registerBlock("frolltop_2",
            () -> new FRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> FROLLTOP_3 = registerBlock("frolltop_3",
            () -> new FRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> FROLLTOP_4 = registerBlock("frolltop_4",
            () -> new FRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> FROLLTOP_5 = registerBlock("frolltop_5",
            () -> new FRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> FROLLTOP_6 = registerBlock("frolltop_6",
            () -> new FRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> FROLLTOP_7 = registerBlock("frolltop_7",
            () -> new FRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> FROLLTOP_8 = registerBlock("frolltop_8",
            () -> new FRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> FROLLTOP_9 = registerBlock("frolltop_9",
            () -> new FRolltopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    
    
    public static final RegistryObject<Block> TRAKEHNER_1 = registerBlock("trakehner_1",
            () -> new TrakehnerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TRAKEHNER_2 = registerBlock("trakehner_2",
            () -> new TrakehnerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TRAKEHNER_3 = registerBlock("trakehner_3",
            () -> new TrakehnerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TRAKEHNER_4 = registerBlock("trakehner_4",
            () -> new TrakehnerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TRAKEHNER_5 = registerBlock("trakehner_5",
            () -> new TrakehnerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TRAKEHNER_6 = registerBlock("trakehner_6",
            () -> new TrakehnerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TRAKEHNER_7 = registerBlock("trakehner_7",
            () -> new TrakehnerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TRAKEHNER_8 = registerBlock("trakehner_8",
            () -> new TrakehnerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> TRAKEHNER_9 = registerBlock("trakehner_9",
            () -> new TrakehnerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));


    public static final RegistryObject<Block> CORNER_1 = registerBlock("corner_1",
            () -> new CornerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> CORNER_2 = registerBlock("corner_2",
            () -> new CornerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> CORNER_3 = registerBlock("corner_3",
            () -> new CornerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> CORNER_4 = registerBlock("corner_4",
            () -> new CornerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> CORNER_5 = registerBlock("corner_5",
            () -> new CornerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> CORNER_6 = registerBlock("corner_6",
            () -> new CornerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> CORNER_7 = registerBlock("corner_7",
            () -> new CornerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> CORNER_8 = registerBlock("corner_8",
            () -> new CornerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> CORNER_9 = registerBlock("corner_9",
            () -> new CornerBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    
    public static final RegistryObject<Block> DITCH1_1 = registerBlock("ditch1_1",
            () -> new DitchOneBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH1_2 = registerBlock("ditch1_2",
            () -> new DitchOneBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH1_3 = registerBlock("ditch1_3",
            () -> new DitchOneBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH1_4 = registerBlock("ditch1_4",
            () -> new DitchOneBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH1_5 = registerBlock("ditch1_5",
            () -> new DitchOneBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH1_6 = registerBlock("ditch1_6",
            () -> new DitchOneBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH1_7 = registerBlock("ditch1_7",
            () -> new DitchOneBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH1_8 = registerBlock("ditch1_8",
            () -> new DitchOneBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH1_9 = registerBlock("ditch1_9",
            () -> new DitchOneBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH2_1 = registerBlock("ditch2_1",
            () -> new DitchTwoBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    
    public static final RegistryObject<Block> DITCH2_2 = registerBlock("ditch2_2",
            () -> new DitchTwoBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH2_3 = registerBlock("ditch2_3",
            () -> new DitchTwoBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH2_4 = registerBlock("ditch2_4",
            () -> new DitchTwoBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH2_5 = registerBlock("ditch2_5",
            () -> new DitchTwoBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH2_6 = registerBlock("ditch2_6",
            () -> new DitchTwoBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH2_7 = registerBlock("ditch2_7",
            () -> new DitchTwoBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH2_8 = registerBlock("ditch2_8",
            () -> new DitchTwoBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> DITCH2_9 = registerBlock("ditch2_9",
            () -> new DitchTwoBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));


    public static final RegistryObject<Block> WALL1_1 = registerBlock("wall1_1",
            () -> new WallOneBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> WALL1_2 = registerBlock("wall1_2",
            () -> new WallOneBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> WALL1_3 = registerBlock("wall1_3",
            () -> new WallOneBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> WALL2_1 = registerBlock("wall2_1",
            () -> new WallTwoBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> WALL2_2 = registerBlock("wall2_2",
            () -> new WallTwoBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> WALL2_3 = registerBlock("wall2_3",
            () -> new WallTwoBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> WALL3_1 = registerBlock("wall3_1",
            () -> new WallThreeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> WALL3_2 = registerBlock("wall3_2",
            () -> new WallThreeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> WALL3_3 = registerBlock("wall3_3",
            () -> new WallThreeBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    
    
    //HUNTERJUMPS
    public static final RegistryObject<Block> LHUNTER_1 = registerBlock("lhunter_1",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER_2 = registerBlock("lhunter_2",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER_3 = registerBlock("lhunter_3",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER_4 = registerBlock("lhunter_4",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER_5 = registerBlock("lhunter_5",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER_6 = registerBlock("lhunter_6",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER_7 = registerBlock("lhunter_7",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER_8 = registerBlock("lhunter_8",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER_9 = registerBlock("lhunter_9",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            

    public static final RegistryObject<Block> LHUNTER1_1 = registerBlock("lhunter1_1",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER1_2 = registerBlock("lhunter1_2",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER1_3 = registerBlock("lhunter1_3",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER1_4 = registerBlock("lhunter1_4",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER1_5 = registerBlock("lhunter1_5",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER1_6 = registerBlock("lhunter1_6",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER1_7 = registerBlock("lhunter1_7",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER1_8 = registerBlock("lhunter1_8",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LHUNTER1_9 = registerBlock("lhunter1_9",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> LHUNTER2_1 = registerBlock("lhunter2_1",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> LHUNTER2_2 = registerBlock("lhunter2_2",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> LHUNTER2_3 = registerBlock("lhunter2_3",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> LHUNTER2_4 = registerBlock("lhunter2_4",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> LHUNTER2_5 = registerBlock("lhunter2_5",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> LHUNTER2_6 = registerBlock("lhunter2_6",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> LHUNTER2_7 = registerBlock("lhunter2_7",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> LHUNTER2_8 = registerBlock("lhunter2_8",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> LHUNTER2_9 = registerBlock("lhunter2_9",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            

    public static final RegistryObject<Block> RHUNTER_1 = registerBlock("rhunter_1",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER_2 = registerBlock("rhunter_2",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER_3 = registerBlock("rhunter_3",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER_4 = registerBlock("rhunter_4",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER_5 = registerBlock("rhunter_5",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER_6 = registerBlock("rhunter_6",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER_7 = registerBlock("rhunter_7",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER_8 = registerBlock("rhunter_8",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER_9 = registerBlock("rhunter_9",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            

    public static final RegistryObject<Block> RHUNTER1_1 = registerBlock("rhunter1_1",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER1_2 = registerBlock("rhunter1_2",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER1_3 = registerBlock("rhunter1_3",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER1_4 = registerBlock("rhunter1_4",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER1_5 = registerBlock("rhunter1_5",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER1_6 = registerBlock("rhunter1_6",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER1_7 = registerBlock("rhunter1_7",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER1_8 = registerBlock("rhunter1_8",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RHUNTER1_9 = registerBlock("rhunter1_9",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> RHUNTER2_1 = registerBlock("rhunter2_1",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> RHUNTER2_2 = registerBlock("rhunter2_2",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> RHUNTER2_3 = registerBlock("rhunter2_3",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> RHUNTER2_4 = registerBlock("rhunter2_4",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> RHUNTER2_5 = registerBlock("rhunter2_5",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> RHUNTER2_6 = registerBlock("rhunter2_6",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> RHUNTER2_7 = registerBlock("rhunter2_7",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> RHUNTER2_8 = registerBlock("rhunter2_8",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> RHUNTER2_9 = registerBlock("rhunter2_9",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));


    //SHOWJUMPS
    public static final RegistryObject<Block> LSJUMP1_1 = registerBlock("lsjump1_1",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LSJUMP1_2 = registerBlock("lsjump1_2",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LSJUMP1_3 = registerBlock("lsjump1_3",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LSJUMP1_4 = registerBlock("lsjump1_4",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LSJUMP1_5 = registerBlock("lsjump1_5",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LSJUMP1_6 = registerBlock("lsjump1_6",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LSJUMP1_7 = registerBlock("lsjump1_7",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LSJUMP1_8 = registerBlock("lsjump1_8",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> LSJUMP1_9 = registerBlock("lsjump1_9",
            () -> new LJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            

    public static final RegistryObject<Block> RSJUMP1_1 = registerBlock("rsjump1_1",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RSJUMP1_2 = registerBlock("rsjump1_2",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RSJUMP1_3 = registerBlock("rsjump1_3",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RSJUMP1_4 = registerBlock("rsjump1_4",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RSJUMP1_5 = registerBlock("rsjump1_5",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RSJUMP1_6 = registerBlock("rsjump1_6",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RSJUMP1_7 = registerBlock("rsjump1_7",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RSJUMP1_8 = registerBlock("rsjump1_8",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> RSJUMP1_9 = registerBlock("rsjump1_9",
            () -> new RJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));


    public static final RegistryObject<Block> BEE_1 = registerBlock("bee_1",
            () -> new BeeJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> BEE_2 = registerBlock("bee_2",
            () -> new BeeJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> BEE_3 = registerBlock("bee_3",
            () -> new BeeJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> SDS_1 = registerBlock("sds_1",
            () -> new BeeJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> SDS_2 = registerBlock("sds_2",
            () -> new BeeJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> SDS_3 = registerBlock("sds_3",
            () -> new BeeJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> LWELL_1 = registerBlock("lwell_1",
            () -> new WellJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> RWELL_2 = registerBlock("rwell_1",
            () -> new WellJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> LBRIDGE_1 = registerBlock("lbridge_1",
            () -> new WellJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> RBRIDGE_2 = registerBlock("rbridge_1",
            () -> new WellJumpBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));


    // RIGHT GATES
    public static final RegistryObject<Block> STALLGATE1_1 = registerBlock("stallgate1_1",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE1_2 = registerBlock("stallgate1_2",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE1_3 = registerBlock("stallgate1_3",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE1_4 = registerBlock("stallgate1_4",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE1_5 = registerBlock("stallgate1_5",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE1_6 = registerBlock("stallgate1_6",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE1_7 = registerBlock("stallgate1_7",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE1_8 = registerBlock("stallgate1_8",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE1_9 = registerBlock("stallgate1_9",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE1_10 = registerBlock("stallgate1_10",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE1_11 = registerBlock("stallgate1_11",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));


    public static final RegistryObject<Block> STALLGATE2_1 = registerBlock("stallgate2_1",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE2_2 = registerBlock("stallgate2_2",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE2_3 = registerBlock("stallgate2_3",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE2_4 = registerBlock("stallgate2_4",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE2_5 = registerBlock("stallgate2_5",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE2_6 = registerBlock("stallgate2_6",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE2_7 = registerBlock("stallgate2_7",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE2_8 = registerBlock("stallgate2_8",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE2_9 = registerBlock("stallgate2_9",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE2_10 = registerBlock("stallgate2_10",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE2_11 = registerBlock("stallgate2_11",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));


    public static final RegistryObject<Block> STALLGATE3_1 = registerBlock("stallgate3_1",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE3_2 = registerBlock("stallgate3_2",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE3_3 = registerBlock("stallgate3_3",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE3_4 = registerBlock("stallgate3_4",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE3_5 = registerBlock("stallgate3_5",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE3_6 = registerBlock("stallgate3_6",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE3_7 = registerBlock("stallgate3_7",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE3_8 = registerBlock("stallgate3_8",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE3_9 = registerBlock("stallgate3_9",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE3_10 = registerBlock("stallgate3_10",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE3_11 = registerBlock("stallgate3_11",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));


    public static final RegistryObject<Block> STALLGATE4_1 = registerBlock("stallgate4_1",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE4_2 = registerBlock("stallgate4_2",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE4_3 = registerBlock("stallgate4_3",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE4_4 = registerBlock("stallgate4_4",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE4_5 = registerBlock("stallgate4_5",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE4_6 = registerBlock("stallgate4_6",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE4_7 = registerBlock("stallgate4_7",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE4_8 = registerBlock("stallgate4_8",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE4_9 = registerBlock("stallgate4_9",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE4_10 = registerBlock("stallgate4_10",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE4_11 = registerBlock("stallgate4_11",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));


    public static final RegistryObject<Block> STALLGATE5_1 = registerBlock("stallgate5_1",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE5_2 = registerBlock("stallgate5_2",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE5_3 = registerBlock("stallgate5_3",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE5_4 = registerBlock("stallgate5_4",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE5_5 = registerBlock("stallgate5_5",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE5_6 = registerBlock("stallgate5_6",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE5_7 = registerBlock("stallgate5_7",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE5_8 = registerBlock("stallgate5_8",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE5_9 = registerBlock("stallgate5_9",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE5_10 = registerBlock("stallgate5_10",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE5_11 = registerBlock("stallgate5_11",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));


    public static final RegistryObject<Block> STALLGATE6_1 = registerBlock("stallgate6_1",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE6_2 = registerBlock("stallgate6_2",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE6_3 = registerBlock("stallgate6_3",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE6_4 = registerBlock("stallgate6_4",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE6_5 = registerBlock("stallgate6_5",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE6_6 = registerBlock("stallgate6_6",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE6_7 = registerBlock("stallgate6_7",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE6_8 = registerBlock("stallgate6_8",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE6_9 = registerBlock("stallgate6_9",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE6_10 = registerBlock("stallgate6_10",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE6_11 = registerBlock("stallgate6_11",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));


    public static final RegistryObject<Block> STALLGATE7_1 = registerBlock("stallgate7_1",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE7_2 = registerBlock("stallgate7_2",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE7_3 = registerBlock("stallgate7_3",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE7_4 = registerBlock("stallgate7_4",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE7_5 = registerBlock("stallgate7_5",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE7_6 = registerBlock("stallgate7_6",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE7_7 = registerBlock("stallgate7_7",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE7_8 = registerBlock("stallgate7_8",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE7_9 = registerBlock("stallgate7_9",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE7_10 = registerBlock("stallgate7_10",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE7_11 = registerBlock("stallgate7_11",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));


    public static final RegistryObject<Block> STALLGATE8_1 = registerBlock("stallgate8_1",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE8_2 = registerBlock("stallgate8_2",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE8_3 = registerBlock("stallgate8_3",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE8_4 = registerBlock("stallgate8_4",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE8_5 = registerBlock("stallgate8_5",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE8_6 = registerBlock("stallgate8_6",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE8_7 = registerBlock("stallgate8_7",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE8_8 = registerBlock("stallgate8_8",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE8_9 = registerBlock("stallgate8_9",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE8_10 = registerBlock("stallgate8_10",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE8_11 = registerBlock("stallgate8_11",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));


    public static final RegistryObject<Block> STALLGATE9_1 = registerBlock("stallgate9_1",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE9_2 = registerBlock("stallgate9_2",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE9_3 = registerBlock("stallgate9_3",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE9_4 = registerBlock("stallgate9_4",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE9_5 = registerBlock("stallgate9_5",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE9_6 = registerBlock("stallgate9_6",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE9_7 = registerBlock("stallgate9_7",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE9_8 = registerBlock("stallgate9_8",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE9_9 = registerBlock("stallgate9_9",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE9_10 = registerBlock("stallgate9_10",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE9_11 = registerBlock("stallgate9_11",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));


    public static final RegistryObject<Block> STALLGATE10_1 = registerBlock("stallgate10_1",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE10_2 = registerBlock("stallgate10_2",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE10_3 = registerBlock("stallgate10_3",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE10_4 = registerBlock("stallgate10_4",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE10_5 = registerBlock("stallgate10_5",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE10_6 = registerBlock("stallgate10_6",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE10_7 = registerBlock("stallgate10_7",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE10_8 = registerBlock("stallgate10_8",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE10_9 = registerBlock("stallgate10_9",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE10_10 = registerBlock("stallgate10_10",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE10_11 = registerBlock("stallgate10_11",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE11_1 = registerBlock("stallgate11_1",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE11_2 = registerBlock("stallgate11_2",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE11_3 = registerBlock("stallgate11_3",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE11_4 = registerBlock("stallgate11_4",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE11_5 = registerBlock("stallgate11_5",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE11_6 = registerBlock("stallgate11_6",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE11_7 = registerBlock("stallgate11_7",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE11_8 = registerBlock("stallgate11_8",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE11_9 = registerBlock("stallgate11_9",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE11_10 = registerBlock("stallgate11_10",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE11_11 = registerBlock("stallgate11_11",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));


    public static final RegistryObject<Block> STALLGATE12_1 = registerBlock("stallgate12_1",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE12_2 = registerBlock("stallgate12_2",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE12_3 = registerBlock("stallgate12_3",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE12_4 = registerBlock("stallgate12_4",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE12_5 = registerBlock("stallgate12_5",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE12_6 = registerBlock("stallgate12_6",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE12_7 = registerBlock("stallgate12_7",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE12_8 = registerBlock("stallgate12_8",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE12_9 = registerBlock("stallgate12_9",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE12_10 = registerBlock("stallgate12_10",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE12_11 = registerBlock("stallgate12_11",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    
    public static final RegistryObject<Block> STALLFRONT1_1 = registerBlock("stallfront1_1",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT1_2 = registerBlock("stallfront1_2",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT1_3 = registerBlock("stallfront1_3",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT1_4 = registerBlock("stallfront1_4",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT1_5 = registerBlock("stallfront1_5",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT1_6 = registerBlock("stallfront1_6",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT1_7 = registerBlock("stallfront1_7",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT1_8 = registerBlock("stallfront1_8",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT1_9 = registerBlock("stallfront1_9",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT1_10 = registerBlock("stallfront1_10",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT1_11 = registerBlock("stallfront1_11",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT3_1 = registerBlock("stallfront3_1",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT3_2 = registerBlock("stallfront3_2",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT3_3 = registerBlock("stallfront3_3",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT3_4 = registerBlock("stallfront3_4",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT3_5 = registerBlock("stallfront3_5",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT3_6 = registerBlock("stallfront3_6",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT3_7 = registerBlock("stallfront3_7",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT3_8 = registerBlock("stallfront3_8",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT3_9 = registerBlock("stallfront3_9",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT3_10 = registerBlock("stallfront3_10",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT3_11 = registerBlock("stallfront3_11",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT5_1 = registerBlock("stallfront5_1",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT5_2 = registerBlock("stallfront5_2",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT5_3 = registerBlock("stallfront5_3",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT5_4 = registerBlock("stallfront5_4",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT5_5 = registerBlock("stallfront5_5",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT5_6 = registerBlock("stallfront5_6",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT5_7 = registerBlock("stallfront5_7",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT5_8 = registerBlock("stallfront5_8",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT5_9 = registerBlock("stallfront5_9",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT5_10 = registerBlock("stallfront5_10",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT5_11 = registerBlock("stallfront5_11",
            () -> new LStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLFRONT2_1 = registerBlock("stallfront2_1",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT2_2 = registerBlock("stallfront2_2",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT2_3 = registerBlock("stallfront2_3",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT2_4 = registerBlock("stallfront2_4",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT2_5 = registerBlock("stallfront2_5",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT2_6 = registerBlock("stallfront2_6",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT2_7 = registerBlock("stallfront2_7",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT2_8 = registerBlock("stallfront2_8",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT2_9 = registerBlock("stallfront2_9",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT2_10 = registerBlock("stallfront2_10",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT2_11 = registerBlock("stallfront2_11",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT4_1 = registerBlock("stallfront4_1",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT4_2 = registerBlock("stallfront4_2",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT4_3 = registerBlock("stallfront4_3",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT4_4 = registerBlock("stallfront4_4",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT4_5 = registerBlock("stallfront4_5",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT4_6 = registerBlock("stallfront4_6",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT4_7 = registerBlock("stallfront4_7",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT4_8 = registerBlock("stallfront4_8",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT4_9 = registerBlock("stallfront4_9",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT4_10 = registerBlock("stallfront4_10",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT4_11 = registerBlock("stallfront4_11",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT6_1 = registerBlock("stallfront6_1",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT6_2 = registerBlock("stallfront6_2",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT6_3 = registerBlock("stallfront6_3",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT6_4 = registerBlock("stallfront6_4",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT6_5 = registerBlock("stallfront6_5",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT6_6 = registerBlock("stallfront6_6",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT6_7 = registerBlock("stallfront6_7",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT6_8 = registerBlock("stallfront6_8",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT6_9 = registerBlock("stallfront6_9",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT6_10 = registerBlock("stallfront6_10",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLFRONT6_11 = registerBlock("stallfront6_11",
            () -> new RStallFrontBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    
    
    public static final RegistryObject<Block> WEBGUARD1_1 = registerBlock("webguard1_1",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));

    public static final RegistryObject<Block> STALLGATE_B1 = registerBlock("stallgate_b1",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B2 = registerBlock("stallgate_b2",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B3 = registerBlock("stallgate_b3",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B4 = registerBlock("stallgate_b4",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B5 = registerBlock("stallgate_b5",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B6 = registerBlock("stallgate_b6",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B7 = registerBlock("stallgate_b7",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B8 = registerBlock("stallgate_b8",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B9 = registerBlock("stallgate_b9",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B10 = registerBlock("stallgate_b10",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B11 = registerBlock("stallgate_b11",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B12 = registerBlock("stallgate_b12",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B13 = registerBlock("stallgate_b13",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B14 = registerBlock("stallgate_b14",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B15 = registerBlock("stallgate_b15",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B16 = registerBlock("stallgate_b16",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B17 = registerBlock("stallgate_b17",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B18 = registerBlock("stallgate_b18",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B19 = registerBlock("stallgate_b19",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B20 = registerBlock("stallgate_b20",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B21 = registerBlock("stallgate_b21",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B22 = registerBlock("stallgate_b22",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B23 = registerBlock("stallgate_b23",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B24 = registerBlock("stallgate_b24",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B25 = registerBlock("stallgate_b25",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B26 = registerBlock("stallgate_b26",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B27 = registerBlock("stallgate_b27",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> STALLGATE_B28 = registerBlock("stallgate_b28",
            () -> new LStallGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).noOcclusion().strength(1.0F, 6.0F)));
    



    // ENGLISH SWEM SADDLES
    public static final RegistryObject<Block> ENGLISH_SADDLE_SWEM_1 = registerBlock("english_saddle_swem_1",
            () -> new EnglishSaddleSWEMBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).noOcclusion()));
            
    public static final RegistryObject<Block> ENGLISH_SADDLE_SWEM_2 = registerBlock("english_saddle_swem_2",
            () -> new EnglishSaddleSWEMBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).noOcclusion()));
            
    public static final RegistryObject<Block> ENGLISH_SADDLE_SWEM_3 = registerBlock("english_saddle_swem_3",
            () -> new EnglishSaddleSWEMBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).noOcclusion()));
            
    public static final RegistryObject<Block> ENGLISH_SADDLE_SWEM_4 = registerBlock("english_saddle_swem_4",
            () -> new EnglishSaddleSWEMBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).noOcclusion()));
    
    // WESTERN SWEM SADDLES
    public static final RegistryObject<Block> WESTERN_SADDLE_1 = registerBlock("western_saddle_1",
            () -> new WesternSaddleSWEMBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).noOcclusion()));

    public static final RegistryObject<Block> WESTERN_SADDLE_2 = registerBlock("western_saddle_2",
            () -> new WesternSaddleSWEMBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).noOcclusion()));

    public static final RegistryObject<Block> WESTERN_SADDLE_3 = registerBlock("western_saddle_3",
            () -> new WesternSaddleSWEMBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).noOcclusion()));

    public static final RegistryObject<Block> WESTERN_SADDLE_4 = registerBlock("western_saddle_4",
            () -> new WesternSaddleSWEMBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).noOcclusion()));

    //XC ACCESSORIES
    public static final RegistryObject<Block> XCFLAG_1 = registerBlock("xcflag_1",
            () -> new XCFlagOneBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> XCFLAG_2 = registerBlock("xcflag_2",
            () -> new XCFlagTwoBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    // HITCHING POST WATER
    public static final RegistryObject<Block> HPW_1 = registerBlock("hpw_1",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> HPW_2 = registerBlock("hpw_2",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> HPW_3 = registerBlock("hpw_3",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> HPW_4 = registerBlock("hpw_4",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> HPW_5 = registerBlock("hpw_5",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> HPW_6 = registerBlock("hpw_6",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> HPW_7 = registerBlock("hpw_7",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> HPW_8 = registerBlock("hpw_8",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> HPW_9 = registerBlock("hpw_9",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> HPW_10 = registerBlock("hpw_10",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));
            
    public static final RegistryObject<Block> HPW_11 = registerBlock("hpw_11",
            () -> new HitchingpostBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().strength(1.0F, 6.0F)));

    //CATTLE FENCES
    public static final RegistryObject<Block> CATTLE_1 = registerBlock("cattle_1",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noOcclusion().strength(1.0F, 6.0F)));
    public static final RegistryObject<Block> CATTLE_2 = registerBlock("cattle_2",
            () -> new EstatethreeFenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).noOcclusion().strength(1.0F, 6.0F)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> blockRegistryObject = BLOCKS.register(name, block);
        registerBlockItem(name, blockRegistryObject);
        return blockRegistryObject;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name,
                () -> new BlockItem(block.get(), new Item.Properties()));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
