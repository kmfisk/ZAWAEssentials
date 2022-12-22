package com.github.kmfisk.zawaessentials.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;

import javax.annotation.Nullable;

public class HawkHeadedParrotEntity extends ZawaFlyingEntity {
    public HawkHeadedParrotEntity(EntityType<? extends ZawaFlyingEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return createMobAttributes().add(Attributes.FLYING_SPEED, 1.2F).add(Attributes.MOVEMENT_SPEED, 0.3F).add(Attributes.MAX_HEALTH, 8.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        // TODO: Add temperament goals
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
//        return ZEEntities.HAWK_HEADED_PARROT.get().create(world);
        return null; // TODO
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        // TODO
        return super.getAmbientSound();
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        // TODO
        return super.getHurtSound(source);
    }
}
