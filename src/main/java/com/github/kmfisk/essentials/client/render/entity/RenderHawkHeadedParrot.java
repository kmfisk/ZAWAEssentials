package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelHawkHeadedParrot;
import com.github.kmfisk.essentials.client.model.ModelParrotBaseBaby;
import com.github.kmfisk.essentials.entity.EntityHawkHeadedParrot;
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
public class RenderHawkHeadedParrot extends RenderLivingZAWA<EntityHawkHeadedParrot> implements IBabyModel<EntityHawkHeadedParrot> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderHawkHeadedParrot(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelHawkHeadedParrot(), 0.5F);
        CONTAINER.addResource("textures/entity/hawk_headed_parrot/hawkhead_1.png");
        CONTAINER.addResource("textures/entity/hawk_headed_parrot/hawkhead_2.png");
        CONTAINER.addResource("textures/entity/hawk_headed_parrot/hawkhead_3.png");
        CONTAINER.addResource("blink", "textures/entity/hawk_headed_parrot/hawkhead_blink_1.png");
        CONTAINER.addResource("blink", "textures/entity/hawk_headed_parrot/hawkhead_blink_2.png");
        CONTAINER.addResource("blink", "textures/entity/hawk_headed_parrot/hawkhead_blink_3.png");
        CONTAINER.addResource("baby", "textures/entity/hawk_headed_parrot/hawkhead_baby.png");
        CONTAINER.addResource("babyBlink", "textures/entity/hawk_headed_parrot/hawkhead_blink_baby.png");
    }

    @Override
    protected void preRenderCallback(EntityHawkHeadedParrot entitylivingbaseIn, float partialTickTime) {
        float scale = 0.75F;
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
    protected ResourceLocation getEntityTexture(EntityHawkHeadedParrot entity) {
        return CONTAINER.get(AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityHawkHeadedParrot entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelParrotBaseBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityHawkHeadedParrot entity) {
        return CONTAINER.get("baby", 0);
    }
}
