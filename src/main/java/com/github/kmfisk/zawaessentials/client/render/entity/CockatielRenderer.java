package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.CockatielModel;
import com.github.kmfisk.zawaessentials.entity.CockatielEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CockatielRenderer extends ZawaMobRenderer<CockatielEntity, CockatielModel> {
    private final CockatielModel adultModel;
    private final CockatielModel flyingModel;
    private final CockatielModel babyModel;

    public CockatielRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new CockatielModel.Adult(), 1.0F); // TODO
        adultModel = model;
        flyingModel = new CockatielModel.Flying();
        babyModel = new CockatielModel.Child();
    }

    @Override
    public void render(CockatielEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        if (entity.isBaby()) model = babyModel;
        else model = entity.isFlying() ? flyingModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    protected void scale(CockatielEntity entity, MatrixStack matrixStack, float partialTickTime) {
        // TODO
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(CockatielEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/cockatiel/cockatiel_" + (i + 1) + ".png");
        // todo: sexually dimorphic
    }

    @Override
    public void setupBabyTextures(CockatielEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/cockatiel/cockatiel_" + (i + 1) + ".png");
    }
}
