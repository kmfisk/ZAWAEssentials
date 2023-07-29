package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.GreaterPrairieChickenModel;
import com.github.kmfisk.zawaessentials.entity.GreaterPrairieChickenEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class GreaterPrairieChickenRenderer extends ZawaMobRenderer<GreaterPrairieChickenEntity, GreaterPrairieChickenModel> {
    public GreaterPrairieChickenRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new GreaterPrairieChickenModel.Adult(), new GreaterPrairieChickenModel.Child(), 1.0F); // TODO
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
