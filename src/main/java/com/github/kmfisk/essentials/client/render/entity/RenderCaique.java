package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelHawkHeadedParrot;
import com.github.kmfisk.essentials.client.model.ModelParrotBaseBaby;
import com.github.kmfisk.essentials.entity.EntityCaique;
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
public class RenderCaique extends RenderLivingZAWA<EntityCaique> implements IBabyModel<EntityCaique> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderCaique(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelHawkHeadedParrot(), 0.5F);
        CONTAINER.addResource("textures/entity/caique/caique_1.png");
        CONTAINER.addResource("textures/entity/caique/caique_2.png");
        CONTAINER.addResource("blink", "textures/entity/caique/caique_blink.png");
        CONTAINER.addResource("baby", "textures/entity/caique/caique_baby.png"); //todo babyBlink
    }

    @Override
    protected void preRenderCallback(EntityCaique entitylivingbaseIn, float partialTickTime) {
        float scale = 0.75F; //todo screenshot next to hawkhead
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
    protected ResourceLocation getEntityTexture(EntityCaique entity) {
        return CONTAINER.get(AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityCaique entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", 0);
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelParrotBaseBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityCaique entity) {
        return CONTAINER.get("baby", 0);
    }
}
