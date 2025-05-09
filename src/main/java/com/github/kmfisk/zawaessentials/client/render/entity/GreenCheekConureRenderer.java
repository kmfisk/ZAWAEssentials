package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ParrotBaseModel;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.entity.GreenCheekConureEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GreenCheekConureRenderer extends ZawaMobRenderer<GreenCheekConureEntity, ParrotBaseModel<GreenCheekConureEntity>> {
    public GreenCheekConureRenderer(EntityRendererProvider.Context context) {
        super(context, new ParrotBaseModel.Adult<>(context.bakeLayer(ZEModelLayers.GREEN_CHEEK_CONURE_ADULT)), new ParrotBaseModel.Flying<>(context.bakeLayer(ZEModelLayers.GREEN_CHEEK_CONURE_FLYING)), new ParrotBaseModel.Child<>(context.bakeLayer(ZEModelLayers.GREEN_CHEEK_CONURE_CHILD)), 0.2F);
    }

    @Override
    protected void scale(GreenCheekConureEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
