package fr.line.appocraft.blocks.custom.floor_lamp;

import com.mojang.serialization.MapCodec;
import fr.line.appocraft.blocks.blocks;
import fr.line.appocraft.blocks.custom.ShelfLeftDownBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class FloorLampBaseBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<FloorLampBaseBlock> CODEC = simpleCodec(FloorLampBaseBlock::new);
    private static final VoxelShape SHAPE = Block.box(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);

    public FloorLampBaseBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        super.onPlace(state, level, pos, oldState, movedByPiston);

        for (int i = 1; i < 5 ; i++) {
            if (level.getBlockState(pos.offset(0, i, 0)).isAir()) level.setBlock(pos.offset(0, i, 0),
                    blocks.FLOOR_LAMP_SECOND.get().defaultBlockState(), 3);
        }
        if (level.getBlockState(pos.offset(0, 5, 0)).isAir()) level.setBlock(pos.offset(0, 5, 0),
                blocks.FLOOR_LAMP_UP.get().defaultBlockState().setValue(FACING, state.getValue(FACING)), 3);
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
