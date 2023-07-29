package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.ParrotBaseModel;
import com.github.kmfisk.zawaessentials.entity.RingneckParrotEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class RingneckParrotRenderer extends ZawaMobRenderer<RingneckParrotEntity, ParrotBaseModel<RingneckParrotEntity>> {
    public RingneckParrotRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new ParrotBaseModel.Adult<>(), new ParrotBaseModel.Flying<>(), new ParrotBaseModel.Child<>(), 1.0F); // TODO
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
