package fr.line.appocraft.items;

import fr.line.appocraft.AppoCraft;
import fr.line.appocraft.blocks.blocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class items {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AppoCraft.MODID);

    public static final DeferredItem<Item> EMPTY_CAN = ITEMS.register("empty_can",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> OAK_CHAIR = ITEMS.register("oak_chair",
            () -> new BlockItem((Block) blocks.OAK_CHAIR.get(), new Item.Properties()));
    public static final DeferredItem<Item> BIRCH_CHAIR = ITEMS.register("birch_chair",
            () -> new BlockItem((Block) blocks.BIRCH_CHAIR.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPRUCE_CHAIR = ITEMS.register("spruce_chair",
            () -> new BlockItem((Block) blocks.SPRUCE_CHAIR.get(), new Item.Properties()));

    public static final DeferredItem<Item> OAK_TABLE = ITEMS.register("oak_table",
            () -> new BlockItem((Block) blocks.OAK_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BIRCH_TABLE = ITEMS.register("birch_table",
            () -> new BlockItem((Block) blocks.BIRCH_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPRUCE_TABLE = ITEMS.register("spruce_table",
            () -> new BlockItem((Block) blocks.SPRUCE_TABLE.get(), new Item.Properties()));

    public static final DeferredItem<Item> OAK_COFFEE_TABLE = ITEMS.register("oak_coffee_table",
            () -> new BlockItem((Block) blocks.OAK_COFFEE_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BIRCH_COFFEE_TABLE = ITEMS.register("birch_coffee_table",
            () -> new BlockItem((Block) blocks.BIRCH_COFFEE_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPRUCE_COFFEE_TABLE = ITEMS.register("spruce_coffee_table",
            () -> new BlockItem((Block) blocks.SPRUCE_COFFEE_TABLE.get(), new Item.Properties()));

    public static final DeferredItem<Item> OAK_CLOSET = ITEMS.register("oak_closet",
            () -> new BlockItem((Block) blocks.OAK_CLOSET.get(), new Item.Properties()));
    public static final DeferredItem<Item> BIRCH_CLOSET = ITEMS.register("birch_closet",
            () -> new BlockItem((Block) blocks.BIRCH_CLOSET.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPRUCE_CLOSET = ITEMS.register("spruce_closet",
            () -> new BlockItem((Block) blocks.SPRUCE_CLOSET.get(), new Item.Properties()));

    public static final DeferredItem<Item> FRIDGE = ITEMS.register("fridge",
            () -> new BlockItem((Block) blocks.FRIDGE.get(), new Item.Properties()));
    public static final DeferredItem<Item> FRIDGE_DOWN = ITEMS.register("fridge_up",
            () -> new BlockItem((Block) blocks.FRIDGE_DOWN.get(), new Item.Properties()));
    public static final DeferredItem<Item> FRIDGE_UP = ITEMS.register("fridge_down",
            () -> new BlockItem((Block) blocks.FRIDGE_UP.get(), new Item.Properties()));

    public static final DeferredItem<Item> DISHWASHER = ITEMS.register("dishwasher",
            () -> new BlockItem((Block) blocks.DISHWASHER.get(), new Item.Properties()));

    public static final DeferredItem<Item> SHELF = ITEMS.register("shelf",
            () -> new BlockItem((Block) blocks.SHELF.get(), new Item.Properties()));
    public static final DeferredItem<Item> SHELF_RIGHT_UP = ITEMS.register("shelf_right_up",
            () -> new BlockItem((Block) blocks.SHELF_RIGHT_UP.get(), new Item.Properties()));
    public static final DeferredItem<Item> SHELF_RIGHT_DOWN = ITEMS.register("shelf_right_down",
            () -> new BlockItem((Block) blocks.SHELF_RIGHT_DOWN.get(), new Item.Properties()));
    public static final DeferredItem<Item> SHELF_LEFT_UP = ITEMS.register("shelf_left_up",
            () -> new BlockItem((Block) blocks.SHELF_LEFT_UP.get(), new Item.Properties()));
    public static final DeferredItem<Item> SHELF_LEFT_DOWN = ITEMS.register("shelf_left_down",
            () -> new BlockItem((Block) blocks.SHELF_LEFT_DOWN.get(), new Item.Properties()));

    public static final DeferredItem<Item> RED_SOFA = ITEMS.register("red_sofa",
            () -> new BlockItem((Block) blocks.RED_SOFA.get(), new Item.Properties()));
    public static final DeferredItem<Item> RED_SOFA_LEFT = ITEMS.register("red_sofa_left",
            () -> new BlockItem((Block) blocks.RED_SOFA_LEFT.get(), new Item.Properties()));
    public static final DeferredItem<Item> RED_SOFA_RIGHT = ITEMS.register("red_sofa_right",
            () -> new BlockItem((Block) blocks.RED_SOFA_RIGHT.get(), new Item.Properties()));
    public static final DeferredItem<Item> RED_SOFA_MIDLE = ITEMS.register("red_sofa_midle",
            () -> new BlockItem((Block) blocks.RED_SOFA_MIDLE.get(), new Item.Properties()));

    public static final DeferredItem<Item> GREEN_SOFA = ITEMS.register("green_sofa",
            () -> new BlockItem((Block) blocks.GREEN_SOFA.get(), new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SOFA_LEFT = ITEMS.register("green_sofa_left",
            () -> new BlockItem((Block) blocks.GREEN_SOFA_LEFT.get(), new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SOFA_RIGHT = ITEMS.register("green_sofa_right",
            () -> new BlockItem((Block) blocks.GREEN_SOFA_RIGHT.get(), new Item.Properties()));
    public static final DeferredItem<Item> GREEN_SOFA_MIDLE = ITEMS.register("green_sofa_midle",
            () -> new BlockItem((Block) blocks.GREEN_SOFA_MIDLE.get(), new Item.Properties()));

    public static final DeferredItem<Item> WHITE_SOFA = ITEMS.register("white_sofa",
            () -> new BlockItem((Block) blocks.WHITE_SOFA.get(), new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SOFA_LEFT = ITEMS.register("white_sofa_left",
            () -> new BlockItem((Block) blocks.WHITE_SOFA_LEFT.get(), new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SOFA_RIGHT = ITEMS.register("white_sofa_right",
            () -> new BlockItem((Block) blocks.WHITE_SOFA_RIGHT.get(), new Item.Properties()));
    public static final DeferredItem<Item> WHITE_SOFA_MIDLE = ITEMS.register("white_sofa_midle",
            () -> new BlockItem((Block) blocks.WHITE_SOFA_MIDLE.get(), new Item.Properties()));

    public static final DeferredItem<Item> BLACK_SOFA = ITEMS.register("black_sofa",
            () -> new BlockItem((Block) blocks.BLACK_SOFA.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_SOFA_LEFT = ITEMS.register("black_sofa_left",
            () -> new BlockItem((Block) blocks.BLACK_SOFA_LEFT.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_SOFA_RIGHT = ITEMS.register("black_sofa_right",
            () -> new BlockItem((Block) blocks.BLACK_SOFA_RIGHT.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_SOFA_MIDLE = ITEMS.register("black_sofa_midle",
            () -> new BlockItem((Block) blocks.BLACK_SOFA_MIDLE.get(), new Item.Properties()));

    public static final DeferredItem<Item> GRAY_SOFA = ITEMS.register("gray_sofa",
            () -> new BlockItem((Block) blocks.GRAY_SOFA.get(), new Item.Properties()));
    public static final DeferredItem<Item> GRAY_SOFA_LEFT = ITEMS.register("gray_sofa_left",
            () -> new BlockItem((Block) blocks.GRAY_SOFA_LEFT.get(), new Item.Properties()));
    public static final DeferredItem<Item> GRAY_SOFA_RIGHT = ITEMS.register("gray_sofa_right",
            () -> new BlockItem((Block) blocks.GRAY_SOFA_RIGHT.get(), new Item.Properties()));
    public static final DeferredItem<Item> GRAY_SOFA_MIDLE = ITEMS.register("gray_sofa_midle",
            () -> new BlockItem((Block) blocks.GRAY_SOFA_MIDLE.get(), new Item.Properties()));

    public static final DeferredItem<Item> TRASH = ITEMS.register("trash",
            () -> new BlockItem((Block) blocks.TRASH.get(), new Item.Properties()));

    public static final DeferredItem<Item> TV = ITEMS.register("tv",
            () -> new BlockItem((Block) blocks.TV.get(), new Item.Properties()));

    public static final DeferredItem<Item> FOLDING_TABLE = ITEMS.register("folding_table",
            () -> new BlockItem((Block) blocks.FOLDING_TABLE.get(), new Item.Properties()));

    public static final DeferredItem<Item> TRAFFIC_CONE = ITEMS.register("traffic_cone",
            () -> new BlockItem((Block) blocks.TRAFFIC_CONE.get(), new Item.Properties()));

    public static final DeferredItem<Item> BARBED = ITEMS.register("barbed",
            () -> new BlockItem((Block) blocks.BARBED.get(), new Item.Properties()));

    public static final DeferredItem<Item> FLOOR_LAMP = ITEMS.register("floor_lamp",
            () -> new BlockItem((Block) blocks.FLOOR_LAMP.get(), new Item.Properties()));
    public static final DeferredItem<Item> FLOOR_LAMP_SECOND = ITEMS.register("floor_lamp_second",
            () -> new BlockItem((Block) blocks.FLOOR_LAMP_SECOND.get(), new Item.Properties()));
    public static final DeferredItem<Item> FLOOR_LAMP_UP = ITEMS.register("floor_lamp_up",
            () -> new BlockItem((Block) blocks.FLOOR_LAMP_UP.get(), new Item.Properties()));

    public static final DeferredItem<Item> BRICKS_1 = ITEMS.register("bricks_1",
            () -> new BlockItem((Block) blocks.BRICKS_1.get(), new Item.Properties()));

    public static final DeferredItem<Item> ROAD_STOP_LINE = ITEMS.register("road_stop_line",
            () -> new BlockItem((Block) blocks.ROAD_STOP_LINE.get(), new Item.Properties()));
    public static final DeferredItem<Item> ROAD_DOUBLE_LINE = ITEMS.register("road_double_line",
            () -> new BlockItem((Block) blocks.ROAD_DOUBLE_LINE.get(), new Item.Properties()));
    public static final DeferredItem<Item> ROAD_DOUBLE_CORNER_LINE = ITEMS.register("road_double_corner_line",
            () -> new BlockItem((Block) blocks.ROAD_DOUBLE_CORNER_LINE.get(), new Item.Properties()));
    public static final DeferredItem<Item> ROAD_CENTER_LINE = ITEMS.register("road_center_line",
            () -> new BlockItem((Block) blocks.ROAD_CENTER_LINE.get(), new Item.Properties()));
    public static final DeferredItem<Item> ROAD_CENTER_FULL_LINE = ITEMS.register("road_center_full_line",
            () -> new BlockItem((Block) blocks.ROAD_CENTER_FULL_LINE.get(), new Item.Properties()));
    public static final DeferredItem<Item> ROAD = ITEMS.register("road",
            () -> new BlockItem((Block) blocks.ROAD.get(), new Item.Properties()));

    public static final DeferredItem<Item> METAL_1 = ITEMS.register("metal_1",
            () -> new BlockItem((Block) blocks.METAL_1.get(), new Item.Properties()));
    public static final DeferredItem<Item> METAL_2 = ITEMS.register("metal_2",
            () -> new BlockItem((Block) blocks.METAL_2.get(), new Item.Properties()));
    public static final DeferredItem<Item> METAL_3 = ITEMS.register("metal_3",
            () -> new BlockItem((Block) blocks.METAL_3.get(), new Item.Properties()));
    public static final DeferredItem<Item> METALWALL = ITEMS.register("metalwall",
            () -> new BlockItem((Block) blocks.METALWALL.get(), new Item.Properties()));

    public static final DeferredItem<Item> BASEBALLBAT = ITEMS.register("baseballbat",
            () -> new SwordItem(Tiers.IRON, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.IRON, 0, -3.4F))));

    public static final DeferredItem<Item> SMALL_CUT = ITEMS.register("small_cut",
            () -> new SwordItem(Tiers.IRON, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.IRON, -1, -2.1F))));
}
