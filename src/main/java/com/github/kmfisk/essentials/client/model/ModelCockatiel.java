package com.github.kmfisk.essentials.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

/**
 * Cockatiel - fisk
 * Created using Tabula 7.1.0
 */
public class ModelCockatiel extends ZAWAModelBase {
    public BookwormModelRenderer Body;
    public BookwormModelRenderer TailBase;
    public BookwormModelRenderer LegLeft;
    public BookwormModelRenderer LegRight;
    public BookwormModelRenderer Neck;
    public BookwormModelRenderer WingFoldedLeft;
    public BookwormModelRenderer WingFoldedLeft_1;
    public BookwormModelRenderer Wing1Left;
    public BookwormModelRenderer Wing1Right;
    public BookwormModelRenderer Tail;
    public BookwormModelRenderer TailFeatherCenter;
    public BookwormModelRenderer TailFeatherL1;
    public BookwormModelRenderer TailFeatherL1_1;
    public BookwormModelRenderer TailFeatherL2;
    public BookwormModelRenderer TailFeatherL3;
    public BookwormModelRenderer TailFeatherL2_1;
    public BookwormModelRenderer TailFeatherL3_1;
    public BookwormModelRenderer ThighLeft;
    public BookwormModelRenderer FootLeft;
    public BookwormModelRenderer Toe1L;
    public BookwormModelRenderer Toe2L;
    public BookwormModelRenderer Toe3L;
    public BookwormModelRenderer ThighRight;
    public BookwormModelRenderer FootRight;
    public BookwormModelRenderer Toe1R;
    public BookwormModelRenderer Toe2R;
    public BookwormModelRenderer Toe3R;
    public BookwormModelRenderer Head;
    public BookwormModelRenderer Beak;
    public BookwormModelRenderer Forehead;
    public BookwormModelRenderer BeakTip;
    public BookwormModelRenderer Jaw;
    public BookwormModelRenderer Crest1;
    public BookwormModelRenderer Crest1A;
    public BookwormModelRenderer Crest2L;
    public BookwormModelRenderer Crest2R;
    public BookwormModelRenderer Crest3L;
    public BookwormModelRenderer Crest3L_1;
    public BookwormModelRenderer Crest3R;
    public BookwormModelRenderer Crest3R_1;
    public BookwormModelRenderer WingTip1L;
    public BookwormModelRenderer WingTip2L;
    public BookwormModelRenderer WingTip3L;
    public BookwormModelRenderer WingTip4L;
    public BookwormModelRenderer WingTip5L;
    public BookwormModelRenderer WingTip1L_1;
    public BookwormModelRenderer WingTip2L_1;
    public BookwormModelRenderer WingTip3L_1;
    public BookwormModelRenderer WingTip4L_1;
    public BookwormModelRenderer WingTip5L_1;
    public BookwormModelRenderer Wing2Left;
    public BookwormModelRenderer Wing3Left;
    public BookwormModelRenderer WingTip1L_2;
    public BookwormModelRenderer WingTip2L_2;
    public BookwormModelRenderer WingTip3L_2;
    public BookwormModelRenderer WingTip4L_2;
    public BookwormModelRenderer WingTip5L_2;
    public BookwormModelRenderer Wing2Right;
    public BookwormModelRenderer Wing3Left_1;
    public BookwormModelRenderer WingTip1R;
    public BookwormModelRenderer WingTip2R;
    public BookwormModelRenderer WingTip3R;
    public BookwormModelRenderer WingTip4R;
    public BookwormModelRenderer WingTip5R;

