package com.github.kmfisk.essentials.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

/**
 * Eclectus - fisk
 * Created using Tabula 7.1.0
 */
public class ModelEclectus extends ZAWAModelBase {
    public BookwormModelRenderer Body;
    public BookwormModelRenderer Neck;
    public BookwormModelRenderer LegLeft;
    public BookwormModelRenderer LegRight;
    public BookwormModelRenderer TailBase;
    public BookwormModelRenderer WingFoldedLeft;
    public BookwormModelRenderer WingFoldedRight;
    public BookwormModelRenderer Wing1Left;
    public BookwormModelRenderer Wing1Right;
    public BookwormModelRenderer Head;
    public BookwormModelRenderer Forehead;
    public BookwormModelRenderer Beak;
    public BookwormModelRenderer BeakTip;
    public BookwormModelRenderer Jaw;
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
    public BookwormModelRenderer Tail;
    public BookwormModelRenderer TailFeatherCenter;
    public BookwormModelRenderer TailFeather1L;
    public BookwormModelRenderer TailFeather1R;
    public BookwormModelRenderer TailFeather2L;
    public BookwormModelRenderer TailFeather3L;
    public BookwormModelRenderer TailFeather2R;
    public BookwormModelRenderer TailFeather3R;
    public BookwormModelRenderer WingTipL1A;
    public BookwormModelRenderer WingTipL2A;
    public BookwormModelRenderer WingTipL3A;
    public BookwormModelRenderer WingTipL4A;
    public BookwormModelRenderer WingTipL5A;
    public BookwormModelRenderer WingTipL6A;
    public BookwormModelRenderer WingTipR1A;
    public BookwormModelRenderer WingTipR2A;
    public BookwormModelRenderer WingTipR3A;
    public BookwormModelRenderer WingTipR4A;
    public BookwormModelRenderer WingTipR5A;
    public BookwormModelRenderer WingTipR6A;
    public BookwormModelRenderer Wing2Left;
    public BookwormModelRenderer Wing3Left;
    public BookwormModelRenderer WingTipL1;
    public BookwormModelRenderer WingTipL2;
    public BookwormModelRenderer WingTipL3;
    public BookwormModelRenderer WingTipL4;
    public BookwormModelRenderer WingTipL5;
    public BookwormModelRenderer WingTipL6;
    public BookwormModelRenderer Wing2Right;
    public BookwormModelRenderer Wing3Right;
    public BookwormModelRenderer WingTipR1;
    public BookwormModelRenderer WingTipR2;
    public BookwormModelRenderer WingTipR3;
    public BookwormModelRenderer WingTipR4;
    public BookwormModelRenderer WingTipL5_1;
    public BookwormModelRenderer WingTipL6_1;

