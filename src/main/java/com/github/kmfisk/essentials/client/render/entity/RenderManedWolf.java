package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelManedWolf;
import com.github.kmfisk.essentials.client.model.ModelManedWolfBaby;
import com.github.kmfisk.essentials.entity.EntityManedWolf;
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
public class RenderManedWolf extends RenderLivingZAWA<EntityManedWolf> implements IBabyModel<EntityManedWolf> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderManedWolf(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelManedWolf(), 0.5F);
        CONTAINER.addResource("textures/entity/maned_wolf/manedwolf_1.png");
        CONTAINER.addResource("textures/entity/maned_wolf/manedwolf_2.png");
        CONTAINER.addResource("textures/entity/maned_wolf/manedwolf_3.png");
        CONTAINER.addResource("blink", "textures/entity/maned_wolf/manedwolf_blink_1.png");
        CONTAINER.addResource("blink", "textures/entity/maned_wolf/manedwolf_blink_2.png");
        CONTAINER.addResource("blink", "textures/entity/maned_wolf/manedwolf_blink_3.png");
        CONTAINER.addResource("baby", "textures/entity/maned_wolf/manedwolf_baby.png");
        CONTAINER.addResource("babyBlink", "textures/entity/maned_wolf/manedwolf_blink_baby.png");
    }

    @Override
    protected void preRenderCallback(EntityManedWolf entitylivingbaseIn, float partialTickTime) {
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
    protected ResourceLocation getEntityTexture(EntityManedWolf entity) {
        return CONTAINER.get(AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityManedWolf entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelManedWolfBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityManedWolf entity) {
        return CONTAINER.get("baby", 0);
    }
}
