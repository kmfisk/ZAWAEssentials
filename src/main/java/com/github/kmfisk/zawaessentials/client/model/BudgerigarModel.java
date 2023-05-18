package com.github.kmfisk.zawaessentials.client.model;

import com.github.kmfisk.zawaessentials.entity.BudgerigarEntity;
import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class BudgerigarModel extends ZawaBaseModel<BudgerigarEntity> {
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer TailBase;
    public ModelRenderer LegLeft;
    public ModelRenderer LegRight;
    public ModelRenderer Head;
    public ModelRenderer Forehead;
    public ModelRenderer BeakLeft;
    public ModelRenderer CereLeft;
    public ModelRenderer CereRight;
    public ModelRenderer BeakRight;
    public ModelRenderer Tail;
    public ModelRenderer TailFeatherCenter;
    public ModelRenderer TailFeatherL1;
    public ModelRenderer TailFeatherR1;
    public ModelRenderer TailFeatherL2;
    public ModelRenderer TailFeatherL2_1;
    public ModelRenderer FootLeft;
    public ModelRenderer FootRight;
    private Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) {
            this.parts = ImmutableList.of(this.Body);
        }

        return this.parts;
    }

    public static class Flying extends BudgerigarModel {
        public ModelRenderer Wing1Left;
        public ModelRenderer Wing1Right;
        public ModelRenderer Wing2Left;
        public ModelRenderer Wing3Left;
        public ModelRenderer WingTip1L;
        public ModelRenderer WingTip2L;
        public ModelRenderer WingTip3L;
        public ModelRenderer WingTip4L;
        public ModelRenderer WingTip4L_1;
        public ModelRenderer Wing2Right;
        public ModelRenderer Wing3Right;
        public ModelRenderer WingTip1R;
        public ModelRenderer WingTip2R;
        public ModelRenderer WingTip3R;
        public ModelRenderer WingTip4R;
        public ModelRenderer WingTip4R_1;
        
        public Flying() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.Wing1Left = new ModelRenderer(this, 14, 20);
            this.Wing1Left.setPos(1.0F, -2.0F, 0.6F);
            this.Wing1Left.addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing1Left, 0.0F, 0.0F, -0.04555309164612875F);
            this.LegLeft = new ModelRenderer(this, 8, 13);
            this.LegLeft.setPos(1.0F, 0.9F, -0.6F);
            this.LegLeft.addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.0911061832922575F, 0.0F, 0.0F);
            this.Wing2Left = new ModelRenderer(this, 20, 20);
            this.Wing2Left.setPos(2.0F, 4.0F, 0.0F);
            this.Wing2Left.addBox(0.0F, -4.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Left, 0.0F, 0.0F, -0.10471975511965977F);
            this.WingTip4R_1 = new ModelRenderer(this, 10, 20);
            this.WingTip4R_1.mirror = true;
            this.WingTip4R_1.setPos(0.0F, 0.0F, 0.0F);
            this.WingTip4R_1.addBox(0.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip4R_1, 0.0F, 0.0F, 0.24434609527920614F);
            this.TailFeatherR1 = new ModelRenderer(this, 16, 7);
            this.TailFeatherR1.mirror = true;
            this.TailFeatherR1.setPos(-1.2F, -1.1F, -0.5F);
            this.TailFeatherR1.addBox(0.0F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherR1, 0.0F, 0.0F, 0.031066860186156363F);
            this.WingTip4L_1 = new ModelRenderer(this, 10, 20);
            this.WingTip4L_1.setPos(0.0F, 0.0F, 0.0F);
            this.WingTip4L_1.addBox(-1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip4L_1, 0.0F, 0.0F, -0.24434609527920614F);
            this.TailBase = new ModelRenderer(this, 12, 0);
            this.TailBase.setPos(0.0F, 2.6F, 0.0F);
            this.TailBase.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.04555309164612875F, 0.0F, 0.0F);
            this.BeakRight = new ModelRenderer(this, 0, 22);
            this.BeakRight.mirror = true;
            this.BeakRight.setPos(0.0F, 0.0F, 0.0F);
            this.BeakRight.addBox(-0.7F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 13);
            this.Neck.setPos(0.0F, -2.6F, 0.1F);
            this.Neck.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.18203784630933073F, 0.0F, 0.0F);
            this.TailFeatherL2_1 = new ModelRenderer(this, 16, 7);
            this.TailFeatherL2_1.setPos(-0.3F, -0.6F, -0.1F);
            this.TailFeatherL2_1.addBox(0.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherL2_1, 0.0F, 0.0F, 0.11833332694706204F);
            this.TailFeatherL1 = new ModelRenderer(this, 16, 7);
            this.TailFeatherL1.setPos(1.2F, -1.1F, -0.5F);
            this.TailFeatherL1.addBox(-1.0F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherL1, 0.0F, 0.0F, -0.031066860186156363F);
            this.Wing2Right = new ModelRenderer(this, 20, 20);
            this.Wing2Right.mirror = true;
            this.Wing2Right.setPos(-2.0F, 4.0F, 0.0F);
            this.Wing2Right.addBox(-2.0F, -4.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing2Right, 0.0F, 0.0F, 0.10471975511965977F);
            this.TailFeatherCenter = new ModelRenderer(this, 12, 7);
            this.TailFeatherCenter.setPos(0.0F, 1.7F, -0.2F);
            this.TailFeatherCenter.addBox(-0.5F, -2.0F, -0.4F, 1.0F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherCenter, 0.0911061832922575F, 0.0F, 0.0F);
            this.TailFeatherL2 = new ModelRenderer(this, 16, 7);
            this.TailFeatherL2.setPos(0.3F, -0.6F, -0.1F);
            this.TailFeatherL2.addBox(-1.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherL2, 0.0F, 0.0F, -0.13578661946700535F);
            this.WingTip1R = new ModelRenderer(this, 10, 20);
            this.WingTip1R.setPos(-2.0F, 0.0F, 0.0F);
            this.WingTip1R.addBox(0.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip1R, 0.0F, 0.0F, 0.24434609527920614F);
            this.FootLeft = new ModelRenderer(this, 7, 16);
            this.FootLeft.setPos(0.0F, 0.5F, -0.7F);
            this.FootLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.9105382388075086F, -0.13665927909957545F, 0.0F);
            this.WingTip4L = new ModelRenderer(this, 10, 20);
            this.WingTip4L.setPos(0.0F, 0.0F, 0.0F);
            this.WingTip4L.addBox(-1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip4L, 0.0F, 0.0F, -0.24434609527920614F);
            this.Tail = new ModelRenderer(this, 12, 4);
            this.Tail.setPos(0.0F, 1.0F, 0.3F);
            this.Tail.addBox(-1.0F, -0.2F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.04555309164612875F, 0.0F, 0.0F);
            this.WingTip3L = new ModelRenderer(this, 10, 20);
            this.WingTip3L.setPos(0.0F, 0.0F, 0.0F);
            this.WingTip3L.addBox(-1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip3L, 0.0F, 0.0F, -0.24434609527920614F);
            this.FootRight = new ModelRenderer(this, 7, 16);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 0.5F, -0.7F);
            this.FootRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.8651597048872669F, 0.13665927909957545F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 7);
            this.Head.setPos(0.0F, -0.5F, 0.1F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -1.092750655326294F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 21.9F, 0.0F);
            this.Body.addBox(-1.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 1.5025538891260521F, 0.0F, 0.0F);
            this.WingTip4R = new ModelRenderer(this, 10, 20);
            this.WingTip4R.mirror = true;
            this.WingTip4R.setPos(0.0F, 0.0F, 0.0F);
            this.WingTip4R.addBox(0.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip4R, 0.0F, 0.0F, 0.24434609527920614F);
            this.Wing3Left = new ModelRenderer(this, 26, 20);
            this.Wing3Left.setPos(2.0F, -4.0F, 0.0F);
            this.Wing3Left.addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing3Left, 0.0F, 0.0F, 0.13962634015954636F);
            this.Wing1Right = new ModelRenderer(this, 14, 20);
            this.Wing1Right.mirror = true;
            this.Wing1Right.setPos(-1.0F, -2.0F, 0.6F);
            this.Wing1Right.addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing1Right, 0.0F, 0.0F, 0.04555309164612875F);
            this.WingTip3R = new ModelRenderer(this, 10, 20);
            this.WingTip3R.mirror = true;
            this.WingTip3R.setPos(0.0F, 0.0F, 0.0F);
            this.WingTip3R.addBox(0.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip3R, 0.0F, 0.0F, 0.24434609527920614F);
            this.BeakLeft = new ModelRenderer(this, 0, 22);
            this.BeakLeft.setPos(0.0F, -0.9F, -2.3F);
            this.BeakLeft.addBox(-0.3F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.WingTip2R = new ModelRenderer(this, 10, 20);
            this.WingTip2R.mirror = true;
            this.WingTip2R.setPos(0.0F, 0.0F, 0.0F);
            this.WingTip2R.addBox(0.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip2R, 0.0F, 0.0F, 0.24434609527920614F);
            this.WingTip1L = new ModelRenderer(this, 10, 20);
            this.WingTip1L.setPos(2.0F, 0.0F, 0.0F);
            this.WingTip1L.addBox(-1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip1L, 0.0F, 0.0F, -0.24434609527920614F);
            this.LegRight = new ModelRenderer(this, 8, 13);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-1.0F, 0.9F, -0.6F);
            this.LegRight.addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.0911061832922575F, 0.0F, 0.0F);
            this.WingTip2L = new ModelRenderer(this, 10, 20);
            this.WingTip2L.setPos(0.0F, 0.0F, 0.0F);
            this.WingTip2L.addBox(-1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingTip2L, 0.0F, 0.0F, -0.24434609527920614F);
            this.Forehead = new ModelRenderer(this, 0, 18);
            this.Forehead.setPos(0.0F, -1.9F, -2.0F);
            this.Forehead.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.Wing3Right = new ModelRenderer(this, 26, 20);
            this.Wing3Right.mirror = true;
            this.Wing3Right.setPos(-2.0F, -4.0F, 0.0F);
            this.Wing3Right.addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Wing3Right, 0.0F, 0.0F, -0.13962634015954636F);
            this.CereLeft = new ModelRenderer(this, 0, 25);
            this.CereLeft.setPos(0.5F, -1.2F, -2.5F);
            this.CereLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CereLeft, 0.0F, -0.1502728426045993F, 0.0F);
            this.CereRight = new ModelRenderer(this, 0, 25);
            this.CereRight.mirror = true;
            this.CereRight.setPos(-0.5F, -1.2F, -2.5F);
            this.CereRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CereRight, 0.0F, 0.1502728426045993F, 0.0F);
            this.Body.addChild(this.Wing1Left);
            this.Body.addChild(this.LegLeft);
            this.Wing1Left.addChild(this.Wing2Left);
            this.WingTip4R.addChild(this.WingTip4R_1);
            this.Tail.addChild(this.TailFeatherR1);
            this.WingTip4L.addChild(this.WingTip4L_1);
            this.Body.addChild(this.TailBase);
            this.BeakLeft.addChild(this.BeakRight);
            this.Body.addChild(this.Neck);
            this.TailFeatherR1.addChild(this.TailFeatherL2_1);
            this.Tail.addChild(this.TailFeatherL1);
            this.Wing1Right.addChild(this.Wing2Right);
            this.TailBase.addChild(this.TailFeatherCenter);
            this.TailFeatherL1.addChild(this.TailFeatherL2);
            this.Wing3Right.addChild(this.WingTip1R);
            this.LegLeft.addChild(this.FootLeft);
            this.WingTip3L.addChild(this.WingTip4L);
            this.TailBase.addChild(this.Tail);
            this.WingTip2L.addChild(this.WingTip3L);
            this.LegRight.addChild(this.FootRight);
            this.Neck.addChild(this.Head);
            this.WingTip3R.addChild(this.WingTip4R);
            this.Wing2Left.addChild(this.Wing3Left);
            this.Body.addChild(this.Wing1Right);
            this.WingTip2R.addChild(this.WingTip3R);
            this.Head.addChild(this.BeakLeft);
            this.WingTip1R.addChild(this.WingTip2R);
            this.Wing3Left.addChild(this.WingTip1L);
            this.Body.addChild(this.LegRight);
            this.WingTip1L.addChild(this.WingTip2L);
            this.Head.addChild(this.Forehead);
            this.Wing2Right.addChild(this.Wing3Right);
            this.Head.addChild(this.CereLeft);
            this.Head.addChild(this.CereRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(BudgerigarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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

    public static class Adult extends BudgerigarModel {
        public ModelRenderer WingFoldedLeft;
        public ModelRenderer WingFoldedRight;
        public ModelRenderer WingFoldedLeft1;
        public ModelRenderer WingFoldedRight1;

        public Adult() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 21.3F, 0.0F);
            this.Body.addBox(-1.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, 0.8560839847874131F, 0.0F, 0.0F);
            this.TailFeatherCenter = new ModelRenderer(this, 12, 7);
            this.TailFeatherCenter.setPos(0.0F, 1.7F, -0.2F);
            this.TailFeatherCenter.addBox(-0.5F, -2.0F, -0.4F, 1.0F, 8.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherCenter, 0.0911061832922575F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 8, 13);
            this.LegRight.mirror = true;
            this.LegRight.setPos(-1.1F, 0.9F, -1.0F);
            this.LegRight.addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, -0.8196066007575706F, -0.13665927909957545F, 0.18203784630933073F);
            this.WingFoldedLeft1 = new ModelRenderer(this, 0, 27);
            this.WingFoldedLeft1.setPos(0.0F, 3.0F, -1.5F);
            this.WingFoldedLeft1.addBox(-0.6F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFoldedLeft1, 0.7740534966278743F, 0.0F, 0.0F);
            this.WingFoldedRight1 = new ModelRenderer(this, 0, 27);
            this.WingFoldedRight1.mirror = true;
            this.WingFoldedRight1.setPos(0.0F, 3.0F, -1.5F);
            this.WingFoldedRight1.addBox(-0.4F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFoldedRight1, 0.7740534966278743F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 13);
            this.Neck.setPos(0.0F, -2.6F, 0.1F);
            this.Neck.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.18203784630933073F, 0.0F, 0.0F);
            this.WingFoldedLeft = new ModelRenderer(this, 4, 22);
            this.WingFoldedLeft.setPos(1.2F, -1.4F, 0.0F);
            this.WingFoldedLeft.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFoldedLeft, 0.27314402127920984F, 0.0F, -0.0911061832922575F);
            this.CereRight = new ModelRenderer(this, 0, 25);
            this.CereRight.mirror = true;
            this.CereRight.setPos(-0.5F, -1.2F, -2.5F);
            this.CereRight.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CereRight, 0.0F, 0.1502728426045993F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 8, 13);
            this.LegLeft.setPos(1.1F, 0.9F, -1.0F);
            this.LegLeft.addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, -0.8196066007575706F, 0.13665927909957545F, -0.18203784630933073F);
            this.Head = new ModelRenderer(this, 0, 7);
            this.Head.setPos(0.0F, -0.7F, 0.5F);
            this.Head.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.01F, 0.0F, 0.0F);
            this.setRotateAngle(Head, -0.591841146688116F, 0.0F, 0.0F);
            this.CereLeft = new ModelRenderer(this, 0, 25);
            this.CereLeft.setPos(0.5F, -1.2F, -2.5F);
            this.CereLeft.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(CereLeft, 0.0F, -0.1502728426045993F, 0.0F);
            this.TailFeatherL2 = new ModelRenderer(this, 16, 7);
            this.TailFeatherL2.setPos(0.3F, -0.6F, -0.1F);
            this.TailFeatherL2.addBox(-1.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherL2, 0.0F, 0.0F, 0.0038397243335815787F);
            this.FootLeft = new ModelRenderer(this, 7, 16);
            this.FootLeft.setPos(0.0F, 0.5F, -0.7F);
            this.FootLeft.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, 0.0F, -0.13665927909957545F, 0.0F);
            this.TailBase = new ModelRenderer(this, 12, 0);
            this.TailBase.setPos(0.0F, 2.0F, 0.4F);
            this.TailBase.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailBase, 0.45535640450848164F, 0.0F, 0.0F);
            this.BeakLeft = new ModelRenderer(this, 0, 22);
            this.BeakLeft.setPos(0.0F, -0.9F, -2.3F);
            this.BeakLeft.addBox(-0.3F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.Tail = new ModelRenderer(this, 12, 4);
            this.Tail.setPos(0.0F, 1.0F, 0.3F);
            this.Tail.addBox(-1.0F, -0.2F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail, 0.04555309164612875F, 0.0F, 0.0F);
            this.TailFeatherR1 = new ModelRenderer(this, 16, 7);
            this.TailFeatherR1.mirror = true;
            this.TailFeatherR1.setPos(-1.2F, -1.1F, -0.5F);
            this.TailFeatherR1.addBox(0.0F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherR1, 0.04555309164612875F, 0.0F, -0.05619960241356012F);
            this.WingFoldedRight = new ModelRenderer(this, 4, 22);
            this.WingFoldedRight.mirror = true;
            this.WingFoldedRight.setPos(-1.2F, -1.4F, 0.0F);
            this.WingFoldedRight.addBox(-0.5F, 0.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(WingFoldedRight, 0.27314402127920984F, 0.0F, 0.0911061832922575F);
            this.FootRight = new ModelRenderer(this, 7, 16);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 0.5F, -0.7F);
            this.FootRight.addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, 0.0F, 0.13665927909957545F, 0.0F);
            this.BeakRight = new ModelRenderer(this, 0, 22);
            this.BeakRight.mirror = true;
            this.BeakRight.setPos(0.0F, 0.0F, 0.0F);
            this.BeakRight.addBox(-0.7F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.TailFeatherL1 = new ModelRenderer(this, 16, 7);
            this.TailFeatherL1.setPos(1.2F, -1.1F, -0.5F);
            this.TailFeatherL1.addBox(-1.0F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherL1, 0.04555309164612875F, 0.0F, 0.05619960241356012F);
            this.TailFeatherL2_1 = new ModelRenderer(this, 16, 7);
            this.TailFeatherL2_1.setPos(-0.3F, -0.6F, -0.1F);
            this.TailFeatherL2_1.addBox(0.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TailFeatherL2_1, 0.0F, 0.0F, -0.0038397243335815787F);
            this.Forehead = new ModelRenderer(this, 0, 18);
            this.Forehead.setPos(0.0F, -1.9F, -2.0F);
            this.Forehead.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.TailBase.addChild(this.TailFeatherCenter);
            this.Body.addChild(this.LegRight);
            this.WingFoldedLeft.addChild(this.WingFoldedLeft1);
            this.WingFoldedRight.addChild(this.WingFoldedRight1);
            this.Body.addChild(this.Neck);
            this.Body.addChild(this.WingFoldedLeft);
            this.Head.addChild(this.CereRight);
            this.Body.addChild(this.LegLeft);
            this.Neck.addChild(this.Head);
            this.Head.addChild(this.CereLeft);
            this.TailFeatherL1.addChild(this.TailFeatherL2);
            this.LegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.TailBase);
            this.Head.addChild(this.BeakLeft);
            this.TailBase.addChild(this.Tail);
            this.Tail.addChild(this.TailFeatherR1);
            this.Body.addChild(this.WingFoldedRight);
            this.LegRight.addChild(this.FootRight);
            this.BeakLeft.addChild(this.BeakRight);
            this.Tail.addChild(this.TailFeatherL1);
            this.TailFeatherR1.addChild(this.TailFeatherL2_1);
            this.Head.addChild(this.Forehead);
            this.saveBase();
        }

        @Override
        public void setupAnim(BudgerigarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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

    public static class Child extends BudgerigarModel {
        public Child() {
            // TODO: Insert child model
            this.saveBase();
        }

        @Override
        public void setupAnim(BudgerigarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