    public ModelEclectus() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.WingTipR4A = new BookwormModelRenderer(this, 28, 15, "WingTipR4A");
        this.WingTipR4A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR4A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR4A, 0.0F, 0.0F, -0.19198621771937624F);
        this.Jaw = new BookwormModelRenderer(this, 20, 5, "Jaw");
        this.Jaw.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Jaw.addBox(-0.5F, -0.25F, -0.8F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Jaw, -0.22759093446006054F, 0.0F, 0.0F);
        this.WingTipR1 = new BookwormModelRenderer(this, 28, 15, "WingTipR1");
        this.WingTipR1.mirror = true;
        this.WingTipR1.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.WingTipR1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR1, 0.0F, 0.0F, 0.19198621771937624F);
        this.Toe1R = new BookwormModelRenderer(this, 32, 18, "Toe1R");
        this.Toe1R.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe1R.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1R, -0.091106186954104F, 0.36425021489121656F, -0.045553093477052F);
        this.TailFeather3L = new BookwormModelRenderer(this, 28, 0, "TailFeather3L");
        this.TailFeather3L.setRotationPoint(0.2F, -0.3F, -0.1F);
        this.TailFeather3L.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotateAngle(TailFeather3L, 0.0F, 0.0F, -0.045553093477052F);
        this.WingTipR2A = new BookwormModelRenderer(this, 28, 15, "WingTipR2A");
        this.WingTipR2A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR2A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.BeakTip = new BookwormModelRenderer(this, 23, 0, "BeakTip");
        this.BeakTip.setRotationPoint(0.0F, -1.5F, -1.0F);
        this.BeakTip.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.FootRight = new BookwormModelRenderer(this, 32, 18, "FootRight");
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.FootRight.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootRight, 0.136659280431156F, -0.18203784098300857F, 0.0F);
        this.WingTipR6A = new BookwormModelRenderer(this, 28, 15, "WingTipR6A");
        this.WingTipR6A.setRotationPoint(-0.3F, 0.0F, 0.0F);
        this.WingTipR6A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR6A, 0.0F, 0.0F, -0.19198621771937624F);
        this.WingTipR4 = new BookwormModelRenderer(this, 28, 15, "WingTipR4");
        this.WingTipR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR4.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR4, 0.0F, 0.0F, 0.19198621771937624F);
        this.Toe1L = new BookwormModelRenderer(this, 32, 18, "Toe1L");
        this.Toe1L.setRotationPoint(0.0F, 0.2F, 0.2F);
        this.Toe1L.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe1L, -0.091106186954104F, -0.36425021489121656F, 0.045553093477052F);
        this.LegLeft = new BookwormModelRenderer(this, 0, 0, "LegLeft");
        this.LegLeft.setRotationPoint(1.6F, 1.4F, -2.5F);
        this.LegLeft.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegLeft, -0.8651597102135892F, 0.0F, 0.0F);
        this.Beak = new BookwormModelRenderer(this, 15, 0, "Beak");
        this.Beak.setRotationPoint(0.0F, 0.3F, -2.5F);
        this.Beak.addBox(-1.0F, -2.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(Beak, 0.18203784098300857F, 0.0F, 0.0F);
        this.Toe3R = new BookwormModelRenderer(this, 33, 19, "Toe3R");
        this.Toe3R.mirror = true;
        this.Toe3R.setRotationPoint(0.0F, 0.3F, 0.2F);
        this.Toe3R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3R, -0.045553093477052F, -0.045553093477052F, 0.0F);
        this.Tail = new BookwormModelRenderer(this, 47, 15, "Tail");
        this.Tail.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Tail.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
        this.WingTipR3 = new BookwormModelRenderer(this, 28, 15, "WingTipR3");
        this.WingTipR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR3, 0.0F, 0.0F, 0.19198621771937624F);
        this.FootLeft = new BookwormModelRenderer(this, 32, 18, "FootLeft");
        this.FootLeft.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.FootLeft.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(FootLeft, 0.136659280431156F, 0.18203784098300857F, 0.0F);
        this.Neck = new BookwormModelRenderer(this, 0, 11, "Neck");
        this.Neck.setRotationPoint(0.0F, -3.0F, 0.2F);
        this.Neck.addBox(-1.5F, -2.3F, -2.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(Neck, -0.36425021489121656F, 0.0F, 0.0F);
        this.WingTipL3 = new BookwormModelRenderer(this, 28, 15, "WingTipL3");
        this.WingTipL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL3.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL3, 0.0F, 0.0F, -0.19198621771937624F);
        this.WingTipL1A = new BookwormModelRenderer(this, 28, 15, "WingTipL1A");
        this.WingTipL1A.setRotationPoint(4.0F, 1.4F, -0.1F);
        this.WingTipL1A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL1A, 0.0F, 0.0F, 0.6373942428283291F);
        this.Wing3Right = new BookwormModelRenderer(this, 35, 22, "Wing3Right");
        this.Wing3Right.mirror = true;
        this.Wing3Right.setRotationPoint(-2.0F, -5.0F, 0.0F);
        this.Wing3Right.addBox(-3.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(Wing3Right, 0.0F, 0.0F, -0.18203784098300857F);
        this.TailBase = new BookwormModelRenderer(this, 33, 11, "TailBase");
        this.TailBase.setRotationPoint(0.0F, 2.5F, -0.2F);
        this.TailBase.addBox(-2.0F, -1.0F, -1.5F, 4, 3, 3, 0.0F);
        this.setRotateAngle(TailBase, 0.27314402793711257F, 0.0F, 0.0F);
        this.Wing2Right = new BookwormModelRenderer(this, 29, 22, "Wing2Right");
        this.Wing2Right.mirror = true;
        this.Wing2Right.setRotationPoint(-2.0F, 5.0F, 0.0F);
        this.Wing2Right.addBox(-2.0F, -5.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(Wing2Right, 0.0F, 0.0F, 0.22759093446006054F);
        this.WingTipL3A = new BookwormModelRenderer(this, 28, 15, "WingTipL3A");
        this.WingTipL3A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL3A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL3A, 0.0F, 0.0F, -0.091106186954104F);
        this.WingTipL5 = new BookwormModelRenderer(this, 28, 15, "WingTipL5");
        this.WingTipL5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL5.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL5, 0.0F, 0.0F, -0.19198621771937624F);
        this.WingTipL5_1 = new BookwormModelRenderer(this, 28, 15, "WingTipL5_1");
        this.WingTipL5_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL5_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL5_1, 0.0F, 0.0F, 0.19198621771937624F);
        this.WingTipL2A = new BookwormModelRenderer(this, 28, 15, "WingTipL2A");
        this.WingTipL2A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL2A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.WingTipL4 = new BookwormModelRenderer(this, 28, 15, "WingTipL4");
        this.WingTipL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL4.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL4, 0.0F, 0.0F, -0.19198621771937624F);
        this.Wing2Left = new BookwormModelRenderer(this, 29, 22, "Wing2Left");
        this.Wing2Left.setRotationPoint(2.0F, 5.0F, 0.0F);
        this.Wing2Left.addBox(0.0F, -5.0F, 0.0F, 2, 5, 1, 0.0F);
        this.setRotateAngle(Wing2Left, 0.0F, 0.0F, -0.22759093446006054F);
        this.Toe2L = new BookwormModelRenderer(this, 32, 18, "Toe2L");
        this.Toe2L.setRotationPoint(-0.2F, 0.1F, 0.2F);
        this.Toe2L.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe2L, -0.27314402793711257F, -0.6373942428283291F, 0.0F);
        this.WingTipL6A = new BookwormModelRenderer(this, 28, 15, "WingTipL6A");
        this.WingTipL6A.setRotationPoint(-0.3F, 0.0F, 0.0F);
        this.WingTipL6A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL6A, 0.0F, 0.0F, -0.19198621771937624F);
        this.WingTipL6_1 = new BookwormModelRenderer(this, 28, 15, "WingTipL6_1");
        this.WingTipL6_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL6_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL6_1, 0.0F, 0.0F, 0.19198621771937624F);
        this.ThighRight = new BookwormModelRenderer(this, 24, 6, "ThighRight");
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.ThighRight.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighRight, 0.091106186954104F, 0.0F, 0.0F);
        this.WingTipL5A = new BookwormModelRenderer(this, 28, 15, "WingTipL5A");
        this.WingTipL5A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL5A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL5A, 0.0F, 0.0F, -0.19198621771937624F);
        this.Head = new BookwormModelRenderer(this, 0, 19, "Head");
        this.Head.setRotationPoint(0.0F, -2.3F, 0.6F);
        this.Head.addBox(-2.0F, -2.0F, -2.5F, 4, 4, 4, 0.0F);
        this.setRotateAngle(Head, -0.4553564018453205F, 0.0F, 0.0F);
        this.TailFeather3R = new BookwormModelRenderer(this, 28, 0, "TailFeather3R");
        this.TailFeather3R.mirror = true;
        this.TailFeather3R.setRotationPoint(-0.2F, -0.3F, -0.1F);
        this.TailFeather3R.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotateAngle(TailFeather3R, 0.0F, 0.0F, 0.045553093477052F);
        this.Body = new BookwormModelRenderer(this, 0, 0, "Body");
        this.Body.setRotationPoint(0.0F, 19.1F, 0.0F);
        this.Body.addBox(-2.5F, -3.0F, -2.5F, 5, 6, 5, 0.0F);
        this.setRotateAngle(Body, 0.8651597102135892F, 0.0F, 0.0F);
        this.Wing1Right = new BookwormModelRenderer(this, 23, 22, "Wing1Right");
        this.Wing1Right.mirror = true;
        this.Wing1Right.setRotationPoint(-2.0F, -2.5F, 1.0F);
        this.Wing1Right.addBox(-2.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        this.WingFoldedRight = new BookwormModelRenderer(this, 44, 22, "WingFoldedRight");
        this.WingFoldedRight.setRotationPoint(-2.3F, -2.9F, 2.2F);
        this.WingFoldedRight.addBox(0.0F, 0.0F, -1.0F, 4, 5, 1, 0.0F);
        this.setRotateAngle(WingFoldedRight, 0.0F, 1.5707963267948966F, 0.0F);
        this.WingFoldedLeft = new BookwormModelRenderer(this, 44, 22, "WingFoldedLeft");
        this.WingFoldedLeft.setRotationPoint(2.3F, -2.9F, 2.2F);
        this.WingFoldedLeft.addBox(0.0F, 0.0F, 0.0F, 4, 5, 1, 0.0F);
        this.setRotateAngle(WingFoldedLeft, 0.0F, 1.5707963267948966F, 0.0F);
        this.WingTipL4A = new BookwormModelRenderer(this, 28, 15, "WingTipL4A");
        this.WingTipL4A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL4A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL4A, 0.0F, 0.0F, -0.19198621771937624F);
        this.Forehead = new BookwormModelRenderer(this, 14, 11, "Forehead");
        this.Forehead.setRotationPoint(0.0F, -2.7F, 0.9F);
        this.Forehead.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(Forehead, 0.017453292519943295F, 0.0F, 0.0F);
        this.TailFeather1R = new BookwormModelRenderer(this, 28, 0, "TailFeather1R");
        this.TailFeather1R.mirror = true;
        this.TailFeather1R.setRotationPoint(-0.4F, -0.1F, -0.1F);
        this.TailFeather1R.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.ThighLeft = new BookwormModelRenderer(this, 24, 6, "ThighLeft");
        this.ThighLeft.setRotationPoint(0.0F, 0.6F, 0.0F);
        this.ThighLeft.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ThighLeft, 0.091106186954104F, 0.0F, 0.0F);
        this.LegRight = new BookwormModelRenderer(this, 0, 0, "LegRight");
        this.LegRight.mirror = true;
        this.LegRight.setRotationPoint(-1.6F, 1.4F, -2.5F);
        this.LegRight.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(LegRight, -0.8651597102135892F, 0.0F, 0.0F);
        this.TailFeather1L = new BookwormModelRenderer(this, 28, 0, "TailFeather1L");
        this.TailFeather1L.setRotationPoint(0.5F, -0.1F, -0.1F);
        this.TailFeather1L.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.WingTipL6 = new BookwormModelRenderer(this, 28, 15, "WingTipL6");
        this.WingTipL6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL6.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL6, 0.0F, 0.0F, -0.19198621771937624F);
        this.Wing3Left = new BookwormModelRenderer(this, 35, 22, "Wing3Left");
        this.Wing3Left.setRotationPoint(2.0F, -5.0F, 0.0F);
        this.Wing3Left.addBox(0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F);
        this.setRotateAngle(Wing3Left, 0.0F, 0.0F, 0.18203784098300857F);
        this.WingTipL1 = new BookwormModelRenderer(this, 28, 15, "WingTipL1");
        this.WingTipL1.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.WingTipL1.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL1, 0.0F, 0.0F, -0.19198621771937624F);
        this.TailFeather2L = new BookwormModelRenderer(this, 28, 0, "TailFeather2L");
        this.TailFeather2L.setRotationPoint(0.1F, -0.3F, -0.1F);
        this.TailFeather2L.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotateAngle(TailFeather2L, 0.0F, 0.0F, -0.045553093477052F);
        this.WingTipL2 = new BookwormModelRenderer(this, 28, 15, "WingTipL2");
        this.WingTipL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipL2.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipL2, 0.0F, 0.0F, -0.19198621771937624F);
        this.WingTipR5A = new BookwormModelRenderer(this, 28, 15, "WingTipR5A");
        this.WingTipR5A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR5A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR5A, 0.0F, 0.0F, -0.19198621771937624F);
        this.Toe2R = new BookwormModelRenderer(this, 32, 18, "Toe2R");
        this.Toe2R.mirror = true;
        this.Toe2R.setRotationPoint(0.2F, 0.1F, 0.2F);
        this.Toe2R.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(Toe2R, -0.27314402793711257F, 0.6373942428283291F, 0.0F);
        this.WingTipR2 = new BookwormModelRenderer(this, 28, 15, "WingTipR2");
        this.WingTipR2.mirror = true;
        this.WingTipR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR2, 0.0F, 0.0F, 0.19198621771937624F);
        this.Wing1Left = new BookwormModelRenderer(this, 23, 22, "Wing1Left");
        this.Wing1Left.setRotationPoint(2.0F, -2.5F, 1.0F);
        this.Wing1Left.addBox(0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        this.WingTipR3A = new BookwormModelRenderer(this, 28, 15, "WingTipR3A");
        this.WingTipR3A.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WingTipR3A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR3A, 0.0F, 0.0F, -0.091106186954104F);
        this.WingTipR1A = new BookwormModelRenderer(this, 28, 15, "WingTipR1A");
        this.WingTipR1A.setRotationPoint(4.0F, 1.4F, -0.9F);
        this.WingTipR1A.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(WingTipR1A, 0.0F, 0.0F, 0.6373942428283291F);
        this.Toe3L = new BookwormModelRenderer(this, 33, 19, "Toe3L");
        this.Toe3L.setRotationPoint(0.0F, 0.3F, 0.2F);
        this.Toe3L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(Toe3L, -0.045553093477052F, 0.045553093477052F, 0.0F);
        this.TailFeather2R = new BookwormModelRenderer(this, 28, 0, "TailFeather2R");
        this.TailFeather2R.mirror = true;
        this.TailFeather2R.setRotationPoint(-0.1F, -0.3F, -0.1F);
        this.TailFeather2R.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.setRotateAngle(TailFeather2R, 0.0F, 0.0F, 0.045553093477052F);
        this.TailFeatherCenter = new BookwormModelRenderer(this, 34, 0, "TailFeatherCenter");
        this.TailFeatherCenter.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TailFeatherCenter.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
        this.WingTipR3A.addChild(this.WingTipR4A);
        this.Beak.addChild(this.Jaw);
        this.Wing3Right.addChild(this.WingTipR1);
        this.FootRight.addChild(this.Toe1R);
        this.TailFeather2L.addChild(this.TailFeather3L);
        this.WingTipR1A.addChild(this.WingTipR2A);
        this.Beak.addChild(this.BeakTip);
        this.LegRight.addChild(this.FootRight);
        this.WingTipR5A.addChild(this.WingTipR6A);
        this.WingTipR3.addChild(this.WingTipR4);
        this.FootLeft.addChild(this.Toe1L);
        this.Body.addChild(this.LegLeft);
        this.Head.addChild(this.Beak);
        this.FootRight.addChild(this.Toe3R);
        this.TailBase.addChild(this.Tail);
        this.WingTipR2.addChild(this.WingTipR3);
        this.LegLeft.addChild(this.FootLeft);
        this.Body.addChild(this.Neck);
        this.WingTipL2.addChild(this.WingTipL3);
        this.WingFoldedLeft.addChild(this.WingTipL1A);
        this.Wing2Right.addChild(this.Wing3Right);
        this.Body.addChild(this.TailBase);
        this.Wing1Right.addChild(this.Wing2Right);
        this.WingTipL2A.addChild(this.WingTipL3A);
        this.WingTipL4.addChild(this.WingTipL5);
        this.WingTipR4.addChild(this.WingTipL5_1);
        this.WingTipL1A.addChild(this.WingTipL2A);
        this.WingTipL3.addChild(this.WingTipL4);
        this.Wing1Left.addChild(this.Wing2Left);
        this.FootLeft.addChild(this.Toe2L);
        this.WingTipL5A.addChild(this.WingTipL6A);
        this.WingTipL5_1.addChild(this.WingTipL6_1);
        this.LegRight.addChild(this.ThighRight);
        this.WingTipL4A.addChild(this.WingTipL5A);
        this.Neck.addChild(this.Head);
        this.TailFeather2R.addChild(this.TailFeather3R);
        this.Body.addChild(this.Wing1Right);
        this.Body.addChild(this.WingFoldedRight);
        this.Body.addChild(this.WingFoldedLeft);
        this.WingTipL3A.addChild(this.WingTipL4A);
        this.Head.addChild(this.Forehead);
        this.TailFeatherCenter.addChild(this.TailFeather1R);
        this.LegLeft.addChild(this.ThighLeft);
        this.Body.addChild(this.LegRight);
        this.TailFeatherCenter.addChild(this.TailFeather1L);
        this.WingTipL5.addChild(this.WingTipL6);
        this.Wing2Left.addChild(this.Wing3Left);
        this.Wing3Left.addChild(this.WingTipL1);
        this.TailFeather1L.addChild(this.TailFeather2L);
        this.WingTipL1.addChild(this.WingTipL2);
        this.WingTipR4A.addChild(this.WingTipR5A);
        this.FootRight.addChild(this.Toe2R);
        this.WingTipR1.addChild(this.WingTipR2);
        this.Body.addChild(this.Wing1Left);
        this.WingTipR2A.addChild(this.WingTipR3A);
        this.WingFoldedRight.addChild(this.WingTipR1A);
        this.FootLeft.addChild(this.Toe3L);
        this.TailFeather1R.addChild(this.TailFeather2R);
        this.Tail.addChild(this.TailFeatherCenter);
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
