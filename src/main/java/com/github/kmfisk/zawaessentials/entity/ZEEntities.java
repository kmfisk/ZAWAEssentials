package com.github.kmfisk.zawaessentials.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.render.entity.*;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.registries.RegistryObject;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.ZawaEntityRegistry;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class ZEEntities {
    public static final ZawaEntityRegistry REGISTRY = new ZawaEntityRegistry(ZawaEssentials.MOD_ID);

    public static final RegistryObject<EntityType<AustralianRingneckParrotEntity>> AUSTRALIAN_RINGNECK_PARROT =
            REGISTRY.builder(AustralianRingneckParrotEntity::new, MobCategory.CREATURE)
                    .attributes(AustralianRingneckParrotEntity::registerAttributes)
                    .spawns(2, 1, 2, ZawaSpawnCategory.DRY_RAINFOREST, ZawaSpawnCategory.DRY_GRASSLAND)
                    .data(entityBuilder -> entityBuilder.sized(0.7F, 0.7F).clientTrackingRange(10))
                    .build("australian_ringneck_parrot");

    public static final RegistryObject<EntityType<BudgerigarEntity>> BUDGERIGAR =
            REGISTRY.builder(BudgerigarEntity::new, MobCategory.CREATURE)
                    .attributes(BudgerigarEntity::registerAttributes)
                    .spawn(ZawaSpawnCategory.DRY_GRASSLAND, 10, 3, 4)
                    .data(entityBuilder -> entityBuilder.sized(0.3F, 0.3F).clientTrackingRange(10))
                    .build("budgerigar");

    public static final RegistryObject<EntityType<CaiqueEntity>> CAIQUE =
            REGISTRY.builder(CaiqueEntity::new, MobCategory.CREATURE)
                    .attributes(CaiqueEntity::registerAttributes)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 8, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(0.7F, 0.7F).clientTrackingRange(10))
                    .build("caique");

    public static final RegistryObject<EntityType<ChinchillaEntity>> CHINCHILLA =
            REGISTRY.builder(ChinchillaEntity::new, MobCategory.CREATURE)
                    .attributes(ChinchillaEntity::registerAttributes)
                    .spawn(ZawaSpawnCategory.TUNDRA_ALPINE, 5, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
                    .build("chinchilla");

    public static final RegistryObject<EntityType<CockatielEntity>> COCKATIEL =
            REGISTRY.builder(CockatielEntity::new, MobCategory.CREATURE)
                    .attributes(CockatielEntity::registerAttributes)
                    .spawn(ZawaSpawnCategory.DRY_FOREST, 8, 2, 3)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
                    .build("cockatiel");

    public static final RegistryObject<EntityType<CongoGrayParrotEntity>> CONGO_GRAY_PARROT =
            REGISTRY.builder(CongoGrayParrotEntity::new, MobCategory.CREATURE)
                    .attributes(CongoGrayParrotEntity::registerAttributes)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(0.7F, 0.7F).clientTrackingRange(10))
                    .build("congo_gray_parrot");

    public static final RegistryObject<EntityType<ConureEntity>> CONURE =
            REGISTRY.builder(ConureEntity::new, MobCategory.CREATURE)
                    .attributes(ConureEntity::registerAttributes)
                    .spawnVariant(ConureEntity.VARIANT_SPAWNS, 8, 2, 3)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
                    .build("conure");

    public static final RegistryObject<EntityType<EclectusEntity>> ECLECTUS =
            REGISTRY.builder(EclectusEntity::new, MobCategory.CREATURE)
                    .attributes(EclectusEntity::registerAttributes)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(0.7F, 0.7F).clientTrackingRange(10))
                    .build("eclectus");

    public static final RegistryObject<EntityType<GreaterPrairieChickenEntity>> GREATER_PRAIRIE_CHICKEN =
            REGISTRY.builder(GreaterPrairieChickenEntity::new, MobCategory.CREATURE)
                    .attributes(GreaterPrairieChickenEntity::registerAttributes)
                    .spawn(ZawaSpawnCategory.DRY_GRASSLAND, 8, 3, 4)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
                    .build("greater_prairie_chicken");

    public static final RegistryObject<EntityType<GreenCheekConureEntity>> GREEN_CHEEK_CONURE =
            REGISTRY.builder(GreenCheekConureEntity::new, MobCategory.CREATURE)
                    .attributes(GreenCheekConureEntity::registerAttributes)
                    .spawnVariant(GreenCheekConureEntity.VARIANT_SPAWNS, 8, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
                    .build("green_cheek_conure");

    public static final RegistryObject<EntityType<HawkHeadedParrotEntity>> HAWK_HEADED_PARROT =
            REGISTRY.builder(HawkHeadedParrotEntity::new, MobCategory.CREATURE)
                    .attributes(HawkHeadedParrotEntity::registerAttributes)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 0, 1)
                    .data(entityBuilder -> entityBuilder.sized(0.7F, 0.7F).clientTrackingRange(10))
                    .build("hawk_headed_parrot");

    public static final RegistryObject<EntityType<KakarikiEntity>> KAKARIKI =
            REGISTRY.builder(KakarikiEntity::new, MobCategory.CREATURE)
                    .attributes(KakarikiEntity::registerAttributes)
                    .spawnVariant(KakarikiEntity.VARIANT_SPAWNS, 8, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
                    .build("kakariki");

    public static final RegistryObject<EntityType<KeaEntity>> KEA =
            REGISTRY.builder(KeaEntity::new, MobCategory.CREATURE)
                    .attributes(KeaEntity::registerAttributes)
                    .spawn(ZawaSpawnCategory.TUNDRA_ALPINE, 2, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(0.8F, 0.8F).clientTrackingRange(10))
                    .build("kea");

    public static final RegistryObject<EntityType<ManedWolfEntity>> MANED_WOLF =
            REGISTRY.builder(ManedWolfEntity::new, MobCategory.CREATURE)
                    .attributes(ManedWolfEntity::registerAttributes)
                    .spawn(ZawaSpawnCategory.DRY_GRASSLAND, 2, 1, 1)
                    .data(entityBuilder -> entityBuilder.sized(0.9F, 1.3F).clientTrackingRange(10))
                    .build("maned_wolf");

    public static final RegistryObject<EntityType<MohoEntity>> MOHO =
            REGISTRY.builder(MohoEntity::new, MobCategory.CREATURE)
                    .attributes(MohoEntity::registerAttributes)
                    .spawnVariant(MohoEntity.VARIANT_SPAWNS, 5, 0, 1)
                    .data(entityBuilder -> entityBuilder.sized(0.5F, 0.5F).clientTrackingRange(10))
                    .build("moho");

    public static final RegistryObject<EntityType<PoicephalusParrotEntity>> POICEPHALUS_PARROT =
            REGISTRY.builder(PoicephalusParrotEntity::new, MobCategory.CREATURE)
                    .attributes(PoicephalusParrotEntity::registerAttributes)
                    .spawnVariant(PoicephalusParrotEntity.VARIANT_SPAWNS, 8, 2, 3)
                    .data(entityBuilder -> entityBuilder.sized(0.6F, 0.6F).clientTrackingRange(10))
                    .build("poicephalus_parrot");

    public static final RegistryObject<EntityType<QuakerParakeetEntity>> QUAKER_PARAKEET =
            REGISTRY.builder(QuakerParakeetEntity::new, MobCategory.CREATURE)
                    .attributes(QuakerParakeetEntity::registerAttributes)
                    .spawn(ZawaSpawnCategory.DRY_RAINFOREST, 10, 2, 4)
                    .data(entityBuilder -> entityBuilder.sized(0.7F, 0.7F).clientTrackingRange(10))
                    .build("quaker_parakeet");

    public static final RegistryObject<EntityType<RingneckParrotEntity>> RINGNECK_PARROT =
            REGISTRY.builder(RingneckParrotEntity::new, MobCategory.CREATURE)
                    .attributes(RingneckParrotEntity::registerAttributes)
                    .spawnVariant(RingneckParrotEntity.VARIANT_SPAWNS, 10, 3, 4)
                    .data(entityBuilder -> entityBuilder.sized(0.8F, 0.8F).clientTrackingRange(10))
                    .build("ringneck_parrot");

    public static final RegistryObject<EntityType<RosellaEntity>> ROSELLA =
            REGISTRY.builder(RosellaEntity::new, MobCategory.CREATURE)
                    .attributes(RosellaEntity::registerAttributes)
                    .spawnVariant(RosellaEntity.VARIANT_SPAWNS, 8, 2, 3)
                    .data(entityBuilder -> entityBuilder.sized(0.8F, 0.8F).clientTrackingRange(10))
                    .build("rosella");

    public static void registerSpawnPlacements() {
        SpawnPlacements.register(AUSTRALIAN_RINGNECK_PARROT.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(BUDGERIGAR.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(CAIQUE.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(CHINCHILLA.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(COCKATIEL.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(CONGO_GRAY_PARROT.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(CONURE.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(ECLECTUS.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(GREATER_PRAIRIE_CHICKEN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(GREEN_CHEEK_CONURE.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(HAWK_HEADED_PARROT.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(KAKARIKI.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(KEA.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(MANED_WOLF.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, ZawaBaseEntity::checkLandSpawnRules);
        SpawnPlacements.register(MOHO.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(POICEPHALUS_PARROT.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(QUAKER_PARAKEET.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(RINGNECK_PARROT.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
        SpawnPlacements.register(ROSELLA.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING, ZawaBaseEntity::checkFlyingSpawnRules);
    }

    public static void registerRenderers() {
        EntityRenderers.register(AUSTRALIAN_RINGNECK_PARROT.get(), AustralianRingneckParrotRenderer::new);
        EntityRenderers.register(BUDGERIGAR.get(), BudgerigarRenderer::new);
        EntityRenderers.register(CAIQUE.get(), CaiqueRenderer::new);
        EntityRenderers.register(CHINCHILLA.get(), ChinchillaRenderer::new);
        EntityRenderers.register(COCKATIEL.get(), CockatielRenderer::new);
        EntityRenderers.register(CONGO_GRAY_PARROT.get(), CongoGrayParrotRenderer::new);
        EntityRenderers.register(CONURE.get(), ConureRenderer::new);
        EntityRenderers.register(ECLECTUS.get(), EclectusRenderer::new);
        EntityRenderers.register(GREATER_PRAIRIE_CHICKEN.get(), GreaterPrairieChickenRenderer::new);
        EntityRenderers.register(GREEN_CHEEK_CONURE.get(), GreenCheekConureRenderer::new);
        EntityRenderers.register(HAWK_HEADED_PARROT.get(), HawkHeadedParrotRenderer::new);
        EntityRenderers.register(KAKARIKI.get(), KakarikiRenderer::new);
        EntityRenderers.register(KEA.get(), KeaRenderer::new);
        EntityRenderers.register(MANED_WOLF.get(), ManedWolfRenderer::new);
        EntityRenderers.register(MOHO.get(), MohoRenderer::new);
        EntityRenderers.register(POICEPHALUS_PARROT.get(), PoicephalusParrotRenderer::new);
        EntityRenderers.register(QUAKER_PARAKEET.get(), QuakerParakeetRenderer::new);
        EntityRenderers.register(RINGNECK_PARROT.get(), RingneckParrotRenderer::new);
        EntityRenderers.register(ROSELLA.get(), RosellaRenderer::new);
        ;
    }
}
