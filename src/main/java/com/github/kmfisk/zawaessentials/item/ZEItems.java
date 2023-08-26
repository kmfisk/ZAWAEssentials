package com.github.kmfisk.zawaessentials.item;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.entity.ZEEntities;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.item.ZawaEggItem;

public class ZEItems {
    public static final DeferredRegister<Item> REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, ZawaEssentials.MOD_ID);

    public static final RegistryObject<Item> AUSTRALIAN_RINGNECK_PARROT_EGG = REGISTRAR.register("australian_ringneck_parrot_egg", () -> new ZawaEggItem(ZEEntities.AUSTRALIAN_RINGNECK_PARROT, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> BUDGERIGAR_EGG = REGISTRAR.register("budgerigar_egg", () -> new ZawaEggItem(ZEEntities.BUDGERIGAR, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> CAIQUE_EGG = REGISTRAR.register("caique_egg", () -> new ZawaEggItem(ZEEntities.CAIQUE, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> COCKATIEL_EGG = REGISTRAR.register("cockatiel_egg", () -> new ZawaEggItem(ZEEntities.COCKATIEL, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> CONGO_GRAY_PARROT_EGG = REGISTRAR.register("congo_gray_parrot_egg", () -> new ZawaEggItem(ZEEntities.CONGO_GRAY_PARROT, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> CONURE_EGG = REGISTRAR.register("conure_egg", () -> new ZawaEggItem(ZEEntities.CONURE, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> ECLECTUS_EGG = REGISTRAR.register("eclectus_egg", () -> new ZawaEggItem(ZEEntities.ECLECTUS, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> GREATER_PRAIRIE_CHICKEN_EGG = REGISTRAR.register("greater_prairie_chicken_egg", () -> new ZawaEggItem(ZEEntities.GREATER_PRAIRIE_CHICKEN, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> GREEN_CHEEK_CONURE_EGG = REGISTRAR.register("green_cheek_conure_egg", () -> new ZawaEggItem(ZEEntities.GREEN_CHEEK_CONURE, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> HAWK_HEADED_PARROT_EGG = REGISTRAR.register("hawk_headed_parrot_egg", () -> new ZawaEggItem(ZEEntities.HAWK_HEADED_PARROT, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> KAKARIKI_EGG = REGISTRAR.register("kakariki_egg", () -> new ZawaEggItem(ZEEntities.KAKARIKI, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> KEA_EGG = REGISTRAR.register("kea_egg", () -> new ZawaEggItem(ZEEntities.KEA, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> MOHO_EGG = REGISTRAR.register("moho_egg", () -> new ZawaEggItem(ZEEntities.MOHO, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> POICEPHALUS_PARROT_EGG = REGISTRAR.register("poicephalus_parrot_egg", () -> new ZawaEggItem(ZEEntities.POICEPHALUS_PARROT, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> QUAKER_PARAKEET_EGG = REGISTRAR.register("quaker_parakeet_egg", () -> new ZawaEggItem(ZEEntities.QUAKER_PARAKEET, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> RINGNECK_PARROT_EGG = REGISTRAR.register("ringneck_parrot_egg", () -> new ZawaEggItem(ZEEntities.RINGNECK_PARROT, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
    public static final RegistryObject<Item> ROSELLA_EGG = REGISTRAR.register("rosella_egg", () -> new ZawaEggItem(ZEEntities.ROSELLA, new Item.Properties().stacksTo(16).tab(Zawa.ITEMS_GROUP)));
}
