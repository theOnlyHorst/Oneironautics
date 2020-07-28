package com.theOnlyHorst.oneironautics.dimension.terrain;

import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.EndDimension;

import java.util.function.BiFunction;

public enum DreamTerrainType {

    ENDLESS_STAIRS("endless_stairs", EndDimension::new);

    private final String name;

    private final BiFunction<World, DimensionType, Dimension> dimensionSupplier;

    DreamTerrainType(String name, BiFunction<World,DimensionType,Dimension> dimensionSupplier)
    {
        this.name=name;
        this.dimensionSupplier=dimensionSupplier;
    }

    public String getName()
    {
        return name;
    }

    public BiFunction<World, DimensionType, Dimension> getDimensionSupplier() {
        return dimensionSupplier;
    }
}
