package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ParrotBaseModel;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.entity.RosellaEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RosellaRenderer extends ZawaMobRenderer<RosellaEntity, ParrotBaseModel<RosellaEntity>> {
    public RosellaRenderer(EntityRendererProvider.Context context) {
        super(context, new ParrotBaseModel.Adult<>(context.bakeLayer(ZEModelLayers.ROSELLA_ADULT)), new ParrotBaseModel.Flying<>(context.bakeLayer(ZEModelLayers.ROSELLA_FLYING)), new ParrotBaseModel.Child<>(context.bakeLayer(ZEModelLayers.ROSELLA_CHILD)), 0.25F);
    }

    @Override
    protected void scale(RosellaEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 0.8F;
        matrixStack.scale(scale, scale, scale);

        super.scale(entity, matrixStack, partialTickTime);
    }
}
