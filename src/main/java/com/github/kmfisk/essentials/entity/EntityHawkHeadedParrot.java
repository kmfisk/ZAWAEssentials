package com.github.kmfisk.essentials.entity;

import com.github.kmfisk.essentials.entity.base.EssentialsBaseFlying;
import com.github.kmfisk.essentials.util.AnimalPacksEssentials;
import com.github.kmfisk.essentials.util.ModEntityPoses;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;
import net.soggymustache.bookworm.client.animation.lerp.Animation;
import org.jetbrains.annotations.NotNull;
import org.zawamod.entity.core.AnimalPack;

import javax.annotation.Nullable;

public class EntityHawkHeadedParrot extends EssentialsBaseFlying {
    public EntityHawkHeadedParrot(World worldIn) {
        super(worldIn);
        setSize(0.5F, 0.5F);
    }

    @NotNull
    @Override
    public AnimalPack getPack() {
        return AnimalPacksEssentials.HAWK_HEADED_PARROT;
    }

    @NotNull
    @Override
    public Animation getSleepAnimation() {
        return new Animation(ModEntityPoses.HAWK_HEADED_PARROT, ModEntityPoses.HAWK_HEADED_PARROT_SLEEPING);
    }

    @Nullable
    @Override
    public Animation getChildSleepAnimation() {
        return new Animation(ModEntityPoses.PARROT_BASE_BABY, ModEntityPoses.PARROT_BASE_BABY_SLEEPING);
    }

    @Nullable
    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return null;
    }
}
