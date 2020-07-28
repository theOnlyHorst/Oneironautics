package com.theOnlyHorst.oneironautics.datagen;

import com.theOnlyHorst.oneironautics.Oneironautics;
import com.theOnlyHorst.oneironautics.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelProvider;

public class Items extends ItemModelProvider {

    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Oneironautics.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(Registration.DREAM_DIARY.get().getRegistryName().getPath(), new ResourceLocation("item/handheld"),
                "layer0", new ResourceLocation(Oneironautics.MODID, "item/dreamdiary"));
    }

    @Override
    public String getName() {
        return null;
    }
}
