package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.MohoModel;
import com.github.kmfisk.zawaessentials.entity.MohoEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class MohoRenderer extends ZawaMobRenderer<MohoEntity, MohoModel> {
    public MohoRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new MohoModel.Adult(), new MohoModel.Flying(), new MohoModel.Child(), 1.0F); // TODO
    }

    @Override
    protected boolean hasBabyVariants(MohoEntity entity) {
        return false;
    }
}
