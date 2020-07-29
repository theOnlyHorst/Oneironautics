package com.theOnlyHorst.oneironautics.blocks.dreamblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DarkNightBlock extends Block {

    public DarkNightBlock() {
        super(Block.Properties.create(Material.ROCK)
                .noDrops()
                .hardnessAndResistance(-1));
    }
}
