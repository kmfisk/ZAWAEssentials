package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.BudgerigarModel;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.entity.BudgerigarEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class BudgerigarRenderer extends ZawaMobRenderer<BudgerigarEntity, BudgerigarModel> {
    public static final ResourceLocation CERES_LOCATION = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/budgerigar/budgerigar_male_overlay.png");

    public BudgerigarRenderer(EntityRendererProvider.Context context) {
        super(context, new BudgerigarModel.Adult(context.bakeLayer(ZEModelLayers.BUDGERIGAR_ADULT)), new BudgerigarModel.Flying(context.bakeLayer(ZEModelLayers.BUDGERIGAR_FLYING)), new BudgerigarModel.Adult(context.bakeLayer(ZEModelLayers.BUDGERIGAR_ADULT)), 0.09F);
        this.addLayer(new CeresLayer(this, context.getModelSet()));
    }

    @Override
    protected boolean hasBabyVariants(BudgerigarEntity entity) {
        return false;
    }

    @Override
    protected void scale(BudgerigarEntity entity, PoseStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.6F, 0.6F, 0.6F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(BudgerigarEntity entity, int variant) {
        return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }

    public static class CeresLayer extends RenderLayer<BudgerigarEntity, BudgerigarModel> {
        private final BudgerigarModel.Adult budgerigarModel;
        private final BudgerigarModel.Flying budgerigarFlyingModel;

        public CeresLayer(RenderLayerParent<BudgerigarEntity, BudgerigarModel> renderer, EntityModelSet modelSet) {
            super(renderer);
            budgerigarModel = new BudgerigarModel.Adult(modelSet.bakeLayer(ZEModelLayers.BUDGERIGAR_ADULT));
            budgerigarFlyingModel = new BudgerigarModel.Flying(modelSet.bakeLayer(ZEModelLayers.BUDGERIGAR_FLYING));
        }

        @Override
        public void render(PoseStack matrixStack, MultiBufferSource buffer, int packedLight, BudgerigarEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.getGender() == ZawaBaseEntity.Gender.MALE && !entity.isBaby()) {
                if (entity.isFlying())
                    coloredCutoutModelCopyLayerRender(getParentModel(), budgerigarFlyingModel, CERES_LOCATION, matrixStack, buffer, packedLight, entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, partialTicks, 1.0F, 1.0F, 1.0F);
                else
                    coloredCutoutModelCopyLayerRender(getParentModel(), budgerigarModel, CERES_LOCATION, matrixStack, buffer, packedLight, entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, partialTicks, 1.0F, 1.0F, 1.0F);
            }
        }
    }
}
