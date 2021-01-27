package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelEclectus;
import com.github.kmfisk.essentials.client.model.ModelParrotBaseBaby;
import com.github.kmfisk.essentials.entity.EntityEclectusParrot;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.soggymustache.bookworm.client.render.ResourceContainer;
import net.soggymustache.bookworm.common.entity.data.Gender;
import org.zawamod.client.IBabyModel;
import org.zawamod.client.render.entity.base.RenderLivingZAWA;
import org.zawamod.entity.core.modules.ModuleManager;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class RenderEclectusParrot extends RenderLivingZAWA<EntityEclectusParrot> implements IBabyModel<EntityEclectusParrot> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderEclectusParrot(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelEclectus(), 0.5F);
        CONTAINER.addResource("textures/entity/eclectus/eclectus_f.png");
        CONTAINER.addResource("male", "textures/entity/eclectus/eclectus_m.png");
        CONTAINER.addResource("blink", "textures/entity/eclectus/eclectus_blink_f.png");
        CONTAINER.addResource("blink", "textures/entity/eclectus/eclectus_blink_m.png"); //todo baby, babyBlink
    }

    @Override
    protected void preRenderCallback(EntityEclectusParrot entitylivingbaseIn, float partialTickTime) {
        float scale = 1.0F; //todo
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
    protected ResourceLocation getEntityTexture(EntityEclectusParrot entity) {
        return ModuleManager.GENDER.getGender(entity).equals(Gender.MALE) ? CONTAINER.get("male", 0) : CONTAINER.get(0);
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityEclectusParrot entity) {
        if (entity.isChild())
            return CONTAINER.get("babyBlink", 0);
        return ModuleManager.GENDER.getGender(entity).equals(Gender.MALE) ? CONTAINER.get("blink", 1) : CONTAINER.get("blink", 0);
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelParrotBaseBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityEclectusParrot entity) {
        return CONTAINER.get("baby", 0);
    }
}
