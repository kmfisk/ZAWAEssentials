package com.github.kmfisk.zawaessentials.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import org.zawamod.zawa.world.block.EnrichmentBlock;
import org.zawamod.zawa.world.block.ZawaEnrichmentBlock;

public class HangingPerchBlock extends RotationalBlock implements EnrichmentBlock {
    protected final VoxelShape northShape = Block.box(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
    protected final VoxelShape eastShape = Block.box(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);

    public HangingPerchBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
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
