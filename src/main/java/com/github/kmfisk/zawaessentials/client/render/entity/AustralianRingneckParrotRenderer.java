package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ParrotBaseModel;
import com.github.kmfisk.zawaessentials.entity.AustralianRingneckParrotEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class AustralianRingneckParrotRenderer extends ZawaMobRenderer<AustralianRingneckParrotEntity, ParrotBaseModel<AustralianRingneckParrotEntity>> {
    public AustralianRingneckParrotRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new ParrotBaseModel.Adult<>(), new ParrotBaseModel.Flying<>(), new ParrotBaseModel.Child<>(), 1.0F); // TODO
    }
}
