package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ParrotBaseModel;
import com.github.kmfisk.zawaessentials.entity.AustralianRingneckParrotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AustralianRingneckParrotRenderer extends ZawaMobRenderer<AustralianRingneckParrotEntity, ParrotBaseModel<AustralianRingneckParrotEntity>> {
    public AustralianRingneckParrotRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new ParrotBaseModel.Adult<>(), new ParrotBaseModel.Flying<>(), new ParrotBaseModel.Child<>(), 1.0F); // TODO
    }

    @Override
    protected void scale(AustralianRingneckParrotEntity entity, MatrixStack matrixStack, float partialTickTime) {
        /** Very important overall note: 1.0F is the default scale level, imagine it as the 100%. 0.9F would be 90%.
        Typically, tenths should be all you need but going into hundredths is also fine, e.g. 0.95F, 0.65F, etc. **/
//        FOR BASIC OVERALL SCALING USE THIS LINE:
//        matrixStack.scale(1.0F, 1.0F, 1.0F);

//        FOR BABY ONLY SCALING USE THIS LINE:
//        if (entity.isBaby()) matrixStack.scale(1.0F, 1.0F, 1.0F);

//        FOR SEPARATE BABY & ADULT SCALING USE THESE 2 LINES:
//        float scale = entity.isBaby() ? 1.0F : 1.0F;
//        matrixStack.scale(scale, scale, scale);
//        EXAMPLE: "entity.isBaby() ? 0.8F : 1.0F" reads as "if this entity is a baby, scale to 0.8F, otherwise (all adults) scale to 1.0F

//        FOR SEPARATE GENDER BASED SCALING USE THESE 2 LINES:
//        float scale = entity.getGender() == ZawaBaseEntity.Gender.FEMALE ? 1.0F : 1.0F;
//        matrixStack.scale(scale, scale, scale);
//        EXAMPLE: "entity.getGender() == ZawaBaseEntity.Gender.FEMALE ? 0.8F : 1.0F" reads as "if this entity is a female, scale to 0.8F, otherwise (all males) scale to 1.0F

//        IF you need to combine two of the options above, USE THE FOLLOWING LINES:
//        float scale;
//        if (entity.isBaby()) scale = 1.0F;
//        else scale = entity.getGender() == ZawaBaseEntity.Gender.FEMALE ? 1.0F : 1.0F;
//        matrixStack.scale(scale, scale, scale);
//        EXAMPLE: the lines above scale all babies first (priority over the rest), then scales females separate from males.

        super.scale(entity, matrixStack, partialTickTime);
    }
}
