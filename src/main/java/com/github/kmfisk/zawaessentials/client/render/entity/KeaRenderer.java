package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.KeaModel;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.entity.KeaEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KeaRenderer extends ZawaMobRenderer<KeaEntity, KeaModel> {
    public KeaRenderer(EntityRendererProvider.Context context) {
        super(context, new KeaModel.Adult(context.bakeLayer(ZEModelLayers.KEA_ADULT)), new KeaModel.Flying(context.bakeLayer(ZEModelLayers.KEA_FLYING)), new KeaModel.Child(context.bakeLayer(ZEModelLayers.KEA_CHILD)), 0.6F);
    }

    @Override
    protected void scale(KeaEntity entity, PoseStack matrixStack, float partialTickTime) {
        super.scale(entity, matrixStack, partialTickTime);
    }
}
