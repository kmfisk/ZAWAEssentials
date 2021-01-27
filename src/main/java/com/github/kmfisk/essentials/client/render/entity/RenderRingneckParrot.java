package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelParrotBase;
import com.github.kmfisk.essentials.client.model.ModelParrotBaseBaby;
import com.github.kmfisk.essentials.entity.EntityRingneckParrot;
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
import org.zawamod.entity.base.AbstractZawaLand;
import org.zawamod.entity.core.modules.ModuleManager;

import javax.annotation.Nullable;

@SideOnly(Side.CLIENT)
public class RenderRingneckParrot extends RenderLivingZAWA<EntityRingneckParrot> implements IBabyModel<EntityRingneckParrot> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderRingneckParrot(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelParrotBase(), 0.5F);
        CONTAINER.addResource("textures/entity/ringneck_parrot/ringneck_1f.png");
        CONTAINER.addResource("textures/entity/ringneck_parrot/ringneck_2f.png");
        CONTAINER.addResource("textures/entity/ringneck_parrot/ringneck_3f.png");
        CONTAINER.addResource("textures/entity/ringneck_parrot/ringneck_4f.png");
        CONTAINER.addResource("male", "textures/entity/ringneck_parrot/ringneck_1m.png");
        CONTAINER.addResource("male", "textures/entity/ringneck_parrot/ringneck_2m.png");
        CONTAINER.addResource("male", "textures/entity/ringneck_parrot/ringneck_3m.png");
        CONTAINER.addResource("male", "textures/entity/ringneck_parrot/ringneck_4m.png");
        CONTAINER.addResource("blink", "textures/entity/ringneck_parrot/ringneck_blink_1.png");
        CONTAINER.addResource("blink", "textures/entity/ringneck_parrot/ringneck_blink_2.png");
        CONTAINER.addResource("blink", "textures/entity/ringneck_parrot/ringneck_blink_3.png"); //todo missing
        CONTAINER.addResource("blink", "textures/entity/ringneck_parrot/ringneck_blink_4.png");
        CONTAINER.addResource("baby", "textures/entity/ringneck_parrot/ringneck_baby.png");
        CONTAINER.addResource("babyBlink", "textures/entity/ringneck_parrot/ringneck_blink_baby.png");
    }

    @Override
    protected void preRenderCallback(EntityRingneckParrot entitylivingbaseIn, float partialTickTime) {
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
    protected ResourceLocation getEntityTexture(EntityRingneckParrot entity) {
        return ModuleManager.GENDER.getGender(entity).equals(Gender.MALE) ? CONTAINER.get("male", AbstractZawaLand.getVariant(entity)) : CONTAINER.get(AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityRingneckParrot entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelParrotBaseBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityRingneckParrot entity) {
        return CONTAINER.get("baby", 0);
    }
}
