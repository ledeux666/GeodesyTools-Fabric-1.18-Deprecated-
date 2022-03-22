package ru.ledeux.geotools.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import ru.ledeux.geotools.GeoTools;

public class DemoBlockEntity extends BlockEntity {

    public DemoBlockEntity(BlockPos pos, BlockState state) {
        super(GeoTools.DEMO_BLOCK_ENTITY, pos, state);
    }
}