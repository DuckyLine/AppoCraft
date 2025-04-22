package fr.line.appocraft.datagen;

import fr.line.appocraft.AppoCraft;
import fr.line.appocraft.blocks.blocks;
import fr.line.appocraft.blocks.custom.*;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AppoCraft.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        sameBlock(blocks.OAK_CHAIR.get(), "oak_chair");
        sameBlock(blocks.BIRCH_CHAIR.get(), "birch_chair");
        sameBlock(blocks.SPRUCE_CHAIR.get(), "spruce_chair");

        sameBlock(blocks.OAK_TABLE.get(), "oak_table");
        sameBlock(blocks.BIRCH_TABLE.get(), "birch_table");
        sameBlock(blocks.SPRUCE_TABLE.get(), "spruce_table");

        directionBlockEntity(blocks.OAK_CLOSET.get(), "oak_closet", Closet.FACING);
        directionBlockEntity(blocks.BIRCH_CLOSET.get(), "birch_closet", Closet.FACING);
        directionBlockEntity(blocks.SPRUCE_CLOSET.get(), "spruce_closet", Closet.FACING);

        directionBlock(blocks.DISHWASHER.get(), "dishwasher");

        directionBlockEntity(blocks.FRIDGE_DOWN.get(), "fridge_down", FridgeDownBlock.FACING);
        directionBlock(blocks.FRIDGE_UP.get(), "fridge_up");
        directionBlockEntity(blocks.FRIDGE.get(), "fridge", FridgeBlock.FACING);

        directionBlockEntity(blocks.SHELF_LEFT_DOWN.get(), "shelf_left_down", ShelfLeftDownBlock.FACING);
        directionBlock(blocks.SHELF_LEFT_UP.get(), "shelf_left_up");
        directionBlock(blocks.SHELF_RIGHT_UP.get(), "shelf_right_up");
        directionBlock(blocks.SHELF_RIGHT_DOWN.get(), "shelf_right_down");
        directionBlockEntity(blocks.SHELF.get(), "shelf", ShelfBlock.FACING);

        sameBlock(blocks.RED_SOFA.get(), "red_sofa");
        sameBlock(blocks.RED_SOFA_RIGHT.get(), "red_sofa_right");
        sameBlock(blocks.RED_SOFA_LEFT.get(), "red_sofa_left");
        sameBlock(blocks.RED_SOFA_MIDLE.get(), "red_sofa_midle");

        sameBlock(blocks.GREEN_SOFA.get(), "green_sofa");
        sameBlock(blocks.GREEN_SOFA_RIGHT.get(), "green_sofa_right");
        sameBlock(blocks.GREEN_SOFA_LEFT.get(), "green_sofa_left");
        sameBlock(blocks.GREEN_SOFA_MIDLE.get(), "green_sofa_midle");
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
