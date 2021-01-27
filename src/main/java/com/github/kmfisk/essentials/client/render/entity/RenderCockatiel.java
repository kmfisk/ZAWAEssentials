package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelCockatiel;
import com.github.kmfisk.essentials.client.model.ModelParrotBaseBaby;
import com.github.kmfisk.essentials.entity.EntityCockatiel;
import com.github.kmfisk.essentials.entity.EntityConure;
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
public class RenderCockatiel extends RenderLivingZAWA<EntityCockatiel> implements IBabyModel<EntityCockatiel> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderCockatiel(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelCockatiel(), 0.5F);
        CONTAINER.addResource("textures/entity/cockatiel/cockatiel_f.png");
        CONTAINER.addResource("male", "textures/entity/cockatiel/cockatiel_m.png");
        /*CONTAINER.addResource("textures/entity/cockatiel/cockatiel_cinnamon.png");
        CONTAINER.addResource("textures/entity/cockatiel/cockatiel_cinnpied.png");
        CONTAINER.addResource("textures/entity/cockatiel/cockatiel_cinnwhiteface.png");
        CONTAINER.addResource("textures/entity/cockatiel/cockatiel_lutino.png");
        CONTAINER.addResource("textures/entity/cockatiel/cockatiel_pied.png");
        CONTAINER.addResource("textures/entity/cockatiel/cockatiel_white.png");
        CONTAINER.addResource("textures/entity/cockatiel/cockatiel_whiteface.png");
        CONTAINER.addResource("textures/entity/cockatiel/cockatiel_ylutino.png");*/ //todo
        CONTAINER.addResource("blink", "textures/entity/cockatiel/cockatiel_blink.png");
        CONTAINER.addResource("baby", "textures/entity/cockatiel/cockatiel_baby.png");
        CONTAINER.addResource("babyBlink", "textures/entity/cockatiel/cockatiel_blink_baby.png");
    }

    @Override
    protected void preRenderCallback(EntityCockatiel entitylivingbaseIn, float partialTickTime) {
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
    protected ResourceLocation getEntityTexture(EntityCockatiel entity) {
        return ModuleManager.GENDER.getGender(entity).equals(Gender.MALE) ? CONTAINER.get("male", 0) : CONTAINER.get(0);
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityCockatiel entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", 0);
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelParrotBaseBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityCockatiel entity) {
        return CONTAINER.get("baby", 0);
    }
}
