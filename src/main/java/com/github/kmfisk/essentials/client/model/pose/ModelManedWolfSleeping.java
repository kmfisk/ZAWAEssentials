package com.github.kmfisk.essentials.client.model.pose;

import com.github.kmfisk.essentials.client.model.ModelManedWolf;

/**
 * ManedWolf - fisk
 * Created using Tabula 7.1.0
 */
public class ModelManedWolfSleeping extends ModelManedWolf {

    public ModelManedWolfSleeping() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        
        this.Hips.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 4, 0.0F);
        this.setRotateAngle(Hips, -0.27314402793711257F, 0.0F, -0.27314402793711257F);
        
        this.ThighLeft.setRotationPoint(1.0F, 1.3F, 1.4F);
        this.ThighLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(ThighLeft, -0.5462880558742251F, -0.5918411493512771F, 0.0F);
        
        this.ArmLeft.setRotationPoint(0.0F, 6.3F, -2.5F);
        this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(ArmLeft, 0.091106186954104F, 0.0F, 0.0F);
        
        this.Tail2.setRotationPoint(0.0F, 5.0F, -3.0F);
        this.Tail2.addBox(-1.5F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(Tail2, 0.5009094953223726F, -0.091106186954104F, 0.0F);
        
        this.EarLeft.setRotationPoint(1.9F, -2.2F, 0.0F);
        this.EarLeft.addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(EarLeft, 0.18203784098300857F, -0.27314402793711257F, 0.36425021489121656F);
        
        this.UpperLegLeft.setRotationPoint(0.0F, 6.5F, -1.4F);
        this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(UpperLegLeft, 1.4114477660878142F, 0.0F, 0.0F);
        
        this.Chest.setRotationPoint(0.0F, 20.0F, -5.7F);
        this.Chest.addBox(-3.5F, -4.0F, -2.5F, 7, 8, 5, 0.0F);
        this.setRotateAngle(Chest, -0.136659280431156F, 0.0F, 0.0F);
        
        this.Neck.setRotationPoint(0.0F, -1.7F, -0.5F);
        this.Neck.addBox(-2.0F, -5.0F, -2.0F, 4, 5, 4, 0.0F);
        this.setRotateAngle(Neck, 1.9123572614101867F, -0.31869712141416456F, 0.0F);
        
        this.FootLeft.setRotationPoint(0.0F, 5.8F, -0.8F);
        this.FootLeft.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(FootLeft, 1.4570008595648662F, 0.0F, 0.0F);
        
        this.LowerLegRight.mirror = true;
        this.LowerLegRight.setRotationPoint(0.0F, 4.5F, 2.5F);
        this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(LowerLegRight, -1.1838568316277536F, 0.0F, 0.0F);
        
        this.HandRight.mirror = true;
        this.HandRight.setRotationPoint(0.0F, 3.5F, 1.2F);
        this.HandRight.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(HandRight, 1.4114477660878142F, 0.0F, 0.0F);
        
        this.HandLeft.setRotationPoint(0.0F, 3.5F, 1.2F);
        this.HandLeft.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(HandLeft, 1.4114477660878142F, 0.0F, 0.0F);
        
        this.ArmRight.mirror = true;
        this.ArmRight.setRotationPoint(0.0F, 6.3F, -2.5F);
        this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(ArmRight, 0.0F, -0.27314402793711257F, -0.31869712141416456F);
        
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(-3.3F, 4.0F, 3.6F);
        this.ThighRight.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(ThighRight, -1.730144887501979F, 0.40980330836826856F, -0.31869712141416456F);
        
        this.UpperLegRight.mirror = true;
        this.UpperLegRight.setRotationPoint(0.0F, 6.5F, -1.4F);
        this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(UpperLegRight, 1.6845917940249266F, 0.0F, 0.0F);
        
        this.Body.setRotationPoint(0.0F, -4.0F, 1.5F);
        this.Body.addBox(-3.0F, 0.0F, 0.0F, 6, 7, 10, 0.0F);
        this.setRotateAngle(Body, 0.091106186954104F, 0.31869712141416456F, 0.0F);
        
        this.Head.setRotationPoint(0.0F, -4.4F, -0.9F);
        this.Head.addBox(-2.5F, -3.0F, -3.0F, 5, 5, 5, 0.0F);
        this.setRotateAngle(Head, -1.593485607070823F, 0.0F, 0.0F);
        
        this.Tail1.setRotationPoint(0.0F, 2.0F, 4.0F);
        this.Tail1.addBox(-1.5F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(Tail1, 1.3658946726107624F, 0.0F, 0.0F);
        
        this.Snout.setRotationPoint(0.0F, -0.6F, -2.6F);
        this.Snout.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Snout, 0.045553093477052F, 0.0F, 0.0F);
        
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.0F, 5.8F, -0.8F);
        this.FootRight.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(FootRight, 1.1383037381507017F, 0.0F, 0.0F);
        
        this.UpperArmRight.mirror = true;
        this.UpperArmRight.setRotationPoint(0.2F, 4.2F, -0.2F);
        this.UpperArmRight.addBox(-1.0F, 0.0F, -3.0F, 2, 7, 3, 0.0F);
        this.setRotateAngle(UpperArmRight, -1.8212510744560826F, 0.0F, -0.136659280431156F);
        
        this.EarRight.mirror = true;
        this.EarRight.setRotationPoint(-1.9F, -2.2F, 0.0F);
        this.EarRight.addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(EarRight, 0.18203784098300857F, 0.27314402793711257F, -0.36425021489121656F);
        
        this.LowerLegLeft.setRotationPoint(0.0F, 5.7F, 2.0F);
        this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(LowerLegLeft, -2.0488420089161434F, 0.0F, 0.0F);
        
        this.NeckLower.setRotationPoint(0.0F, -5.0F, -2.4F);
        this.NeckLower.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 6, 0.0F);
        this.setRotateAngle(NeckLower, -1.9123572614101867F, 0.0F, 0.0F);
        
        this.Mouth.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.Mouth.addBox(-1.0F, 0.0F, -2.7F, 2, 1, 3, 0.0F);
        this.setRotateAngle(Mouth, -0.18203784098300857F, 0.0F, 0.0F);
        
        this.UpperArmLeft.setRotationPoint(0.0F, 4.5F, 1.5F);
        this.UpperArmLeft.addBox(-1.0F, 0.0F, -3.0F, 2, 7, 3, 0.0F);
        this.setRotateAngle(UpperArmLeft, -1.2747884856566583F, 0.136659280431156F, 0.0F);
        
        this.Belly.setRotationPoint(0.0F, 8.0F, -0.3F);
        this.Belly.addBox(-2.5F, -2.0F, 0.0F, 5, 2, 8, 0.0F);
        this.setRotateAngle(Belly, 0.136659280431156F, 0.0F, 0.0F);
        
        this.shape38.setRotationPoint(0.0F, -5.2F, 0.9F);
        this.shape38.addBox(-1.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
        
        this.ArmBaseLeft.setRotationPoint(2.2F, -0.4F, -0.3F);
        this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(ArmBaseLeft, -0.091106186954104F, -0.18203784098300857F, 0.0F);
        
        this.ArmBaseRight.mirror = true;
        this.ArmBaseRight.setRotationPoint(-2.8F, -0.4F, -0.3F);
        this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
        this.setRotateAngle(ArmBaseRight, 0.5918411493512771F, 0.27314402793711257F, 0.0F);
        
        this.TopSnout.setRotationPoint(0.0F, 0.0F, -3.2F);
        this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(TopSnout, 0.31869712141416456F, 0.0F, 0.0F);
        this.Body.addChild(this.Hips);
        this.Hips.addChild(this.ThighLeft);
        this.UpperArmLeft.addChild(this.ArmLeft);
        this.Tail1.addChild(this.Tail2);
        this.Head.addChild(this.EarLeft);
        this.ThighLeft.addChild(this.UpperLegLeft);
        this.Chest.addChild(this.Neck);
        this.LowerLegLeft.addChild(this.FootLeft);
        this.UpperLegRight.addChild(this.LowerLegRight);
        this.ArmRight.addChild(this.HandRight);
        this.ArmLeft.addChild(this.HandLeft);
        this.UpperArmRight.addChild(this.ArmRight);
        this.Hips.addChild(this.ThighRight);
        this.ThighRight.addChild(this.UpperLegRight);
        this.Chest.addChild(this.Body);
        this.Neck.addChild(this.Head);
        this.Hips.addChild(this.Tail1);
        this.Head.addChild(this.Snout);
        this.LowerLegRight.addChild(this.FootRight);
        this.ArmBaseRight.addChild(this.UpperArmRight);
        this.Head.addChild(this.EarRight);
        this.UpperLegLeft.addChild(this.LowerLegLeft);
        this.Neck.addChild(this.NeckLower);
        this.Snout.addChild(this.Mouth);
        this.ArmBaseLeft.addChild(this.UpperArmLeft);
        this.Body.addChild(this.Belly);
        this.Neck.addChild(this.shape38);
        this.Chest.addChild(this.ArmBaseLeft);
        this.Chest.addChild(this.ArmBaseRight);
        this.Snout.addChild(this.TopSnout);
    }
}
