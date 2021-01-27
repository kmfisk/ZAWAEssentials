package com.github.kmfisk.essentials.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

/**
 * ChinchillaBaby - fisk
 * Created using Tabula 7.1.0
 */
public class ModelChinchillaBaby extends ZAWAModelBase {
    public BookwormModelRenderer Body;
    public BookwormModelRenderer Chest;
    public BookwormModelRenderer ThighLeft;
    public BookwormModelRenderer ThighRight;
    public BookwormModelRenderer Belly;
    public BookwormModelRenderer Tail1;
    public BookwormModelRenderer Neck;
    public BookwormModelRenderer ArmLeft;
    public BookwormModelRenderer ArmRight;
    public BookwormModelRenderer Head;
    public BookwormModelRenderer Snout;
    public BookwormModelRenderer EarLeft;
    public BookwormModelRenderer EarRight;
    public BookwormModelRenderer TopSnout;
    public BookwormModelRenderer Mouth;
    public BookwormModelRenderer HandLeft;
    public BookwormModelRenderer HandLeft_1;
    public BookwormModelRenderer FootLeft;
    public BookwormModelRenderer FootRight;
    public BookwormModelRenderer Tail2;

    public ModelChinchillaBaby() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.ArmRight = new BookwormModelRenderer(this, 10, 8, "ArmRight");
        this.ArmRight.mirror = true;
        this.ArmRight.setRotationPoint(-0.8F, 1.7F, -1.2F);
        this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(ArmRight, -0.136659280431156F, 0.0F, 0.0F);
        this.Snout = new BookwormModelRenderer(this, 0, 24, "Snout");
        this.Snout.setRotationPoint(0.0F, 0.1F, -2.5F);
        this.Snout.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Snout, -0.136659280431156F, 0.0F, 0.0F);
        this.ThighLeft = new BookwormModelRenderer(this, 8, 12, "ThighLeft");
        this.ThighLeft.setRotationPoint(2.2F, -1.6F, 0.7F);
        this.ThighLeft.addBox(-2.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighLeft, 0.091106186954104F, 0.0F, 0.0F);
        this.TopSnout = new BookwormModelRenderer(this, 0, 26, "TopSnout");
        this.TopSnout.setRotationPoint(0.0F, 0.0F, -0.3F);
        this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(TopSnout, 0.7740535232594852F, 0.0F, 0.0F);
        this.FootLeft = new BookwormModelRenderer(this, 9, 17, "FootLeft");
        this.FootLeft.setRotationPoint(-0.6F, 2.8F, 0.3F);
        this.FootLeft.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.EarRight = new BookwormModelRenderer(this, 8, 26, "EarRight");
        this.EarRight.mirror = true;
        this.EarRight.setRotationPoint(0.3F, 0.3F, -0.5F);
        this.EarRight.addBox(-2.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(EarRight, 0.0F, 0.36425021489121656F, -0.36425021489121656F);
        this.Mouth = new BookwormModelRenderer(this, 6, 24, "Mouth");
        this.Mouth.setRotationPoint(0.0F, 1.3F, 1.0F);
        this.Mouth.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Mouth, -0.31869712141416456F, 0.0F, 0.0F);
        this.Neck = new BookwormModelRenderer(this, 0, 13, "Neck");
        this.Neck.setRotationPoint(0.0F, 1.5F, -1.3F);
        this.Neck.addBox(-1.0F, -1.5F, -2.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Neck, -0.40980330836826856F, 0.0F, 0.0F);
        this.HandLeft_1 = new BookwormModelRenderer(this, 8, 6, "HandLeft_1");
        this.HandLeft_1.setRotationPoint(0.0F, 1.6F, -0.2F);
        this.HandLeft_1.addBox(-0.5F, 0.0F, -0.7F, 1, 1, 1, 0.0F);
        this.setRotateAngle(HandLeft_1, 0.091106186954104F, 0.0F, 0.0F);
        this.Tail2 = new BookwormModelRenderer(this, 14, 8, "Tail2");
        this.Tail2.setRotationPoint(0.0F, 2.0F, 2.0F);
        this.Tail2.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(Tail2, 0.7740535232594852F, 0.136659280431156F, 0.0F);
        this.ThighRight = new BookwormModelRenderer(this, 8, 12, "ThighRight");
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(-2.2F, -1.6F, 0.7F);
        this.ThighRight.addBox(0.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighRight, 0.091106186954104F, 0.0F, 0.0F);
        this.FootRight = new BookwormModelRenderer(this, 9, 17, "FootRight");
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.6F, 2.8F, 0.3F);
        this.FootRight.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
        this.Chest = new BookwormModelRenderer(this, 0, 7, "Chest");
        this.Chest.setRotationPoint(0.0F, -1.9F, -1.3F);
        this.Chest.addBox(-1.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(Chest, 0.18203784098300857F, 0.0F, 0.0F);
        this.Belly = new BookwormModelRenderer(this, 14, 0, "Belly");
        this.Belly.setRotationPoint(0.0F, 1.4F, -1.9F);
        this.Belly.addBox(-1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Belly, -0.091106186954104F, 0.0F, 0.0F);
        this.HandLeft = new BookwormModelRenderer(this, 8, 6, "HandLeft");
        this.HandLeft.setRotationPoint(0.0F, 1.6F, -0.2F);
        this.HandLeft.addBox(-0.5F, 0.0F, -0.7F, 1, 1, 1, 0.0F);
        this.setRotateAngle(HandLeft, 0.091106186954104F, 0.0F, 0.0F);
        this.Head = new BookwormModelRenderer(this, 0, 18, "Head");
        this.Head.setRotationPoint(0.0F, -0.2F, -1.5F);
        this.Head.addBox(-1.5F, -1.5F, -2.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Head, 0.40980330836826856F, 0.0F, 0.0F);
        this.EarLeft = new BookwormModelRenderer(this, 8, 26, "EarLeft");
        this.EarLeft.setRotationPoint(-0.3F, 0.3F, -0.5F);
        this.EarLeft.addBox(0.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(EarLeft, 0.0F, -0.36425021489121656F, 0.36425021489121656F);
        this.ArmLeft = new BookwormModelRenderer(this, 10, 8, "ArmLeft");
        this.ArmLeft.setRotationPoint(0.8F, 1.7F, -1.2F);
        this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(ArmLeft, -0.136659280431156F, 0.0F, 0.0F);
        this.Body = new BookwormModelRenderer(this, 0, 0, "Body");
        this.Body.setRotationPoint(0.0F, 21.8F, 0.0F);
        this.Body.addBox(-2.0F, -2.0F, -1.5F, 4, 3, 3, 0.0F);
        this.setRotateAngle(Body, -0.091106186954104F, 0.0F, 0.0F);
        this.Tail1 = new BookwormModelRenderer(this, 14, 4, "Tail1");
        this.Tail1.setRotationPoint(0.0F, -1.0F, 1.5F);
        this.Tail1.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(Tail1, -0.40980330836826856F, 0.0F, 0.0F);
        this.Chest.addChild(this.ArmRight);
        this.Head.addChild(this.Snout);
        this.Body.addChild(this.ThighLeft);
        this.Snout.addChild(this.TopSnout);
        this.ThighLeft.addChild(this.FootLeft);
        this.Head.addChild(this.EarRight);
        this.Snout.addChild(this.Mouth);
        this.Chest.addChild(this.Neck);
        this.ArmRight.addChild(this.HandLeft_1);
        this.Tail1.addChild(this.Tail2);
        this.Body.addChild(this.ThighRight);
        this.ThighRight.addChild(this.FootRight);
        this.Body.addChild(this.Chest);
        this.Body.addChild(this.Belly);
        this.ArmLeft.addChild(this.HandLeft);
        this.Neck.addChild(this.Head);
        this.Head.addChild(this.EarLeft);
        this.Chest.addChild(this.ArmLeft);
        this.Body.addChild(this.Tail1);
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
