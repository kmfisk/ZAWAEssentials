package com.github.kmfisk.essentials.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

/**
 * HawaiiOOBird - fisk
 * Created using Tabula 7.1.0
 */
public class ModelHawaiiOo extends ZAWAModelBase {
    public BookwormModelRenderer Body;
    public BookwormModelRenderer Chest;
    public BookwormModelRenderer TailBase;
    public BookwormModelRenderer ThighLeft;
    public BookwormModelRenderer ThighRight;
    public BookwormModelRenderer WingFoldedLeft;
    public BookwormModelRenderer WingFoldedRight;
    public BookwormModelRenderer Wing1Left;
    public BookwormModelRenderer Wing1Right;
    public BookwormModelRenderer Neck;
    public BookwormModelRenderer Head;
    public BookwormModelRenderer BeakTop;
    public BookwormModelRenderer Beak2;
    public BookwormModelRenderer BeakSideLeft;
    public BookwormModelRenderer BeakSideLeft_1;
    public BookwormModelRenderer Mouth;
    public BookwormModelRenderer Tail1L;
    public BookwormModelRenderer Tail1R;
    public BookwormModelRenderer TailCenter;
    public BookwormModelRenderer Tail1L_1;
    public BookwormModelRenderer Tail1R_1;
    public BookwormModelRenderer TailCenterTop;
    public BookwormModelRenderer Tail2L;
    public BookwormModelRenderer Tail3L;
    public BookwormModelRenderer Tail4L;
    public BookwormModelRenderer Tail2R;
    public BookwormModelRenderer Tail3L_1;
    public BookwormModelRenderer Tail4R;
    public BookwormModelRenderer LegLeft;
    public BookwormModelRenderer Toe1L;
    public BookwormModelRenderer Toe2L;
    public BookwormModelRenderer Toe3L;
    public BookwormModelRenderer LegRight;
    public BookwormModelRenderer Toe1R;
    public BookwormModelRenderer Toe2R;
    public BookwormModelRenderer Toe3R;
    public BookwormModelRenderer WingTip1LA;
    public BookwormModelRenderer WingTip2LA;
    public BookwormModelRenderer WingTip3LA;
    public BookwormModelRenderer WingTip4LA;
    public BookwormModelRenderer WingTip5LA;
    public BookwormModelRenderer WingTip6LA;
    public BookwormModelRenderer WingTip1RA;
    public BookwormModelRenderer WingTip2RA;
    public BookwormModelRenderer WingTip3RA;
    public BookwormModelRenderer WingTip4RA;
    public BookwormModelRenderer WingTip5RA;
    public BookwormModelRenderer WingTip6RA;
    public BookwormModelRenderer Wing2Left;
    public BookwormModelRenderer Wing3Left;
    public BookwormModelRenderer WingTip1L;
    public BookwormModelRenderer WingTip2L;
    public BookwormModelRenderer WingTip3L;
    public BookwormModelRenderer WingTip4L;
    public BookwormModelRenderer WingTip5L;
    public BookwormModelRenderer WingTip6L;
    public BookwormModelRenderer Wing2Right;
    public BookwormModelRenderer Wing3Right;
    public BookwormModelRenderer WingTip1R;
    public BookwormModelRenderer WingTip2R;
    public BookwormModelRenderer WingTip3R;
    public BookwormModelRenderer WingTip4L_1;
    public BookwormModelRenderer WingTip5R;
    public BookwormModelRenderer WingTip6R;

