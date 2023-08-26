package com.github.kmfisk.zawaessentials.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.render.entity.*;
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
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;

public class ZEEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRAR = DeferredRegister.create(ForgeRegistries.ENTITIES, ZawaEssentials.MOD_ID);

    // todo: hitboxes, scaling, shadows, stats

    public static final RegistryObject<EntityType<AustralianRingneckParrotEntity>> AUSTRALIAN_RINGNECK_PARROT =
            new Builder<>(AustralianRingneckParrotEntity::new, EntityClassification.CREATURE)
                    .attributes(AustralianRingneckParrotEntity::registerAttributes)
                    .renderer(() -> AustralianRingneckParrotRenderer::new)
                    .spawns(2, 1, 2, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.DRY_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "australian_ringneck_parrot");

    public static final RegistryObject<EntityType<BudgerigarEntity>> BUDGERIGAR =
            new Builder<>(BudgerigarEntity::new, EntityClassification.CREATURE)
                    .attributes(BudgerigarEntity::registerAttributes)
                    .renderer(() -> BudgerigarRenderer::new)
                    .spawn(ZawaSpawnCategory.DRY_GRASSLAND, 10, 3, 4)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "budgerigar");

    public static final RegistryObject<EntityType<CaiqueEntity>> CAIQUE =
            new Builder<>(CaiqueEntity::new, EntityClassification.CREATURE)
                    .attributes(CaiqueEntity::registerAttributes)
                    .renderer(() -> CaiqueRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 8, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "caique");

    public static final RegistryObject<EntityType<ChinchillaEntity>> CHINCHILLA =
            new Builder<>(ChinchillaEntity::new, EntityClassification.CREATURE)
                    .attributes(ChinchillaEntity::registerAttributes)
                    .renderer(() -> ChinchillaRenderer::new)
                    .spawn(ZawaSpawnCategory.TUNDRA_ALPINE, 5, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "chinchilla");

    public static final RegistryObject<EntityType<CockatielEntity>> COCKATIEL =
            new Builder<>(CockatielEntity::new, EntityClassification.CREATURE)
                    .attributes(CockatielEntity::registerAttributes)
                    .renderer(() -> CockatielRenderer::new)
                    .spawn(ZawaSpawnCategory.DRY_FOREST, 8, 2, 3)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "cockatiel");

    public static final RegistryObject<EntityType<CongoGrayParrotEntity>> CONGO_GRAY_PARROT =
            new Builder<>(CongoGrayParrotEntity::new, EntityClassification.CREATURE)
                    .attributes(CongoGrayParrotEntity::registerAttributes)
                    .renderer(() -> CongoGrayParrotRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "congo_gray_parrot");

    public static final RegistryObject<EntityType<ConureEntity>> CONURE =
            new Builder<>(ConureEntity::new, EntityClassification.CREATURE)
                    .attributes(ConureEntity::registerAttributes)
                    .renderer(() -> ConureRenderer::new)
                    .spawnVariant(ConureEntity.VARIANT_SPAWNS, 8, 2, 3)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "conure");

    public static final RegistryObject<EntityType<EclectusEntity>> ECLECTUS =
            new Builder<>(EclectusEntity::new, EntityClassification.CREATURE)
                    .attributes(EclectusEntity::registerAttributes)
                    .renderer(() -> EclectusRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "eclectus");

    public static final RegistryObject<EntityType<GreaterPrairieChickenEntity>> GREATER_PRAIRIE_CHICKEN =
            new Builder<>(GreaterPrairieChickenEntity::new, EntityClassification.CREATURE)
                    .attributes(GreaterPrairieChickenEntity::registerAttributes)
                    .renderer(() -> GreaterPrairieChickenRenderer::new)
                    .spawn(ZawaSpawnCategory.DRY_GRASSLAND, 8, 3, 4)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "greater_prairie_chicken");

    public static final RegistryObject<EntityType<GreenCheekConureEntity>> GREEN_CHEEK_CONURE =
            new Builder<>(GreenCheekConureEntity::new, EntityClassification.CREATURE)
                    .attributes(GreenCheekConureEntity::registerAttributes)
                    .renderer(() -> GreenCheekConureRenderer::new)
                    .spawnVariant(GreenCheekConureEntity.VARIANT_SPAWNS, 8, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "green_cheek_conure");

    public static final RegistryObject<EntityType<HawkHeadedParrotEntity>> HAWK_HEADED_PARROT =
            new Builder<>(HawkHeadedParrotEntity::new, EntityClassification.CREATURE)
                    .attributes(HawkHeadedParrotEntity::registerAttributes)
                    .renderer(() -> HawkHeadedParrotRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 0, 1)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "hawk_headed_parrot");

    public static final RegistryObject<EntityType<KakarikiEntity>> KAKARIKI =
            new Builder<>(KakarikiEntity::new, EntityClassification.CREATURE)
                    .attributes(KakarikiEntity::registerAttributes)
                    .renderer(() -> KakarikiRenderer::new)
                    .spawnVariant(KakarikiEntity.VARIANT_SPAWNS, 8, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "kakariki");

    public static final RegistryObject<EntityType<KeaEntity>> KEA =
            new Builder<>(KeaEntity::new, EntityClassification.CREATURE)
                    .attributes(KeaEntity::registerAttributes)
                    .renderer(() -> KeaRenderer::new)
                    .spawn(ZawaSpawnCategory.TUNDRA_ALPINE, 2, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "kea");

    public static final RegistryObject<EntityType<ManedWolfEntity>> MANED_WOLF =
            new Builder<>(ManedWolfEntity::new, EntityClassification.CREATURE)
                    .attributes(ManedWolfEntity::registerAttributes)
                    .renderer(() -> ManedWolfRenderer::new)
                    .spawn(ZawaSpawnCategory.DRY_GRASSLAND, 2, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "maned_wolf");

    public static final RegistryObject<EntityType<MohoEntity>> MOHO =
            new Builder<>(MohoEntity::new, EntityClassification.CREATURE)
                    .attributes(MohoEntity::registerAttributes)
                    .renderer(() -> MohoRenderer::new)
                    .spawnVariant(MohoEntity.VARIANT_SPAWNS, 5, 0, 1)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "moho");

    public static final RegistryObject<EntityType<PoicephalusParrotEntity>> POICEPHALUS_PARROT =
            new Builder<>(PoicephalusParrotEntity::new, EntityClassification.CREATURE)
                    .attributes(PoicephalusParrotEntity::registerAttributes)
                    .renderer(() -> PoicephalusParrotRenderer::new)
                    .spawnVariant(PoicephalusParrotEntity.VARIANT_SPAWNS, 8, 2, 3)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "poicephalus_parrot");

    public static final RegistryObject<EntityType<QuakerParakeetEntity>> QUAKER_PARAKEET =
            new Builder<>(QuakerParakeetEntity::new, EntityClassification.CREATURE)
                    .attributes(QuakerParakeetEntity::registerAttributes)
                    .renderer(() -> QuakerParakeetRenderer::new)
                    .spawn(ZawaSpawnCategory.DRY_RAINFOREST, 10, 2, 4)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "quaker_parakeet");

    public static final RegistryObject<EntityType<RingneckParrotEntity>> RINGNECK_PARROT =
            new Builder<>(RingneckParrotEntity::new, EntityClassification.CREATURE)
                    .attributes(RingneckParrotEntity::registerAttributes)
                    .renderer(() -> RingneckParrotRenderer::new)
                    .spawnVariant(RingneckParrotEntity.VARIANT_SPAWNS, 10, 3, 4)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "ringneck_parrot");

    public static final RegistryObject<EntityType<RosellaEntity>> ROSELLA =
            new Builder<>(RosellaEntity::new, EntityClassification.CREATURE)
                    .attributes(RosellaEntity::registerAttributes)
                    .renderer(() -> RosellaRenderer::new)
                    .spawnVariant(RosellaEntity.VARIANT_SPAWNS, 8, 2, 3)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "rosella");

    public static void registerSpawnPlacements() {
        EntitySpawnPlacementRegistry.register(AUSTRALIAN_RINGNECK_PARROT.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(BUDGERIGAR.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(CAIQUE.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(CHINCHILLA.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(COCKATIEL.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(CONGO_GRAY_PARROT.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(CONURE.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(ECLECTUS.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(GREATER_PRAIRIE_CHICKEN.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(GREEN_CHEEK_CONURE.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(HAWK_HEADED_PARROT.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(KAKARIKI.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(KEA.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(MANED_WOLF.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        EntitySpawnPlacementRegistry.register(MOHO.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(POICEPHALUS_PARROT.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(QUAKER_PARAKEET.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(RINGNECK_PARROT.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        EntitySpawnPlacementRegistry.register(ROSELLA.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
    }

    public static class Builder<T extends Entity> extends ZawaEntities.Builder<T> {
        public Builder(EntityType.IFactory<T> factory, EntityClassification category) {
            super(factory, category);
            setupMod(ZawaEssentials.MOD_ID, ZEItems.REGISTRAR, Zawa.ENTITIES_GROUP);
        }
    }
}
