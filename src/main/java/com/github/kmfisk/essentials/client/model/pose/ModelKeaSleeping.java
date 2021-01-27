package com.github.kmfisk.essentials.client.model.pose;

import com.github.kmfisk.essentials.client.model.ModelKea;

/**
 * Kea - fisk
 * Created using Tabula 7.1.0
 */
public class ModelKeaSleeping extends ModelKea {

    public ModelKeaSleeping() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        
        this.TailFeatherL2.setRotationPoint(0.2F, -0.3F, -0.1F);
        this.TailFeatherL2.addBox(-2.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(TailFeatherL2, 0.0F, 0.0F, -0.045553093477052F);
        
        this.BeakTip.setRotationPoint(0.0F, 0.8F, -2.0F);
        this.BeakTip.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(BeakTip, -0.22759093446006054F, 0.0F, 0.0F);
        
        this.FootLeft.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.FootLeft.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootLeft, 2.4586453172844123F, 0.18203784098300857F, 0.0F);
        
        this.LegLeft.setRotationPoint(2.6F, 1.2F, -0.8F);
        this.LegLeft.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegLeft, -2.1855012893472994F, 0.5462880558742251F, 0.0F);
        
        this.LegRight.mirror = true;
        this.LegRight.setRotationPoint(-1.6F, 1.2F, -0.8F);
        this.LegRight.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegRight, -1.2292353921796064F, 0.0F, 0.0F);
        
        this.Toe2R.mirror = true;
        this.Toe2R.setRotationPoint(0.2F, 0.1F, 0.2F);
        this.Toe2R.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe2R, -0.27314402793711257F, 0.6373942428283291F, 0.0F);
        
        this.WingTip5RA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5RA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip5RA, 0.0F, 0.0F, -0.045553093477052F);
        
        this.TailFeatherR3.mirror = true;
        this.TailFeatherR3.setRotationPoint(-0.3F, -0.6F, -0.1F);
        this.TailFeatherR3.addBox(0.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
        
        this.WingTip2RA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2RA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip2RA, 0.0F, 0.0F, -0.136659280431156F);
        
        this.Toe3L.setRotationPoint(0.0F, 0.3F, 0.2F);
        this.Toe3L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3L, -0.045553093477052F, 0.045553093477052F, 0.0F);
        
        this.Toe3R.mirror = true;
        this.Toe3R.setRotationPoint(0.0F, 0.3F, 0.2F);
        this.Toe3R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3R, -0.045553093477052F, -0.045553093477052F, 0.0F);
        
        this.TailFeatherR2.mirror = true;
        this.TailFeatherR2.setRotationPoint(-0.2F, -0.3F, -0.1F);
        this.TailFeatherR2.addBox(0.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(TailFeatherR2, 0.0F, 0.0F, 0.045553093477052F);
        
        this.WingTip3LA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3LA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip3LA, 0.0F, 0.0F, -0.091106186954104F);
        
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.FootRight.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootRight, 0.22759093446006054F, -0.5918411493512771F, 0.0F);
        
        this.WingTip5LA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5LA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip5LA, 0.0F, 0.0F, -0.045553093477052F);
        
        this.TailFeatherL1.setRotationPoint(1.4F, -1.4F, -0.1F);
        this.TailFeatherL1.addBox(-2.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(TailFeatherL1, 0.0F, 0.0F, -0.091106186954104F);
        
        this.WingFoldedRight.setRotationPoint(-2.2F, -3.0F, 2.3F);
        this.WingFoldedRight.addBox(0.0F, 0.0F, -1.0F, 5, 5, 1, 0.0F);
        this.setRotateAngle(WingFoldedRight, 0.0F, 1.5707963267948966F, 0.0F);
        
        this.Neck.setRotationPoint(0.7F, -2.3F, 1.3F);
        this.Neck.addBox(-1.5F, -1.0F, -2.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Neck, -0.8196066167365371F, 0.40980330836826856F, 0.0F);
        
        this.WingTip8LA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip8LA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip8LA, 0.0F, 0.0F, -0.091106186954104F);
        
        this.ThighLeft.setRotationPoint(0.0F, 0.7F, 0.0F);
        this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ThighLeft, 0.6373942428283291F, 0.0F, 0.0F);
        
        this.WingTip6LA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip6LA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip6LA, 0.0F, 0.0F, -0.045553093477052F);
        
        this.WingFoldedLeft.setRotationPoint(2.2F, -3.0F, 2.3F);
        this.WingFoldedLeft.addBox(0.0F, 0.0F, 0.0F, 5, 5, 1, 0.0F);
        this.setRotateAngle(WingFoldedLeft, 0.0F, 1.5707963267948966F, 0.0F);
        
        this.Toe1R.mirror = true;
        this.Toe1R.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe1R.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1R, -0.091106186954104F, 0.36425021489121656F, -0.045553093477052F);
        
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(0.0F, -0.8F, 0.0F);
        this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        
        this.Tail1.setRotationPoint(0.0F, 3.5F, 0.2F);
        this.Tail1.addBox(-2.0F, -1.0F, -1.5F, 4, 3, 3, 0.0F);
        this.setRotateAngle(Tail1, -0.045553093477052F, 0.0F, 0.0F);
        
        this.WingTip2LA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2LA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip2LA, 0.0F, 0.0F, -0.136659280431156F);
        
        this.TailFeatherR1.mirror = true;
        this.TailFeatherR1.setRotationPoint(-1.5F, -1.4F, -0.1F);
        this.TailFeatherR1.addBox(0.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
        this.setRotateAngle(TailFeatherR1, 0.0F, 0.0F, 0.091106186954104F);
        
        this.Body.setRotationPoint(0.0F, 19.3F, 0.0F);
        this.Body.addBox(-2.5F, -3.5F, -2.5F, 5, 7, 5, 0.0F);
        this.setRotateAngle(Body, 1.1383037381507017F, 0.0F, 0.0F);
        
        this.TailFeatherCenter.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TailFeatherCenter.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        
        this.Forehead.setRotationPoint(0.0F, -3.0F, 1.5F);
        this.Forehead.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        
        this.Beak.setRotationPoint(0.0F, -1.7F, -1.3F);
        this.Beak.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Beak, -0.136659280431156F, 0.0F, 0.0F);
        
        this.WingTip1LA.setRotationPoint(5.0F, 0.9F, -0.1F);
        this.WingTip1LA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip1LA, 0.0F, 0.0F, 0.7285004297824331F);
        
        this.WingTip1RA.setRotationPoint(5.0F, 0.9F, -0.9F);
        this.WingTip1RA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip1RA, 0.0F, 0.0F, 0.7285004297824331F);
        
        this.WingTip6RA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip6RA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip6RA, 0.0F, 0.0F, -0.045553093477052F);
        
        this.Tail2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Tail2.addBox(-1.5F, -1.0F, -1.0F, 3, 3, 2, 0.0F);
        
        this.TailFeatherL3.setRotationPoint(0.3F, -0.3F, -0.1F);
        this.TailFeatherL3.addBox(-2.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F);
        
        this.Head.setRotationPoint(-0.3F, -1.2F, -1.0F);
        this.Head.addBox(-2.0F, -2.5F, -2.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Head, 0.6373942428283291F, 0.7740535232594852F, 0.0F);
        
        this.Mouth.setRotationPoint(0.0F, 1.8F, -0.1F);
        this.Mouth.addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2, 0.0F);
        
        this.WingTip3RA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3RA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip3RA, 0.0F, 0.0F, -0.091106186954104F);
        
        this.WingTip4RA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4RA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip4RA, 0.0F, 0.0F, -0.091106186954104F);
        
        this.Toe1L.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe1L.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1L, -0.091106186954104F, -0.36425021489121656F, 0.045553093477052F);
        
        this.Toe2L.setRotationPoint(-0.2F, 0.1F, 0.2F);
        this.Toe2L.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe2L, -1.8212510744560826F, -0.6373942428283291F, 0.0F);
        
        this.WingTip7RA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip7RA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip7RA, 0.0F, 0.0F, -0.091106186954104F);
        
        this.WingTip8RA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip8RA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip8RA, 0.0F, 0.0F, -0.091106186954104F);
        
        this.WingTip7LA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip7LA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip7LA, 0.0F, 0.0F, -0.091106186954104F);
        
        this.WingTip4LA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4LA.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotateAngle(WingTip4LA, 0.0F, 0.0F, -0.091106186954104F);
        this.TailFeatherL1.addChild(this.TailFeatherL2);
        this.Beak.addChild(this.BeakTip);
        this.LegLeft.addChild(this.FootLeft);
        this.Body.addChild(this.LegLeft);
        this.Body.addChild(this.LegRight);
        this.FootRight.addChild(this.Toe2R);
        this.WingTip4RA.addChild(this.WingTip5RA);
        this.TailFeatherR2.addChild(this.TailFeatherR3);
        this.WingTip1RA.addChild(this.WingTip2RA);
        this.FootLeft.addChild(this.Toe3L);
        this.FootRight.addChild(this.Toe3R);
        this.TailFeatherR1.addChild(this.TailFeatherR2);
        this.WingTip2LA.addChild(this.WingTip3LA);
        this.LegRight.addChild(this.FootRight);
        this.WingTip4LA.addChild(this.WingTip5LA);
        this.TailFeatherCenter.addChild(this.TailFeatherL1);
        this.Body.addChild(this.WingFoldedRight);
        this.Body.addChild(this.Neck);
        this.WingTip7LA.addChild(this.WingTip8LA);
        this.LegLeft.addChild(this.ThighLeft);
        this.WingTip5LA.addChild(this.WingTip6LA);
        this.Body.addChild(this.WingFoldedLeft);
        this.FootRight.addChild(this.Toe1R);
        this.LegRight.addChild(this.ThighRight);
        this.Body.addChild(this.Tail1);
        this.WingTip1LA.addChild(this.WingTip2LA);
        this.TailFeatherCenter.addChild(this.TailFeatherR1);
        this.Tail2.addChild(this.TailFeatherCenter);
        this.Head.addChild(this.Forehead);
        this.Head.addChild(this.Beak);
        this.WingFoldedLeft.addChild(this.WingTip1LA);
        this.WingFoldedRight.addChild(this.WingTip1RA);
        this.WingTip5RA.addChild(this.WingTip6RA);
        this.Tail1.addChild(this.Tail2);
        this.TailFeatherL2.addChild(this.TailFeatherL3);
        this.Neck.addChild(this.Head);
        this.Beak.addChild(this.Mouth);
        this.WingTip2RA.addChild(this.WingTip3RA);
        this.WingTip3RA.addChild(this.WingTip4RA);
        this.FootLeft.addChild(this.Toe1L);
        this.FootLeft.addChild(this.Toe2L);
        this.WingTip6RA.addChild(this.WingTip7RA);
        this.WingTip7RA.addChild(this.WingTip8RA);
        this.WingTip6LA.addChild(this.WingTip7LA);
        this.WingTip3LA.addChild(this.WingTip4LA);
    }
}
