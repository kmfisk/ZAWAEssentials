package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.ChinchillaModel;
import com.github.kmfisk.zawaessentials.entity.ChinchillaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;

public class ChinchillaRenderer extends ZawaMobRenderer<ChinchillaEntity, ChinchillaModel<ChinchillaEntity>> {
    public ChinchillaRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new ChinchillaModel.Adult<>(), new ChinchillaModel.Child<>(), 1.0F); // TODO
    }

    @Override
    protected void scale(ChinchillaEntity entity, MatrixStack matrixStack, float partialTickTime) {
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(ChinchillaEntity entity, int variant) {
        if (variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/chinchilla/chinchilla_" + variantName + ".png");
        } else return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }

    @Override
    public void setupBabyTextures(ChinchillaEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/chinchilla/chinchilla_" + (i + 1) + ".png");
    }
}
