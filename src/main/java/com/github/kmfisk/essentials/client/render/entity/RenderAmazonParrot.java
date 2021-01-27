package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelHawkHeadedParrot;
import com.github.kmfisk.essentials.client.model.ModelParrotBaseBaby;
import com.github.kmfisk.essentials.entity.EntityAmazonParrot;
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
import org.zawamod.entity.core.modules.ModuleManager;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class RenderAmazonParrot extends RenderLivingZAWA<EntityAmazonParrot> implements IBabyModel<EntityAmazonParrot> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderAmazonParrot(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelHawkHeadedParrot(), 0.5F);
        CONTAINER.addResource("textures/entity/amazon/amazon_1.png");
        CONTAINER.addResource("textures/entity/amazon/amazon_2.png"); //todo: blink, baby, babyBlink
    }

    @Override
    protected void preRenderCallback(EntityAmazonParrot entitylivingbaseIn, float partialTickTime) {
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
    protected ResourceLocation getEntityTexture(EntityAmazonParrot entity) {
        return CONTAINER.get(AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityAmazonParrot entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", 0);
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelParrotBaseBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityAmazonParrot entity) {
        return CONTAINER.get("baby", 0);
    }
}
