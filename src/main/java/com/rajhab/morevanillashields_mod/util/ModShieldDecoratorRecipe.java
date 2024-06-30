package com.rajhab.morevanillashields_mod.util;

import com.rajhab.morevanillashields_mod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BannerPatternLayers;

public class ModShieldDecoratorRecipe extends CustomRecipe {

    public ModShieldDecoratorRecipe(CraftingBookCategory pCategory) {
        super(pCategory);
    }

    public boolean matches(CraftingInput p_344969_, Level p_44309_) {
        ItemStack itemstack = ItemStack.EMPTY;
        ItemStack itemstack1 = ItemStack.EMPTY;

        for (int i = 0; i < p_344969_.size(); i++) {
            ItemStack itemstack2 = p_344969_.getItem(i);
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
                                    !(itemstack2.is(ModItems.OBSIDIAN_SHIELD.get())) &&
                                    !(itemstack2.is(ModItems.COAL_SHIELD.get())) &&
                                    !(itemstack2.is(ModItems.END_CRYSTAL_SHIELD.get()))
                    ) {
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

    public ItemStack assemble(CraftingInput p_345351_, HolderLookup.Provider p_335895_) {
        ItemStack itemstack = ItemStack.EMPTY;
        ItemStack itemstack1 = ItemStack.EMPTY;

        for (int i = 0; i < p_345351_.size(); i++) {
            ItemStack itemstack2 = p_345351_.getItem(i);
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

    /**
     * Used to determine if this recipe can fit in a grid of the given width/height
     */
    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return pWidth * pHeight >= 2;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipeSerializer.MOD_SHIELD_DECORATION.get();
    }
}