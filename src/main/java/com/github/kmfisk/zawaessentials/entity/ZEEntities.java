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

public class ZEEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRAR = DeferredRegister.create(ForgeRegistries.ENTITIES, ZawaEssentials.MOD_ID);

    // todo: hitboxes, scaling

    public static final RegistryObject<EntityType<AustralianRingneckParrotEntity>> AUSTRALIAN_RINGNECK_PARROT =
            new Builder<>(AustralianRingneckParrotEntity::new, EntityClassification.CREATURE)
                    .attributes(AustralianRingneckParrotEntity::registerAttributes)
                    .renderer(() -> AustralianRingneckParrotRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "australian_ringneck_parrot");

    public static final RegistryObject<EntityType<BudgerigarEntity>> BUDGERIGAR =
            new Builder<>(BudgerigarEntity::new, EntityClassification.CREATURE)
                    .attributes(BudgerigarEntity::registerAttributes)
                    .renderer(() -> BudgerigarRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "budgerigar");

    public static final RegistryObject<EntityType<CaiqueEntity>> CAIQUE =
            new Builder<>(CaiqueEntity::new, EntityClassification.CREATURE)
                    .attributes(CaiqueEntity::registerAttributes)
                    .renderer(() -> CaiqueRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "caique");

    public static final RegistryObject<EntityType<CockatielEntity>> COCKATIEL =
            new Builder<>(CockatielEntity::new, EntityClassification.CREATURE)
                    .attributes(CockatielEntity::registerAttributes)
                    .renderer(() -> CockatielRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "cockatiel");

    public static final RegistryObject<EntityType<CongoGrayParrotEntity>> CONGO_GRAY_PARROT =
            new Builder<>(CongoGrayParrotEntity::new, EntityClassification.CREATURE)
                    .attributes(CongoGrayParrotEntity::registerAttributes)
                    .renderer(() -> CongoGrayParrotRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "congo_gray_parrot");

    public static final RegistryObject<EntityType<ConureEntity>> CONURE =
            new Builder<>(ConureEntity::new, EntityClassification.CREATURE)
                    .attributes(ConureEntity::registerAttributes)
                    .renderer(() -> ConureRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "conure");

    public static final RegistryObject<EntityType<EclectusEntity>> ECLECTUS =
            new Builder<>(EclectusEntity::new, EntityClassification.CREATURE)
                    .attributes(EclectusEntity::registerAttributes)
                    .renderer(() -> EclectusRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "eclectus");

    public static final RegistryObject<EntityType<GreaterPrairieChickenEntity>> GREATER_PRAIRIE_CHICKEN =
            new Builder<>(GreaterPrairieChickenEntity::new, EntityClassification.CREATURE)
                    .attributes(GreaterPrairieChickenEntity::registerAttributes)
                    .renderer(() -> GreaterPrairieChickenRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "greater_prairie_chicken");

    public static final RegistryObject<EntityType<GreenCheekConureEntity>> GREEN_CHEEK_CONURE =
            new Builder<>(GreenCheekConureEntity::new, EntityClassification.CREATURE)
                    .attributes(GreenCheekConureEntity::registerAttributes)
                    .renderer(() -> GreenCheekConureRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "green_cheek_conure");

    public static final RegistryObject<EntityType<HawkHeadedParrotEntity>> HAWK_HEADED_PARROT =
            new Builder<>(HawkHeadedParrotEntity::new, EntityClassification.CREATURE)
                    .attributes(HawkHeadedParrotEntity::registerAttributes)
                    .renderer(() -> HawkHeadedParrotRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "hawk_headed_parrot");

    public static final RegistryObject<EntityType<KakarikiEntity>> KAKARIKI =
            new Builder<>(KakarikiEntity::new, EntityClassification.CREATURE)
                    .attributes(KakarikiEntity::registerAttributes)
                    .renderer(() -> KakarikiRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "kakariki");

    public static final RegistryObject<EntityType<KeaEntity>> KEA =
            new Builder<>(KeaEntity::new, EntityClassification.CREATURE)
                    .attributes(KeaEntity::registerAttributes)
                    .renderer(() -> KeaRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "kea");

    public static final RegistryObject<EntityType<MohoEntity>> MOHO =
            new Builder<>(MohoEntity::new, EntityClassification.CREATURE)
                    .attributes(MohoEntity::registerAttributes)
                    .renderer(() -> MohoRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "moho");

    public static final RegistryObject<EntityType<PoicephalusParrotEntity>> POICEPHALUS_PARROT =
            new Builder<>(PoicephalusParrotEntity::new, EntityClassification.CREATURE)
                    .attributes(PoicephalusParrotEntity::registerAttributes)
                    .renderer(() -> PoicephalusParrotRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "poicephalus_parrot");

    public static final RegistryObject<EntityType<QuakerParakeetEntity>> QUAKER_PARAKEET =
            new Builder<>(QuakerParakeetEntity::new, EntityClassification.CREATURE)
                    .attributes(QuakerParakeetEntity::registerAttributes)
                    .renderer(() -> QuakerParakeetRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "quaker_parakeet");

    public static final RegistryObject<EntityType<RingneckParrotEntity>> RINGNECK_PARROT =
            new Builder<>(RingneckParrotEntity::new, EntityClassification.CREATURE)
                    .attributes(RingneckParrotEntity::registerAttributes)
                    .renderer(() -> RingneckParrotRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "ringneck_parrot");

    public static final RegistryObject<EntityType<RosellaEntity>> ROSELLA =
            new Builder<>(RosellaEntity::new, EntityClassification.CREATURE)
                    .attributes(RosellaEntity::registerAttributes)
                    .renderer(() -> RosellaRenderer::new)
                    .spawn(ZawaSpawnCategory.DEEP_RAINFOREST, 5, 1, 2)
                    .data(entityBuilder -> entityBuilder.sized(1.0F, 1.0F).clientTrackingRange(10))
                    .build(REGISTRAR, "rosella");

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
