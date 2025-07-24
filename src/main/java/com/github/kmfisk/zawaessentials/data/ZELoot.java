package com.github.kmfisk.zawaessentials.data;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import net.minecraft.data.loot.packs.VanillaEntityLoot;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.stream.Stream;

public class ZELoot extends VanillaEntityLoot {
    @Override
    public void generate() {

    }

    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return ForgeRegistries.ENTITY_TYPES.getEntries().stream()
                .filter(e -> e.getKey().location().getNamespace().equals(ZawaEssentials.MOD_ID))
                .map(Map.Entry::getValue);
    }
}
