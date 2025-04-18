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

}
