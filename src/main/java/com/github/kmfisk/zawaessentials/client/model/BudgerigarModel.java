package com.github.kmfisk.zawaessentials.client.model;

import com.github.kmfisk.zawaessentials.entity.BudgerigarEntity;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class BudgerigarModel extends ZawaBaseModel<BudgerigarEntity> {
    public ModelPart Body;
    public ModelPart Neck;
    public ModelPart TailBase;
    public ModelPart LegLeft;
    public ModelPart LegRight;
    public ModelPart Head;
    public ModelPart Forehead;
    public ModelPart BeakLeft;
    public ModelPart CereLeft;
    public ModelPart CereRight;
    public ModelPart BeakRight;
    public ModelPart Tail;
    public ModelPart TailFeatherCenter;
    public ModelPart TailFeatherL1;
    public ModelPart TailFeatherR1;
    public ModelPart TailFeatherL2;
    public ModelPart TailFeatherL2_1;
    public ModelPart FootLeft;
    public ModelPart FootRight;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) this.parts = ImmutableList.of(this.Body);
        return this.parts;
    }

    public static class Flying extends BudgerigarModel {
        public ModelPart Wing1Left;
        public ModelPart Wing1Right;
        public ModelPart Wing2Left;
        public ModelPart Wing3Left;
        public ModelPart WingTip1L;
        public ModelPart WingTip2L;
        public ModelPart WingTip3L;
        public ModelPart WingTip4L;
        public ModelPart WingTip4L_1;
        public ModelPart Wing2Right;
        public ModelPart Wing3Right;
        public ModelPart WingTip1R;
        public ModelPart WingTip2R;
        public ModelPart WingTip3R;
        public ModelPart WingTip4R;
        public ModelPart WingTip4R_1;

        public Flying(ModelPart root) {
            this.Body = root.getChild("Body");
            this.WingTip2L = this.WingTip1L.getChild("WingTip2L");
            this.TailFeatherCenter = this.TailBase.getChild("TailFeatherCenter");
            this.BeakLeft = this.Head.getChild("BeakLeft");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.WingTip1L = this.Wing3Left.getChild("WingTip1L");
            this.TailFeatherR1 = this.Tail.getChild("TailFeatherR1");
            this.TailFeatherL2_1 = this.TailFeatherR1.getChild("TailFeatherL2_1");
            this.TailFeatherL1 = this.Tail.getChild("TailFeatherL1");
            this.WingTip3L = this.WingTip2L.getChild("WingTip3L");
            this.Wing2Right = this.Wing1Right.getChild("Wing2Right");
            this.TailFeatherL2 = this.TailFeatherL1.getChild("TailFeatherL2");
            this.CereRight = this.Head.getChild("CereRight");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");
            this.WingTip2R = this.WingTip1R.getChild("WingTip2R");
            this.WingTip4L = this.WingTip3L.getChild("WingTip4L");
            this.BeakRight = this.BeakLeft.getChild("BeakRight");
            this.Wing1Left = this.Body.getChild("Wing1Left");
            this.TailBase = this.Body.getChild("TailBase");
            this.Wing3Left = this.Wing2Left.getChild("Wing3Left");
            this.WingTip4L_1 = this.WingTip4L.getChild("WingTip4L_1");
            this.Wing3Right = this.Wing2Right.getChild("Wing3Right");
            this.Forehead = this.Head.getChild("Forehead");
            this.WingTip4R = this.WingTip3R.getChild("WingTip4R");
            this.LegRight = this.Body.getChild("LegRight");
            this.Neck = this.Body.getChild("Neck");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.Head = this.Neck.getChild("Head");
            this.WingTip3R = this.WingTip2R.getChild("WingTip3R");
            this.WingTip1R = this.Wing3Right.getChild("WingTip1R");
            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.LegLeft = this.Body.getChild("LegLeft");
            this.Tail = this.TailBase.getChild("Tail");
            this.CereLeft = this.Head.getChild("CereLeft");
            this.WingTip4R_1 = this.WingTip4R.getChild("WingTip4R_1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 21.9F, 0.0F, 1.5025538891260521F, 0.0F, 0.0F));
            PartDefinition Wing1Left = Body.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(14, 20).addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(1.0F, -2.0F, 0.6F, 0.0F, 0.0F, -0.04555309164612875F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.6F, 0.0F, 0.04555309164612875F, 0.0F, 0.0F));
            PartDefinition TailFeatherCenter = TailBase.addOrReplaceChild("TailFeatherCenter", CubeListBuilder.create().texOffs(12, 7).addBox(-0.5F, -2.0F, -0.4F, 1.0F, 8.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.7F, -0.2F, 0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition Tail = TailBase.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(12, 4).addBox(-1.0F, -0.2F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 0.3F, 0.04555309164612875F, 0.0F, 0.0F));

            PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(8, 13).mirror(true).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(-0.9F, 0.9F, -0.6F, -0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.6F, 0.1F, -0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.1F, -1.092750655326294F, 0.0F, 0.0F));

            PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(14, 20).mirror(true).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-1.0F, -2.0F, 0.6F, 0.0F, 0.0F, 0.04555309164612875F));

            PartDefinition LegLeft = Body.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(8, 13).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.9F, 0.9F, -0.6F, -0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition BeakLeft = Head.addOrReplaceChild("BeakLeft", CubeListBuilder.create().texOffs(0, 22).addBox(-0.3F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, -0.9F, -2.3F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(7, 16).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.7F, 0.8651597048872669F, 0.13665927909957545F, 0.0F));
            PartDefinition TailFeatherR1 = Tail.addOrReplaceChild("TailFeatherR1", CubeListBuilder.create().texOffs(16, 7).mirror(true).addBox(0.0F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(-1.2F, -1.1F, -0.5F, 0.0F, 0.0F, 0.031066860186156363F));
            PartDefinition TailFeatherL2_1 = TailFeatherR1.addOrReplaceChild("TailFeatherL2_1", CubeListBuilder.create().texOffs(16, 7).addBox(0.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-0.3F, -0.6F, -0.1F, 0.0F, 0.0F, 0.11833332694706204F));
            PartDefinition TailFeatherL1 = Tail.addOrReplaceChild("TailFeatherL1", CubeListBuilder.create().texOffs(16, 7).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(1.2F, -1.1F, -0.5F, 0.0F, 0.0F, -0.031066860186156363F));
            PartDefinition Wing2Right = Wing1Right.addOrReplaceChild("Wing2Right", CubeListBuilder.create().texOffs(20, 20).mirror(true).addBox(-2.0F, -4.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.10471975511965977F));
            PartDefinition TailFeatherL2 = TailFeatherL1.addOrReplaceChild("TailFeatherL2", CubeListBuilder.create().texOffs(16, 7).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.3F, -0.6F, -0.1F, 0.0F, 0.0F, -0.13578661946700535F));
            PartDefinition CereRight = Head.addOrReplaceChild("CereRight", CubeListBuilder.create().texOffs(0, 25).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, -1.2F, -2.5F, 0.0F, 0.1502728426045993F, 0.0F));
            PartDefinition Wing2Left = Wing1Left.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(20, 20).addBox(0.0F, -4.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(2.0F, 4.0F, 0.0F, 0.0F, 0.0F, -0.10471975511965977F));
            PartDefinition BeakRight = BeakLeft.addOrReplaceChild("BeakRight", CubeListBuilder.create().texOffs(0, 22).mirror(true).addBox(-0.7F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            PartDefinition Wing3Left = Wing2Left.addOrReplaceChild("Wing3Left", CubeListBuilder.create().texOffs(26, 20).addBox(0.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(2.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.13962634015954636F));
            PartDefinition WingTip1L = Wing3Left.addOrReplaceChild("WingTip1L", CubeListBuilder.create().texOffs(10, 20).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.24434609527920614F));
            PartDefinition Wing3Right = Wing2Right.addOrReplaceChild("Wing3Right", CubeListBuilder.create().texOffs(26, 20).mirror(true).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.13962634015954636F));
            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offset(0.0F, -1.9F, -2.0F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(7, 16).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F, 0.0F, -0.1F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.7F, 0.9105382388075086F, -0.13665927909957545F, 0.0F));
            PartDefinition WingTip1R = Wing3Right.addOrReplaceChild("WingTip1R", CubeListBuilder.create().texOffs(10, 20).addBox(0.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.24434609527920614F));
            PartDefinition WingTip2L = WingTip1L.addOrReplaceChild("WingTip2L", CubeListBuilder.create().texOffs(10, 20).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.24434609527920614F));
            PartDefinition WingTip3L = WingTip2L.addOrReplaceChild("WingTip3L", CubeListBuilder.create().texOffs(10, 20).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.24434609527920614F));
            PartDefinition CereLeft = Head.addOrReplaceChild("CereLeft", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, -1.2F, -2.5F, 0.0F, -0.1502728426045993F, 0.0F));
            PartDefinition WingTip2R = WingTip1R.addOrReplaceChild("WingTip2R", CubeListBuilder.create().texOffs(10, 20).mirror(true).addBox(0.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.24434609527920614F));
            PartDefinition WingTip3R = WingTip2R.addOrReplaceChild("WingTip3R", CubeListBuilder.create().texOffs(10, 20).mirror(true).addBox(0.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.24434609527920614F));
            PartDefinition WingTip4R = WingTip3R.addOrReplaceChild("WingTip4R", CubeListBuilder.create().texOffs(10, 20).mirror(true).addBox(0.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.24434609527920614F));
            PartDefinition WingTip4L = WingTip3L.addOrReplaceChild("WingTip4L", CubeListBuilder.create().texOffs(10, 20).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.24434609527920614F));
            PartDefinition WingTip4L_1 = WingTip4L.addOrReplaceChild("WingTip4L_1", CubeListBuilder.create().texOffs(10, 20).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.24434609527920614F));
            PartDefinition WingTip4R_1 = WingTip4R.addOrReplaceChild("WingTip4R_1", CubeListBuilder.create().texOffs(10, 20).mirror(true).addBox(0.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.24434609527920614F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(BudgerigarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.4f;
            float degree = 1.2f;
            this.Body.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.1F + 1.548F;
            this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 20.5F;
            this.Neck.xRot = Mth.cos(5.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.3F) * 0.1F - 0.364F;
            this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.1F - 0.86F;
            this.TailBase.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.5F;

            this.Wing1Left.yRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 4F) * 0.5F - 0.364F;
            this.Wing1Left.x = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.1F;
            this.Wing2Left.zRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.364F;
            this.Wing1Right.yRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -4F) * 0.5F + 0.364F;
            this.Wing1Right.x = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.1F;
            this.Wing2Right.zRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 0.364F;
        }
    }

    public static class Adult extends BudgerigarModel {
        public ModelPart WingFoldedLeft;
        public ModelPart WingFoldedRight;
        public ModelPart WingFoldedLeft1;
        public ModelPart WingFoldedRight1;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Neck = this.Body.getChild("Neck");
            this.CereRight = this.Head.getChild("CereRight");
            this.Forehead = this.Head.getChild("Forehead");
            this.Head = this.Neck.getChild("Head");
            this.TailFeatherCenter = this.TailBase.getChild("TailFeatherCenter");
            this.WingFoldedRight1 = this.WingFoldedRight.getChild("WingFoldedRight1");
            this.TailFeatherL2_1 = this.TailFeatherR1.getChild("TailFeatherL2_1");
            this.FootRight = this.LegRight.getChild("FootRight");
            this.LegLeft = this.Body.getChild("LegLeft");
            this.WingFoldedRight = this.Body.getChild("WingFoldedRight");
            this.TailFeatherL1 = this.Tail.getChild("TailFeatherL1");
            this.BeakLeft = this.Head.getChild("BeakLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");
            this.WingFoldedLeft = this.Body.getChild("WingFoldedLeft");
            this.BeakRight = this.BeakLeft.getChild("BeakRight");
            this.WingFoldedLeft1 = this.WingFoldedLeft.getChild("WingFoldedLeft1");
            this.Tail = this.TailBase.getChild("Tail");
            this.LegRight = this.Body.getChild("LegRight");
            this.TailFeatherL2 = this.TailFeatherL1.getChild("TailFeatherL2");
            this.TailBase = this.Body.getChild("TailBase");
            this.CereLeft = this.Head.getChild("CereLeft");
            this.TailFeatherR1 = this.Tail.getChild("TailFeatherR1");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 21.3F, 0.0F, 0.8560839847874131F, 0.0F, 0.0F));
            PartDefinition Neck = Body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.6F, 0.1F, -0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.01F, 0.0F, 0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.5F, -0.591841146688116F, 0.0F, 0.0F));

            PartDefinition LegLeft = Body.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(8, 13).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(1.1F, 0.9F, -1.0F, -0.8196066007575706F, 0.13665927909957545F, -0.18203784630933073F));

            PartDefinition WingFoldedRight = Body.addOrReplaceChild("WingFoldedRight", CubeListBuilder.create().texOffs(4, 22).mirror(true).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(-1.2F, -1.4F, 0.0F, 0.27314402127920984F, 0.0F, 0.0911061832922575F));

            PartDefinition WingFoldedLeft = Body.addOrReplaceChild("WingFoldedLeft", CubeListBuilder.create().texOffs(4, 22).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(1.2F, -1.4F, 0.0F, 0.27314402127920984F, 0.0F, -0.0911061832922575F));

            PartDefinition LegRight = Body.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(8, 13).mirror(true).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-1.1F, 0.9F, -1.0F, -0.8196066007575706F, -0.13665927909957545F, 0.18203784630933073F));

            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(12, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.45535640450848164F, 0.0F, 0.0F));
            PartDefinition TailFeatherCenter = TailBase.addOrReplaceChild("TailFeatherCenter", CubeListBuilder.create().texOffs(12, 7).addBox(-0.5F, -2.0F, -0.4F, 1.0F, 8.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.7F, -0.2F, 0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition Tail = TailBase.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(12, 4).addBox(-1.0F, -0.2F, -0.5F, 2.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.0F, 0.3F, 0.04555309164612875F, 0.0F, 0.0F));

            PartDefinition CereRight = Head.addOrReplaceChild("CereRight", CubeListBuilder.create().texOffs(0, 25).mirror(true).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(-0.5F, -1.2F, -2.5F, 0.0F, 0.1502728426045993F, 0.0F));
            PartDefinition Forehead = Head.addOrReplaceChild("Forehead", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offset(0.0F, -1.9F, -2.0F));
            PartDefinition WingFoldedRight1 = WingFoldedRight.addOrReplaceChild("WingFoldedRight1", CubeListBuilder.create().texOffs(0, 27).mirror(true).addBox(-0.4F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.0F, -1.5F, 0.7740534966278743F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(7, 16).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.7F, 0.0F, 0.13665927909957545F, 0.0F));
            PartDefinition TailFeatherL1 = Tail.addOrReplaceChild("TailFeatherL1", CubeListBuilder.create().texOffs(16, 7).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(1.2F, -1.1F, -0.5F, 0.04555309164612875F, 0.0F, 0.05619960241356012F));
            PartDefinition BeakLeft = Head.addOrReplaceChild("BeakLeft", CubeListBuilder.create().texOffs(0, 22).addBox(-0.3F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, -0.9F, -2.3F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(7, 16).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.5F, -0.7F, 0.0F, -0.13665927909957545F, 0.0F));
            PartDefinition BeakRight = BeakLeft.addOrReplaceChild("BeakRight", CubeListBuilder.create().texOffs(0, 22).mirror(true).addBox(-0.7F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F), PartPose.offset(0.0F, 0.0F, 0.0F));
            PartDefinition WingFoldedLeft1 = WingFoldedLeft.addOrReplaceChild("WingFoldedLeft1", CubeListBuilder.create().texOffs(0, 27).addBox(-0.6F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 3.0F, -1.5F, 0.7740534966278743F, 0.0F, 0.0F));
            PartDefinition TailFeatherL2 = TailFeatherL1.addOrReplaceChild("TailFeatherL2", CubeListBuilder.create().texOffs(16, 7).addBox(-1.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(0.3F, -0.6F, -0.1F, 0.0F, 0.0F, 0.0038397243335815787F));
            PartDefinition CereLeft = Head.addOrReplaceChild("CereLeft", CubeListBuilder.create().texOffs(0, 25).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.5F, -1.2F, -2.5F, 0.0F, -0.1502728426045993F, 0.0F));
            PartDefinition TailFeatherR1 = Tail.addOrReplaceChild("TailFeatherR1", CubeListBuilder.create().texOffs(16, 7).mirror(true).addBox(0.0F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(-1.2F, -1.1F, -0.5F, 0.04555309164612875F, 0.0F, -0.05619960241356012F));
            PartDefinition TailFeatherL2_1 = TailFeatherR1.addOrReplaceChild("TailFeatherL2_1", CubeListBuilder.create().texOffs(16, 7).addBox(0.0F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F), PartPose.offsetAndRotation(-0.3F, -0.6F, -0.1F, 0.0F, 0.0F, -0.0038397243335815787F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            if (this.young) {
                poseStack.pushPose();
                poseStack.scale(0.5F, 0.5F, 0.5F);
                poseStack.translate(0.0, 1.5, 0.0);
                this.parts().forEach((modelPart) -> modelPart.render(poseStack, buffer, packedLight, packedOverlay, red, green, blue, alpha));
                poseStack.popPose();

            } else super.renderToBuffer(poseStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        }

        @Override
        public void setupAnim(BudgerigarEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.591F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.182F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.4F) * 0.5F - 0.591F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Body.xRot = Mth.cos(2.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.856F;
            this.Body.y = Mth.cos(3.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * 0.1F) * 0.5F + 21.3F;
            this.Body.yRot = Mth.cos(4.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 0.25F) * 0.5F;
            this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.182F;
            this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.7F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.591F;

            this.LegLeft.xRot = Mth.cos(5.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.819F;
            this.FootLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 2.3F) * 0.5F;
            this.LegRight.xRot = Mth.cos(5.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * 2.3F) * 0.5F - 0.819F;
            this.FootRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.35F) * limbSwingAmount * (degree * -2.3F) * 0.5F;

        }
    }
}
