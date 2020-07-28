package com.theOnlyHorst.oneironautics.setup;

import com.theOnlyHorst.oneironautics.Oneironautics;
import com.theOnlyHorst.oneironautics.dimension.ModDimensions;
import com.theOnlyHorst.oneironautics.network.Networking;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

@Mod.EventBusSubscriber(modid = Oneironautics.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {

    public static final ItemGroup ITEM_GROUP = new ItemGroup("oneironautics") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Registration.DREAM_DIARY.get());
        }
    };

    public static void init(final FMLCommonSetupEvent event) {
        Networking.registerMessages();
    }

    @SubscribeEvent
    public static void serverLoad(FMLServerStartingEvent event) {
        //ModCommands.register(event.getCommandDispatcher());
    }

    @SubscribeEvent
    public static void onDimensionRegistry(RegisterDimensionsEvent event) {
        //ModDimensions.DIMENSION_TYPE = DimensionManager.registerOrGetDimension(ModDimensions.DIMENSION_ID, Registration.DIMENSION.get(), null, true);
    }
}
