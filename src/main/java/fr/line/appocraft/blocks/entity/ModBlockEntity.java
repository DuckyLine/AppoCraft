package fr.line.appocraft.blocks.entity;

import fr.line.appocraft.AppoCraft;
import fr.line.appocraft.blocks.blocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntity {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, AppoCraft.MODID);

    public static final Supplier<BlockEntityType<ClosetBlockEntity>> CLOSET_OAK_BE =
            BLOCK_ENTITY.register("closet_oak_be", () -> BlockEntityType.Builder.of(
                            (blockPos, blockState) -> new ClosetBlockEntity(blockPos, blockState, ModBlockEntity.CLOSET_OAK_BE),
                            blocks.OAK_CLOSET.get())
                    .build(null));

    public static final Supplier<BlockEntityType<ClosetBlockEntity>> CLOSET_BIRCH_BE =
            BLOCK_ENTITY.register("closet_birch_be", () -> BlockEntityType.Builder.of(
                            (blockPos, blockState) -> new ClosetBlockEntity(blockPos, blockState, ModBlockEntity.CLOSET_BIRCH_BE),
                            blocks.BIRCH_CLOSET.get())
                    .build(null));

    public static final Supplier<BlockEntityType<ClosetBlockEntity>> CLOSET_SPRUCE_BE =
            BLOCK_ENTITY.register("closet_spruce_be", () -> BlockEntityType.Builder.of(
                            (blockPos, blockState) -> new ClosetBlockEntity(blockPos, blockState, ModBlockEntity.CLOSET_SPRUCE_BE),
                            blocks.SPRUCE_CLOSET.get())
                    .build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITY.register(eventBus);
    }

}
