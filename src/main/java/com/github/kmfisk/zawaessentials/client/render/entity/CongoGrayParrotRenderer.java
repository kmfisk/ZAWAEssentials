package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.HawkHeadedParrotModel;
import com.github.kmfisk.zawaessentials.entity.CongoGrayParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CongoGrayParrotRenderer extends ZawaMobRenderer<CongoGrayParrotEntity, HawkHeadedParrotModel<CongoGrayParrotEntity>> {
    private final HawkHeadedParrotModel<CongoGrayParrotEntity> adultModel;
    private final HawkHeadedParrotModel<CongoGrayParrotEntity> flyingModel;
    private final HawkHeadedParrotModel<CongoGrayParrotEntity> babyModel;

    public CongoGrayParrotRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new HawkHeadedParrotModel.Adult<>(), 1.0F); // TODO
        adultModel = model;
        flyingModel = new HawkHeadedParrotModel.Flying<>();
        babyModel = new HawkHeadedParrotModel.Child<>();
    }

    @Override
    public void render(CongoGrayParrotEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        if (entity.isBaby()) model = babyModel;
        else model = entity.isFlying() ? flyingModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    protected void scale(CongoGrayParrotEntity entity, MatrixStack matrixStack, float partialTickTime) {
        // TODO
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(CongoGrayParrotEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/congo_gray_parrot/congo_gray_parrot_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(CongoGrayParrotEntity entity) {
        //all wild-type babies for single-species birds use the same baby (baby_1)
        //so, for example, gray 1-3 use baby 1
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/congo_gray_parrot/congo_gray_parrot_" + (i + 1) + ".png");
    }
}
