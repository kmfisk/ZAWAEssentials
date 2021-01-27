package com.github.kmfisk.essentials.client.model.pose;

import com.github.kmfisk.essentials.client.model.ModelCongoGrayParrot;

/**
 * CongoGrayParrot - fisk
 * Created using Tabula 7.1.0
 */
public class ModelCongoGrayParrotFlying extends ModelCongoGrayParrot {

    public ModelCongoGrayParrotFlying() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        
        this.Head.setRotationPoint(0.0F, -2.2F, 0.9F);
        this.Head.addBox(-2.0F, -1.0F, -3.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(Head, -0.5462880558742251F, 0.0F, 0.0F);
        
        this.Wing1Right.mirror = true;
        this.Wing1Right.setRotationPoint(-2.5F, -2.4F, 1.9F);
        this.Wing1Right.addBox(-1.5F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(Wing1Right, 0.0F, 0.0F, 0.091106186954104F);
        
        this.WingFoldedRight.setRotationPoint(-2.0F, -2.9F, 2.4F);
        this.WingFoldedRight.addBox(0.0F, 0.0F, -1.0F, 5, 5, 1, 0.0F);
        this.setRotateAngle(WingFoldedRight, 0.0F, 1.5707963267948966F, 0.0F);
        
        this.WingTipL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL4.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL4, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.LegLeft.setRotationPoint(1.4F, 0.7F, -2.5F);
        this.LegLeft.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegLeft, -3.096039560112741F, 0.0F, 0.0F);
        
        this.WingTipR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR3, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.WingTipR6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR6.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR6, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.WingTipR3A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR3A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR3A, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingTipL2A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL2A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL2A, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.TailFeatherR2.mirror = true;
        this.TailFeatherR2.setRotationPoint(-0.1F, -0.4F, -0.1F);
        this.TailFeatherR2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(TailFeatherR2, 0.0F, 0.0F, 0.091106186954104F);
        
        this.TailBase.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.TailBase.addBox(-2.0F, -1.0F, -1.5F, 4, 3, 3, 0.0F);
        this.setRotateAngle(TailBase, -0.31869712141416456F, 0.0F, 0.0F);
        
        this.WingTipL3A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL3A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL3A, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.Body.setRotationPoint(0.0F, 19.5F, 0.0F);
        this.Body.addBox(-2.5F, -3.0F, -2.5F, 5, 6, 5, 0.0F);
        this.setRotateAngle(Body, 1.5481070465189704F, 0.0F, 0.0F);
        
        this.Forehead.setRotationPoint(0.0F, -1.6F, 0.9F);
        this.Forehead.addBox(-1.5F, 0.0F, -4.0F, 3, 1, 3, 0.0F);
        
        this.Toe1L.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe1L.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1L, -0.091106186954104F, -0.36425021489121656F, 0.045553093477052F);
        
