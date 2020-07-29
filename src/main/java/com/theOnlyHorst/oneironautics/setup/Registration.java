package com.theOnlyHorst.oneironautics.setup;

import com.theOnlyHorst.oneironautics.blocks.dreamblocks.DarkNightBlock;
import com.theOnlyHorst.oneironautics.blocks.dreamblocks.EndlessStairs;
import com.theOnlyHorst.oneironautics.items.DreamDiary;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.theOnlyHorst.oneironautics.Oneironautics.MODID;

public class Registration {

    //See: https://github.com/McJty/YouTubeModding14/blob/master/src/main/java/com/mcjty/mytutorial/setup/Registration.java
    private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<TileEntityType<?>> TILES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, MODID);
    private static final DeferredRegister<ContainerType<?>> CONTAINERS = new DeferredRegister<>(ForgeRegistries.CONTAINERS, MODID);
    private static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES, MODID);
    private static final DeferredRegister<ModDimension> DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, MODID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
        CONTAINERS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        DIMENSIONS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<DreamDiary> DREAM_DIARY = ITEMS.register("dreamdiary", DreamDiary::new);

    public static final RegistryObject<DarkNightBlock> DARK_NIGHT_BLOCK = BLOCKS.register("dark_night_block", DarkNightBlock::new);
    public static final RegistryObject<Item> DARK_NIGHT_BLOCK_ITEM = ITEMS.register("dark_night_block", () -> new BlockItem(DARK_NIGHT_BLOCK.get(), new Item.Properties().group(ModSetup.ITEM_GROUP)));

    public static final RegistryObject<EndlessStairs> ENDLESS_STAIRS = BLOCKS.register("endless_stairs", EndlessStairs::new);
    public static final RegistryObject<Item> ENDLESS_STAIRS_ITEM = ITEMS.register("endless_stairs", () -> new BlockItem(ENDLESS_STAIRS.get(), new Item.Properties().group(ModSetup.ITEM_GROUP)));
}
