package com.github.kmfisk.zawaessentials.client.model;

import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class ParrotBaseModel<E extends Entity> extends ZawaBaseModel<E> {
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer LegLeft;
    public ModelRenderer LegRight;
    public ModelRenderer TailBase;
    public ModelRenderer Head;
    public ModelRenderer Forehead;
    public ModelRenderer Beak;
    public ModelRenderer BeakTipL;
    public ModelRenderer Jaw;
    public ModelRenderer BeakTipL_1;
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
    public ModelRenderer Tail;
    public ModelRenderer TailFeatherCenter;
    public ModelRenderer TailFeatherL1;
    public ModelRenderer TailFeatherR1;
    public ModelRenderer TailFeatherL2;
    public ModelRenderer TailFeatherR2;
    private Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public static class Flying<E extends Entity> extends ParrotBaseModel<E> {
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
            this.Neck = new ModelRenderer(this, 0, 11);
            this.Neck.setPos(0.0F, -3.0F, 0.2F);
            this.Neck.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.3642502295386026F, 0.0F, 0.0F);
            this.WingTipL6_1 = new ModelRenderer(this, 28, 15);
            this.WingTipL6_1.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipL6_1.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTipL6_1, 0.0F, 0.0F, 0.19198621771937624F);
            this.TailFeatherL2 = new ModelRenderer(this, 33, 3);
            this.TailFeatherL2.setPos(0.1F, -0.7F, -0.1F);
            this.TailFeatherL2.addBox(-2.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherL2, 0.0F, 0.0F, -0.2549925977242591F);
            this.LegRight = new ModelRenderer(this, 0, 0);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-1.3F, 1.1F, -2.3F);
            this.LegRight.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -3.004933341200704F, 0.0F, 0.27314402127920984F);
            this.Jaw = new ModelRenderer(this, 20, 4);
            this.Jaw.setPos(0.0F, -0.1F, 0.5F);
            this.Jaw.addBox(-0.5F, -0.25F, -1.2F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 19);
            this.Head.setPos(0.0F, -1.6F, 0.4F);
            this.Head.addBox(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 4.0F, 0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.8651597048872669F, 0.0F, 0.0F);
            this.WingTipR3 = new ModelRenderer(this, 28, 15);
            this.WingTipR3.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipR3.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTipR3, 0.0F, 0.0F, 0.19198621771937624F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 20.5F, 0.0F);
            this.Body.addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.5481069932557485F, 0.0F, 0.0F);
            this.Beak = new ModelRenderer(this, 15, 0);
            this.Beak.setPos(0.0F, 0.6F, -2.7F);
            this.Beak.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.TailFeatherR2 = new ModelRenderer(this, 33, 3);
            this.TailFeatherR2.mirror = true;
            this.TailFeatherR2.setPos(-0.1F, -0.7F, -0.1F);
            this.TailFeatherR2.addBox(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherR2, 0.0F, 0.0F, 0.2549925977242591F);
            this.WingTipL3 = new ModelRenderer(this, 28, 15);
            this.WingTipL3.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipL3.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTipL3, 0.0F, 0.0F, -0.19198621771937624F);
            this.Wing3Right = new ModelRenderer(this, 35, 22);
            this.Wing3Right.mirror = true;
            this.Wing3Right.setPos(-2.0F, -5.0F, -0.01F);
            this.Wing3Right.addBox(-3.0F, 0.0F, 0.0F, 3.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing3Right, 0.0F, 0.0F, -0.18203784630933073F);
            this.LegLeft = new ModelRenderer(this, 0, 0);
            this.LegLeft.setPos(1.3F, 1.1F, -2.3F);
            this.LegLeft.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -3.004933341200704F, 0.0F, -0.27314402127920984F);
            this.Toe1R = new ModelRenderer(this, 32, 18);
            this.Toe1R.mirror = true;
            this.Toe1R.setPos(0.0F, 0.2F, 0.2F);
            this.Toe1R.addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1R, -0.0911061832922575F, 0.3642502295386026F, -0.04555309164612875F);
            this.WingTipR2 = new ModelRenderer(this, 28, 15);
            this.WingTipR2.mirror = true;
            this.WingTipR2.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipR2.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTipR2, 0.0F, 0.0F, 0.19198621771937624F);
            this.WingTipL5_1 = new ModelRenderer(this, 28, 15);
            this.WingTipL5_1.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipL5_1.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTipL5_1, 0.0F, 0.0F, 0.19198621771937624F);
            this.TailBase = new ModelRenderer(this, 33, 11);
            this.TailBase.setPos(0.0F, 2.5F, -0.2F);
            this.TailBase.addBox(-2.0F, -1.0F, -1.5F, 4.0F, 4.0F, 3.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, -0.0911061832922575F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 24, 6);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(0.0F, -0.7F, 0.8F);
            this.ThighRight.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 1.639038764463741F, 0.0F, 0.27314402127920984F);
            this.WingTipL1 = new ModelRenderer(this, 28, 15);
            this.WingTipL1.setPos(3.0F, 0.0F, -0.02F);
            this.WingTipL1.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTipL1, 0.0F, 0.0F, -0.19198621771937624F);
            this.WingTipR4 = new ModelRenderer(this, 28, 15);
            this.WingTipR4.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipR4.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTipR4, 0.0F, 0.0F, 0.19198621771937624F);
            this.WingTipL4 = new ModelRenderer(this, 28, 15);
            this.WingTipL4.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipL4.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTipL4, 0.0F, 0.0F, -0.19198621771937624F);
            this.Toe1L = new ModelRenderer(this, 32, 18);
            this.Toe1L.setPos(0.0F, 0.2F, 0.2F);
            this.Toe1L.addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1L, -0.0911061832922575F, -0.3642502295386026F, 0.04555309164612875F);
            this.TailFeatherR1 = new ModelRenderer(this, 33, 3);
            this.TailFeatherR1.mirror = true;
            this.TailFeatherR1.setPos(-1.9F, -2.9F, -0.7F);
            this.TailFeatherR1.addBox(0.0F, 0.0F, 0.0F, 2.0F, 7.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherR1, 0.0F, 0.0F, 0.07661995183228511F);
            this.Wing3Left = new ModelRenderer(this, 35, 22);
            this.Wing3Left.setPos(2.0F, -5.0F, -0.01F);
            this.Wing3Left.addBox(0.0F, 0.0F, 0.0F, 3.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing3Left, 0.0F, 0.0F, 0.18203784630933073F);
            this.TailFeatherCenter = new ModelRenderer(this, 16, 22);
            this.TailFeatherCenter.setPos(0.0F, 1.7F, 0.2F);
            this.TailFeatherCenter.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Toe2R = new ModelRenderer(this, 32, 18);
            this.Toe2R.mirror = true;
            this.Toe2R.setPos(0.2F, 0.1F, 0.2F);
            this.Toe2R.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2R, -2.5953045444523464F, 0.6373942508178124F, 0.0F);
            this.FootRight = new ModelRenderer(this, 32, 18);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 1.5F, 0.0F);
            this.FootRight.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 1.9577357900041064F, -0.18203784630933073F, 0.0F);
            this.Toe3R = new ModelRenderer(this, 33, 19);
            this.Toe3R.mirror = true;
            this.Toe3R.setPos(0.0F, 0.3F, 0.2F);
            this.Toe3R.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3R, -3.0960395494600967F, -0.04555309164612875F, 0.0F);
            this.Wing2Left = new ModelRenderer(this, 29, 22);
            this.Wing2Left.setPos(2.0F, 5.0F, -0.01F);
            this.Wing2Left.addBox(0.0F, -5.0F, 0.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Left, 0.0F, 0.0F, -0.2275909337942703F);
            this.WingTipL6 = new ModelRenderer(this, 28, 15);
            this.WingTipL6.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipL6.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTipL6, 0.0F, 0.0F, -0.19198621771937624F);
            this.FootLeft = new ModelRenderer(this, 32, 18);
            this.FootLeft.setPos(0.0F, 1.5F, 0.0F);
            this.FootLeft.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 1.9577357900041064F, 0.18203784630933073F, 0.0F);
            this.Toe2L = new ModelRenderer(this, 32, 18);
            this.Toe2L.setPos(-0.2F, 0.1F, 0.2F);
            this.Toe2L.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2L, -2.5953045444523464F, -0.6373942508178124F, 0.0F);
            this.WingTipL5 = new ModelRenderer(this, 28, 15);
            this.WingTipL5.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipL5.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTipL5, 0.0F, 0.0F, -0.19198621771937624F);
            this.WingTipR1 = new ModelRenderer(this, 28, 15);
            this.WingTipR1.mirror = true;
            this.WingTipR1.setPos(-3.0F, 0.0F, -0.02F);
            this.WingTipR1.addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTipR1, 0.0F, 0.0F, 0.19198621771937624F);
            this.Forehead = new ModelRenderer(this, 14, 11);
            this.Forehead.setPos(0.0F, -2.8F, 0.9F);
            this.Forehead.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.BeakTipL = new ModelRenderer(this, 23, 0);
            this.BeakTipL.setPos(0.0F, -1.6F, -1.1F);
            this.BeakTipL.addBox(-0.4F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Wing1Left = new ModelRenderer(this, 23, 22);
            this.Wing1Left.setPos(2.0F, -2.5F, 1.0F);
            this.Wing1Left.addBox(0.0F, 0.0F, 0.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 14, 17);
            this.Tail.setPos(0.0F, 4.0F, 0.0F);
            this.Tail.addBox(-1.5F, -1.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, -0.04555309164612875F, 0.0F, 0.0F);
            this.Wing1Right = new ModelRenderer(this, 23, 22);
            this.Wing1Right.mirror = true;
            this.Wing1Right.setPos(-2.0F, -2.5F, 1.0F);
            this.Wing1Right.addBox(-2.0F, 0.0F, 0.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.BeakTipL_1 = new ModelRenderer(this, 23, 0);
            this.BeakTipL_1.setPos(0.0F, 0.0F, 0.0F);
            this.BeakTipL_1.addBox(-0.6F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 24, 6);
            this.ThighLeft.setPos(0.0F, -0.7F, 0.8F);
            this.ThighLeft.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 1.639038764463741F, 0.0F, -0.27314402127920984F);
            this.Wing2Right = new ModelRenderer(this, 29, 22);
            this.Wing2Right.mirror = true;
            this.Wing2Right.setPos(-2.0F, 5.0F, -0.01F);
            this.Wing2Right.addBox(-2.0F, -5.0F, 0.0F, 2.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Right, 0.0F, 0.0F, 0.2275909337942703F);
            this.Toe3L = new ModelRenderer(this, 33, 19);
            this.Toe3L.setPos(0.0F, 0.3F, 0.2F);
            this.Toe3L.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3L, -3.0960395494600967F, 0.04555309164612875F, 0.0F);
            this.WingTipL2 = new ModelRenderer(this, 28, 15);
            this.WingTipL2.setPos(0.0F, 0.0F, 0.0F);
            this.WingTipL2.addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTipL2, 0.0F, 0.0F, -0.19198621771937624F);
            this.TailFeatherL1 = new ModelRenderer(this, 33, 3);
            this.TailFeatherL1.setPos(1.9F, -2.9F, -0.7F);
            this.TailFeatherL1.addBox(-2.0F, 0.0F, 0.0F, 2.0F, 7.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherL1, 0.0F, 0.04555309164612875F, -0.07661995183228511F);
            this.Body.addChild(this.Neck);
            this.WingTipL5_1.addChild(this.WingTipL6_1);
            this.TailFeatherL1.addChild(this.TailFeatherL2);
            this.Body.addChild(this.LegRight);
            this.Beak.addChild(this.Jaw);
            this.Neck.addChild(this.Head);
            this.WingTipR2.addChild(this.WingTipR3);
            this.Head.addChild(this.Beak);
            this.TailFeatherR1.addChild(this.TailFeatherR2);
            this.WingTipL2.addChild(this.WingTipL3);
            this.Wing2Right.addChild(this.Wing3Right);
            this.Body.addChild(this.LegLeft);
            this.FootRight.addChild(this.Toe1R);
            this.WingTipR1.addChild(this.WingTipR2);
            this.WingTipR4.addChild(this.WingTipL5_1);
            this.Body.addChild(this.TailBase);
            this.LegRight.addChild(this.ThighRight);
            this.Wing3Left.addChild(this.WingTipL1);
            this.WingTipR3.addChild(this.WingTipR4);
            this.WingTipL3.addChild(this.WingTipL4);
            this.FootLeft.addChild(this.Toe1L);
            this.TailFeatherCenter.addChild(this.TailFeatherR1);
            this.Wing2Left.addChild(this.Wing3Left);
            this.Tail.addChild(this.TailFeatherCenter);
            this.FootRight.addChild(this.Toe2R);
            this.LegRight.addChild(this.FootRight);
            this.FootRight.addChild(this.Toe3R);
            this.Wing1Left.addChild(this.Wing2Left);
            this.WingTipL5.addChild(this.WingTipL6);
            this.LegLeft.addChild(this.FootLeft);
            this.FootLeft.addChild(this.Toe2L);
            this.WingTipL4.addChild(this.WingTipL5);
            this.Wing3Right.addChild(this.WingTipR1);
            this.Head.addChild(this.Forehead);
            this.Beak.addChild(this.BeakTipL);
            this.Body.addChild(this.Wing1Left);
            this.TailBase.addChild(this.Tail);
            this.Body.addChild(this.Wing1Right);
            this.BeakTipL.addChild(this.BeakTipL_1);
            this.LegLeft.addChild(this.ThighLeft);
            this.Wing1Right.addChild(this.Wing2Right);
            this.FootLeft.addChild(this.Toe3L);
            this.WingTipL1.addChild(this.WingTipL2);
            this.TailFeatherCenter.addChild(this.TailFeatherL1);
            this.saveBase();
        }

        @Override
        public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
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

    public static class Adult<E extends Entity> extends ParrotBaseModel<E> {
        public ModelRenderer WingFoldedLeft;
        public ModelRenderer WingFoldedRight;
        public ModelRenderer WingFoldedLeft1;
        public ModelRenderer WingFoldedRight1;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.ThighLeft = new ModelRenderer(this, 24, 6);
            this.ThighLeft.setPos(0.0F, 0.6F, 0.0F);
            this.ThighLeft.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.0911061832922575F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 19);
            this.Head.setPos(0.0F, -1.8F, 0.4F);
            this.Head.addBox(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 4.0F, 0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.45535640450848164F, 0.0F, 0.0F);
            this.Jaw = new ModelRenderer(this, 20, 4);
            this.Jaw.setPos(0.0F, -0.1F, 0.5F);
            this.Jaw.addBox(-0.5F, -0.25F, -1.2F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Toe3R = new ModelRenderer(this, 33, 19);
            this.Toe3R.mirror = true;
            this.Toe3R.setPos(0.0F, 0.3F, 0.2F);
            this.Toe3R.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3R, -0.04555309164612875F, -0.04555309164612875F, 0.0F);
            this.Toe1R = new ModelRenderer(this, 32, 18);
            this.Toe1R.setPos(0.0F, 0.2F, 0.2F);
            this.Toe1R.addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1R, -0.0911061832922575F, 0.3642502295386026F, -0.04555309164612875F);
            this.BeakTipL_1 = new ModelRenderer(this, 23, 0);
            this.BeakTipL_1.setPos(0.0F, 0.0F, 0.0F);
            this.BeakTipL_1.addBox(-0.6F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 14, 17);
            this.Tail.setPos(0.0F, 4.0F, 0.0F);
            this.Tail.addBox(-1.5F, -1.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 11);
            this.Neck.setPos(0.0F, -3.0F, 0.2F);
            this.Neck.addBox(-1.5F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.3642502295386026F, 0.0F, 0.0F);
            this.WingFoldedLeft = new ModelRenderer(this, 44, 22);
            this.WingFoldedLeft.setPos(1.9F, -3.0F, 2.5F);
            this.WingFoldedLeft.addBox(0.0F, 0.0F, 0.0F, 4.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFoldedLeft, 0.0F, 1.5707963267948966F, 0.0F);
            this.TailFeatherL1 = new ModelRenderer(this, 33, 3);
            this.TailFeatherL1.setPos(1.9F, -2.9F, -0.7F);
            this.TailFeatherL1.addBox(-2.0F, 0.0F, 0.0F, 2.0F, 7.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherL1, 0.0F, 0.04555309164612875F, 0.04555309164612875F);
            this.LegRight = new ModelRenderer(this, 0, 0);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-1.6F, 1.1F, -2.5F);
            this.LegRight.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.8651597048872669F, 0.0F, 0.0F);
            this.Forehead = new ModelRenderer(this, 14, 11);
            this.Forehead.setPos(0.0F, -2.8F, 0.9F);
            this.Forehead.addBox(-1.5F, 0.0F, -4.0F, 3.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Toe3L = new ModelRenderer(this, 33, 19);
            this.Toe3L.setPos(0.0F, 0.3F, 0.2F);
            this.Toe3L.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe3L, -0.04555309164612875F, 0.04555309164612875F, 0.0F);
            this.TailFeatherCenter = new ModelRenderer(this, 16, 22);
            this.TailFeatherCenter.setPos(0.0F, 1.7F, 0.0F);
            this.TailFeatherCenter.addBox(-1.0F, 0.0F, -0.5F, 2.0F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.WingFoldedLeft1 = new ModelRenderer(this, 39, 5);
            this.WingFoldedLeft1.setPos(2.0F, 6.0F, 0.3F);
            this.WingFoldedLeft1.addBox(-1.8F, -1.5F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFoldedLeft1, 0.0F, 0.0F, 0.6829473549475088F);
            this.ThighRight = new ModelRenderer(this, 24, 6);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(0.0F, 0.6F, 0.0F);
            this.ThighRight.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.TailFeatherR1 = new ModelRenderer(this, 33, 3);
            this.TailFeatherR1.mirror = true;
            this.TailFeatherR1.setPos(-1.9F, -2.9F, -0.7F);
            this.TailFeatherR1.addBox(0.0F, 0.0F, 0.0F, 2.0F, 7.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherR1, 0.0F, 0.0F, -0.04555309164612875F);
            this.BeakTipL = new ModelRenderer(this, 23, 0);
            this.BeakTipL.setPos(0.0F, -1.6F, -1.1F);
            this.BeakTipL.addBox(-0.4F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.TailFeatherR2 = new ModelRenderer(this, 33, 3);
            this.TailFeatherR2.mirror = true;
            this.TailFeatherR2.setPos(-0.1F, -0.7F, -0.1F);
            this.TailFeatherR2.addBox(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherR2, 0.0F, 0.0F, 0.04555309164612875F);
            this.WingFoldedRight1 = new ModelRenderer(this, 39, 5);
            this.WingFoldedRight1.mirror = true;
            this.WingFoldedRight1.setPos(2.0F, 6.0F, 0.3F);
            this.WingFoldedRight1.addBox(-1.8F, -1.5F, -1.1F, 3.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFoldedRight1, 0.0F, 0.0F, 0.6829473549475088F);
            this.FootLeft = new ModelRenderer(this, 32, 18);
            this.FootLeft.setPos(0.0F, 1.5F, 0.0F);
            this.FootLeft.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.13665927909957545F, 0.18203784630933073F, 0.0F);
            this.TailFeatherL2 = new ModelRenderer(this, 33, 3);
            this.TailFeatherL2.setPos(0.1F, -0.7F, -0.1F);
            this.TailFeatherL2.addBox(-2.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherL2, 0.0F, 0.0F, -0.04555309164612875F);
            this.TailBase = new ModelRenderer(this, 33, 11);
            this.TailBase.setPos(0.0F, 2.5F, -0.2F);
            this.TailBase.addBox(-2.0F, -1.0F, -1.5F, 4.0F, 4.0F, 3.0F, -0.01F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.5462880425584197F, 0.0F, 0.0F);
            this.WingFoldedRight = new ModelRenderer(this, 44, 22);
            this.WingFoldedRight.setPos(-1.9F, -3.0F, 2.5F);
            this.WingFoldedRight.addBox(0.0F, 0.0F, -1.0F, 4.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFoldedRight, 0.0F, 1.5707963267948966F, 0.0F);
            this.Toe1L = new ModelRenderer(this, 32, 18);
            this.Toe1L.setPos(0.0F, 0.2F, 0.2F);
            this.Toe1L.addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe1L, -0.0911061832922575F, -0.3642502295386026F, 0.04555309164612875F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 19.4F, 0.0F);
            this.Body.addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.8651597048872669F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 0, 0);
            this.LegLeft.setPos(1.6F, 1.1F, -2.5F);
            this.LegLeft.addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.8651597048872669F, 0.0F, 0.0F);
            this.Toe2L = new ModelRenderer(this, 32, 18);
            this.Toe2L.setPos(-0.2F, 0.1F, 0.2F);
            this.Toe2L.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2L, -0.27314402127920984F, -0.6373942508178124F, 0.0F);
            this.Toe2R = new ModelRenderer(this, 32, 18);
            this.Toe2R.mirror = true;
            this.Toe2R.setPos(0.2F, 0.1F, 0.2F);
            this.Toe2R.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Toe2R, -0.27314402127920984F, 0.6373942508178124F, 0.0F);
            this.Beak = new ModelRenderer(this, 15, 0);
            this.Beak.setPos(0.0F, 0.6F, -2.7F);
            this.Beak.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 32, 18);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 1.5F, 0.0F);
            this.FootRight.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.13665927909957545F, -0.18203784630933073F, 0.0F);
            this.LegLeft.addChild(this.ThighLeft);
            this.Neck.addChild(this.Head);
            this.Beak.addChild(this.Jaw);
            this.FootRight.addChild(this.Toe3R);
            this.FootRight.addChild(this.Toe1R);
            this.BeakTipL.addChild(this.BeakTipL_1);
            this.TailBase.addChild(this.Tail);
            this.Body.addChild(this.Neck);
            this.Body.addChild(this.WingFoldedLeft);
            this.TailFeatherCenter.addChild(this.TailFeatherL1);
            this.Body.addChild(this.LegRight);
            this.Head.addChild(this.Forehead);
            this.FootLeft.addChild(this.Toe3L);
            this.Tail.addChild(this.TailFeatherCenter);
            this.WingFoldedLeft.addChild(this.WingFoldedLeft1);
            this.LegRight.addChild(this.ThighRight);
            this.TailFeatherCenter.addChild(this.TailFeatherR1);
            this.Beak.addChild(this.BeakTipL);
            this.TailFeatherR1.addChild(this.TailFeatherR2);
            this.WingFoldedRight.addChild(this.WingFoldedRight1);
            this.LegLeft.addChild(this.FootLeft);
            this.TailFeatherL1.addChild(this.TailFeatherL2);
            this.Body.addChild(this.TailBase);
            this.Body.addChild(this.WingFoldedRight);
            this.FootLeft.addChild(this.Toe1L);
            this.Body.addChild(this.LegLeft);
            this.FootLeft.addChild(this.Toe2L);
            this.FootRight.addChild(this.Toe2R);
            this.Head.addChild(this.Beak);
            this.LegRight.addChild(this.FootRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
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

    public static class Child<E extends Entity> extends ParrotBaseModel<E> {
        public Child() {
            // TODO: Insert child model
            this.saveBase();
        }

        @Override
        public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
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
