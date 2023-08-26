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

public class KakarikiEntity extends ZawaFlyingEntity implements SpeciesVariantsEntity, OviparousEntity {
    public static final List<Tuple<String, ZawaSpawnCategory>> VARIANT_SPAWNS = new ArrayList<>(Arrays.asList(
            new Tuple<>("red_fronted", ZawaSpawnCategory.COASTAL_TAIGA),
            new Tuple<>("yellow_fronted", ZawaSpawnCategory.COLD_GRASSLAND),
            new Tuple<>("antipodes_island", ZawaSpawnCategory.COASTAL_TUNDRA)
    ));

    public KakarikiEntity(EntityType<? extends ZawaFlyingEntity> type, World world) {
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
        return ZEEntities.KAKARIKI.get().create(world);
    }

    @Override
    public ItemStack getBreedEggItem() {
        return ZEItems.KAKARIKI_EGG.get().getDefaultInstance();
    }

    @Override
    public int getVariantByBiome(IWorld iWorld) {
        String biome = level.getBiome(this.blockPosition()).getRegistryName().toString();
        if (ZawaSpawnCategory.COASTAL_TAIGA.getBiomes().contains(biome))
            return 0;
        if (ZawaSpawnCategory.COLD_GRASSLAND.getBiomes().contains(biome))
            return 1;
        if (ZawaSpawnCategory.COASTAL_TUNDRA.getBiomes().contains(biome))
            return 2;

        return random.nextInt(getWildVariants());
    }
}
