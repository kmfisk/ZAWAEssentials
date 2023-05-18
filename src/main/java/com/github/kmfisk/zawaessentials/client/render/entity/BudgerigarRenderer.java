package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.BudgerigarModel;
import com.github.kmfisk.zawaessentials.entity.BudgerigarEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BudgerigarRenderer extends ZawaMobRenderer<BudgerigarEntity, BudgerigarModel> {
    private final BudgerigarModel adultModel;
    private final BudgerigarModel flyingModel;
    private final BudgerigarModel babyModel;

    public BudgerigarRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new BudgerigarModel.Adult(), 1.0F); // TODO
        adultModel = model;
        flyingModel = new BudgerigarModel.Flying();
        babyModel = new BudgerigarModel.Child();
        // todo: male texture overlay
    }

    @Override
    public void render(BudgerigarEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        if (entity.isBaby()) model = babyModel;
        else model = entity.isFlying() ? flyingModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    protected void scale(BudgerigarEntity entity, MatrixStack matrixStack, float partialTickTime) {
        // TODO
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(BudgerigarEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/budgerigar/budgerigar_" + (i + 1) + ".png");
    }

    @Override
    public void setupBabyTextures(BudgerigarEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/budgerigar/budgerigar_" + (i + 1) + ".png");
    }
}
