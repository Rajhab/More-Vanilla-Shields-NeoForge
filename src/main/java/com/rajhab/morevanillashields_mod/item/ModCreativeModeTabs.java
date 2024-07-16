package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.morevanillashields;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

@EventBusSubscriber(modid = morevanillashields.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, morevanillashields.MOD_ID);

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent pOutput) {

        if(pOutput.getTabKey() == CreativeModeTabs.COMBAT) {

            pOutput.insertAfter(new ItemStack(Items.SHIELD), new ItemStack(ModItems.LEATHER_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.LEATHER_SHIELD.get()), new ItemStack(ModItems.GOLD_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.GOLD_SHIELD.get()), new ItemStack(ModItems.DIAMOND_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.DIAMOND_SHIELD.get()), new ItemStack(ModItems.NETHERITE_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.NETHERITE_SHIELD.get()), new ItemStack(ModItems.EMERALD_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.EMERALD_SHIELD.get()), new ItemStack(ModItems.AMETHYST_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.AMETHYST_SHIELD.get()), new ItemStack(ModItems.REDSTONE_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.REDSTONE_SHIELD.get()), new ItemStack(ModItems.OBSIDIAN_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.OBSIDIAN_SHIELD.get()), new ItemStack(ModItems.COAL_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.COAL_SHIELD.get()), new ItemStack(ModItems.END_CRYSTAL_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.END_CRYSTAL_SHIELD.get()), new ItemStack(ModItems.GLASS_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.GLASS_SHIELD.get()), new ItemStack(ModItems.TINTED_GLASS_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.TINTED_GLASS_SHIELD.get()), new ItemStack(ModItems.BROWN_STAINED_GLASS_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.BROWN_STAINED_GLASS_SHIELD.get()), new ItemStack(ModItems.BLUE_STAINED_GLASS_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.BLUE_STAINED_GLASS_SHIELD.get()), new ItemStack(ModItems.CYAN_STAINED_GLASS_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.CYAN_STAINED_GLASS_SHIELD.get()), new ItemStack(ModItems.LIGHT_BLUE_STAINED_GLASS_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.LIGHT_BLUE_STAINED_GLASS_SHIELD.get()), new ItemStack(ModItems.GREEN_STAINED_GLASS_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.GREEN_STAINED_GLASS_SHIELD.get()), new ItemStack(ModItems.YELLOW_STAINED_GLASS_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.YELLOW_STAINED_GLASS_SHIELD.get()), new ItemStack(ModItems.PINK_STAINED_GLASS_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.PINK_STAINED_GLASS_SHIELD.get()), new ItemStack(ModItems.ORANGE_STAINED_GLASS_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            pOutput.insertAfter(new ItemStack(ModItems.ORANGE_STAINED_GLASS_SHIELD.get()), new ItemStack(ModItems.RED_STAINED_GLASS_SHIELD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}