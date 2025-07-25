package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.GreaterPrairieChickenModel;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.entity.GreaterPrairieChickenEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class GreaterPrairieChickenRenderer extends ZawaMobRenderer<GreaterPrairieChickenEntity, GreaterPrairieChickenModel> {
    public static final ResourceLocation DISPLAY_TEXTURE_LOCATION = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/greater_prairie_chicken/greater_prairie_chicken_display.png");
    private final GreaterPrairieChickenModel baseAdultModel;
    private final GreaterPrairieChickenModel displayingAdultModel;

    public GreaterPrairieChickenRenderer(EntityRendererProvider.Context context) {
        super(context, new GreaterPrairieChickenModel.Adult(context.bakeLayer(ZEModelLayers.GREATER_PRAIRIE_CHICKEN_ADULT)), new GreaterPrairieChickenModel.Child(context.bakeLayer(ZEModelLayers.GREATER_PRAIRIE_CHICKEN_CHILD)), 0.22F);
        baseAdultModel = adultModel;
        displayingAdultModel = new GreaterPrairieChickenModel.Adult.Displaying(context.bakeLayer(ZEModelLayers.GREATER_PRAIRIE_CHICKEN_DISPLAYING));
        addLayer(new DisplayLayer(this, context.getModelSet()));
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }

    @Override
    protected void scale(GreaterPrairieChickenEntity entity, PoseStack matrixStack, float partialTickTime) {
        float scale = entity.isBaby() ? 0.5F : 0.9F;
        matrixStack.scale(scale, scale, scale);

        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public void render(GreaterPrairieChickenEntity entity, float entityYaw, float partialTicks, PoseStack matrixStack, MultiBufferSource buffer, int packedLight) {
        if (!entity.isBaby() && entity.getGender() == ZawaBaseEntity.Gender.MALE)
            adultModel = entity.getStandAmount(partialTicks) > 0.0F ? displayingAdultModel : baseAdultModel;
        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }

    public static class DisplayLayer extends RenderLayer<GreaterPrairieChickenEntity, GreaterPrairieChickenModel> {
        private final GreaterPrairieChickenModel.Adult.Displaying displayingAdultModel;

        public DisplayLayer(RenderLayerParent<GreaterPrairieChickenEntity, GreaterPrairieChickenModel> renderer, EntityModelSet modelSet) {
            super(renderer);
            displayingAdultModel = new GreaterPrairieChickenModel.Adult.Displaying(modelSet.bakeLayer(ZEModelLayers.GREATER_PRAIRIE_CHICKEN_DISPLAYING));
        }

        @Override
        public void render(PoseStack poseStack, MultiBufferSource buffer, int packedLight, GreaterPrairieChickenEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            if (!entity.isBaby() && entity.getGender() == ZawaBaseEntity.Gender.MALE && entity.getStandAmount(partialTicks) > 0.0F)
                coloredCutoutModelCopyLayerRender(getParentModel(), displayingAdultModel, DISPLAY_TEXTURE_LOCATION, poseStack, buffer, packedLight, entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, partialTicks, 1.0F, 1.0F, 1.0F);
        }
    }
}
