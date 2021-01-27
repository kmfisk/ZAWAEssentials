package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelKea;
import com.github.kmfisk.essentials.client.model.ModelParrotBaseBaby;
import com.github.kmfisk.essentials.entity.EntityKea;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.client.render.ResourceContainer;
import org.zawamod.client.IBabyModel;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class RenderKea extends RenderLivingZAWA<EntityKea> implements IBabyModel<EntityKea> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderKea(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelKea(), 0.5F);
        CONTAINER.addResource("textures/entity/kea/kea_1.png");
        CONTAINER.addResource("blink", "textures/entity/kea/kea_blink.png"); //todo baby, babyBlink
    }

    @Override
    protected void preRenderCallback(EntityKea entitylivingbaseIn, float partialTickTime) {
        float scale = 1.0F;
        GlStateManager.scale(scale, scale, scale);
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }

    @Override
    public ResourceContainer getResourceContainer() {
        return CONTAINER;
    }

    @Override
    public boolean canBlink() {
        return true;
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityKea entity) {
        return CONTAINER.get(0);
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityKea entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", 0);
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelParrotBaseBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityKea entity) {
        return CONTAINER.get("baby", 0);
    }
}
