package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelParrotBase;
import com.github.kmfisk.essentials.client.model.ModelParrotBaseBaby;
import com.github.kmfisk.essentials.entity.EntityConure;
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
public class RenderConure extends RenderLivingZAWA<EntityConure> implements IBabyModel<EntityConure> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderConure(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelParrotBase(), 0.5F);
        CONTAINER.addResource("textures/entity/conure/conure_1.png");
        CONTAINER.addResource("textures/entity/conure/conure_2.png");
        CONTAINER.addResource("textures/entity/conure/conure_3.png");
        CONTAINER.addResource("textures/entity/conure/conure_4.png");
        CONTAINER.addResource("textures/entity/conure/conure_5.png");
        CONTAINER.addResource("textures/entity/conure/conure_6.png");
        CONTAINER.addResource("blink", "textures/entity/conure/conure_blink.png");
        CONTAINER.addResource("baby", "textures/entity/conure/conure_baby.png");
        CONTAINER.addResource("babyBlink", "textures/entity/conure/conure_blink_baby.png");
    }

    @Override
    protected void preRenderCallback(EntityConure entitylivingbaseIn, float partialTickTime) {
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
    protected ResourceLocation getEntityTexture(EntityConure entity) {
        return CONTAINER.get(AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityConure entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", 0);
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelParrotBaseBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityConure entity) {
        return CONTAINER.get("baby", 0);
    }
}
