package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ParrotBaseModel;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.entity.RingneckParrotEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RingneckParrotRenderer extends ZawaMobRenderer<RingneckParrotEntity, ParrotBaseModel<RingneckParrotEntity>> {
    public RingneckParrotRenderer(EntityRendererProvider.Context context) {
        super(context, new ParrotBaseModel.Adult<>(context.bakeLayer(ZEModelLayers.RINGNECK_PARROT_ADULT)), new ParrotBaseModel.Flying<>(context.bakeLayer(ZEModelLayers.RINGNECK_PARROT_FLYING)), new ParrotBaseModel.Child<>(context.bakeLayer(ZEModelLayers.RINGNECK_PARROT_CHILD)), 0.25F);
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }

    @Override
    protected void scale(RingneckParrotEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.6F : 0.85F;
        matrixStack.scale(scale, scale, scale);

        super.scale(entity, matrixStack, partialTickTime);
    }
}
