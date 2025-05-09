package com.github.kmfisk.zawaessentials.client.model;

import com.github.kmfisk.zawaessentials.entity.MohoEntity;
import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class MohoModel extends ZawaBaseModel<MohoEntity> {
    public ModelPart Body;
    public ModelPart Chest;
    public ModelPart TailBase;
    public ModelPart ThighLeft;
    public ModelPart ThighRight;
    public ModelPart Neck;
    public ModelPart Head;
    public ModelPart BeakTop;
    public ModelPart Beak2;
    public ModelPart BeakSideLeft;
    public ModelPart BeakSideLeft_1;
    public ModelPart Mouth;
    public ModelPart Tail1L;
    public ModelPart Tail1R;
    public ModelPart TailCenter;
    public ModelPart Tail1L_1;
    public ModelPart Tail1R_1;
    public ModelPart TailCenterTop;
    public ModelPart Tail2L;
    public ModelPart Tail3L;
    public ModelPart Tail4L;
    public ModelPart Tail2R;
    public ModelPart Tail3L_1;
    public ModelPart Tail4R;
    public ModelPart LegLeft;
    public ModelPart Toe1L;
    public ModelPart Toe2L;
    public ModelPart Toe3L;
    public ModelPart LegRight;
    public ModelPart Toe1R;
    public ModelPart Toe2R;
    public ModelPart Toe3R;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) this.parts = ImmutableList.of(this.Body);
        return this.parts;
    }

    public static class Flying extends MohoModel {
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
        public ModelPart Wing2Right;
        public ModelPart Wing3Right;
        public ModelPart WingTip1R;
        public ModelPart WingTip2R;
        public ModelPart WingTip3R;
        public ModelPart WingTip4L_1;
        public ModelPart WingTip5R;
        public ModelPart WingTip6R;

        public Flying(ModelPart root) {
            this.Body = root.getChild("Body");
            this.TailBase = this.Body.getChild("TailBase");
            this.Tail1L = this.TailBase.getChild("Tail1L");
            this.Tail1R = this.Tail1L.getChild("Tail1R");

            this.TailCenter = this.Tail1L.getChild("TailCenter");
            this.Tail1L_1 = this.TailCenter.getChild("Tail1L_1");
            this.Tail2L = this.Tail1L_1.getChild("Tail2L");
            this.Tail3L = this.Tail2L.getChild("Tail3L");
            this.Tail4L = this.Tail3L.getChild("Tail4L");

            this.TailCenterTop = this.TailCenter.getChild("TailCenterTop");

            this.Tail1R_1 = this.TailCenter.getChild("Tail1R_1");
            this.Tail2R = this.Tail1R_1.getChild("Tail2R");
            this.Tail3L_1 = this.Tail2R.getChild("Tail3L_1");
            this.Tail4R = this.Tail3L_1.getChild("Tail4R");

            this.Wing1Left = this.Body.getChild("Wing1Left");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");
            this.Wing3Left = this.Wing2Left.getChild("Wing3Left");
            this.WingTip1L = this.Wing3Left.getChild("WingTip1L");

            this.Chest = this.Body.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.BeakTop = this.Head.getChild("BeakTop");
            this.BeakSideLeft = this.BeakTop.getChild("BeakSideLeft");

            this.Mouth = this.BeakTop.getChild("Mouth");

            this.Beak2 = this.BeakTop.getChild("Beak2");

            this.BeakSideLeft_1 = this.BeakTop.getChild("BeakSideLeft_1");

            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.Wing2Right = this.Wing1Right.getChild("Wing2Right");
            this.Wing3Right = this.Wing2Right.getChild("Wing3Right");
            this.WingTip1R = this.Wing3Right.getChild("WingTip1R");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.Toe1R = this.LegRight.getChild("Toe1R");
            this.Toe3R = this.Toe1R.getChild("Toe3R");

            this.Toe2R = this.Toe1R.getChild("Toe2R");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.Toe1L = this.LegLeft.getChild("Toe1L");
            this.Toe3L = this.Toe1L.getChild("Toe3L");

            this.Toe2L = this.Toe1L.getChild("Toe2L");

            this.WingTip2R = this.WingTip1R.getChild("WingTip2R");
            this.WingTip3R = this.WingTip2R.getChild("WingTip3R");
            this.WingTip4L_1 = this.WingTip3R.getChild("WingTip4L_1");
            this.WingTip5R = this.WingTip4L_1.getChild("WingTip5R");
            this.WingTip6R = this.WingTip5R.getChild("WingTip6R");
            this.WingTip2L = this.WingTip1L.getChild("WingTip2L");
            this.WingTip3L = this.WingTip2L.getChild("WingTip3L");
            this.WingTip4L = this.WingTip3L.getChild("WingTip4L");
            this.WingTip5L = this.WingTip4L.getChild("WingTip5L");
            this.WingTip6L = this.WingTip5L.getChild("WingTip6L");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.5F, 4, 5, 4), PartPose.offset(0.0F, 20.5F, 0.0F));
            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5F, -2.0F, -0.5F, 3, 4, 2), PartPose.offsetAndRotation(0.0F, 0.4F, 1.0F, -0.40980330836826856F, 0.0F, 0.0F));
            PartDefinition Tail1L = TailBase.addOrReplaceChild("Tail1L", CubeListBuilder.create().texOffs(16, 6).addBox(-1.0F, -1.0F, -0.5F, 2, 2, 2), PartPose.offset(0.3F, 0.1F, 1.5F));
            PartDefinition Tail1R = Tail1L.addOrReplaceChild("Tail1R", CubeListBuilder.create().texOffs(16, 6).addBox(-1.0F, -1.0F, -0.5F, 2, 2, 2), PartPose.offset(-0.7F, 0.0F, 0.0F));

            PartDefinition TailCenter = Tail1L.addOrReplaceChild("TailCenter", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -0.5F, 0.0F, 2, 1, 6), PartPose.offset(-0.3F, -0.2F, 1.5F));
            PartDefinition Tail1L_1 = TailCenter.addOrReplaceChild("Tail1L_1", CubeListBuilder.create().texOffs(17, 7).addBox(-1.0F, -0.5F, 0.0F, 1, 1, 7), PartPose.offsetAndRotation(1.2F, 0.2F, -0.4F, 0.0F, 0.03490658503988659F, 0.0F));

            PartDefinition TailCenterTop = TailCenter.addOrReplaceChild("TailCenterTop", CubeListBuilder.create().texOffs(18, 15).addBox(-0.5F, 0.0F, 0.0F, 1, 1, 4), PartPose.offset(0.0F, -0.7F, 0.0F));

            PartDefinition Tail1R_1 = TailCenter.addOrReplaceChild("Tail1R_1", CubeListBuilder.create().texOffs(17, 7).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1, 1, 7), PartPose.offsetAndRotation(-1.2F, 0.2F, -0.4F, 0.0F, -0.03490658503988659F, 0.0F));
            PartDefinition Tail2R = Tail1R_1.addOrReplaceChild("Tail2R", CubeListBuilder.create().texOffs(17, 7).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1, 1, 7), PartPose.offsetAndRotation(-0.2F, 0.2F, -0.4F, 0.0F, -0.017453292519943295F, 0.0F));
            PartDefinition Tail3L_1 = Tail2R.addOrReplaceChild("Tail3L_1", CubeListBuilder.create().texOffs(17, 7).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1, 1, 7), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0F, -0.017453292519943295F, 0.0F));
            PartDefinition Tail4R = Tail3L_1.addOrReplaceChild("Tail4R", CubeListBuilder.create().texOffs(10, 15).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1, 1, 6), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0F, -0.017453292519943295F, 0.0F));

            PartDefinition Wing1Left = Body.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(26, 7).addBox(-1.0F, -0.5F, 0.0F, 3, 1, 5), PartPose.offsetAndRotation(1.5F, -1.0F, -2.5F, -0.18203784098300857F, 0.0F, 0.0F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 9).addBox(-1.5F, -3.0F, 0.0F, 3, 3, 4), PartPose.offsetAndRotation(0.0F, 2.7F, -2.5F, 1.0471975511965976F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -3.0F, 0.0F, 2, 3, 3), PartPose.offsetAndRotation(0.0F, -3.0F, 0.45F, -0.40980330836826856F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 22).addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3), PartPose.offsetAndRotation(0.0F, -2.3F, 1.3F, -0.4553564018453205F, 0.0F, 0.0F));
            PartDefinition BeakTop = Head.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, 0.045553093477052F, 0.0F, 0.0F));

            PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(26, 7).mirror(true).addBox(-2.0F, -0.5F, 0.0F, 3, 1, 5), PartPose.offsetAndRotation(-1.5F, -1.0F, -2.5F, -0.18203784098300857F, -0.091106186954104F, 0.0F));
            PartDefinition Wing2Right = Wing1Right.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(28, 13).mirror(true).addBox(-2.0F, -0.5F, -5.0F, 2, 1, 5), PartPose.offsetAndRotation(-2.0F, 0.0F, 5.0F, 0.0F, -0.18203784098300857F, 0.0F));
            PartDefinition Wing3Right = Wing2Right.addOrReplaceChild("Wing3Right", CubeListBuilder.create().texOffs(23, 19).mirror(true).addBox(-2.0F, -0.5F, 0.0F, 2, 1, 5), PartPose.offsetAndRotation(-2.0F, 0.0F, -5.0F, 0.0F, 0.27314402793711257F, 0.0F));
            PartDefinition WingTip1R = Wing3Right.addOrReplaceChild("WingTip1R", CubeListBuilder.create().texOffs(18, 25).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1, 1, 5), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, -0.18203784098300857F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(15, 22).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(-1.2F, 1.4F, -0.7F, 0.7740535232594852F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(12, 26).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1), PartPose.offsetAndRotation(-0.3F, 2.0F, 0.5F, -1.5481070465189704F, 0.0F, 0.0F));
            PartDefinition Toe1R = LegRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(10, 9).mirror(true).addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, 1.5F, -0.4F, 1.1383037381507017F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(15, 22).addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(1.2F, 1.4F, -0.7F, 0.7740535232594852F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(12, 26).addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1), PartPose.offsetAndRotation(0.3F, 2.0F, 0.5F, -1.5481070465189704F, 0.0F, 0.0F));
            PartDefinition Toe1L = LegLeft.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(10, 9).addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, 1.5F, -0.4F, 1.1383037381507017F, 0.0F, 0.0F));

            PartDefinition WingTip2R = WingTip1R.addOrReplaceChild("WingTip2R", CubeListBuilder.create().texOffs(18, 25).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1, 1, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.18203784098300857F, 0.0F));
            PartDefinition Tail2L = Tail1L_1.addOrReplaceChild("Tail2L", CubeListBuilder.create().texOffs(17, 7).addBox(-1.0F, -0.5F, 0.0F, 1, 1, 7), PartPose.offsetAndRotation(0.2F, 0.2F, -0.4F, 0.0F, 0.017453292519943295F, 0.0F));
            PartDefinition Tail3L = Tail2L.addOrReplaceChild("Tail3L", CubeListBuilder.create().texOffs(17, 7).addBox(-1.0F, -0.5F, 0.0F, 1, 1, 7), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0F, 0.017453292519943295F, 0.0F));
            PartDefinition Toe3R = Toe1R.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(16, 10).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, 0.36425021489121656F, 0.0F));
            PartDefinition BeakSideLeft = BeakTop.addOrReplaceChild("BeakSideLeft", CubeListBuilder.create().texOffs(6, 28).addBox(-1.0F, 0.0F, -1.5F, 1, 1, 2), PartPose.offsetAndRotation(0.7F, 0.1F, -0.1F, 0.0F, 0.045553093477052F, 0.0F));
            PartDefinition Tail4L = Tail3L.addOrReplaceChild("Tail4L", CubeListBuilder.create().texOffs(10, 15).addBox(-1.0F, -0.5F, 0.0F, 1, 1, 6), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0F, 0.017453292519943295F, 0.0F));
            PartDefinition Wing2Left = Wing1Left.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(28, 13).addBox(0.0F, -0.5F, -5.0F, 2, 1, 5), PartPose.offsetAndRotation(2.0F, 0.0F, 5.0F, 0.0F, 0.18203784098300857F, 0.0F));
            PartDefinition WingTip3R = WingTip2R.addOrReplaceChild("WingTip3R", CubeListBuilder.create().texOffs(18, 25).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1, 1, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.18203784098300857F, 0.0F));
            PartDefinition WingTip4L_1 = WingTip3R.addOrReplaceChild("WingTip4L_1", CubeListBuilder.create().texOffs(18, 25).addBox(0.0F, -0.5F, 0.0F, 1, 1, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.18203784098300857F, 0.0F));
            PartDefinition WingTip5R = WingTip4L_1.addOrReplaceChild("WingTip5R", CubeListBuilder.create().texOffs(18, 25).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1, 1, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.18203784098300857F, 0.0F));
            PartDefinition Wing3Left = Wing2Left.addOrReplaceChild("Wing3Left", CubeListBuilder.create().texOffs(23, 19).addBox(0.0F, -0.5F, 0.0F, 2, 1, 5), PartPose.offsetAndRotation(2.0F, 0.0F, -5.0F, 0.0F, -0.27314402793711257F, 0.0F));
            PartDefinition WingTip6R = WingTip5R.addOrReplaceChild("WingTip6R", CubeListBuilder.create().texOffs(18, 25).addBox(0.0F, -0.5F, 0.0F, 1, 1, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.18203784098300857F, 0.0F));
            PartDefinition Mouth = BeakTop.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(9, 22).addBox(-0.5F, 0.0F, -1.9F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, -0.27314402793711257F, 0.0F, 0.0F));
            PartDefinition Toe3L = Toe1L.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(16, 10).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, 0.36425021489121656F, 0.0F));
            PartDefinition Toe2L = Toe1L.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(16, 10).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, -0.36425021489121656F, 0.0F));
            PartDefinition Beak2 = BeakTop.addOrReplaceChild("Beak2", CubeListBuilder.create().texOffs(4, 28).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.18203784098300857F, 0.0F, 0.0F));
            PartDefinition BeakSideLeft_1 = BeakTop.addOrReplaceChild("BeakSideLeft_1", CubeListBuilder.create().texOffs(6, 28).mirror(true).addBox(0.0F, 0.0F, -1.5F, 1, 1, 2), PartPose.offsetAndRotation(-0.7F, 0.1F, -0.1F, 0.0F, -0.045553093477052F, 0.0F));
            PartDefinition Toe2R = Toe1R.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(16, 10).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, -0.36425021489121656F, 0.0F));
            PartDefinition WingTip1L = Wing3Left.addOrReplaceChild("WingTip1L", CubeListBuilder.create().texOffs(18, 25).addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 0.18203784098300857F, 0.0F));
            PartDefinition WingTip2L = WingTip1L.addOrReplaceChild("WingTip2L", CubeListBuilder.create().texOffs(18, 25).addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.18203784098300857F, 0.0F));
            PartDefinition WingTip3L = WingTip2L.addOrReplaceChild("WingTip3L", CubeListBuilder.create().texOffs(18, 25).addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.18203784098300857F, 0.0F));
            PartDefinition WingTip4L = WingTip3L.addOrReplaceChild("WingTip4L", CubeListBuilder.create().texOffs(18, 25).addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.18203784098300857F, 0.0F));
            PartDefinition WingTip5L = WingTip4L.addOrReplaceChild("WingTip5L", CubeListBuilder.create().texOffs(18, 25).addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.18203784098300857F, 0.0F));
            PartDefinition WingTip6L = WingTip5L.addOrReplaceChild("WingTip6L", CubeListBuilder.create().texOffs(18, 25).addBox(-1.0F, -0.5F, 0.0F, 1, 1, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.18203784098300857F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(MohoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 2.5F;
            float degree = 0.9f;
            this.Body.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.1F;
            this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 20.5F;
            this.Neck.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.1F - 0.364F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.1F - 0.455F;
            this.TailBase.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.5F;

            this.Wing1Left.zRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 22F) * 0.1F;
            this.Wing2Left.yRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4F) * 0.1F + 0.182F;
            this.Wing1Left.xRot = Mth.cos(6.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -5F) * 0.1F;
            this.Wing1Right.zRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -22F) * 0.1F;
            this.Wing2Right.yRot = Mth.cos(4.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.1F - 0.182F;
            this.Wing1Right.xRot = Mth.cos(6.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 5F) * 0.1F;
        }
    }

    public static class Adult extends MohoModel {
        public ModelPart WingFoldedLeft;
        public ModelPart WingFoldedRight;
        public ModelPart WingTipLeft;
        public ModelPart WingTipRight;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.Toe1R = this.LegRight.getChild("Toe1R");
            this.Toe3R = this.Toe1R.getChild("Toe3R");

            this.Toe2R = this.Toe1R.getChild("Toe2R");

            this.WingFoldedLeft = this.Body.getChild("WingFoldedLeft");
            this.WingTipLeft = this.WingFoldedLeft.getChild("WingTipLeft");

            this.TailBase = this.Body.getChild("TailBase");
            this.Tail1L = this.TailBase.getChild("Tail1L");
            this.Tail1R = this.Tail1L.getChild("Tail1R");

            this.TailCenter = this.Tail1L.getChild("TailCenter");
            this.TailCenterTop = this.TailCenter.getChild("TailCenterTop");

            this.Tail1L_1 = this.TailCenter.getChild("Tail1L_1");
            this.Tail2L = this.Tail1L_1.getChild("Tail2L");
            this.Tail3L = this.Tail2L.getChild("Tail3L");
            this.Tail4L = this.Tail3L.getChild("Tail4L");

            this.Tail1R_1 = this.TailCenter.getChild("Tail1R_1");
            this.Tail2R = this.Tail1R_1.getChild("Tail2R");
            this.Tail3L_1 = this.Tail2R.getChild("Tail3L_1");
            this.Tail4R = this.Tail3L_1.getChild("Tail4R");

            this.Chest = this.Body.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.BeakTop = this.Head.getChild("BeakTop");
            this.Beak2 = this.BeakTop.getChild("Beak2");

            this.BeakSideLeft = this.BeakTop.getChild("BeakSideLeft");

            this.Mouth = this.BeakTop.getChild("Mouth");

            this.BeakSideLeft_1 = this.BeakTop.getChild("BeakSideLeft_1");

            this.WingFoldedRight = this.Body.getChild("WingFoldedRight");
            this.WingTipRight = this.WingFoldedRight.getChild("WingTipRight");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.Toe1L = this.LegLeft.getChild("Toe1L");
            this.Toe3L = this.Toe1L.getChild("Toe3L");

            this.Toe2L = this.Toe1L.getChild("Toe2L");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.5F, 4, 5, 4), PartPose.offsetAndRotation(0.0F, 18.5F, 0.0F, -0.27314402793711257F, 0.0F, 0.0F));
            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(15, 22).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(-1.2F, 1.4F, -0.7F, 0.6373942428283291F, 0.0F, 0.0F));

            PartDefinition WingFoldedLeft = Body.addOrReplaceChild("WingFoldedLeft", CubeListBuilder.create().texOffs(44, 7).addBox(0.0F, -0.5F, 0.0F, 4, 1, 5), PartPose.offsetAndRotation(2.0F, -1.7F, -2.9F, 0.0F, 0.0F, 1.5707963267948966F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(16, 0).addBox(-1.5F, -2.0F, -0.5F, 3, 4, 2), PartPose.offsetAndRotation(0.0F, 0.4F, 1.0F, -0.40980330836826856F, 0.0F, 0.0F));
            PartDefinition Tail1L = TailBase.addOrReplaceChild("Tail1L", CubeListBuilder.create().texOffs(16, 6).addBox(-1.0F, -1.0F, -0.5F, 2, 2, 2), PartPose.offsetAndRotation(0.3F, -0.3F, 1.5F, 0.3097959422289935F, 0.0F, 0.0F));
            PartDefinition Tail1R = Tail1L.addOrReplaceChild("Tail1R", CubeListBuilder.create().texOffs(16, 6).mirror(true).addBox(-1.0F, -1.0F, -0.5F, 2, 2, 2), PartPose.offset(-0.7F, 0.0F, 0.0F));

            PartDefinition TailCenter = Tail1L.addOrReplaceChild("TailCenter", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, -0.5F, 0.0F, 2, 1, 6), PartPose.offset(-0.3F, -0.1F, 1.5F));
            PartDefinition TailCenterTop = TailCenter.addOrReplaceChild("TailCenterTop", CubeListBuilder.create().texOffs(18, 15).addBox(-0.5F, 0.0F, 0.0F, 1, 1, 4), PartPose.offset(0.0F, -0.7F, 0.0F));

            PartDefinition Tail1L_1 = TailCenter.addOrReplaceChild("Tail1L_1", CubeListBuilder.create().texOffs(17, 7).addBox(-1.0F, -0.5F, 0.0F, 1, 1, 7), PartPose.offsetAndRotation(1.2F, 0.2F, -0.4F, 0.0F, 0.03490658503988659F, 0.0F));

            PartDefinition Tail1R_1 = TailCenter.addOrReplaceChild("Tail1R_1", CubeListBuilder.create().texOffs(17, 7).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1, 1, 7), PartPose.offsetAndRotation(-1.2F, 0.2F, -0.4F, 0.0F, -0.03490658503988659F, 0.0F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 9).addBox(-1.5F, -3.0F, 0.0F, 3, 3, 4), PartPose.offsetAndRotation(0.0F, 2.7F, -2.5F, 0.9560913642424937F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -3.0F, 0.0F, 2, 3, 3), PartPose.offsetAndRotation(0.0F, -3.0F, 0.45F, -0.40980330836826856F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 22).addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -2.3F, 1.3F, -0.17872171540421936F, 0.0F, 0.0F));

            PartDefinition WingFoldedRight = Body.addOrReplaceChild("WingFoldedRight", CubeListBuilder.create().texOffs(44, 7).addBox(0.0F, -0.5F, 0.0F, 4, 1, 5), PartPose.offsetAndRotation(-2.0F, -1.7F, -2.9F, 0.0F, 0.0F, 1.5707963267948966F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(15, 22).addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(1.2F, 1.4F, -0.7F, 0.6373942428283291F, 0.0F, 0.0F));

            PartDefinition Tail2L = Tail1L_1.addOrReplaceChild("Tail2L", CubeListBuilder.create().texOffs(17, 7).addBox(-1.0F, -0.5F, 0.0F, 1, 1, 7), PartPose.offsetAndRotation(0.2F, 0.2F, -0.4F, 0.0F, 0.017453292519943295F, 0.0F));
            PartDefinition BeakTop = Head.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, 0.045553093477052F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(12, 26).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1), PartPose.offsetAndRotation(-0.3F, 2.0F, 0.5F, -0.8196066167365371F, 0.0F, 0.0F));
            PartDefinition Beak2 = BeakTop.addOrReplaceChild("Beak2", CubeListBuilder.create().texOffs(4, 28).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, 0.0F, -1.5F, 0.18203784098300857F, 0.0F, 0.0F));
            PartDefinition Tail2R = Tail1R_1.addOrReplaceChild("Tail2R", CubeListBuilder.create().texOffs(17, 7).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1, 1, 7), PartPose.offsetAndRotation(-0.2F, 0.2F, -0.4F, 0.0F, -0.017453292519943295F, 0.0F));
            PartDefinition Tail3L_1 = Tail2R.addOrReplaceChild("Tail3L_1", CubeListBuilder.create().texOffs(17, 7).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1, 1, 7), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0F, -0.017453292519943295F, 0.0F));
            PartDefinition Tail4R = Tail3L_1.addOrReplaceChild("Tail4R", CubeListBuilder.create().texOffs(10, 15).mirror(true).addBox(0.0F, -0.5F, 0.0F, 1, 1, 6), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0F, -0.017453292519943295F, 0.0F));
            PartDefinition BeakSideLeft = BeakTop.addOrReplaceChild("BeakSideLeft", CubeListBuilder.create().texOffs(6, 28).addBox(-1.0F, 0.0F, -1.5F, 1, 1, 2), PartPose.offsetAndRotation(0.7F, 0.1F, -0.1F, 0.0F, 0.045553093477052F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(12, 26).addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1), PartPose.offsetAndRotation(0.3F, 2.0F, 0.5F, -0.8196066167365371F, 0.0F, 0.0F));
            PartDefinition Toe1L = LegLeft.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(10, 9).addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.4553564018453205F, 0.0F, 0.0F));
            PartDefinition Toe2L = Toe1L.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(16, 10).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, -0.36425021489121656F, 0.0F));
            PartDefinition Toe3L = Toe1L.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(16, 10).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, 0.36425021489121656F, 0.0F));
            PartDefinition Toe1R = LegRight.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(10, 9).mirror(true).addBox(-0.5F, -0.5F, -1.5F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.4553564018453205F, 0.0F, 0.0F));
            PartDefinition Mouth = BeakTop.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(9, 22).addBox(-0.5F, 0.0F, -1.9F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, 0.6F, 0.0F, -0.27314402793711257F, 0.0F, 0.0F));
            PartDefinition Tail3L = Tail2L.addOrReplaceChild("Tail3L", CubeListBuilder.create().texOffs(17, 7).addBox(-1.0F, -0.5F, 0.0F, 1, 1, 7), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0F, 0.017453292519943295F, 0.0F));
            PartDefinition Tail4L = Tail3L.addOrReplaceChild("Tail4L", CubeListBuilder.create().texOffs(10, 15).addBox(-1.0F, -0.5F, 0.0F, 1, 1, 6), PartPose.offsetAndRotation(0.0F, 0.2F, -0.9F, 0.0F, 0.017453292519943295F, 0.0F));
            PartDefinition WingTipRight = WingFoldedRight.addOrReplaceChild("WingTipRight", CubeListBuilder.create().texOffs(47, 3).mirror(true).addBox(-3.0F, -1.0F, 0.0F, 3, 1, 3), PartPose.offsetAndRotation(3.2F, -0.1F, 4.9F, 0.22759093446006054F, -0.22759093446006054F, 0.0F));
            PartDefinition WingTipLeft = WingFoldedLeft.addOrReplaceChild("WingTipLeft", CubeListBuilder.create().texOffs(47, 3).addBox(-3.0F, 0.0F, 0.0F, 3, 1, 3), PartPose.offsetAndRotation(3.2F, -0.1F, 4.9F, -0.22759093446006054F, -0.22759093446006054F, 0.0F));
            PartDefinition BeakSideLeft_1 = BeakTop.addOrReplaceChild("BeakSideLeft_1", CubeListBuilder.create().texOffs(6, 28).mirror(true).addBox(0.0F, 0.0F, -1.5F, 1, 1, 2), PartPose.offsetAndRotation(-0.7F, 0.1F, -0.1F, 0.0F, -0.045553093477052F, 0.0F));
            PartDefinition Toe3R = Toe1R.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(16, 10).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, 0.36425021489121656F, 0.0F));
            PartDefinition Toe2R = Toe1R.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(16, 10).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, -0.4F, -0.3F, 0.0F, -0.36425021489121656F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(MohoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.178F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.18F) * 0.5F - 0.40F;
            this.Head.xRot = Mth.cos(6.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * -0.5F - 0.45F;
            this.TailBase.xRot = Mth.cos(6.0F + limbSwing * speed * 0.1F) * limbSwingAmount * (degree * 0.2F) * -0.5F - 0.409F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.5f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.40F;
            this.Head.xRot = Mth.cos(6.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * -0.5F - 0.45F;
            this.Body.xRot = Mth.cos(6.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * -0.5F - 0.273F;
            this.Body.y = Mth.cos(6.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 4F) * -0.5F + 18.5F;
            this.TailBase.xRot = Mth.cos(5.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * -0.5F - 0.409F;

            this.ThighLeft.xRot = Mth.cos(7.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 3.5F) * 0.5F + 0.774F;
            this.LegLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.819F;
            this.Toe1L.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.455F;
            this.ThighRight.xRot = Mth.cos(7.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 3.5F) * 0.5F + 0.774F;
            this.LegRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 1.5F) * 0.5F - 0.819F;
            this.Toe1R.xRot = Mth.cos(4.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1.5F) * 0.5F + 0.455F;

        }
    }

    public static class Child extends MohoModel {
        public ModelPart Tail;
        public ModelPart WingLeft;
        public ModelPart WingRight;
        public ModelPart BeakBottom;
        public ModelPart FootLeft;
        public ModelPart FootRight;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.WingLeft = this.Body.getChild("WingLeft");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.Tail = this.Body.getChild("Tail");

            this.Chest = this.Body.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.BeakTop = this.Head.getChild("BeakTop");
            this.BeakBottom = this.BeakTop.getChild("BeakBottom");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.WingRight = this.Body.getChild("WingRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4), PartPose.offsetAndRotation(0.0F, 21.9F, 0.0F, -0.22759093446006054F, 0.0F, 0.0F));
            PartDefinition WingLeft = Body.addOrReplaceChild("WingLeft", CubeListBuilder.create().texOffs(0, 24).addBox(-0.5F, 0.0F, 0.0F, 1, 2, 3), PartPose.offset(2.0F, -1.5F, -1.7F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(20, 0).addBox(0.0F, -0.9F, -1.0F, 2, 3, 2), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.27314402793711257F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(8, 13).addBox(-0.5F, -1.0F, -3.0F, 1, 1, 3), PartPose.offsetAndRotation(1.4F, 2.5F, 0.7F, -0.045553093477052F, 0.0F, 0.0F));

            PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(12, 0).addBox(-1.5F, -1.5F, -0.3F, 3, 3, 1), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.136659280431156F, 0.0F, 0.0F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 8).addBox(-1.5F, -1.0F, -1.5F, 3, 2, 3), PartPose.offsetAndRotation(0.0F, -0.2F, -2.0F, 0.6829473363053812F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -2.0F, -1.0F, 2, 3, 2), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.5009094953223726F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.045553093477052F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(20, 0).mirror(true).addBox(-2.0F, -0.9F, -1.0F, 2, 3, 2), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, 0.27314402793711257F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(8, 13).mirror(true).addBox(-0.5F, -1.0F, -3.0F, 1, 1, 3), PartPose.offsetAndRotation(-1.4F, 2.5F, 0.7F, -0.045553093477052F, 0.0F, 0.0F));

            PartDefinition WingRight = Body.addOrReplaceChild("WingRight", CubeListBuilder.create().texOffs(0, 24).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1, 2, 3), PartPose.offset(-2.0F, -1.5F, -1.7F));

            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(0, 0).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(-0.2F, -1.0F, -3.0F, 0.36425021489121656F, 0.0F, 0.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.2F, -1.0F, -3.0F, 0.36425021489121656F, 0.0F, 0.0F));
            PartDefinition BeakTop = Head.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(9, 8).addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, -0.7F, -1.5F, 0.6373942428283291F, 0.0F, 0.0F));
            PartDefinition BeakBottom = BeakTop.addOrReplaceChild("BeakBottom", CubeListBuilder.create().texOffs(9, 8).addBox(-0.5F, 0.0F, -1.5F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, 1.7F, 0.1F, -1.0927506446736497F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(MohoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
