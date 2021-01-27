package com.github.kmfisk.essentials.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

/**
 * ManedWolfBaby - fisk
 * Created using Tabula 7.1.0
 */
public class ModelManedWolfBaby extends ZAWAModelBase {
    public BookwormModelRenderer Chest;
    public BookwormModelRenderer Body;
    public BookwormModelRenderer Neck;
    public BookwormModelRenderer ArmBaseLeft;
    public BookwormModelRenderer ArmBaseRight;
    public BookwormModelRenderer Hips;
    public BookwormModelRenderer ThighLeft;
    public BookwormModelRenderer ThighRight;
    public BookwormModelRenderer shape57;
    public BookwormModelRenderer UpperLegLeft;
    public BookwormModelRenderer LowerLegLeft;
    public BookwormModelRenderer FootLeft;
    public BookwormModelRenderer UpperLegRight;
    public BookwormModelRenderer LowerLegRight;
    public BookwormModelRenderer FootRight;
    public BookwormModelRenderer Head;
    public BookwormModelRenderer NeckLower;
    public BookwormModelRenderer Mane;
    public BookwormModelRenderer Snout;
    public BookwormModelRenderer EarLeft;
    public BookwormModelRenderer EarLeft_1;
    public BookwormModelRenderer TopSnout;
    public BookwormModelRenderer Mouth;
    public BookwormModelRenderer UpperArmLeft;
    public BookwormModelRenderer ArmLeft;
    public BookwormModelRenderer HandLeft;
    public BookwormModelRenderer UpperArmRight;
    public BookwormModelRenderer ArmRight;
    public BookwormModelRenderer HandRight;

