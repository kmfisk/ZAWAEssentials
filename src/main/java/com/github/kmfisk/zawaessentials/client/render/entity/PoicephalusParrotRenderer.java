package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.HawkHeadedParrotModel;
import com.github.kmfisk.zawaessentials.entity.PoicephalusParrotEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class PoicephalusParrotRenderer extends ZawaMobRenderer<PoicephalusParrotEntity, HawkHeadedParrotModel<PoicephalusParrotEntity>> {
    public PoicephalusParrotRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new HawkHeadedParrotModel.Adult<>(), new HawkHeadedParrotModel.Flying<>(), new HawkHeadedParrotModel.Child<>(), 1.0F); // TODO
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
