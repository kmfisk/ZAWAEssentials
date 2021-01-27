package com.github.kmfisk.essentials.client.model.pose;

import com.github.kmfisk.essentials.client.model.ModelEclectus;

/**
 * Eclectus - fisk
 * Created using Tabula 7.1.0
 */
public class ModelEclectusFlying extends ModelEclectus {

    public ModelEclectusFlying() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        
        this.Toe3R.mirror = true;
        this.Toe3R.setRotationPoint(0.0F, 0.3F, 0.2F);
        this.Toe3R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3R, -0.045553093477052F, -0.045553093477052F, 0.0F);
        
        this.WingTipR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR3, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.TailFeather1R.mirror = true;
        this.TailFeather1R.setRotationPoint(-0.4F, -0.1F, -0.1F);
        this.TailFeather1R.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        
        this.WingTipL5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL5.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL5, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.Tail.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Tail.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        
        this.TailBase.setRotationPoint(0.0F, 2.5F, -0.2F);
        this.TailBase.addBox(-2.0F, -1.0F, -1.5F, 4, 3, 3, 0.0F);
        this.setRotateAngle(TailBase, -0.22759093446006054F, 0.0F, 0.0F);
        
        this.FootLeft.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.FootLeft.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootLeft, 1.9123572614101867F, 0.18203784098300857F, 0.0F);
        
        this.Toe1L.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe1L.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1L, -0.091106186954104F, -0.36425021489121656F, 0.045553093477052F);
        
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(0.0F, 1.5F, 0.4F);
        this.ThighRight.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighRight, 0.091106186954104F, 0.0F, 0.0F);
        
        this.TailFeather3L.setRotationPoint(0.2F, -0.3F, -0.1F);
        this.TailFeather3L.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotateAngle(TailFeather3L, 0.0F, 0.0F, -0.045553093477052F);
        
        this.Forehead.setRotationPoint(0.0F, -2.7F, 0.9F);
        this.Forehead.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Forehead, 0.017453292519943295F, 0.0F, 0.0F);
        
        this.Toe1R.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe1R.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1R, -0.091106186954104F, 0.36425021489121656F, -0.045553093477052F);
        
        this.TailFeatherCenter.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TailFeatherCenter.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        
        this.Head.setRotationPoint(0.0F, -2.0F, 0.2F);
        this.Head.addBox(-2.0F, -2.0F, -2.5F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Head, -1.1383037381507017F, 0.0F, 0.0F);
        
        this.Wing2Left.setRotationPoint(2.0F, 5.0F, 0.0F);
        this.Wing2Left.addBox(0.0F, -5.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(Wing2Left, 0.0F, 0.0F, -0.22759093446006054F);
        
        this.WingTipL6_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL6_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL6_1, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.TailFeather1L.setRotationPoint(0.5F, -0.1F, -0.1F);
        this.TailFeather1L.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        
        this.WingTipL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL2.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL2, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.Wing3Right.mirror = true;
        this.Wing3Right.setRotationPoint(-2.0F, -5.0F, 0.0F);
        this.Wing3Right.addBox(-3.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(Wing3Right, 0.0F, 0.0F, -0.18203784098300857F);
        
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.FootRight.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootRight, 1.9123572614101867F, -0.18203784098300857F, 0.0F);
        
        this.WingTipR1.mirror = true;
        this.WingTipR1.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.WingTipR1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR1, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.TailFeather2R.mirror = true;
        this.TailFeather2R.setRotationPoint(-0.1F, -0.3F, -0.1F);
        this.TailFeather2R.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotateAngle(TailFeather2R, 0.0F, 0.0F, 0.045553093477052F);
        
        this.Wing1Right.mirror = true;
        this.Wing1Right.setRotationPoint(-2.0F, -2.5F, 1.0F);
        this.Wing1Right.addBox(-2.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        
        this.WingTipL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL3.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL3, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingTipL6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL6.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL6, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingTipR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR4.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR4, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.WingTipL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL4.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL4, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.TailFeather3R.mirror = true;
        this.TailFeather3R.setRotationPoint(-0.2F, -0.3F, -0.1F);
        this.TailFeather3R.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotateAngle(TailFeather3R, 0.0F, 0.0F, 0.045553093477052F);
        
        this.WingTipL1.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.WingTipL1.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL1, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingTipR2.mirror = true;
        this.WingTipR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR2, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.TailFeather2L.setRotationPoint(0.1F, -0.3F, -0.1F);
        this.TailFeather2L.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotateAngle(TailFeather2L, 0.0F, 0.0F, -0.045553093477052F);
        
        this.WingTipL5_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL5_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL5_1, 0.0F, 0.0F, 0.19198621771937624F);
        
        this.Beak.setRotationPoint(0.0F, 0.3F, -2.5F);
        this.Beak.addBox(-1.0F, -2.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Beak, 0.18203784098300857F, 0.0F, 0.0F);
        
        this.Body.setRotationPoint(0.0F, 20.2F, 0.0F);
        this.Body.addBox(-2.5F, -3.0F, -2.5F, 5, 6, 5, 0.0F);
        this.setRotateAngle(Body, 1.593485607070823F, 0.0F, 0.0F);
        
        this.BeakTip.setRotationPoint(0.0F, -1.5F, -1.0F);
        this.BeakTip.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        
        this.Jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Jaw.addBox(-0.5F, -0.25F, -0.8F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Jaw, -0.22759093446006054F, 0.0F, 0.0F);
        
        this.LegLeft.setRotationPoint(1.6F, 1.8F, -2.0F);
        this.LegLeft.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegLeft, -0.5918411493512771F, 0.0F, 0.0F);
        
        this.Wing3Left.setRotationPoint(2.0F, -5.0F, 0.0F);
        this.Wing3Left.addBox(0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(Wing3Left, 0.0F, 0.0F, 0.18203784098300857F);
        
        this.Neck.setRotationPoint(0.0F, -2.2F, 0.1F);
        this.Neck.addBox(-1.5F, -2.3F, -2.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Neck, -0.36425021489121656F, 0.0F, 0.0F);
        
        this.Wing1Left.setRotationPoint(2.0F, -2.5F, 1.0F);
        this.Wing1Left.addBox(0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        
        this.LegRight.mirror = true;
        this.LegRight.setRotationPoint(-1.6F, 1.8F, -2.0F);
        this.LegRight.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegRight, -0.5918411493512771F, 0.0F, 0.0F);
        
        this.Toe2R.mirror = true;
        this.Toe2R.setRotationPoint(0.2F, 0.1F, 0.2F);
        this.Toe2R.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe2R, -0.27314402793711257F, 0.6373942428283291F, 0.0F);
        
        this.Wing2Right.mirror = true;
        this.Wing2Right.setRotationPoint(-2.0F, 5.0F, 0.0F);
        this.Wing2Right.addBox(-2.0F, -5.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(Wing2Right, 0.0F, 0.0F, 0.22759093446006054F);
        
        this.Toe2L.setRotationPoint(-0.2F, 0.1F, 0.2F);
        this.Toe2L.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe2L, -0.27314402793711257F, -0.6373942428283291F, 0.0F);
        
        this.Toe3L.setRotationPoint(0.0F, 0.3F, 0.2F);
        this.Toe3L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3L, -0.045553093477052F, 0.045553093477052F, 0.0F);
        
        this.ThighLeft.setRotationPoint(0.0F, 1.5F, 0.4F);
        this.ThighLeft.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighLeft, 0.091106186954104F, 0.0F, 0.0F);
        this.FootRight.addChild(this.Toe3R);
        this.WingTipR2.addChild(this.WingTipR3);
        this.TailFeatherCenter.addChild(this.TailFeather1R);
        this.WingTipL4.addChild(this.WingTipL5);
        this.TailBase.addChild(this.Tail);
        this.Body.addChild(this.TailBase);
        this.LegLeft.addChild(this.FootLeft);
        this.FootLeft.addChild(this.Toe1L);
        this.LegRight.addChild(this.ThighRight);
        this.TailFeather2L.addChild(this.TailFeather3L);
        this.Head.addChild(this.Forehead);
        this.FootRight.addChild(this.Toe1R);
        this.Tail.addChild(this.TailFeatherCenter);
        this.Neck.addChild(this.Head);
        this.Wing1Left.addChild(this.Wing2Left);
        this.WingTipL5_1.addChild(this.WingTipL6_1);
        this.TailFeatherCenter.addChild(this.TailFeather1L);
        this.WingTipL1.addChild(this.WingTipL2);
        this.Wing2Right.addChild(this.Wing3Right);
        this.LegRight.addChild(this.FootRight);
        this.Wing3Right.addChild(this.WingTipR1);
        this.TailFeather1R.addChild(this.TailFeather2R);
        this.Body.addChild(this.Wing1Right);
        this.WingTipL2.addChild(this.WingTipL3);
        this.WingTipL5.addChild(this.WingTipL6);
        this.WingTipR3.addChild(this.WingTipR4);
        this.WingTipL3.addChild(this.WingTipL4);
        this.TailFeather2R.addChild(this.TailFeather3R);
        this.Wing3Left.addChild(this.WingTipL1);
        this.WingTipR1.addChild(this.WingTipR2);
        this.TailFeather1L.addChild(this.TailFeather2L);
        this.WingTipR4.addChild(this.WingTipL5_1);
        this.Head.addChild(this.Beak);
        this.Beak.addChild(this.BeakTip);
        this.Beak.addChild(this.Jaw);
        this.Body.addChild(this.LegLeft);
        this.Wing2Left.addChild(this.Wing3Left);
        this.Body.addChild(this.Neck);
        this.Body.addChild(this.Wing1Left);
        this.Body.addChild(this.LegRight);
        this.FootRight.addChild(this.Toe2R);
        this.Wing1Right.addChild(this.Wing2Right);
        this.FootLeft.addChild(this.Toe2L);
        this.FootLeft.addChild(this.Toe3L);
        this.LegLeft.addChild(this.ThighLeft);
    }
}
