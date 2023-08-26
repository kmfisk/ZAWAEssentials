package com.github.kmfisk.zawaessentials.entity;

import com.github.kmfisk.zawaessentials.item.ZEItems;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Tuple;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RingneckParrotEntity extends ZawaFlyingEntity implements SpeciesVariantsEntity, OviparousEntity {
    public static final List<Tuple<String, ZawaSpawnCategory>> VARIANT_SPAWNS = new ArrayList<>(Arrays.asList(
            new Tuple<>("indian", ZawaSpawnCategory.DRY_GRASSLAND),
            new Tuple<>("moustache", ZawaSpawnCategory.WET_RAINFOREST),
            new Tuple<>("plum_headed", ZawaSpawnCategory.TROPICAL_ALPINE),
            new Tuple<>("malabar", ZawaSpawnCategory.TROPICAL_ALPINE)
    ));

    public RingneckParrotEntity(EntityType<? extends ZawaFlyingEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        // medium:  .add(Attributes.FLYING_SPEED, 0.60F).add(Attributes.MOVEMENT_SPEED, 0.225F)
        // fast:    .add(Attributes.FLYING_SPEED, 1.2F).add(Attributes.MOVEMENT_SPEED, 0.3F)
        return createMobAttributes().add(Attributes.FLYING_SPEED, 1.2F).add(Attributes.MOVEMENT_SPEED, 0.3F).add(Attributes.MAX_HEALTH, 6.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        // TODO: temperament goals
    }

    @Override
    protected float getStandingEyeHeight(Pose pose, EntitySize size) {
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
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity entity) {
        return ZEEntities.RINGNECK_PARROT.get().create(world);
    }

    @Override
    public ItemStack getBreedEggItem() {
        return ZEItems.RINGNECK_PARROT_EGG.get().getDefaultInstance();
    }

    @Override
    public int getVariantByBiome(IWorld iWorld) {
        String biome = level.getBiome(this.blockPosition()).getRegistryName().toString();
        if (ZawaSpawnCategory.DRY_GRASSLAND.getBiomes().contains(biome))
            return 0;
        if (ZawaSpawnCategory.WET_RAINFOREST.getBiomes().contains(biome))
            return 1;
        if (ZawaSpawnCategory.TROPICAL_ALPINE.getBiomes().contains(biome))
            return random.nextBoolean() ? 2 : 3;

        return random.nextInt(getWildVariants());
    }
}
