package com.github.kmfisk.essentials.client.model.pose;

import com.github.kmfisk.essentials.client.model.ModelHawaiiOo;

/**
 * HawaiiOOBird - fisk
 * Created using Tabula 7.1.0
 */
public class ModelHawaiiOoFlying extends ModelHawaiiOo {

    public ModelHawaiiOoFlying() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        
        this.BeakSideLeft.setRotationPoint(0.7F, 0.1F, -0.1F);
        this.BeakSideLeft.addBox(-1.0F, 0.0F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(BeakSideLeft, 0.0F, 0.045553093477052F, 0.0F);
        
        this.Tail1L_1.setRotationPoint(1.2F, 0.2F, -0.4F);
        this.Tail1L_1.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tail1L_1, 0.0F, 0.03490658503988659F, 0.0F);
        
        this.Tail3L.setRotationPoint(0.0F, 0.2F, -0.9F);
        this.Tail3L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tail3L, 0.0F, 0.017453292519943295F, 0.0F);
        
        this.WingTip6L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip6L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip6L, 0.0F, 0.18203784098300857F, 0.0F);
        
        this.Wing3Right.mirror = true;
        this.Wing3Right.setRotationPoint(-2.0F, 0.0F, -5.0F);
        this.Wing3Right.addBox(-2.0F, -0.5F, 0.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(Wing3Right, 0.0F, 0.27314402793711257F, 0.0F);
        
        this.WingTip5L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip5L, 0.0F, 0.18203784098300857F, 0.0F);
        
        this.WingTip1R.mirror = true;
        this.WingTip1R.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.WingTip1R.addBox(0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip1R, 0.0F, -0.18203784098300857F, 0.0F);
        
        this.Tail4L.setRotationPoint(0.0F, 0.2F, -0.9F);
        this.Tail4L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(Tail4L, 0.0F, 0.017453292519943295F, 0.0F);
        
        this.WingTip2R.mirror = true;
        this.WingTip2R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2R.addBox(0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip2R, 0.0F, -0.18203784098300857F, 0.0F);
        
        this.Tail1R.setRotationPoint(-0.7F, 0.0F, 0.0F);
        this.Tail1R.addBox(-1.0F, -1.0F, -0.5F, 2, 2, 2, 0.0F);
        
        this.Wing2Right.mirror = true;
        this.Wing2Right.setRotationPoint(-2.0F, 0.0F, 5.0F);
        this.Wing2Right.addBox(-2.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(Wing2Right, 0.0F, -0.18203784098300857F, 0.0F);
        
        this.Toe2L.setRotationPoint(0.0F, -0.4F, -0.3F);
        this.Toe2L.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe2L, 0.0F, -0.36425021489121656F, 0.0F);
        
        this.Beak2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.Beak2.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Beak2, 0.18203784098300857F, 0.0F, 0.0F);
        
        this.Tail1R_1.mirror = true;
        this.Tail1R_1.setRotationPoint(-1.2F, 0.2F, -0.4F);
        this.Tail1R_1.addBox(0.0F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tail1R_1, 0.0F, -0.03490658503988659F, 0.0F);
        
        this.Tail2R.mirror = true;
        this.Tail2R.setRotationPoint(-0.2F, 0.2F, -0.4F);
        this.Tail2R.addBox(0.0F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tail2R, 0.0F, -0.017453292519943295F, 0.0F);
        
        this.TailCenter.setRotationPoint(-0.3F, -0.2F, 1.5F);
        this.TailCenter.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 6, 0.0F);
        
        this.BeakTop.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.BeakTop.addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(BeakTop, 0.045553093477052F, 0.0F, 0.0F);
        
        this.LegLeft.setRotationPoint(0.3F, 2.0F, 0.5F);
        this.LegLeft.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LegLeft, -1.5481070465189704F, 0.0F, 0.0F);
        
        this.Neck.setRotationPoint(0.0F, -3.0F, 0.45F);
        this.Neck.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Neck, -0.40980330836826856F, 0.0F, 0.0F);
        
        this.Body.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Body.addBox(-2.0F, -2.0F, -2.5F, 4, 5, 4, 0.0F);
        
        this.Tail1L.setRotationPoint(0.3F, 0.1F, 1.5F);
        this.Tail1L.addBox(-1.0F, -1.0F, -0.5F, 2, 2, 2, 0.0F);
        
        this.Tail3L_1.mirror = true;
        this.Tail3L_1.setRotationPoint(0.0F, 0.2F, -0.9F);
        this.Tail3L_1.addBox(0.0F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tail3L_1, 0.0F, -0.017453292519943295F, 0.0F);
        
        this.Wing3Left.setRotationPoint(2.0F, 0.0F, -5.0F);
        this.Wing3Left.addBox(0.0F, -0.5F, 0.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(Wing3Left, 0.0F, -0.27314402793711257F, 0.0F);
        
        this.Toe3L.setRotationPoint(0.0F, -0.4F, -0.3F);
        this.Toe3L.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3L, 0.0F, 0.36425021489121656F, 0.0F);
        
        this.Chest.setRotationPoint(0.0F, 2.7F, -2.5F);
        this.Chest.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Chest, 1.0471975511965976F, 0.0F, 0.0F);
        
        this.LegRight.mirror = true;
        this.LegRight.setRotationPoint(-0.3F, 2.0F, 0.5F);
        this.LegRight.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LegRight, -1.5481070465189704F, 0.0F, 0.0F);
        
        this.WingTip5R.mirror = true;
        this.WingTip5R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5R.addBox(0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip5R, 0.0F, -0.18203784098300857F, 0.0F);
        
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(-1.2F, 1.4F, -0.7F);
        this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ThighRight, 0.7740535232594852F, 0.0F, 0.0F);
        
        this.Wing1Right.mirror = true;
        this.Wing1Right.setRotationPoint(-1.5F, -1.0F, -2.5F);
        this.Wing1Right.addBox(-2.0F, -0.5F, 0.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(Wing1Right, -0.18203784098300857F, -0.091106186954104F, 0.0F);
        
        this.TailBase.setRotationPoint(0.0F, 0.4F, 1.0F);
        this.TailBase.addBox(-1.5F, -2.0F, -0.5F, 3, 4, 2, 0.0F);
        this.setRotateAngle(TailBase, -0.40980330836826856F, 0.0F, 0.0F);
        
        this.Tail2L.setRotationPoint(0.2F, 0.2F, -0.4F);
        this.Tail2L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tail2L, 0.0F, 0.017453292519943295F, 0.0F);
        
        this.WingTip6R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip6R.addBox(0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip6R, 0.0F, -0.18203784098300857F, 0.0F);
        
        this.ThighLeft.setRotationPoint(1.2F, 1.4F, -0.7F);
        this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ThighLeft, 0.7740535232594852F, 0.0F, 0.0F);
        
        this.Wing1Left.setRotationPoint(1.5F, -1.0F, -2.5F);
        this.Wing1Left.addBox(-1.0F, -0.5F, 0.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(Wing1Left, -0.18203784098300857F, 0.0F, 0.0F);
        
        this.WingTip1L.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.WingTip1L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip1L, 0.0F, 0.18203784098300857F, 0.0F);
        
        this.Toe1R.mirror = true;
        this.Toe1R.setRotationPoint(0.0F, 1.5F, -0.4F);
        this.Toe1R.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1R, 1.1383037381507017F, 0.0F, 0.0F);
        
        this.Toe1L.setRotationPoint(0.0F, 1.5F, -0.4F);
        this.Toe1L.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1L, 1.1383037381507017F, 0.0F, 0.0F);
        
        this.Wing2Left.setRotationPoint(2.0F, 0.0F, 5.0F);
        this.Wing2Left.addBox(0.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(Wing2Left, 0.0F, 0.18203784098300857F, 0.0F);
        
        this.WingTip3R.mirror = true;
        this.WingTip3R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3R.addBox(0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip3R, 0.0F, -0.18203784098300857F, 0.0F);
        
        this.WingTip4L_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4L_1.addBox(0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip4L_1, 0.0F, -0.18203784098300857F, 0.0F);
        
        this.Head.setRotationPoint(0.0F, -2.3F, 1.3F);
        this.Head.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Head, -0.4553564018453205F, 0.0F, 0.0F);
        
        this.Mouth.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.Mouth.addBox(-0.5F, 0.0F, -1.9F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Mouth, -0.27314402793711257F, 0.0F, 0.0F);
        
        this.BeakSideLeft_1.mirror = true;
        this.BeakSideLeft_1.setRotationPoint(-0.7F, 0.1F, -0.1F);
        this.BeakSideLeft_1.addBox(0.0F, 0.0F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(BeakSideLeft_1, 0.0F, -0.045553093477052F, 0.0F);
        
        this.WingTip2L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip2L, 0.0F, 0.18203784098300857F, 0.0F);
        
        this.Toe2R.setRotationPoint(0.0F, -0.4F, -0.3F);
        this.Toe2R.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe2R, 0.0F, -0.36425021489121656F, 0.0F);
        
        this.Toe3R.mirror = true;
        this.Toe3R.setRotationPoint(0.0F, -0.4F, -0.3F);
        this.Toe3R.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3R, 0.0F, 0.36425021489121656F, 0.0F);
        
        this.TailCenterTop.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.TailCenterTop.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        
        this.WingTip3L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip3L, 0.0F, 0.18203784098300857F, 0.0F);
        
        this.WingTip4L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip4L, 0.0F, 0.18203784098300857F, 0.0F);
        
        this.Tail4R.mirror = true;
        this.Tail4R.setRotationPoint(0.0F, 0.2F, -0.9F);
        this.Tail4R.addBox(0.0F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(Tail4R, 0.0F, -0.017453292519943295F, 0.0F);
        this.BeakTop.addChild(this.BeakSideLeft);
        this.TailCenter.addChild(this.Tail1L_1);
        this.Tail2L.addChild(this.Tail3L);
        this.WingTip5L.addChild(this.WingTip6L);
        this.Wing2Right.addChild(this.Wing3Right);
        this.WingTip4L.addChild(this.WingTip5L);
        this.Wing3Right.addChild(this.WingTip1R);
        this.Tail3L.addChild(this.Tail4L);
        this.WingTip1R.addChild(this.WingTip2R);
        this.Tail1L.addChild(this.Tail1R);
        this.Wing1Right.addChild(this.Wing2Right);
        this.Toe1L.addChild(this.Toe2L);
        this.BeakTop.addChild(this.Beak2);
        this.TailCenter.addChild(this.Tail1R_1);
        this.Tail1R_1.addChild(this.Tail2R);
        this.Tail1L.addChild(this.TailCenter);
        this.Head.addChild(this.BeakTop);
        this.ThighLeft.addChild(this.LegLeft);
        this.Chest.addChild(this.Neck);
        this.TailBase.addChild(this.Tail1L);
        this.Tail2R.addChild(this.Tail3L_1);
        this.Wing2Left.addChild(this.Wing3Left);
        this.Toe1L.addChild(this.Toe3L);
        this.Body.addChild(this.Chest);
        this.ThighRight.addChild(this.LegRight);
        this.WingTip4L_1.addChild(this.WingTip5R);
        this.Body.addChild(this.ThighRight);
        this.Body.addChild(this.Wing1Right);
        this.Body.addChild(this.TailBase);
        this.Tail1L_1.addChild(this.Tail2L);
        this.WingTip5R.addChild(this.WingTip6R);
        this.Body.addChild(this.ThighLeft);
        this.Body.addChild(this.Wing1Left);
        this.Wing3Left.addChild(this.WingTip1L);
        this.LegRight.addChild(this.Toe1R);
        this.LegLeft.addChild(this.Toe1L);
        this.Wing1Left.addChild(this.Wing2Left);
        this.WingTip2R.addChild(this.WingTip3R);
        this.WingTip3R.addChild(this.WingTip4L_1);
        this.Neck.addChild(this.Head);
        this.BeakTop.addChild(this.Mouth);
        this.BeakTop.addChild(this.BeakSideLeft_1);
        this.WingTip1L.addChild(this.WingTip2L);
        this.Toe1R.addChild(this.Toe2R);
        this.Toe1R.addChild(this.Toe3R);
        this.TailCenter.addChild(this.TailCenterTop);
        this.WingTip2L.addChild(this.WingTip3L);
        this.WingTip3L.addChild(this.WingTip4L);
        this.Tail3L_1.addChild(this.Tail4R);
    }
}
