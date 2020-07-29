package com.theOnlyHorst.oneironautics.items;

import com.theOnlyHorst.oneironautics.Oneironautics;
import com.theOnlyHorst.oneironautics.setup.ModSetup;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BookItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;


public class DreamDiary extends Item {

    public DreamDiary() {
        super(new Item.Properties()
                .maxStackSize(1)
                .defaultMaxDamage(0)
                .maxDamage(0)
                .group(ModSetup.ITEM_GROUP));
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<ITextComponent> list, ITooltipFlag flags) {
        list.add(new TranslationTextComponent("message.dreamdiary"));
    }

    @Nonnull
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemStack = playerIn.getHeldItem(handIn);
        if (worldIn.isRemote) {
            TinkerBook.INSTANCE.openGui(new TranslationTextComponent("item.tconstruct.book"), itemStack);
        }
        return new ActionResult<>(ActionResultType.SUCCESS, itemStack);
    }

}
