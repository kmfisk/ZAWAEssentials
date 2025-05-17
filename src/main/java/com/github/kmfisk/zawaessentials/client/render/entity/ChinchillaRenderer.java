package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ChinchillaModel;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.entity.ChinchillaEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ChinchillaRenderer extends ZawaMobRenderer<ChinchillaEntity, ChinchillaModel<ChinchillaEntity>> {
    public ChinchillaRenderer(EntityRendererProvider.Context context) {
        super(context, new ChinchillaModel.Adult<>(context.bakeLayer(ZEModelLayers.CHINCHILLA_ADULT)), new ChinchillaModel.Child<>(context.bakeLayer(ZEModelLayers.CHINCHILLA_CHILD)), 0.3F);
    }

    @Override
    protected void scale(ChinchillaEntity entity, PoseStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.8F, 0.8F, 0.8F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(ChinchillaEntity entity, int variant) {
        return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }
}
