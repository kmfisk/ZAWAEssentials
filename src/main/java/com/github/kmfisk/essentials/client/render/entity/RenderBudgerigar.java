package com.github.kmfisk.essentials.client.render.entity;

import com.github.kmfisk.essentials.client.model.ModelBudgerigar;
import com.github.kmfisk.essentials.client.model.ModelBudgerigarBaby;
import com.github.kmfisk.essentials.entity.EntityBudgerigar;
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
public class RenderBudgerigar extends RenderLivingZAWA<EntityBudgerigar> implements IBabyModel<EntityBudgerigar> {
    public static final ResourceContainer CONTAINER = new ResourceContainer("essentials");

    public RenderBudgerigar(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelBudgerigar(), 0.5F);
        CONTAINER.addResource("textures/entity/budgerigar/budgerigar_f.png");
        CONTAINER.addResource("male", "textures/entity/budgerigar/budgerigar_m.png");
        CONTAINER.addResource("blink", "textures/entity/budgerigar/budgerigar_blink.png");
        CONTAINER.addResource("baby", "textures/entity/budgerigar/budgerigar_baby.png");
        CONTAINER.addResource("babyBlink", "textures/entity/budgerigar/budgerigar_blink_baby.png");
    }

    @Override
    protected void preRenderCallback(EntityBudgerigar entitylivingbaseIn, float partialTickTime) {
        float scale = 0.4F;
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
    protected ResourceLocation getEntityTexture(EntityBudgerigar entity) {
        return ModuleManager.GENDER.getGender(entity).equals(Gender.MALE) ? CONTAINER.get("male", 0) : CONTAINER.get(0);
    }

    @Override
    public ResourceLocation getBlinkTexture(EntityBudgerigar entity) {
        return entity.isChild() ? CONTAINER.get("babyBlink", 0) : CONTAINER.get("blink", 0);
    }

    @Override
    public ModelBase getBabyModel() {
        return new ModelBudgerigarBaby();
    }

    @Override
    public ResourceLocation getBabyTexture(EntityBudgerigar entity) {
        return CONTAINER.get("baby", 0);
    }
}
