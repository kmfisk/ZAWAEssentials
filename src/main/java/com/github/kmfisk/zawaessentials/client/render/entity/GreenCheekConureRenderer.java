package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.ParrotBaseModel;
import com.github.kmfisk.zawaessentials.entity.GreenCheekConureEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GreenCheekConureRenderer extends ZawaMobRenderer<GreenCheekConureEntity, ParrotBaseModel<GreenCheekConureEntity>> {
    private final ParrotBaseModel<GreenCheekConureEntity> adultModel;
    private final ParrotBaseModel<GreenCheekConureEntity> flyingModel;
    private final ParrotBaseModel<GreenCheekConureEntity> babyModel;

    public GreenCheekConureRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new ParrotBaseModel.Adult<>(), 1.0F); // TODO
        adultModel = model;
        flyingModel = new ParrotBaseModel.Flying<>();
        babyModel = new ParrotBaseModel.Child<>();
    }

    @Override
    public void render(GreenCheekConureEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        if (entity.isBaby()) model = babyModel;
        else model = entity.isFlying() ? flyingModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    protected void scale(GreenCheekConureEntity entity, MatrixStack matrixStack, float partialTickTime) {
        // TODO
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(GreenCheekConureEntity entity) { // todo: double check fisk's texture names
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/green_cheek_conure/green_cheek_conure_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(GreenCheekConureEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/green_cheek_conure/green_cheek_conure_" + (i + 1) + ".png");
    }
}