        this.Toe1R.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe1R.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1R, -0.091106186954104F, 0.36425021489121656F, -0.045553093477052F);
        
        this.Wing2Right.mirror = true;
        this.Wing2Right.setRotationPoint(-1.5F, 5.0F, 0.0F);
        this.Wing2Right.addBox(-2.0F, -5.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(Wing2Right, 0.0F, 0.0F, 0.136659280431156F);
        
        this.Toe3R.mirror = true;
        this.Toe3R.setRotationPoint(0.0F, 0.3F, 0.2F);
        this.Toe3R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3R, -0.045553093477052F, -0.045553093477052F, 0.0F);
        
        this.WingTipL6A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL6A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL6A, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingTipR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR4.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR4, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.TailFeatherL1.setRotationPoint(1.5F, -0.4F, -0.5F);
        this.TailFeatherL1.addBox(-2.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(TailFeatherL1, 0.0F, 0.0F, -0.091106186954104F);
        
        this.Beak.setRotationPoint(0.0F, 1.3F, -3.5F);
        this.Beak.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        
        this.WingTipR5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR5.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR5, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.Wing2Left.setRotationPoint(1.5F, 5.0F, 0.0F);
        this.Wing2Left.addBox(0.0F, -5.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(Wing2Left, 0.0F, 0.0F, -0.136659280431156F);
        
        this.WingTipR5A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR5A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR5A, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.Tail.setRotationPoint(0.0F, 2.7F, 0.0F);
        this.Tail.addBox(-1.5F, -1.0F, -1.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Tail, -0.045553093477052F, 0.0F, 0.0F);
        
        this.TailFeatherR1.mirror = true;
        this.TailFeatherR1.setRotationPoint(-1.5F, -0.4F, -0.5F);
        this.TailFeatherR1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(TailFeatherR1, 0.0F, 0.0F, 0.091106186954104F);
        
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.ThighRight.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighRight, 0.091106186954104F, 0.0F, 0.0F);
        
        this.WingTipR2A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR2A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR2A, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.TailFeatherR3.mirror = true;
        this.TailFeatherR3.setRotationPoint(-0.4F, -0.9F, -0.1F);
        this.TailFeatherR3.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        
        this.Wing3Right.mirror = true;
        this.Wing3Right.setRotationPoint(-2.0F, -5.0F, 0.0F);
        this.Wing3Right.addBox(-3.0F, 0.0F, -0.5F, 3, 5, 1, 0.0F);
        this.setRotateAngle(Wing3Right, 0.0F, 0.0F, -0.22759093446006054F);
        
        this.WingTipL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL3.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL3, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingTipR4A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR4A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR4A, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.Toe2L.setRotationPoint(-0.2F, 0.1F, 0.2F);
        this.Toe2L.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe2L, -0.27314402793711257F, -0.6373942428283291F, 0.0F);
        
        this.WingTipR6A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR6A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR6A, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.Neck.setRotationPoint(0.0F, -3.0F, 0.2F);
        this.Neck.addBox(-1.5F, -2.5F, -2.0F, 3, 4, 4, 0.0F);
        this.setRotateAngle(Neck, -0.5009094953223726F, 0.0F, 0.0F);
        
        this.FootLeft.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.FootLeft.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootLeft, 1.9123572614101867F, 0.18203784098300857F, 0.0F);
        
        this.WingTipL4A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL4A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL4A, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.Wing3Left.setRotationPoint(2.0F, -5.0F, 0.0F);
        this.Wing3Left.addBox(0.0F, 0.0F, -0.5F, 3, 5, 1, 0.0F);
        this.setRotateAngle(Wing3Left, 0.0F, 0.0F, 0.22759093446006054F);
        
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.FootRight.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootRight, 1.9123572614101867F, -0.18203784098300857F, 0.0F);
        
        this.BeakTip.setRotationPoint(0.0F, -1.5F, -1.0F);
        this.BeakTip.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        
        this.ThighLeft.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.ThighLeft.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighLeft, 0.091106186954104F, 0.0F, 0.0F);
        
        this.LegRight.setRotationPoint(-1.4F, 0.7F, -2.5F);
        this.LegRight.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegRight, -3.096039560112741F, 0.0F, 0.0F);
        
        this.Wing1Left.setRotationPoint(2.5F, -2.4F, 1.9F);
        this.Wing1Left.addBox(-0.5F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(Wing1Left, 0.0F, 0.0F, -0.091106186954104F);
        
        this.WingTipL1A.setRotationPoint(5.1F, 3.0F, -0.1F);
        this.WingTipL1A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL1A, 0.0F, 0.0F, 1.1838568316277536F);
        
        this.Jaw.setRotationPoint(0.0F, 0.0F, 0.7F);
        this.Jaw.addBox(-0.5F, -0.25F, -1.2F, 1, 1, 2, 0.0F);
        
        this.WingTipL5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL5.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL5, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.Toe3L.setRotationPoint(0.0F, 0.3F, 0.2F);
        this.Toe3L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3L, -0.045553093477052F, 0.045553093477052F, 0.0F);
        
        this.WingTipR1A.setRotationPoint(5.1F, 3.0F, -0.9F);
        this.WingTipR1A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR1A, 0.0F, 0.0F, 1.1838568316277536F);
        
        this.Toe2R.mirror = true;
        this.Toe2R.setRotationPoint(0.2F, 0.1F, 0.2F);
        this.Toe2R.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe2R, -0.27314402793711257F, 0.6373942428283291F, 0.0F);
        
        this.TailFeatherCenter.setRotationPoint(0.0F, 1.0F, 0.2F);
        this.TailFeatherCenter.addBox(-1.0F, 0.0F, -0.5F, 2, 2, 1, 0.0F);
        
        this.WingTipL6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL6.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL6, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingTipL1.setRotationPoint(3.0F, 0.0F, -0.5F);
        this.WingTipL1.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL1, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.TailFeatherL3.setRotationPoint(0.4F, -0.9F, -0.1F);
        this.TailFeatherL3.addBox(-2.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        
        this.WingTipL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL2.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL2, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingTipR1.setRotationPoint(-3.0F, 0.0F, -0.5F);
        this.WingTipR1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR1, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.TailFeatherL2.setRotationPoint(0.1F, -0.4F, -0.1F);
        this.TailFeatherL2.addBox(-2.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(TailFeatherL2, 0.0F, 0.0F, -0.091106186954104F);
        
        this.WingTipL5A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL5A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL5A, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingFoldedLeft.setRotationPoint(2.0F, -2.9F, 2.4F);
        this.WingFoldedLeft.addBox(0.0F, 0.0F, 0.0F, 5, 5, 1, 0.0F);
        this.setRotateAngle(WingFoldedLeft, 0.0F, 1.5707963267948966F, 0.0F);
        
        this.WingTipR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR2, 0.0F, 0.0F, 0.19198621771937624F);
        this.Neck.addChild(this.Head);
        this.Body.addChild(this.Wing1Right);
        this.Body.addChild(this.WingFoldedRight);
        this.WingTipL3.addChild(this.WingTipL4);
        this.Body.addChild(this.LegLeft);
        this.WingTipR2.addChild(this.WingTipR3);
        this.WingTipR5.addChild(this.WingTipR6);
        this.WingTipR2A.addChild(this.WingTipR3A);
        this.WingTipL1A.addChild(this.WingTipL2A);
        this.TailFeatherR1.addChild(this.TailFeatherR2);
        this.Body.addChild(this.TailBase);
        this.WingTipL2A.addChild(this.WingTipL3A);
        this.Head.addChild(this.Forehead);
        this.FootLeft.addChild(this.Toe1L);
        this.FootRight.addChild(this.Toe1R);
        this.Wing1Right.addChild(this.Wing2Right);
        this.FootRight.addChild(this.Toe3R);
        this.WingTipL5A.addChild(this.WingTipL6A);
        this.WingTipR3.addChild(this.WingTipR4);
        this.Tail.addChild(this.TailFeatherL1);
        this.Head.addChild(this.Beak);
        this.WingTipR4.addChild(this.WingTipR5);
        this.Wing1Left.addChild(this.Wing2Left);
        this.WingTipR4A.addChild(this.WingTipR5A);
        this.TailBase.addChild(this.Tail);
        this.Tail.addChild(this.TailFeatherR1);
        this.LegRight.addChild(this.ThighRight);
        this.WingTipR1A.addChild(this.WingTipR2A);
        this.TailFeatherR2.addChild(this.TailFeatherR3);
        this.Wing2Right.addChild(this.Wing3Right);
        this.WingTipL2.addChild(this.WingTipL3);
        this.WingTipR3A.addChild(this.WingTipR4A);
        this.FootLeft.addChild(this.Toe2L);
        this.WingTipR5A.addChild(this.WingTipR6A);
        this.Body.addChild(this.Neck);
        this.LegLeft.addChild(this.FootLeft);
        this.WingTipL3A.addChild(this.WingTipL4A);
        this.Wing2Left.addChild(this.Wing3Left);
        this.LegRight.addChild(this.FootRight);
        this.Beak.addChild(this.BeakTip);
        this.LegLeft.addChild(this.ThighLeft);
        this.Body.addChild(this.LegRight);
        this.Body.addChild(this.Wing1Left);
        this.WingFoldedLeft.addChild(this.WingTipL1A);
        this.Beak.addChild(this.Jaw);
        this.WingTipL4.addChild(this.WingTipL5);
        this.FootLeft.addChild(this.Toe3L);
        this.WingFoldedRight.addChild(this.WingTipR1A);
        this.FootRight.addChild(this.Toe2R);
        this.Tail.addChild(this.TailFeatherCenter);
        this.WingTipL5.addChild(this.WingTipL6);
        this.Wing3Left.addChild(this.WingTipL1);
        this.TailFeatherL2.addChild(this.TailFeatherL3);
        this.WingTipL1.addChild(this.WingTipL2);
        this.Wing3Right.addChild(this.WingTipR1);
        this.TailFeatherL1.addChild(this.TailFeatherL2);
        this.WingTipL4A.addChild(this.WingTipL5A);
        this.Body.addChild(this.WingFoldedLeft);
        this.WingTipR1.addChild(this.WingTipR2);
    }
}
