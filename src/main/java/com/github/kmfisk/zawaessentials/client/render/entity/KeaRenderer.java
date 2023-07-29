package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.KeaModel;
import com.github.kmfisk.zawaessentials.entity.KeaEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class KeaRenderer extends ZawaMobRenderer<KeaEntity, KeaModel> {
    public KeaRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new KeaModel.Adult(), new KeaModel.Flying(), new KeaModel.Child(), 1.0F); // TODO
    }
}
