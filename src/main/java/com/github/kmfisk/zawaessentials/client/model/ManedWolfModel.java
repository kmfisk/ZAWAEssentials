package com.github.kmfisk.zawaessentials.client.model;

import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class ManedWolfModel<E extends Entity> extends ZawaBaseModel<E> {
    public ModelRenderer Chest;
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer ArmBaseLeft;
    public ModelRenderer ArmBaseRight;
    public ModelRenderer Hips;
    public ModelRenderer Tail1;
    public ModelRenderer ThighLeft;
    public ModelRenderer ThighRight;
    public ModelRenderer UpperLegLeft;
    public ModelRenderer LowerLegLeft;
    public ModelRenderer FootLeft;
    public ModelRenderer UpperLegRight;
    public ModelRenderer LowerLegRight;
    public ModelRenderer FootRight;
    public ModelRenderer Head;
    public ModelRenderer NeckLower;
    public ModelRenderer Mane;
    public ModelRenderer Snout;
    public ModelRenderer EarLeft;
    public ModelRenderer EarRight;
    public ModelRenderer TopSnout;
    public ModelRenderer Mouth;
    public ModelRenderer UpperArmLeft;
    public ModelRenderer ArmLeft;
    public ModelRenderer HandLeft;
    public ModelRenderer UpperArmRight;
    public ModelRenderer ArmRight;
    public ModelRenderer HandRight;
    private Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) this.parts = ImmutableList.of(this.Chest);
        return this.parts;
    }

    public static class Adult<E extends Entity> extends ManedWolfModel<E> {
        public ModelRenderer Belly;
        public ModelRenderer Tail2;

        public Adult() {
            this.texWidth = 64;
            this.texHeight = 64;
            this.LowerLegLeft = new ModelRenderer(this, 41, 33);
            this.LowerLegLeft.setPos(0.0F, 4.5F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.31869712141416456F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 48, 25);
            this.UpperLegLeft.setPos(0.0F, 6.5F, -1.4F);
            this.UpperLegLeft.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.4553564018453205F, 0.0F, 0.0F);
            this.Mane = new ModelRenderer(this, 24, 0);
            this.Mane.setPos(0.0F, -5.2F, 0.9F);
            this.Mane.addBox(-1.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
            this.NeckLower = new ModelRenderer(this, 18, 30);
            this.NeckLower.setPos(0.0F, -5.0F, -2.4F);
            this.NeckLower.addBox(-1.5F, -2.0F, 0.0F, 3, 2, 6, 0.0F);
            this.setRotateAngle(NeckLower, -1.9123572614101867F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 32, 22);
            this.ThighLeft.setPos(1.8F, 1.3F, 1.4F);
            this.ThighLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
            this.setRotateAngle(ThighLeft, 0.18203784098300857F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 49, 37);
            this.FootLeft.setPos(0.0F, 5.8F, -0.8F);
            this.FootLeft.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
            this.HandRight = new ModelRenderer(this, 54, 16);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.0F, 3.5F, 1.2F);
            this.HandRight.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(HandRight, 0.091106186954104F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 36, 0);
            this.Tail1.setPos(0.0F, 0.7F, 4.0F);
            this.Tail1.addBox(-1.5F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
            this.setRotateAngle(Tail1, 0.5462880558742251F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 46, 14);
            this.ArmLeft.setPos(0.0F, 6.3F, -2.5F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(ArmLeft, -0.091106186954104F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 48, 25);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 6.5F, -1.4F);
            this.UpperLegRight.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.4553564018453205F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 30);
            this.Hips.setPos(0.0F, 0.0F, 10.0F);
            this.Hips.addBox(-2.5F, 0.0F, 0.0F, 5, 7, 4, 0.0F);
            this.setRotateAngle(Hips, -0.27314402793711257F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 12, 59);
            this.TopSnout.setPos(0.0F, 0.0F, -3.2F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
            this.setRotateAngle(TopSnout, 0.31869712141416456F, 0.0F, 0.0F);
            this.Belly = new ModelRenderer(this, 18, 39);
            this.Belly.setPos(0.0F, 8.0F, -0.3F);
            this.Belly.addBox(-2.5F, -2.0F, 0.0F, 5, 2, 8, 0.0F);
            this.setRotateAngle(Belly, 0.136659280431156F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 13);
            this.Body.setPos(0.0F, -4.0F, 1.5F);
            this.Body.addBox(-3.0F, 0.0F, 0.0F, 6, 7, 10, 0.0F);
            this.setRotateAngle(Body, 0.091106186954104F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 22, 59);
            this.Mouth.setPos(0.0F, 1.5F, 0.0F);
            this.Mouth.addBox(-1.0F, 0.0F, -2.7F, 2, 1, 3, 0.0F);
            this.setRotateAngle(Mouth, -0.045553093477052F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 46, 14);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.0F, 6.3F, -2.5F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(ArmRight, -0.091106186954104F, 0.0F, 0.0F);
            this.ArmBaseLeft = new ModelRenderer(this, 22, 11);
            this.ArmBaseLeft.setPos(2.2F, -0.4F, -0.3F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.31869712141416456F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 41, 33);
            this.LowerLegRight.mirror = true;
            this.LowerLegRight.setPos(0.0F, 4.5F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.31869712141416456F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 16, 49);
            this.Head.setPos(0.0F, -4.4F, -0.9F);
            this.Head.addBox(-2.5F, -3.0F, -3.0F, 5, 5, 5, 0.0F);
            this.setRotateAngle(Head, -0.8196066167365371F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 36, 10);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 4.5F, 1.5F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -3.0F, 2, 7, 3, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.18203784098300857F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 22, 11);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-2.1F, -0.4F, -0.3F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.31869712141416456F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 36, 10);
            this.UpperArmLeft.setPos(0.0F, 4.5F, 1.5F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -3.0F, 2, 7, 3, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.18203784098300857F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 58);
            this.Snout.setPos(0.0F, -0.6F, -2.6F);
            this.Snout.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
            this.setRotateAngle(Snout, 0.045553093477052F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 32, 22);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.8F, 1.3F, 1.4F);
            this.ThighRight.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
            this.setRotateAngle(ThighRight, 0.18203784098300857F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 54, 16);
            this.HandLeft.setPos(0.0F, 3.5F, 1.2F);
            this.HandLeft.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(HandLeft, 0.091106186954104F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 41);
            this.EarLeft.setPos(1.9F, -2.2F, 0.0F);
            this.EarLeft.addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1, 0.0F);
            this.setRotateAngle(EarLeft, 0.18203784098300857F, -0.27314402793711257F, 0.36425021489121656F);
            this.FootRight = new ModelRenderer(this, 49, 37);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 5.8F, -0.8F);
            this.FootRight.addBox(-1.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 49);
            this.Neck.setPos(0.0F, -2.0F, -0.5F);
            this.Neck.addBox(-2.0F, -5.0F, -2.0F, 4, 5, 4, 0.0F);
            this.setRotateAngle(Neck, 1.0927506446736497F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 48, 0);
            this.Tail2.setPos(0.0F, 5.0F, -3.0F);
            this.Tail2.addBox(-1.5F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
            this.setRotateAngle(Tail2, 0.136659280431156F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 41);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-1.9F, -2.2F, 0.0F);
            this.EarRight.addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1, 0.0F);
            this.setRotateAngle(EarRight, 0.18203784098300857F, 0.27314402793711257F, -0.36425021489121656F);
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 9.5F, -5.7F);
            this.Chest.addBox(-3.5F, -4.0F, -2.5F, 7, 8, 5, 0.0F);
            this.setRotateAngle(Chest, -0.136659280431156F, 0.0F, 0.0F);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.Neck.addChild(this.Mane);
            this.Neck.addChild(this.NeckLower);
            this.Hips.addChild(this.ThighLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.ArmRight.addChild(this.HandRight);
            this.Hips.addChild(this.Tail1);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Body.addChild(this.Hips);
            this.Snout.addChild(this.TopSnout);
            this.Body.addChild(this.Belly);
            this.Chest.addChild(this.Body);
            this.Snout.addChild(this.Mouth);
            this.UpperArmRight.addChild(this.ArmRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Neck.addChild(this.Head);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.Chest.addChild(this.ArmBaseRight);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Head.addChild(this.Snout);
            this.Hips.addChild(this.ThighRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.EarLeft);
            this.LowerLegRight.addChild(this.FootRight);
            this.Chest.addChild(this.Neck);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.EarRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.092F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.819F;
            this.Tail1.xRot = MathHelper.cos(limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.546F;
            this.Tail1.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.5F);
            this.Tail2.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.6F) * -0.8F + 0.1366F;
            this.Tail2.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F);
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
            float speed = 1.0f;
            float degree = 0.5f;

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting() && !isSwimming) {
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.092F;
                this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.25F) * 0.5F - 0.819F;


            } else {
                this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 1.092F;
                this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.25F) * 0.5F - 0.819F;
                this.Chest.xRot = MathHelper.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.136F;
                this.Chest.y = MathHelper.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.3F) * 0.5F + 9.5F;
                this.Body.xRot = MathHelper.cos(limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.5F + 0.091F;
                this.Tail1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.4F) * 0.5F + 0.546F;
                this.Tail1.zRot = MathHelper.cos(2.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -0.5F);
                this.Tail2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.6F) * -0.8F + 0.1366F;
                this.Tail2.zRot = MathHelper.cos(3.0F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F);

                this.ArmBaseLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 1.4F) * 0.5F + 0.31F;
                this.UpperArmLeft.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -1.8F) * 0.5F - 0.182F;
                this.ArmLeft.xRot = MathHelper.cos(4.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2.8F) * 0.5F - 0.09F;
                this.HandLeft.xRot = MathHelper.cos(4.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.0911F;
                this.ArmBaseRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 0.31F;
                this.UpperArmRight.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 1.8F) * 0.5F - 0.182F;
                this.ArmRight.xRot = MathHelper.cos(4.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2.8F) * 0.5F - 0.09F;
                this.HandRight.xRot = MathHelper.cos(4.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.0911F;

                this.ThighLeft.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -1.4F) * 0.5F + 0.182F;
                this.UpperLegLeft.xRot = MathHelper.cos(limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -1.8F) * 0.5F + 0.455F;
                this.LowerLegLeft.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2F) * 0.5F - 0.318F;
                this.FootLeft.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2F) * 0.5F;
                this.ThighRight.xRot = MathHelper.cos(1.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 1.4F) * 0.5F + 0.182F;
                this.UpperLegRight.xRot = MathHelper.cos(limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 1.8F) * 0.5F + 0.455F;
                this.LowerLegRight.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2F) * 0.5F - 0.318F;
                this.FootRight.xRot = MathHelper.cos(5.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2F) * 0.5F;
            }
        }
    }

    public static class Child<E extends Entity> extends ManedWolfModel<E> {
        public Child() {
            this.texWidth = 64;
            this.texHeight = 32;
            this.Chest = new ModelRenderer(this, 0, 0);
            this.Chest.setPos(0.0F, 14.8F, -3.0F);
            this.Chest.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
            this.setRotateAngle(Chest, -0.136659280431156F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 32, 20);
            this.EarRight.setPos(-1.9F, -2.2F, 0.0F);
            this.EarRight.addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1, 0.0F);
            this.setRotateAngle(EarRight, 0.36425021489121656F, 0.045553093477052F, -0.4553564018453205F);
            this.ArmBaseLeft = new ModelRenderer(this, 36, 0);
            this.ArmBaseLeft.setPos(1.8F, 0.6F, 0.0F);
            this.ArmBaseLeft.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.22759093446006054F, 0.0F, 0.0F);
            this.Hips = new ModelRenderer(this, 0, 22);
            this.Hips.setPos(0.0F, 0.0F, 6.0F);
            this.Hips.addBox(-2.0F, 0.0F, 0.0F, 4, 6, 3, 0.0F);
            this.setRotateAngle(Hips, -0.22759093446006054F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 44, 5);
            this.ThighLeft.setPos(1.7F, 1.2F, 1.0F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
            this.setRotateAngle(ThighLeft, 0.22759093446006054F, 0.0F, 0.0F);
            this.UpperArmLeft = new ModelRenderer(this, 48, 0);
            this.UpperArmLeft.setPos(0.0F, 3.0F, 1.0F);
            this.UpperArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(UpperArmLeft, -0.091106186954104F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 22, 10);
            this.Head.setPos(0.0F, -3.0F, 0.0F);
            this.Head.addBox(-2.5F, -3.0F, -3.0F, 5, 5, 5, 0.0F);
            this.setRotateAngle(Head, -0.5918411493512771F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 36, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.8F, 0.6F, 0.0F);
            this.ArmBaseRight.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.22759093446006054F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 56, 0);
            this.ArmLeft.setPos(-0.01F, 2.9F, -2.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(ArmLeft, -0.045553093477052F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 36, 6);
            this.HandRight.setPos(0.0F, 2.0F, 1.0F);
            this.HandRight.addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2, 0.0F);
            this.FootRight = new ModelRenderer(this, 48, 20);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.0F, 3.5F, -1.0F);
            this.FootRight.addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2, 0.0F);
            this.Neck = new ModelRenderer(this, 20, 0);
            this.Neck.setPos(0.0F, -1.0F, -0.5F);
            this.Neck.addBox(-2.0F, -4.0F, -2.0F, 4, 6, 4, 0.0F);
            this.setRotateAngle(Neck, 0.8196066167365371F, 0.0F, 0.0F);
            this.UpperArmRight = new ModelRenderer(this, 48, 0);
            this.UpperArmRight.mirror = true;
            this.UpperArmRight.setPos(0.0F, 3.0F, 1.0F);
            this.UpperArmRight.addBox(-1.0F, 0.0F, -2.0F, 2, 3, 2, 0.0F);
            this.setRotateAngle(UpperArmRight, -0.091106186954104F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 56, 0);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(0.01F, 2.9F, -2.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
            this.setRotateAngle(ArmRight, -0.045553093477052F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 36, 6);
            this.HandLeft.setPos(0.0F, 1.9F, 1.0F);
            this.HandLeft.addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2, 0.0F);
            this.setRotateAngle(HandLeft, 0.091106186954104F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 32, 20);
            this.EarLeft.setPos(1.9F, -2.2F, 0.0F);
            this.EarLeft.addBox(-1.5F, -3.0F, 0.0F, 3, 5, 1, 0.0F);
            this.setRotateAngle(EarLeft, 0.36425021489121656F, -0.045553093477052F, 0.4553564018453205F);
            this.Mouth = new ModelRenderer(this, 14, 26);
            this.Mouth.setPos(0.0F, 1.5F, 0.0F);
            this.Mouth.addBox(-1.0F, 0.0F, -1.8F, 2, 1, 2, 0.0F);
            this.setRotateAngle(Mouth, -0.136659280431156F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 14, 22);
            this.TopSnout.setPos(0.0F, 0.0F, -2.2F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
            this.setRotateAngle(TopSnout, 0.18203784098300857F, 0.0F, 0.0F);
            this.UpperLegLeft = new ModelRenderer(this, 42, 14);
            this.UpperLegLeft.setPos(0.0F, 5.0F, -1.5F);
            this.UpperLegLeft.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
            this.setRotateAngle(UpperLegLeft, 0.5462880558742251F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 48, 20);
            this.FootLeft.setPos(0.0F, 3.5F, -1.0F);
            this.FootLeft.addBox(-1.0F, -1.1F, -1.8F, 2, 2, 2, 0.0F);
            this.Snout = new ModelRenderer(this, 22, 20);
            this.Snout.setPos(0.0F, -0.6F, -3.0F);
            this.Snout.addBox(-1.5F, 0.0F, -2.0F, 3, 2, 2, 0.0F);
            this.setRotateAngle(Snout, 0.091106186954104F, 0.0F, 0.0F);
            this.NeckLower = new ModelRenderer(this, 24, 24);
            this.NeckLower.setPos(0.0F, -4.0F, -2.0F);
            this.NeckLower.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 1, 0.0F);
            this.setRotateAngle(NeckLower, -0.136659280431156F, 0.0F, 0.0F);
            this.LowerLegLeft = new ModelRenderer(this, 40, 20);
            this.LowerLegLeft.setPos(-0.05F, 3.0F, 2.5F);
            this.LowerLegLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(LowerLegLeft, -0.5462880558742251F, 0.0F, 0.0F);
            this.LowerLegRight = new ModelRenderer(this, 40, 20);
            this.LowerLegRight.setPos(0.05F, 3.0F, 2.5F);
            this.LowerLegRight.addBox(-1.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
            this.setRotateAngle(LowerLegRight, -0.5462880558742251F, 0.0F, 0.0F);
            this.Mane = new ModelRenderer(this, 32, 26);
            this.Mane.setPos(0.0F, -3.7F, 0.7F);
            this.Mane.addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
            this.Tail1 = new ModelRenderer(this, 46, 25);
            this.Tail1.setPos(0.0F, 0.5F, 3.0F);
            this.Tail1.addBox(-1.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F);
            this.setRotateAngle(Tail1, 0.6373942428283291F, 0.0F, 0.0F);
            this.UpperLegRight = new ModelRenderer(this, 42, 14);
            this.UpperLegRight.mirror = true;
            this.UpperLegRight.setPos(0.0F, 5.0F, -1.5F);
            this.UpperLegRight.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
            this.setRotateAngle(UpperLegRight, 0.5462880558742251F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 10);
            this.Body.setPos(0.0F, -3.02F, 1.1F);
            this.Body.addBox(-2.5F, 0.0F, 0.0F, 5, 6, 6, 0.0F);
            this.setRotateAngle(Body, 0.136659280431156F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 44, 5);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-1.7F, 1.2F, 1.0F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3, 5, 4, 0.0F);
            this.setRotateAngle(ThighRight, 0.22759093446006054F, 0.0F, 0.0F);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Body.addChild(this.Hips);
            this.Hips.addChild(this.ThighLeft);
            this.ArmBaseLeft.addChild(this.UpperArmLeft);
            this.Neck.addChild(this.Head);
            this.Chest.addChild(this.ArmBaseRight);
            this.UpperArmLeft.addChild(this.ArmLeft);
            this.ArmRight.addChild(this.HandRight);
            this.LowerLegRight.addChild(this.FootRight);
            this.Chest.addChild(this.Neck);
            this.ArmBaseRight.addChild(this.UpperArmRight);
            this.UpperArmRight.addChild(this.ArmRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.Head.addChild(this.EarLeft);
            this.Snout.addChild(this.Mouth);
            this.Snout.addChild(this.TopSnout);
            this.ThighLeft.addChild(this.UpperLegLeft);
            this.LowerLegLeft.addChild(this.FootLeft);
            this.Head.addChild(this.Snout);
            this.Neck.addChild(this.NeckLower);
            this.UpperLegLeft.addChild(this.LowerLegLeft);
            this.UpperLegRight.addChild(this.LowerLegRight);
            this.Neck.addChild(this.Mane);
            this.Hips.addChild(this.Tail1);
            this.ThighRight.addChild(this.UpperLegRight);
            this.Chest.addChild(this.Body);
            this.Hips.addChild(this.ThighRight);
            this.saveBase();
        }

        @Override
        public void setupAnim(E entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
            this.loadBase();
        }

        @Override
        public void playMovementAnimation(Entity entity, float v, float v1, float v2, float v3, float v4) {
            this.loadBase();
        }
    }
}
