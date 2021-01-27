package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelChinchilla;
import com.github.kmfisk.essentials.client.model.ModelChinchillaBaby;
import com.github.kmfisk.essentials.entity.EntityChinchilla;
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
public class RenderChinchilla extends RenderLivingZAWA<EntityChinchilla> implements IBabyModel<EntityChinchilla> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderChinchilla(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelChinchilla(), 0.5F);
        CONTAINER.addResource("textures/entity/chinchilla/chinchilla_1.png");
        CONTAINER.addResource("textures/entity/chinchilla/chinchilla_2.png");
        CONTAINER.addResource("textures/entity/chinchilla/chinchilla_mosaic.png"); //todo special variant?
        CONTAINER.addResource("blink", "textures/entity/chinchilla/chinchilla_blink.png");
        CONTAINER.addResource("baby", "textures/entity/chinchilla/chinchilla_baby.png");
        CONTAINER.addResource("babyBlink", "textures/entity/chinchilla/chinchilla_blink_baby.png");
    }

    @Override
    protected void preRenderCallback(EntityChinchilla entitylivingbaseIn, float partialTickTime) {
        float scale = 0.8F;
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
    protected ResourceLocation getEntityTexture(EntityChinchilla entity) {
        return CONTAINER.get(AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityChinchilla entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", 0);
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelChinchillaBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityChinchilla entity) {
        return CONTAINER.get("baby", 0);
    }
}
