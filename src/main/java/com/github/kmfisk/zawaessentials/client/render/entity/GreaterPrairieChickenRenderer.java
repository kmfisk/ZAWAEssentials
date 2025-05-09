package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.GreaterPrairieChickenModel;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.entity.GreaterPrairieChickenEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GreaterPrairieChickenRenderer extends ZawaMobRenderer<GreaterPrairieChickenEntity, GreaterPrairieChickenModel> {
    public GreaterPrairieChickenRenderer(EntityRendererProvider.Context context) {
        super(context, new GreaterPrairieChickenModel.Adult(context.bakeLayer(ZEModelLayers.GREATER_PRAIRIE_CHICKEN_ADULT)), new GreaterPrairieChickenModel.Child(context.bakeLayer(ZEModelLayers.GREATER_PRAIRIE_CHICKEN_CHILD)), 0.22F);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }

    @Override
    protected void scale(GreaterPrairieChickenEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.9F;
        matrixStack.scale(scale, scale, scale);

        super.scale(entity, matrixStack, partialTickTime);
    }
}
