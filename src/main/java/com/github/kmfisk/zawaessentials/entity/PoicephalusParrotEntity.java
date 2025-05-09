package com.github.kmfisk.zawaessentials.entity;

import com.github.kmfisk.zawaessentials.item.ZEItems;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.Tuple;
import net.minecraft.world.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import org.zawamod.zawa.config.ZawaSpawnCategory;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PoicephalusParrotEntity extends ZawaFlyingEntity implements SpeciesVariantsEntity, OviparousEntity {
    public static final List<Tuple<String, ZawaSpawnCategory>> VARIANT_SPAWNS = new ArrayList<>(Arrays.asList(
            new Tuple<>("senegal", ZawaSpawnCategory.DRY_FOREST),
            new Tuple<>("red_bellied", ZawaSpawnCategory.DRY_GRASSLAND),
            new Tuple<>("ruppels", ZawaSpawnCategory.DRY_GRASSLAND),
            new Tuple<>("jardine", ZawaSpawnCategory.TROPICAL_ALPINE)
    ));

    public PoicephalusParrotEntity(EntityType<? extends ZawaFlyingEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        // medium:  .add(Attributes.FLYING_SPEED, 0.60F).add(Attributes.MOVEMENT_SPEED, 0.225F)
        // fast:    .add(Attributes.FLYING_SPEED, 1.2F).add(Attributes.MOVEMENT_SPEED, 0.3F)
        return createMobAttributes().add(Attributes.FLYING_SPEED, 1.2F).add(Attributes.MOVEMENT_SPEED, 0.3F).add(Attributes.MAX_HEALTH, 8.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.33D));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, Player.class, 16.0F, 0.8D, 1.33D, (entity) -> AVOID_PLAYERS.test(entity) && !this.isTame()));
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
        return ZEEntities.POICEPHALUS_PARROT.get().create(world);
    }

    @Override
    public ItemStack getBreedEggItem() {
        return ZEItems.POICEPHALUS_PARROT_EGG.get().getDefaultInstance();
    }

    @Override
    public int getVariantByBiome(LevelAccessor iWorld) {
        String biome = level.getBiome(this.blockPosition()).getRegistryName().toString();
        if (ZawaSpawnCategory.DRY_FOREST.getBiomes().contains(biome))
            return 0;
        if (ZawaSpawnCategory.DRY_GRASSLAND.getBiomes().contains(biome))
            return random.nextBoolean() ? 1 : 2;
        if (ZawaSpawnCategory.TROPICAL_ALPINE.getBiomes().contains(biome))
            return 3;

        return random.nextInt(getWildVariants());
    }
}
