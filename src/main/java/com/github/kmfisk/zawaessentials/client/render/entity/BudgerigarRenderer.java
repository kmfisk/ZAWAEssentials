package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.BudgerigarModel;
import com.github.kmfisk.zawaessentials.entity.BudgerigarEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class BudgerigarRenderer extends ZawaMobRenderer<BudgerigarEntity, BudgerigarModel> {
    public static final ResourceLocation CERES_LOCATION = new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/budgerigar/budgerigar_male_overlay.png");

    public BudgerigarRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new BudgerigarModel.Adult(), new BudgerigarModel.Flying(), new BudgerigarModel.Adult(), 0.09F);
        this.addLayer(new CeresLayer(this));
    }

    @Override
    protected boolean hasBabyVariants(BudgerigarEntity entity) {
        return false;
    }

    @Override
    protected void scale(BudgerigarEntity entity, MatrixStack matrixStack, float partialTickTime) {
        matrixStack.scale(0.6F, 0.6F, 0.6F);
        super.scale(entity, matrixStack, partialTickTime);
    }

    @Override
    public ResourceLocation getBabyTexture(BudgerigarEntity entity, int variant) {
        return this.babyTexture != null ? this.babyTexture : this.babyTextures[variant];
    }

    public static class CeresLayer extends LayerRenderer<BudgerigarEntity, BudgerigarModel> {
        private final BudgerigarModel.Adult budgerigarModel = new BudgerigarModel.Adult();
        private final BudgerigarModel.Flying budgerigarFlyingModel = new BudgerigarModel.Flying();

        public CeresLayer(IEntityRenderer<BudgerigarEntity, BudgerigarModel> renderer) {
            super(renderer);
        }

        @Override
        public void render(MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight, BudgerigarEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
            if (entity.getGender() == ZawaBaseEntity.Gender.MALE && !entity.isBaby()) {
                if (entity.isFlying())
                    coloredCutoutModelCopyLayerRender(getParentModel(), budgerigarFlyingModel, CERES_LOCATION, matrixStack, buffer, packedLight, entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, partialTicks, 1.0F, 1.0F, 1.0F);
                else
                    coloredCutoutModelCopyLayerRender(getParentModel(), budgerigarModel, CERES_LOCATION, matrixStack, buffer, packedLight, entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, partialTicks, 1.0F, 1.0F, 1.0F);
            }
        }
    }
}
