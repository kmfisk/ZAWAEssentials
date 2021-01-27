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

public class EntityManedWolf extends AbstractZawaLand {
    public EntityManedWolf(@NotNull World w) {
        super(w);
        setSize(0.5F, 0.5F);
    }

    @NotNull
    @Override
    public AnimalPack getPack() {
        return AnimalPacksEssentials.MANED_WOLF;
    }

    @NotNull
    @Override
    public Animation getSleepAnimation() {
        return new Animation(ModEntityPoses.MANED_WOLF, ModEntityPoses.MANED_WOLF_BABY_SLEEPING);
    }

    @Nullable
    @Override
    public Animation getChildSleepAnimation() {
        return new Animation(ModEntityPoses.MANED_WOLF_BABY, ModEntityPoses.MANED_WOLF_BABY_SLEEPING);
    }

    @Nullable
    @Override
    public EntityAgeable createChild(EntityAgeable ageable) {
        return null;
    }
}
