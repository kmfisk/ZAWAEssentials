package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.KeaModel;
import com.github.kmfisk.zawaessentials.entity.KeaEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KeaRenderer extends ZawaMobRenderer<KeaEntity, KeaModel> {
    private final KeaModel adultModel;
    private final KeaModel flyingModel;
    private final KeaModel babyModel;

    public KeaRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new KeaModel.Adult(), 1.0F); // TODO
        adultModel = model;
        flyingModel = new KeaModel.Flying();
        babyModel = new KeaModel.Child();
    }

    @Override
    public void render(KeaEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        if (entity.isBaby()) model = babyModel;
        else model = entity.isFlying() ? flyingModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    protected void scale(KeaEntity entity, MatrixStack matrixStack, float partialTickTime) {
        // TODO
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(KeaEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/kea/kea_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(KeaEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/kea/kea_" + (i + 1) + ".png");
    }
}
