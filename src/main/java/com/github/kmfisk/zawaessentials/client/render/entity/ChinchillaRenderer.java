package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ChinchillaModel;
import com.github.kmfisk.zawaessentials.entity.ChinchillaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ChinchillaRenderer extends ZawaMobRenderer<ChinchillaEntity, ChinchillaModel<ChinchillaEntity>> {
    public ChinchillaRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new ChinchillaModel.Adult<>(), new ChinchillaModel.Child<>(), 1.0F); // TODO
    }

    @Override
    protected void scale(ChinchillaEntity entity, MatrixStack matrixStack, float partialTickTime) {
        super.scale(entity, matrixStack, partialTickTime);
        float scale = entity.isBaby() ? 0.8F : 0.8F;
        matrixStack.scale(scale, scale, scale);

        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(ChinchillaEntity entity, int variant) {
        return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }
}
