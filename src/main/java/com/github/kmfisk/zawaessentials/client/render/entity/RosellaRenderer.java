package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ParrotBaseModel;
import com.github.kmfisk.zawaessentials.entity.RosellaEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RosellaRenderer extends ZawaMobRenderer<RosellaEntity, ParrotBaseModel<RosellaEntity>> {
    public RosellaRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new ParrotBaseModel.Adult<>(), new ParrotBaseModel.Flying<>(), new ParrotBaseModel.Child<>(), 1.0F); // TODO
    }
}
