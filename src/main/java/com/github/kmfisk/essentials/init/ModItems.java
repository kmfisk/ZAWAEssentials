package com.github.kmfisk.essentials.init;

import com.github.kmfisk.essentials.items.ItemSpawnEggEssentials;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item AMAZON_PARROT_SPAWN_EGG = new ItemSpawnEggEssentials("amazon_parrot");
    public static final Item BUDGERIGAR_SPAWN_EGG = new ItemSpawnEggEssentials("budgerigar");
    public static final Item CAIQUE_SPAWN_EGG = new ItemSpawnEggEssentials("caique");
    public static final Item CHINCHILLA_SPAWN_EGG = new ItemSpawnEggEssentials("chinchilla");
    public static final Item COCKATIEL_SPAWN_EGG = new ItemSpawnEggEssentials("cockatiel");
    public static final Item CONGO_GRAY_PARROT_SPAWN_EGG = new ItemSpawnEggEssentials("congo_gray_parrot");
    public static final Item CONURE_SPAWN_EGG = new ItemSpawnEggEssentials("conure");
    public static final Item ECLECTUS_PARROT_SPAWN_EGG = new ItemSpawnEggEssentials("eclectus_parrot");
    public static final Item GREEN_CHEEK_CONURE_SPAWN_EGG = new ItemSpawnEggEssentials("green_cheek_conure");
    public static final Item HAWAII_OO_SPAWN_EGG = new ItemSpawnEggEssentials("hawaii_oo");
    public static final Item HAWK_HEADED_PARROT_SPAWN_EGG = new ItemSpawnEggEssentials("hawk_headed_parrot");
    public static final Item KAKAPO_SPAWN_EGG = new ItemSpawnEggEssentials("kakapo");
    public static final Item KAKARIKI_SPAWN_EGG = new ItemSpawnEggEssentials("kakariki");
    public static final Item KEA_SPAWN_EGG = new ItemSpawnEggEssentials("kea");
    public static final Item MANED_WOLF_SPAWN_EGG = new ItemSpawnEggEssentials("maned_wolf");
    public static final Item POICEPHALUS_SPAWN_EGG = new ItemSpawnEggEssentials("poicephalus");
    public static final Item RINGNECK_PARROT_SPAWN_EGG = new ItemSpawnEggEssentials("ringneck_parrot");
    public static final Item ROSELLA_SPAWN_EGG = new ItemSpawnEggEssentials("rosella");

    public static void register() {
//        OreDictionary.registerOre("", ITEM);
    }
}
