package com.github.kmfisk.zawaessentials.entity;

import com.github.kmfisk.zawaessentials.item.ZEItems;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.SpeciesVariantsEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaFlyingEntity;

import javax.annotation.Nullable;

public class EclectusEntity extends ZawaFlyingEntity implements SpeciesVariantsEntity, OviparousEntity {
    public EclectusEntity(EntityType<? extends ZawaFlyingEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        // medium:  .add(Attributes.FLYING_SPEED, 0.60F).add(Attributes.MOVEMENT_SPEED, 0.225F)
        // fast:    .add(Attributes.FLYING_SPEED, 1.2F).add(Attributes.MOVEMENT_SPEED, 0.3F)
        return createMobAttributes().add(Attributes.FLYING_SPEED, 1.2F).add(Attributes.MOVEMENT_SPEED, 0.3F).add(Attributes.MAX_HEALTH, 8.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Override
    public float getMaleRatio() {
        return 0.67F;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new ZawaMeleeAttackGoal(this, 1.5D, 1.33D, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
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
        return ZEEntities.ECLECTUS.get().create(world);
    }

    @Override
    public ItemStack getBreedEggItem() {
        return ZEItems.ECLECTUS_EGG.get().getDefaultInstance();
    }

    @Override
    public int getVariantByBiome(IWorld iWorld) {
        return random.nextInt(getWildVariants());
    }
}