    public ModelManedWolfBaby() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new BookwormModelRenderer(this, 22, 10, "Head");
        this.Head.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Head.addBox(-2.5F, -3.0F, -3.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(Head, -0.5918411493512771F, 0.0F, 0.0F);
        this.Chest = new BookwormModelRenderer(this, 0, 0, "Chest");
        this.Chest.setRotationPoint(0.0F, 14.8F, -3.0F);
        this.Chest.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
        this.setRotateAngle(Chest, -0.136659280431156F, 0.0F, 0.0F);
        this.UpperArmLeft = new BookwormModelRenderer(this, 48, 0, "UpperArmLeft");
        this.UpperArmLeft.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(UpperArmLeft, -0.091106186954104F, 0.0F, 0.0F);
        this.ArmLeft = new BookwormModelRenderer(this, 56, 0, "ArmLeft");
        this.ArmLeft.setRotationPoint(-0.01F, 2.9F, -2.0F);
        this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ArmLeft, -0.045553093477052F, 0.0F, 0.0F);
        this.HandLeft = new BookwormModelRenderer(this, 36, 6, "HandLeft");
        this.HandLeft.setRotationPoint(0.0F, 1.9F, 1.0F);
        this.HandLeft.addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2, 0.0F);
        this.setRotateAngle(HandLeft, 0.091106186954104F, 0.0F, 0.0F);
        this.UpperArmRight = new BookwormModelRenderer(this, 48, 0, "UpperArmRight");
        this.UpperArmRight.mirror = true;
        this.UpperArmRight.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(UpperArmRight, -0.091106186954104F, 0.0F, 0.0F);
        this.FootLeft = new BookwormModelRenderer(this, 48, 20, "FootLeft");
        this.FootLeft.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.FootLeft.addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2, 0.0F);
        this.EarLeft_1 = new BookwormModelRenderer(this, 32, 20, "EarLeft_1");
        this.EarLeft_1.setRotationPoint(-1.9F, -2.2F, 0.0F);
        this.EarLeft_1.addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(EarLeft_1, 0.36425021489121656F, 0.045553093477052F, -0.4553564018453205F);
        this.HandRight = new BookwormModelRenderer(this, 36, 6, "HandRight");
        this.HandRight.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.HandRight.addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2, 0.0F);
        this.ThighRight = new BookwormModelRenderer(this, 44, 5, "ThighRight");
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(-1.7F, 1.2F, 1.0F);
        this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(ThighRight, 0.22759093446006054F, 0.0F, 0.0F);
        this.ArmRight = new BookwormModelRenderer(this, 56, 0, "ArmRight");
        this.ArmRight.mirror = true;
        this.ArmRight.setRotationPoint(0.01F, 2.9F, -2.0F);
        this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ArmRight, -0.045553093477052F, 0.0F, 0.0F);
        this.Neck = new BookwormModelRenderer(this, 20, 0, "Neck");
        this.Neck.setRotationPoint(0.0F, -1.0F, -0.5F);
        this.Neck.addBox(-2.0F, -4.0F, -2.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(Neck, 0.8196066167365371F, 0.0F, 0.0F);
        this.FootRight = new BookwormModelRenderer(this, 48, 20, "FootRight");
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.FootRight.addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2, 0.0F);
        this.ArmBaseLeft = new BookwormModelRenderer(this, 36, 0, "ArmBaseLeft");
        this.ArmBaseLeft.setRotationPoint(1.8F, 0.6F, 0.0F);
        this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(ArmBaseLeft, 0.22759093446006054F, 0.0F, 0.0F);
        this.Mane = new BookwormModelRenderer(this, 32, 26, "Mane");
        this.Mane.setRotationPoint(0.0F, -3.7F, 0.7F);
        this.Mane.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.TopSnout = new BookwormModelRenderer(this, 14, 22, "TopSnout");
        this.TopSnout.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(TopSnout, 0.18203784098300857F, 0.0F, 0.0F);
        this.Hips = new BookwormModelRenderer(this, 0, 22, "Hips");
        this.Hips.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4, 6, 3, 0.0F);
        this.setRotateAngle(Hips, -0.22759093446006054F, 0.0F, 0.0F);
        this.LowerLegLeft = new BookwormModelRenderer(this, 40, 20, "LowerLegLeft");
        this.LowerLegLeft.setRotationPoint(-0.05F, 3.0F, 2.5F);
        this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(LowerLegLeft, -0.5462880558742251F, 0.0F, 0.0F);
        this.UpperLegRight = new BookwormModelRenderer(this, 42, 14, "UpperLegRight");
        this.UpperLegRight.mirror = true;
        this.UpperLegRight.setRotationPoint(0.0F, 5.0F, -1.5F);
        this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(UpperLegRight, 0.5462880558742251F, 0.0F, 0.0F);
        this.ArmBaseRight = new BookwormModelRenderer(this, 36, 0, "ArmBaseRight");
        this.ArmBaseRight.mirror = true;
        this.ArmBaseRight.setRotationPoint(-1.8F, 0.6F, 0.0F);
        this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(ArmBaseRight, 0.22759093446006054F, 0.0F, 0.0F);
        this.shape57 = new BookwormModelRenderer(this, 46, 25, "shape57");
        this.shape57.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.shape57.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(shape57, 0.6373942428283291F, 0.0F, 0.0F);
        this.NeckLower = new BookwormModelRenderer(this, 24, 24, "NeckLower");
        this.NeckLower.setRotationPoint(0.0F, -4.0F, -2.0F);
        this.NeckLower.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(NeckLower, -0.136659280431156F, 0.0F, 0.0F);
        this.UpperLegLeft = new BookwormModelRenderer(this, 42, 14, "UpperLegLeft");
        this.UpperLegLeft.setRotationPoint(0.0F, 5.0F, -1.5F);
        this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(UpperLegLeft, 0.5462880558742251F, 0.0F, 0.0F);
        this.LowerLegRight = new BookwormModelRenderer(this, 40, 20, "LowerLegRight");
        this.LowerLegRight.setRotationPoint(0.05F, 3.0F, 2.5F);
        this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(LowerLegRight, -0.5462880558742251F, 0.0F, 0.0F);
        this.Mouth = new BookwormModelRenderer(this, 14, 26, "Mouth");
        this.Mouth.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.Mouth.addBox(-1.0F, 0.0F, -1.8F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Mouth, -0.136659280431156F, 0.0F, 0.0F);
        this.Body = new BookwormModelRenderer(this, 0, 10, "Body");
        this.Body.setRotationPoint(0.0F, -3.02F, 1.1F);
        this.Body.addBox(-2.5F, 0.0F, 0.0F, 5, 6, 6, 0.0F);
        this.setRotateAngle(Body, 0.136659280431156F, 0.0F, 0.0F);
        this.EarLeft = new BookwormModelRenderer(this, 32, 20, "EarLeft");
        this.EarLeft.setRotationPoint(1.9F, -2.2F, 0.0F);
        this.EarLeft.addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(EarLeft, 0.36425021489121656F, -0.045553093477052F, 0.4553564018453205F);
        this.ThighLeft = new BookwormModelRenderer(this, 44, 5, "ThighLeft");
        this.ThighLeft.setRotationPoint(1.7F, 1.2F, 1.0F);
        this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(ThighLeft, 0.22759093446006054F, 0.0F, 0.0F);
        this.Snout = new BookwormModelRenderer(this, 22, 20, "Snout");
        this.Snout.setRotationPoint(0.0F, -0.6F, -3.0F);
        this.Snout.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Snout, 0.091106186954104F, 0.0F, 0.0F);
        this.Neck.addChild(this.Head);
        this.ArmBaseLeft.addChild(this.UpperArmLeft);
        this.UpperArmLeft.addChild(this.ArmLeft);
        this.ArmLeft.addChild(this.HandLeft);
        this.ArmBaseRight.addChild(this.UpperArmRight);
        this.LowerLegLeft.addChild(this.FootLeft);
        this.Head.addChild(this.EarLeft_1);
        this.ArmRight.addChild(this.HandRight);
        this.Hips.addChild(this.ThighRight);
        this.UpperArmRight.addChild(this.ArmRight);
        this.Chest.addChild(this.Neck);
        this.LowerLegRight.addChild(this.FootRight);
        this.Chest.addChild(this.ArmBaseLeft);
        this.Neck.addChild(this.Mane);
        this.Snout.addChild(this.TopSnout);
        this.Body.addChild(this.Hips);
        this.UpperLegLeft.addChild(this.LowerLegLeft);
        this.ThighRight.addChild(this.UpperLegRight);
        this.Chest.addChild(this.ArmBaseRight);
        this.Hips.addChild(this.shape57);
        this.Neck.addChild(this.NeckLower);
        this.ThighLeft.addChild(this.UpperLegLeft);
        this.UpperLegRight.addChild(this.LowerLegRight);
        this.Snout.addChild(this.Mouth);
        this.Chest.addChild(this.Body);
        this.Head.addChild(this.EarLeft);
        this.Hips.addChild(this.ThighLeft);
        this.Head.addChild(this.Snout);
        this.save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Chest.render(f5);
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
