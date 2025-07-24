package com.github.kmfisk.zawaessentials.data;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.entity.ZEEntities;
import net.minecraft.data.loot.packs.VanillaEntityLoot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.LootingEnchantFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.functions.SmeltItemFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.world.item.ZawaItems;

import java.util.Map;
import java.util.stream.Stream;

public class ZEEntityLoot extends VanillaEntityLoot {
    @Override
    public void generate() {
        add(ZEEntities.AUSTRALIAN_RINGNECK_PARROT.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(ZEEntities.BUDGERIGAR.get(), LootTable.lootTable());
        add(ZEEntities.CAIQUE.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(ZEEntities.CHINCHILLA.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(ZEEntities.COCKATIEL.get(), LootTable.lootTable());
        add(ZEEntities.CONGO_GRAY_PARROT.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(ZEEntities.CONURE.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(ZEEntities.ECLECTUS.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(ZEEntities.GREATER_PRAIRIE_CHICKEN.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(ZEEntities.GREEN_CHEEK_CONURE.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(ZEEntities.HAWK_HEADED_PARROT.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(ZEEntities.KAKARIKI.get(), LootTable.lootTable());
        add(ZEEntities.KEA.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(ZEEntities.MANED_WOLF.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(ZEEntities.MOHO.get(), LootTable.lootTable());
        add(ZEEntities.POICEPHALUS_PARROT.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(ZEEntities.QUAKER_PARAKEET.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(ZEEntities.RINGNECK_PARROT.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
        add(ZEEntities.ROSELLA.get(), createCookedItemTable(ZawaItems.SMALL_MEAT.get(), 1));
    }

    public static LootTable.Builder createCookedItemTable(ItemLike item, int maxCount) {
        return LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(item)
                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, maxCount)))
                .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))
                .apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0.0F, 1.0F)))));
    }

    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return ForgeRegistries.ENTITY_TYPES.getEntries().stream()
                .filter(e -> e.getKey().location().getNamespace().equals(ZawaEssentials.MOD_ID))
                .map(Map.Entry::getValue);
    }
}
