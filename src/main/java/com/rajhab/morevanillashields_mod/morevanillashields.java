package com.rajhab.morevanillashields_mod;

import com.mojang.logging.LogUtils;
import com.rajhab.morevanillashields_mod.item.ModCreativeModeTabs;
import com.rajhab.morevanillashields_mod.item.ModItems;
import com.rajhab.morevanillashields_mod.util.ModRecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;
//Thanks to Insane96 for some code examples

@Mod(morevanillashields.MOD_ID)
public class morevanillashields
{

    public static final String MOD_ID = "morevanillashields";
    private static final Logger LOGGER = LogUtils.getLogger();

    public morevanillashields(IEventBus modEventBus, ModContainer modContainer)
    {
        modContainer.registerConfig(ModConfig.Type.SERVER ,ShieldConfig.SPEC, "morevanillashields-server.toml");
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::commonSetup);
        ModItems.register(modEventBus);
        ModRecipeSerializer.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info(MOD_ID + ": This mod now runs with a config file. Feel free to use it!");
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info(MOD_ID + ": This mod is now running on a server. Please report any error or bugs.");
    }

}
