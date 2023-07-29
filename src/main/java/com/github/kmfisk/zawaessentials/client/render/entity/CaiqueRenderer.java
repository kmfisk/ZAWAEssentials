package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.HawkHeadedParrotModel;
import com.github.kmfisk.zawaessentials.entity.CaiqueEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CaiqueRenderer extends ZawaMobRenderer<CaiqueEntity, HawkHeadedParrotModel<CaiqueEntity>> {
    public CaiqueRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new HawkHeadedParrotModel.Adult<>(), new HawkHeadedParrotModel.Flying<>(), new HawkHeadedParrotModel.Child<>(), 1.0F); // TODO
    }
}
