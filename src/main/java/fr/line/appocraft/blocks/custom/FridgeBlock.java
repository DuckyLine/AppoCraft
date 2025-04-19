package fr.line.appocraft.blocks.custom;

import fr.line.appocraft.blocks.blocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import static fr.line.appocraft.blocks.custom.FridgeUpBlock.FACING;

public class FridgeBlock extends Block {
    public FridgeBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(BlockStateProperties.FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, world, pos, oldState, isMoving);

        BlockPos above = pos.above();

        BlockState fridgeDownState = blocks.FRIDGE_DOWN.get().defaultBlockState()
                .setValue(FACING, state.getValue(BlockStateProperties.FACING));
        BlockState fridgeUpState = blocks.FRIDGE_UP.get().defaultBlockState()
                .setValue(FACING, state.getValue(BlockStateProperties.FACING));

        world.setBlock(pos, fridgeDownState, 3);
        if (world.getBlockState(above).isAir()) {
            world.setBlock(above, fridgeUpState, 3);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.FACING);
    }
}