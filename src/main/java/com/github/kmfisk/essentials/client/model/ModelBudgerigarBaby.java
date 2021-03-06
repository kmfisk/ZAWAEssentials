package com.github.kmfisk.essentials.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

/**
 * CongoGrayParrot_Baby - fisk
 * Created using Tabula 7.1.0
 */
public class ModelBudgerigarBaby extends ZAWAModelBase {
    public BookwormModelRenderer Body;
    public BookwormModelRenderer Neck;
    public BookwormModelRenderer TailBase;
    public BookwormModelRenderer WingLeft;
    public BookwormModelRenderer WingRight;
    public BookwormModelRenderer LegLeft;
    public BookwormModelRenderer LegRight;
    public BookwormModelRenderer Head;
    public BookwormModelRenderer Beak;
    public BookwormModelRenderer BeakTip;
    public BookwormModelRenderer Jaw;
    public BookwormModelRenderer CereLeft;
    public BookwormModelRenderer CereRight;
    public BookwormModelRenderer Tail;

    public ModelBudgerigarBaby() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.Tail = new BookwormModelRenderer(this, 9, 13, "Tail");
        this.Tail.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Tail.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F);
        this.CereLeft = new BookwormModelRenderer(this, 0, 2, "CereLeft");
        this.CereLeft.setRotationPoint(0.4F, 0.9F, -1.4F);
        this.CereLeft.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(CereLeft, 0.045553093477052F, 0.0F, 0.136659280431156F);
        this.WingRight = new BookwormModelRenderer(this, 8, 19, "WingRight");
        this.WingRight.mirror = true;
        this.WingRight.setRotationPoint(-1.4F, 0.0F, -1.8F);
        this.WingRight.addBox(-1.0F, -1.5F, 0.0F, 1, 3, 4, 0.0F);
        this.Neck = new BookwormModelRenderer(this, 0, 8, "Neck");
        this.Neck.setRotationPoint(0.0F, -0.2F, -1.4F);
        this.Neck.addBox(-1.0F, -2.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Neck, 1.0927506446736497F, 0.0F, 0.0F);
        this.LegRight = new BookwormModelRenderer(this, 0, 23, "LegRight");
        this.LegRight.setRotationPoint(-1.2F, 1.5F, 0.0F);
        this.LegRight.addBox(-0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LegRight, 0.4553564018453205F, 0.0F, 0.0F);
        this.Head = new BookwormModelRenderer(this, 0, 13, "Head");
        this.Head.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Head.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Head, -0.5462880558742251F, 0.0F, 0.0F);
        this.TailBase = new BookwormModelRenderer(this, 8, 8, "TailBase");
        this.TailBase.setRotationPoint(0.0F, 0.1F, 1.8F);
        this.TailBase.addBox(-1.5F, -1.5F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(TailBase, 0.18203784098300857F, 0.0F, 0.0F);
        this.CereRight = new BookwormModelRenderer(this, 0, 2, "CereRight");
        this.CereRight.mirror = true;
        this.CereRight.setRotationPoint(-0.4F, 0.9F, -1.4F);
        this.CereRight.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(CereRight, 0.045553093477052F, 0.0F, -0.136659280431156F);
        this.Jaw = new BookwormModelRenderer(this, 0, 0, "Jaw");
        this.Jaw.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.Jaw.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.WingLeft = new BookwormModelRenderer(this, 8, 19, "WingLeft");
        this.WingLeft.setRotationPoint(1.4F, 0.0F, -1.8F);
        this.WingLeft.addBox(0.0F, -1.5F, 0.0F, 1, 3, 4, 0.0F);
        this.Body = new BookwormModelRenderer(this, 0, 0, "Body");
        this.Body.setRotationPoint(0.0F, 21.2F, 0.0F);
        this.Body.addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Body, -0.4553564018453205F, 0.0F, 0.0F);
        this.LegLeft = new BookwormModelRenderer(this, 0, 23, "LegLeft");
        this.LegLeft.setRotationPoint(1.2F, 1.5F, 0.0F);
        this.LegLeft.addBox(-0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LegLeft, 0.4553564018453205F, 0.0F, 0.0F);
        this.Beak = new BookwormModelRenderer(this, 0, 19, "Beak");
        this.Beak.setRotationPoint(0.0F, -1.1F, -1.0F);
        this.Beak.addBox(-1.0F, 0.0F, -1.25F, 2, 2, 2, 0.0F);
        this.BeakTip = new BookwormModelRenderer(this, 12, 16, "BeakTip");
        this.BeakTip.setRotationPoint(0.0F, 0.5F, -0.5F);
        this.BeakTip.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
        this.TailBase.addChild(this.Tail);
        this.Beak.addChild(this.CereLeft);
        this.Body.addChild(this.WingRight);
        this.Body.addChild(this.Neck);
        this.Body.addChild(this.LegRight);
        this.Neck.addChild(this.Head);
        this.Body.addChild(this.TailBase);
        this.Beak.addChild(this.CereRight);
        this.Beak.addChild(this.Jaw);
        this.Body.addChild(this.WingLeft);
        this.Body.addChild(this.LegLeft);
        this.Head.addChild(this.Beak);
        this.Beak.addChild(this.BeakTip);
        this.save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
