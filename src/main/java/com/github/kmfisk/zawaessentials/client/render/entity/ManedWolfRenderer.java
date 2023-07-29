package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ManedWolfModel;
import com.github.kmfisk.zawaessentials.entity.ManedWolfEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class ManedWolfRenderer extends ZawaMobRenderer<ManedWolfEntity, ManedWolfModel<ManedWolfEntity>> {
    public ManedWolfRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new ManedWolfModel.Adult<>(), new ManedWolfModel.Child<>(), 1.0F); // TODO
    }
}
