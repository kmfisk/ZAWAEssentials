package com.github.kmfisk.essentials.client.model.pose;

import com.github.kmfisk.essentials.client.model.ModelCockatiel;

/**
 * Cockatiel - fisk
 * Created using Tabula 7.1.0
 */
public class ModelCockatielFlying extends ModelCockatiel {

    public ModelCockatielFlying() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        
        this.Toe2L.setRotationPoint(-0.2F, 0.2F, 0.5F);
        this.Toe2L.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe2L, -0.18203784098300857F, -0.6373942428283291F, 0.0F);
        
        this.Wing1Right.mirror = true;
        this.Wing1Right.setRotationPoint(-1.5F, -2.7F, 0.5F);
        this.Wing1Right.addBox(-3.0F, 0.0F, -0.5F, 4, 4, 1, 0.0F);
        
        this.WingTip3L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3L.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip3L, 0.0F, 0.0F, -0.22759093446006054F);
        
        this.Tail.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Tail.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Tail, 0.045553093477052F, 0.0F, 0.0F);
        
        this.Crest3R_1.setRotationPoint(-0.15F, -0.1F, 0.1F);
        this.Crest3R_1.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Crest3R_1, -0.136659280431156F, 0.0F, 0.0F);
        
        this.Beak.setRotationPoint(0.0F, -2.3F, -2.2F);
        this.Beak.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Beak, 0.136659280431156F, 0.0F, 0.0F);
        
        this.Wing1Left.setRotationPoint(1.5F, -2.7F, 0.5F);
        this.Wing1Left.addBox(-1.0F, 0.0F, -0.5F, 4, 4, 1, 0.0F);
        
        this.TailFeatherCenter.setRotationPoint(0.0F, 1.5F, 0.3F);
        this.TailFeatherCenter.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        
        this.WingTip1L.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.WingTip1L.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip1L, 0.0F, 0.0F, -0.136659280431156F);
        
        this.WingTip2L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2L.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip2L, 0.0F, 0.0F, -0.22759093446006054F);
        
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.ThighRight.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighRight, 0.091106186954104F, 0.0F, 0.0F);
        
        this.TailFeatherL1_1.setRotationPoint(-1.0F, -0.7F, -0.6F);
        this.TailFeatherL1_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        
        this.Head.setRotationPoint(0.0F, -0.4F, 0.0F);
        this.Head.addBox(-1.5F, -2.5F, -2.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Head, -0.8651597102135892F, 0.0F, 0.0F);
        
        this.WingTip4L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4L.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip4L, 0.0F, 0.0F, -0.22759093446006054F);
        
        this.Crest3L.setRotationPoint(0.15F, 0.0F, 0.0F);
        this.Crest3L.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Crest3L, -0.22759093446006054F, 0.0F, 0.0F);
        
        this.Wing2Left.setRotationPoint(3.0F, 4.0F, 0.0F);
        this.Wing2Left.addBox(0.0F, -4.0F, -0.5F, 3, 4, 1, 0.0F);
        this.setRotateAngle(Wing2Left, 0.0F, 0.0F, -0.31869712141416456F);
        
        this.Crest3L_1.setRotationPoint(0.15F, -0.1F, 0.1F);
        this.Crest3L_1.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Crest3L_1, -0.136659280431156F, 0.0F, 0.0F);
        
        this.Crest2R.setRotationPoint(-0.15F, -1.0F, 0.4F);
        this.Crest2R.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Crest2R, -0.136659280431156F, 0.0F, 0.0F);
        
        this.WingTip3R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3R.addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip3R, 0.0F, 0.0F, 0.22759093446006054F);
        
        this.Toe1L.setRotationPoint(0.0F, 0.1F, 0.2F);
        this.Toe1L.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe1L, -0.091106186954104F, -0.36425021489121656F, 0.045553093477052F);
        
        this.Wing3Left_1.setRotationPoint(-3.0F, -4.0F, 0.0F);
        this.Wing3Left_1.addBox(-2.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotateAngle(Wing3Left_1, 0.0F, 0.0F, -0.18203784098300857F);
        
        this.LegRight.setRotationPoint(-0.9F, 1.1F, -2.0F);
        this.LegRight.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegRight, -0.5009094953223726F, 0.0F, 0.0F);
        
        this.BeakTip.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.BeakTip.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(BeakTip, -0.40980330836826856F, 0.0F, 0.0F);
        
        this.TailFeatherL1.setRotationPoint(1.0F, -0.7F, -0.6F);
        this.TailFeatherL1.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        
        this.TailFeatherL2_1.setRotationPoint(-0.4F, -1.9F, -0.2F);
        this.TailFeatherL2_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(TailFeatherL2_1, 0.0F, 0.0F, -0.045553093477052F);
        
        this.Crest1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Crest1.addBox(-0.5F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Crest1, -1.0471975511965976F, 0.0F, 0.0F);
        
        this.LegLeft.setRotationPoint(0.9F, 1.1F, -2.0F);
        this.LegLeft.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegLeft, -0.5009094953223726F, 0.0F, 0.0F);
        
        this.Wing2Right.mirror = true;
        this.Wing2Right.setRotationPoint(-3.0F, 4.0F, 0.0F);
        this.Wing2Right.addBox(-3.0F, -4.0F, -0.5F, 3, 4, 1, 0.0F);
        this.setRotateAngle(Wing2Right, 0.0F, 0.0F, 0.31869712141416456F);
        
        this.Forehead.setRotationPoint(0.0F, -2.9F, 0.2F);
        this.Forehead.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        
        this.WingTip5L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5L.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip5L, 0.0F, 0.0F, -0.22759093446006054F);
        
        this.Wing3Left.setRotationPoint(3.0F, -4.0F, 0.0F);
        this.Wing3Left.addBox(0.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotateAngle(Wing3Left, 0.0F, 0.0F, 0.18203784098300857F);
        
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(-0.3F, 1.6F, 0.1F);
        this.FootRight.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(FootRight, 1.4114477660878142F, -0.18203784098300857F, 0.0F);
        
        this.WingTip5R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5R.addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip5R, 0.0F, 0.0F, 0.22759093446006054F);
        
        this.Crest2L.setRotationPoint(0.15F, -1.0F, 0.5F);
        this.Crest2L.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Crest2L, -0.136659280431156F, 0.0F, 0.0F);
        
        this.Crest3R.setRotationPoint(-0.15F, 0.0F, 0.0F);
        this.Crest3R.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Crest3R, -0.22759093446006054F, 0.0F, 0.0F);
        
        this.ThighLeft.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.ThighLeft.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighLeft, 0.091106186954104F, 0.0F, 0.0F);
        
        this.Toe3L.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe3L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3L, -0.18203784098300857F, 0.045553093477052F, 0.0F);
        
        this.WingTip2R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2R.addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip2R, 0.0F, 0.0F, 0.22759093446006054F);
        
        this.Toe2R.mirror = true;
        this.Toe2R.setRotationPoint(0.2F, 0.2F, 0.5F);
        this.Toe2R.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe2R, -0.18203784098300857F, 0.6373942428283291F, 0.0F);
        
        this.WingTip4R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4R.addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip4R, 0.0F, 0.0F, 0.22759093446006054F);
        
        this.Neck.setRotationPoint(0.0F, -3.0F, -0.5F);
        this.Neck.addBox(-1.0F, -2.5F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Neck, -0.4553564018453205F, 0.0F, 0.0F);
        
        this.Toe3R.mirror = true;
        this.Toe3R.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe3R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3R, -0.18203784098300857F, -0.045553093477052F, 0.0F);
        
        this.FootLeft.setRotationPoint(0.3F, 1.6F, 0.1F);
        this.FootLeft.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(FootLeft, 1.4114477660878142F, 0.18203784098300857F, 0.0F);
        
        this.TailFeatherL2.setRotationPoint(0.4F, -1.8F, -0.2F);
        this.TailFeatherL2.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(TailFeatherL2, 0.0F, 0.0F, 0.045553093477052F);
        
        this.Body.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Body.addBox(-2.0F, -3.0F, -2.5F, 4, 5, 4, 0.0F);
        this.setRotateAngle(Body, 1.5481070465189704F, 0.0F, 0.0F);
        
        this.TailBase.setRotationPoint(0.0F, 2.2F, -0.7F);
        this.TailBase.addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
        this.setRotateAngle(TailBase, -0.136659280431156F, 0.0F, 0.0F);
        
        this.Toe1R.mirror = true;
        this.Toe1R.setRotationPoint(0.0F, 0.1F, 0.2F);
        this.Toe1R.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe1R, -0.091106186954104F, 0.36425021489121656F, -0.045553093477052F);
        
        this.WingTip1R.mirror = true;
        this.WingTip1R.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.WingTip1R.addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip1R, 0.0F, 0.0F, 0.136659280431156F);
        
        this.TailFeatherL3_1.setRotationPoint(0.0F, -0.3F, -0.2F);
        this.TailFeatherL3_1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(TailFeatherL3_1, 0.0F, 0.0F, 0.045553093477052F);
        
        this.Crest1A.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.Crest1A.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Crest1A, 0.31869712141416456F, 0.0F, 0.0F);
        
        this.Jaw.setRotationPoint(0.0F, 1.7F, 0.0F);
        this.Jaw.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Jaw, -0.18203784098300857F, 0.0F, 0.0F);
        
        this.TailFeatherL3.setRotationPoint(0.0F, -0.3F, -0.2F);
        this.TailFeatherL3.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(TailFeatherL3, 0.0F, 0.0F, -0.045553093477052F);
        this.FootLeft.addChild(this.Toe2L);
        this.Body.addChild(this.Wing1Right);
        this.WingTip2L.addChild(this.WingTip3L);
        this.TailBase.addChild(this.Tail);
        this.Crest3R.addChild(this.Crest3R_1);
        this.Head.addChild(this.Beak);
        this.Body.addChild(this.Wing1Left);
        this.Tail.addChild(this.TailFeatherCenter);
        this.Wing3Left.addChild(this.WingTip1L);
        this.WingTip1L.addChild(this.WingTip2L);
        this.LegRight.addChild(this.ThighRight);
        this.TailFeatherCenter.addChild(this.TailFeatherL1_1);
        this.Neck.addChild(this.Head);
        this.WingTip3L.addChild(this.WingTip4L);
        this.Crest2L.addChild(this.Crest3L);
        this.Wing1Left.addChild(this.Wing2Left);
        this.Crest3L.addChild(this.Crest3L_1);
        this.Crest1.addChild(this.Crest2R);
        this.WingTip2R.addChild(this.WingTip3R);
        this.FootLeft.addChild(this.Toe1L);
        this.Wing2Right.addChild(this.Wing3Left_1);
        this.Body.addChild(this.LegRight);
        this.Beak.addChild(this.BeakTip);
        this.TailFeatherCenter.addChild(this.TailFeatherL1);
        this.TailFeatherL1_1.addChild(this.TailFeatherL2_1);
        this.Forehead.addChild(this.Crest1);
        this.Body.addChild(this.LegLeft);
        this.Wing1Right.addChild(this.Wing2Right);
        this.Head.addChild(this.Forehead);
        this.WingTip4L.addChild(this.WingTip5L);
        this.Wing2Left.addChild(this.Wing3Left);
        this.LegRight.addChild(this.FootRight);
        this.WingTip4R.addChild(this.WingTip5R);
        this.Crest1.addChild(this.Crest2L);
        this.Crest2R.addChild(this.Crest3R);
        this.LegLeft.addChild(this.ThighLeft);
        this.FootLeft.addChild(this.Toe3L);
        this.WingTip1R.addChild(this.WingTip2R);
        this.FootRight.addChild(this.Toe2R);
        this.WingTip3R.addChild(this.WingTip4R);
        this.Body.addChild(this.Neck);
        this.FootRight.addChild(this.Toe3R);
        this.LegLeft.addChild(this.FootLeft);
        this.TailFeatherL1.addChild(this.TailFeatherL2);
        this.Body.addChild(this.TailBase);
        this.FootRight.addChild(this.Toe1R);
        this.Wing3Left_1.addChild(this.WingTip1R);
        this.TailFeatherL2_1.addChild(this.TailFeatherL3_1);
        this.Crest1.addChild(this.Crest1A);
        this.Beak.addChild(this.Jaw);
        this.TailFeatherL2.addChild(this.TailFeatherL3);
    }
}
