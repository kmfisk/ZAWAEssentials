package com.github.kmfisk.zawaessentials.client.model;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class ChinchillaModel<E extends Entity> extends ZawaBaseModel<E> {
    public ModelPart Body;
    public ModelPart Chest;
    public ModelPart ThighLeft;
    public ModelPart ThighRight;
    public ModelPart Neck;
    public ModelPart HandRight;
    public ModelPart Head;
    public ModelPart Snout;
    public ModelPart EarLeft;
    public ModelPart EarRight;
    public ModelPart TopSnout;
    public ModelPart Mouth;
    public ModelPart ArmLeft;
    public ModelPart HandLeft;
    public ModelPart ArmRight;
    public ModelPart Tail1;
    public ModelPart Tail2;
    public ModelPart FootLeft;
    public ModelPart FootRight;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) this.parts = ImmutableList.of(this.Body);
        return this.parts;
    }

    public static class Adult<E extends Entity> extends ChinchillaModel<E> {
        public ModelPart Back;
        public ModelPart ArmBaseLeft;
        public ModelPart ArmBaseRight;
        public ModelPart Tail3;
        public ModelPart LegLeft;
        public ModelPart LegRight;

        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Chest = this.Body.getChild("Chest");
            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.EarLeft = this.Head.getChild("EarLeft");

            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Mouth = this.Snout.getChild("Mouth");

            this.EarRight = this.Head.getChild("EarRight");

            this.ArmBaseRight = this.Chest.getChild("ArmBaseRight");
            this.ArmRight = this.ArmBaseRight.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.ArmBaseLeft = this.Chest.getChild("ArmBaseLeft");
            this.ArmLeft = this.ArmBaseLeft.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.LegLeft = this.ThighLeft.getChild("LegLeft");
            this.FootLeft = this.LegLeft.getChild("FootLeft");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.LegRight = this.ThighRight.getChild("LegRight");
            this.FootRight = this.LegRight.getChild("FootRight");

            this.Back = this.Body.getChild("Back");
            this.Tail1 = this.Back.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");
            this.Tail3 = this.Tail2.getChild("Tail3");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -3.3F, -2.5F, 7.0F, 7.0F, 5.0F), PartPose.offsetAndRotation(0.0F, 19.0F, 0.0F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 12).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 6.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -2.8F, -2.5F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 22).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 5.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.1F, -3.7F, -0.5462880425584197F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 30).addBox(-2.5F, -3.0F, -3.0F, 5.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, -0.5F, -0.9F, 0.5462880425584197F, 0.0F, 0.0F));

            PartDefinition ArmBaseRight = Chest.addOrReplaceChild("ArmBaseRight", CubeListBuilder.create().texOffs(24, 0).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-1.6F, 3.2F, -3.0F, 0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition ArmBaseLeft = Chest.addOrReplaceChild("ArmBaseLeft", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(1.6F, 3.2F, -3.0F, 0.2275909337942703F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(16, 21).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F), PartPose.offset(2.7F, -0.8F, 1.7F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(16, 21).mirror(true).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F), PartPose.offset(-2.7F, -0.8F, 1.7F));

            PartDefinition Back = Body.addOrReplaceChild("Back", CubeListBuilder.create().texOffs(6, 43).addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -2.6F, 2.5F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Tail1 = Back.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 52).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 3.4F, 2.0F, -0.45535640450848164F, 0.0F, 0.0F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(10, 52).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.5F, 2.0F, 0.4098033003787853F, 0.0F, 0.0F));

            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(0, 47).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(2.4F, -1.3F, -0.7F, -0.7285004590772052F, -0.5462880425584197F, 0.956091342937205F));
            PartDefinition ArmRight = ArmBaseRight.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(24, 6).mirror(true).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.0F, 1.0F, -0.5462880425584197F, 0.0F, 0.04555309164612875F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(24, 10).mirror(true).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.05F, 1.5F, -1.2F, 0.2275909337942703F, 0.0F, 0.0F));
            PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(0, 58).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.9105382388075086F, 0.0F, 0.0F));
            PartDefinition ArmLeft = ArmBaseLeft.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(24, 6).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(-0.1F, 3.0F, 1.0F, -0.5462880425584197F, 0.0F, 0.04555309164612875F));
            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 39).addBox(-1.5F, 0.0F, -1.25F, 3.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -0.6F, -3.0F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(10, 39).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 0.28F, -1.6F, 0.8196066007575706F, 0.0F, 0.0F));
            PartDefinition LegLeft = ThighLeft.addOrReplaceChild("LegLeft", CubeListBuilder.create().texOffs(18, 29).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -1.5F, 0.4098033003787853F, 0.0F, 0.0F));
            PartDefinition LegRight = ThighRight.addOrReplaceChild("LegRight", CubeListBuilder.create().texOffs(18, 29).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 4.0F, -1.5F, 0.4098033003787853F, 0.0F, 0.0F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.7F, 0.3F, -0.500909508638178F, 0.0F, 0.0F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(0, 47).mirror(true).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(-2.4F, -1.3F, -0.7F, -0.7285004590772052F, 0.5462880425584197F, -0.956091342937205F));
            PartDefinition FootLeft = LegLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(18, 34).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(-0.1F, 2.0F, 1.9F, -0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition FootRight = LegRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(18, 34).mirror(true).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.1F, 2.0F, 1.9F, -0.3642502295386026F, 0.0F, 0.0F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(24, 10).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(-0.05F, 1.5F, -1.2F, 0.2275909337942703F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 64);
        }

        @Override
        public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.546F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.546F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.546F;
            this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.455F;
            this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.409F;
            this.Tail1.yRot = Mth.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.5F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting() && !isSwimming) {
                float speed = 1.5f;
                float degree = 1.0f;
                this.Neck.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.4F) * 0.5F - 0.546F;
                this.Head.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 0.546F;
                this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 1.2F) * 0.5F - 0.091F;
                this.Body.y = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 19.0F;
                this.Chest.xRot = Mth.cos(5.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.8F) * 0.5F + 0.182F;
                this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.455F;
                this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.409F;
                this.Tail1.yRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -3F) * 0.5F;

                this.ArmBaseLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F + 0.227F;
                this.ArmLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.546F;
                this.HandLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F + 0.227F;
                this.ArmBaseRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F + 0.227F;
                this.ArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.546F;
                this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -5F) * 0.5F + 0.227F;
                this.ThighLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F;
                this.ThighLeft.y = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F - 1.09F;
                this.LegLeft.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.409F;
                this.FootLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.364F;
                this.ThighRight.xRot = Mth.cos(7F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F;
                this.ThighRight.y = Mth.cos(7F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 3F) * 0.5F - 1.09F;
                this.LegRight.xRot = Mth.cos(5F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 2F) * 0.5F + 0.409F;
                this.FootRight.xRot = Mth.cos(4F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.364F;

            } else {
                float speed = 2f;
                float degree = 0.8f;
                this.Neck.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.546F;
                this.Head.xRot = Mth.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.546F;
                this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.455F;
                this.Tail2.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.409F;
                this.Tail1.yRot = Mth.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -0.5F) * 0.5F;
                this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.091F;
                this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 19.0F;
                this.Chest.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.182F;

                this.ArmBaseLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.227F;
                this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.546F;
                this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.227F;
                this.ArmBaseRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.227F;
                this.ArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.546F;
                this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.227F;
                this.ThighLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.2F) * 0.5F;
                this.LegLeft.xRot = Mth.cos(7.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.409F;
                this.FootLeft.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.364F;
                this.ThighRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.2F) * 0.5F;
                this.LegRight.xRot = Mth.cos(7.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1F) * 0.5F + 0.409F;
                this.FootRight.xRot = Mth.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.364F;

            }
        }
    }

    public static class Child<E extends Entity> extends ChinchillaModel<E> {
        public ModelPart Belly;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.Belly = this.Body.getChild("Belly");

            this.Chest = this.Body.getChild("Chest");
            this.ArmLeft = this.Chest.getChild("ArmLeft");
            this.HandLeft = this.ArmLeft.getChild("HandLeft");

            this.Neck = this.Chest.getChild("Neck");
            this.Head = this.Neck.getChild("Head");
            this.Snout = this.Head.getChild("Snout");
            this.TopSnout = this.Snout.getChild("TopSnout");

            this.Mouth = this.Snout.getChild("Mouth");

            this.EarRight = this.Head.getChild("EarRight");

            this.EarLeft = this.Head.getChild("EarLeft");

            this.ArmRight = this.Chest.getChild("ArmRight");
            this.HandRight = this.ArmRight.getChild("HandRight");

            this.Tail1 = this.Body.getChild("Tail1");
            this.Tail2 = this.Tail1.getChild("Tail2");

            this.ThighLeft = this.Body.getChild("ThighLeft");
            this.FootLeft = this.ThighLeft.getChild("FootLeft");

            this.ThighRight = this.Body.getChild("ThighRight");
            this.FootRight = this.ThighRight.getChild("FootRight");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 21.8F, 0.0F, -0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition Belly = Body.addOrReplaceChild("Belly", CubeListBuilder.create().texOffs(14, 0).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F), PartPose.offsetAndRotation(0.0F, 1.4F, -1.9F, -0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.9F, -1.3F, 0.18203784630933073F, 0.0F, 0.0F));
            PartDefinition ArmLeft = Chest.addOrReplaceChild("ArmLeft", CubeListBuilder.create().texOffs(10, 8).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(0.8F, 1.7F, -1.2F, -0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition ArmRight = Chest.addOrReplaceChild("ArmRight", CubeListBuilder.create().texOffs(10, 8).mirror(true).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F), PartPose.offsetAndRotation(-0.8F, 1.7F, -1.2F, -0.13665927909957545F, 0.0F, 0.0F));

            PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 1.5F, -1.3F, -0.4098033003787853F, 0.0F, 0.0F));
            PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 18).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F), PartPose.offsetAndRotation(0.0F, -0.2F, -1.5F, 0.4098033003787853F, 0.0F, 0.0F));

            PartDefinition Tail1 = Body.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(14, 4).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, -1.0F, 1.5F, -0.4098033003787853F, 0.0F, 0.0F));

            PartDefinition ThighLeft = Body.addOrReplaceChild("ThighLeft", CubeListBuilder.create().texOffs(8, 12).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(2.2F, -1.6F, 0.7F, 0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition ThighRight = Body.addOrReplaceChild("ThighRight", CubeListBuilder.create().texOffs(8, 12).mirror(true).addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(-2.2F, -1.6F, 0.7F, 0.0911061832922575F, 0.0F, 0.0F));

            PartDefinition Snout = Head.addOrReplaceChild("Snout", CubeListBuilder.create().texOffs(0, 24).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 0.1F, -2.5F, -0.13665927909957545F, 0.0F, 0.0F));
            PartDefinition TopSnout = Snout.addOrReplaceChild("TopSnout", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 0.0F, -0.3F, 0.7740534966278743F, 0.0F, 0.0F));
            PartDefinition FootRight = ThighRight.addOrReplaceChild("FootRight", CubeListBuilder.create().texOffs(9, 17).mirror(true).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(0.6F, 2.8F, 0.3F));
            PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(14, 8).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 2.0F, 2.0F, 0.7740534966278743F, 0.13665927909957545F, 0.0F));
            PartDefinition EarRight = Head.addOrReplaceChild("EarRight", CubeListBuilder.create().texOffs(8, 26).mirror(true).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.3F, 0.3F, -0.5F, 0.0F, 0.3642502295386026F, -0.3642502295386026F));
            PartDefinition EarLeft = Head.addOrReplaceChild("EarLeft", CubeListBuilder.create().texOffs(8, 26).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(-0.3F, 0.3F, -0.5F, 0.0F, -0.3642502295386026F, 0.3642502295386026F));
            PartDefinition HandLeft = ArmLeft.addOrReplaceChild("HandLeft", CubeListBuilder.create().texOffs(8, 6).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.6F, -0.2F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition HandRight = ArmRight.addOrReplaceChild("HandRight", CubeListBuilder.create().texOffs(8, 6).addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.6F, -0.2F, 0.0911061832922575F, 0.0F, 0.0F));
            PartDefinition FootLeft = ThighLeft.addOrReplaceChild("FootLeft", CubeListBuilder.create().texOffs(9, 17).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F), PartPose.offset(-0.6F, 2.8F, 0.3F));
            PartDefinition Mouth = Snout.addOrReplaceChild("Mouth", CubeListBuilder.create().texOffs(6, 24).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 1.3F, 1.0F, -0.3186971254089062F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.409F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.409F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.409F;
            this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.409F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.4f;
            float degree = 1.0f;
            this.Neck.xRot = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.409F;
            this.Head.xRot = Mth.cos(limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 0.409F;
            this.Tail1.xRot = Mth.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.409F;
            this.Body.xRot = Mth.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.091F;
            this.Body.y = Mth.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 21.8F;
            this.Chest.xRot = Mth.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.182F;

            this.ArmLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.136F;
            this.HandLeft.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.091F;
            this.ThighLeft.xRot = Mth.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.091F;
            this.FootLeft.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F;
            this.ArmRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.136F;
            this.HandRight.xRot = Mth.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.091F;
            this.ThighRight.xRot = Mth.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.2F) * 0.5F + 0.091F;
            this.FootRight.xRot = Mth.cos(1.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F;
        }
    }
}
