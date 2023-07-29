package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.CockatielModel;
import com.github.kmfisk.zawaessentials.entity.CockatielEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class CockatielRenderer extends ZawaMobRenderer<CockatielEntity, CockatielModel> {
    public CockatielRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new CockatielModel.Adult(), new CockatielModel.Flying(), new CockatielModel.Child(), 1.0F); // TODO
    }

    @Override
    protected boolean hasBabyVariants(CockatielEntity entity) {
        return false;
    }

    @Override
    protected boolean isSexuallyDimorphic() {
        return true;
    }
}
