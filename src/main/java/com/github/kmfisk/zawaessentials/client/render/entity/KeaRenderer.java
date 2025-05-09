package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.KeaModel;
import com.github.kmfisk.zawaessentials.entity.KeaEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KeaRenderer extends ZawaMobRenderer<KeaEntity, KeaModel> {
    public KeaRenderer(EntityRendererProvider.Context rendererManager) {
        super(rendererManager, new KeaModel.Adult(), new KeaModel.Flying(), new KeaModel.Child(), 0.6F);
    }

    @Override
    protected void scale(KeaEntity entity, PoseStack matrixStack, float partialTickTime) {
        super.scale(entity, matrixStack, partialTickTime);
    }
}
