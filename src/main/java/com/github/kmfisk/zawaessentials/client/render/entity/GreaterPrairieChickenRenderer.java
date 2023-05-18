package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.GreaterPrairieChickenModel;
import com.github.kmfisk.zawaessentials.entity.GreaterPrairieChickenEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GreaterPrairieChickenRenderer extends ZawaMobRenderer<GreaterPrairieChickenEntity, GreaterPrairieChickenModel> {
    private final GreaterPrairieChickenModel adultModel;
    private final GreaterPrairieChickenModel babyModel;

    public GreaterPrairieChickenRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new GreaterPrairieChickenModel.Adult(), 1.0F); // TODO
        adultModel = model;
        babyModel = new GreaterPrairieChickenModel.Child();
    }

    @Override
    public void render(GreaterPrairieChickenEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        model = entity.isBaby() ? babyModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    protected void scale(GreaterPrairieChickenEntity entity, MatrixStack matrixStack, float partialTickTime) {
        // TODO
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(GreaterPrairieChickenEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/greater_prairie_chicken/prairie_chicken_" + (i + 1) + ".png");
        // todo: sexually dimorphic
    }

    @Override
    public void setupBabyTextures(GreaterPrairieChickenEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/greater_prairie_chicken/prairie_chicken_" + (i + 1) + ".png");
    }
}
