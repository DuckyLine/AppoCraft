package fr.line.appocraft.blocks.custom;

import fr.line.appocraft.blocks.blocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

import static fr.line.appocraft.blocks.custom.FridgeUpBlock.FACING;

public class ShelfBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public ShelfBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public BlockPos getRightPos(BlockPos pos, Direction facing) {
        Direction right = switch (facing) {
            case NORTH -> Direction.WEST;
            case EAST -> Direction.NORTH;
            case SOUTH -> Direction.EAST;
            case WEST -> Direction.SOUTH;
            default -> Direction.EAST;
        };
        return pos.relative(right);
    }

    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, level, pos, oldState, isMoving);

        BlockPos leftUp = pos.above();
        BlockPos rightDown = getRightPos(pos, state.getValue(FACING));
        BlockPos rightUp = rightDown.above();

        BlockState ShelfLeftDown = blocks.SHELF_LEFT_DOWN.get().defaultBlockState()
                .setValue(ShelfLeftDownBlock.FACING, state.getValue(FACING));
        BlockState ShelfLeftUp = blocks.SHELF_LEFT_UP.get().defaultBlockState()
                .setValue(FACING, state.getValue(FACING));
        BlockState ShelfRightDown = blocks.SHELF_RIGHT_DOWN.get().defaultBlockState()
                .setValue(FACING, state.getValue(FACING));
        BlockState ShelfRightUp = blocks.SHELF_RIGHT_UP.get().defaultBlockState()
                .setValue(FACING, state.getValue(FACING));

        level.setBlock(pos, ShelfLeftDown, 3);
        if (level.getBlockState(leftUp).isAir())
            level.setBlock(leftUp, ShelfLeftUp, 3);
        if (level.getBlockState(rightDown).isAir())
            level.setBlock(rightDown, ShelfRightDown, 3);
        if (level.getBlockState(rightUp).isAir())
            level.setBlock(rightUp, ShelfRightUp, 3);
    }
}
