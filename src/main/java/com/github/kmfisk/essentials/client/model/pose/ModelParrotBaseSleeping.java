package com.github.kmfisk.essentials.client.model.pose;

import com.github.kmfisk.essentials.client.model.ModelParrotBase;

/**
 * ParrotBase - fisk
 * Created using Tabula 7.1.0
 */
public class ModelParrotBaseSleeping extends ModelParrotBase {

    public ModelParrotBaseSleeping() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        
        this.WingTipL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL4.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL4, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.ThighLeft.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.ThighLeft.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighLeft, 0.091106186954104F, 0.0F, 0.0F);
        
        this.BeakTip.setRotationPoint(0.0F, -1.6F, -1.1F);
        this.BeakTip.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(BeakTip, 0.091106186954104F, 0.0F, 0.0F);
        
        this.WingTipL5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL5.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL5, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingTipR1.setRotationPoint(4.0F, 1.4F, -0.9F);
        this.WingTipR1.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR1, 0.0F, 0.0F, 0.6373942428283291F);
        
        this.Head.setRotationPoint(0.0F, -1.8F, -0.1F);
        this.Head.addBox(-2.0F, -2.0F, -2.5F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Head, 0.7740535232594852F, 3.141592653589793F, 0.0F);
        
        this.Body.setRotationPoint(0.0F, 19.4F, 0.0F);
        this.Body.addBox(-2.0F, -3.0F, -2.5F, 4, 6, 5, 0.0F);
        this.setRotateAngle(Body, 0.8651597102135892F, 0.0F, 0.0F);
        
        this.WingTipL1.setRotationPoint(4.0F, 1.4F, -0.1F);
        this.WingTipL1.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL1, 0.0F, 0.0F, 0.6373942428283291F);
        
        this.TailFeatherL2.setRotationPoint(0.1F, -0.7F, -0.1F);
        this.TailFeatherL2.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(TailFeatherL2, 0.0F, 0.0F, -0.045553093477052F);
        
        this.Forehead.setRotationPoint(0.0F, -2.8F, 0.9F);
        this.Forehead.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        
        this.LegRight.mirror = true;
        this.LegRight.setRotationPoint(-1.6F, 1.1F, -2.5F);
        this.LegRight.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegRight, -0.8651597102135892F, 0.0F, 0.0F);
        
        this.TailBase.setRotationPoint(0.0F, 2.5F, -0.2F);
        this.TailBase.addBox(-2.0F, -1.0F, -1.5F, 4, 4, 3, 0.0F);
        this.setRotateAngle(TailBase, 0.5009094953223726F, 0.0F, 0.0F);
        
        this.Jaw.setRotationPoint(0.0F, 0.2F, 0.5F);
        this.Jaw.addBox(-0.5F, -0.25F, -1.2F, 1, 1, 2, 0.0F);
        
        this.WingTipR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR3.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR3, 0.0F, 0.0F, -0.091106186954104F);
        
        this.Beak.setRotationPoint(0.0F, 0.6F, -2.7F);
        this.Beak.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        
        this.WingFoldedLeft.setRotationPoint(1.9F, -3.0F, 2.5F);
        this.WingFoldedLeft.addBox(0.0F, 0.0F, 0.0F, 4, 5, 1, 0.0F);
        this.setRotateAngle(WingFoldedLeft, 0.0F, 1.5707963267948966F, 0.0F);
        
        this.TailFeatherCenter.setRotationPoint(0.0F, 1.7F, 0.0F);
        this.TailFeatherCenter.addBox(-1.0F, 0.0F, -0.5F, 2, 8, 1, 0.0F);
        
        this.WingTipR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR4.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR4, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingTipR5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR5.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR5, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingTipR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR2.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        
        this.Toe3L.setRotationPoint(0.0F, 0.3F, 0.2F);
        this.Toe3L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3L, -0.045553093477052F, 0.045553093477052F, 0.0F);
        
        this.Toe2R.mirror = true;
        this.Toe2R.setRotationPoint(0.2F, 0.1F, 0.2F);
        this.Toe2R.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe2R, -0.27314402793711257F, 0.6373942428283291F, 0.0F);
        
        this.LegLeft.setRotationPoint(1.6F, 1.1F, -2.5F);
        this.LegLeft.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegLeft, -0.8651597102135892F, 0.0F, 0.0F);
        
        this.FootLeft.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.FootLeft.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootLeft, 0.136659280431156F, 0.18203784098300857F, 0.0F);
        
        this.WingTipL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL2.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        
        this.Toe1L.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe1L.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1L, -0.091106186954104F, -0.36425021489121656F, 0.045553093477052F);
        
        this.TailFeatherR1.mirror = true;
        this.TailFeatherR1.setRotationPoint(-1.9F, -2.9F, -0.7F);
        this.TailFeatherR1.addBox(0.0F, 0.0F, 0.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(TailFeatherR1, 0.0F, 0.0F, -0.045553093477052F);
        
        this.Toe2L.setRotationPoint(-0.2F, 0.1F, 0.2F);
        this.Toe2L.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe2L, -0.27314402793711257F, -0.6373942428283291F, 0.0F);
        
        this.WingTipL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL3.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL3, 0.0F, 0.0F, -0.091106186954104F);
        
        this.TailFeatherL1.setRotationPoint(1.9F, -2.9F, -0.7F);
        this.TailFeatherL1.addBox(-2.0F, 0.0F, 0.0F, 2, 7, 1, 0.0F);
        this.setRotateAngle(TailFeatherL1, 0.0F, 0.045553093477052F, 0.045553093477052F);
        
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.FootRight.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootRight, 0.136659280431156F, -0.18203784098300857F, 0.0F);
        
        this.WingTipR6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR6.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR6, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.WingTipL6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL6.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL6, 0.0F, 0.0F, -0.19198621771937624F);
        
        this.Toe1R.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe1R.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1R, -0.091106186954104F, 0.36425021489121656F, -0.045553093477052F);
        
        this.WingFoldedRight.setRotationPoint(-1.9F, -3.0F, 2.5F);
        this.WingFoldedRight.addBox(0.0F, 0.0F, -1.0F, 4, 5, 1, 0.0F);
        this.setRotateAngle(WingFoldedRight, 0.0F, 1.5707963267948966F, 0.0F);
        
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.ThighRight.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighRight, 0.091106186954104F, 0.0F, 0.0F);
        
        this.TailFeatherR2.mirror = true;
        this.TailFeatherR2.setRotationPoint(-0.1F, -0.7F, -0.1F);
        this.TailFeatherR2.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(TailFeatherR2, 0.0F, 0.0F, 0.045553093477052F);
        
        this.Neck.setRotationPoint(0.0F, -3.0F, 0.2F);
        this.Neck.addBox(-1.5F, -2.0F, -2.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Neck, -0.36425021489121656F, -0.27314402793711257F, 0.0F);
        
        this.Toe3R.mirror = true;
        this.Toe3R.setRotationPoint(0.0F, 0.3F, 0.2F);
        this.Toe3R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3R, -0.045553093477052F, -0.045553093477052F, 0.0F);
        
        this.Tail.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Tail.addBox(-1.5F, -1.0F, -1.0F, 3, 3, 2, 0.0F);
        this.WingTipL3.addChild(this.WingTipL4);
        this.LegLeft.addChild(this.ThighLeft);
        this.Beak.addChild(this.BeakTip);
        this.WingTipL4.addChild(this.WingTipL5);
        this.WingFoldedRight.addChild(this.WingTipR1);
        this.Neck.addChild(this.Head);
        this.WingFoldedLeft.addChild(this.WingTipL1);
        this.TailFeatherL1.addChild(this.TailFeatherL2);
        this.Head.addChild(this.Forehead);
        this.Body.addChild(this.LegRight);
        this.Body.addChild(this.TailBase);
        this.Beak.addChild(this.Jaw);
        this.WingTipR2.addChild(this.WingTipR3);
        this.Head.addChild(this.Beak);
        this.Body.addChild(this.WingFoldedLeft);
        this.Tail.addChild(this.TailFeatherCenter);
        this.WingTipR3.addChild(this.WingTipR4);
        this.WingTipR4.addChild(this.WingTipR5);
        this.WingTipR1.addChild(this.WingTipR2);
        this.FootLeft.addChild(this.Toe3L);
        this.FootRight.addChild(this.Toe2R);
        this.Body.addChild(this.LegLeft);
        this.LegLeft.addChild(this.FootLeft);
        this.WingTipL1.addChild(this.WingTipL2);
        this.FootLeft.addChild(this.Toe1L);
        this.TailFeatherCenter.addChild(this.TailFeatherR1);
        this.FootLeft.addChild(this.Toe2L);
        this.WingTipL2.addChild(this.WingTipL3);
        this.TailFeatherCenter.addChild(this.TailFeatherL1);
        this.LegRight.addChild(this.FootRight);
        this.WingTipR5.addChild(this.WingTipR6);
        this.WingTipL5.addChild(this.WingTipL6);
        this.FootRight.addChild(this.Toe1R);
        this.Body.addChild(this.WingFoldedRight);
        this.LegRight.addChild(this.ThighRight);
        this.TailFeatherR1.addChild(this.TailFeatherR2);
        this.Body.addChild(this.Neck);
        this.FootRight.addChild(this.Toe3R);
        this.TailBase.addChild(this.Tail);
    }
}