    public ModelCockatiel() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.Beak = new BookwormModelRenderer(this, 0, 22, "Beak");
        this.Beak.setRotationPoint(0.0F, -1.2F, -1.4F);
        this.Beak.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Beak, 0.136659280431156F, 0.0F, 0.0F);
        this.Toe2L = new BookwormModelRenderer(this, 23, 18, "Toe2L");
        this.Toe2L.setRotationPoint(-0.2F, 0.2F, 0.5F);
        this.Toe2L.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe2L, -0.18203784098300857F, -0.6373942428283291F, 0.0F);
        this.Toe1L = new BookwormModelRenderer(this, 23, 18, "Toe1L");
        this.Toe1L.setRotationPoint(0.0F, 0.1F, 0.2F);
        this.Toe1L.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe1L, -0.091106186954104F, -0.36425021489121656F, 0.045553093477052F);
        this.FootRight = new BookwormModelRenderer(this, 23, 18, "FootRight");
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.0F, 1.6F, -0.2F);
        this.FootRight.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(FootRight, 0.136659280431156F, -0.18203784098300857F, 0.0F);
        this.ThighLeft = new BookwormModelRenderer(this, 24, 7, "ThighLeft");
        this.ThighLeft.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.ThighLeft.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighLeft, 0.091106186954104F, 0.0F, 0.0F);
        this.Toe3L = new BookwormModelRenderer(this, 23, 18, "Toe3L");
        this.Toe3L.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe3L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3L, -0.18203784098300857F, 0.045553093477052F, 0.0F);
        this.WingTip2L_1 = new BookwormModelRenderer(this, 24, 12, "WingTip2L_1");
        this.WingTip2L_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2L_1.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip2L_1, 0.0F, 0.0F, -0.22759093446006054F);
        this.TailFeatherL3 = new BookwormModelRenderer(this, 0, 9, "TailFeatherL3");
        this.TailFeatherL3.setRotationPoint(0.0F, -0.3F, -0.2F);
        this.TailFeatherL3.addBox(-1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(TailFeatherL3, 0.0F, 0.0F, -0.045553093477052F);
        this.Toe1R = new BookwormModelRenderer(this, 23, 18, "Toe1R");
        this.Toe1R.mirror = true;
        this.Toe1R.setRotationPoint(0.0F, 0.1F, 0.2F);
        this.Toe1R.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe1R, -0.091106186954104F, 0.36425021489121656F, -0.045553093477052F);
        this.Tail = new BookwormModelRenderer(this, 16, 6, "Tail");
        this.Tail.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Tail.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Tail, 0.045553093477052F, 0.0F, 0.0F);
        this.Crest2R = new BookwormModelRenderer(this, 0, 28, "Crest2R");
        this.Crest2R.setRotationPoint(-0.15F, -1.0F, 0.4F);
        this.Crest2R.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Crest2R, -0.136659280431156F, 0.0F, 0.0F);
        this.WingTip4L = new BookwormModelRenderer(this, 24, 12, "WingTip4L");
        this.WingTip4L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4L.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip4L, 0.0F, 0.0F, -0.22759093446006054F);
        this.Toe3R = new BookwormModelRenderer(this, 23, 18, "Toe3R");
        this.Toe3R.mirror = true;
        this.Toe3R.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe3R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3R, -0.18203784098300857F, -0.045553093477052F, 0.0F);
        this.Body = new BookwormModelRenderer(this, 0, 0, "Body");
        this.Body.setRotationPoint(0.0F, 19.5F, 0.0F);
        this.Body.addBox(-2.0F, -3.0F, -2.5F, 4, 5, 4, 0.0F);
        this.setRotateAngle(Body, 1.0471975511965976F, 0.0F, 0.0F);
        this.Wing2Left = new BookwormModelRenderer(this, 14, 16, "Wing2Left");
        this.Wing2Left.setRotationPoint(3.0F, 4.0F, 0.0F);
        this.Wing2Left.addBox(0.0F, -4.0F, -0.5F, 3, 4, 1, 0.0F);
        this.setRotateAngle(Wing2Left, 0.0F, 0.0F, -0.31869712141416456F);
        this.Head = new BookwormModelRenderer(this, 0, 16, "Head");
        this.Head.setRotationPoint(0.0F, -1.5F, -0.1F);
        this.Head.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Head, -0.4553564018453205F, 0.0F, 0.0F);
        this.WingTip3L_2 = new BookwormModelRenderer(this, 24, 12, "WingTip3L_2");
        this.WingTip3L_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3L_2.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip3L_2, 0.0F, 0.0F, -0.22759093446006054F);
        this.WingTip4R = new BookwormModelRenderer(this, 24, 12, "WingTip4R");
        this.WingTip4R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4R.addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip4R, 0.0F, 0.0F, 0.22759093446006054F);
        this.WingFoldedLeft = new BookwormModelRenderer(this, 21, 26, "WingFoldedLeft");
        this.WingFoldedLeft.setRotationPoint(2.0F, -2.7F, 0.2F);
        this.WingFoldedLeft.addBox(-1.0F, 0.0F, -0.5F, 4, 4, 1, 0.0F);
        this.setRotateAngle(WingFoldedLeft, 0.0F, 1.5707963267948966F, 0.0F);
        this.Crest3R_1 = new BookwormModelRenderer(this, 4, 29, "Crest3R_1");
        this.Crest3R_1.setRotationPoint(-0.15F, -0.1F, 0.1F);
        this.Crest3R_1.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Crest3R_1, -0.136659280431156F, 0.0F, 0.0F);
        this.BeakTip = new BookwormModelRenderer(this, 0, 25, "BeakTip");
        this.BeakTip.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.BeakTip.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(BeakTip, -0.40980330836826856F, 0.0F, 0.0F);
        this.Crest3R = new BookwormModelRenderer(this, 4, 29, "Crest3R");
        this.Crest3R.setRotationPoint(-0.15F, 0.0F, 0.0F);
        this.Crest3R.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Crest3R, -0.22759093446006054F, 0.0F, 0.0F);
        this.WingTip5L = new BookwormModelRenderer(this, 24, 12, "WingTip5L");
        this.WingTip5L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5L.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip5L, 0.0F, 0.0F, -0.22759093446006054F);
        this.WingTip1L_1 = new BookwormModelRenderer(this, 24, 12, "WingTip1L_1");
        this.WingTip1L_1.setRotationPoint(2.9F, 2.3F, 0.1F);
        this.WingTip1L_1.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip1L_1, 0.0F, 0.0F, 0.9560913642424937F);
        this.Wing3Left = new BookwormModelRenderer(this, 15, 21, "Wing3Left");
        this.Wing3Left.setRotationPoint(3.0F, -4.0F, 0.0F);
        this.Wing3Left.addBox(0.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotateAngle(Wing3Left, 0.0F, 0.0F, 0.18203784098300857F);
        this.TailFeatherCenter = new BookwormModelRenderer(this, 28, 0, "TailFeatherCenter");
        this.TailFeatherCenter.setRotationPoint(0.0F, 1.5F, 0.3F);
        this.TailFeatherCenter.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
        this.WingTip2L = new BookwormModelRenderer(this, 24, 12, "WingTip2L");
        this.WingTip2L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2L.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip2L, 0.0F, 0.0F, -0.22759093446006054F);
        this.FootLeft = new BookwormModelRenderer(this, 23, 18, "FootLeft");
        this.FootLeft.setRotationPoint(0.0F, 1.6F, -0.2F);
        this.FootLeft.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(FootLeft, 0.136659280431156F, 0.18203784098300857F, 0.0F);
        this.WingTip4L_2 = new BookwormModelRenderer(this, 24, 12, "WingTip4L_2");
        this.WingTip4L_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4L_2.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip4L_2, 0.0F, 0.0F, -0.22759093446006054F);
        this.WingTip1R = new BookwormModelRenderer(this, 24, 12, "WingTip1R");
        this.WingTip1R.mirror = true;
        this.WingTip1R.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.WingTip1R.addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip1R, 0.0F, 0.0F, 0.136659280431156F);
        this.WingTip3L = new BookwormModelRenderer(this, 24, 12, "WingTip3L");
        this.WingTip3L.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3L.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip3L, 0.0F, 0.0F, -0.22759093446006054F);
        this.ThighRight = new BookwormModelRenderer(this, 24, 7, "ThighRight");
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.ThighRight.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighRight, 0.091106186954104F, 0.0F, 0.0F);
        this.WingTip2R = new BookwormModelRenderer(this, 24, 12, "WingTip2R");
        this.WingTip2R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2R.addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip2R, 0.0F, 0.0F, 0.22759093446006054F);
        this.TailFeatherL2 = new BookwormModelRenderer(this, 0, 9, "TailFeatherL2");
        this.TailFeatherL2.setRotationPoint(0.4F, -1.8F, -0.2F);
        this.TailFeatherL2.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(TailFeatherL2, 0.0F, 0.0F, 0.045553093477052F);
        this.Crest3L = new BookwormModelRenderer(this, 4, 29, "Crest3L");
        this.Crest3L.setRotationPoint(0.15F, 0.0F, 0.0F);
        this.Crest3L.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Crest3L, -0.22759093446006054F, 0.0F, 0.0F);
        this.Forehead = new BookwormModelRenderer(this, 4, 25, "Forehead");
        this.Forehead.setRotationPoint(0.0F, -1.9F, 1.2F);
        this.Forehead.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.Crest1 = new BookwormModelRenderer(this, 11, 22, "Crest1");
        this.Crest1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Crest1.addBox(-0.5F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(Crest1, -1.0471975511965976F, 0.0F, 0.0F);
        this.Jaw = new BookwormModelRenderer(this, 6, 22, "Jaw");
        this.Jaw.setRotationPoint(0.0F, 1.7F, 0.0F);
        this.Jaw.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Jaw, -0.18203784098300857F, 0.0F, 0.0F);
        this.WingTip3L_1 = new BookwormModelRenderer(this, 24, 12, "WingTip3L_1");
        this.WingTip3L_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3L_1.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip3L_1, 0.0F, 0.0F, -0.22759093446006054F);
        this.Wing1Right = new BookwormModelRenderer(this, 14, 11, "Wing1Right");
        this.Wing1Right.mirror = true;
        this.Wing1Right.setRotationPoint(-1.5F, -2.7F, 0.5F);
        this.Wing1Right.addBox(-3.0F, 0.0F, -0.5F, 4, 4, 1, 0.0F);
        this.WingTip5L_2 = new BookwormModelRenderer(this, 24, 12, "WingTip5L_2");
        this.WingTip5L_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5L_2.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip5L_2, 0.0F, 0.0F, -0.22759093446006054F);
        this.Crest1A = new BookwormModelRenderer(this, 11, 26, "Crest1A");
        this.Crest1A.setRotationPoint(0.0F, -3.0F, 1.0F);
        this.Crest1A.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Crest1A, 0.31869712141416456F, 0.0F, 0.0F);
        this.Neck = new BookwormModelRenderer(this, 4, 9, "Neck");
        this.Neck.setRotationPoint(0.0F, -2.8F, -0.2F);
        this.Neck.addBox(-1.0F, -2.0F, -1.5F, 2, 4, 3, 0.0F);
        this.setRotateAngle(Neck, -0.5462880558742251F, 0.0F, 0.0F);
        this.TailFeatherL2_1 = new BookwormModelRenderer(this, 0, 9, "TailFeatherL2_1");
        this.TailFeatherL2_1.setRotationPoint(-0.4F, -1.9F, -0.2F);
        this.TailFeatherL2_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(TailFeatherL2_1, 0.0F, 0.0F, -0.045553093477052F);
        this.Wing3Left_1 = new BookwormModelRenderer(this, 15, 21, "Wing3Left_1");
        this.Wing3Left_1.setRotationPoint(-3.0F, -4.0F, 0.0F);
        this.Wing3Left_1.addBox(-2.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotateAngle(Wing3Left_1, 0.0F, 0.0F, -0.18203784098300857F);
        this.Crest3L_1 = new BookwormModelRenderer(this, 4, 29, "Crest3L_1");
        this.Crest3L_1.setRotationPoint(0.15F, -0.1F, 0.1F);
        this.Crest3L_1.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Crest3L_1, -0.136659280431156F, 0.0F, 0.0F);
        this.Wing1Left = new BookwormModelRenderer(this, 14, 11, "Wing1Left");
        this.Wing1Left.setRotationPoint(1.5F, -2.7F, 0.5F);
        this.Wing1Left.addBox(-1.0F, 0.0F, -0.5F, 4, 4, 1, 0.0F);
        this.TailFeatherL1 = new BookwormModelRenderer(this, 0, 9, "TailFeatherL1");
        this.TailFeatherL1.setRotationPoint(1.0F, -0.7F, -0.6F);
        this.TailFeatherL1.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.WingTip1L = new BookwormModelRenderer(this, 24, 12, "WingTip1L");
        this.WingTip1L.setRotationPoint(2.9F, 2.3F, -0.1F);
        this.WingTip1L.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip1L, 0.0F, 0.0F, 0.9560913642424937F);
        this.TailFeatherL3_1 = new BookwormModelRenderer(this, 0, 9, "TailFeatherL3_1");
        this.TailFeatherL3_1.setRotationPoint(0.0F, -0.3F, -0.2F);
        this.TailFeatherL3_1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(TailFeatherL3_1, 0.0F, 0.0F, 0.045553093477052F);
        this.WingTip4L_1 = new BookwormModelRenderer(this, 24, 12, "WingTip4L_1");
        this.WingTip4L_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip4L_1.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip4L_1, 0.0F, 0.0F, -0.22759093446006054F);
        this.TailBase = new BookwormModelRenderer(this, 16, 0, "TailBase");
        this.TailBase.setRotationPoint(0.0F, 2.0F, -0.7F);
        this.TailBase.addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3, 0.0F);
        this.setRotateAngle(TailBase, 0.18203784098300857F, 0.0F, 0.0F);
        this.WingTip1L_2 = new BookwormModelRenderer(this, 24, 12, "WingTip1L_2");
        this.WingTip1L_2.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.WingTip1L_2.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip1L_2, 0.0F, 0.0F, -0.136659280431156F);
        this.Toe2R = new BookwormModelRenderer(this, 23, 18, "Toe2R");
        this.Toe2R.mirror = true;
        this.Toe2R.setRotationPoint(0.2F, 0.2F, 0.5F);
        this.Toe2R.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe2R, -0.18203784098300857F, 0.6373942428283291F, 0.0F);
        this.WingTip3R = new BookwormModelRenderer(this, 24, 12, "WingTip3R");
        this.WingTip3R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip3R.addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip3R, 0.0F, 0.0F, 0.22759093446006054F);
        this.TailFeatherL1_1 = new BookwormModelRenderer(this, 0, 9, "TailFeatherL1_1");
        this.TailFeatherL1_1.setRotationPoint(-1.0F, -0.7F, -0.6F);
        this.TailFeatherL1_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.WingFoldedLeft_1 = new BookwormModelRenderer(this, 21, 26, "WingFoldedLeft_1");
        this.WingFoldedLeft_1.setRotationPoint(-2.0F, -2.7F, 0.2F);
        this.WingFoldedLeft_1.addBox(-1.0F, 0.0F, -0.5F, 4, 4, 1, 0.0F);
        this.setRotateAngle(WingFoldedLeft_1, 0.0F, 1.5707963267948966F, 0.0F);
        this.WingTip5L_1 = new BookwormModelRenderer(this, 24, 12, "WingTip5L_1");
        this.WingTip5L_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5L_1.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip5L_1, 0.0F, 0.0F, -0.22759093446006054F);
        this.LegLeft = new BookwormModelRenderer(this, 0, 0, "LegLeft");
        this.LegLeft.setRotationPoint(1.2F, 1.1F, -2.5F);
        this.LegLeft.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegLeft, -1.0927506446736497F, 0.0F, 0.0F);
        this.LegRight = new BookwormModelRenderer(this, 0, 0, "LegRight");
        this.LegRight.setRotationPoint(-1.2F, 1.1F, -2.5F);
        this.LegRight.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegRight, -1.0927506446736497F, 0.0F, 0.0F);
        this.WingTip5R = new BookwormModelRenderer(this, 24, 12, "WingTip5R");
        this.WingTip5R.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip5R.addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip5R, 0.0F, 0.0F, 0.22759093446006054F);
        this.WingTip2L_2 = new BookwormModelRenderer(this, 24, 12, "WingTip2L_2");
        this.WingTip2L_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTip2L_2.addBox(-1.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(WingTip2L_2, 0.0F, 0.0F, -0.22759093446006054F);
        this.Wing2Right = new BookwormModelRenderer(this, 14, 16, "Wing2Right");
        this.Wing2Right.mirror = true;
        this.Wing2Right.setRotationPoint(-3.0F, 4.0F, 0.0F);
        this.Wing2Right.addBox(-3.0F, -4.0F, -0.5F, 3, 4, 1, 0.0F);
        this.setRotateAngle(Wing2Right, 0.0F, 0.0F, 0.31869712141416456F);
        this.Crest2L = new BookwormModelRenderer(this, 0, 28, "Crest2L");
        this.Crest2L.setRotationPoint(0.15F, -1.0F, 0.4F);
        this.Crest2L.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(Crest2L, -0.136659280431156F, 0.0F, 0.0F);
        this.Head.addChild(this.Beak);
        this.FootLeft.addChild(this.Toe2L);
        this.FootLeft.addChild(this.Toe1L);
        this.LegRight.addChild(this.FootRight);
        this.LegLeft.addChild(this.ThighLeft);
        this.FootLeft.addChild(this.Toe3L);
        this.WingTip1L_1.addChild(this.WingTip2L_1);
        this.TailFeatherL2.addChild(this.TailFeatherL3);
        this.FootRight.addChild(this.Toe1R);
        this.TailBase.addChild(this.Tail);
        this.Crest1.addChild(this.Crest2R);
        this.WingTip3L.addChild(this.WingTip4L);
        this.FootRight.addChild(this.Toe3R);
        this.Wing1Left.addChild(this.Wing2Left);
        this.Neck.addChild(this.Head);
        this.WingTip2L_2.addChild(this.WingTip3L_2);
        this.WingTip3R.addChild(this.WingTip4R);
        this.Body.addChild(this.WingFoldedLeft);
        this.Crest3R.addChild(this.Crest3R_1);
        this.Beak.addChild(this.BeakTip);
        this.Crest2R.addChild(this.Crest3R);
        this.WingTip4L.addChild(this.WingTip5L);
        this.WingFoldedLeft_1.addChild(this.WingTip1L_1);
        this.Wing2Left.addChild(this.Wing3Left);
        this.Tail.addChild(this.TailFeatherCenter);
        this.WingTip1L.addChild(this.WingTip2L);
        this.LegLeft.addChild(this.FootLeft);
        this.WingTip3L_2.addChild(this.WingTip4L_2);
        this.Wing3Left_1.addChild(this.WingTip1R);
        this.WingTip2L.addChild(this.WingTip3L);
        this.LegRight.addChild(this.ThighRight);
        this.WingTip1R.addChild(this.WingTip2R);
        this.TailFeatherL1.addChild(this.TailFeatherL2);
        this.Crest2L.addChild(this.Crest3L);
        this.Head.addChild(this.Forehead);
        this.Forehead.addChild(this.Crest1);
        this.Beak.addChild(this.Jaw);
        this.WingTip2L_1.addChild(this.WingTip3L_1);
        this.Body.addChild(this.Wing1Right);
        this.WingTip4L_2.addChild(this.WingTip5L_2);
        this.Crest1.addChild(this.Crest1A);
        this.Body.addChild(this.Neck);
        this.TailFeatherL1_1.addChild(this.TailFeatherL2_1);
        this.Wing2Right.addChild(this.Wing3Left_1);
        this.Crest3L.addChild(this.Crest3L_1);
        this.Body.addChild(this.Wing1Left);
        this.TailFeatherCenter.addChild(this.TailFeatherL1);
        this.WingFoldedLeft.addChild(this.WingTip1L);
        this.TailFeatherL2_1.addChild(this.TailFeatherL3_1);
        this.WingTip3L_1.addChild(this.WingTip4L_1);
        this.Body.addChild(this.TailBase);
        this.Wing3Left.addChild(this.WingTip1L_2);
        this.FootRight.addChild(this.Toe2R);
        this.WingTip2R.addChild(this.WingTip3R);
        this.TailFeatherCenter.addChild(this.TailFeatherL1_1);
        this.Body.addChild(this.WingFoldedLeft_1);
        this.WingTip4L_1.addChild(this.WingTip5L_1);
        this.Body.addChild(this.LegLeft);
        this.Body.addChild(this.LegRight);
        this.WingTip4R.addChild(this.WingTip5R);
        this.WingTip1L_2.addChild(this.WingTip2L_2);
        this.Wing1Right.addChild(this.Wing2Right);
        this.Crest1.addChild(this.Crest2L);
        this.save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
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
