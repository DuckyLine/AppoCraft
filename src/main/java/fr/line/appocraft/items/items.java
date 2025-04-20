package fr.line.appocraft.items;

import fr.line.appocraft.AppoCraft;
import fr.line.appocraft.blocks.blocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
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

}
