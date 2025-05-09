package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.HawkHeadedParrotModel;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.entity.CongoGrayParrotEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CongoGrayParrotRenderer extends ZawaMobRenderer<CongoGrayParrotEntity, HawkHeadedParrotModel<CongoGrayParrotEntity>> {
    public CongoGrayParrotRenderer(EntityRendererProvider.Context context) {
        super(context, new HawkHeadedParrotModel.Adult<>(context.bakeLayer(ZEModelLayers.CONGO_GRAY_PARROT_ADULT)), new HawkHeadedParrotModel.Flying<>(context.bakeLayer(ZEModelLayers.CONGO_GRAY_PARROT_FLYING)), new HawkHeadedParrotModel.Child<>(context.bakeLayer(ZEModelLayers.CONGO_GRAY_PARROT_CHILD)), 0.3F);
    }

    @Override
    protected void scale(CongoGrayParrotEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.7F : 0.9F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
