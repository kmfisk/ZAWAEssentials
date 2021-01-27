package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelCongoGrayParrot;
import com.github.kmfisk.essentials.client.model.ModelParrotBaseBaby;
import com.github.kmfisk.essentials.entity.EntityCongoGrayParrot;
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
public class RenderCongoGrayParrot extends RenderLivingZAWA<EntityCongoGrayParrot> implements IBabyModel<EntityCongoGrayParrot> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderCongoGrayParrot(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelCongoGrayParrot(), 0.5F);
        CONTAINER.addResource("textures/entity/congo_gray_parrot/congogray_1.png");
        CONTAINER.addResource("textures/entity/congo_gray_parrot/congogray_2.png");
        CONTAINER.addResource("textures/entity/congo_gray_parrot/congogray_3.png");
        CONTAINER.addResource("blink", "textures/entity/congo_gray_parrot/congogray_blink.png");
        CONTAINER.addResource("baby", "textures/entity/congo_gray_parrot/congogray_baby.png");
        CONTAINER.addResource("babyBlink", "textures/entity/congo_gray_parrot/congogray_blink_baby.png");
    }

    @Override
    protected void preRenderCallback(EntityCongoGrayParrot entitylivingbaseIn, float partialTickTime) {
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
    protected ResourceLocation getEntityTexture(EntityCongoGrayParrot entity) {
        return CONTAINER.get(AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityCongoGrayParrot entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", 0);
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelParrotBaseBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityCongoGrayParrot entity) {
        return CONTAINER.get("baby", 0);
    }
}
