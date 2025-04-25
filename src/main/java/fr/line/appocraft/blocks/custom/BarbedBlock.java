package fr.line.appocraft.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class BarbedBlock extends Block {
    public BarbedBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        entity.makeStuckInBlock(state, new Vec3(0.25D, 0.05D, 0.25D));
        entity.hurt(level.damageSources().cactus(), 2.0F);
    }
}
