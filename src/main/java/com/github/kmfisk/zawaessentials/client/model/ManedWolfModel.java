package com.github.kmfisk.zawaessentials.client.model;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class ManedWolfModel<E extends Entity> extends ZawaBaseModel<E> {
    public ModelPart Chest;
    public ModelPart Body;
    public ModelPart Neck;
    public ModelPart ArmBaseLeft;
    public ModelPart ArmBaseRight;
    public ModelPart Hips;
    public ModelPart Tail1;
    public ModelPart ThighLeft;
    public ModelPart ThighRight;
    public ModelPart UpperLegLeft;
    public ModelPart LowerLegLeft;
    public ModelPart FootLeft;
    public ModelPart UpperLegRight;
    public ModelPart LowerLegRight;
    public ModelPart FootRight;
    public ModelPart Head;
    public ModelPart NeckLower;
    public ModelPart Mane;
    public ModelPart Snout;
    public ModelPart EarLeft;
    public ModelPart EarRight;
    public ModelPart TopSnout;
    public ModelPart Mouth;
    public ModelPart UpperArmLeft;
    public ModelPart ArmLeft;
    public ModelPart HandLeft;
    public ModelPart UpperArmRight;
    public ModelPart ArmRight;
    public ModelPart HandRight;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) this.parts = ImmutableList.of(this.Chest);
        return this.parts;
    }

    public static class Adult<E extends Entity> extends ManedWolfModel<E> {
        public ModelPart Belly;
        public ModelPart Tail2;

        public Adult(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.Tail1 = this.Hips.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");

            this.Belly = this.Body.getChild("Belly");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Mane = this.Neck.getChild("Mane");

            this.NeckLower = this.Neck.getChild("NeckLower");

            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Mouth = this.Snout.getChild("Mouth");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.EarRight = this.Head.getChild("EarRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -4.0F, -2.5F, 7, 8, 5), PartPose.offsetAndRotation(0.0F, 9.5F, -5.7F, -0.136659280431156F, 0.0F, 0.0F));
            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0F, 0.0F, 0.0F, 6, 7, 10), PartPose.offsetAndRotation(0.0F, -4.0F, 1.5F, 0.091106186954104F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 30).addBox(-2.5F, 0.0F, 0.0F, 5, 7, 4), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.27314402793711257F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(32, 22).addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4), PartPose.offsetAndRotation(1.8F, 1.3F, 1.4F, 0.18203784098300857F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(48, 25).addBox(-1.5F, 0.0F, 0.0F, 3, 5, 3), PartPose.offsetAndRotation(0.0F, 6.5F, -1.4F, 0.4553564018453205F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(41, 33).addBox(-1.0F, 0.0F, -2.0F, 2, 6, 2), PartPose.offsetAndRotation(0.0F, 4.5F, 2.5F, -0.31869712141416456F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(36, 0).addBox(-1.5F, 0.0F, -3.0F, 3, 5, 3), PartPose.offsetAndRotation(0.0F, 0.7F, 4.0F, 0.5462880558742251F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(32, 22).mirror(true).addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4), PartPose.offsetAndRotation(-1.8F, 1.3F, 1.4F, 0.18203784098300857F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(48, 25).mirror(true).addBox(-1.5F, 0.0F, 0.0F, 3, 5, 3), PartPose.offsetAndRotation(0.0F, 6.5F, -1.4F, 0.4553564018453205F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(41, 33).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2, 6, 2), PartPose.offsetAndRotation(0.0F, 4.5F, 2.5F, -0.31869712141416456F, 0.0F, 0.0F));

            PartDefinition Belly = Body.addOrReplaceChild("Belly", CubeListBuilder.create().texOffs(18, 39).addBox(-2.5F, -2.0F, 0.0F, 5, 2, 8), PartPose.offsetAndRotation(0.0F, 8.0F, -0.3F, 0.136659280431156F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(22, 11).addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4), PartPose.offsetAndRotation(2.2F, -0.4F, -0.3F, 0.31869712141416456F, 0.0F, 0.0F));
            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(36, 10).addBox(-1.0F, 0.0F, -3.0F, 2, 7, 3), PartPose.offsetAndRotation(0.0F, 4.5F, 1.5F, -0.18203784098300857F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(46, 14).addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2), PartPose.offsetAndRotation(0.0F, 6.3F, -2.5F, -0.091106186954104F, 0.0F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(22, 11).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4), PartPose.offsetAndRotation(-2.1F, -0.4F, -0.3F, 0.31869712141416456F, 0.0F, 0.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(36, 10).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2, 7, 3), PartPose.offsetAndRotation(0.0F, 4.5F, 1.5F, -0.18203784098300857F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(46, 14).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2), PartPose.offsetAndRotation(0.0F, 6.3F, -2.5F, -0.091106186954104F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 49).addBox(-2.0F, -5.0F, -2.0F, 4, 5, 4), PartPose.offsetAndRotation(0.0F, -2.0F, -0.5F, 1.0927506446736497F, 0.0F, 0.0F));
            PartDefinition Mane = Neck.addOrReplaceChild("Mane", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, 0.0F, 0.0F, 2, 6, 2), PartPose.offset(0.0F, -5.2F, 0.9F));

            PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(18, 30).addBox(-1.5F, -2.0F, 0.0F, 3, 2, 6), PartPose.offsetAndRotation(0.0F, -5.0F, -2.4F, -1.9123572614101867F, 0.0F, 0.0F));

            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(16, 49).addBox(-2.5F, -3.0F, -3.0F, 5, 5, 5), PartPose.offsetAndRotation(0.0F, -4.4F, -0.9F, -0.8196066167365371F, 0.0F, 0.0F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 58).addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3), PartPose.offsetAndRotation(0.0F, -0.6F, -2.6F, 0.045553093477052F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1), PartPose.offsetAndRotation(1.9F, -2.2F, 0.0F, 0.18203784098300857F, -0.27314402793711257F, 0.36425021489121656F));

            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 41).mirror(true).addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1), PartPose.offsetAndRotation(-1.9F, -2.2F, 0.0F, 0.18203784098300857F, 0.27314402793711257F, -0.36425021489121656F));

            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(49, 37).addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2), PartPose.offset(0.0F, 5.8F, -0.8F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(54, 16).mirror(true).addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2), PartPose.offsetAndRotation(0.0F, 3.5F, 1.2F, 0.091106186954104F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(12, 59).addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3), PartPose.offsetAndRotation(0.0F, 0.0F, -3.2F, 0.31869712141416456F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(22, 59).addBox(-1.0F, 0.0F, -2.7F, 2, 1, 3), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, -0.045553093477052F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(54, 16).addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2), PartPose.offsetAndRotation(0.0F, 3.5F, 1.2F, 0.091106186954104F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(49, 37).mirror(true).addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2), PartPose.offset(0.0F, 5.8F, -0.8F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(48, 0).addBox(-1.5F, 0.0F, 0.0F, 3, 4, 3), PartPose.offsetAndRotation(0.0F, 5.0F, -3.0F, 0.136659280431156F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            /*            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) - 0.819F;*/
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.092F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.819F;
            this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.546F;
            this.Tail1.zRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.5F);
            this.Tail2.xRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * -0.8F + 0.1366F;
            this.Tail2.zRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F);
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 0.5f;

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting() && !isSwimming) {
                this.Neck.xRot = Mth.cos(7.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F) * 0.5F + 1.092F;
                this.Head.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.819F;
                this.EarLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.182F;
                this.EarRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -1.5F) * 0.5F - 0.182F;
                this.Chest.xRot = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.056F;
                this.Chest.y = Mth.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -3F) * 0.5F + 9.5F;
                this.Body.xRot = Mth.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.9F) * 0.5F + 0.08F;
                this.Hips.xRot = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.273F;
                this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.546F;
                this.Tail1.zRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -2F);
                this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 1F) * -0.8F + 0.1366F;
                this.Tail2.zRot = Mth.cos(3.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.5F);

                this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F + 0.31F;
                this.UpperArmLeft.xRot = Mth.cos(4.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -8F) * 0.5F - 0.382F;
                this.ArmLeft.xRot = Mth.cos(5.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F - 0.09F;
                this.HandLeft.xRot = Mth.cos(4.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -8F) * 0.5F + 0.0911F;
                this.ArmBaseRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F + 0.31F;
                this.UpperArmRight.xRot = Mth.cos(6F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -8F) * 0.5F - 0.382F;
                this.ArmRight.xRot = Mth.cos(7F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 6F) * 0.5F - 0.09F;
                this.HandRight.xRot = Mth.cos(6F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -8F) * 0.5F + 0.0911F;

                this.ThighLeft.xRot = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -7.5F) * 0.5F + 0.182F;
                this.UpperLegLeft.xRot = Mth.cos(7F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -6F) * 0.5F + 0.455F;
                this.LowerLegLeft.xRot = Mth.cos(6F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 7F) * 0.5F - 0.318F;
                this.FootLeft.xRot = Mth.cos(6F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -6F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -7.5F) * 0.5F + 0.182F;
                this.UpperLegRight.xRot = Mth.cos(8F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -6F) * 0.5F + 0.455F;
                this.LowerLegRight.xRot = Mth.cos(7F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 7F) * 0.5F - 0.318F;
                this.FootRight.xRot = Mth.cos(6F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -6F) * 0.5F;

            } else {
                this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.092F;
                this.Head.xRot = Mth.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.25F) * 0.5F - 0.819F;
                this.Chest.xRot = Mth.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.136F;
                this.Chest.y = Mth.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 9.5F;
                this.Body.xRot = Mth.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.091F;
                this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.546F;
                this.Tail1.zRot = Mth.cos(2.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -0.5F);
                this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * -0.8F + 0.1366F;
                this.Tail2.zRot = Mth.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F);

                this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 1.4F) * 0.5F + 0.31F;
                this.UpperArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.182F;
                this.ArmLeft.xRot = Mth.cos(4.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2.8F) * 0.5F - 0.09F;
                this.HandLeft.xRot = Mth.cos(4.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.0911F;
                this.ArmBaseRight.xRot = Mth.cos(limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 0.31F;
                this.UpperArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.182F;
                this.ArmRight.xRot = Mth.cos(4.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2.8F) * 0.5F - 0.09F;
                this.HandRight.xRot = Mth.cos(4.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.0911F;

                this.ThighLeft.xRot = Mth.cos(1.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 0.182F;
                this.UpperLegLeft.xRot = Mth.cos(limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.455F;
                this.LowerLegLeft.xRot = Mth.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.318F;
                this.FootLeft.xRot = Mth.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 1.4F) * 0.5F + 0.182F;
                this.UpperLegRight.xRot = Mth.cos(limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.455F;
                this.LowerLegRight.xRot = Mth.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.318F;
                this.FootRight.xRot = Mth.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2F) * 0.5F;
            }
        }
    }

    public static class Child<E extends Entity> extends ManedWolfModel<E> {
        public Child(ModelPart root) {
            this.Chest = root.getChild("Chest");
            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.UpperArmLeft = this.ArmBaseLeft.getChild("UpperArmLeft");
            this.ArmLeft = this.UpperArmLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.UpperArmRight = this.ArmBaseRight.getChild("UpperArmRight");
            this.ArmRight = this.UpperArmRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarRight = this.Head.getChild("EarRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout = this.Head.getChild("Snout");
            this.Mouth = this.Snout.getChild("Mouth");

            this.TopSnout = this.Snout.getChild("TopSnout");

            this.NeckLower = this.Neck.getChild("NeckLower");

            this.Mane = this.Neck.getChild("Mane");

            this.Body = this.Chest.getChild("Body");
            this.Hips = this.Body.getChild("Hips");
            this.ThighLeft = this.Hips.getChild("ThighLeft");
            this.UpperLegLeft = this.ThighLeft.getChild("UpperLegLeft");
            this.LowerLegLeft = this.UpperLegLeft.getChild("LowerLegLeft");
            this.FootLeft = this.LowerLegLeft.getChild("FootLeft");

            this.Tail1 = this.Hips.getChild("Tail1");

            this.ThighRight = this.Hips.getChild("ThighRight");
            this.UpperLegRight = this.ThighRight.getChild("UpperLegRight");
            this.LowerLegRight = this.UpperLegRight.getChild("LowerLegRight");
            this.FootRight = this.LowerLegRight.getChild("FootRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Chest = partDefinition.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4), PartPose.offsetAndRotation(0.0F, 14.8F, -3.0F, -0.136659280431156F, 0.0F, 0.0F));
            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(36, 0).addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3), PartPose.offsetAndRotation(1.8F, 0.6F, 0.0F, 0.22759093446006054F, 0.0F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(36, 0).mirror(true).addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3), PartPose.offsetAndRotation(-1.8F, 0.6F, 0.0F, 0.22759093446006054F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(20, 0).addBox(-2.0F, -4.0F, -2.0F, 4, 6, 4), PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, 0.8196066167365371F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(22, 10).addBox(-2.5F, -3.0F, -3.0F, 5, 5, 5), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.5918411493512771F, 0.0F, 0.0F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(32, 20).addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1), PartPose.offsetAndRotation(-1.9F, -2.2F, 0.0F, 0.36425021489121656F, 0.045553093477052F, -0.4553564018453205F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(32, 20).addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1), PartPose.offsetAndRotation(1.9F, -2.2F, 0.0F, 0.36425021489121656F, -0.045553093477052F, 0.4553564018453205F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(22, 20).addBox(-1.5F, 0.0F, -2.0F, 3, 2, 2), PartPose.offsetAndRotation(0.0F, -0.6F, -3.0F, 0.091106186954104F, 0.0F, 0.0F));

            PartDefinition NeckLower = Neck.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(24, 24).addBox(-1.5F, 0.0F, 0.0F, 3, 5, 1), PartPose.offsetAndRotation(0.0F, -4.0F, -2.0F, -0.136659280431156F, 0.0F, 0.0F));

            PartDefinition Mane = Neck.addOrReplaceChild("Mane", CubeListBuilder.create().texOffs(32, 26).addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2), PartPose.offset(0.0F, -3.7F, 0.7F));

            PartDefinition Body = Chest.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 10).addBox(-2.5F, 0.0F, 0.0F, 5, 6, 6), PartPose.offsetAndRotation(0.0F, -3.02F, 1.1F, 0.136659280431156F, 0.0F, 0.0F));
            PartDefinition Hips = Body.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 22).addBox(-2.0F, 0.0F, 0.0F, 4, 6, 3), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.22759093446006054F, 0.0F, 0.0F));
            PartDefinition ThighLeft = Hips.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(44, 5).addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4), PartPose.offsetAndRotation(1.7F, 1.2F, 1.0F, 0.22759093446006054F, 0.0F, 0.0F));
            PartDefinition UpperLegLeft = ThighLeft.addOrReplaceChild("UpperLegLeft", CubeListBuilder.create().texOffs(42, 14).addBox(-1.0F, 0.0F, 0.0F, 2, 3, 3), PartPose.offsetAndRotation(0.0F, 5.0F, -1.5F, 0.5462880558742251F, 0.0F, 0.0F));
            PartDefinition LowerLegLeft = UpperLegLeft.addOrReplaceChild("LowerLegLeft", CubeListBuilder.create().texOffs(40, 20).addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2), PartPose.offsetAndRotation(-0.05F, 3.0F, 2.5F, -0.5462880558742251F, 0.0F, 0.0F));

            PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(46, 25).addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2), PartPose.offsetAndRotation(0.0F, 0.5F, 3.0F, 0.6373942428283291F, 0.0F, 0.0F));

            PartDefinition ThighRight = Hips.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(44, 5).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4), PartPose.offsetAndRotation(-1.7F, 1.2F, 1.0F, 0.22759093446006054F, 0.0F, 0.0F));
            PartDefinition UpperLegRight = ThighRight.addOrReplaceChild("UpperLegRight", CubeListBuilder.create().texOffs(42, 14).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2, 3, 3), PartPose.offsetAndRotation(0.0F, 5.0F, -1.5F, 0.5462880558742251F, 0.0F, 0.0F));
            PartDefinition LowerLegRight = UpperLegRight.addOrReplaceChild("LowerLegRight", CubeListBuilder.create().texOffs(40, 20).addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2), PartPose.offsetAndRotation(0.05F, 3.0F, 2.5F, -0.5462880558742251F, 0.0F, 0.0F));

            PartDefinition UpperArmLeft = ArmBaseLeft.addOrReplaceChild("UpperArmLeft", CubeListBuilder.create().texOffs(48, 0).addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2), PartPose.offsetAndRotation(0.0F, 3.0F, 1.0F, -0.091106186954104F, 0.0F, 0.0F));
            PartDefinition ArmLeft = UpperArmLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(56, 0).addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2), PartPose.offsetAndRotation(-0.01F, 2.9F, -2.0F, -0.045553093477052F, 0.0F, 0.0F));
            PartDefinition FootRight = LowerLegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(48, 20).mirror(true).addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2), PartPose.offset(0.0F, 3.5F, -1.0F));
            PartDefinition UpperArmRight = ArmBaseRight.addOrReplaceChild("UpperArmRight", CubeListBuilder.create().texOffs(48, 0).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2), PartPose.offsetAndRotation(0.0F, 3.0F, 1.0F, -0.091106186954104F, 0.0F, 0.0F));
            PartDefinition ArmRight = UpperArmRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(56, 0).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2), PartPose.offsetAndRotation(0.01F, 2.9F, -2.0F, -0.045553093477052F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(36, 6).addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2), PartPose.offset(0.0F, 2.0F, 1.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(36, 6).addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2), PartPose.offsetAndRotation(0.0F, 1.9F, 1.0F, 0.091106186954104F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(14, 26).addBox(-1.0F, 0.0F, -1.8F, 2, 1, 2), PartPose.offsetAndRotation(0.0F, 1.5F, 0.0F, -0.136659280431156F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(14, 22).addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3), PartPose.offsetAndRotation(0.0F, 0.0F, -2.2F, 0.18203784098300857F, 0.0F, 0.0F));
            PartDefinition FootLeft = LowerLegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(48, 20).addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2), PartPose.offset(0.0F, 3.5F, -1.0F));

            return LayerDefinition.create(meshDefinition, 64, 32);
        }

        @Override
        public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.819F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.591F;
            this.Tail1.xRot = Mth.cos(limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.637F;
            this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.5F);

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 0.3f;
            float degree = 0.6f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.819F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.25F) * 0.5F - 0.591F;
            this.Chest.xRot = Mth.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.136F;
            this.Chest.y = Mth.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 14.8F;
            this.Body.xRot = Mth.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.091F;
            this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.546F;
            this.Tail1.zRot = Mth.cos(3.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -0.5F);

            this.ArmBaseLeft.xRot = Mth.cos(limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 1.4F) * 0.5F + 0.227F;
            this.UpperArmLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.091F;
            this.ArmLeft.xRot = Mth.cos(4.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 0.3F) * 0.5F - 0.045F;
            this.HandLeft.xRot = Mth.cos(4.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.091F;
            this.ArmBaseRight.xRot = Mth.cos(limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 0.227F;
            this.UpperArmRight.xRot = Mth.cos(4.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.091F;
            this.ArmRight.xRot = Mth.cos(4.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -0.3F) * 0.5F - 0.045F;
            this.HandRight.xRot = Mth.cos(4.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.091F;
            this.ThighLeft.xRot = Mth.cos(1.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.227F;
            this.UpperLegLeft.xRot = Mth.cos(limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.546F;
            this.LowerLegLeft.xRot = Mth.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.546F;
            this.FootLeft.xRot = Mth.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2F) * 0.5F;
            this.ThighRight.xRot = Mth.cos(1.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.227F;
            this.UpperLegRight.xRot = Mth.cos(limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.546F;
            this.LowerLegRight.xRot = Mth.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.546F;
            this.FootRight.xRot = Mth.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2F) * 0.5F;

        }
    }
}
