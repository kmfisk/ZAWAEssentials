package com.github.kmfisk.zawaessentials.entity;

import com.github.kmfisk.zawaessentials.item.ZEItems;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.zawamod.zawa.world.entity.OviparousEntity;
import org.zawamod.zawa.world.entity.ThreatenStandEntity;
import org.zawamod.zawa.world.entity.ai.goal.ZawaMeleeAttackGoal;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;
import org.zawamod.zawa.world.entity.animal.ZawaLandEntity;

import javax.annotation.Nullable;

public class GreaterPrairieChickenEntity extends ZawaLandEntity implements OviparousEntity, ThreatenStandEntity {
    public static final EntityDataAccessor<Boolean> STANDING = SynchedEntityData.defineId(GreaterPrairieChickenEntity.class, EntityDataSerializers.BOOLEAN);
    private float standAmount;
    private float standAmountO;

    public GreaterPrairieChickenEntity(EntityType<? extends ZawaBaseEntity> type, Level world) {
        super(type, world);
    }

    public static AttributeSupplier.Builder registerAttributes() {
        // medium:  .add(Attributes.FLYING_SPEED, 0.60F).add(Attributes.MOVEMENT_SPEED, 0.225F)
        // fast:    .add(Attributes.FLYING_SPEED, 1.2F).add(Attributes.MOVEMENT_SPEED, 0.3F)
        return createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3F).add(Attributes.MAX_HEALTH, 10.0).add(Attributes.ATTACK_DAMAGE, 1.0);
    }

    @Override
    public float getMaleRatio() {
        return 0.25F;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(5, new DisplayMeleeAttackGoal());
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(STANDING, false);
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
        return ZEEntities.GREATER_PRAIRIE_CHICKEN.get().create(world);
    }

    @Override
    public ItemStack getBreedEggItem() {
        return ZEItems.GREATER_PRAIRIE_CHICKEN_EGG.get().getDefaultInstance();
    }

    @Override
    public boolean canStand() {
        return getGender() == Gender.MALE && !isBaby() && !isStanding() && getTarget() != null;
    }

    @Override
    public boolean isStanding() {
        return entityData.get(STANDING);
    }

    @Override
    public void tryToStand() {
        setZza(0.0F);
        getNavigation().stop();
        stand(true);
    }

    @Override
    public void stand(boolean stand) {
        entityData.set(STANDING, stand);
    }

    @Override
    public void updateStandAmount() {
        if (standAmount != standAmountO) refreshDimensions();

        standAmountO = standAmount;
        if (isStanding()) standAmount = Math.min(1.0F, standAmount + 0.15F);
        else standAmount = Math.max(0.0F, standAmount - 0.19F);
    }

    @Override
    public float getStandAmount(float delta) {
        return Mth.lerp(delta, standAmountO, standAmount) / 6.0F;
    }

    @Override
    public boolean canContinueStanding() {
        return getTarget() != null;
    }

    @Override
    public void tick() {
        super.tick();
        updateStandAmount();
    }

    class DisplayMeleeAttackGoal extends ZawaMeleeAttackGoal {
        public DisplayMeleeAttackGoal() {
            super(GreaterPrairieChickenEntity.this, 1.5D, 1.33D, true);
        }

        @Override
        public void start() {
            super.start();
            GreaterPrairieChickenEntity.this.stand(true);
        }

        @Override
        public void stop() {
            GreaterPrairieChickenEntity.this.stand(false);
            super.stop();
        }
    }
}
