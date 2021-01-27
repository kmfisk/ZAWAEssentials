package com.github.kmfisk.essentials.client.model.pose;

import com.github.kmfisk.essentials.client.model.ModelChinchillaBaby;

/**
 * ChinchillaBaby - fisk
 * Created using Tabula 7.1.0
 */
public class ModelChinchillaBabySleeping extends ModelChinchillaBaby {

    public ModelChinchillaBabySleeping() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.ThighLeft.setRotationPoint(2.2F, -1.6F, 0.7F);
        this.ThighLeft.addBox(-2.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighLeft, 0.091106186954104F, 0.0F, 0.0F);

        this.ArmRight.mirror = true;
        this.ArmRight.setRotationPoint(-0.8F, 1.1F, -1.2F);
        this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(ArmRight, -0.136659280431156F, 0.0F, 0.0F);

        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.6F, 2.3F, 0.3F);
        this.FootRight.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);

        this.HandLeft.setRotationPoint(0.0F, 1.6F, -0.2F);
        this.HandLeft.addBox(-0.5F, 0.0F, -0.7F, 1, 1, 1, 0.0F);
        this.setRotateAngle(HandLeft, 0.091106186954104F, 0.0F, 0.0F);

        this.ArmLeft.setRotationPoint(0.8F, 1.1F, -1.2F);
        this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(ArmLeft, -0.136659280431156F, 0.0F, 0.0F);

        this.EarRight.mirror = true;
        this.EarRight.setRotationPoint(0.3F, 0.3F, -0.5F);
        this.EarRight.addBox(-2.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(EarRight, 0.27314402793711257F, 0.36425021489121656F, -0.36425021489121656F);

        this.HandLeft_1.setRotationPoint(0.0F, 1.6F, -0.2F);
        this.HandLeft_1.addBox(-0.5F, 0.0F, -0.7F, 1, 1, 1, 0.0F);
        this.setRotateAngle(HandLeft_1, 0.091106186954104F, 0.0F, 0.0F);

        this.Body.setRotationPoint(0.0F, 22.5F, 0.0F);
        this.Body.addBox(-2.0F, -2.0F, -1.5F, 4, 3, 3, 0.0F);
        this.setRotateAngle(Body, -0.091106186954104F, 0.0F, 0.0F);

        this.Tail2.setRotationPoint(0.0F, 2.0F, 2.0F);
        this.Tail2.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(Tail2, 0.7740535232594852F, 0.136659280431156F, 0.0F);

        this.Mouth.setRotationPoint(0.0F, 1.3F, 1.0F);
        this.Mouth.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Mouth, -0.31869712141416456F, 0.0F, 0.0F);

        this.Belly.setRotationPoint(0.0F, 1.4F, -1.9F);
        this.Belly.addBox(-1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(Belly, -0.091106186954104F, 0.0F, 0.0F);

        this.Head.setRotationPoint(-0.1F, -0.2F, -1.1F);
        this.Head.addBox(-1.5F, -1.5F, -2.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Head, 0.6373942428283291F, 0.27314402793711257F, 0.0F);

        this.Neck.setRotationPoint(0.0F, 1.5F, -1.3F);
        this.Neck.addBox(-1.0F, -1.5F, -2.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Neck, -0.40980330836826856F, 0.0F, 0.0F);

        this.FootLeft.setRotationPoint(-0.6F, 2.3F, 0.3F);
        this.FootLeft.addBox(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);

        this.Chest.setRotationPoint(0.0F, -1.9F, -1.3F);
        this.Chest.addBox(-1.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(Chest, 0.18203784098300857F, 0.0F, 0.0F);

        this.Tail1.setRotationPoint(0.0F, -1.0F, 1.5F);
        this.Tail1.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(Tail1, -0.045553093477052F, 1.1838568316277536F, 0.0F);

        this.TopSnout.setRotationPoint(0.0F, 0.0F, -0.3F);
        this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(TopSnout, 0.7740535232594852F, 0.0F, 0.0F);

        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(-2.2F, -1.6F, 0.7F);
        this.ThighRight.addBox(0.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighRight, 0.091106186954104F, 0.0F, 0.0F);

        this.Snout.setRotationPoint(0.0F, 0.1F, -2.5F);
        this.Snout.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Snout, -0.136659280431156F, 0.0F, 0.0F);

        this.EarLeft.setRotationPoint(-0.3F, 0.3F, -0.5F);
        this.EarLeft.addBox(0.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(EarLeft, 0.27314402793711257F, -0.36425021489121656F, 0.36425021489121656F);
        this.Body.addChild(this.ThighLeft);
        this.Chest.addChild(this.ArmRight);
        this.ThighRight.addChild(this.FootRight);
        this.ArmLeft.addChild(this.HandLeft);
        this.Chest.addChild(this.ArmLeft);
        this.Head.addChild(this.EarRight);
        this.ArmRight.addChild(this.HandLeft_1);
        this.Tail1.addChild(this.Tail2);
        this.Snout.addChild(this.Mouth);
        this.Body.addChild(this.Belly);
        this.Neck.addChild(this.Head);
        this.Chest.addChild(this.Neck);
        this.ThighLeft.addChild(this.FootLeft);
        this.Body.addChild(this.Chest);
        this.Body.addChild(this.Tail1);
        this.Snout.addChild(this.TopSnout);
        this.Body.addChild(this.ThighRight);
        this.Head.addChild(this.Snout);
        this.Head.addChild(this.EarLeft);
    }
}
