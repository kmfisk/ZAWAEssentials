package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelKakariki;
import com.github.kmfisk.essentials.client.model.ModelParrotBaseBaby;
import com.github.kmfisk.essentials.entity.EntityKakariki;
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
public class RenderKakariki extends RenderLivingZAWA<EntityKakariki> implements IBabyModel<EntityKakariki> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderKakariki(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelKakariki(), 0.5F);
        CONTAINER.addResource("textures/entity/kakariki/kakariki_1.png");
        CONTAINER.addResource("textures/entity/kakariki/kakariki_2.png");
        CONTAINER.addResource("textures/entity/kakariki/kakariki_3.png");
        CONTAINER.addResource("baby", "textures/entity/kakariki/kakariki_baby.png");
        CONTAINER.addResource("babyBlink", "textures/entity/kakariki/kakariki_blink_baby.png"); //todo blink
    }

    @Override
    protected void preRenderCallback(EntityKakariki entitylivingbaseIn, float partialTickTime) {
        float scale = 0.6F;
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
    protected ResourceLocation getEntityTexture(EntityKakariki entity) {
        return CONTAINER.get(AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityKakariki entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", 0);
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelParrotBaseBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityKakariki entity) {
        return CONTAINER.get("baby", 0);
    }
}
