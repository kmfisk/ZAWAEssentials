package com.github.kmfisk.essentials.client.model.pose;

import com.github.kmfisk.essentials.client.model.ModelChinchilla;

/**
 * Chinchilla - fisk
 * Created using Tabula 7.1.0
 */
public class ModelChinchillaSleeping extends ModelChinchilla {

    public ModelChinchillaSleeping() {
        this.textureWidth = 32;
        this.textureHeight = 64;

        this.ArmRight.mirror = true;
        this.ArmRight.setRotationPoint(-0.1F, 3.0F, 1.0F);
        this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ArmRight, -0.5462880558742251F, 0.0F, 0.045553093477052F);

        this.TopSnout.setRotationPoint(0.0F, 0.28F, -1.6F);
        this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(TopSnout, 0.8196066167365371F, 0.0F, 0.0F);

        this.HandLeft.setRotationPoint(-0.05F, 1.5F, -1.2F);
        this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
        this.setRotateAngle(HandLeft, 0.22759093446006054F, 0.0F, 0.0F);

        this.Body.setRotationPoint(0.0F, 21.3F, 0.0F);
        this.Body.addBox(-3.5F, -3.3F, -2.5F, 7, 7, 5, 0.0F);
        this.setRotateAngle(Body, -0.091106186954104F, 0.0F, 0.0F);

        this.Chest.setRotationPoint(0.0F, -3.1F, -1.5F);
        this.Chest.addBox(-3.0F, 0.0F, -4.0F, 6, 6, 4, 0.0F);
        this.setRotateAngle(Chest, 0.18203784098300857F, 0.0F, 0.0F);

        this.Head.setRotationPoint(0.0F, -0.7F, -0.3F);
        this.Head.addBox(-2.5F, -3.0F, -3.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(Head, 0.5462880558742251F, 0.0F, 0.0F);

        this.ArmBaseLeft.setRotationPoint(1.6F, 2.3F, -3.0F);
        this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ArmBaseLeft, 0.22759093446006054F, 0.0F, 0.0F);

        this.ArmLeft.setRotationPoint(-0.1F, 3.0F, 1.0F);
        this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ArmLeft, -0.5462880558742251F, 0.0F, 0.045553093477052F);

        this.Neck.setRotationPoint(0.0F, 3.1F, -3.2F);
        this.Neck.addBox(-2.0F, -3.0F, -2.0F, 4, 5, 3, 0.0F);
        this.setRotateAngle(Neck, -0.40980330836826856F, 0.0F, 0.0F);

        this.EarRight.mirror = true;
        this.EarRight.setRotationPoint(-2.4F, -1.3F, -0.7F);
        this.EarRight.addBox(-1.0F, -3.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(EarRight, -0.7285004297824331F, 0.5462880558742251F, -0.9560913642424937F);

        this.EarLeft.setRotationPoint(2.4F, -1.3F, -0.7F);
        this.EarLeft.addBox(-1.0F, -3.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(EarLeft, -0.7285004297824331F, -0.5462880558742251F, 0.9560913642424937F);

        this.ArmBaseRight.mirror = true;
        this.ArmBaseRight.setRotationPoint(-1.6F, 2.3F, -3.0F);
        this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ArmBaseRight, 0.22759093446006054F, 0.0F, 0.0F);

        this.Mouth.setRotationPoint(0.0F, 1.7F, 0.3F);
        this.Mouth.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Mouth, -0.5009094953223726F, 0.0F, 0.0F);

        this.Tail1.setRotationPoint(0.0F, 3.4F, 1.7F);
        this.Tail1.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Tail1, -0.6829473363053812F, 0.0F, -0.6829473363053812F);

        this.Tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail3.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Tail3, 0.9560913642424937F, 0.0F, 0.0F);

        this.Back.setRotationPoint(0.0F, -2.6F, 2.5F);
        this.Back.addBox(-3.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(Back, -0.091106186954104F, 0.0F, 0.0F);

        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(-2.7F, -2.1F, 1.7F);
        this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3, 4, 4, 0.0F);

        this.HandRight.mirror = true;
        this.HandRight.setRotationPoint(0.05F, 1.5F, -1.2F);
        this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
        this.setRotateAngle(HandRight, 0.22759093446006054F, 0.0F, 0.0F);

        this.ThighLeft.setRotationPoint(2.7F, -2.1F, 1.7F);
        this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3, 4, 4, 0.0F);

        this.Snout.setRotationPoint(0.0F, -0.6F, -3.0F);
        this.Snout.addBox(-1.5F, 0.0F, -1.25F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Snout, 0.18203784098300857F, 0.0F, 0.0F);

        this.LegLeft.setRotationPoint(0.0F, 4.0F, -1.5F);
        this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(LegLeft, 0.40980330836826856F, 0.0F, 0.0F);

        this.LegRight.mirror = true;
        this.LegRight.setRotationPoint(0.0F, 4.0F, -1.5F);
        this.LegRight.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(LegRight, 0.40980330836826856F, 0.0F, 0.0F);

        this.FootLeft.setRotationPoint(-0.1F, 2.0F, 1.9F);
        this.FootLeft.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(FootLeft, -0.36425021489121656F, 0.0F, 0.0F);

        this.Tail2.setRotationPoint(0.0F, 1.5F, 2.0F);
        this.Tail2.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Tail2, 0.7740535232594852F, 0.0F, 0.0F);

        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.1F, 2.0F, 1.9F);
        this.FootRight.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(FootRight, -0.36425021489121656F, 0.0F, 0.0F);
        this.ArmBaseRight.addChild(this.ArmRight);
        this.Snout.addChild(this.TopSnout);
        this.ArmLeft.addChild(this.HandLeft);
        this.Body.addChild(this.Chest);
        this.Neck.addChild(this.Head);
        this.Chest.addChild(this.ArmBaseLeft);
        this.ArmBaseLeft.addChild(this.ArmLeft);
        this.Chest.addChild(this.Neck);
        this.Head.addChild(this.EarRight);
        this.Head.addChild(this.EarLeft);
        this.Chest.addChild(this.ArmBaseRight);
        this.Snout.addChild(this.Mouth);
        this.Back.addChild(this.Tail1);
        this.Tail2.addChild(this.Tail3);
        this.Body.addChild(this.Back);
        this.Body.addChild(this.ThighRight);
        this.ArmRight.addChild(this.HandRight);
        this.Body.addChild(this.ThighLeft);
        this.Head.addChild(this.Snout);
        this.ThighLeft.addChild(this.LegLeft);
        this.ThighRight.addChild(this.LegRight);
        this.LegLeft.addChild(this.FootLeft);
        this.Tail1.addChild(this.Tail2);
        this.LegRight.addChild(this.FootRight);
    }
}
