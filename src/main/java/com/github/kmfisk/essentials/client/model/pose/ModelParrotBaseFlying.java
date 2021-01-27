package com.github.kmfisk.essentials.client.model.pose;

import com.github.kmfisk.essentials.client.model.ModelParrotBase;

/**
 * ParrotBase - fisk
 * Created using Tabula 7.1.0
 */
public class ModelParrotBaseFlying extends ModelParrotBase {

    public ModelParrotBaseFlying() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        
        this.Forehead.setRotationPoint(0.0F, -2.8F, 0.9F);
        this.Forehead.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        
        this.Toe2L.setRotationPoint(-0.2F, 0.1F, 0.2F);
        this.Toe2L.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe2L, -2.5953045977155678F, -0.6373942428283291F, 0.0F);
        
        this.ThighLeft.setRotationPoint(0.0F, -0.7F, 0.8F);
        this.ThighLeft.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighLeft, 1.6390387005478748F, 0.0F, -0.27314402793711257F);
        
        this.WingTipL5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL5.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL5, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingTipR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR3, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.Wing2Right.mirror = true;
        this.Wing2Right.setRotationPoint(-2.0F, 5.0F, 0.0F);
        this.Wing2Right.addBox(-2.0F, -5.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(Wing2Right, 0.0F, 0.0F, 0.22759093446006054F);
        
        this.WingTipR6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR6.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR6, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.WingTipL1.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.WingTipL1.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL1, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingTipR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR4.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR4, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.LegRight.mirror = true;
        this.LegRight.setRotationPoint(-1.3F, 1.1F, -2.3F);
        this.LegRight.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegRight, -3.0049333731586367F, 0.0F, 0.27314402793711257F);
        
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(0.0F, -0.7F, 0.8F);
        this.ThighRight.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighRight, 1.6390387005478748F, 0.0F, 0.27314402793711257F);
        
        this.Head.setRotationPoint(0.0F, -1.6F, 0.4F);
        this.Head.addBox(-2.0F, -2.0F, -2.5F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Head, -0.8651597102135892F, 0.0F, 0.0F);
        
        this.WingTipL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL3.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL3, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.Toe3R.mirror = true;
        this.Toe3R.setRotationPoint(0.0F, 0.3F, 0.2F);
        this.Toe3R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3R, -3.096039560112741F, -0.045553093477052F, 0.0F);
        
        this.WingTipR1.mirror = true;
        this.WingTipR1.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.WingTipR1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR1, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.WingTipL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL4.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL4, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.Body.setRotationPoint(0.0F, 19.5F, 0.0F);
        this.Body.addBox(-2.0F, -3.0F, -2.5F, 4, 6, 5, 0.0F);
        this.setRotateAngle(Body, 1.5481070465189704F, 0.0F, 0.0F);
        
        this.Toe3L.setRotationPoint(0.0F, 0.3F, 0.2F);
        this.Toe3L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3L, -3.096039560112741F, 0.045553093477052F, 0.0F);
        
        this.Wing2Left.setRotationPoint(2.0F, 5.0F, 0.0F);
        this.Wing2Left.addBox(0.0F, -5.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(Wing2Left, 0.0F, 0.0F, -0.22759093446006054F);
        
        this.TailFeatherR2.mirror = true;
        this.TailFeatherR2.setRotationPoint(-0.1F, -0.7F, -0.1F);
        this.TailFeatherR2.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(TailFeatherR2, 0.0F, 0.0F, 0.045553093477052F);
        
        this.TailFeatherCenter.setRotationPoint(0.0F, 1.7F, 0.0F);
        this.TailFeatherCenter.addBox(-1.0F, 0.0F, -0.5F, 2, 8, 1, 0.0F);
        
        this.TailFeatherL1.setRotationPoint(1.9F, -2.9F, -0.7F);
        this.TailFeatherL1.addBox(-2.0F, 0.0F, 0.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(TailFeatherL1, 0.0F, 0.045553093477052F, 0.045553093477052F);
        
        this.TailFeatherL2.setRotationPoint(0.1F, -0.7F, -0.1F);
        this.TailFeatherL2.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(TailFeatherL2, 0.0F, 0.0F, -0.045553093477052F);
        
        this.Neck.setRotationPoint(0.0F, -3.0F, 0.2F);
        this.Neck.addBox(-1.5F, -2.0F, -2.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Neck, -0.36425021489121656F, 0.0F, 0.0F);
        
        this.Wing1Right.mirror = true;
        this.Wing1Right.setRotationPoint(-2.0F, -2.5F, 1.0F);
        this.Wing1Right.addBox(-2.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        
        this.Beak.setRotationPoint(0.0F, 0.6F, -2.7F);
        this.Beak.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        
        this.LegLeft.setRotationPoint(1.3F, 1.1F, -2.3F);
        this.LegLeft.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegLeft, -3.0049333731586367F, 0.0F, -0.27314402793711257F);
        
        this.Toe1L.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe1L.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1L, -0.091106186954104F, -0.36425021489121656F, 0.045553093477052F);
        
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.FootRight.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootRight, 1.9577358219620393F, -0.18203784098300857F, 0.0F);
        
        this.Tail.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Tail.addBox(-1.5F, -1.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(Tail, -0.045553093477052F, 0.0F, 0.0F);
        
        this.TailBase.setRotationPoint(0.0F, 2.5F, -0.2F);
        this.TailBase.addBox(-2.0F, -1.0F, -1.5F, 4, 4, 3, 0.0F);
        this.setRotateAngle(TailBase, -0.091106186954104F, 0.0F, 0.0F);
        
        this.Jaw.setRotationPoint(0.0F, 0.2F, 0.5F);
        this.Jaw.addBox(-0.5F, -0.25F, -1.2F, 1, 1, 2, 0.0F);
        
        this.TailFeatherR1.mirror = true;
        this.TailFeatherR1.setRotationPoint(-1.9F, -2.9F, -0.7F);
        this.TailFeatherR1.addBox(0.0F, 0.0F, 0.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(TailFeatherR1, 0.0F, 0.0F, -0.045553093477052F);
        
        this.WingTipR5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR5.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR5, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.BeakTip.setRotationPoint(0.0F, -1.6F, -1.1F);
        this.BeakTip.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(BeakTip, 0.091106186954104F, 0.0F, 0.0F);
        
        this.FootLeft.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.FootLeft.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootLeft, 1.9577358219620393F, 0.18203784098300857F, 0.0F);
        
        this.Wing3Left.setRotationPoint(2.0F, -5.0F, 0.0F);
        this.Wing3Left.addBox(0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(Wing3Left, 0.0F, 0.0F, 0.18203784098300857F);
        
        this.Toe2R.mirror = true;
        this.Toe2R.setRotationPoint(0.2F, 0.1F, 0.2F);
        this.Toe2R.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe2R, -2.5953045977155678F, 0.6373942428283291F, 0.0F);
        
        this.WingTipL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL2.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL2, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.Wing1Left.setRotationPoint(2.0F, -2.5F, 1.0F);
        this.Wing1Left.addBox(0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        
        this.Toe1R.mirror = true;
        this.Toe1R.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe1R.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1R, -0.091106186954104F, 0.36425021489121656F, -0.045553093477052F);
        
        this.Wing3Right.mirror = true;
        this.Wing3Right.setRotationPoint(-2.0F, -5.0F, 0.0F);
        this.Wing3Right.addBox(-3.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(Wing3Right, 0.0F, 0.0F, -0.18203784098300857F);
        
        this.WingTipR2.mirror = true;
        this.WingTipR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR2, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.WingTipL6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL6.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL6, 0.0F, 0.0F, -0.19198621771937624F);
        this.Head.addChild(this.Forehead);
        this.FootLeft.addChild(this.Toe2L);
        this.LegLeft.addChild(this.ThighLeft);
        this.WingTipL4.addChild(this.WingTipL5);
        this.WingTipR2.addChild(this.WingTipR3);
        this.Wing1Right.addChild(this.Wing2Right);
        this.WingTipR5.addChild(this.WingTipR6);
        this.Wing3Left.addChild(this.WingTipL1);
        this.WingTipR3.addChild(this.WingTipR4);
        this.Body.addChild(this.LegRight);
        this.LegRight.addChild(this.ThighRight);
        this.Neck.addChild(this.Head);
        this.WingTipL2.addChild(this.WingTipL3);
        this.FootRight.addChild(this.Toe3R);
        this.Wing3Right.addChild(this.WingTipR1);
        this.WingTipL3.addChild(this.WingTipL4);
        this.FootLeft.addChild(this.Toe3L);
        this.Wing1Left.addChild(this.Wing2Left);
        this.TailFeatherR1.addChild(this.TailFeatherR2);
        this.Tail.addChild(this.TailFeatherCenter);
        this.TailFeatherCenter.addChild(this.TailFeatherL1);
        this.TailFeatherL1.addChild(this.TailFeatherL2);
        this.Body.addChild(this.Neck);
        this.Body.addChild(this.Wing1Right);
        this.Head.addChild(this.Beak);
        this.Body.addChild(this.LegLeft);
        this.FootLeft.addChild(this.Toe1L);
        this.LegRight.addChild(this.FootRight);
        this.TailBase.addChild(this.Tail);
        this.Body.addChild(this.TailBase);
        this.Beak.addChild(this.Jaw);
        this.TailFeatherCenter.addChild(this.TailFeatherR1);
        this.WingTipR4.addChild(this.WingTipR5);
        this.Beak.addChild(this.BeakTip);
        this.LegLeft.addChild(this.FootLeft);
        this.Wing2Left.addChild(this.Wing3Left);
        this.FootRight.addChild(this.Toe2R);
        this.WingTipL1.addChild(this.WingTipL2);
        this.Body.addChild(this.Wing1Left);
        this.FootRight.addChild(this.Toe1R);
        this.Wing2Right.addChild(this.Wing3Right);
        this.WingTipR1.addChild(this.WingTipR2);
        this.WingTipL5.addChild(this.WingTipL6);
    }
}
