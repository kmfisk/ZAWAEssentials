package com.github.kmfisk.essentials.client.model.pose;

import com.github.kmfisk.essentials.client.model.ModelParrotBaseBaby;

/**
 * CongoGrayParrot_Baby - fisk
 * Created using Tabula 7.1.0
 */
public class ModelParrotBaseBabySleeping extends ModelParrotBaseBaby {

    public ModelParrotBaseBabySleeping() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        
        this.Neck.setRotationPoint(0.0F, -0.2F, -1.4F);
        this.Neck.addBox(-1.0F, -2.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Neck, 1.0927506446736497F, 0.0F, 0.0F);
        
        this.LegLeft.setRotationPoint(1.2F, 1.5F, 0.0F);
        this.LegLeft.addBox(-0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LegLeft, -0.8651597102135892F, 0.0F, 0.0F);
        
        this.Body.setRotationPoint(0.0F, 21.9F, 0.0F);
        this.Body.addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Body, -0.40980330836826856F, 0.0F, 0.0F);

        this.WingRight.mirror = true;
        this.WingRight.setRotationPoint(-1.4F, 0.0F, -1.8F);
        this.WingRight.addBox(-1.0F, -1.5F, 0.0F, 1, 3, 4, 0.0F);
        
        this.Head.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Head.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Head, 0.136659280431156F, 0.0F, 0.0F);
        
        this.Tail.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Tail.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F);

        this.LegRight.setRotationPoint(-1.2F, 1.5F, 0.0F);
        this.LegRight.addBox(-0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LegRight, -0.8651597102135892F, 0.0F, 0.0F);
        
        this.Beak.setRotationPoint(0.0F, -1.3F, -1.0F);
        this.Beak.addBox(-1.0F, 0.0F, -1.25F, 2, 2, 2, 0.0F);

        this.WingLeft.setRotationPoint(1.4F, 0.0F, -1.8F);
        this.WingLeft.addBox(0.0F, -1.5F, 0.0F, 1, 3, 4, 0.0F);
        
        this.TailBase.setRotationPoint(0.0F, 0.1F, 1.8F);
        this.TailBase.addBox(-1.5F, -1.5F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(TailBase, 0.18203784098300857F, 0.0F, 0.0F);
        
        this.Jaw.setRotationPoint(0.0F, 1.7F, 0.0F);
        this.Jaw.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        
        this.BeakTip.setRotationPoint(0.0F, 0.5F, -0.5F);
        this.BeakTip.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
        this.Body.addChild(this.Neck);
        this.Body.addChild(this.LegLeft);
        this.Body.addChild(this.WingRight);
        this.Neck.addChild(this.Head);
        this.TailBase.addChild(this.Tail);
        this.Body.addChild(this.LegRight);
        this.Head.addChild(this.Beak);
        this.Body.addChild(this.WingLeft);
        this.Body.addChild(this.TailBase);
        this.Beak.addChild(this.Jaw);
        this.Beak.addChild(this.BeakTip);
    }
}
