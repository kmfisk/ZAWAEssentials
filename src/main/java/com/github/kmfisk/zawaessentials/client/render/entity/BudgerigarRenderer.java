package com.github.kmfisk.zawaessentials.client.render.entity;

import com.github.kmfisk.zawaessentials.client.model.BudgerigarModel;
import com.github.kmfisk.zawaessentials.entity.BudgerigarEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import org.zawamod.zawa.client.renderer.entity.ZawaMobRenderer;

public class BudgerigarRenderer extends ZawaMobRenderer<BudgerigarEntity, BudgerigarModel> {
    public BudgerigarRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new BudgerigarModel.Adult(), new BudgerigarModel.Flying(), new BudgerigarModel.Adult(), 1.0F); // TODO
        // todo: male texture overlay
    }

    @Override
    protected boolean hasBabyVariants(BudgerigarEntity entity) {
        return false;
    }
}
