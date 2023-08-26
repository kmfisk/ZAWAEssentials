package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.ManedWolfModel;
import com.github.kmfisk.zawaessentials.entity.ManedWolfEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class ManedWolfRenderer extends ZawaMobRenderer<ManedWolfEntity, ManedWolfModel<ManedWolfEntity>> {
    public ManedWolfRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new ManedWolfModel.Adult<>(), new ManedWolfModel.Child<>(), 1.0F); // TODO
    }

    @Override
    protected void scale(ManedWolfEntity entity, MatrixStack matrixStack, float partialTickTime) {
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(ManedWolfEntity entity, int variant) {
        if (variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/maned_wolf/maned_wolf_" + variantName + ".png");
        } else return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }

    @Override
    public void setupBabyTextures(ManedWolfEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/maned_wolf/maned_wolf_" + (i + 1) + ".png");
    }
}
