package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.CockatielModel;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.entity.CockatielEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CockatielRenderer extends ZawaMobRenderer<CockatielEntity, CockatielModel> {
    public CockatielRenderer(EntityRendererProvider.Context context) {
        super(context, new CockatielModel.Adult(context.bakeLayer(ZEModelLayers.COCKATIEL_ADULT)), new CockatielModel.Flying(context.bakeLayer(ZEModelLayers.COCKATIEL_FLYING)), new CockatielModel.Child(context.bakeLayer(ZEModelLayers.COCKATIEL_CHILD)), 0.25F);
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
    protected void scale(CockatielEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.65F;
        matrixStack.scale(scale, scale, scale);
        super.scale(entity, matrixStack, partialTickTime);
    }
}
