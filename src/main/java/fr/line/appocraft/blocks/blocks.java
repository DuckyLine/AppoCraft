package fr.line.appocraft.blocks;

import fr.line.appocraft.AppoCraft;
import fr.line.appocraft.blocks.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class blocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AppoCraft.MODID);

    public static final DeferredBlock OAK_CHAIR = BLOCKS.register("oak_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock BIRCH_CHAIR = BLOCKS.register("birch_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock SPRUCE_CHAIR = BLOCKS.register("spruce_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock OAK_TABLE = BLOCKS.register("oak_table",
            () -> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock BIRCH_TABLE = BLOCKS.register("birch_table",
            () -> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock SPRUCE_TABLE = BLOCKS.register("spruce_table",
            () -> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> OAK_CLOSET = BLOCKS.register("oak_closet",
            () -> new Closet(BlockBehaviour.Properties.of().noOcclusion(), "oak"));
    public static final DeferredBlock<Block> BIRCH_CLOSET = BLOCKS.register("birch_closet",
            () -> new Closet(BlockBehaviour.Properties.of().noOcclusion(), "birch"));
    public static final DeferredBlock<Block> SPRUCE_CLOSET = BLOCKS.register("spruce_closet",
            () -> new Closet(BlockBehaviour.Properties.of().noOcclusion(), "spruce"));

    public static final DeferredBlock FRIDGE = BLOCKS.register("fridge",
            () -> new FridgeBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> FRIDGE_DOWN = BLOCKS.register("fridge_down",
            () -> new FridgeDownBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> FRIDGE_UP = BLOCKS.register("fridge_up",
            () -> new FridgeUpBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock DISHWASHER = BLOCKS.register("dishwasher",
            () -> new DishWasherBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock SHELF = BLOCKS.register("shelf",
            () -> new ShelfBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SHELF_RIGHT_UP = BLOCKS.register("shelf_right_up",
            () -> new ShelfRightUpBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SHELF_RIGHT_DOWN = BLOCKS.register("shelf_right_down",
            () -> new ShelfRightDownBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SHELF_LEFT_UP = BLOCKS.register("shelf_left_up",
            () -> new ShelfLeftUpBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SHELF_LEFT_DOWN = BLOCKS.register("shelf_left_down",
            () -> new ShelfLeftDownBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> RED_SOFA = BLOCKS.register("red_sofa",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion(), SofaBlock.SofaColor.RED));
    public static final DeferredBlock<Block> RED_SOFA_LEFT = BLOCKS.register("red_sofa_left",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion(), SofaBlock.SofaColor.RED));
    public static final DeferredBlock<Block> RED_SOFA_RIGHT = BLOCKS.register("red_sofa_right",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion(), SofaBlock.SofaColor.RED));
    public static final DeferredBlock<Block> RED_SOFA_MIDLE = BLOCKS.register("red_sofa_midle",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion(), SofaBlock.SofaColor.RED));

    public static final DeferredBlock<Block> GREEN_SOFA = BLOCKS.register("green_sofa",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion(), SofaBlock.SofaColor.GREEN));
    public static final DeferredBlock<Block> GREEN_SOFA_LEFT = BLOCKS.register("green_sofa_left",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion(), SofaBlock.SofaColor.GREEN));
    public static final DeferredBlock<Block> GREEN_SOFA_RIGHT = BLOCKS.register("green_sofa_right",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion(), SofaBlock.SofaColor.GREEN));
    public static final DeferredBlock<Block> GREEN_SOFA_MIDLE = BLOCKS.register("green_sofa_midle",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion(), SofaBlock.SofaColor.GREEN));
}
