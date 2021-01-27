package com.github.kmfisk.essentials.entity;

import com.github.kmfisk.essentials.util.AnimalPacksEssentials;
import com.github.kmfisk.essentials.util.ModEntityPoses;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;
import net.soggymustache.bookworm.client.animation.lerp.Animation;
import org.jetbrains.annotations.NotNull;
import org.zawamod.entity.base.AbstractZawaLand;
import org.zawamod.entity.core.AnimalPack;

import javax.annotation.Nullable;

public class EntityChinchilla extends AbstractZawaLand {
    public EntityChinchilla(@NotNull World w) {
        super(w);
        setSize(0.5F, 0.5F);
    }

    @NotNull
    @Override
    public AnimalPack getPack() {
        return AnimalPacksEssentials.CHINCHILLA;
    }

    @Nullable
    @Override
    public Animation getSleepAnimation() {
        return new Animation(ModEntityPoses.CHINCHILLA, ModEntityPoses.CHINCHILLA_SLEEPING);
    }

    @Nullable
    @Override
    public Animation getChildSleepAnimation() {
        return new Animation(ModEntityPoses.CHINCHILLA_BABY, ModEntityPoses.CHINCHILLA_BABY_SLEEPING);
    }

    @Nullable
    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return null;
    }
}
