package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.HawkHeadedParrotModel;
import com.github.kmfisk.zawaessentials.entity.HawkHeadedParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class HawkHeadedParrotRenderer extends ZawaMobRenderer<HawkHeadedParrotEntity, HawkHeadedParrotModel> {
    private final HawkHeadedParrotModel adultModel;
    private final HawkHeadedParrotModel flyingModel;
    private final HawkHeadedParrotModel babyModel;

    public HawkHeadedParrotRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new HawkHeadedParrotModel.Adult(), 1.0F);
        adultModel = model;
        flyingModel = new HawkHeadedParrotModel.Flying();
        babyModel = new HawkHeadedParrotModel.Child();
    }

    @Override
    public void render(HawkHeadedParrotEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        if (entity.isBaby()) model = babyModel;
        else model = entity.isFlying() ? flyingModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    protected void scale(HawkHeadedParrotEntity entity, MatrixStack matrixStack, float partialTickTime) {
        // TODO
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(HawkHeadedParrotEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/hawk_headed_parrot/hawkhead_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(HawkHeadedParrotEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/hawk_headed_parrot/hawkhead_" + (i + 1) + ".png");
    }
}
