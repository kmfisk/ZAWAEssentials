package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ManedWolfModel;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.entity.ManedWolfEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ManedWolfRenderer extends ZawaMobRenderer<ManedWolfEntity, ManedWolfModel<ManedWolfEntity>> {
    public ManedWolfRenderer(EntityRendererProvider.Context context) {
        super(context, new ManedWolfModel.Adult<>(context.bakeLayer(ZEModelLayers.MANED_WOLF_ADULT)), new ManedWolfModel.Child<>(context.bakeLayer(ZEModelLayers.MANED_WOLF_CHILD)), 0.5F);
    }

    @Override
    protected void scale(ManedWolfEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.75F : 0.95F;
        matrixStack.scale(scale, scale, scale);

        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(ManedWolfEntity entity, int variant) {
        return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }
}
