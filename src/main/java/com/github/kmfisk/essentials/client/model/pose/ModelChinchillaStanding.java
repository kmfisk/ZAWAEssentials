package com.github.kmfisk.essentials.client.model.pose;

import com.github.kmfisk.essentials.client.model.ModelChinchilla;

/**
 * Chinchilla - fisk
 * Created using Tabula 7.1.0
 */
public class ModelChinchillaStanding extends ModelChinchilla {

    public ModelChinchillaStanding() {
        this.textureWidth = 32;
        this.textureHeight = 64;

        this.Tail1.setRotationPoint(0.0F, 1.4F, 2.0F);
        this.Tail1.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Tail1, 1.3658946726107624F, 0.0F, 0.0F);

        this.EarLeft.setRotationPoint(2.4F, -1.3F, -0.7F);
        this.EarLeft.addBox(-1.0F, -3.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(EarLeft, -0.7285004297824331F, -0.5462880558742251F, 0.9560913642424937F);

        this.LegLeft.setRotationPoint(0.0F, 4.0F, -0.1F);
        this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(LegLeft, 1.3658946726107624F, 0.0F, 0.0F);

        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.1F, 1.7F, 1.9F);
        this.FootRight.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(FootRight, -0.22759093446006054F, 0.0F, 0.0F);

        this.Body.setRotationPoint(0.0F, 20.4F, 0.0F);
        this.Body.addBox(-3.5F, -3.3F, -2.5F, 7, 7, 5, 0.0F);
        this.setRotateAngle(Body, -1.5025539530419183F, 0.0F, 0.0F);

        this.ThighLeft.setRotationPoint(2.7F, -1.6F, 1.7F);
        this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3, 4, 4, 0.0F);
        this.setRotateAngle(ThighLeft, 0.36425021489121656F, 0.0F, 0.0F);

        this.ArmBaseRight.mirror = true;
        this.ArmBaseRight.setRotationPoint(-2.4F, 3.2F, -3.0F);
        this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ArmBaseRight, 0.40980330836826856F, 0.0F, 0.0F);

        this.Head.setRotationPoint(0.0F, -0.5F, -0.9F);
        this.Head.addBox(-2.5F, -3.0F, -3.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(Head, 1.0927506446736497F, 0.0F, 0.0F);

        this.Back.setRotationPoint(0.0F, -2.6F, 2.5F);
        this.Back.addBox(-3.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(Back, -0.091106186954104F, 0.0F, 0.0F);

        this.Mouth.setRotationPoint(0.0F, 1.7F, 0.3F);
        this.Mouth.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Mouth, -0.5009094953223726F, 0.0F, 0.0F);

        this.TopSnout.setRotationPoint(0.0F, 0.28F, -1.6F);
        this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(TopSnout, 0.8196066167365371F, 0.0F, 0.0F);

        this.HandRight.mirror = true;
        this.HandRight.setRotationPoint(0.05F, 1.5F, -1.2F);
        this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
        this.setRotateAngle(HandRight, 2.1399481958702475F, 0.22759093446006054F, 0.8196066167365371F);

        this.ArmRight.mirror = true;
        this.ArmRight.setRotationPoint(-0.1F, 3.0F, 1.0F);
        this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ArmRight, -0.18203784098300857F, 0.0F, -0.5462880558742251F);

        this.Neck.setRotationPoint(0.0F, 3.5F, -4.2F);
        this.Neck.addBox(-2.0F, -3.0F, -2.0F, 4, 5, 3, 0.0F);

        this.EarRight.mirror = true;
        this.EarRight.setRotationPoint(-2.4F, -1.3F, -0.7F);
        this.EarRight.addBox(-1.0F, -3.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(EarRight, -0.7285004297824331F, 0.5462880558742251F, -0.9560913642424937F);

        this.Chest.setRotationPoint(0.0F, -2.8F, -2.5F);
        this.Chest.addBox(-3.0F, 0.0F, -4.0F, 6, 6, 4, 0.0F);
        this.setRotateAngle(Chest, 0.18203784098300857F, 0.0F, 0.0F);

        this.Tail2.setRotationPoint(0.0F, 1.5F, 2.0F);
        this.Tail2.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Tail2, 0.40980330836826856F, 0.0F, 0.0F);

        this.HandLeft.setRotationPoint(-0.05F, 1.5F, -1.2F);
        this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
        this.setRotateAngle(HandLeft, 2.1399481958702475F, -0.22759093446006054F, -0.8196066167365371F);

        this.LegRight.mirror = true;
        this.LegRight.setRotationPoint(0.0F, 4.0F, -0.1F);
        this.LegRight.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(LegRight, 1.3658946726107624F, 0.0F, 0.0F);

        this.ArmBaseLeft.setRotationPoint(2.4F, 3.2F, -3.0F);
        this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ArmBaseLeft, 0.40980330836826856F, 0.0F, 0.0F);

        this.FootLeft.setRotationPoint(-0.1F, 1.7F, 1.9F);
        this.FootLeft.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(FootLeft, -0.22759093446006054F, 0.0F, 0.0F);

        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(-2.7F, -1.6F, 1.7F);
        this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3, 4, 4, 0.0F);
        this.setRotateAngle(ThighRight, 0.36425021489121656F, 0.0F, 0.0F);

        this.ArmLeft.setRotationPoint(-0.1F, 3.0F, 1.0F);
        this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ArmLeft, -0.18203784098300857F, 0.0F, 0.5462880558742251F);

        this.Tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail3.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Tail3, 0.9105382707654417F, 0.0F, 0.0F);

        this.Snout.setRotationPoint(0.0F, -0.6F, -3.0F);
        this.Snout.addBox(-1.5F, 0.0F, -1.25F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Snout, 0.18203784098300857F, 0.0F, 0.0F);
        this.Back.addChild(this.Tail1);
        this.Head.addChild(this.EarLeft);
        this.ThighLeft.addChild(this.LegLeft);
        this.LegRight.addChild(this.FootRight);
        this.Body.addChild(this.ThighLeft);
        this.Chest.addChild(this.ArmBaseRight);
        this.Neck.addChild(this.Head);
        this.Body.addChild(this.Back);
        this.Snout.addChild(this.Mouth);
        this.Snout.addChild(this.TopSnout);
        this.ArmRight.addChild(this.HandRight);
        this.ArmBaseRight.addChild(this.ArmRight);
        this.Chest.addChild(this.Neck);
        this.Head.addChild(this.EarRight);
        this.Body.addChild(this.Chest);
        this.Tail1.addChild(this.Tail2);
        this.ArmLeft.addChild(this.HandLeft);
        this.ThighRight.addChild(this.LegRight);
        this.Chest.addChild(this.ArmBaseLeft);
        this.LegLeft.addChild(this.FootLeft);
        this.Body.addChild(this.ThighRight);
        this.ArmBaseLeft.addChild(this.ArmLeft);
        this.Tail2.addChild(this.Tail3);
        this.Head.addChild(this.Snout);
    }
}
