package fr.line.appocraft.blocks;

import fr.line.appocraft.AppoCraft;
import fr.line.appocraft.blocks.custom.ChairBlock;
import fr.line.appocraft.blocks.custom.TableBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

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

    public static final DeferredBlock OAK_CLOSET = BLOCKS.register("oak_closet",
            () -> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock BIRCH_CLOSET = BLOCKS.register("birch_closet",
            () -> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock SPRUCE_CLOSET = BLOCKS.register("spruce_closet",
            () -> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));

}
