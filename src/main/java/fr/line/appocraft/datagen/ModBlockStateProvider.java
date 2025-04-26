package fr.line.appocraft.datagen;

import fr.line.appocraft.AppoCraft;
import fr.line.appocraft.blocks.blocks;
import fr.line.appocraft.blocks.custom.*;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AppoCraft.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        sameBlock(blocks.OAK_CHAIR.get(), "chair/oak_chair");
        sameBlock(blocks.BIRCH_CHAIR.get(), "chair/birch_chair");
        sameBlock(blocks.SPRUCE_CHAIR.get(), "chair/spruce_chair");

        sameBlock(blocks.OAK_TABLE.get(), "table/oak_table");
        sameBlock(blocks.BIRCH_TABLE.get(), "table/birch_table");
        sameBlock(blocks.SPRUCE_TABLE.get(), "table/spruce_table");

        sameBlock(blocks.OAK_COFFEE_TABLE.get(), "table/oak_coffee_table");
        sameBlock(blocks.BIRCH_COFFEE_TABLE.get(), "table/birch_coffee_table");
        sameBlock(blocks.SPRUCE_COFFEE_TABLE.get(), "table/spruce_coffee_table");

        directionBlockEntity(blocks.OAK_CLOSET.get(), "closet/oak_closet", Closet.FACING);
        directionBlockEntity(blocks.BIRCH_CLOSET.get(), "closet/birch_closet", Closet.FACING);
        directionBlockEntity(blocks.SPRUCE_CLOSET.get(), "closet/spruce_closet", Closet.FACING);

        directionBlock(blocks.DISHWASHER.get(), "other/dishwasher");

        directionBlockEntity(blocks.FRIDGE_DOWN.get(), "other/fridge_down", FridgeDownBlock.FACING);
        directionBlock(blocks.FRIDGE_UP.get(), "other/fridge_up");
        directionBlockEntity(blocks.FRIDGE.get(), "other/fridge", FridgeBlock.FACING);

        directionBlockEntity(blocks.SHELF_LEFT_DOWN.get(), "shelf/shelf_metal/shelf_left_down", ShelfLeftDownBlock.FACING);
        directionBlock(blocks.SHELF_LEFT_UP.get(), "shelf/shelf_metal/shelf_left_up");
        directionBlock(blocks.SHELF_RIGHT_UP.get(), "shelf/shelf_metal/shelf_right_up");
        directionBlock(blocks.SHELF_RIGHT_DOWN.get(), "shelf/shelf_metal/shelf_right_down");
        directionBlockEntity(blocks.SHELF.get(), "shelf/shelf_metal/shelf", ShelfBlock.FACING);

        sameBlock(blocks.RED_SOFA.get(), "sofa/red_sofa");
        sameBlock(blocks.RED_SOFA_RIGHT.get(), "sofa/red_sofa_right");
        sameBlock(blocks.RED_SOFA_LEFT.get(), "sofa/red_sofa_left");
        sameBlock(blocks.RED_SOFA_MIDLE.get(), "sofa/red_sofa_midle");

        sameBlock(blocks.GREEN_SOFA.get(), "sofa/green_sofa");
        sameBlock(blocks.GREEN_SOFA_RIGHT.get(), "sofa/green_sofa_right");
        sameBlock(blocks.GREEN_SOFA_LEFT.get(), "sofa/green_sofa_left");
        sameBlock(blocks.GREEN_SOFA_MIDLE.get(), "sofa/green_sofa_midle");

        sameBlock(blocks.WHITE_SOFA.get(), "sofa/white_sofa");
        sameBlock(blocks.WHITE_SOFA_RIGHT.get(), "sofa/white_sofa_right");
        sameBlock(blocks.WHITE_SOFA_LEFT.get(), "sofa/white_sofa_left");
        sameBlock(blocks.WHITE_SOFA_MIDLE.get(), "sofa/white_sofa_midle");

        sameBlock(blocks.BLACK_SOFA.get(), "sofa/black_sofa");
        sameBlock(blocks.BLACK_SOFA_RIGHT.get(), "sofa/black_sofa_right");
        sameBlock(blocks.BLACK_SOFA_LEFT.get(), "sofa/black_sofa_left");
        sameBlock(blocks.BLACK_SOFA_MIDLE.get(), "sofa/black_sofa_midle");

        sameBlock(blocks.GRAY_SOFA.get(), "sofa/gray_sofa");
        sameBlock(blocks.GRAY_SOFA_RIGHT.get(), "sofa/gray_sofa_right");
        sameBlock(blocks.GRAY_SOFA_LEFT.get(), "sofa/gray_sofa_left");
        sameBlock(blocks.GRAY_SOFA_MIDLE.get(), "sofa/gray_sofa_midle");

        directionBlockEntity(blocks.TRASH.get(), "other/trash", TrashBlock.FACING);

        sameBlock(blocks.TV.get(), "other/tv");

        sameBlock(blocks.FOLDING_TABLE.get(), "table/folding_table");

        sameBlock(blocks.TRAFFIC_CONE.get(), "other/traffic_cone");

        sameBlock(blocks.FLOOR_LAMP.get(), "road/floor_lamp_base");
        sameBlock(blocks.FLOOR_LAMP_SECOND.get(), "road/floor_lamp_second");
        sameBlock(blocks.FLOOR_LAMP_UP.get(), "road/floor_lamp_up");

        blockWithItem(blocks.BRICKS_1);

        blockWithItem(blocks.METAL_1);
        blockWithItem(blocks.METAL_2);
        blockWithItem(blocks.METAL_3);
        blockWithItem(blocks.METALWALL);

        directionBlock(blocks.ROAD_DOUBLE_LINE.get(), "road/road_double_line");
        directionBlock(blocks.ROAD_DOUBLE_CORNER_LINE.get(), "road/road_double_corner_line");
        directionBlock(blocks.ROAD_STOP_LINE.get(), "road/road_stop_line");
        directionBlock(blocks.ROAD_CENTER_LINE.get(), "road/road_center_line");
        directionBlock(blocks.ROAD_CENTER_FULL_LINE.get(), "road/road_center_full_line");
        directionBlock(blocks.ROAD.get(), "road/road");
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void directionBlockEntity(Block block, String name, DirectionProperty Facing) {
        ModelFile blockModel = models().getExistingFile(modLoc("block/" + name));
        getVariantBuilder(block)
                .forAllStates(state -> {
                    Direction direction = state.getValue(Facing);
                    int rotationY = 0;
                    if (direction == Direction.SOUTH) {
                        rotationY = 180;
                    } else if (direction == Direction.EAST) {
                        rotationY = 90;
                    } else if (direction == Direction.WEST) {
                        rotationY = 270;
                    }
                    return ConfiguredModel.builder()
                            .modelFile(blockModel)
                            .rotationY(rotationY)
                            .build();
                });
        simpleBlockItem(block, blockModel);
    }

    private void directionBlock(Block block, String name) {
        ModelFile blockModel = models().getExistingFile(modLoc("block/" + name));

        horizontalBlock(block, blockModel);
        simpleBlockItem(block, blockModel);
    }

    private void sameBlock(Block block, String name) {
        ModelFile blockModel = models().getExistingFile(modLoc("block/" + name));

        horizontalBlock(block, blockModel);
        simpleBlockItem(block, blockModel);
    }
}
