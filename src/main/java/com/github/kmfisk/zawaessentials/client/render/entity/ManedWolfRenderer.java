package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ManedWolfModel;
import com.github.kmfisk.zawaessentials.entity.ManedWolfEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ManedWolfRenderer extends ZawaMobRenderer<ManedWolfEntity, ManedWolfModel<ManedWolfEntity>> {
    public ManedWolfRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new ManedWolfModel.Adult<>(), new ManedWolfModel.Child<>(), 1.0F);
    }

    @Override
    protected void scale(ManedWolfEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 0.95F;
        matrixStack.scale(scale, scale, scale);

        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(ManedWolfEntity entity, int variant) {
        return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }
}
