package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ChinchillaModel;
import com.github.kmfisk.zawaessentials.entity.ChinchillaEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ChinchillaRenderer extends ZawaMobRenderer<ChinchillaEntity, ChinchillaModel<ChinchillaEntity>> {
    public ChinchillaRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new ChinchillaModel.Adult<>(), new ChinchillaModel.Child<>(), 1.0F); // TODO
    }
}
