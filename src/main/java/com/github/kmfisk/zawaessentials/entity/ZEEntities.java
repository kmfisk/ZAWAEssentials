package com.github.kmfisk.zawaessentials.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.item.ZEItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.entity.animal.ZawaEntities;

public class ZEEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRAR = DeferredRegister.create(ForgeRegistries.ENTITIES, ZawaEssentials.MOD_ID);

    public static void registerSpawnPlacements() {
    }

    public static class Builder<T extends Entity> extends ZawaEntities.Builder<T> {
        public Builder(EntityType.IFactory<T> factory, EntityClassification category) {
            super(factory, category);
            setupMod(ZawaEssentials.MOD_ID, ZEItems.REGISTRAR, Zawa.ENTITIES_GROUP);
        }
    }
}
