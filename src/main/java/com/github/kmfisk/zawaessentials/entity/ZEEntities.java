package com.github.kmfisk.zawaessentials.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.render.entity.HawkHeadedParrotRenderer;
import com.github.kmfisk.zawaessentials.item.ZEItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;
import org.zawamod.zawa.world.entity.animal.ZawaEntities;

public class ZEEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRAR = DeferredRegister.create(ForgeRegistries.ENTITIES, ZawaEssentials.MOD_ID);

    public static final RegistryObject<EntityType<HawkHeadedParrotEntity>> HAWK_HEADED_PARROT =
            new Builder<>(HawkHeadedParrotEntity::new, EntityClassification.CREATURE)
                    .attributes(HawkHeadedParrotEntity::registerAttributes)
                    .renderer(() -> HawkHeadedParrotRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "hawk_headed_parrot"); //todo: baby, hitbox, scale

    public static void registerSpawnPlacements() {
        EntitySpawnPlacementRegistry.register(HAWK_HEADED_PARROT.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
    }

    public static class Builder<T extends Entity> extends ZawaEntities.Builder<T> {
        public Builder(EntityType.IFactory<T> factory, EntityClassification category) {
            super(factory, category);
            setupMod(ZawaEssentials.MOD_ID, ZEItems.REGISTRAR, Zawa.ENTITIES_GROUP);
        }
    }
}
