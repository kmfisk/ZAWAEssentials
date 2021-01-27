package com.github.kmfisk.essentials.client.model.pose;

import com.github.kmfisk.essentials.client.model.ModelManedWolfBaby;

/**
 * ManedWolfBaby - fisk
 * Created using Tabula 7.1.0
 */
public class ModelManedWolfBabySleeping extends ModelManedWolfBaby {

    public ModelManedWolfBabySleeping() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        
        this.Neck.setRotationPoint(1.1F, -1.0F, -0.5F);
        this.Neck.addBox(-2.0F, -4.0F, -2.0F, 4, 6, 4, 0.0F);
        this.setRotateAngle(Neck, 0.8196066167365371F, 0.22759093446006054F, 0.0F);
        
        this.UpperLegRight.mirror = true;
        this.UpperLegRight.setRotationPoint(0.0F, 5.0F, -1.5F);
        this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(UpperLegRight, 0.5462880558742251F, 0.0F, 0.0F);
        
        this.HandLeft.setRotationPoint(0.0F, 1.9F, 1.0F);
        this.HandLeft.addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2, 0.0F);
        this.setRotateAngle(HandLeft, 0.091106186954104F, 0.0F, 0.0F);
        
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.FootRight.addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2, 0.0F);
        
        this.UpperArmRight.mirror = true;
        this.UpperArmRight.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(UpperArmRight, -0.5918411493512771F, 0.0F, 0.0F);
        
        this.Head.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Head.addBox(-2.5F, -3.0F, -3.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(Head, -0.5918411493512771F, 0.0F, 0.0F);
        
        this.EarLeft.setRotationPoint(1.0F, -2.2F, 0.0F);
        this.EarLeft.addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(EarLeft, 0.36425021489121656F, 0.31869712141416456F, 0.22759093446006054F);
        
        this.ArmBaseLeft.setRotationPoint(2.3F, 0.6F, -0.2F);
        this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(ArmBaseLeft, -0.7740535232594852F, 0.0F, 0.27314402793711257F);
        
        this.ArmLeft.setRotationPoint(-0.01F, 2.9F, -2.0F);
        this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ArmLeft, -0.045553093477052F, 0.0F, 0.0F);
        
        this.Mane.setRotationPoint(0.0F, -3.7F, 0.7F);
        this.Mane.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        
        this.TopSnout.setRotationPoint(0.0F, 0.0F, -2.2F);
        this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(TopSnout, 0.18203784098300857F, 0.0F, 0.0F);
        
        this.NeckLower.setRotationPoint(0.0F, -4.0F, -2.0F);
        this.NeckLower.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(NeckLower, -0.136659280431156F, 0.0F, 0.0F);
        
        this.ArmRight.mirror = true;
        this.ArmRight.setRotationPoint(0.01F, 2.9F, -2.0F);
        this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ArmRight, 0.5462880558742251F, 0.0F, 0.0F);
        
        this.Hips.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4, 6, 3, 0.0F);
        this.setRotateAngle(Hips, -0.22759093446006054F, 0.0F, 0.0F);
        
        this.FootLeft.setRotationPoint(0.0F, 3.5F, -1.0F);
        this.FootLeft.addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2, 0.0F);
        
        this.LowerLegRight.setRotationPoint(0.05F, 3.0F, 2.5F);
        this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(LowerLegRight, -0.5462880558742251F, 0.0F, 0.0F);
        
        this.ArmBaseRight.mirror = true;
        this.ArmBaseRight.setRotationPoint(-1.8F, 0.6F, 0.0F);
        this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(ArmBaseRight, -0.7740535232594852F, 0.0F, 0.0F);
        
        this.Mouth.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.Mouth.addBox(-1.0F, 0.0F, -1.8F, 2, 1, 2, 0.0F);
        this.setRotateAngle(Mouth, -0.136659280431156F, 0.0F, 0.0F);
        
        this.Body.setRotationPoint(0.0F, -3.02F, 1.1F);
        this.Body.addBox(-2.5F, 0.0F, 0.0F, 5, 6, 6, 0.0F);
        this.setRotateAngle(Body, -0.045553093477052F, -0.045553093477052F, 0.0F);
        
        this.UpperLegLeft.setRotationPoint(0.5F, 5.0F, -1.5F);
        this.UpperLegLeft.addBox(-1.1F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(UpperLegLeft, 0.9560913642424937F, -0.091106186954104F, -0.091106186954104F);
        
        this.Snout.setRotationPoint(0.0F, -0.6F, -3.0F);
        this.Snout.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Snout, 0.091106186954104F, 0.0F, 0.0F);
        
        this.HandRight.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.HandRight.addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2, 0.0F);
        this.setRotateAngle(HandRight, 2.6406831582674206F, 0.0F, 0.0F);
        
        this.ThighLeft.setRotationPoint(1.9F, 1.2F, 1.0F);
        this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(ThighLeft, 0.22759093446006054F, 0.0F, 0.18203784098300857F);
        
        this.EarLeft_1.setRotationPoint(-1.9F, -2.2F, 0.0F);
        this.EarLeft_1.addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(EarLeft_1, 0.36425021489121656F, 0.045553093477052F, 0.091106186954104F);
        
        this.UpperArmLeft.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(UpperArmLeft, -0.091106186954104F, 0.36425021489121656F, 0.22759093446006054F);
        
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(-1.7F, 1.2F, 1.0F);
        this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(ThighRight, 0.22759093446006054F, 0.091106186954104F, -0.091106186954104F);
        
        this.LowerLegLeft.setRotationPoint(-0.05F, 3.0F, 2.5F);
        this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(LowerLegLeft, -0.5462880558742251F, 0.0F, 0.0F);
        
        this.Chest.setRotationPoint(0.0F, 21.8F, -3.0F);
        this.Chest.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
        this.setRotateAngle(Chest, -0.136659280431156F, 0.0F, -1.5481070465189704F);
        
        this.shape57.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.shape57.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(shape57, 0.6373942428283291F, -0.5009094953223726F, 0.31869712141416456F);
        this.Chest.addChild(this.Neck);
        this.ThighRight.addChild(this.UpperLegRight);
        this.ArmLeft.addChild(this.HandLeft);
        this.LowerLegRight.addChild(this.FootRight);
        this.ArmBaseRight.addChild(this.UpperArmRight);
        this.Neck.addChild(this.Head);
        this.Head.addChild(this.EarLeft);
        this.Chest.addChild(this.ArmBaseLeft);
        this.UpperArmLeft.addChild(this.ArmLeft);
        this.Neck.addChild(this.Mane);
        this.Snout.addChild(this.TopSnout);
        this.Neck.addChild(this.NeckLower);
        this.UpperArmRight.addChild(this.ArmRight);
        this.Body.addChild(this.Hips);
        this.LowerLegLeft.addChild(this.FootLeft);
        this.UpperLegRight.addChild(this.LowerLegRight);
        this.Chest.addChild(this.ArmBaseRight);
        this.Snout.addChild(this.Mouth);
        this.Chest.addChild(this.Body);
        this.ThighLeft.addChild(this.UpperLegLeft);
        this.Head.addChild(this.Snout);
        this.ArmRight.addChild(this.HandRight);
        this.Hips.addChild(this.ThighLeft);
        this.Head.addChild(this.EarLeft_1);
        this.ArmBaseLeft.addChild(this.UpperArmLeft);
        this.Hips.addChild(this.ThighRight);
        this.UpperLegLeft.addChild(this.LowerLegLeft);
        this.Hips.addChild(this.shape57);
    }
}
