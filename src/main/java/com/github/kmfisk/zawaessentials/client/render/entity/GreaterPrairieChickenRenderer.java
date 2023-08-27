package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.GreaterPrairieChickenModel;
import com.github.kmfisk.zawaessentials.entity.GreaterPrairieChickenEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GreaterPrairieChickenRenderer extends ZawaMobRenderer<GreaterPrairieChickenEntity, GreaterPrairieChickenModel> {
    public GreaterPrairieChickenRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new GreaterPrairieChickenModel.Adult(), new GreaterPrairieChickenModel.Child(), 0.3F); // TODO

    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }

    @Override
    protected void scale(GreaterPrairieChickenEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.9F;
        matrixStack.scale(scale, scale, scale);

        super.scale(entity, matrixStack, partialTickTime);
    }
}
