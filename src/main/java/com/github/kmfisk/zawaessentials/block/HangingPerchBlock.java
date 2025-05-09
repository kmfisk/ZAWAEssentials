package com.github.kmfisk.zawaessentials.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.zawamod.zawa.world.block.EnrichmentBlock;

public class HangingPerchBlock extends RotationalBlock implements EnrichmentBlock {
    protected final VoxelShape northShape = Block.box(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
    protected final VoxelShape eastShape = Block.box(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);

    public HangingPerchBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        switch (direction) {
            case SOUTH:
            default:
                return this.northShape;
            case EAST:
            case WEST:
                return this.eastShape;
        }
    }
}
