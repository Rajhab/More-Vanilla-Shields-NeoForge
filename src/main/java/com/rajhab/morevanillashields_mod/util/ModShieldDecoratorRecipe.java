package com.rajhab.morevanillashields_mod.util;

import com.rajhab.morevanillashields_mod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BannerPatternLayers;

public class ModShieldDecoratorRecipe extends CustomRecipe {

    public ModShieldDecoratorRecipe(CraftingBookCategory p_251065_) {
        super(p_251065_);
    }

    public boolean matches(CraftingContainer p_44308_, Level p_44309_) {
        ItemStack itemstack = ItemStack.EMPTY;
        ItemStack itemstack1 = ItemStack.EMPTY;

        for (int i = 0; i < p_44308_.getContainerSize(); i++) {
            ItemStack itemstack2 = p_44308_.getItem(i);
            if (!itemstack2.isEmpty()) {
                if (itemstack2.getItem() instanceof BannerItem) {
                    if (!itemstack1.isEmpty()) {
                        return false;
                    }

                    itemstack1 = itemstack2;
                } else {
                    if (
                            !(itemstack2.is(ModItems.LEATHER_SHIELD.get())) &&
                            !(itemstack2.is(ModItems.GOLD_SHIELD.get())) &&
                            !(itemstack2.is(ModItems.DIAMOND_SHIELD.get())) &&
                            !(itemstack2.is(ModItems.NETHERITE_SHIELD.get())) &&
                            !(itemstack2.is(ModItems.EMERALD_SHIELD.get())) &&
                            !(itemstack2.is(ModItems.AMETHYST_SHIELD.get())) &&
                            !(itemstack2.is(ModItems.REDSTONE_SHIELD.get())) &&
                            !(itemstack2.is(ModItems.OBSIDIAN_SHIELD.get())) &&
                            !(itemstack2.is(ModItems.COAL_SHIELD.get())) &&
                            !(itemstack2.is(ModItems.END_CRYSTAL_SHIELD.get()))
                    )    {
                        return false;
                    }

                    if (!itemstack.isEmpty()) {
                        return false;
                    }

                    BannerPatternLayers bannerpatternlayers = itemstack2.getOrDefault(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY);
                    if (!bannerpatternlayers.layers().isEmpty()) {
                        return false;
                    }

                    itemstack = itemstack2;
                }
            }
        }

        return !itemstack.isEmpty() && !itemstack1.isEmpty();
    }

    public ItemStack assemble(CraftingContainer p_44306_, HolderLookup.Provider p_335895_) {
        ItemStack itemstack = ItemStack.EMPTY;
        ItemStack itemstack1 = ItemStack.EMPTY;

        for (int i = 0; i < p_44306_.getContainerSize(); i++) {
            ItemStack itemstack2 = p_44306_.getItem(i);
            if (!itemstack2.isEmpty()) {
                if (itemstack2.getItem() instanceof BannerItem) {
                    itemstack = itemstack2;
                } else if (
                                (itemstack2.is(ModItems.LEATHER_SHIELD.get())) ||
                                (itemstack2.is(ModItems.GOLD_SHIELD.get())) ||
                                (itemstack2.is(ModItems.DIAMOND_SHIELD.get())) ||
                                (itemstack2.is(ModItems.NETHERITE_SHIELD.get())) ||
                                (itemstack2.is(ModItems.EMERALD_SHIELD.get())) ||
                                (itemstack2.is(ModItems.AMETHYST_SHIELD.get())) ||
                                (itemstack2.is(ModItems.REDSTONE_SHIELD.get())) ||
                                (itemstack2.is(ModItems.OBSIDIAN_SHIELD.get())) ||
                                (itemstack2.is(ModItems.COAL_SHIELD.get())) ||
                                (itemstack2.is(ModItems.END_CRYSTAL_SHIELD.get()))
                ) {
                    itemstack1 = itemstack2.copy();
                }
            }
        }

        if (itemstack1.isEmpty()) {
            return itemstack1;
        } else {
            itemstack1.set(DataComponents.BANNER_PATTERNS, itemstack.get(DataComponents.BANNER_PATTERNS));
            itemstack1.set(DataComponents.BASE_COLOR, ((BannerItem)itemstack.getItem()).getColor());
            return itemstack1;
        }
    }

    @Override
    public boolean canCraftInDimensions(int p_44298_, int p_44299_) {
        return p_44298_ * p_44299_ >= 2;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipeSerializer.MOD_SHIELD_DECORATION.get();
    }
}