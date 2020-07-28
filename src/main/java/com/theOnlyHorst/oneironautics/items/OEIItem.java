package com.theOnlyHorst.oneironautics.items;

import com.theOnlyHorst.oneironautics.setup.ModSetup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class OEIItem extends Item {

    public OEIItem() {
        super(new Item.Properties()
                .maxStackSize(1)
                .defaultMaxDamage(0)
                .maxDamage(0));
    }

    public OEIItem(int stacksize, int defaultMaxDmg, int maxDmg, Food food, ItemGroup group) {
        super(new Item.Properties()
                .maxStackSize(stacksize)
                .defaultMaxDamage(defaultMaxDmg)
                .maxDamage(maxDmg)
                .food(food)
                .group(group));
    }
}
