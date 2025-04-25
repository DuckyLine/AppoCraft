package fr.line.appocraft.blocks.custom;

import com.mojang.serialization.MapCodec;
import fr.line.appocraft.blocks.custom.type.SofaType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SofaBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<DishWasherBlock> CODEC = simpleCodec(DishWasherBlock::new);
    private static final VoxelShape SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty PLACED_BY_PLAYER = BooleanProperty.create("placed_by_player");

    public SofaBlock(Properties properties) {
        super(properties);
    }

    public class SofaPlacerFlag {
        public static boolean ignoreNextRemove = false;
        public static boolean ignoreNextPlace = false;
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean movedByPiston) {
        super.onRemove(state, level, pos, newState, movedByPiston);

        if (SofaPlacerFlag.ignoreNextRemove || SofaPlacerFlag.ignoreNextPlace) return;

        List<DeferredBlock<Block>> sofaStates = SofaType.getSofaType(state.getBlock());
        Direction facing = state.getValue(FACING);

        Direction right = switch (facing) {
            case NORTH -> Direction.WEST;
            case EAST -> Direction.NORTH;
            case SOUTH -> Direction.EAST;
            case WEST -> Direction.SOUTH;
            default -> Direction.EAST;
        };

        Direction left = right.getOpposite();

        BlockPos rightPos = pos.relative(right);
        BlockPos leftPos = pos.relative(left);

        SofaPlacerFlag.ignoreNextPlace = true;
        if (level.getBlockState(leftPos).is(sofaStates.get(1)))
            level.setBlock(leftPos, sofaStates.get(0).get().defaultBlockState()
                    .setValue(FACING, state.getValue(FACING))
                    .setValue(PLACED_BY_PLAYER, false), 3);
        if (level.getBlockState(rightPos).is(sofaStates.get(2)))
            level.setBlock(rightPos, sofaStates.get(0).get().defaultBlockState()
                    .setValue(FACING, state.getValue(FACING))
                    .setValue(PLACED_BY_PLAYER, false), 3);
        if (level.getBlockState(leftPos).is(sofaStates.get(3)))
            level.setBlock(leftPos, sofaStates.get(2).get().defaultBlockState()
                    .setValue(FACING, state.getValue(FACING))
                    .setValue(PLACED_BY_PLAYER, false), 3);
        if (level.getBlockState(rightPos).is(sofaStates.get(3)))
            level.setBlock(rightPos, sofaStates.get(1).get().defaultBlockState()
                    .setValue(FACING, state.getValue(FACING))
                    .setValue(PLACED_BY_PLAYER, false), 3);
        SofaPlacerFlag.ignoreNextPlace = false;
    }

    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        super.onPlace(state, level, pos, oldState, movedByPiston);

        if (!state.getValue(PLACED_BY_PLAYER)) return;
        if (SofaPlacerFlag.ignoreNextPlace) return;

        List<DeferredBlock<Block>> sofaStates = SofaType.getSofaType(state.getBlock());
        Direction facing = state.getValue(FACING);

        Direction right = switch (facing) {
            case NORTH -> Direction.WEST;
            case EAST -> Direction.NORTH;
            case SOUTH -> Direction.EAST;
            case WEST -> Direction.SOUTH;
            default -> Direction.EAST;
        };

        Direction left = right.getOpposite();

        BlockPos rightPos = pos.relative(right);
        BlockPos leftPos = pos.relative(left);
        SofaPlacerFlag.ignoreNextRemove = true;
        if (level.getBlockState(leftPos).is(sofaStates.get(0)) && !level.getBlockState(rightPos).is(sofaStates.get(0))) {
            level.setBlock(leftPos, sofaStates.get(1).get().defaultBlockState()
                    .setValue(FACING, state.getValue(FACING))
                    .setValue(PLACED_BY_PLAYER, false), 3);
            level.setBlock(pos, sofaStates.get(2).get().defaultBlockState()
                    .setValue(FACING, state.getValue(FACING))
                    .setValue(PLACED_BY_PLAYER, false), 3);
        }
        else if (level.getBlockState(rightPos).is(sofaStates.get(0)) && !level.getBlockState(leftPos).is(sofaStates.get(0))) {
            level.setBlock(rightPos, sofaStates.get(2).get().defaultBlockState()
                    .setValue(FACING, state.getValue(FACING))
                    .setValue(PLACED_BY_PLAYER, false), 3);
            level.setBlock(pos, sofaStates.get(1).get().defaultBlockState()
                    .setValue(FACING, state.getValue(FACING))
                    .setValue(PLACED_BY_PLAYER, false), 3);
        }
        else if (level.getBlockState(leftPos).is(sofaStates.get(2))) {
            level.setBlock(leftPos, sofaStates.get(3).get().defaultBlockState()
                    .setValue(FACING, state.getValue(FACING))
                    .setValue(PLACED_BY_PLAYER, false), 3);
            level.setBlock(pos, sofaStates.get(2).get().defaultBlockState()
                    .setValue(FACING, state.getValue(FACING))
                    .setValue(PLACED_BY_PLAYER, false), 3);
        }
        else if (level.getBlockState(rightPos).is(sofaStates.get(1))) {
            level.setBlock(rightPos, sofaStates.get(3).get().defaultBlockState()
                    .setValue(FACING, state.getValue(FACING))
                    .setValue(PLACED_BY_PLAYER, false), 3);
            level.setBlock(pos, sofaStates.get(1).get().defaultBlockState()
                    .setValue(FACING, state.getValue(FACING))
                    .setValue(PLACED_BY_PLAYER, false), 3);
        }
        SofaPlacerFlag.ignoreNextRemove = false;
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection().getOpposite())
                .setValue(PLACED_BY_PLAYER, true);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, PLACED_BY_PLAYER);
    }
}
