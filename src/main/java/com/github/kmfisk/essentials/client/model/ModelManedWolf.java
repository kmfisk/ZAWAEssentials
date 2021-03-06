package com.github.kmfisk.essentials.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

/**
 * ManedWolf - fisk
 * Created using Tabula 7.1.0
 */
public class ModelManedWolf extends ZAWAModelBase {
    public BookwormModelRenderer Chest;
    public BookwormModelRenderer Body;
    public BookwormModelRenderer Neck;
    public BookwormModelRenderer ArmBaseLeft;
    public BookwormModelRenderer ArmBaseRight;
    public BookwormModelRenderer Hips;
    public BookwormModelRenderer Belly;
    public BookwormModelRenderer Tail1;
    public BookwormModelRenderer ThighLeft;
    public BookwormModelRenderer ThighRight;
    public BookwormModelRenderer Tail2;
    public BookwormModelRenderer UpperLegLeft;
    public BookwormModelRenderer LowerLegLeft;
    public BookwormModelRenderer FootLeft;
    public BookwormModelRenderer UpperLegRight;
    public BookwormModelRenderer LowerLegRight;
    public BookwormModelRenderer FootRight;
    public BookwormModelRenderer Head;
    public BookwormModelRenderer NeckLower;
    public BookwormModelRenderer shape38;
    public BookwormModelRenderer Snout;
    public BookwormModelRenderer EarLeft;
    public BookwormModelRenderer EarRight;
    public BookwormModelRenderer TopSnout;
    public BookwormModelRenderer Mouth;
    public BookwormModelRenderer UpperArmLeft;
    public BookwormModelRenderer ArmLeft;
    public BookwormModelRenderer HandLeft;
    public BookwormModelRenderer UpperArmRight;
    public BookwormModelRenderer ArmRight;
    public BookwormModelRenderer HandRight;

