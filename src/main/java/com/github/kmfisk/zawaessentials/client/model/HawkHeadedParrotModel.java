package com.github.kmfisk.zawaessentials.client.model;

import com.github.kmfisk.zawaessentials.entity.HawkHeadedParrotEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class HawkHeadedParrotModel extends ZawaBaseModel<HawkHeadedParrotEntity> {
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer Head;
    public ModelRenderer TailBase;
    public ModelRenderer LegLeft;
    public ModelRenderer LegRight;
    public ModelRenderer Forehead;
    public ModelRenderer Beak;
    public ModelRenderer Crown1;
    public ModelRenderer Crown2L;
    public ModelRenderer Crown3L;
    public ModelRenderer Crown4L;
    public ModelRenderer Crown2R;
    public ModelRenderer Crown3R;
    public ModelRenderer Crown4R;
    public ModelRenderer BeakTip;
    public ModelRenderer Jaw;
    public ModelRenderer Tail;
    public ModelRenderer TailFeatherCenter;
    public ModelRenderer TailFeather1L;
    public ModelRenderer TailFeather1R;
    public ModelRenderer TailFeather2L;
    public ModelRenderer TailFeather3L;
    public ModelRenderer TailFeather2R;
    public ModelRenderer TailFeather3R;
    public ModelRenderer ThighLeft;
    public ModelRenderer FootLeft;
    public ModelRenderer Toe1L;
    public ModelRenderer Toe2L;
    public ModelRenderer Toe3L;
    public ModelRenderer ThighRight;
    public ModelRenderer FootRight;
    public ModelRenderer Toe1R;
    public ModelRenderer Toe2R;
    public ModelRenderer Toe3R;
    private Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public static class Flying extends HawkHeadedParrotModel {
        public ModelRenderer Wing1Left;
        public ModelRenderer Wing1Right;
        public ModelRenderer Wing2Left;
        public ModelRenderer Wing3Left;
        public ModelRenderer WingTipL1;
        public ModelRenderer WingTipL2;
        public ModelRenderer WingTipL3;
        public ModelRenderer WingTipL4;
        public ModelRenderer WingTipL5;
        public ModelRenderer WingTipL6;
        public ModelRenderer Wing2Right;
        public ModelRenderer Wing3Right;
        public ModelRenderer WingTipR1;
        public ModelRenderer WingTipR2;
        public ModelRenderer WingTipR3;
        public ModelRenderer WingTipR4;
        public ModelRenderer WingTipL5_1;
        public ModelRenderer WingTipL6_1;

        public Flying() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.WingTipR3 = new ModelRenderer(this, 28, 15);
            this.WingTipR3.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipR3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
            this.setRotateAngle(WingTipR3, 0.0F, 0.0F, 0.19198621771937624F);
            this.FootRight = new ModelRenderer(this, 32, 18);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 1.5F, 0.0F);
            this.FootRight.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
            this.setRotateAngle(FootRight, 1.9577358219620393F, -0.18203784098300857F, 0.0F);
            this.Crown1 = new ModelRenderer(this, 41, 0);
            this.Crown1.setPos(0.0F, -2.5F, 0.7F);
            this.Crown1.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Crown1, -0.5009094953223726F, 0.0F, 0.0F);
            this.Crown3L = new ModelRenderer(this, 41, 0);
            this.Crown3L.setPos(0.7F, -1.4F, 0.8F);
            this.Crown3L.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Crown3L, -0.5918411493512771F, 0.18203784098300857F, 0.0F);
            this.Wing2Right = new ModelRenderer(this, 29, 22);
            this.Wing2Right.mirror = true;
            this.Wing2Right.setPos(-2.0F, 5.01F, -0.01F);
            this.Wing2Right.addBox(-2.0F, -5.0F, 0.0F, 2, 5, 1, 0.0F);
            this.setRotateAngle(Wing2Right, 0.0F, 0.0F, 0.22759093446006054F);
            this.WingTipL5_1 = new ModelRenderer(this, 28, 15);
            this.WingTipL5_1.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipL5_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
            this.setRotateAngle(WingTipL5_1, 0.0F, 0.0F, 0.19198621771937624F);
            this.Wing3Left = new ModelRenderer(this, 35, 22);
            this.Wing3Left.setPos(2.0F, -5.0F, -0.01F);
            this.Wing3Left.addBox(0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F);
            this.setRotateAngle(Wing3Left, 0.0F, 0.0F, 0.18203784098300857F);
            this.WingTipR2 = new ModelRenderer(this, 28, 15);
            this.WingTipR2.mirror = true;
            this.WingTipR2.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipR2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
            this.setRotateAngle(WingTipR2, 0.0F, 0.0F, 0.19198621771937624F);
            this.Forehead = new ModelRenderer(this, 14, 11);
            this.Forehead.setPos(0.0F, -2.7F, 0.9F);
            this.Forehead.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
            this.setRotateAngle(Forehead, 0.017453292519943295F, 0.0F, 0.0F);
            this.Crown2L = new ModelRenderer(this, 41, 0);
            this.Crown2L.setPos(0.7F, -2.0F, 0.8F);
            this.Crown2L.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Crown2L, -0.4553564018453205F, 0.136659280431156F, 0.27314402793711257F);
            this.Crown3R = new ModelRenderer(this, 41, 0);
            this.Crown3R.setPos(-0.7F, -1.4F, 0.8F);
            this.Crown3R.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Crown3R, -0.5918411493512771F, -0.18203784098300857F, 0.0F);
            this.TailFeather1R = new ModelRenderer(this, 28, 0);
            this.TailFeather1R.mirror = true;
            this.TailFeather1R.setPos(-0.8F, -0.1F, -0.1F);
            this.TailFeather1R.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
            this.setRotateAngle(TailFeather1R, 0.0F, 0.0F, 0.136659280431156F);
            this.Wing1Left = new ModelRenderer(this, 23, 22);
            this.Wing1Left.setPos(2.0F, -2.5F, 1.0F);
            this.Wing1Left.addBox(0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
            this.LegLeft = new ModelRenderer(this, 0, 0);
            this.LegLeft.setPos(1.3F, 1.1F, -2.3F);
            this.LegLeft.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
            this.setRotateAngle(LegLeft, -3.0049333731586367F, 0.0F, -0.27314402793711257F);
            this.WingTipL3 = new ModelRenderer(this, 28, 15);
            this.WingTipL3.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipL3.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
            this.setRotateAngle(WingTipL3, 0.0F, 0.0F, -0.19198621771937624F);
            this.WingTipL6 = new ModelRenderer(this, 28, 15);
            this.WingTipL6.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipL6.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
            this.setRotateAngle(WingTipL6, 0.0F, 0.0F, -0.19198621771937624F);
            this.TailBase = new ModelRenderer(this, 33, 11);
            this.TailBase.setPos(0.0F, 2.5F, -0.2F);
            this.TailBase.addBox(-2.0F, -1.0F, -1.5F, 4, 4, 3, 0.0F);
            this.setRotateAngle(TailBase, -0.045553093477052F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 24, 6);
            this.ThighLeft.setPos(0.0F, -0.7F, 0.8F);
            this.ThighLeft.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(ThighLeft, 1.6390387005478748F, 0.0F, -0.27314402793711257F);
            this.TailFeather1L = new ModelRenderer(this, 28, 0);
            this.TailFeather1L.setPos(0.8F, -0.1F, -0.1F);
            this.TailFeather1L.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
            this.setRotateAngle(TailFeather1L, 0.0F, 0.0F, -0.136659280431156F);
            this.Toe2R = new ModelRenderer(this, 32, 18);
            this.Toe2R.mirror = true;
            this.Toe2R.setPos(0.2F, 0.1F, 0.2F);
            this.Toe2R.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe2R, -2.5953045977155678F, 0.6373942428283291F, 0.0F);
            this.WingTipR4 = new ModelRenderer(this, 28, 15);
            this.WingTipR4.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipR4.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
            this.setRotateAngle(WingTipR4, 0.0F, 0.0F, 0.19198621771937624F);
            this.WingTipL1 = new ModelRenderer(this, 28, 15);
            this.WingTipL1.setPos(3.0F, 0.0F, -0.01F);
            this.WingTipL1.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
            this.setRotateAngle(WingTipL1, 0.0F, 0.0F, -0.19198621771937624F);
            this.Toe1L = new ModelRenderer(this, 32, 18);
            this.Toe1L.setPos(0.0F, 0.2F, 0.2F);
            this.Toe1L.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe1L, -0.091106186954104F, -0.36425021489121656F, 0.045553093477052F);
            this.Wing2Left = new ModelRenderer(this, 29, 22);
            this.Wing2Left.setPos(2.0F, 5.0F, -0.01F);
            this.Wing2Left.addBox(0.0F, -5.0F, 0.0F, 2, 5, 1, 0.0F);
            this.setRotateAngle(Wing2Left, 0.0F, 0.0F, -0.22759093446006054F);
            this.FootLeft = new ModelRenderer(this, 32, 18);
            this.FootLeft.setPos(0.0F, 1.5F, 0.0F);
            this.FootLeft.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
            this.setRotateAngle(FootLeft, 1.9577358219620393F, 0.18203784098300857F, 0.0F);
            this.Toe1R = new ModelRenderer(this, 32, 18);
            this.Toe1R.mirror = true;
            this.Toe1R.setPos(0.0F, 0.2F, 0.2F);
            this.Toe1R.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe1R, -0.091106186954104F, 0.36425021489121656F, -0.045553093477052F);
            this.Head = new ModelRenderer(this, 0, 19);
            this.Head.setPos(0.0F, -1.7F, 0.3F);
            this.Head.addBox(-2.0F, -2.0F, -2.5F, 4, 4, 4, 0.0F);
            this.setRotateAngle(Head, -0.8651597102135892F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 24, 6);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(0.0F, -0.7F, 0.8F);
            this.ThighRight.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(ThighRight, 1.6390387005478748F, 0.0F, 0.27314402793711257F);
            this.WingTipL2 = new ModelRenderer(this, 28, 15);
            this.WingTipL2.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipL2.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
            this.setRotateAngle(WingTipL2, 0.0F, 0.0F, -0.19198621771937624F);
            this.TailFeatherCenter = new ModelRenderer(this, 34, 0);
            this.TailFeatherCenter.setPos(0.0F, 0.0F, 0.0F);
            this.TailFeatherCenter.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
            this.WingTipL6_1 = new ModelRenderer(this, 28, 15);
            this.WingTipL6_1.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipL6_1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
            this.setRotateAngle(WingTipL6_1, 0.0F, 0.0F, 0.19198621771937624F);
            this.WingTipL5 = new ModelRenderer(this, 28, 15);
            this.WingTipL5.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipL5.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
            this.setRotateAngle(WingTipL5, 0.0F, 0.0F, -0.19198621771937624F);
            this.Tail = new ModelRenderer(this, 47, 15);
            this.Tail.setPos(0.0F, 3.0F, 0.0F);
            this.Tail.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
            this.Wing3Right = new ModelRenderer(this, 35, 22);
            this.Wing3Right.mirror = true;
            this.Wing3Right.setPos(-2.0F, -5.0F, -0.01F);
            this.Wing3Right.addBox(-3.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F);
            this.setRotateAngle(Wing3Right, 0.0F, 0.0F, -0.18203784098300857F);
            this.TailFeather2L = new ModelRenderer(this, 28, 0);
            this.TailFeather2L.setPos(0.1F, -0.3F, -0.1F);
            this.TailFeather2L.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
            this.setRotateAngle(TailFeather2L, 0.0F, 0.0F, -0.136659280431156F);
            this.Toe3R = new ModelRenderer(this, 33, 19);
            this.Toe3R.mirror = true;
            this.Toe3R.setPos(0.0F, 0.3F, 0.2F);
            this.Toe3R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(Toe3R, -3.096039560112741F, -0.045553093477052F, 0.0F);
            this.Crown2R = new ModelRenderer(this, 41, 0);
            this.Crown2R.mirror = true;
            this.Crown2R.setPos(-0.7F, -2.0F, 0.8F);
            this.Crown2R.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Crown2R, -0.4553564018453205F, -0.136659280431156F, -0.27314402793711257F);
            this.TailFeather3L = new ModelRenderer(this, 28, 0);
            this.TailFeather3L.setPos(0.2F, -0.3F, -0.1F);
            this.TailFeather3L.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
            this.setRotateAngle(TailFeather3L, 0.0F, 0.0F, -0.045553093477052F);
            this.Toe3L = new ModelRenderer(this, 33, 19);
            this.Toe3L.setPos(0.0F, 0.3F, 0.2F);
            this.Toe3L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(Toe3L, -3.096039560112741F, 0.045553093477052F, 0.0F);
            this.TailFeather2R = new ModelRenderer(this, 28, 0);
            this.TailFeather2R.mirror = true;
            this.TailFeather2R.setPos(-0.1F, -0.3F, -0.1F);
            this.TailFeather2R.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
            this.setRotateAngle(TailFeather2R, 0.0F, 0.0F, 0.136659280431156F);
            this.Beak = new ModelRenderer(this, 15, 0);
            this.Beak.setPos(0.0F, 0.8F, -2.5F);
            this.Beak.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(Beak, 0.18203784098300857F, 0.0F, 0.0F);
            this.WingTipR1 = new ModelRenderer(this, 28, 15);
            this.WingTipR1.mirror = true;
            this.WingTipR1.setPos(-3.0F, 0.0F, -0.01F);
            this.WingTipR1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
            this.setRotateAngle(WingTipR1, 0.0F, 0.0F, 0.19198621771937624F);
            this.Toe2L = new ModelRenderer(this, 32, 18);
            this.Toe2L.setPos(-0.2F, 0.1F, 0.2F);
            this.Toe2L.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe2L, -2.5953045977155678F, -0.6373942428283291F, 0.0F);
            this.LegRight = new ModelRenderer(this, 0, 0);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-1.3F, 1.1F, -2.3F);
            this.LegRight.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
            this.setRotateAngle(LegRight, -3.0049333731586367F, 0.0F, 0.27314402793711257F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 20.5F, 0.0F);
            this.Body.addBox(-2.0F, -3.0F, -2.5F, 4, 6, 5, 0.0F);
            this.setRotateAngle(Body, 1.5481070465189704F, 0.0F, 0.0F);
            this.Jaw = new ModelRenderer(this, 20, 4);
            this.Jaw.setPos(0.0F, 0.0F, 0.0F);
            this.Jaw.addBox(-0.5F, -0.25F, -1.2F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Jaw, -0.22759093446006054F, 0.0F, 0.0F);
            this.Wing1Right = new ModelRenderer(this, 23, 22);
            this.Wing1Right.mirror = true;
            this.Wing1Right.setPos(-2.0F, -2.5F, 1.01F);
            this.Wing1Right.addBox(-2.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
            this.TailFeather3R = new ModelRenderer(this, 28, 0);
            this.TailFeather3R.mirror = true;
            this.TailFeather3R.setPos(-0.2F, -0.3F, -0.1F);
            this.TailFeather3R.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
            this.setRotateAngle(TailFeather3R, 0.0F, 0.0F, 0.045553093477052F);
            this.Neck = new ModelRenderer(this, 0, 11);
            this.Neck.setPos(0.0F, -3.0F, 0.2F);
            this.Neck.addBox(-1.5F, -2.0F, -2.0F, 3, 3, 4, 0.0F);
            this.setRotateAngle(Neck, -0.36425021489121656F, 0.0F, 0.0F);
            this.Crown4L = new ModelRenderer(this, 41, 0);
            this.Crown4L.setPos(0.7F, -0.7F, 0.8F);
            this.Crown4L.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Crown4L, -0.5918411493512771F, 0.40980330836826856F, 0.0F);
            this.WingTipL4 = new ModelRenderer(this, 28, 15);
            this.WingTipL4.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipL4.addBox(-1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
            this.setRotateAngle(WingTipL4, 0.0F, 0.0F, -0.19198621771937624F);
            this.Crown4R = new ModelRenderer(this, 41, 0);
            this.Crown4R.setPos(-0.7F, -0.7F, 0.8F);
            this.Crown4R.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Crown4R, -0.5918411493512771F, -0.40980330836826856F, 0.0F);
            this.BeakTip = new ModelRenderer(this, 23, 0);
            this.BeakTip.setPos(0.0F, -1.5F, -1.0F);
            this.BeakTip.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
            this.WingTipR2.addChild(this.WingTipR3);
            this.LegRight.addChild(this.FootRight);
            this.Head.addChild(this.Crown1);
            this.Head.addChild(this.Crown3L);
            this.Wing1Right.addChild(this.Wing2Right);
            this.WingTipR4.addChild(this.WingTipL5_1);
            this.Wing2Left.addChild(this.Wing3Left);
            this.WingTipR1.addChild(this.WingTipR2);
            this.Head.addChild(this.Forehead);
            this.Head.addChild(this.Crown2L);
            this.Head.addChild(this.Crown3R);
            this.TailFeatherCenter.addChild(this.TailFeather1R);
            this.Body.addChild(this.Wing1Left);
            this.Body.addChild(this.LegLeft);
            this.WingTipL2.addChild(this.WingTipL3);
            this.WingTipL5.addChild(this.WingTipL6);
            this.Body.addChild(this.TailBase);
            this.LegLeft.addChild(this.ThighLeft);
            this.TailFeatherCenter.addChild(this.TailFeather1L);
            this.FootRight.addChild(this.Toe2R);
            this.WingTipR3.addChild(this.WingTipR4);
            this.Wing3Left.addChild(this.WingTipL1);
            this.FootLeft.addChild(this.Toe1L);
            this.Wing1Left.addChild(this.Wing2Left);
            this.LegLeft.addChild(this.FootLeft);
            this.FootRight.addChild(this.Toe1R);
            this.Neck.addChild(this.Head);
            this.LegRight.addChild(this.ThighRight);
            this.WingTipL1.addChild(this.WingTipL2);
            this.Tail.addChild(this.TailFeatherCenter);
            this.WingTipL5_1.addChild(this.WingTipL6_1);
            this.WingTipL4.addChild(this.WingTipL5);
            this.TailBase.addChild(this.Tail);
            this.Wing2Right.addChild(this.Wing3Right);
            this.TailFeather1L.addChild(this.TailFeather2L);
            this.FootRight.addChild(this.Toe3R);
            this.Head.addChild(this.Crown2R);
            this.TailFeather2L.addChild(this.TailFeather3L);
            this.FootLeft.addChild(this.Toe3L);
            this.TailFeather1R.addChild(this.TailFeather2R);
            this.Head.addChild(this.Beak);
            this.Wing3Right.addChild(this.WingTipR1);
            this.FootLeft.addChild(this.Toe2L);
            this.Body.addChild(this.LegRight);
            this.Beak.addChild(this.Jaw);
            this.Body.addChild(this.Wing1Right);
            this.TailFeather2R.addChild(this.TailFeather3R);
            this.Body.addChild(this.Neck);
            this.Head.addChild(this.Crown4L);
            this.WingTipL3.addChild(this.WingTipL4);
            this.Head.addChild(this.Crown4R);
            this.Beak.addChild(this.BeakTip);
            this.saveBase();
        }

        @Override
        public void setupAnim(HawkHeadedParrotEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + -0.87F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Wing1Left.yRot = MathHelper.cos((limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 3.0F) * limbSwingAmount * 0.5F;
            this.Wing2Left.zRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 0.5F) * limbSwingAmount * 0.5F + -0.2F;
            this.Wing1Right.yRot = MathHelper.cos((limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * -3.0F) * limbSwingAmount * 0.5F;
            this.Wing2Right.zRot = MathHelper.cos((limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * -0.5F) * limbSwingAmount * 0.5F + 0.2F;
            this.Body.xRot = MathHelper.cos((limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 0.05F) * limbSwingAmount * 0.5F + 1.55F;
            this.Neck.xRot = MathHelper.cos((limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F + -0.36F;
            this.TailBase.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * -0.1F) * limbSwingAmount * 0.5F + -0.2F;
            this.Head.xRot = MathHelper.cos(4.0F + (limbSwing * speed * 0.5F) + (float) Math.PI) * (degree * 0.05F) * limbSwingAmount * 0.5F + -0.87F;
        }
    }

    public static class Adult extends HawkHeadedParrotModel {
        public ModelRenderer WingFoldedLeft;
        public ModelRenderer WingFoldedRight;
        public ModelRenderer WingFoldedLeft1;
        public ModelRenderer WingFoldedRight1;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.TailFeather2R = new ModelRenderer(this, 28, 0);
            this.TailFeather2R.mirror = true;
            this.TailFeather2R.setPos(-0.1F, -0.3F, -0.1F);
            this.TailFeather2R.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
            this.setRotateAngle(TailFeather2R, 0.0F, 0.0F, 0.045553093477052F);
            this.Toe2L = new ModelRenderer(this, 32, 18);
            this.Toe2L.setPos(-0.2F, 0.1F, 0.2F);
            this.Toe2L.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe2L, -0.27314402793711257F, -0.6373942428283291F, 0.0F);
            this.TailFeather2L = new ModelRenderer(this, 28, 0);
            this.TailFeather2L.setPos(0.1F, -0.3F, -0.1F);
            this.TailFeather2L.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
            this.setRotateAngle(TailFeather2L, 0.0F, 0.0F, -0.045553093477052F);
            this.Toe1R = new ModelRenderer(this, 32, 18);
            this.Toe1R.setPos(0.0F, 0.2F, 0.2F);
            this.Toe1R.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe1R, -0.091106186954104F, 0.36425021489121656F, -0.045553093477052F);
            this.Head = new ModelRenderer(this, 0, 19);
            this.Head.setPos(0.0F, -1.8F, 0.7F);
            this.Head.addBox(-2.0F, -2.0F, -2.5F, 4, 4, 4, 0.0F);
            this.setRotateAngle(Head, -0.6373942428283291F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 32, 18);
            this.FootLeft.setPos(0.0F, 1.5F, 0.0F);
            this.FootLeft.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
            this.setRotateAngle(FootLeft, 0.136659280431156F, 0.18203784098300857F, 0.0F);
            this.BeakTip = new ModelRenderer(this, 23, 0);
            this.BeakTip.setPos(0.0F, -1.5F, -1.0F);
            this.BeakTip.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 19.3F, 0.0F);
            this.Body.addBox(-2.0F, -3.0F, -2.5F, 4, 6, 5, 0.0F);
            this.setRotateAngle(Body, 1.0927506446736497F, 0.0F, 0.0F);
            this.WingFoldedRight = new ModelRenderer(this, 44, 22);
            this.WingFoldedRight.setPos(-1.9F, -3.0F, 2.5F);
            this.WingFoldedRight.addBox(0.0F, 0.0F, -1.0F, 4, 6, 1, 0.0F);
            this.setRotateAngle(WingFoldedRight, 0.0F, 1.5707963267948966F, 0.0F);
            this.Crown4R = new ModelRenderer(this, 41, 0);
            this.Crown4R.setPos(-0.7F, -0.7F, 0.8F);
            this.Crown4R.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Crown4R, -0.5918411493512771F, -0.40980330836826856F, 0.0F);
            this.Crown3L = new ModelRenderer(this, 41, 0);
            this.Crown3L.setPos(0.7F, -1.4F, 0.8F);
            this.Crown3L.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Crown3L, -0.5918411493512771F, 0.18203784098300857F, 0.0F);
            this.TailFeather1R = new ModelRenderer(this, 28, 0);
            this.TailFeather1R.mirror = true;
            this.TailFeather1R.setPos(-0.8F, -0.1F, -0.1F);
            this.TailFeather1R.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
            this.Tail = new ModelRenderer(this, 47, 15);
            this.Tail.setPos(0.0F, 3.0F, 0.0F);
            this.Tail.addBox(-1.5F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
            this.WingFoldedLeft1 = new ModelRenderer(this, 39, 5);
            this.WingFoldedLeft1.setPos(2.0F, 6.0F, 0.3F);
            this.WingFoldedLeft1.addBox(-1.8F, -1.5F, -0.5F, 3, 4, 1, 0.0F);
            this.setRotateAngle(WingFoldedLeft1, 0.0F, 0.0F, 0.6829473363053812F);
            this.WingFoldedRight1 = new ModelRenderer(this, 39, 5);
            this.WingFoldedRight1.mirror = true;
            this.WingFoldedRight1.setPos(2.0F, 6.0F, 0.3F);
            this.WingFoldedRight1.addBox(-1.8F, -1.5F, -1.1F, 3, 4, 1, 0.0F);
            this.setRotateAngle(WingFoldedRight1, 0.0F, 0.0F, 0.6829473363053812F);
            this.Neck = new ModelRenderer(this, 0, 11);
            this.Neck.setPos(0.0F, -3.0F, 0.2F);
            this.Neck.addBox(-1.5F, -2.0F, -2.0F, 3, 3, 4, 0.0F);
            this.setRotateAngle(Neck, -0.36425021489121656F, 0.0F, 0.0F);
            this.TailFeather1L = new ModelRenderer(this, 28, 0);
            this.TailFeather1L.setPos(0.8F, -0.1F, -0.1F);
            this.TailFeather1L.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
            this.Jaw = new ModelRenderer(this, 20, 4);
            this.Jaw.setPos(0.0F, 0.0F, 0.0F);
            this.Jaw.addBox(-0.5F, -0.25F, -1.2F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Jaw, -0.22759093446006054F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 32, 18);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 1.5F, 0.0F);
            this.FootRight.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
            this.setRotateAngle(FootRight, 0.136659280431156F, -0.18203784098300857F, 0.0F);
            this.Crown4L = new ModelRenderer(this, 41, 0);
            this.Crown4L.setPos(0.7F, -0.7F, 0.8F);
            this.Crown4L.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Crown4L, -0.5918411493512771F, 0.40980330836826856F, 0.0F);
            this.Forehead = new ModelRenderer(this, 14, 11);
            this.Forehead.setPos(0.0F, -2.7F, 0.9F);
            this.Forehead.addBox(-1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F);
            this.setRotateAngle(Forehead, 0.017453292519943295F, 0.0F, 0.0F);
            this.WingFoldedLeft = new ModelRenderer(this, 44, 22);
            this.WingFoldedLeft.setPos(1.9F, -3.0F, 2.5F);
            this.WingFoldedLeft.addBox(0.0F, 0.0F, 0.0F, 4, 6, 1, 0.0F);
            this.setRotateAngle(WingFoldedLeft, 0.0F, 1.5707963267948966F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 0, 0);
            this.LegLeft.setPos(1.6F, 1.1F, -2.5F);
            this.LegLeft.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
            this.setRotateAngle(LegLeft, -1.0927506446736497F, 0.0F, 0.0F);
            this.TailFeather3L = new ModelRenderer(this, 28, 0);
            this.TailFeather3L.setPos(0.2F, -0.3F, -0.1F);
            this.TailFeather3L.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
            this.setRotateAngle(TailFeather3L, 0.0F, 0.0F, -0.045553093477052F);
            this.Toe2R = new ModelRenderer(this, 32, 18);
            this.Toe2R.mirror = true;
            this.Toe2R.setPos(0.2F, 0.1F, 0.2F);
            this.Toe2R.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe2R, -0.27314402793711257F, 0.6373942428283291F, 0.0F);
            this.Crown2L = new ModelRenderer(this, 41, 0);
            this.Crown2L.setPos(0.7F, -2.0F, 0.8F);
            this.Crown2L.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Crown2L, -0.4553564018453205F, 0.136659280431156F, 0.27314402793711257F);
            this.Toe3L = new ModelRenderer(this, 33, 19);
            this.Toe3L.setPos(0.0F, 0.3F, 0.2F);
            this.Toe3L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(Toe3L, -0.045553093477052F, 0.045553093477052F, 0.0F);
            this.Crown3R = new ModelRenderer(this, 41, 0);
            this.Crown3R.setPos(-0.7F, -1.4F, 0.8F);
            this.Crown3R.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Crown3R, -0.5918411493512771F, -0.18203784098300857F, 0.0F);
            this.Beak = new ModelRenderer(this, 15, 0);
            this.Beak.setPos(0.0F, 0.8F, -2.5F);
            this.Beak.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(Beak, 0.18203784098300857F, 0.0F, 0.0F);
            this.Crown2R = new ModelRenderer(this, 41, 0);
            this.Crown2R.mirror = true;
            this.Crown2R.setPos(-0.7F, -2.0F, 0.8F);
            this.Crown2R.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Crown2R, -0.4553564018453205F, -0.136659280431156F, -0.27314402793711257F);
            this.TailBase = new ModelRenderer(this, 33, 11);
            this.TailBase.setPos(0.0F, 2.5F, -0.2F);
            this.TailBase.addBox(-2.0F, -1.0F, -1.5F, 4, 4, 3, 0.0F);
            this.setRotateAngle(TailBase, 0.22759093446006054F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 24, 6);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(0.0F, 0.6F, 0.0F);
            this.ThighRight.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(ThighRight, 0.091106186954104F, 0.0F, 0.0F);
            this.TailFeatherCenter = new ModelRenderer(this, 34, 0);
            this.TailFeatherCenter.setPos(0.0F, 0.0F, 0.0F);
            this.TailFeatherCenter.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
            this.TailFeather3R = new ModelRenderer(this, 28, 0);
            this.TailFeather3R.mirror = true;
            this.TailFeather3R.setPos(-0.2F, -0.3F, -0.1F);
            this.TailFeather3R.addBox(-1.0F, 0.0F, -0.5F, 2, 4, 1, 0.0F);
            this.setRotateAngle(TailFeather3R, 0.0F, 0.0F, 0.045553093477052F);
            this.Crown1 = new ModelRenderer(this, 41, 0);
            this.Crown1.setPos(0.0F, -2.5F, 0.7F);
            this.Crown1.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Crown1, -0.5009094953223726F, 0.0F, 0.0F);
            this.Toe1L = new ModelRenderer(this, 32, 18);
            this.Toe1L.setPos(0.0F, 0.2F, 0.2F);
            this.Toe1L.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe1L, -0.091106186954104F, -0.36425021489121656F, 0.045553093477052F);
            this.LegRight = new ModelRenderer(this, 0, 0);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-1.6F, 1.1F, -2.5F);
            this.LegRight.addBox(-0.5F, -1.0F, -0.5F, 1, 3, 1, 0.0F);
            this.setRotateAngle(LegRight, -1.0927506446736497F, 0.0F, 0.0F);
            this.Toe3R = new ModelRenderer(this, 33, 19);
            this.Toe3R.mirror = true;
            this.Toe3R.setPos(0.0F, 0.3F, 0.2F);
            this.Toe3R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(Toe3R, -0.045553093477052F, -0.045553093477052F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 24, 6);
            this.ThighLeft.setPos(0.0F, 0.6F, 0.0F);
            this.ThighLeft.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(ThighLeft, 0.091106186954104F, 0.0F, 0.0F);
            this.TailFeather1R.addChild(this.TailFeather2R);
            this.FootLeft.addChild(this.Toe2L);
            this.TailFeather1L.addChild(this.TailFeather2L);
            this.FootRight.addChild(this.Toe1R);
            this.Neck.addChild(this.Head);
            this.LegLeft.addChild(this.FootLeft);
            this.Beak.addChild(this.BeakTip);
            this.Body.addChild(this.WingFoldedRight);
            this.Head.addChild(this.Crown4R);
            this.Head.addChild(this.Crown3L);
            this.TailFeatherCenter.addChild(this.TailFeather1R);
            this.TailBase.addChild(this.Tail);
            this.WingFoldedLeft.addChild(this.WingFoldedLeft1);
            this.WingFoldedRight.addChild(this.WingFoldedRight1);
            this.Body.addChild(this.Neck);
            this.TailFeatherCenter.addChild(this.TailFeather1L);
            this.Beak.addChild(this.Jaw);
            this.LegRight.addChild(this.FootRight);
            this.Head.addChild(this.Crown4L);
            this.Head.addChild(this.Forehead);
            this.Body.addChild(this.WingFoldedLeft);
            this.Body.addChild(this.LegLeft);
            this.TailFeather2L.addChild(this.TailFeather3L);
            this.FootRight.addChild(this.Toe2R);
            this.Head.addChild(this.Crown2L);
            this.FootLeft.addChild(this.Toe3L);
            this.Head.addChild(this.Crown3R);
            this.Head.addChild(this.Beak);
            this.Head.addChild(this.Crown2R);
            this.Body.addChild(this.TailBase);
            this.LegRight.addChild(this.ThighRight);
            this.Tail.addChild(this.TailFeatherCenter);
            this.TailFeather2R.addChild(this.TailFeather3R);
            this.Head.addChild(this.Crown1);
            this.FootLeft.addChild(this.Toe1L);
            this.Body.addChild(this.LegRight);
            this.FootRight.addChild(this.Toe3R);
            this.LegLeft.addChild(this.ThighLeft);
            this.saveBase();
        }

        @Override
        public void setupAnim(HawkHeadedParrotEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + -0.64F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.36F;
            this.TailBase.xRot = MathHelper.cos(1.0F + (limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Body.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.4F) + (float) Math.PI) * (degree * -0.05F) * limbSwingAmount * 0.5F + 0.9F;
            this.LegLeft.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.5F) * limbSwingAmount * 0.5F + -0.9F;
            this.LegRight.xRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.5F) * limbSwingAmount * 0.5F + -0.9F;
            this.FootLeft.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * -1.5F) * limbSwingAmount * 0.5F;
            this.FootRight.xRot = MathHelper.cos(2.0F + (limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 1.5F) * limbSwingAmount * 0.5F;
            this.Body.yRot = MathHelper.cos((limbSwing * speed * 0.2F) + (float) Math.PI) * (degree * 0.15F) * limbSwingAmount * 0.5F;
        }
    }

    public static class Child extends HawkHeadedParrotModel {
        public Child() {
            // TODO: Insert child model
            this.saveBase();
        }

        @Override
        public void setupAnim(HawkHeadedParrotEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.36F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
        }
    }
}