    public ModelHawaiiOo() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.TailBase = new BookwormModelRenderer(this, 16, 0, "TailBase");
        this.TailBase.setRotationPoint(0.0F, 0.4F, 1.0F);
        this.TailBase.addBox(-1.5F, -2.0F, -0.5F, 3, 4, 2, 0.0F);
        this.setRotateAngle(TailBase, -0.40980330836826856F, 0.0F, 0.0F);
        this.ThighRight = new BookwormModelRenderer(this, 15, 22, "ThighRight");
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(-1.2F, 1.4F, -0.7F);
        this.ThighRight.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ThighRight, 0.6373942428283291F, 0.0F, 0.0F);
        this.WingTip5LA = new BookwormModelRenderer(this, 18, 25, "WingTip5LA");
        this.WingTip5LA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5LA.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip5LA, 0.0F, 0.18203784098300857F, 0.0F);
        this.Wing1Left = new BookwormModelRenderer(this, 26, 7, "Wing1Left");
        this.Wing1Left.setRotationPoint(1.5F, -1.0F, -2.5F);
        this.Wing1Left.addBox(-1.0F, -0.5F, 0.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(Wing1Left, -0.18203784098300857F, 0.0F, 0.0F);
        this.Wing1Right = new BookwormModelRenderer(this, 26, 7, "Wing1Right");
        this.Wing1Right.mirror = true;
        this.Wing1Right.setRotationPoint(-1.5F, -1.0F, -2.5F);
        this.Wing1Right.addBox(-2.0F, -0.5F, 0.0F, 3, 1, 5, 0.0F);
        this.setRotateAngle(Wing1Right, -0.18203784098300857F, -0.091106186954104F, 0.0F);
        this.WingTip2LA = new BookwormModelRenderer(this, 18, 25, "WingTip2LA");
        this.WingTip2LA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2LA.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip2LA, 0.0F, 0.136659280431156F, 0.0F);
        this.WingTip4L = new BookwormModelRenderer(this, 18, 25, "WingTip4L");
        this.WingTip4L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip4L, 0.0F, 0.18203784098300857F, 0.0F);
        this.TailCenterTop = new BookwormModelRenderer(this, 18, 15, "TailCenterTop");
        this.TailCenterTop.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.TailCenterTop.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        this.WingTip1RA = new BookwormModelRenderer(this, 18, 25, "WingTip1RA");
        this.WingTip1RA.setRotationPoint(3.3F, -0.2F, 1.3F);
        this.WingTip1RA.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip1RA, 0.0F, -0.5009094953223726F, 0.0F);
        this.WingTip2L = new BookwormModelRenderer(this, 18, 25, "WingTip2L");
        this.WingTip2L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip2L, 0.0F, 0.18203784098300857F, 0.0F);
        this.BeakTop = new BookwormModelRenderer(this, 0, 28, "BeakTop");
        this.BeakTop.setRotationPoint(0.0F, -0.5F, -1.0F);
        this.BeakTop.addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(BeakTop, 0.045553093477052F, 0.0F, 0.0F);
        this.WingTip3RA = new BookwormModelRenderer(this, 18, 25, "WingTip3RA");
        this.WingTip3RA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3RA.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip3RA, 0.0F, 0.136659280431156F, 0.0F);
        this.TailCenter = new BookwormModelRenderer(this, 24, 0, "TailCenter");
        this.TailCenter.setRotationPoint(-0.3F, -0.1F, 1.5F);
        this.TailCenter.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 6, 0.0F);
        this.WingTip4LA = new BookwormModelRenderer(this, 18, 25, "WingTip4LA");
        this.WingTip4LA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4LA.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip4LA, 0.0F, 0.136659280431156F, 0.0F);
        this.Tail1R = new BookwormModelRenderer(this, 16, 6, "Tail1R");
        this.Tail1R.mirror = true;
        this.Tail1R.setRotationPoint(-0.7F, 0.0F, 0.0F);
        this.Tail1R.addBox(-1.0F, -1.0F, -0.5F, 2, 2, 2, 0.0F);
        this.Wing2Right = new BookwormModelRenderer(this, 28, 13, "Wing2Right");
        this.Wing2Right.mirror = true;
        this.Wing2Right.setRotationPoint(-2.0F, 0.0F, 5.0F);
        this.Wing2Right.addBox(-2.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(Wing2Right, 0.0F, -0.18203784098300857F, 0.0F);
        this.Tail1R_1 = new BookwormModelRenderer(this, 17, 7, "Tail1R_1");
        this.Tail1R_1.mirror = true;
        this.Tail1R_1.setRotationPoint(-1.2F, 0.2F, -0.4F);
        this.Tail1R_1.addBox(0.0F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tail1R_1, 0.0F, -0.03490658503988659F, 0.0F);
        this.Tail1L_1 = new BookwormModelRenderer(this, 17, 7, "Tail1L_1");
        this.Tail1L_1.setRotationPoint(1.2F, 0.2F, -0.4F);
        this.Tail1L_1.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tail1L_1, 0.0F, 0.03490658503988659F, 0.0F);
        this.Toe2R = new BookwormModelRenderer(this, 16, 10, "Toe2R");
        this.Toe2R.setRotationPoint(0.0F, -0.4F, -0.3F);
        this.Toe2R.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe2R, 0.0F, -0.36425021489121656F, 0.0F);
        this.WingTip1L = new BookwormModelRenderer(this, 18, 25, "WingTip1L");
        this.WingTip1L.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.WingTip1L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip1L, 0.0F, 0.18203784098300857F, 0.0F);
        this.Wing3Left = new BookwormModelRenderer(this, 23, 19, "Wing3Left");
        this.Wing3Left.setRotationPoint(2.0F, 0.0F, -5.0F);
        this.Wing3Left.addBox(0.0F, -0.5F, 0.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(Wing3Left, 0.0F, -0.27314402793711257F, 0.0F);
        this.Chest = new BookwormModelRenderer(this, 0, 9, "Chest");
        this.Chest.setRotationPoint(0.0F, 2.7F, -2.5F);
        this.Chest.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Chest, 0.9560913642424937F, 0.0F, 0.0F);
        this.Toe2L = new BookwormModelRenderer(this, 16, 10, "Toe2L");
        this.Toe2L.setRotationPoint(0.0F, -0.4F, -0.3F);
        this.Toe2L.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe2L, 0.0F, -0.36425021489121656F, 0.0F);
        this.Toe3R = new BookwormModelRenderer(this, 16, 10, "Toe3R");
        this.Toe3R.mirror = true;
        this.Toe3R.setRotationPoint(0.0F, -0.4F, -0.3F);
        this.Toe3R.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3R, 0.0F, 0.36425021489121656F, 0.0F);
        this.Wing3Right = new BookwormModelRenderer(this, 23, 19, "Wing3Right");
        this.Wing3Right.mirror = true;
        this.Wing3Right.setRotationPoint(-2.0F, 0.0F, -5.0F);
        this.Wing3Right.addBox(-2.0F, -0.5F, 0.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(Wing3Right, 0.0F, 0.27314402793711257F, 0.0F);
        this.Beak2 = new BookwormModelRenderer(this, 4, 28, "Beak2");
        this.Beak2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.Beak2.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Beak2, 0.18203784098300857F, 0.0F, 0.0F);
        this.WingTip6L = new BookwormModelRenderer(this, 18, 25, "WingTip6L");
        this.WingTip6L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip6L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip6L, 0.0F, 0.18203784098300857F, 0.0F);
        this.Mouth = new BookwormModelRenderer(this, 9, 22, "Mouth");
        this.Mouth.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.Mouth.addBox(-0.5F, 0.0F, -1.9F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Mouth, -0.27314402793711257F, 0.0F, 0.0F);
        this.WingTip5L = new BookwormModelRenderer(this, 18, 25, "WingTip5L");
        this.WingTip5L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip5L, 0.0F, 0.18203784098300857F, 0.0F);
        this.Tail4R = new BookwormModelRenderer(this, 10, 15, "Tail4R");
        this.Tail4R.mirror = true;
        this.Tail4R.setRotationPoint(0.0F, 0.2F, -0.9F);
        this.Tail4R.addBox(0.0F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(Tail4R, 0.0F, -0.017453292519943295F, 0.0F);
        this.ThighLeft = new BookwormModelRenderer(this, 15, 22, "ThighLeft");
        this.ThighLeft.setRotationPoint(1.2F, 1.4F, -0.7F);
        this.ThighLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ThighLeft, 0.6373942428283291F, 0.0F, 0.0F);
        this.WingTip6RA = new BookwormModelRenderer(this, 18, 25, "WingTip6RA");
        this.WingTip6RA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip6RA.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip6RA, 0.0F, 0.136659280431156F, 0.0F);
        this.WingTip6R = new BookwormModelRenderer(this, 18, 25, "WingTip6R");
        this.WingTip6R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip6R.addBox(0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip6R, 0.0F, -0.18203784098300857F, 0.0F);
        this.WingTip3L = new BookwormModelRenderer(this, 18, 25, "WingTip3L");
        this.WingTip3L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip3L, 0.0F, 0.18203784098300857F, 0.0F);
        this.Toe1R = new BookwormModelRenderer(this, 10, 9, "Toe1R");
        this.Toe1R.mirror = true;
        this.Toe1R.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Toe1R.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1R, 0.4553564018453205F, 0.0F, 0.0F);
        this.Tail2L = new BookwormModelRenderer(this, 17, 7, "Tail2L");
        this.Tail2L.setRotationPoint(0.2F, 0.2F, -0.4F);
        this.Tail2L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tail2L, 0.0F, 0.017453292519943295F, 0.0F);
        this.LegRight = new BookwormModelRenderer(this, 12, 26, "LegRight");
        this.LegRight.mirror = true;
        this.LegRight.setRotationPoint(-0.3F, 2.0F, 0.5F);
        this.LegRight.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LegRight, -0.8196066167365371F, 0.0F, 0.0F);
        this.BeakSideLeft = new BookwormModelRenderer(this, 6, 28, "BeakSideLeft");
        this.BeakSideLeft.setRotationPoint(0.7F, 0.1F, -0.1F);
        this.BeakSideLeft.addBox(-1.0F, 0.0F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(BeakSideLeft, 0.0F, 0.045553093477052F, 0.0F);
        this.Tail1L = new BookwormModelRenderer(this, 16, 6, "Tail1L");
        this.Tail1L.setRotationPoint(0.3F, -0.3F, 1.5F);
        this.Tail1L.addBox(-1.0F, -1.0F, -0.5F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Tail1L, 0.3097959422289935F, 0.0F, 0.0F);
        this.LegLeft = new BookwormModelRenderer(this, 12, 26, "LegLeft");
        this.LegLeft.setRotationPoint(0.3F, 2.0F, 0.5F);
        this.LegLeft.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LegLeft, -0.8196066167365371F, 0.0F, 0.0F);
        this.Tail2R = new BookwormModelRenderer(this, 17, 7, "Tail2R");
        this.Tail2R.mirror = true;
        this.Tail2R.setRotationPoint(-0.2F, 0.2F, -0.4F);
        this.Tail2R.addBox(0.0F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tail2R, 0.0F, -0.017453292519943295F, 0.0F);
        this.WingTip1LA = new BookwormModelRenderer(this, 18, 25, "WingTip1LA");
        this.WingTip1LA.setRotationPoint(3.3F, 0.2F, 1.3F);
        this.WingTip1LA.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip1LA, 0.0F, -0.5009094953223726F, 0.0F);
        this.WingTip5R = new BookwormModelRenderer(this, 18, 25, "WingTip5R");
        this.WingTip5R.mirror = true;
        this.WingTip5R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5R.addBox(0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip5R, 0.0F, -0.18203784098300857F, 0.0F);
        this.Tail3L_1 = new BookwormModelRenderer(this, 17, 7, "Tail3L_1");
        this.Tail3L_1.mirror = true;
        this.Tail3L_1.setRotationPoint(0.0F, 0.2F, -0.9F);
        this.Tail3L_1.addBox(0.0F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tail3L_1, 0.0F, -0.017453292519943295F, 0.0F);
        this.Wing2Left = new BookwormModelRenderer(this, 28, 13, "Wing2Left");
        this.Wing2Left.setRotationPoint(2.0F, 0.0F, 5.0F);
        this.Wing2Left.addBox(0.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F);
        this.setRotateAngle(Wing2Left, 0.0F, 0.18203784098300857F, 0.0F);
        this.Toe1L = new BookwormModelRenderer(this, 10, 9, "Toe1L");
        this.Toe1L.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Toe1L.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1L, 0.4553564018453205F, 0.0F, 0.0F);
        this.WingFoldedLeft = new BookwormModelRenderer(this, 44, 7, "WingFoldedLeft");
        this.WingFoldedLeft.setRotationPoint(2.0F, -1.7F, -2.9F);
        this.WingFoldedLeft.addBox(0.0F, -0.5F, 0.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(WingFoldedLeft, 0.0F, 0.0F, 1.5707963267948966F);
        this.Body = new BookwormModelRenderer(this, 0, 0, "Body");
        this.Body.setRotationPoint(0.0F, 20.5F, 0.0F);
        this.Body.addBox(-2.0F, -2.0F, -2.5F, 4, 5, 4, 0.0F);
        this.setRotateAngle(Body, -0.27314402793711257F, 0.0F, 0.0F);
        this.WingTip3R = new BookwormModelRenderer(this, 18, 25, "WingTip3R");
        this.WingTip3R.mirror = true;
        this.WingTip3R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3R.addBox(0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip3R, 0.0F, -0.18203784098300857F, 0.0F);
        this.WingTip3LA = new BookwormModelRenderer(this, 18, 25, "WingTip3LA");
        this.WingTip3LA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3LA.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip3LA, 0.0F, 0.136659280431156F, 0.0F);
        this.Toe3L = new BookwormModelRenderer(this, 16, 10, "Toe3L");
        this.Toe3L.setRotationPoint(0.0F, -0.4F, -0.3F);
        this.Toe3L.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3L, 0.0F, 0.36425021489121656F, 0.0F);
        this.WingTip1R = new BookwormModelRenderer(this, 18, 25, "WingTip1R");
        this.WingTip1R.mirror = true;
        this.WingTip1R.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.WingTip1R.addBox(0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip1R, 0.0F, -0.18203784098300857F, 0.0F);
        this.WingTip6LA = new BookwormModelRenderer(this, 18, 25, "WingTip6LA");
        this.WingTip6LA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip6LA.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip6LA, 0.0F, 0.136659280431156F, 0.0F);
        this.Tail3L = new BookwormModelRenderer(this, 17, 7, "Tail3L");
        this.Tail3L.setRotationPoint(0.0F, 0.2F, -0.9F);
        this.Tail3L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 7, 0.0F);
        this.setRotateAngle(Tail3L, 0.0F, 0.017453292519943295F, 0.0F);
        this.BeakSideLeft_1 = new BookwormModelRenderer(this, 6, 28, "BeakSideLeft_1");
        this.BeakSideLeft_1.mirror = true;
        this.BeakSideLeft_1.setRotationPoint(-0.7F, 0.1F, -0.1F);
        this.BeakSideLeft_1.addBox(0.0F, 0.0F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(BeakSideLeft_1, 0.0F, -0.045553093477052F, 0.0F);
        this.WingFoldedRight = new BookwormModelRenderer(this, 44, 7, "WingFoldedRight");
        this.WingFoldedRight.setRotationPoint(-2.0F, -1.7F, -2.9F);
        this.WingFoldedRight.addBox(0.0F, -0.5F, 0.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(WingFoldedRight, 0.0F, 0.0F, 1.5707963267948966F);
        this.WingTip5RA = new BookwormModelRenderer(this, 18, 25, "WingTip5RA");
        this.WingTip5RA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5RA.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip5RA, 0.0F, 0.18203784098300857F, 0.0F);
        this.WingTip2RA = new BookwormModelRenderer(this, 18, 25, "WingTip2RA");
        this.WingTip2RA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2RA.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip2RA, 0.0F, 0.136659280431156F, 0.0F);
        this.Head = new BookwormModelRenderer(this, 0, 22, "Head");
        this.Head.setRotationPoint(0.0F, -2.3F, 1.3F);
        this.Head.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Head, -0.17872171540421936F, 0.0F, 0.0F);
        this.Neck = new BookwormModelRenderer(this, 0, 16, "Neck");
        this.Neck.setRotationPoint(0.0F, -3.0F, 0.45F);
        this.Neck.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Neck, -0.40980330836826856F, 0.0F, 0.0F);
        this.Tail4L = new BookwormModelRenderer(this, 10, 15, "Tail4L");
        this.Tail4L.setRotationPoint(0.0F, 0.2F, -0.9F);
        this.Tail4L.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(Tail4L, 0.0F, 0.017453292519943295F, 0.0F);
        this.WingTip4RA = new BookwormModelRenderer(this, 18, 25, "WingTip4RA");
        this.WingTip4RA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4RA.addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip4RA, 0.0F, 0.136659280431156F, 0.0F);
        this.WingTip2R = new BookwormModelRenderer(this, 18, 25, "WingTip2R");
        this.WingTip2R.mirror = true;
        this.WingTip2R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2R.addBox(0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip2R, 0.0F, -0.18203784098300857F, 0.0F);
        this.WingTip4L_1 = new BookwormModelRenderer(this, 18, 25, "WingTip4L_1");
        this.WingTip4L_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4L_1.addBox(0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(WingTip4L_1, 0.0F, -0.18203784098300857F, 0.0F);
        this.Body.addChild(this.TailBase);
        this.Body.addChild(this.ThighRight);
        this.WingTip4LA.addChild(this.WingTip5LA);
        this.Body.addChild(this.Wing1Left);
        this.Body.addChild(this.Wing1Right);
        this.WingTip1LA.addChild(this.WingTip2LA);
        this.WingTip3L.addChild(this.WingTip4L);
        this.TailCenter.addChild(this.TailCenterTop);
        this.WingFoldedRight.addChild(this.WingTip1RA);
        this.WingTip1L.addChild(this.WingTip2L);
        this.Head.addChild(this.BeakTop);
        this.WingTip2RA.addChild(this.WingTip3RA);
        this.Tail1L.addChild(this.TailCenter);
        this.WingTip3LA.addChild(this.WingTip4LA);
        this.Tail1L.addChild(this.Tail1R);
        this.Wing1Right.addChild(this.Wing2Right);
        this.TailCenter.addChild(this.Tail1R_1);
        this.TailCenter.addChild(this.Tail1L_1);
        this.Toe1R.addChild(this.Toe2R);
        this.Wing3Left.addChild(this.WingTip1L);
        this.Wing2Left.addChild(this.Wing3Left);
        this.Body.addChild(this.Chest);
        this.Toe1L.addChild(this.Toe2L);
        this.Toe1R.addChild(this.Toe3R);
        this.Wing2Right.addChild(this.Wing3Right);
        this.BeakTop.addChild(this.Beak2);
        this.WingTip5L.addChild(this.WingTip6L);
        this.BeakTop.addChild(this.Mouth);
        this.WingTip4L.addChild(this.WingTip5L);
        this.Tail3L_1.addChild(this.Tail4R);
        this.Body.addChild(this.ThighLeft);
        this.WingTip5RA.addChild(this.WingTip6RA);
        this.WingTip5R.addChild(this.WingTip6R);
        this.WingTip2L.addChild(this.WingTip3L);
        this.LegRight.addChild(this.Toe1R);
        this.Tail1L_1.addChild(this.Tail2L);
        this.ThighRight.addChild(this.LegRight);
        this.BeakTop.addChild(this.BeakSideLeft);
        this.TailBase.addChild(this.Tail1L);
        this.ThighLeft.addChild(this.LegLeft);
        this.Tail1R_1.addChild(this.Tail2R);
        this.WingFoldedLeft.addChild(this.WingTip1LA);
        this.WingTip4L_1.addChild(this.WingTip5R);
        this.Tail2R.addChild(this.Tail3L_1);
        this.Wing1Left.addChild(this.Wing2Left);
        this.LegLeft.addChild(this.Toe1L);
        this.Body.addChild(this.WingFoldedLeft);
        this.WingTip2R.addChild(this.WingTip3R);
        this.WingTip2LA.addChild(this.WingTip3LA);
        this.Toe1L.addChild(this.Toe3L);
        this.Wing3Right.addChild(this.WingTip1R);
        this.WingTip5LA.addChild(this.WingTip6LA);
        this.Tail2L.addChild(this.Tail3L);
        this.BeakTop.addChild(this.BeakSideLeft_1);
        this.Body.addChild(this.WingFoldedRight);
        this.WingTip4RA.addChild(this.WingTip5RA);
        this.WingTip1RA.addChild(this.WingTip2RA);
        this.Neck.addChild(this.Head);
        this.Chest.addChild(this.Neck);
        this.Tail3L.addChild(this.Tail4L);
        this.WingTip3RA.addChild(this.WingTip4RA);
        this.WingTip1R.addChild(this.WingTip2R);
        this.WingTip3R.addChild(this.WingTip4L_1);
        this.save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 0.7D, 0.7D);
        GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}