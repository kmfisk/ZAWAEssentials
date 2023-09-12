package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.model.HawkHeadedParrotModel;
import com.github.kmfisk.zawaessentials.entity.EclectusEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;
import org.zawamod.zawa.resources.EntityStatsManager;
import org.zawamod.zawa.world.entity.ambient.ZawaBaseAmbientEntity;
import org.zawamod.zawa.world.entity.animal.ZawaBaseEntity;

public class EclectusRenderer extends ZawaMobRenderer<EclectusEntity, HawkHeadedParrotModel<EclectusEntity>> {
    public EclectusRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new HawkHeadedParrotModel.Adult<>(), new HawkHeadedParrotModel.Flying<>(), new HawkHeadedParrotModel.Child<>(), 0.3F);
    }

    @Override
    protected boolean hasBabyVariants(EclectusEntity entity) {
        return false;
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }

    @Override
    public ResourceLocation getBabyTexture(EclectusEntity entity, int variant) {
        String gender = entity.getGender().toBool() ? "male" : "female";
        if (entity.getCaptiveVariants() > 0 && variant >= entity.getWildVariants()) {
            String variantName = EntityStatsManager.INSTANCE.getStats(entity).getCaptiveVariantsList().get(variant - entity.getWildVariants());
            return new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/eclectus/eclectus_baby_" + variantName + "_" + gender + ".png");
        } else
            return new ResourceLocation(ZawaEssentials.MOD_ID, "textures/entity/eclectus/eclectus_baby_" + gender + ".png");
    }

    @Override
    protected void scale(EclectusEntity entity, MatrixStack matrixStack, float partialTickTime) {
        if (entity.isBaby()) matrixStack.scale(0.7F, 0.7F, 0.7F);
        super.scale(entity, matrixStack, partialTickTime);

    }
}
