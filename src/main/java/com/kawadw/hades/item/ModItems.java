package com.kawadw.hades.item;

import com.kawadw.hades.Hades;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Hades.MOD_ID);

    public static final RegistryObject<Item> RAINBOW_INGOT = ITEMS.register("rainbow_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> COTTON = ITEMS.register("cotton",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> AMISKWIA_DNA = ITEMS.register("amiskwia_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> AMISKWIA_EMBRYO = ITEMS.register("amiskwia_embryo",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> AMISKWIA_EGG = ITEMS.register("amiskwia_egg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> THELODUS_DNA = ITEMS.register("thelodus_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> THELODUS_EMBRYO = ITEMS.register("thelodus_embryo",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> THELODUS_EGG = ITEMS.register("thelodus_egg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> EPIDEXIPTERYX_DNA = ITEMS.register("epidexipteryx_dna",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> EPIDEXIPTERYX_EMBRYO = ITEMS.register("epidexipteryx_embryo",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> EPIDEXIPTERYX_EGG = ITEMS.register("epidexipteryx_egg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> FRIED_EGG = ITEMS.register("fried_egg",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).food(ModFoods.FRIED_EGG)));

    public static final RegistryObject<Item> CARROT_CAKE = ITEMS.register("carrot_cake",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB).food(ModFoods.CARROT_CAKE)));

    public static final RegistryObject<Item> REDSTONE_SWORD = ITEMS.register("redstone_sword",
            () -> new SwordItem(ModTiers.REDSTONE,3,3, new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe",
            () -> new PickaxeItem(ModTiers.REDSTONE,1,3, new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> REDSTONE_AXE = ITEMS.register("redstone_axe",
            () -> new AxeItem(ModTiers.REDSTONE,2,2, new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel",
            () -> new ShovelItem(ModTiers.REDSTONE,1,3, new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> REDSTONE_HOE = ITEMS.register("redstone_hoe",
            () -> new HoeItem(ModTiers.REDSTONE,0,4, new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> BEY_LAUNCHER = ITEMS.register("bey_launcher",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> BURN_FIREBLAZE = ITEMS.register("burn_fireblaze",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> KRIES_CYGNUS = ITEMS.register("kries_cygnus",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

    public static final RegistryObject<Item> DARK_CANCER = ITEMS.register("dark_cancer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HADES_TAB)));

public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}

}
