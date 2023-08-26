package com.github.kmfisk.zawaessentials.client.model;

import com.github.kmfisk.zawaessentials.entity.GreaterPrairieChickenEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;
import org.zawamod.zawa.client.model.ZawaModelRenderer;

public abstract class GreaterPrairieChickenModel extends ZawaBaseModel<GreaterPrairieChickenEntity> {
    public ZawaModelRenderer Body;
    public ZawaModelRenderer Chest;
    public ZawaModelRenderer TailBase;
    public ZawaModelRenderer Leg1Left;
    public ZawaModelRenderer Leg1Right;
    public ZawaModelRenderer Wing1Left;
    public ZawaModelRenderer Wing1Right;
    public ZawaModelRenderer Neck1;
    public ZawaModelRenderer Neck2;
    public ZawaModelRenderer BalloonL;
    public ZawaModelRenderer NeckBackL;
    public ZawaModelRenderer NeckBackR;
    public ZawaModelRenderer Head;
    public ZawaModelRenderer BeakTop;
    public ZawaModelRenderer EarTuftLeft1;
    public ZawaModelRenderer EarTuftRight1;
    public ZawaModelRenderer BeakBottom;
    public ZawaModelRenderer EarTuftLeft2;
    public ZawaModelRenderer EarTuftLeft3;
    public ZawaModelRenderer EarTuftRight2;
    public ZawaModelRenderer EarTuftRight3;
    public ZawaModelRenderer BalloonR;
    public ZawaModelRenderer BalloonTuft1;
    public ZawaModelRenderer BalloonTuft2;
    public ZawaModelRenderer BalloonTuft3;
    public ZawaModelRenderer BalloonTuft3_1;
    public ZawaModelRenderer Tail2;
    public ZawaModelRenderer TailCenter;
    public ZawaModelRenderer Tail1Left;
    public ZawaModelRenderer Tail1Right;
    public ZawaModelRenderer Tail2Left;
    public ZawaModelRenderer Tail3Left;
    public ZawaModelRenderer Tail4Left;
    public ZawaModelRenderer Tail2Right;
    public ZawaModelRenderer Tail3Right;
    public ZawaModelRenderer Tail4Right;
    public ZawaModelRenderer Leg2Left;
    public ZawaModelRenderer Toe1L;
    public ZawaModelRenderer Toe2L;
    public ZawaModelRenderer Toe3L;
    public ZawaModelRenderer Toe4L;
    public ZawaModelRenderer Leg2Right;
    public ZawaModelRenderer Toe1R;
    public ZawaModelRenderer Toe2R;
    public ZawaModelRenderer Toe3R;
    public ZawaModelRenderer Toe4R;
    public ZawaModelRenderer Wing2Left;
    public ZawaModelRenderer Wing2Left_1;
    private Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) this.parts = ImmutableList.of(this.Body);
        return this.parts;
    }

    public static class Adult extends GreaterPrairieChickenModel {
        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.Toe4R = new ZawaModelRenderer(this, 35, 4);
            this.Toe4R.mirror = true;
            this.Toe4R.setPos(0.0F, 0.0F, -0.5F);
            this.Toe4R.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(Toe4R, -0.22759093446006054F, 0.0F, 0.0F);
            this.Toe2L = new ZawaModelRenderer(this, 35, 0);
            this.Toe2L.setPos(0.3F, 0.0F, 0.0F);
            this.Toe2L.addBox(-1.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe2L, 0.091106186954104F, -0.4553564018453205F, 0.0F);
            this.TailBase = new ZawaModelRenderer(this, 0, 26);
            this.TailBase.setPos(0.0F, -2.3F, 2.3F);
            this.TailBase.addBox(-2.5F, 0.0F, -1.5F, 5, 5, 4, 0.0F);
            this.setRotateAngle(TailBase, -0.27314402793711257F, 0.0F, 0.0F);
            this.EarTuftRight2 = new ZawaModelRenderer(this, 14, 12);
            this.EarTuftRight2.mirror = true;
            this.EarTuftRight2.setPos(0.0F, 0.0F, 0.0F);
            this.EarTuftRight2.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
            this.setRotateAngle(EarTuftRight2, 0.091106186954104F, -0.045553093477052F, -0.136659280431156F);
            this.EarTuftLeft3 = new ZawaModelRenderer(this, 18, 16);
            this.EarTuftLeft3.setPos(-0.5F, 0.7F, -0.1F);
            this.EarTuftLeft3.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
            this.setRotateAngle(EarTuftLeft3, -0.22759093446006054F, -0.045553093477052F, 0.045553093477052F);
            this.Toe3R = new ZawaModelRenderer(this, 35, 0);
            this.Toe3R.mirror = true;
            this.Toe3R.setPos(-0.3F, 0.0F, 0.0F);
            this.Toe3R.addBox(0.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe3R, 0.091106186954104F, 0.4553564018453205F, 0.0F);
            this.BalloonR = new ZawaModelRenderer(this, 25, 12);
            this.BalloonR.mirror = true;
            this.BalloonR.setPos(-0.3F, 0.0F, 0.0F);
            this.BalloonR.addBox(-1.99F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
            this.Wing1Left = new ZawaModelRenderer(this, 22, 43);
            this.Wing1Left.setPos(3.0F, 0.0F, -2.75F);
            this.Wing1Left.addBox(-2.0F, -2.5F, 0.0F, 2, 5, 3, 0.0F);
            this.setRotateAngle(Wing1Left, 0.0F, 0.36425021489121656F, 0.0F);
            this.Wing1Right = new ZawaModelRenderer(this, 22, 43);
            this.Wing1Right.mirror = true;
            this.Wing1Right.setPos(-3.0F, 0.0F, -2.75F);
            this.Wing1Right.addBox(0.0F, -2.5F, 0.0F, 2, 5, 3, 0.0F);
            this.setRotateAngle(Wing1Right, 0.0F, -0.36425021489121656F, 0.0F);
            this.EarTuftLeft1 = new ZawaModelRenderer(this, 18, 12);
            this.EarTuftLeft1.setPos(0.9F, -1.4F, 0.8F);
            this.EarTuftLeft1.addBox(-1.0F, -2.5F, 0.0F, 1, 3, 1, 0.0F);
            this.setRotateAngle(EarTuftLeft1, -0.40980330836826856F, -0.091106186954104F, 0.136659280431156F);
            this.Head = new ZawaModelRenderer(this, 0, 48);
            this.Head.setPos(0.0F, -2.6F, 1.0F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
            this.setRotateAngle(Head, 0.36425021489121656F, 0.0F, 0.0F);
            this.Tail4Left = new ZawaModelRenderer(this, 18, 29);
            this.Tail4Left.setPos(0.0F, 0.0F, 0.0F);
            this.Tail4Left.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
            this.setRotateAngle(Tail4Left, -0.045553093477052F, 0.045553093477052F, 0.0F);
            this.Toe3L = new ZawaModelRenderer(this, 35, 0);
            this.Toe3L.setPos(-0.3F, 0.0F, 0.0F);
            this.Toe3L.addBox(0.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe3L, 0.091106186954104F, 0.4553564018453205F, 0.0F);
            this.Wing2Left_1 = new ZawaModelRenderer(this, 12, 43);
            this.Wing2Left_1.mirror = true;
            this.Wing2Left_1.setPos(0.0F, 0.0F, 3.0F);
            this.Wing2Left_1.addBox(0.0F, -2.5F, 0.0F, 2, 5, 3, 0.0F);
            this.setRotateAngle(Wing2Left_1, 0.0F, 0.7285004297824331F, 0.0F);
            this.Neck2 = new ZawaModelRenderer(this, 6, 35);
            this.Neck2.setPos(0.0F, -2.0F, 0.3F);
            this.Neck2.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(Neck2, -0.27314402793711257F, 0.0F, 0.0F);
            this.BalloonTuft3_1 = new ZawaModelRenderer(this, 17, 23);
            this.BalloonTuft3_1.setPos(0.0F, 3.0F, 0.0F);
            this.BalloonTuft3_1.addBox(-0.5F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
            this.setRotateAngle(BalloonTuft3_1, 0.4553564018453205F, 0.0F, 0.0F);
            this.TailCenter = new ZawaModelRenderer(this, 18, 29);
            this.TailCenter.setPos(0.0F, 0.4F, 2.8F);
            this.TailCenter.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
            this.setRotateAngle(TailCenter, 0.045553093477052F, 0.0F, 0.0F);
            this.Tail2Right = new ZawaModelRenderer(this, 18, 29);
            this.Tail2Right.mirror = true;
            this.Tail2Right.setPos(-0.3F, 0.0F, -0.2F);
            this.Tail2Right.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
            this.setRotateAngle(Tail2Right, -0.045553093477052F, 0.0F, 0.0F);
            this.Toe1L = new ZawaModelRenderer(this, 35, 0);
            this.Toe1L.setPos(0.0F, 2.0F, 0.0F);
            this.Toe1L.addBox(-0.5F, -0.5F, -2.4F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe1L, 0.36425021489121656F, 0.0F, 0.0F);
            this.BalloonTuft3 = new ZawaModelRenderer(this, 17, 23);
            this.BalloonTuft3.setPos(0.0F, 1.0F, 0.0F);
            this.BalloonTuft3.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
            this.setRotateAngle(BalloonTuft3, 0.31869712141416456F, 0.0F, 0.0F);
            this.Chest = new ZawaModelRenderer(this, 0, 12);
            this.Chest.setPos(0.0F, 2.5F, -3.0F);
            this.Chest.addBox(-2.5F, -4.0F, 0.0F, 5, 4, 4, 0.0F);
            this.setRotateAngle(Chest, 0.8651597102135892F, 0.0F, 0.0F);
            this.Tail1Right = new ZawaModelRenderer(this, 18, 29);
            this.Tail1Right.mirror = true;
            this.Tail1Right.setPos(0.5F, 0.0F, 0.0F);
            this.Tail1Right.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
            this.setRotateAngle(Tail1Right, -0.045553093477052F, -0.045553093477052F, 0.0F);
            this.Tail4Right = new ZawaModelRenderer(this, 18, 29);
            this.Tail4Right.mirror = true;
            this.Tail4Right.setPos(0.0F, 0.0F, 0.0F);
            this.Tail4Right.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
            this.setRotateAngle(Tail4Right, -0.045553093477052F, -0.045553093477052F, 0.0F);
            this.Toe1R = new ZawaModelRenderer(this, 35, 0);
            this.Toe1R.mirror = true;
            this.Toe1R.setPos(0.0F, 2.0F, 0.0F);
            this.Toe1R.addBox(-0.5F, -0.5F, -2.4F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe1R, 0.36425021489121656F, 0.0F, 0.0F);
            this.BeakTop = new ZawaModelRenderer(this, 0, 44);
            this.BeakTop.setPos(0.0F, -0.5F, -1.8F);
            this.BeakTop.addBox(-0.5F, 0.0F, -1.3F, 1, 1, 2, 0.0F);
            this.setRotateAngle(BeakTop, 0.27314402793711257F, 0.0F, 0.0F);
            this.Tail3Right = new ZawaModelRenderer(this, 18, 29);
            this.Tail3Right.mirror = true;
            this.Tail3Right.setPos(0.0F, 0.0F, 0.0F);
            this.Tail3Right.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
            this.setRotateAngle(Tail3Right, -0.045553093477052F, -0.045553093477052F, 0.0F);
            this.Leg1Left = new ZawaModelRenderer(this, 21, 0);
            this.Leg1Left.setPos(1.5F, 1.3F, -0.3F);
            this.Leg1Left.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(Leg1Left, 0.7740535232594852F, 0.0F, 0.0F);
            this.Tail2Left = new ZawaModelRenderer(this, 18, 29);
            this.Tail2Left.setPos(0.3F, 0.0F, -0.2F);
            this.Tail2Left.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
            this.setRotateAngle(Tail2Left, -0.045553093477052F, 0.0F, 0.0F);
            this.Toe2R = new ZawaModelRenderer(this, 35, 0);
            this.Toe2R.mirror = true;
            this.Toe2R.setPos(0.3F, 0.0F, 0.0F);
            this.Toe2R.addBox(-1.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe2R, 0.091106186954104F, -0.4553564018453205F, 0.0F);
            this.Wing2Left = new ZawaModelRenderer(this, 12, 43);
            this.Wing2Left.setPos(0.0F, 0.0F, 3.0F);
            this.Wing2Left.addBox(-2.0F, -2.5F, 0.0F, 2, 5, 3, 0.0F);
            this.setRotateAngle(Wing2Left, 0.0F, -0.7285004297824331F, 0.0F);
            this.Tail2 = new ZawaModelRenderer(this, 14, 35);
            this.Tail2.setPos(0.0F, 0.0F, 0.0F);
            this.Tail2.addBox(-1.5F, 0.0F, 0.0F, 3, 4, 4, 0.0F);
            this.setRotateAngle(Tail2, -0.136659280431156F, 0.0F, 0.0F);
            this.Tail3Left = new ZawaModelRenderer(this, 18, 29);
            this.Tail3Left.setPos(0.0F, 0.0F, 0.0F);
            this.Tail3Left.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
            this.setRotateAngle(Tail3Left, -0.045553093477052F, 0.045553093477052F, 0.0F);
            this.Leg2Right = new ZawaModelRenderer(this, 30, 1);
            this.Leg2Right.mirror = true;
            this.Leg2Right.setPos(0.0F, 2.0F, 0.5F);
            this.Leg2Right.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
            this.setRotateAngle(Leg2Right, -0.5918411493512771F, 0.0F, 0.0F);
            this.Body = new ZawaModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 18.9F, 0.0F);
            this.Body.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
            this.setRotateAngle(Body, -0.36425021489121656F, 0.0F, 0.0F);
            this.NeckBackL = new ZawaModelRenderer(this, 0, 38);
            this.NeckBackL.setPos(0.3F, -3.0F, 0.3F);
            this.NeckBackL.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(NeckBackL, 0.27314402793711257F, 0.0F, 0.0F);
            this.Neck1 = new ZawaModelRenderer(this, 0, 20);
            this.Neck1.setPos(0.0F, -4.0F, 0.0F);
            this.Neck1.addBox(-2.0F, -2.0F, 0.0F, 4, 2, 4, 0.0F);
            this.setRotateAngle(Neck1, -0.5009094953223726F, 0.0F, 0.0F);
            this.EarTuftRight1 = new ZawaModelRenderer(this, 18, 12);
            this.EarTuftRight1.mirror = true;
            this.EarTuftRight1.setPos(-0.9F, -1.4F, 0.8F);
            this.EarTuftRight1.addBox(0.0F, -2.5F, 0.0F, 1, 3, 1, 0.0F);
            this.setRotateAngle(EarTuftRight1, -0.40980330836826856F, 0.091106186954104F, -0.136659280431156F);
            this.BalloonTuft2 = new ZawaModelRenderer(this, 18, 19);
            this.BalloonTuft2.setPos(0.0F, 3.0F, 0.0F);
            this.BalloonTuft2.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(BalloonTuft2, 1.1383037381507017F, 0.0F, 0.0F);
            this.EarTuftRight3 = new ZawaModelRenderer(this, 18, 16);
            this.EarTuftRight3.mirror = true;
            this.EarTuftRight3.setPos(0.5F, 0.7F, -0.1F);
            this.EarTuftRight3.addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
            this.setRotateAngle(EarTuftRight3, -0.22759093446006054F, 0.045553093477052F, -0.045553093477052F);
            this.Tail1Left = new ZawaModelRenderer(this, 18, 29);
            this.Tail1Left.setPos(-0.5F, 0.0F, 0.0F);
            this.Tail1Left.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
            this.setRotateAngle(Tail1Left, -0.045553093477052F, 0.045553093477052F, 0.0F);
            this.Leg2Left = new ZawaModelRenderer(this, 30, 1);
            this.Leg2Left.setPos(0.0F, 2.0F, 0.5F);
            this.Leg2Left.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
            this.setRotateAngle(Leg2Left, -0.5918411493512771F, 0.0F, 0.0F);
            this.Toe4L = new ZawaModelRenderer(this, 35, 4);
            this.Toe4L.setPos(0.0F, 0.0F, -0.5F);
            this.Toe4L.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(Toe4L, -0.22759093446006054F, 0.0F, 0.0F);
            this.EarTuftLeft2 = new ZawaModelRenderer(this, 14, 12);
            this.EarTuftLeft2.setPos(0.0F, 0.0F, 0.0F);
            this.EarTuftLeft2.addBox(-1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
            this.setRotateAngle(EarTuftLeft2, 0.091106186954104F, 0.045553093477052F, 0.136659280431156F);
            this.Leg1Right = new ZawaModelRenderer(this, 21, 0);
            this.Leg1Right.mirror = true;
            this.Leg1Right.setPos(-1.5F, 1.3F, -0.3F);
            this.Leg1Right.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(Leg1Right, 0.7740535232594852F, 0.0F, 0.0F);
            this.BalloonTuft1 = new ZawaModelRenderer(this, 18, 19);
            this.BalloonTuft1.setPos(-0.2F, 1.1F, 0.0F);
            this.BalloonTuft1.addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
            this.setRotateAngle(BalloonTuft1, -0.136659280431156F, 0.0F, 0.0F);
            this.NeckBackR = new ZawaModelRenderer(this, 0, 38);
            this.NeckBackR.mirror = true;
            this.NeckBackR.setPos(-0.3F, -3.0F, 0.3F);
            this.NeckBackR.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(NeckBackR, 0.27314402793711257F, 0.0F, 0.0F);
            this.BalloonL = new ZawaModelRenderer(this, 25, 12);
            this.BalloonL.setPos(0.2F, -3.3F, 0.2F);
            this.BalloonL.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
            this.setRotateAngle(BalloonL, -0.36425021489121656F, 0.0F, 0.0F);
            this.BeakBottom = new ZawaModelRenderer(this, 6, 44);
            this.BeakBottom.setPos(0.0F, 1.6F, 0.0F);
            this.BeakBottom.addBox(-0.5F, -1.0F, -1.3F, 1, 1, 2, 0.0F);
            this.setRotateAngle(BeakBottom, -0.36425021489121656F, 0.0F, 0.0F);
            this.Toe1R.addChild(this.Toe4R);
            this.Toe1L.addChild(this.Toe2L);
            this.Body.addChild(this.TailBase);
            this.EarTuftRight1.addChild(this.EarTuftRight2);
            this.EarTuftLeft1.addChild(this.EarTuftLeft3);
            this.Toe1R.addChild(this.Toe3R);
            this.BalloonL.addChild(this.BalloonR);
            this.Body.addChild(this.Wing1Left);
            this.Body.addChild(this.Wing1Right);
            this.Head.addChild(this.EarTuftLeft1);
            this.Neck2.addChild(this.Head);
            this.Tail3Left.addChild(this.Tail4Left);
            this.Toe1L.addChild(this.Toe3L);
            this.Wing1Right.addChild(this.Wing2Left_1);
            this.Neck1.addChild(this.Neck2);
            this.BalloonTuft3.addChild(this.BalloonTuft3_1);
            this.Tail2.addChild(this.TailCenter);
            this.Tail1Right.addChild(this.Tail2Right);
            this.Leg2Left.addChild(this.Toe1L);
            this.BalloonTuft2.addChild(this.BalloonTuft3);
            this.Body.addChild(this.Chest);
            this.TailCenter.addChild(this.Tail1Right);
            this.Tail3Right.addChild(this.Tail4Right);
            this.Leg2Right.addChild(this.Toe1R);
            this.Head.addChild(this.BeakTop);
            this.Tail2Right.addChild(this.Tail3Right);
            this.Body.addChild(this.Leg1Left);
            this.Tail1Left.addChild(this.Tail2Left);
            this.Toe1R.addChild(this.Toe2R);
            this.Wing1Left.addChild(this.Wing2Left);
            this.TailBase.addChild(this.Tail2);
            this.Tail2Left.addChild(this.Tail3Left);
            this.Leg1Right.addChild(this.Leg2Right);
            this.Neck2.addChild(this.NeckBackL);
            this.Chest.addChild(this.Neck1);
            this.Head.addChild(this.EarTuftRight1);
            this.BalloonTuft1.addChild(this.BalloonTuft2);
            this.EarTuftRight1.addChild(this.EarTuftRight3);
            this.TailCenter.addChild(this.Tail1Left);
            this.Leg1Left.addChild(this.Leg2Left);
            this.Toe1L.addChild(this.Toe4L);
            this.EarTuftLeft1.addChild(this.EarTuftLeft2);
            this.Body.addChild(this.Leg1Right);
            this.BalloonL.addChild(this.BalloonTuft1);
            this.Neck2.addChild(this.NeckBackR);
            this.Neck1.addChild(this.BalloonL);
            this.BeakTop.addChild(this.BeakBottom);
            this.saveBase();
        }

        @Override
        public void setupAnim(GreaterPrairieChickenEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = MathHelper.cos(3F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + -0.50F;
            this.Neck2.xRot = MathHelper.cos(4F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + -0.27F;
            this.Head.xRot = MathHelper.cos(4F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.36F;
            this.TailBase.xRot = MathHelper.cos(4F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.27F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.6f;
            float degree = 0.7f;

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting() && !isSwimming) {


            } else {
                this.Body.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.364F;
                this.Body.yRot = MathHelper.cos(3F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 0.25F) * 0.5F;
                this.Body.y = MathHelper.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 18.9F;
                this.Chest.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F + + 0.86F;
                this.Neck1.xRot = MathHelper.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.7F + - 0.50F;
                this.Neck2.xRot = MathHelper.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * - 0.4F) * 0.5F + -0.27F;
                this.Head.xRot = MathHelper.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.36F;
                this.Head.z = MathHelper.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) * 0.5F + 1.0F;

                this.Leg1Left.xRot = MathHelper.cos(3F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2.8F) * 0.5F + 0.77F;
                this.Leg2Left.xRot = MathHelper.cos(1F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2.3F) * 0.5F - 0.59F;
                this.Toe1L.xRot = MathHelper.cos(6.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.36F;
                this.Leg1Right.xRot = MathHelper.cos(3F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2.8F) * 0.5F + 0.77F;
                this.Leg2Right.xRot = MathHelper.cos(1F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.59F;
                this.Toe1R.xRot = MathHelper.cos(6.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.36F;

                this.TailBase.xRot = MathHelper.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.27F;
            }
        }
    }

    public static class Child extends GreaterPrairieChickenModel {
        public ZawaModelRenderer HeadBase;
        public ZawaModelRenderer NeckLower;
        public ZawaModelRenderer HeadTop;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.Leg2Left = new ZawaModelRenderer(this, 10, 12);
            this.Leg2Left.setPos(0.0F, 1.5F, 0.7F);
            this.Leg2Left.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
            this.setRotateAngle(Leg2Left, -0.27314402793711257F, 0.0F, 0.0F);
            this.TailBase = new ZawaModelRenderer(this, 0, 9);
            this.TailBase.setPos(0.0F, -1.7F, 2.0F);
            this.TailBase.addBox(-1.5F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
            this.setRotateAngle(TailBase, -0.5918411493512771F, 0.0F, 0.0F);
            this.Wing2Left = new ZawaModelRenderer(this, 12, 23);
            this.Wing2Left.setPos(0.0F, 0.0F, 2.0F);
            this.Wing2Left.addBox(-1.0F, -1.5F, 0.0F, 1, 3, 2, 0.0F);
            this.setRotateAngle(Wing2Left, 0.0F, -0.27314402793711257F, 0.0F);
            this.Neck1 = new ZawaModelRenderer(this, 0, 14);
            this.Neck1.setPos(0.0F, -0.7F, -1.1F);
            this.Neck1.addBox(-1.0F, -2.0F, -1.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(Neck1, 0.8196066167365371F, 0.0F, 0.0F);
            this.HeadTop = new ZawaModelRenderer(this, 0, 24);
            this.HeadTop.setPos(0.0F, -2.5F, 0.4F);
            this.HeadTop.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
            this.BeakTop = new ZawaModelRenderer(this, 0, 0);
            this.BeakTop.setPos(0.0F, -1.2F, -2.5F);
            this.BeakTop.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(BeakTop, 0.27314402793711257F, 0.0F, 0.0F);
            this.NeckLower = new ZawaModelRenderer(this, 13, 0);
            this.NeckLower.setPos(0.0F, -1.9F, -1.6F);
            this.NeckLower.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
            this.setRotateAngle(NeckLower, -0.22759093446006054F, 0.0F, 0.0F);
            this.Wing1Left = new ZawaModelRenderer(this, 9, 18);
            this.Wing1Left.setPos(2.0F, 0.0F, -1.6F);
            this.Wing1Left.addBox(-1.0F, -1.5F, 0.0F, 1, 3, 2, 0.0F);
            this.setRotateAngle(Wing1Left, 0.0F, 0.22759093446006054F, 0.0F);
            this.Leg1Right = new ZawaModelRenderer(this, 10, 8);
            this.Leg1Right.setPos(-1.1F, 0.3F, 0.0F);
            this.Leg1Right.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(Leg1Right, 0.27314402793711257F, 0.0F, 0.0F);
            this.Wing2Left_1 = new ZawaModelRenderer(this, 12, 23);
            this.Wing2Left_1.mirror = true;
            this.Wing2Left_1.setPos(0.0F, 0.0F, 2.0F);
            this.Wing2Left_1.addBox(0.0F, -1.5F, 0.0F, 1, 3, 2, 0.0F);
            this.setRotateAngle(Wing2Left_1, 0.0F, 0.27314402793711257F, 0.0F);
            this.BeakBottom = new ZawaModelRenderer(this, 0, 0);
            this.BeakBottom.setPos(0.0F, 0.8F, 0.5F);
            this.BeakBottom.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
            this.setRotateAngle(BeakBottom, -0.6373942428283291F, 0.0F, 0.0F);
            this.Wing1Right = new ZawaModelRenderer(this, 9, 18);
            this.Wing1Right.mirror = true;
            this.Wing1Right.setPos(-2.0F, 0.0F, -1.6F);
            this.Wing1Right.addBox(0.0F, -1.5F, 0.0F, 1, 3, 2, 0.0F);
            this.setRotateAngle(Wing1Right, 0.0F, -0.22759093446006054F, 0.0F);
            this.HeadBase = new ZawaModelRenderer(this, 0, 20);
            this.HeadBase.setPos(0.0F, -0.6F, -0.1F);
            this.HeadBase.addBox(-1.5F, -0.5F, -2.5F, 3, 1, 3, 0.0F);
            this.setRotateAngle(HeadBase, -0.6373942428283291F, 0.0F, 0.0F);
            this.Leg1Left = new ZawaModelRenderer(this, 10, 8);
            this.Leg1Left.setPos(1.1F, 0.3F, 0.0F);
            this.Leg1Left.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(Leg1Left, 0.27314402793711257F, 0.0F, 0.0F);
            this.Leg2Right = new ZawaModelRenderer(this, 10, 12);
            this.Leg2Right.mirror = true;
            this.Leg2Right.setPos(0.0F, 1.5F, 0.7F);
            this.Leg2Right.addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
            this.setRotateAngle(Leg2Right, -0.27314402793711257F, 0.0F, 0.0F);
            this.Body = new ZawaModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 20.1F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F);
            this.setRotateAngle(Body, -0.136659280431156F, 0.0F, 0.0F);
            this.Toe1L = new ZawaModelRenderer(this, 8, 15);
            this.Toe1L.setPos(0.0F, 1.4F, -0.6F);
            this.Toe1L.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe1L, 0.136659280431156F, 0.0F, 0.0F);
            this.Toe1R = new ZawaModelRenderer(this, 8, 15);
            this.Toe1R.mirror = true;
            this.Toe1R.setPos(0.0F, 1.4F, -0.6F);
            this.Toe1R.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 2, 0.0F);
            this.setRotateAngle(Toe1R, 0.136659280431156F, 0.0F, 0.0F);
            this.Leg1Left.addChild(this.Leg2Left);
            this.Body.addChild(this.TailBase);
            this.Wing1Left.addChild(this.Wing2Left);
            this.Body.addChild(this.Neck1);
            this.HeadBase.addChild(this.HeadTop);
            this.HeadBase.addChild(this.BeakTop);
            this.Neck1.addChild(this.NeckLower);
            this.Body.addChild(this.Wing1Left);
            this.Body.addChild(this.Leg1Right);
            this.Wing1Right.addChild(this.Wing2Left_1);
            this.BeakTop.addChild(this.BeakBottom);
            this.Body.addChild(this.Wing1Right);
            this.Neck1.addChild(this.HeadBase);
            this.Body.addChild(this.Leg1Left);
            this.Leg1Right.addChild(this.Leg2Right);
            this.Leg2Left.addChild(this.Toe1L);
            this.Leg2Right.addChild(this.Toe1R);
            this.saveBase();
        }

        @Override
        public void setupAnim(GreaterPrairieChickenEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing,limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.6f;
            float degree = 0.7f;
            this.Neck1.xRot = MathHelper.cos(2F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.819F;
            this.HeadBase.xRot = MathHelper.cos(1F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.63F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.6f;
            float degree = 0.7f;
            this.Body.yRot = MathHelper.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.25F) * 0.5F;
            this.Body.y = MathHelper.cos(3F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 20.1F;
            this.Neck1.xRot = MathHelper.cos(3F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.819F;
            this.HeadBase.xRot = MathHelper.cos(2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.63F;
            this.HeadBase.z = MathHelper.cos(1F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.1F;

            this.Leg1Left.xRot = MathHelper.cos(1F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.8F) * 0.5F + 0.273F;
            this.Leg1Right.xRot = MathHelper.cos(1F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.8F) * 0.5F + 0.273F;
        }
    }
}
