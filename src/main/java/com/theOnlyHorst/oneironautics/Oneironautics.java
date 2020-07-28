package com.theOnlyHorst.oneironautics;

import com.theOnlyHorst.oneironautics.setup.ClientSetup;
import com.theOnlyHorst.oneironautics.setup.ModSetup;
import com.theOnlyHorst.oneironautics.setup.Registration;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(Oneironautics.MODID)
public class Oneironautics {

    public static final String MODID = "oneironautics";

    public static final Logger LOGGER= LogManager.getLogger();



    public Oneironautics()
    {
        //ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
        //ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_CONFIG);

        Registration.init();

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::init);
    }


}
