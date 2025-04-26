package fr.line.appocraft.blocks;

import fr.line.appocraft.AppoCraft;
import fr.line.appocraft.blocks.custom.*;
import fr.line.appocraft.blocks.custom.TvBlock;
import fr.line.appocraft.blocks.custom.TrafficConeBlock;
import fr.line.appocraft.blocks.custom.floor_lamp.FloorLampBaseBlock;
import fr.line.appocraft.blocks.custom.floor_lamp.FloorLampSecondBlock;
import fr.line.appocraft.blocks.custom.floor_lamp.FloorLampUpBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class blocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AppoCraft.MODID);

    public static final DeferredBlock<Block> OAK_CHAIR = BLOCKS.register("oak_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_CHAIR = BLOCKS.register("birch_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_CHAIR = BLOCKS.register("spruce_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> OAK_TABLE = BLOCKS.register("oak_table",
            () -> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_TABLE = BLOCKS.register("birch_table",
            () -> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_TABLE = BLOCKS.register("spruce_table",
            () -> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> OAK_COFFEE_TABLE = BLOCKS.register("oak_coffee_table",
            () -> new CoffeeTableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_COFFEE_TABLE = BLOCKS.register("birch_coffee_table",
            () -> new CoffeeTableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_COFFEE_TABLE = BLOCKS.register("spruce_coffee_table",
            () -> new CoffeeTableBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> OAK_CLOSET = BLOCKS.register("oak_closet",
            () -> new Closet(BlockBehaviour.Properties.of().noOcclusion(), "oak"));
    public static final DeferredBlock<Block> BIRCH_CLOSET = BLOCKS.register("birch_closet",
            () -> new Closet(BlockBehaviour.Properties.of().noOcclusion(), "birch"));
    public static final DeferredBlock<Block> SPRUCE_CLOSET = BLOCKS.register("spruce_closet",
            () -> new Closet(BlockBehaviour.Properties.of().noOcclusion(), "spruce"));

    public static final DeferredBlock<Block> FRIDGE = BLOCKS.register("fridge",
            () -> new FridgeBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> FRIDGE_DOWN = BLOCKS.register("fridge_down",
            () -> new FridgeDownBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> FRIDGE_UP = BLOCKS.register("fridge_up",
            () -> new FridgeUpBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> DISHWASHER = BLOCKS.register("dishwasher",
            () -> new DishWasherBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> SHELF = BLOCKS.register("shelf",
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
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> RED_SOFA_LEFT = BLOCKS.register("red_sofa_left",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> RED_SOFA_RIGHT = BLOCKS.register("red_sofa_right",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> RED_SOFA_MIDLE = BLOCKS.register("red_sofa_midle",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> GREEN_SOFA = BLOCKS.register("green_sofa",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> GREEN_SOFA_LEFT = BLOCKS.register("green_sofa_left",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> GREEN_SOFA_RIGHT = BLOCKS.register("green_sofa_right",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> GREEN_SOFA_MIDLE = BLOCKS.register("green_sofa_midle",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> WHITE_SOFA = BLOCKS.register("white_sofa",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> WHITE_SOFA_LEFT = BLOCKS.register("white_sofa_left",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> WHITE_SOFA_RIGHT = BLOCKS.register("white_sofa_right",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> WHITE_SOFA_MIDLE = BLOCKS.register("white_sofa_midle",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> BLACK_SOFA = BLOCKS.register("black_sofa",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BLACK_SOFA_LEFT = BLOCKS.register("black_sofa_left",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BLACK_SOFA_RIGHT = BLOCKS.register("black_sofa_right",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BLACK_SOFA_MIDLE = BLOCKS.register("black_sofa_midle",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> GRAY_SOFA = BLOCKS.register("gray_sofa",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> GRAY_SOFA_LEFT = BLOCKS.register("gray_sofa_left",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> GRAY_SOFA_RIGHT = BLOCKS.register("gray_sofa_right",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> GRAY_SOFA_MIDLE = BLOCKS.register("gray_sofa_midle",
            () -> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> TRASH = BLOCKS.register("trash",
            () -> new TrashBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> TV = BLOCKS.register("tv",
            () -> new TvBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> FOLDING_TABLE = BLOCKS.register("folding_table",
            () -> new FoldingTableBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> TRAFFIC_CONE = BLOCKS.register("traffic_cone",
            () -> new TrafficConeBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> BARBED = BLOCKS.register("barbed",
            () -> new BarbedBlock(BlockBehaviour.Properties.of().noOcclusion().noCollission()));

    public static final DeferredBlock<Block> FLOOR_LAMP = BLOCKS.register("floor_lamp",
            () -> new FloorLampBaseBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> FLOOR_LAMP_SECOND = BLOCKS.register("floor_lamp_second",
            () -> new FloorLampSecondBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> FLOOR_LAMP_UP = BLOCKS.register("floor_lamp_up",
            () -> new FloorLampUpBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> BRICKS_1 = BLOCKS.register("bricks_1",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> ROAD_STOP_LINE = BLOCKS.register("road_stop_line",
            () -> new RoadBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> ROAD_DOUBLE_LINE = BLOCKS.register("road_double_line",
            () -> new RoadBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> ROAD_DOUBLE_CORNER_LINE = BLOCKS.register("road_double_corner_line",
            () -> new RoadBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> ROAD_CENTER_LINE = BLOCKS.register("road_center_line",
            () -> new RoadBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> ROAD_CENTER_FULL_LINE = BLOCKS.register("road_center_full_line",
            () -> new RoadBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> ROAD = BLOCKS.register("road",
            () -> new RoadBlock(BlockBehaviour.Properties.of().noOcclusion()));

    public static final DeferredBlock<Block> METAL_1 = BLOCKS.register("metal_1",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> METAL_2 = BLOCKS.register("metal_2",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> METAL_3 = BLOCKS.register("metal_3",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> METALWALL = BLOCKS.register("metalwall",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()));
}
