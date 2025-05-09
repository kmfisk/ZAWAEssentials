package com.github.kmfisk.zawaessentials.entity;

import com.github.kmfisk.zawaessentials.item.ZEItems;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.Tuple;
import net.minecraft.world.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConureEntity extends ZawaFlyingEntity implements SpeciesVariantsEntity, OviparousEntity {
    public static final List<Tuple<String, ZawaSpawnCategory>> VARIANT_SPAWNS = new ArrayList<>(Arrays.asList(
            new Tuple<>("sun", ZawaSpawnCategory.TROPICAL_ALPINE),
            new Tuple<>("jenday", ZawaSpawnCategory.WET_RAINFOREST),
            new Tuple<>("nanday", ZawaSpawnCategory.TEMPERATE_FOREST),
            new Tuple<>("mitred", ZawaSpawnCategory.TEMPERATE_ALPINE),
            new Tuple<>("golden", ZawaSpawnCategory.DEEP_RAINFOREST),
            new Tuple<>("blue_crowned", ZawaSpawnCategory.DRY_FOREST)
    ));

    public ConureEntity(EntityType<? extends ZawaFlyingEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        // medium:  .add(Attributes.FLYING_SPEED, 0.60F).add(Attributes.MOVEMENT_SPEED, 0.225F)
        // fast:    .add(Attributes.FLYING_SPEED, 1.2F).add(Attributes.MOVEMENT_SPEED, 0.3F)
        return createMobAttributes().add(Attributes.FLYING_SPEED, 1.2F).add(Attributes.MOVEMENT_SPEED, 0.3F).add(Attributes.MAX_HEALTH, 6.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 1.5D, 1.33D, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
    }

    @Override
    protected float getStandingEyeHeight(Pose pose, EntityDimensions size) {
        // TODO
        return super.getStandingEyeHeight(pose, size);
    }

    @Override
    public float getScale() {
        // TODO
        return super.getScale();
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
        return ZEEntities.CONURE.get().create(world);
    }

    @Override
    public ItemStack getBreedEggItem() {
        return ZEItems.CONURE_EGG.get().getDefaultInstance();
    }

    @Override
    public int getVariantByBiome(LevelAccessor iWorld) {
        String biome = level.getBiome(this.blockPosition()).getRegistryName().toString();
        if (ZawaSpawnCategory.TROPICAL_ALPINE.getBiomes().contains(biome))
            return 0;
        if (ZawaSpawnCategory.WET_RAINFOREST.getBiomes().contains(biome))
            return 1;
        if (ZawaSpawnCategory.TEMPERATE_FOREST.getBiomes().contains(biome))
            return 2;
        if (ZawaSpawnCategory.TEMPERATE_ALPINE.getBiomes().contains(biome))
            return 3;
        if (ZawaSpawnCategory.DEEP_RAINFOREST.getBiomes().contains(biome))
            return 4;
        if (ZawaSpawnCategory.DRY_FOREST.getBiomes().contains(biome))
            return 5;

        return random.nextInt(getWildVariants());
    }
}
