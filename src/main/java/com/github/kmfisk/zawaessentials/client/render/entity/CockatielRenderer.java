package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.CockatielModel;
import com.github.kmfisk.zawaessentials.entity.CockatielEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CockatielRenderer extends ZawaMobRenderer<CockatielEntity, CockatielModel> {
    public CockatielRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new CockatielModel.Adult(), new CockatielModel.Flying(), new CockatielModel.Child(), 1.0F); // TODO
    }

    @Override
    protected boolean hasBabyVariants(CockatielEntity entity) {
        return false;
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }

    @Override
    protected void scale(CockatielEntity entity, MatrixStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
