package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ParrotBaseModel;
import com.github.kmfisk.zawaessentials.entity.AustralianRingneckParrotEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AustralianRingneckParrotRenderer extends ZawaMobRenderer<AustralianRingneckParrotEntity, ParrotBaseModel<AustralianRingneckParrotEntity>> {
    public AustralianRingneckParrotRenderer(EntityRendererProvider.Context rendererManager) {
        super(rendererManager, new ParrotBaseModel.Adult<>(), new ParrotBaseModel.Flying<>(), new ParrotBaseModel.Child<>(), 0.3F);
    }

    @Override
    protected void scale(AustralianRingneckParrotEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 0.8F;
        matrixStack.scale(scale, scale, scale);

        super.scale(entity, matrixStack, partialTickTime);
    }
}
