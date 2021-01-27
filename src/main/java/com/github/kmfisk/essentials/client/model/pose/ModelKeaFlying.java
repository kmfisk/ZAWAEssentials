package com.github.kmfisk.essentials.client.model.pose;

import com.github.kmfisk.essentials.client.model.ModelKea;

/**
 * Kea - fisk
 * Created using Tabula 7.1.0
 */
public class ModelKeaFlying extends ModelKea {

    public ModelKeaFlying() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        
        this.WingTip8R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip8R.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip8R, 0.0F, 0.0F, 0.136659280431156F);
        
        this.TailFeatherL1.setRotationPoint(1.5F, -1.6F, -0.1F);
        this.TailFeatherL1.addBox(-2.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(TailFeatherL1, 0.0F, 0.0F, -0.27314402793711257F);
        
        this.TailFeatherR3.mirror = true;
        this.TailFeatherR3.setRotationPoint(-0.5F, -0.6F, -0.1F);
        this.TailFeatherR3.addBox(0.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(TailFeatherR3, 0.0F, 0.0F, 0.27314402793711257F);
        
        this.Forehead.setRotationPoint(0.0F, -3.0F, 1.5F);
        this.Forehead.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        
        this.Wing3Left.setRotationPoint(3.0F, -7.0F, 0.0F);
        this.Wing3Left.addBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
        this.setRotateAngle(Wing3Left, 0.0F, 0.0F, 0.18203784098300857F);
        
        this.WingTip1L.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.WingTip1L.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip1L, 0.0F, 0.0F, -0.136659280431156F);
        
        this.Head.setRotationPoint(0.0F, -1.3F, -1.1F);
        this.Head.addBox(-2.0F, -2.5F, -2.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Head, -0.7285004297824331F, 0.0F, 0.0F);
        
        this.Wing2Left.setRotationPoint(3.0F, 7.0F, 0.0F);
        this.Wing2Left.addBox(0.0F, -7.0F, 0.0F, 3, 6, 1, 0.0F);
        this.setRotateAngle(Wing2Left, 0.0F, 0.0F, -0.18203784098300857F);
        
        this.TailFeatherR1.mirror = true;
        this.TailFeatherR1.setRotationPoint(-1.5F, -1.6F, -0.1F);
        this.TailFeatherR1.addBox(0.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(TailFeatherR1, 0.0F, 0.0F, 0.27314402793711257F);
        
        this.TailFeatherL2.setRotationPoint(0.5F, -0.6F, -0.1F);
        this.TailFeatherL2.addBox(-2.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(TailFeatherL2, 0.0F, 0.0F, -0.27314402793711257F);
        
        this.Toe3R.mirror = true;
        this.Toe3R.setRotationPoint(0.0F, 0.3F, 0.2F);
        this.Toe3R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3R, -0.045553093477052F, -0.045553093477052F, 0.0F);
        
        this.BeakTip.setRotationPoint(0.0F, 0.8F, -2.0F);
        this.BeakTip.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(BeakTip, -0.22759093446006054F, 0.0F, 0.0F);
        
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.FootRight.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootRight, 1.2292353921796064F, -0.18203784098300857F, 0.0F);
        
        this.WingTip4L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4L.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip4L, 0.0F, 0.0F, -0.136659280431156F);
        
        this.WingTip5L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5L.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip5L, 0.0F, 0.0F, -0.136659280431156F);
        
        this.LegLeft.setRotationPoint(1.6F, 1.2F, -1.8F);
        this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegLeft, -0.5009094953223726F, 0.0F, 0.0F);
        
        this.Tail1.setRotationPoint(0.0F, 3.5F, 0.2F);
        this.Tail1.addBox(-2.0F, -1.0F, -1.5F, 4, 3, 3, 0.0F);
        this.setRotateAngle(Tail1, -0.091106186954104F, 0.0F, 0.0F);
        
        this.WingTip3L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3L.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip3L, 0.0F, 0.0F, -0.136659280431156F);
        
        this.Mouth.setRotationPoint(0.0F, 1.8F, -0.1F);
        this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2, 0.0F);
        
        this.Toe2R.mirror = true;
        this.Toe2R.setRotationPoint(0.2F, 0.1F, 0.2F);
        this.Toe2R.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe2R, -0.27314402793711257F, 0.6373942428283291F, 0.0F);
        
        this.Wing1Left.setRotationPoint(2.5F, -3.0F, 1.2F);
        this.Wing1Left.addBox(-1.0F, 0.0F, 0.0F, 4, 6, 1, 0.0F);
        
        this.TailFeatherCenter.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.TailFeatherCenter.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        
        this.WingTip5R.mirror = true;
        this.WingTip5R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5R.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip5R, 0.0F, 0.0F, 0.136659280431156F);
        
        this.WingTip6L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip6L.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip6L, 0.0F, 0.0F, -0.136659280431156F);
        
        this.Beak.setRotationPoint(0.0F, -1.7F, -1.3F);
        this.Beak.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Beak, -0.136659280431156F, 0.0F, 0.0F);
        
        this.Body.setRotationPoint(0.0F, 20.2F, 0.0F);
        this.Body.addBox(-2.5F, -3.5F, -2.5F, 5, 7, 5, 0.0F);
        this.setRotateAngle(Body, 1.5707963267948966F, 0.0F, 0.0F);
        
        this.LegRight.mirror = true;
        this.LegRight.setRotationPoint(-1.6F, 1.2F, -1.8F);
        this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegRight, -0.5009094953223726F, 0.0F, 0.0F);
        
        this.WingTip8L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip8L.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip8L, 0.0F, 0.0F, -0.136659280431156F);
        
        this.Toe2L.setRotationPoint(-0.2F, 0.1F, 0.2F);
        this.Toe2L.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe2L, -0.27314402793711257F, -0.6373942428283291F, 0.0F);
        
        this.WingTip7R.mirror = true;
        this.WingTip7R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip7R.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip7R, 0.0F, 0.0F, 0.136659280431156F);
        
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(0.0F, -0.8F, 0.0F);
        this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        
        this.Wing1Right.mirror = true;
        this.Wing1Right.setRotationPoint(-2.5F, -3.0F, 1.2F);
        this.Wing1Right.addBox(-3.0F, 0.0F, 0.0F, 4, 6, 1, 0.0F);
        
        this.TailFeatherR2.mirror = true;
        this.TailFeatherR2.setRotationPoint(-0.5F, -0.6F, -0.1F);
        this.TailFeatherR2.addBox(0.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(TailFeatherR2, 0.0F, 0.0F, 0.27314402793711257F);
        
        this.Tail2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Tail2.addBox(-1.5F, -1.0F, -1.0F, 3, 3, 2, 0.0F);
        
        this.Toe1L.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe1L.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1L, -0.091106186954104F, -0.36425021489121656F, 0.045553093477052F);
        
        this.WingTip1R.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.WingTip1R.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip1R, 0.0F, 0.0F, 0.136659280431156F);
        
        this.WingTip7L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip7L.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip7L, 0.0F, 0.0F, -0.136659280431156F);
        
        this.WingTip6R.mirror = true;
        this.WingTip6R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip6R.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip6R, 0.0F, 0.0F, 0.136659280431156F);
        
        this.Wing3Right.mirror = true;
        this.Wing3Right.setRotationPoint(-3.0F, -7.0F, 0.0F);
        this.Wing3Right.addBox(-2.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
        this.setRotateAngle(Wing3Right, 0.0F, 0.0F, -0.18203784098300857F);
        
        this.Wing2Right.mirror = true;
        this.Wing2Right.setRotationPoint(-3.0F, 7.0F, 0.0F);
        this.Wing2Right.addBox(-3.0F, -7.0F, 0.0F, 3, 6, 1, 0.0F);
        this.setRotateAngle(Wing2Right, 0.0F, 0.0F, 0.18203784098300857F);
        
        this.ThighLeft.setRotationPoint(0.0F, -0.8F, 0.0F);
        this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        
        this.Neck.setRotationPoint(0.0F, -3.3F, 1.0F);
        this.Neck.addBox(-1.5F, -1.0F, -2.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Neck, -0.4553564018453205F, 0.0F, 0.0F);
        
        this.WingTip2L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2L.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip2L, 0.0F, 0.0F, -0.136659280431156F);
        
        this.FootLeft.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.FootLeft.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootLeft, 1.2292353921796064F, 0.18203784098300857F, 0.0F);
        
        this.Toe1R.mirror = true;
        this.Toe1R.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe1R.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1R, -0.091106186954104F, 0.36425021489121656F, -0.045553093477052F);
        
        this.Toe3L.setRotationPoint(0.0F, 0.3F, 0.2F);
        this.Toe3L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3L, -0.045553093477052F, 0.045553093477052F, 0.0F);
        
        this.TailFeatherL3.setRotationPoint(0.5F, -0.6F, -0.1F);
        this.TailFeatherL3.addBox(-2.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(TailFeatherL3, 0.0F, 0.0F, -0.27314402793711257F);
        
        this.WingTip4R.mirror = true;
        this.WingTip4R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4R.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip4R, 0.0F, 0.0F, 0.136659280431156F);
        
        this.WingTip2R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2R.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip2R, 0.0F, 0.0F, 0.136659280431156F);
        
        this.WingTip3R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3R.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip3R, 0.0F, 0.0F, 0.136659280431156F);
        this.WingTip7R.addChild(this.WingTip8R);
        this.TailFeatherCenter.addChild(this.TailFeatherL1);
        this.TailFeatherR2.addChild(this.TailFeatherR3);
        this.Head.addChild(this.Forehead);
        this.Wing2Left.addChild(this.Wing3Left);
        this.Wing3Left.addChild(this.WingTip1L);
        this.Neck.addChild(this.Head);
        this.Wing1Left.addChild(this.Wing2Left);
        this.TailFeatherCenter.addChild(this.TailFeatherR1);
        this.TailFeatherL1.addChild(this.TailFeatherL2);
        this.FootRight.addChild(this.Toe3R);
        this.Beak.addChild(this.BeakTip);
        this.ThighRight.addChild(this.FootRight);
        this.WingTip3L.addChild(this.WingTip4L);
        this.WingTip4L.addChild(this.WingTip5L);
        this.Body.addChild(this.LegLeft);
        this.Body.addChild(this.Tail1);
        this.WingTip2L.addChild(this.WingTip3L);
        this.Beak.addChild(this.Mouth);
        this.FootRight.addChild(this.Toe2R);
        this.Body.addChild(this.Wing1Left);
        this.Tail2.addChild(this.TailFeatherCenter);
        this.WingTip4R.addChild(this.WingTip5R);
        this.WingTip5L.addChild(this.WingTip6L);
        this.Head.addChild(this.Beak);
        this.Body.addChild(this.LegRight);
        this.WingTip7L.addChild(this.WingTip8L);
        this.FootLeft.addChild(this.Toe2L);
        this.WingTip6R.addChild(this.WingTip7R);
        this.LegRight.addChild(this.ThighRight);
        this.Body.addChild(this.Wing1Right);
        this.TailFeatherR1.addChild(this.TailFeatherR2);
        this.Tail1.addChild(this.Tail2);
        this.FootLeft.addChild(this.Toe1L);
        this.Wing3Right.addChild(this.WingTip1R);
        this.WingTip6L.addChild(this.WingTip7L);
        this.WingTip5R.addChild(this.WingTip6R);
        this.Wing2Right.addChild(this.Wing3Right);
        this.Wing1Right.addChild(this.Wing2Right);
        this.LegLeft.addChild(this.ThighLeft);
        this.Body.addChild(this.Neck);
        this.WingTip1L.addChild(this.WingTip2L);
        this.ThighLeft.addChild(this.FootLeft);
        this.FootRight.addChild(this.Toe1R);
        this.FootLeft.addChild(this.Toe3L);
        this.TailFeatherL2.addChild(this.TailFeatherL3);
        this.WingTip3R.addChild(this.WingTip4R);
        this.WingTip1R.addChild(this.WingTip2R);
        this.WingTip2R.addChild(this.WingTip3R);
    }
}
