package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelParrotBase;
import com.github.kmfisk.essentials.client.model.ModelParrotBaseBaby;
import com.github.kmfisk.essentials.entity.EntityConure;
import com.github.kmfisk.essentials.entity.EntityRosella;
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
public class RenderRosella extends RenderLivingZAWA<EntityRosella> implements IBabyModel<EntityRosella> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderRosella(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelParrotBase(), 0.5F);
        CONTAINER.addResource("textures/entity/rosella/rosella_1.png");
        CONTAINER.addResource("textures/entity/rosella/rosella_2.png");
        CONTAINER.addResource("textures/entity/rosella/rosella_3.png");
        CONTAINER.addResource("textures/entity/rosella/rosella_4.png");
        CONTAINER.addResource("textures/entity/rosella/rosella_5.png");
        CONTAINER.addResource("blink", "textures/entity/rosella/rosella_blink_1.png");
        CONTAINER.addResource("blink", "textures/entity/rosella/rosella_blink_2.png");
        CONTAINER.addResource("blink", "textures/entity/rosella/rosella_blink_3.png");
        CONTAINER.addResource("blink", "textures/entity/rosella/rosella_blink_4.png");
        CONTAINER.addResource("blink", "textures/entity/rosella/rosella_blink_5.png");
        CONTAINER.addResource("baby", "textures/entity/rosella/rosella_baby.png");
        CONTAINER.addResource("babyBlink", "textures/entity/rosella/rosella_blink_baby.png");
    }

    @Override
    protected void preRenderCallback(EntityRosella entitylivingbaseIn, float partialTickTime) {
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
    protected ResourceLocation getEntityTexture(EntityRosella entity) {
        return CONTAINER.get(AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityRosella entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelParrotBaseBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityRosella entity) {
        return CONTAINER.get("baby", 0);
    }
}
