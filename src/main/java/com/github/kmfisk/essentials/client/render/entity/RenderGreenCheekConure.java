package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelParrotBase;
import com.github.kmfisk.essentials.client.model.ModelParrotBaseBaby;
import com.github.kmfisk.essentials.entity.EntityGreenCheekConure;
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
public class RenderGreenCheekConure extends RenderLivingZAWA<EntityGreenCheekConure> implements IBabyModel<EntityGreenCheekConure> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderGreenCheekConure(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelParrotBase(), 0.5F);
        CONTAINER.addResource("textures/entity/green_cheek_conure/greencheek_1.png");
        CONTAINER.addResource("textures/entity/green_cheek_conure/greencheek_2.png");
        CONTAINER.addResource("textures/entity/green_cheek_conure/greencheek_3.png");
        CONTAINER.addResource("textures/entity/green_cheek_conure/greencheek_4.png");
        CONTAINER.addResource("blink", "textures/entity/conure/conure_blink.png"); //todo baby, babyBlink
    }

    @Override
    protected void preRenderCallback(EntityGreenCheekConure entitylivingbaseIn, float partialTickTime) {
        float scale = 0.65F;
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
    protected ResourceLocation getEntityTexture(EntityGreenCheekConure entity) {
        return CONTAINER.get(AbstractZawaLand.getVariant(entity));
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityGreenCheekConure entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", 0);
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelParrotBaseBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityGreenCheekConure entity) {
        return CONTAINER.get("baby", 0);
    }
}
