package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ParrotBaseModel;
import com.github.kmfisk.zawaessentials.entity.ConureEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ConureRenderer extends ZawaMobRenderer<ConureEntity, ParrotBaseModel<ConureEntity>> {
    public ConureRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new ParrotBaseModel.Adult<>(), new ParrotBaseModel.Flying<>(), new ParrotBaseModel.Child<>(), 0.27F);
    }

    @Override
    protected void scale(ConureEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale;
        if (entity.isBaby()) scale = 0.6F;
        else scale = entity.getVariant() == 5 ? 0.8F : 0.7F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
