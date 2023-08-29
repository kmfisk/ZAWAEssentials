package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.HawkHeadedParrotModel;
import com.github.kmfisk.zawaessentials.entity.HawkHeadedParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class HawkHeadedParrotRenderer extends ZawaMobRenderer<HawkHeadedParrotEntity, HawkHeadedParrotModel<HawkHeadedParrotEntity>> {
    public HawkHeadedParrotRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new HawkHeadedParrotModel.Adult<>(), new HawkHeadedParrotModel.Flying<>(), new HawkHeadedParrotModel.Child<>(), 0.27F);
    }

    @Override
    protected void scale(HawkHeadedParrotEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 0.75F;
        matrixStack.scale(scale, scale, scale);

        super.scale(entity, matrixStack, partialTickTime);
    }
}
