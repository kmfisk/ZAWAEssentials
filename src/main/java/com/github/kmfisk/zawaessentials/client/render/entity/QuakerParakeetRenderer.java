package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ParrotBaseModel;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.entity.QuakerParakeetEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class QuakerParakeetRenderer extends ZawaMobRenderer<QuakerParakeetEntity, ParrotBaseModel<QuakerParakeetEntity>> {
    public QuakerParakeetRenderer(EntityRendererProvider.Context context) {
        super(context, new ParrotBaseModel.Adult<>(context.bakeLayer(ZEModelLayers.QUAKER_PARAKEET_ADULT)), new ParrotBaseModel.Flying<>(context.bakeLayer(ZEModelLayers.QUAKER_PARAKEET_FLYING)), new ParrotBaseModel.Child<>(context.bakeLayer(ZEModelLayers.QUAKER_PARAKEET_CHILD)), 0.25F);
    }

    @Override
    protected void scale(QuakerParakeetEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.75F;
        matrixStack.scale(scale, scale, scale);

        super.scale(entity, matrixStack, partialTickTime);
    }
}
