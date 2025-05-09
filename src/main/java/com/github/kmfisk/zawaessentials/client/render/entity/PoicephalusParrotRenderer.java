package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.HawkHeadedParrotModel;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.entity.PoicephalusParrotEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PoicephalusParrotRenderer extends ZawaMobRenderer<PoicephalusParrotEntity, HawkHeadedParrotModel<PoicephalusParrotEntity>> {
    public PoicephalusParrotRenderer(EntityRendererProvider.Context context) {
        super(context, new HawkHeadedParrotModel.Adult<>(context.bakeLayer(ZEModelLayers.POICEPHALUS_PARROT_ADULT)), new HawkHeadedParrotModel.Flying<>(context.bakeLayer(ZEModelLayers.POICEPHALUS_PARROT_FLYING)), new HawkHeadedParrotModel.Child<>(context.bakeLayer(ZEModelLayers.POICEPHALUS_PARROT_CHILD)), 0.3F);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }

    @Override
    protected void scale(PoicephalusParrotEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale;
        if (entity.isBaby()) scale = 0.6F;
        else scale = entity.getVariant() == 4 ? 1F : 0.75F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
