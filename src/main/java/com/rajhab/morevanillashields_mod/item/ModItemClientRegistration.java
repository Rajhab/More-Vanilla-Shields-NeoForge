package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.morevanillashields;
import com.rajhab.morevanillashields_mod.util.ModShieldTileEntityRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;

@EventBusSubscriber(modid = morevanillashields.MOD_ID, value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ModItemClientRegistration {

    @SubscribeEvent
    static void onRegisterClientExtensions(RegisterClientExtensionsEvent event) {
        event.registerItem(new IClientItemExtensions() {
            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return ModShieldTileEntityRenderer.instance;
            }
        },
                ModItems.LEATHER_SHIELD.get(),
                ModItems.GOLD_SHIELD.get(),
                ModItems.DIAMOND_SHIELD.get(),
                ModItems.NETHERITE_SHIELD.get(),
                ModItems.EMERALD_SHIELD.get(),
                ModItems.AMETHYST_SHIELD.get(),
                ModItems.REDSTONE_SHIELD.get(),
                ModItems.OBSIDIAN_SHIELD.get(),
                ModItems.COAL_SHIELD.get(),
                ModItems.END_CRYSTAL_SHIELD.get()
        );
    }
}
