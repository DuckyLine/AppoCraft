package fr.line.appocraft.blocks.custom.floor_lamp;

import com.mojang.serialization.MapCodec;
import fr.line.appocraft.blocks.custom.ShelfLeftDownBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class FloorLampUpBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<FloorLampUpBlock> CODEC = simpleCodec(FloorLampUpBlock::new);
    private static final VoxelShape SHAPE = Block.box(0.0, 0.0, 7.0, 9.0, 11.0, 9.0);

    public FloorLampUpBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return ShelfLeftDownBlock.rotateShape(state.getValue(FACING), SHAPE);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return null;
    }
}
