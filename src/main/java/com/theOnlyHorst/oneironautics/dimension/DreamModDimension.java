package com.theOnlyHorst.oneironautics.dimension;

import com.theOnlyHorst.oneironautics.Oneironautics;
import com.theOnlyHorst.oneironautics.dimension.terrain.DreamTerrainType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.ModDimension;

import java.util.function.BiFunction;

public class DreamModDimension extends ModDimension {


    public final DreamTerrainType terrainType;

    public DreamModDimension(DreamTerrainType terrainType) {
        this.terrainType = terrainType;
    }

    @Override
    public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
        return (world,type) -> terrainType.getDimensionSupplier().apply(world,type);
    }
}