    public ModelManedWolf() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.UpperLegLeft = new BookwormModelRenderer(this, 48, 25, "UpperLegLeft");
        this.UpperLegLeft.setRotationPoint(0.0F, 6.5F, -1.4F);
        this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(UpperLegLeft, 0.4553564018453205F, 0.0F, 0.0F);
        this.ThighRight = new BookwormModelRenderer(this, 32, 22, "ThighRight");
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(-1.8F, 1.3F, 1.4F);
        this.ThighRight.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(ThighRight, 0.18203784098300857F, 0.0F, 0.0F);
        this.FootRight = new BookwormModelRenderer(this, 49, 37, "FootRight");
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.0F, 5.8F, -0.8F);
        this.FootRight.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.FootLeft = new BookwormModelRenderer(this, 49, 37, "FootLeft");
        this.FootLeft.setRotationPoint(0.0F, 5.8F, -0.8F);
        this.FootLeft.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.LowerLegLeft = new BookwormModelRenderer(this, 41, 33, "LowerLegLeft");
        this.LowerLegLeft.setRotationPoint(0.0F, 4.5F, 2.5F);
        this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(LowerLegLeft, -0.31869712141416456F, 0.0F, 0.0F);
        this.Snout = new BookwormModelRenderer(this, 0, 58, "Snout");
        this.Snout.setRotationPoint(0.0F, -0.6F, -2.6F);
        this.Snout.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Snout, 0.045553093477052F, 0.0F, 0.0F);
        this.HandRight = new BookwormModelRenderer(this, 54, 16, "HandRight");
        this.HandRight.mirror = true;
        this.HandRight.setRotationPoint(0.0F, 3.5F, 1.2F);
        this.HandRight.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(HandRight, 0.091106186954104F, 0.0F, 0.0F);
        this.Belly = new BookwormModelRenderer(this, 18, 39, "Belly");
        this.Belly.setRotationPoint(0.0F, 8.0F, -0.3F);
        this.Belly.addBox(-2.5F, -2.0F, 0.0F, 5, 2, 8, 0.0F);
        this.setRotateAngle(Belly, 0.136659280431156F, 0.0F, 0.0F);
        this.UpperArmRight = new BookwormModelRenderer(this, 36, 10, "UpperArmRight");
        this.UpperArmRight.mirror = true;
        this.UpperArmRight.setRotationPoint(0.0F, 4.5F, 1.5F);
        this.UpperArmRight.addBox(-1.0F, 0.0F, -3.0F, 2, 7, 3, 0.0F);
        this.setRotateAngle(UpperArmRight, -0.18203784098300857F, 0.0F, 0.0F);
        this.UpperArmLeft = new BookwormModelRenderer(this, 36, 10, "UpperArmLeft");
        this.UpperArmLeft.setRotationPoint(0.0F, 4.5F, 1.5F);
        this.UpperArmLeft.addBox(-1.0F, 0.0F, -3.0F, 2, 7, 3, 0.0F);
        this.setRotateAngle(UpperArmLeft, -0.18203784098300857F, 0.0F, 0.0F);
        this.HandLeft = new BookwormModelRenderer(this, 54, 16, "HandLeft");
        this.HandLeft.setRotationPoint(0.0F, 3.5F, 1.2F);
        this.HandLeft.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(HandLeft, 0.091106186954104F, 0.0F, 0.0F);
        this.LowerLegRight = new BookwormModelRenderer(this, 41, 33, "LowerLegRight");
        this.LowerLegRight.mirror = true;
        this.LowerLegRight.setRotationPoint(0.0F, 4.5F, 2.5F);
        this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(LowerLegRight, -0.31869712141416456F, 0.0F, 0.0F);
        this.ThighLeft = new BookwormModelRenderer(this, 32, 22, "ThighLeft");
        this.ThighLeft.setRotationPoint(1.8F, 1.3F, 1.4F);
        this.ThighLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(ThighLeft, 0.18203784098300857F, 0.0F, 0.0F);
        this.ArmRight = new BookwormModelRenderer(this, 46, 14, "ArmRight");
        this.ArmRight.mirror = true;
        this.ArmRight.setRotationPoint(0.0F, 6.3F, -2.5F);
        this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(ArmRight, -0.091106186954104F, 0.0F, 0.0F);
        this.Tail1 = new BookwormModelRenderer(this, 36, 0, "Tail1");
        this.Tail1.setRotationPoint(0.0F, 0.7F, 4.0F);
        this.Tail1.addBox(-1.5F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Tail1, 0.5462880558742251F, 0.0F, 0.0F);
        this.ArmBaseLeft = new BookwormModelRenderer(this, 22, 11, "ArmBaseLeft");
        this.ArmBaseLeft.setRotationPoint(2.2F, -0.4F, -0.3F);
        this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(ArmBaseLeft, 0.31869712141416456F, 0.0F, 0.0F);
        this.Hips = new BookwormModelRenderer(this, 0, 30, "Hips");
        this.Hips.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 4, 0.0F);
        this.setRotateAngle(Hips, -0.27314402793711257F, 0.0F, 0.0F);
        this.Tail2 = new BookwormModelRenderer(this, 48, 0, "Tail2");
        this.Tail2.setRotationPoint(0.0F, 5.0F, -3.0F);
        this.Tail2.addBox(-1.5F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(Tail2, 0.136659280431156F, 0.0F, 0.0F);
        this.UpperLegRight = new BookwormModelRenderer(this, 48, 25, "UpperLegRight");
        this.UpperLegRight.mirror = true;
        this.UpperLegRight.setRotationPoint(0.0F, 6.5F, -1.4F);
        this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(UpperLegRight, 0.4553564018453205F, 0.0F, 0.0F);
        this.ArmLeft = new BookwormModelRenderer(this, 46, 14, "ArmLeft");
        this.ArmLeft.setRotationPoint(0.0F, 6.3F, -2.5F);
        this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(ArmLeft, -0.091106186954104F, 0.0F, 0.0F);
        this.Neck = new BookwormModelRenderer(this, 0, 49, "Neck");
        this.Neck.setRotationPoint(0.0F, -2.0F, -0.5F);
        this.Neck.addBox(-2.0F, -5.0F, -2.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(Neck, 1.0927506446736497F, 0.0F, 0.0F);
        this.TopSnout = new BookwormModelRenderer(this, 12, 59, "TopSnout");
        this.TopSnout.setRotationPoint(0.0F, 0.0F, -3.2F);
        this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(TopSnout, 0.31869712141416456F, 0.0F, 0.0F);
        this.Body = new BookwormModelRenderer(this, 0, 13, "Body");
        this.Body.setRotationPoint(0.0F, -4.0F, 1.5F);
        this.Body.addBox(-3.0F, 0.0F, 0.0F, 6, 7, 10, 0.0F);
        this.setRotateAngle(Body, 0.091106186954104F, 0.0F, 0.0F);
        this.EarRight = new BookwormModelRenderer(this, 0, 41, "EarRight");
        this.EarRight.mirror = true;
        this.EarRight.setRotationPoint(-1.9F, -2.2F, 0.0F);
        this.EarRight.addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(EarRight, 0.18203784098300857F, 0.27314402793711257F, -0.36425021489121656F);
        this.ArmBaseRight = new BookwormModelRenderer(this, 22, 11, "ArmBaseRight");
        this.ArmBaseRight.mirror = true;
        this.ArmBaseRight.setRotationPoint(-2.1F, -0.4F, -0.3F);
        this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(ArmBaseRight, 0.31869712141416456F, 0.0F, 0.0F);
        this.NeckLower = new BookwormModelRenderer(this, 18, 30, "NeckLower");
        this.NeckLower.setRotationPoint(0.0F, -5.0F, -2.4F);
        this.NeckLower.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 6, 0.0F);
        this.setRotateAngle(NeckLower, -1.9123572614101867F, 0.0F, 0.0F);
        this.shape38 = new BookwormModelRenderer(this, 24, 0, "shape38");
        this.shape38.setRotationPoint(0.0F, -5.2F, 0.9F);
        this.shape38.addBox(-1.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
        this.Mouth = new BookwormModelRenderer(this, 22, 59, "Mouth");
        this.Mouth.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.Mouth.addBox(-1.0F, 0.0F, -2.7F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Mouth, -0.045553093477052F, 0.0F, 0.0F);
        this.Chest = new BookwormModelRenderer(this, 0, 0, "Chest");
        this.Chest.setRotationPoint(0.0F, 9.5F, -5.7F);
        this.Chest.addBox(-3.5F, -4.0F, -2.5F, 7, 8, 5, 0.0F);
        this.setRotateAngle(Chest, -0.136659280431156F, 0.0F, 0.0F);
        this.Head = new BookwormModelRenderer(this, 16, 49, "Head");
        this.Head.setRotationPoint(0.0F, -4.4F, -0.9F);
        this.Head.addBox(-2.5F, -3.0F, -3.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(Head, -0.8196066167365371F, 0.0F, 0.0F);
        this.EarLeft = new BookwormModelRenderer(this, 0, 41, "EarLeft");
        this.EarLeft.setRotationPoint(1.9F, -2.2F, 0.0F);
        this.EarLeft.addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(EarLeft, 0.18203784098300857F, -0.27314402793711257F, 0.36425021489121656F);
        this.ThighLeft.addChild(this.UpperLegLeft);
        this.Hips.addChild(this.ThighRight);
        this.LowerLegRight.addChild(this.FootRight);
        this.LowerLegLeft.addChild(this.FootLeft);
        this.UpperLegLeft.addChild(this.LowerLegLeft);
        this.Head.addChild(this.Snout);
        this.ArmRight.addChild(this.HandRight);
        this.Body.addChild(this.Belly);
        this.ArmBaseRight.addChild(this.UpperArmRight);
        this.ArmBaseLeft.addChild(this.UpperArmLeft);
        this.ArmLeft.addChild(this.HandLeft);
        this.UpperLegRight.addChild(this.LowerLegRight);
        this.Hips.addChild(this.ThighLeft);
        this.UpperArmRight.addChild(this.ArmRight);
        this.Hips.addChild(this.Tail1);
        this.Chest.addChild(this.ArmBaseLeft);
        this.Body.addChild(this.Hips);
        this.Tail1.addChild(this.Tail2);
        this.ThighRight.addChild(this.UpperLegRight);
        this.UpperArmLeft.addChild(this.ArmLeft);
        this.Chest.addChild(this.Neck);
        this.Snout.addChild(this.TopSnout);
        this.Chest.addChild(this.Body);
        this.Head.addChild(this.EarRight);
        this.Chest.addChild(this.ArmBaseRight);
        this.Neck.addChild(this.NeckLower);
        this.Neck.addChild(this.shape38);
        this.Snout.addChild(this.Mouth);
        this.Neck.addChild(this.Head);
        this.Head.addChild(this.EarLeft);
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
