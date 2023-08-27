package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.HawkHeadedParrotModel;
import com.github.kmfisk.zawaessentials.entity.PoicephalusParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PoicephalusParrotRenderer extends ZawaMobRenderer<PoicephalusParrotEntity, HawkHeadedParrotModel<PoicephalusParrotEntity>> {
    public PoicephalusParrotRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new HawkHeadedParrotModel.Adult<>(), new HawkHeadedParrotModel.Flying<>(), new HawkHeadedParrotModel.Child<>(), 0.3F); // TODO
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }

    @Override
    protected void scale(PoicephalusParrotEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale;
        if (entity.isBaby()) scale = 0.6F;
        else scale = entity.getVariant() == 4 ? 1F : 0.75F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
