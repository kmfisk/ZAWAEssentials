package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.MohoModel;
import com.github.kmfisk.zawaessentials.entity.MohoEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MohoRenderer extends ZawaMobRenderer<MohoEntity, MohoModel> {
    private final MohoModel adultModel;
    private final MohoModel flyingModel;
    private final MohoModel babyModel;

    public MohoRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new MohoModel.Adult(), 1.0F); // TODO
        adultModel = model;
        flyingModel = new MohoModel.Flying();
        babyModel = new MohoModel.Child();
    }

    @Override
    public void render(MohoEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        if (entity.isBaby()) model = babyModel;
        else model = entity.isFlying() ? flyingModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    protected void scale(MohoEntity entity, MatrixStack matrixStack, float partialTickTime) {
        // TODO
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(MohoEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/moho/moho_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(MohoEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/moho/moho_" + (i + 1) + ".png");
    }
}
