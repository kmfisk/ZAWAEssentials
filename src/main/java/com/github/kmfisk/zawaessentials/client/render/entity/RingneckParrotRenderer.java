package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.ParrotBaseModel;
import com.github.kmfisk.zawaessentials.entity.RingneckParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RingneckParrotRenderer extends ZawaMobRenderer<RingneckParrotEntity, ParrotBaseModel<RingneckParrotEntity>> {
    private final ParrotBaseModel<RingneckParrotEntity> adultModel;
    private final ParrotBaseModel<RingneckParrotEntity> flyingModel;
    private final ParrotBaseModel<RingneckParrotEntity> babyModel;

    public RingneckParrotRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new ParrotBaseModel.Adult<>(), 1.0F); // TODO
        adultModel = model;
        flyingModel = new ParrotBaseModel.Flying<>();
        babyModel = new ParrotBaseModel.Child<>();
    }

    @Override
    public void render(RingneckParrotEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight) {
        if (entity.isBaby()) model = babyModel;
        else model = entity.isFlying() ? flyingModel : adultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    @Override
    protected void scale(RingneckParrotEntity entity, MatrixStack matrixStack, float partialTickTime) {
        // TODO
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void setupAdultTextures(RingneckParrotEntity entity) {
        int variantCount = entity.getTotalVariants();
        adultTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            adultTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/ringneck_parrot/ringneck_" + (i + 1) + ".png");
        // todo: sexually dimorphic
    }

    @Override
    public void setupBabyTextures(RingneckParrotEntity entity) {
        int variantCount = entity.getTotalVariants();
        babyTextures = new ResourceLocation[variantCount];
        for (int i = 0; i < variantCount; i++)
            babyTextures[i] = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/ringneck_parrot/ringneck_" + (i + 1) + ".png");
    }
}
