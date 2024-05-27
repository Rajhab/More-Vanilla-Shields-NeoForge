package com.rajhab.morevanillashields_mod.item;

import com.rajhab.morevanillashields_mod.ShieldConfig;
import com.rajhab.morevanillashields_mod.morevanillashields;
import com.rajhab.morevanillashields_mod.util.ModShieldTileEntityRenderer;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

public class ModItems{

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(morevanillashields.MOD_ID);

    //Shield
    public static final DeferredItem<Item> LEATHER_SHIELD = ITEMS.register("leather_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(196)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.LEATHER_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if(ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.leather_shield").append(String.valueOf(ShieldConfig.LEATHER_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });



    public static final DeferredItem<Item> GOLD_SHIELD = ITEMS.register("gold_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(322)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.GOLD_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.gold_shield").append(String.valueOf(ShieldConfig.GOLD_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final DeferredItem<Item> DIAMOND_SHIELD = ITEMS.register("diamond_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(512)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.DIAMOND_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.diamond_shield").append(String.valueOf(ShieldConfig.DIAMOND_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final DeferredItem<Item> GLASS_SHIELD = ITEMS.register("glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.glass_shield").append(String.valueOf(ShieldConfig.GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final DeferredItem<Item> TINTED_GLASS_SHIELD = ITEMS.register("tinted_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.TINTED_GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.tinted_glass_shield").append(String.valueOf(ShieldConfig.TINTED_GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final DeferredItem<Item> BROWN_STAINED_GLASS_SHIELD = ITEMS.register("brown_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.BROWN_STAINED_GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.brown_stained_glass_shield").append(String.valueOf(ShieldConfig.BROWN_STAINED_GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final DeferredItem<Item> BLUE_STAINED_GLASS_SHIELD = ITEMS.register("blue_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.BLUE_STAINED_GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.blue_stained_glass_shield").append(String.valueOf(ShieldConfig.BLUE_STAINED_GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final DeferredItem<Item> CYAN_STAINED_GLASS_SHIELD = ITEMS.register("cyan_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.CYAN_STAINED_GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.cyan_stained_glass_shield").append(String.valueOf(ShieldConfig.CYAN_STAINED_GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final DeferredItem<Item> LIGHT_BLUE_STAINED_GLASS_SHIELD = ITEMS.register("light_blue_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.LIGHT_BLUE_STAINED_GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.light_blue_stained_glass_shield").append(String.valueOf(ShieldConfig.LIGHT_BLUE_STAINED_GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final DeferredItem<Item> GREEN_STAINED_GLASS_SHIELD = ITEMS.register("green_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.GREEN_STAINED_GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.green_stained_glass_shield").append(String.valueOf(ShieldConfig.GREEN_STAINED_GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final DeferredItem<Item> LIME_STAINED_GLASS_SHIELD = ITEMS.register("lime_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.LIME_STAINED_GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.lime_stained_glass_shield").append(String.valueOf(ShieldConfig.LIME_STAINED_GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final DeferredItem<Item> YELLOW_STAINED_GLASS_SHIELD = ITEMS.register("yellow_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.YELLOW_STAINED_GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.yellow_stained_glass_shield").append(String.valueOf(ShieldConfig.YELLOW_STAINED_GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final DeferredItem<Item> PINK_STAINED_GLASS_SHIELD = ITEMS.register("pink_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.PINK_STAINED_GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.pink_stained_glass_shield").append(String.valueOf(ShieldConfig.PINK_STAINED_GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final DeferredItem<Item> ORANGE_STAINED_GLASS_SHIELD = ITEMS.register("orange_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.ORANGE_STAINED_GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.orange_stained_glass_shield").append(String.valueOf(ShieldConfig.ORANGE_STAINED_GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final DeferredItem<Item> RED_STAINED_GLASS_SHIELD = ITEMS.register("red_stained_glass_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(300)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.RED_STAINED_GLASS_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.red_stained_glass_shield").append(String.valueOf(ShieldConfig.RED_STAINED_GLASS_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }
            });

    public static final DeferredItem<Item> NETHERITE_SHIELD = ITEMS.register("netherite_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(2042)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.NETHERITE_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.netherite_shield").append(String.valueOf(ShieldConfig.NETHERITE_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public boolean isFireResistant() {
                    return true;
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final DeferredItem<Item> EMERALD_SHIELD = ITEMS.register("emerald_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(512)){



                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.EMERALD_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.emerald_shield").append(String.valueOf(ShieldConfig.EMERALD_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final DeferredItem<Item> AMETHYST_SHIELD = ITEMS.register("amethyst_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(432)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.AMETHYST_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.amethyst_shield").append(String.valueOf(ShieldConfig.AMETHYST_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final DeferredItem<Item> OBSIDIAN_SHIELD = ITEMS.register("obsidian_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(610)){

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.OBSIDIAN_SHIELD_DURABILITY.get();
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.obsidian_shield").append(String.valueOf(ShieldConfig.OBSIDIAN_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final DeferredItem<Item> COAL_SHIELD = ITEMS.register("coal_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(268)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.COAL_SHIELD_DURABILITY.get();
                }

                @Override
                public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                    return 2400;
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.coal_shield").append(String.valueOf(ShieldConfig.COAL_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }
            });

    public static final DeferredItem<Item> END_CRYSTAL_SHIELD = ITEMS.register("end_crystal_shield",
            () -> new ShieldItem(new Item.Properties().defaultDurability(750)) {

                @Override
                public int getMaxDamage(ItemStack stack) {
                    return ShieldConfig.END_CRYSTAL_SHIELD_DURABILITY.get();
                }

                @Override
                public boolean isFoil(ItemStack stack) {
                    return true;
                }

                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

                    if (ShieldConfig.ENABLE_TOOLTIPS.get()) {
                        if (Screen.hasShiftDown()) {
                            components.add(Component.translatable("item.moditems.end_crystal_shield").append(String.valueOf(ShieldConfig.END_CRYSTAL_SHIELD_DURABILITY.get())).withStyle(ChatFormatting.DARK_AQUA));
                        } else {
                            components.add(Component.translatable("item.moditems.shift").withStyle(ChatFormatting.LIGHT_PURPLE));
                        }

                        super.appendHoverText(stack, level, components, flag);
                    }
                }

                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return ModShieldTileEntityRenderer.instance;
                        }
                    });
                }

            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
