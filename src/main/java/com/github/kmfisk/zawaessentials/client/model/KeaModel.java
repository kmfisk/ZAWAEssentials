package com.github.kmfisk.zawaessentials.client.model;

import com.github.kmfisk.zawaessentials.entity.KeaEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class KeaModel extends ZawaBaseModel<KeaEntity> {
    public ModelPart Body;
    public ModelPart Neck;
    public ModelPart LegLeft;
    public ModelPart LegRight;
    public ModelPart Head;
    public ModelPart Beak;
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
    public ModelPart Tail1;
    public ModelPart Forehead;
    public ModelPart BeakTip;
    public ModelPart Mouth;
    public ModelPart Tail2;
    public ModelPart TailFeatherCenter;
    public ModelPart TailFeatherL1;
    public ModelPart TailFeatherR1;
    public ModelPart TailFeatherL2;
    public ModelPart TailFeatherL3;
    public ModelPart TailFeatherR2;
    public ModelPart TailFeatherR3;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) this.parts = ImmutableList.of(this.Body);
        return this.parts;
    }

    public static class Flying extends KeaModel {
        public ModelPart Wing1Left;
        public ModelPart Wing1Right;
        public ModelPart Wing2Left;
        public ModelPart Wing3Left;
        public ModelPart WingTip1L;
        public ModelPart WingTip2L;
        public ModelPart WingTip3L;
        public ModelPart WingTip4L;
        public ModelPart WingTip5L;
        public ModelPart WingTip6L;
        public ModelPart WingTip7L;
        public ModelPart WingTip8L;
        public ModelPart Wing2Right;
        public ModelPart Wing3Right;
        public ModelPart WingTip1R;
        public ModelPart WingTip2R;
        public ModelPart WingTip3R;
        public ModelPart WingTip4R;
        public ModelPart WingTip5R;
        public ModelPart WingTip6R;
        public ModelPart WingTip7R;
        public ModelPart WingTip8R;

        public Flying(ModelPart root) {
            this.Body = root.getChild("Body");
            this.WingTip4L = this.WingTip3L.getChild("WingTip4L");
            this.WingTip5L = this.WingTip4L.getChild("WingTip5L");
            this.WingTip2R = this.WingTip1R.getChild("WingTip2R");
            this.TailFeatherL3 = this.TailFeatherL2.getChild("TailFeatherL3");
            this.WingTip8L = this.WingTip7L.getChild("WingTip8L");
            this.FootLeft = this.ThighLeft.getChild("FootLeft");
            this.TailFeatherCenter = this.Tail2.getChild("TailFeatherCenter");
            this.Toe2R = this.FootRight.getChild("Toe2R");
            this.Wing3Left = this.Wing2Left.getChild("Wing3Left");
            this.WingTip1L = this.Wing3Left.getChild("WingTip1L");
            this.Head = this.Neck.getChild("Head");
            this.TailFeatherR2 = this.TailFeatherR1.getChild("TailFeatherR2");
            this.FootRight = this.ThighRight.getChild("FootRight");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");
            this.Toe1R = this.FootRight.getChild("Toe1R");
            this.Toe1L = this.FootLeft.getChild("Toe1L");
            this.WingTip7L = this.WingTip6L.getChild("WingTip7L");
            this.WingTip6L = this.WingTip5L.getChild("WingTip6L");
            this.Forehead = this.Head.getChild("Forehead");
            this.WingTip1R = this.Wing3Right.getChild("WingTip1R");
            this.Beak = this.Head.getChild("Beak");
            this.LegRight = this.Body.getChild("LegRight");
            this.LegLeft = this.Body.getChild("LegLeft");
            this.ThighRight = this.LegRight.getChild("ThighRight");
            this.WingTip3R = this.WingTip2R.getChild("WingTip3R");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail1 = this.Body.getChild("Tail1");
            this.TailFeatherR3 = this.TailFeatherR2.getChild("TailFeatherR3");
            this.BeakTip = this.Beak.getChild("BeakTip");
            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.Mouth = this.Beak.getChild("Mouth");
            this.TailFeatherL2 = this.TailFeatherL1.getChild("TailFeatherL2");
            this.WingTip2L = this.WingTip1L.getChild("WingTip2L");
            this.WingTip5R = this.WingTip4R.getChild("WingTip5R");
            this.Wing2Right = this.Wing1Right.getChild("Wing2Right");
            this.Toe2L = this.FootLeft.getChild("Toe2L");
            this.Toe3R = this.FootRight.getChild("Toe3R");
            this.Wing1Left = this.Body.getChild("Wing1Left");
            this.WingTip4R = this.WingTip3R.getChild("WingTip4R");
            this.Toe3L = this.FootLeft.getChild("Toe3L");
            this.WingTip6R = this.WingTip5R.getChild("WingTip6R");
            this.TailFeatherL1 = this.TailFeatherCenter.getChild("TailFeatherL1");
            this.WingTip3L = this.WingTip2L.getChild("WingTip3L");
            this.Neck = this.Body.getChild("Neck");
            this.WingTip8R = this.WingTip7R.getChild("WingTip8R");
            this.Wing3Right = this.Wing2Right.getChild("Wing3Right");
            this.TailFeatherR1 = this.TailFeatherCenter.getChild("TailFeatherR1");
            this.ThighLeft = this.LegLeft.getChild("ThighLeft");
            this.WingTip7R = this.WingTip6R.getChild("WingTip7R");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.5F, -2.5F, 5.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 20.2F, 0.0F, 1.5707963267948966F, 0.0F, 0.0F));
            PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(20, 14).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.6F, 1.2F, -1.8F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition ThighRight = LegRight.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(24, 14).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, -0.8F, 0.0F));
            PartDefinition FootRight = ThighRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(32, 15).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 1.2292353975059285F, -0.18203784630933073F, 0.0F));

            PartDefinition LegLeft = Body.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(20, 14).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.6F, 1.2F, -1.8F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition ThighLeft = LegLeft.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(24, 14).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offset(0.0F, -0.8F, 0.0F));
            PartDefinition FootLeft = ThighLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(32, 15).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 1.2292353975059285F, 0.18203784630933073F, 0.0F));

            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.5F, 0.2F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(20, 7).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offset(0.0F, 2.0F, 0.0F));
            PartDefinition TailFeatherCenter = Tail2.addOrReplaceChild("TailFeatherCenter", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offset(0.0F, 1.0F, 0.0F));

            PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(20, 18).mirror(true).addBox(-3.0F, 0.0F, 0.0F, 4.0F, 6.0F, 1.0F), PartPose.offset(-2.5F, -3.0F, 1.2F));
            PartDefinition Wing2Right = Wing1Right.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(30, 18).mirror(true).addBox(-3.0F, -7.0F, 0.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, -0.01F)), PartPose.offsetAndRotation(-3.0F, 7.0F, 0.0F, 0.0F, 0.0F, 0.18203784630933073F));
            PartDefinition Wing3Right = Wing2Right.addOrReplaceChild("Wing3Right", CubeListBuilder.create().texOffs(38, 18).mirror(true).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, -0.02F)), PartPose.offsetAndRotation(-3.0F, -7.0F, 0.0F, 0.0F, 0.0F, -0.18203784630933073F));
            PartDefinition WingTip1R = Wing3Right.addOrReplaceChild("WingTip1R", CubeListBuilder.create().texOffs(45, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, 0.0F, -0.01F, 0.0F, 0.0F, 0.13665927909957545F));

            PartDefinition Wing1Left = Body.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(20, 18).addBox(-1.0F, 0.0F, 0.0F, 4.0F, 6.0F, 1.0F), PartPose.offset(2.5F, -3.0F, 1.2F));
            PartDefinition Wing2Left = Wing1Left.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(30, 18).addBox(0.0F, -7.0F, 0.0F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, -0.01F)), PartPose.offsetAndRotation(3.0F, 7.0F, 0.0F, 0.0F, 0.0F, -0.18203784630933073F));
            PartDefinition Wing3Left = Wing2Left.addOrReplaceChild("Wing3Left", CubeListBuilder.create().texOffs(38, 18).addBox(0.0F, 0.0F, 0.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, -0.02F)), PartPose.offsetAndRotation(3.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.18203784630933073F));
            PartDefinition WingTip1L = Wing3Left.addOrReplaceChild("WingTip1L", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(2.0F, 0.0F, -0.01F, 0.0F, 0.0F, -0.13665927909957545F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.3F, 1.0F, -0.45535640450848164F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.3F, -1.1F, -0.7285004590772052F, 0.0F, 0.0F));
            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(0, 26).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 2.0F, 4.0F), PartPose.offset(0.0F, -3.0F, 1.5F));

            PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(12, 12).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.7F, -1.3F, -0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition Toe2R = FootRight.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(32, 15).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.2F, 0.1F, 0.2F, -0.27314402127920984F, 0.6373942508178124F, 0.0F));
            PartDefinition Toe1R = FootRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(32, 15).mirror(true).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.2F, -0.0911061832922575F, 0.3642502295386026F, -0.04555309164612875F));
            PartDefinition Toe1L = FootLeft.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(32, 15).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.2F, -0.0911061832922575F, -0.3642502295386026F, 0.04555309164612875F));
            PartDefinition BeakTip = Beak.addOrReplaceChild("BeakTip", CubeListBuilder.create().texOffs(16, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.8F, -2.0F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Mouth = Beak.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(12, 17).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offset(0.0F, 1.8F, -0.1F));
            PartDefinition Toe2L = FootLeft.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(32, 15).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 0.1F, 0.2F, -0.27314402127920984F, -0.6373942508178124F, 0.0F));
            PartDefinition Toe3R = FootRight.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(33, 16).mirror(true).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.04555309164612875F, -0.04555309164612875F, 0.0F));
            PartDefinition Toe3L = FootLeft.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(33, 16).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.04555309164612875F, 0.04555309164612875F, 0.0F));
            PartDefinition TailFeatherL1 = TailFeatherCenter.addOrReplaceChild("TailFeatherL1", CubeListBuilder.create().texOffs(34, 5).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(1.5F, -1.6F, -0.1F, 0.0F, 0.0F, -0.27314402127920984F));
            PartDefinition TailFeatherL2 = TailFeatherL1.addOrReplaceChild("TailFeatherL2", CubeListBuilder.create().texOffs(34, 5).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.5F, -0.6F, -0.1F, 0.0F, 0.0F, -0.27314402127920984F));
            PartDefinition TailFeatherL3 = TailFeatherL2.addOrReplaceChild("TailFeatherL3", CubeListBuilder.create().texOffs(34, 5).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.5F, -0.6F, -0.1F, 0.0F, 0.0F, -0.27314402127920984F));
            PartDefinition TailFeatherR1 = TailFeatherCenter.addOrReplaceChild("TailFeatherR1", CubeListBuilder.create().texOffs(34, 5).mirror(true).addBox(0.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -1.6F, -0.1F, 0.0F, 0.0F, 0.27314402127920984F));
            PartDefinition TailFeatherR2 = TailFeatherR1.addOrReplaceChild("TailFeatherR2", CubeListBuilder.create().texOffs(34, 5).mirror(true).addBox(0.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, -0.6F, -0.1F, 0.0F, 0.0F, 0.27314402127920984F));
            PartDefinition TailFeatherR3 = TailFeatherR2.addOrReplaceChild("TailFeatherR3", CubeListBuilder.create().texOffs(34, 5).mirror(true).addBox(0.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, -0.6F, -0.1F, 0.0F, 0.0F, 0.27314402127920984F));
            PartDefinition WingTip2L = WingTip1L.addOrReplaceChild("WingTip2L", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.13665927909957545F));
            PartDefinition WingTip3L = WingTip2L.addOrReplaceChild("WingTip3L", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.13665927909957545F));
            PartDefinition WingTip4L = WingTip3L.addOrReplaceChild("WingTip4L", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.13665927909957545F));
            PartDefinition WingTip5L = WingTip4L.addOrReplaceChild("WingTip5L", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.13665927909957545F));
            PartDefinition WingTip6L = WingTip5L.addOrReplaceChild("WingTip6L", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.13665927909957545F));
            PartDefinition WingTip7L = WingTip6L.addOrReplaceChild("WingTip7L", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.13665927909957545F));
            PartDefinition WingTip8L = WingTip7L.addOrReplaceChild("WingTip8L", CubeListBuilder.create().texOffs(45, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.13665927909957545F));
            PartDefinition WingTip2R = WingTip1R.addOrReplaceChild("WingTip2R", CubeListBuilder.create().texOffs(45, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.13665927909957545F));
            PartDefinition WingTip3R = WingTip2R.addOrReplaceChild("WingTip3R", CubeListBuilder.create().texOffs(45, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.13665927909957545F));
            PartDefinition WingTip4R = WingTip3R.addOrReplaceChild("WingTip4R", CubeListBuilder.create().texOffs(45, 0).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.13665927909957545F));
            PartDefinition WingTip5R = WingTip4R.addOrReplaceChild("WingTip5R", CubeListBuilder.create().texOffs(45, 0).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.13665927909957545F));
            PartDefinition WingTip6R = WingTip5R.addOrReplaceChild("WingTip6R", CubeListBuilder.create().texOffs(45, 0).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.13665927909957545F));
            PartDefinition WingTip7R = WingTip6R.addOrReplaceChild("WingTip7R", CubeListBuilder.create().texOffs(45, 0).mirror(true).addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.13665927909957545F));
            PartDefinition WingTip8R = WingTip7R.addOrReplaceChild("WingTip8R", CubeListBuilder.create().texOffs(45, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.13665927909957545F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(KeaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

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
            this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.5F;

            this.Wing1Left.yRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4F) * 0.5F - 0.364F;
            this.Wing1Left.x = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -3F) * 0.5F + 2.0F;
            this.Wing2Left.zRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.364F;
            this.Wing1Right.yRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.364F;
            this.Wing1Right.x = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 2.0F;
            this.Wing2Right.zRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.364F;

        }
    }

    public static class Adult extends KeaModel {
        public ModelPart WingFoldedLeft;
        public ModelPart WingFoldedRight;
        public ModelPart WingFoldedLeft1;
        public ModelPart WingFoldedRight1;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.WingFoldedRight1 = this.WingFoldedRight.getChild("WingFoldedRight1");
            this.TailFeatherL1 = this.TailFeatherCenter.getChild("TailFeatherL1");
            this.BeakTip = this.Beak.getChild("BeakTip");
            this.WingFoldedRight = this.Body.getChild("WingFoldedRight");
            this.Head = this.Neck.getChild("Head");
            this.TailFeatherR1 = this.TailFeatherCenter.getChild("TailFeatherR1");
            this.TailFeatherR2 = this.TailFeatherR1.getChild("TailFeatherR2");
            this.Mouth = this.Beak.getChild("Mouth");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.TailFeatherR3 = this.TailFeatherR2.getChild("TailFeatherR3");
            this.Neck = this.Body.getChild("Neck");
            this.Toe1R = this.FootRight.getChild("Toe1R");
            this.WingFoldedLeft1 = this.WingFoldedLeft.getChild("WingFoldedLeft1");
            this.ThighLeft = this.LegLeft.getChild("ThighLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.LegRight = this.Body.getChild("LegRight");
            this.WingFoldedLeft = this.Body.getChild("WingFoldedLeft");
            this.Toe1L = this.FootLeft.getChild("Toe1L");
            this.TailFeatherL3 = this.TailFeatherL2.getChild("TailFeatherL3");
            this.Toe2L = this.FootLeft.getChild("Toe2L");
            this.LegLeft = this.Body.getChild("LegLeft");
            this.Toe3L = this.FootLeft.getChild("Toe3L");
            this.Beak = this.Head.getChild("Beak");
            this.Tail1 = this.Body.getChild("Tail1");
            this.Toe3R = this.FootRight.getChild("Toe3R");
            this.TailFeatherCenter = this.Tail2.getChild("TailFeatherCenter");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Toe2R = this.FootRight.getChild("Toe2R");
            this.Forehead = this.Head.getChild("Forehead");
            this.ThighRight = this.LegRight.getChild("ThighRight");
            this.TailFeatherL2 = this.TailFeatherL1.getChild("TailFeatherL2");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -3.5F, -2.5F, 5.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 18.3F, 0.0F, 0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition WingFoldedRight = Body.addOrReplaceChild("WingFoldedRight", CubeListBuilder.create().texOffs(40, 7).mirror(true).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(-2.1F, -2.6F, 0.7F, 0.3295181481291434F, 0.0F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 12).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -3.0F, 1.0F, -0.7285004590772052F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 18).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -1.3F, -1.1F, -0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(12, 12).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.7F, -1.3F, -0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(0, 26).addBox(-1.5F, 0.0F, -4.0F, 3.0F, 2.0F, 4.0F), PartPose.offset(0.0F, -3.0F, 1.5F));

            PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(20, 14).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-1.6F, 1.2F, -1.8F, -0.9105382388075086F, 0.0F, 0.0F));

            PartDefinition WingFoldedLeft = Body.addOrReplaceChild("WingFoldedLeft", CubeListBuilder.create().texOffs(40, 7).addBox(0.0F, 0.0F, -2.5F, 1.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(2.1F, -2.6F, 0.7F, 0.3295181481291434F, 0.0F, 0.0F));

            PartDefinition LegLeft = Body.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(20, 14).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(1.6F, 1.2F, -1.8F, -0.9105382388075086F, 0.0F, 0.0F));

            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.5F, 0.2F, 0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(20, 7).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 3.0F, 2.0F), PartPose.offset(0.0F, 2.0F, 0.0F));
            PartDefinition TailFeatherCenter = Tail2.addOrReplaceChild("TailFeatherCenter", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition WingFoldedRight1 = WingFoldedRight.addOrReplaceChild("WingFoldedRight1", CubeListBuilder.create().texOffs(50, 9).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.2F, 4.5F, -2.5F, 0.40142572795869574F, 0.0F, -0.13962634015954636F));
            PartDefinition TailFeatherL1 = TailFeatherCenter.addOrReplaceChild("TailFeatherL1", CubeListBuilder.create().texOffs(34, 5).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(1.4F, -1.4F, -0.1F, 0.0F, 0.0F, -0.0911061832922575F));
            PartDefinition BeakTip = Beak.addOrReplaceChild("BeakTip", CubeListBuilder.create().texOffs(16, 20).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.3F, 0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, -2.0F, -0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition TailFeatherR1 = TailFeatherCenter.addOrReplaceChild("TailFeatherR1", CubeListBuilder.create().texOffs(34, 5).mirror(true).addBox(0.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-1.5F, -1.4F, -0.1F, 0.0F, 0.0F, 0.0911061832922575F));
            PartDefinition TailFeatherR2 = TailFeatherR1.addOrReplaceChild("TailFeatherR2", CubeListBuilder.create().texOffs(34, 5).mirror(true).addBox(0.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-0.2F, -0.3F, -0.1F, 0.0F, 0.0F, 0.04555309164612875F));
            PartDefinition Mouth = Beak.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(12, 17).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F, 0.0F, 0.0F)), PartPose.offset(0.0F, 1.8F, -0.1F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(32, 15).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.13665927909957545F, -0.18203784630933073F, 0.0F));
            PartDefinition TailFeatherR3 = TailFeatherR2.addOrReplaceChild("TailFeatherR3", CubeListBuilder.create().texOffs(34, 5).mirror(true).addBox(0.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F), PartPose.offset(-0.3F, -0.6F, -0.1F));
            PartDefinition Toe1R = FootRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(32, 15).mirror(true).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.2F, -0.0911061832922575F, 0.3642502295386026F, -0.04555309164612875F));
            PartDefinition WingFoldedLeft1 = WingFoldedLeft.addOrReplaceChild("WingFoldedLeft1", CubeListBuilder.create().texOffs(50, 9).addBox(0.0F, 0.0F, 0.0F, 1.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(-0.2F, 4.5F, -2.5F, 0.40142572795869574F, 0.0F, 0.13962634015954636F));
            PartDefinition ThighLeft = LegLeft.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(24, 14).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.19547687289441354F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(32, 15).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.13665927909957545F, 0.18203784630933073F, 0.0F));
            PartDefinition Toe1L = FootLeft.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(32, 15).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.2F, -0.0911061832922575F, -0.3642502295386026F, 0.04555309164612875F));
            PartDefinition TailFeatherL2 = TailFeatherL1.addOrReplaceChild("TailFeatherL2", CubeListBuilder.create().texOffs(34, 5).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.2F, -0.3F, -0.1F, 0.0F, 0.0F, -0.04555309164612875F));
            PartDefinition TailFeatherL3 = TailFeatherL2.addOrReplaceChild("TailFeatherL3", CubeListBuilder.create().texOffs(34, 5).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 5.0F, 1.0F), PartPose.offset(0.3F, -0.3F, -0.1F));
            PartDefinition Toe2L = FootLeft.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(32, 15).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 0.1F, 0.2F, -0.27314402127920984F, -0.6373942508178124F, 0.0F));
            PartDefinition Toe3L = FootLeft.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(33, 16).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.04555309164612875F, 0.04555309164612875F, 0.0F));
            PartDefinition Toe3R = FootRight.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(33, 16).mirror(true).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.04555309164612875F, -0.04555309164612875F, 0.0F));
            PartDefinition Toe2R = FootRight.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(32, 15).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.2F, 0.1F, 0.2F, -0.27314402127920984F, 0.6373942508178124F, 0.0F));
            PartDefinition ThighRight = LegRight.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(24, 14).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.19547687289441354F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(KeaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.045F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(4.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * -0.5F - 0.72F;
            this.Head.xRot = Mth.cos(1.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.045F;
            this.Tail1.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.136F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.3f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * -0.5F - 0.72F;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.045F;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 0.91F;
            this.Body.yRot = Mth.cos(4.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.3F) * 0.5F;
            this.Body.y = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 2F) * -0.5F + 18.3F;
            this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.136F;

            this.LegLeft.xRot = Mth.cos(limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.6F) * 0.5F - 0.91F;
            this.LegLeft.y = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 1.8F) * -0.3F + 1.2F;
            this.LegLeft.z = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.2F) * -0.3F - 1.9F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.8F) * 0.5F + 0.136F;
            this.LegRight.xRot = Mth.cos(limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.6F) * 0.5F - 0.91F;
            this.LegRight.y = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -1.8F) * -0.3F + 1.2F;
            this.LegRight.z = Mth.cos(3.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.2F) * -0.3F - 1.9F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.8F) * 0.5F + 0.136F;

        }
    }

    public static class Child extends KeaModel {
        public ModelPart Tail;
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
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.CrestLeft2 = this.CrestLeft1.getChild("CrestLeft2");
            this.WingRight = this.Body.getChild("WingRight");
            this.WingLeft = this.Body.getChild("WingLeft");
            this.CrestRight2 = this.CrestRight1.getChild("CrestRight2");
            this.CereLeft = this.Beak.getChild("CereLeft");
            this.Head = this.Neck.getChild("Head");
            this.CrestLeft1 = this.CrestCenter.getChild("CrestLeft1");
            this.Tail = this.Body.getChild("Tail");
            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.BeakTip = this.Beak.getChild("BeakTip");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.Toe3L = this.FootLeft.getChild("Toe3L");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.CereRight = this.Beak.getChild("CereRight");
            this.Toe3R = this.FootRight.getChild("Toe3R");
            this.Neck = this.Body.getChild("Neck");
            this.CrestCenter = this.Head.getChild("CrestCenter");
            this.Toe1L = this.FootLeft.getChild("Toe1L");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.Toe1R = this.FootRight.getChild("Toe1R");
            this.Toe2L = this.FootLeft.getChild("Toe2L");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.Toe2R = this.FootRight.getChild("Toe2R");
            this.Beak = this.Head.getChild("Beak");
            this.CrestRight1 = this.CrestCenter.getChild("CrestRight1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 19.3F, 0.0F, -0.591841146688116F, 0.0F, 0.0F));
            PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(3, 24).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offset(-2.3F, -1.5F, -1.9F));

            PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(3, 24).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 5.0F), PartPose.offset(2.3F, -1.5F, -1.9F));

            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5F, -1.0F, -0.3F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.3642502295386026F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(14, 19).addBox(0.0F, -0.6F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.1F, 0.7F, 0.7F, 0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(22, 19).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.0F, 2.0F, 0.2F, -0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(22, 22).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.6F, 0.0F, 0.7285004590772052F, 0.2275909337942703F, 0.0911061832922575F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(14, 19).mirror(true).addBox(-2.0F, -0.6F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.1F, 0.7F, 0.7F, 0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(22, 19).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, 2.0F, 0.2F, -0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(22, 22).mirror(true).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.6F, 0.0F, 0.7285004590772052F, -0.2275909337942703F, -0.0911061832922575F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(2, 0).addBox(-1.5F, -1.5F, -0.6F, 3.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.4F, -3.2F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.7F, -0.7F, 0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition CrestCenter = Head.addOrReplaceChild("CrestCenter", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, -0.7429866572476639F, 0.0F, 0.0F));

            PartDefinition Beak = Head.addOrReplaceChild("Beak", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, -1.5F, 0.27314402127920984F, 0.0F, 0.0F));

            PartDefinition CereLeft = Beak.addOrReplaceChild("CereLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F, 0.3F, 0.3F)), PartPose.offsetAndRotation(0.5F, -0.7F, -0.9F, -0.27366763203903305F, 0.19547687289441354F, -0.11728612207217244F));
            PartDefinition CrestLeft1 = CrestCenter.addOrReplaceChild("CrestLeft1", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.6F, 0.0F, 0.0F, -0.23474678106428595F, 0.0F, 0.0F));
            PartDefinition CrestLeft2 = CrestLeft1.addOrReplaceChild("CrestLeft2", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.6F, 0.0F, 0.0F, -0.23474678106428595F, 0.0F, 0.0F));
            PartDefinition BeakTip = Beak.addOrReplaceChild("BeakTip", CubeListBuilder.create().texOffs(8, 19).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, -0.2405063662642867F, 0.0F, 0.0F));
            PartDefinition Toe3L = FootLeft.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(22, 22).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.04555309164612875F, 0.04555309164612875F, 0.0F));
            PartDefinition CereRight = Beak.addOrReplaceChild("CereRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F, 0.3F, 0.3F)), PartPose.offsetAndRotation(-0.5F, -0.7F, -0.9F, -0.27366763203903305F, -0.19547687289441354F, 0.11728612207217244F));
            PartDefinition CrestRight1 = CrestCenter.addOrReplaceChild("CrestRight1", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.6F, 0.0F, 0.0F, -0.23474678106428595F, 0.0F, 0.0F));
            PartDefinition CrestRight2 = CrestRight1.addOrReplaceChild("CrestRight2", CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.6F, 0.0F, 0.0F, -0.23474678106428595F, 0.0F, 0.0F));
            PartDefinition Toe3R = FootRight.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(22, 22).mirror(true).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.3F, 0.2F, -0.04555309164612875F, 0.04555309164612875F, 0.0F));
            PartDefinition Toe1L = FootLeft.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(22, 22).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.2F, -0.0911061832922575F, -0.3642502295386026F, 0.04555309164612875F));
            PartDefinition Toe1R = FootRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(22, 22).mirror(true).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.2F, 0.2F, -0.0911061832922575F, 0.3642502295386026F, -0.04555309164612875F));
            PartDefinition Toe2L = FootLeft.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(22, 22).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.2F, 0.1F, 0.2F, -0.27314402127920984F, -0.6373942508178124F, 0.0F));
            PartDefinition Toe2R = FootRight.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(22, 22).mirror(true).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.2F, 0.1F, 0.2F, -0.27314402127920984F, 0.6373942508178124F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(KeaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }
    }
}
