package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.MohoModel;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.entity.MohoEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MohoRenderer extends ZawaMobRenderer<MohoEntity, MohoModel> {
    public MohoRenderer(EntityRendererProvider.Context context) {
        super(context, new MohoModel.Adult(context.bakeLayer(ZEModelLayers.MOHO_ADULT)), new MohoModel.Flying(context.bakeLayer(ZEModelLayers.MOHO_FLYING)), new MohoModel.Child(context.bakeLayer(ZEModelLayers.MOHO_CHILD)), 0.15F);
    }

    @Override
    protected boolean hasBabyVariants(MohoEntity entity) {
        return false;
    }

    @Override
    protected void scale(MohoEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.8F;
        matrixStack.scale(scale, scale, scale);

        super.scale(entity, matrixStack, partialTickTime);
    }
}
