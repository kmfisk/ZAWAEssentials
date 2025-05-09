package com.github.kmfisk.zawaessentials.client.model;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class HawkHeadedParrotModel<E extends Entity> extends ZawaBaseModel<E> {
    public ModelPart Body;
    public ModelPart Neck;
    public ModelPart Head;
    public ModelPart TailBase;
    public ModelPart LegLeft;
    public ModelPart LegRight;
    public ModelPart Forehead;
    public ModelPart Beak;
    public ModelPart Crown1;
    public ModelPart Crown2L;
    public ModelPart Crown3L;
    public ModelPart Crown4L;
    public ModelPart Crown2R;
    public ModelPart Crown3R;
    public ModelPart Crown4R;
    public ModelPart BeakTip;
    public ModelPart Jaw;
    public ModelPart Tail;
    public ModelPart TailFeatherCenter;
    public ModelPart TailFeather1L;
    public ModelPart TailFeather1R;
    public ModelPart TailFeather2L;
    public ModelPart TailFeather3L;
    public ModelPart TailFeather2R;
    public ModelPart TailFeather3R;
    public ModelPart ThighLeft;
    public ModelPart FootLeft;
    public ModelPart Toe1L;
    public ModelPart Toe2L;
    public ModelPart Toe3L;
    public ModelPart ThighRight;
    public ModelPart FootRight;
    public ModelPart Toe1R;
    public ModelPart Toe2R;
    public ModelPart Toe3R;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) this.parts = ImmutableList.of(this.Body);
        return this.parts;
    }

    public static class Flying<E extends Entity> extends HawkHeadedParrotModel<E> {
        public ModelPart Wing1Left;
        public ModelPart Wing1Right;
        public ModelPart Wing2Left;
        public ModelPart Wing3Left;
        public ModelPart WingTipL1;
        public ModelPart WingTipL2;
        public ModelPart WingTipL3;
        public ModelPart WingTipL4;
        public ModelPart WingTipL5;
        public ModelPart WingTipL6;
        public ModelPart Wing2Right;
        public ModelPart Wing3Right;
        public ModelPart WingTipR1;
        public ModelPart WingTipR2;
        public ModelPart WingTipR3;
        public ModelPart WingTipR4;
        public ModelPart WingTipL5_1;
        public ModelPart WingTipL6_1;

        public Flying(ModelPart root) {
            this.Body = root.getChild("Body");
            this.TailBase = this.Body.getChild("TailBase");
            this.Tail = this.TailBase.getChild("Tail");
            this.TailFeatherCenter = this.Tail.getChild("TailFeatherCenter");
            this.TailFeather1L = this.TailFeatherCenter.getChild("TailFeather1L");
            this.TailFeather2L = this.TailFeather1L.getChild("TailFeather2L");
            this.TailFeather3L = this.TailFeather2L.getChild("TailFeather3L");

            this.TailFeather1R = this.TailFeatherCenter.getChild("TailFeather1R");
            this.TailFeather2R = this.TailFeather1R.getChild("TailFeather2R");
            this.TailFeather3R = this.TailFeather2R.getChild("TailFeather3R");

            this.Wing1Left = this.Body.getChild("Wing1Left");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");
            this.Wing3Left = this.Wing2Left.getChild("Wing3Left");
            this.WingTipL1 = this.Wing3Left.getChild("WingTipL1");
            this.WingTipL2 = this.WingTipL1.getChild("WingTipL2");
            this.WingTipL3 = this.WingTipL2.getChild("WingTipL3");
            this.WingTipL4 = this.WingTipL3.getChild("WingTipL4");
            this.WingTipL5 = this.WingTipL4.getChild("WingTipL5");
            this.WingTipL6 = this.WingTipL5.getChild("WingTipL6");

            this.LegLeft = this.Body.getChild("LegLeft");
            this.ThighLeft = this.LegLeft.getChild("ThighLeft");

            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Toe3L = this.FootLeft.getChild("Toe3L");

            this.Toe2L = this.FootLeft.getChild("Toe2L");

            this.Toe1L = this.FootLeft.getChild("Toe1L");

            this.LegRight = this.Body.getChild("LegRight");
            this.ThighRight = this.LegRight.getChild("ThighRight");

            this.FootRight = this.LegRight.getChild("FootRight");
            this.Toe3R = this.FootRight.getChild("Toe3R");

            this.Toe2R = this.FootRight.getChild("Toe2R");

            this.Toe1R = this.FootRight.getChild("Toe1R");

            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.Wing2Right = this.Wing1Right.getChild("Wing2Right");
            this.Wing3Right = this.Wing2Right.getChild("Wing3Right");
            this.WingTipR1 = this.Wing3Right.getChild("WingTipR1");
            this.WingTipR2 = this.WingTipR1.getChild("WingTipR2");
            this.WingTipR3 = this.WingTipR2.getChild("WingTipR3");
            this.WingTipR4 = this.WingTipR3.getChild("WingTipR4");
            this.WingTipL5_1 = this.WingTipR4.getChild("WingTipL5_1");
            this.WingTipL6_1 = this.WingTipL5_1.getChild("WingTipL6_1");

            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Crown2R = this.Head.getChild("Crown2R");

            this.Crown1 = this.Head.getChild("Crown1");

            this.Crown4L = this.Head.getChild("Crown4L");

            this.Crown4R = this.Head.getChild("Crown4R");

            this.Crown3L = this.Head.getChild("Crown3L");

            this.Crown3R = this.Head.getChild("Crown3R");

            this.Forehead = this.Head.getChild("Forehead");

            this.Crown2L = this.Head.getChild("Crown2L");

            this.Beak = this.Head.getChild("Beak");
            this.Jaw = this.Beak.getChild("Jaw");

            this.BeakTip = this.Beak.getChild("BeakTip");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 20.5F, 0.0F, 1.5481069932557485F, 0.0F, 0.0F));
            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(33, 11).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.5F, -0.2F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition Tail = TailBase.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(47, 15).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 3.0F, 0.0F));
            PartDefinition TailFeatherCenter = Tail.addOrReplaceChild("TailFeatherCenter", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition Wing1Left = Body.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(23, 22).addBox(0.0F, 0.0F, 0.0F, 2.0F, 5.0F, 1.0F), PartPose.offset(2.0F, -2.5F, 1.0F));

            PartDefinition LegLeft = Body.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.3F, 1.1F, -2.3F, -3.004933341200704F, 0.0F, -0.27314402127920984F));

            PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.3F, 1.1F, -2.3F, -3.004933341200704F, 0.0F, 0.27314402127920984F));

            PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(23, 22).mirror(true).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 5.0F, 1.0F), PartPose.offset(-2.0F, -2.5F, 1.01F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 11).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 0.2F, -0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 19).addBox(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.7F, 0.3F, -0.8651597048872669F, 0.0F, 0.0F));
            PartDefinition Crown2R = Head.addOrReplaceChild("Crown2R", CubeListBuilder.create().texOffs(41, 0).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.7F, -2.0F, 0.8F, -0.45535640450848164F, -0.13665927909957545F, -0.27314402127920984F));

            PartDefinition Crown1 = Head.addOrReplaceChild("Crown1", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 0.7F, -0.500909508638178F, 0.0F, 0.0F));

            PartDefinition Crown4L = Head.addOrReplaceChild("Crown4L", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.7F, -0.7F, 0.8F, -0.591841146688116F, 0.4098033003787853F, 0.0F));

            PartDefinition Crown4R = Head.addOrReplaceChild("Crown4R", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.7F, -0.7F, 0.8F, -0.591841146688116F, -0.4098033003787853F, 0.0F));

            PartDefinition Crown3L = Head.addOrReplaceChild("Crown3L", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.7F, -1.4F, 0.8F, -0.591841146688116F, 0.18203784630933073F, 0.0F));

            PartDefinition Crown3R = Head.addOrReplaceChild("Crown3R", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.7F, -1.4F, 0.8F, -0.591841146688116F, -0.18203784630933073F, 0.0F));

            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(14, 11).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.7F, 0.9F, 0.017453292519943295F, 0.0F, 0.0F));

            PartDefinition Crown2L = Head.addOrReplaceChild("Crown2L", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.7F, -2.0F, 0.8F, -0.45535640450848164F, 0.13665927909957545F, 0.27314402127920984F));

            PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.8F, -2.5F, 0.18203784630933073F, 0.0F, 0.0F));

            PartDefinition TailFeather1L = TailFeatherCenter.addOrReplaceChild("TailFeather1L", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.8F, -0.1F, -0.1F, 0.0F, 0.0F, -0.13665927909957545F));
            PartDefinition Wing2Right = Wing1Right.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(29, 22).mirror(true).addBox(-2.0F, -5.0F, 0.0F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, 5.01F, -0.01F, 0.0F, 0.0F, 0.2275909337942703F));
            PartDefinition TailFeather1R = TailFeatherCenter.addOrReplaceChild("TailFeather1R", CubeListBuilder.create().texOffs(28, 0).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-0.8F, -0.1F, -0.1F, 0.0F, 0.0F, 0.13665927909957545F));
            PartDefinition ThighLeft = LegLeft.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(24, 6).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.7F, 0.8F, 1.639038764463741F, 0.0F, -0.27314402127920984F));
            PartDefinition Jaw = Beak.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(20, 4).addBox(-0.5F, -0.25F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Wing3Right = Wing2Right.addOrReplaceChild("Wing3Right", CubeListBuilder.create().texOffs(35, 22).mirror(true).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, -5.0F, -0.01F, 0.0F, 0.0F, -0.18203784630933073F));
            PartDefinition TailFeather2L = TailFeather1L.addOrReplaceChild("TailFeather2L", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.1F, -0.3F, -0.1F, 0.0F, 0.0F, -0.13665927909957545F));
            PartDefinition ThighRight = LegRight.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(24, 6).mirror(true).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.7F, 0.8F, 1.639038764463741F, 0.0F, 0.27314402127920984F));
            PartDefinition BeakTip = Beak.addOrReplaceChild("BeakTip", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offset(0.0F, -1.5F, -1.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(32, 18).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 1.9577357900041064F, 0.18203784630933073F, 0.0F));
            PartDefinition Wing2Left = Wing1Left.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(29, 22).addBox(0.0F, -5.0F, 0.0F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(2.0F, 5.0F, -0.01F, 0.0F, 0.0F, -0.2275909337942703F));
            PartDefinition TailFeather2R = TailFeather1R.addOrReplaceChild("TailFeather2R", CubeListBuilder.create().texOffs(28, 0).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, -0.3F, -0.1F, 0.0F, 0.0F, 0.13665927909957545F));
            PartDefinition TailFeather3R = TailFeather2R.addOrReplaceChild("TailFeather3R", CubeListBuilder.create().texOffs(28, 0).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-0.2F, -0.3F, -0.1F, 0.0F, 0.0F, 0.04555309164612875F));
            PartDefinition TailFeather3L = TailFeather2L.addOrReplaceChild("TailFeather3L", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.2F, -0.3F, -0.1F, 0.0F, 0.0F, -0.04555309164612875F));
            PartDefinition Toe3L = FootLeft.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(33, 19).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -3.0960395494600967F, 0.04555309164612875F, 0.0F));
            PartDefinition Wing3Left = Wing2Left.addOrReplaceChild("Wing3Left", CubeListBuilder.create().texOffs(35, 22).addBox(0.0F, 0.0F, 0.0F, 3.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(2.0F, -5.0F, -0.01F, 0.0F, 0.0F, 0.18203784630933073F));
            PartDefinition WingTipL1 = Wing3Left.addOrReplaceChild("WingTipL1", CubeListBuilder.create().texOffs(28, 15).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(3.0F, 0.0F, -0.01F, 0.0F, 0.0F, -0.19198621771937624F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(32, 18).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 1.9577357900041064F, -0.18203784630933073F, 0.0F));
            PartDefinition Toe2R = FootRight.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(32, 18).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.2F, 0.1F, 0.2F, -2.5953045444523464F, 0.6373942508178124F, 0.0F));
            PartDefinition Toe1R = FootRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(32, 18).mirror(true).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.2F, -0.0911061832922575F, 0.3642502295386026F, -0.04555309164612875F));
            PartDefinition Toe2L = FootLeft.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(32, 18).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 0.1F, 0.2F, -2.5953045444523464F, -0.6373942508178124F, 0.0F));
            PartDefinition Toe1L = FootLeft.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(32, 18).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.2F, -0.0911061832922575F, -0.3642502295386026F, 0.04555309164612875F));
            PartDefinition Toe3R = FootRight.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(33, 19).mirror(true).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -3.0960395494600967F, -0.04555309164612875F, 0.0F));
            PartDefinition WingTipR1 = Wing3Right.addOrReplaceChild("WingTipR1", CubeListBuilder.create().texOffs(28, 15).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-3.0F, 0.0F, -0.01F, 0.0F, 0.0F, 0.19198621771937624F));
            PartDefinition WingTipR2 = WingTipR1.addOrReplaceChild("WingTipR2", CubeListBuilder.create().texOffs(28, 15).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.19198621771937624F));
            PartDefinition WingTipR3 = WingTipR2.addOrReplaceChild("WingTipR3", CubeListBuilder.create().texOffs(28, 15).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.19198621771937624F));
            PartDefinition WingTipR4 = WingTipR3.addOrReplaceChild("WingTipR4", CubeListBuilder.create().texOffs(28, 15).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.19198621771937624F));
            PartDefinition WingTipL5_1 = WingTipR4.addOrReplaceChild("WingTipL5_1", CubeListBuilder.create().texOffs(28, 15).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.19198621771937624F));
            PartDefinition WingTipL6_1 = WingTipL5_1.addOrReplaceChild("WingTipL6_1", CubeListBuilder.create().texOffs(28, 15).addBox(0.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.19198621771937624F));
            PartDefinition WingTipL2 = WingTipL1.addOrReplaceChild("WingTipL2", CubeListBuilder.create().texOffs(28, 15).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.19198621771937624F));
            PartDefinition WingTipL3 = WingTipL2.addOrReplaceChild("WingTipL3", CubeListBuilder.create().texOffs(28, 15).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.19198621771937624F));
            PartDefinition WingTipL4 = WingTipL3.addOrReplaceChild("WingTipL4", CubeListBuilder.create().texOffs(28, 15).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.19198621771937624F));
            PartDefinition WingTipL5 = WingTipL4.addOrReplaceChild("WingTipL5", CubeListBuilder.create().texOffs(28, 15).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.19198621771937624F));
            PartDefinition WingTipL6 = WingTipL5.addOrReplaceChild("WingTipL6", CubeListBuilder.create().texOffs(28, 15).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.19198621771937624F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + -0.87F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Body.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.1F + 1.548F;
            this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 20.5F;
            this.Neck.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.1F - 0.364F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.1F - 0.86F;
            this.Tail.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.5F;

            this.Wing1Left.yRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4F) * 0.5F - 0.364F;
            this.Wing1Left.x = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -3F) * 0.5F + 2.0F;
            this.Wing2Left.zRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.364F;
            this.Wing1Right.yRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.364F;
            this.Wing1Right.x = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 2.0F;
            this.Wing2Right.zRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.364F;
        }
    }

    public static class Adult<E extends Entity> extends HawkHeadedParrotModel<E> {
        public ModelPart WingFoldedLeft;
        public ModelPart WingFoldedRight;
        public ModelPart WingFoldedLeft1;
        public ModelPart WingFoldedRight1;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.LegLeft = this.Body.getChild("LegLeft");
            this.ThighLeft = this.LegLeft.getChild("ThighLeft");

            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Toe3L = this.FootLeft.getChild("Toe3L");

            this.Toe1L = this.FootLeft.getChild("Toe1L");

            this.Toe2L = this.FootLeft.getChild("Toe2L");

            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Crown3R = this.Head.getChild("Crown3R");

            this.Forehead = this.Head.getChild("Forehead");

            this.Crown2L = this.Head.getChild("Crown2L");

            this.Beak = this.Head.getChild("Beak");
            this.Jaw = this.Beak.getChild("Jaw");

            this.BeakTip = this.Beak.getChild("BeakTip");

            this.Crown3L = this.Head.getChild("Crown3L");

            this.Crown4L = this.Head.getChild("Crown4L");

            this.Crown1 = this.Head.getChild("Crown1");

            this.Crown4R = this.Head.getChild("Crown4R");

            this.Crown2R = this.Head.getChild("Crown2R");

            this.TailBase = this.Body.getChild("TailBase");
            this.Tail = this.TailBase.getChild("Tail");
            this.TailFeatherCenter = this.Tail.getChild("TailFeatherCenter");
            this.TailFeather1R = this.TailFeatherCenter.getChild("TailFeather1R");
            this.TailFeather2R = this.TailFeather1R.getChild("TailFeather2R");
            this.TailFeather3R = this.TailFeather2R.getChild("TailFeather3R");

            this.TailFeather1L = this.TailFeatherCenter.getChild("TailFeather1L");
            this.TailFeather2L = this.TailFeather1L.getChild("TailFeather2L");
            this.TailFeather3L = this.TailFeather2L.getChild("TailFeather3L");

            this.WingFoldedLeft = this.Body.getChild("WingFoldedLeft");
            this.WingFoldedLeft1 = this.WingFoldedLeft.getChild("WingFoldedLeft1");

            this.LegRight = this.Body.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Toe1R = this.FootRight.getChild("Toe1R");

            this.Toe2R = this.FootRight.getChild("Toe2R");

            this.Toe3R = this.FootRight.getChild("Toe3R");

            this.ThighRight = this.LegRight.getChild("ThighRight");

            this.WingFoldedRight = this.Body.getChild("WingFoldedRight");
            this.WingFoldedRight1 = this.WingFoldedRight.getChild("WingFoldedRight1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.0F, -2.5F, 4.0F, 6.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 19.3F, 0.0F, 1.092750655326294F, 0.0F, 0.0F));
            PartDefinition LegLeft = Body.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.6F, 1.1F, -2.5F, -1.092750655326294F, 0.0F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 11).addBox(-1.5F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 0.2F, -0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 19).addBox(-2.0F, -2.0F, -2.5F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, 0.7F, -0.6373942508178124F, 0.0F, 0.0F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(33, 11).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(-0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 2.5F, -0.2F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Tail = TailBase.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(47, 15).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F), PartPose.offset(0.0F, 3.0F, 0.0F));

            PartDefinition WingFoldedLeft = Body.addOrReplaceChild("WingFoldedLeft", CubeListBuilder.create().texOffs(44, 22).addBox(0.0F, 0.0F, 0.0F, 4.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(1.9F, -3.0F, 2.49F, 0.0F, 1.5707963267948966F, 0.0F));

            PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.6F, 1.1F, -2.5F, -1.092750655326294F, 0.0F, 0.0F));

            PartDefinition WingFoldedRight = Body.addOrReplaceChild("WingFoldedRight", CubeListBuilder.create().texOffs(44, 22).addBox(0.0F, 0.0F, -1.0F, 4.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(-1.9F, -3.0F, 2.49F, 0.0F, 1.5707963267948966F, 0.0F));

            PartDefinition Crown3R = Head.addOrReplaceChild("Crown3R", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.7F, -1.4F, 0.8F, -0.591841146688116F, -0.18203784630933073F, 0.0F));
            PartDefinition TailFeatherCenter = Tail.addOrReplaceChild("TailFeatherCenter", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            PartDefinition TailFeather1R = TailFeatherCenter.addOrReplaceChild("TailFeather1R", CubeListBuilder.create().texOffs(28, 0).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offset(-0.8F, -0.1F, -0.1F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(32, 18).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 0.13665927909957545F, -0.18203784630933073F, 0.0F));
            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(14, 11).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 2.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.7F, 0.9F, 0.017453292519943295F, 0.0F, 0.0F));
            PartDefinition ThighLeft = LegLeft.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(24, 6).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Crown2L = Head.addOrReplaceChild("Crown2L", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.7F, -2.0F, 0.8F, -0.45535640450848164F, 0.13665927909957545F, 0.27314402127920984F));
            PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(15, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.8F, -2.5F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition Jaw = Beak.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(20, 4).addBox(-0.5F, -0.25F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Crown3L = Head.addOrReplaceChild("Crown3L", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.7F, -1.4F, 0.8F, -0.591841146688116F, 0.18203784630933073F, 0.0F));
            PartDefinition Crown4L = Head.addOrReplaceChild("Crown4L", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.7F, -0.7F, 0.8F, -0.591841146688116F, 0.4098033003787853F, 0.0F));
            PartDefinition Toe1R = FootRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(32, 18).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.2F, -0.0911061832922575F, 0.3642502295386026F, -0.04555309164612875F));
            PartDefinition Crown1 = Head.addOrReplaceChild("Crown1", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.5F, 0.7F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition WingFoldedLeft1 = WingFoldedLeft.addOrReplaceChild("WingFoldedLeft1", CubeListBuilder.create().texOffs(39, 5).addBox(-1.8F, -1.5F, -0.5F, 3.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(2.0F, 6.0F, 0.3F, 0.0F, 0.0F, 0.6829473549475088F));
            PartDefinition TailFeather2R = TailFeather1R.addOrReplaceChild("TailFeather2R", CubeListBuilder.create().texOffs(28, 0).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-0.1F, -0.3F, -0.1F, 0.0F, 0.0F, 0.04555309164612875F));
            PartDefinition Toe2R = FootRight.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(32, 18).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.2F, 0.1F, 0.2F, -0.27314402127920984F, 0.6373942508178124F, 0.0F));
            PartDefinition WingFoldedRight1 = WingFoldedRight.addOrReplaceChild("WingFoldedRight1", CubeListBuilder.create().texOffs(39, 5).mirror(true).addBox(-1.8F, -1.5F, -1.1F, 3.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(2.0F, 6.0F, 0.3F, 0.0F, 0.0F, 0.6829473549475088F));
            PartDefinition ThighRight = LegRight.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(24, 6).mirror(true).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Crown4R = Head.addOrReplaceChild("Crown4R", CubeListBuilder.create().texOffs(41, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.7F, -0.7F, 0.8F, -0.591841146688116F, -0.4098033003787853F, 0.0F));
            PartDefinition BeakTip = Beak.addOrReplaceChild("BeakTip", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F, 0.0F, 0.0F)), PartPose.offset(0.0F, -1.5F, -1.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(32, 18).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, 0.13665927909957545F, 0.18203784630933073F, 0.0F));
            PartDefinition Toe3L = FootLeft.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(33, 19).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.04555309164612875F, 0.04555309164612875F, 0.0F));
            PartDefinition Toe1L = FootLeft.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(32, 18).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.2F, -0.0911061832922575F, -0.3642502295386026F, 0.04555309164612875F));
            PartDefinition Toe2L = FootLeft.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(32, 18).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 0.1F, 0.2F, -0.27314402127920984F, -0.6373942508178124F, 0.0F));
            PartDefinition TailFeather1L = TailFeatherCenter.addOrReplaceChild("TailFeather1L", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offset(0.8F, -0.1F, -0.1F));
            PartDefinition TailFeather2L = TailFeather1L.addOrReplaceChild("TailFeather2L", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.1F, -0.3F, -0.1F, 0.0F, 0.0F, -0.04555309164612875F));
            PartDefinition TailFeather3L = TailFeather2L.addOrReplaceChild("TailFeather3L", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.2F, -0.3F, -0.1F, 0.0F, 0.0F, -0.04555309164612875F));
            PartDefinition Toe3R = FootRight.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(33, 19).mirror(true).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.04555309164612875F, -0.04555309164612875F, 0.0F));
            PartDefinition TailFeather3R = TailFeather2R.addOrReplaceChild("TailFeather3R", CubeListBuilder.create().texOffs(28, 0).mirror(true).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-0.2F, -0.3F, -0.1F, 0.0F, 0.0F, 0.04555309164612875F));
            PartDefinition Crown2R = Head.addOrReplaceChild("Crown2R", CubeListBuilder.create().texOffs(41, 0).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.7F, -2.0F, 0.8F, -0.45535640450848164F, -0.13665927909957545F, -0.27314402127920984F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + -0.64F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos((limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + -0.36F;
            this.TailBase.xRot = Mth.cos(1.0F + (limbSwing * speed * 0.1F) + (float) Math.PI) * (degree * 0.1F) * limbSwingAmount * 0.5F + 0.227F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.07F) * 0.5F - 0.364F;
            this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.07F) * -0.5F - 0.45F;
            this.Body.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 1.092F;
            this.Body.yRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Body.y = Mth.cos(4.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.7F) * -0.5F + 19.4F;
            this.Tail.xRot = Mth.cos(1.0F + limbSwing * speed * 0.04F) * limbSwingAmount * (degree * -0.2F) * 0.5F;

            this.LegLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.1F) * 0.5F - 1.092F;
            this.LegLeft.y = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * -0.3F + 0.8F;
            this.LegLeft.z = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.2F) * -0.3F - 1.9F;
            this.FootLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.2F) * 0.5F + 0.136F;
            this.LegRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.1F) * -0.5F - 1.092F;
            this.LegRight.y = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * 0.3F + 0.8F;
            this.LegRight.z = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.2F) * 0.3F - 1.9F;
            this.FootRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.2F) * -0.5F + 0.136F;
        }
    }

    public static class Child<E extends Entity> extends HawkHeadedParrotModel<E> {
        public ModelPart WingLeft;
        public ModelPart WingRight;
        public ModelPart CrestCenter;
        public ModelPart BeakTip;
        public ModelPart CereLeft;
        public ModelPart CereRight;
        public ModelPart CrestLeft1;
        public ModelPart CrestRight1;
        public ModelPart CrestLeft2;
        public ModelPart CrestRight2;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.WingRight = this.Body.getChild("WingRight");

            this.WingLeft = this.Body.getChild("WingLeft");

            this.Tail = this.Body.getChild("Tail");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Toe3L = this.FootLeft.getChild("Toe3L");

            this.Toe1L = this.FootLeft.getChild("Toe1L");

            this.Toe2L = this.FootLeft.getChild("Toe2L");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Toe3R = this.FootRight.getChild("Toe3R");

            this.Toe1R = this.FootRight.getChild("Toe1R");

            this.Toe2R = this.FootRight.getChild("Toe2R");

            this.Neck = this.Body.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.CrestCenter = this.Head.getChild("CrestCenter");
            this.CrestLeft1 = this.CrestCenter.getChild("CrestLeft1");
            this.CrestLeft2 = this.CrestLeft1.getChild("CrestLeft2");

            this.CrestRight1 = this.CrestCenter.getChild("CrestRight1");
            this.CrestRight2 = this.CrestRight1.getChild("CrestRight2");

            this.Beak = this.Head.getChild("Beak");
            this.CereLeft = this.Beak.getChild("CereLeft");

            this.BeakTip = this.Beak.getChild("BeakTip");

            this.CereRight = this.Beak.getChild("CereRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 19.3F, 0.0F, -0.591841146688116F, 0.0F, 0.0F));
            PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(3, 24).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offset(-2.3F, -1.5F, -1.9F));

            PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(3, 24).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offset(2.3F, -1.5F, -1.9F));

            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5F, -1.0F, -0.3F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.3642502295386026F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(14, 19).addBox(0.0F, -0.6F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.1F, 0.7F, 0.7F, 0.9105382388075086F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(14, 19).mirror(true).addBox(-2.0F, -0.6F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, 0.7F, 0.7F, 0.9105382388075086F, 0.0F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(2, 0).addBox(-1.5F, -1.5F, -0.6F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -3.2F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.7F, -0.7F, 0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition CrestCenter = Head.addOrReplaceChild("CrestCenter", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, -0.7429866572476639F, 0.0F, 0.0F));

            PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -1.5F, 0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition CereLeft = Beak.addOrReplaceChild("CereLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F, 0.3F, 0.3F)), PartPose.offsetAndRotation(0.5F, -0.7F, -0.9F, -0.27366763203903305F, 0.19547687289441354F, -0.11728612207217244F));
            PartDefinition CrestLeft1 = CrestCenter.addOrReplaceChild("CrestLeft1", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.6F, 0.0F, 0.0F, -0.23474678106428595F, 0.0F, 0.0F));
            PartDefinition CrestLeft2 = CrestLeft1.addOrReplaceChild("CrestLeft2", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.6F, 0.0F, 0.0F, -0.23474678106428595F, 0.0F, 0.0F));
            PartDefinition BeakTip = Beak.addOrReplaceChild("BeakTip", CubeListBuilder.create().texOffs(8, 19).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.2405063662642867F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(22, 19).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, 2.0F, 0.2F, -0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(22, 22).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.6F, 0.0F, 0.7285004590772052F, 0.2275909337942703F, 0.0911061832922575F));
            PartDefinition Toe3L = FootLeft.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(22, 22).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.04555309164612875F, 0.04555309164612875F, 0.0F));
            PartDefinition CereRight = Beak.addOrReplaceChild("CereRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F, 0.3F, 0.3F)), PartPose.offsetAndRotation(-0.5F, -0.7F, -0.9F, -0.27366763203903305F, -0.19547687289441354F, 0.11728612207217244F));
            PartDefinition Toe1L = FootLeft.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(22, 22).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.2F, -0.0911061832922575F, -0.3642502295386026F, 0.04555309164612875F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(22, 19).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 2.0F, 0.2F, -0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition Toe2L = FootLeft.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(22, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 0.1F, 0.2F, -0.27314402127920984F, -0.6373942508178124F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(22, 22).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.6F, 0.0F, 0.7285004590772052F, -0.2275909337942703F, -0.0911061832922575F));
            PartDefinition Toe1R = FootRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(22, 22).mirror(true).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.2F, -0.0911061832922575F, 0.3642502295386026F, -0.04555309164612875F));
            PartDefinition Toe2R = FootRight.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(22, 22).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.2F, 0.1F, 0.2F, -0.27314402127920984F, 0.6373942508178124F, 0.0F));
            PartDefinition Toe3R = FootRight.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(22, 22).mirror(true).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.04555309164612875F, 0.04555309164612875F, 0.0F));
            PartDefinition CrestRight1 = CrestCenter.addOrReplaceChild("CrestRight1", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.6F, 0.0F, 0.0F, -0.23474678106428595F, 0.0F, 0.0F));
            PartDefinition CrestRight2 = CrestRight1.addOrReplaceChild("CrestRight2", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.6F, 0.0F, 0.0F, -0.23474678106428595F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.36F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}
