package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelHawaiiOo;
import com.github.kmfisk.essentials.client.model.ModelParrotBaseBaby;
import com.github.kmfisk.essentials.entity.EntityHawaiiOo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.client.render.ResourceContainer;
import org.zawamod.client.IBabyModel;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.base.AbstractZawaLand;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class RenderHawaiiOo extends RenderLivingZAWA<EntityHawaiiOo> implements IBabyModel<EntityHawaiiOo> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderHawaiiOo(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelHawaiiOo(), 0.5F);
        CONTAINER.addResource("textures/entity/hawaii_oo/hawaiioo_1.png");
        CONTAINER.addResource("textures/entity/hawaii_oo/hawaiioo_2.png");
        CONTAINER.addResource("textures/entity/hawaii_oo/hawaiioo_3.png");
        CONTAINER.addResource("textures/entity/hawaii_oo/hawaiioo_4.png");
        CONTAINER.addResource("blink", "textures/entity/hawaii_oo/hawaiioo_blink.png"); //todo baby, babyBlink
    }

    @Override
    protected void preRenderCallback(EntityHawaiiOo entitylivingbaseIn, float partialTickTime) {
        float scale = 0.7F;
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
    protected ResourceLocation getEntityTexture(EntityHawaiiOo entity) {
        return CONTAINER.get(AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityHawaiiOo entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", 0);
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelParrotBaseBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityHawaiiOo entity) {
        return CONTAINER.get("baby", 0);
    }
}
