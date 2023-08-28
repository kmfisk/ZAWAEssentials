package com.github.kmfisk.zawaessentials.client.model;

import com.google.common.collect.ImmutableList;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.zawamod.zawa.client.model.ZawaBaseModel;

public abstract class ChinchillaModel<E extends Entity> extends ZawaBaseModel<E> {
    public ModelRenderer Body;
    public ModelRenderer Chest;
    public ModelRenderer ThighLeft;
    public ModelRenderer ThighRight;
    public ModelRenderer Neck;
    public ModelRenderer HandRight;
    public ModelRenderer Head;
    public ModelRenderer Snout;
    public ModelRenderer EarLeft;
    public ModelRenderer EarRight;
    public ModelRenderer TopSnout;
    public ModelRenderer Mouth;
    public ModelRenderer ArmLeft;
    public ModelRenderer HandLeft;
    public ModelRenderer ArmRight;
    public ModelRenderer Tail1;
    public ModelRenderer Tail2;
    public ModelRenderer FootLeft;
    public ModelRenderer FootRight;
    private Iterable<ModelRenderer> parts;

    @Override
    @MethodsReturnNonnullByDefault
    public Iterable<ModelRenderer> parts() {
        if (this.parts == null) this.parts = ImmutableList.of(this.Body);
        return this.parts;
    }

    public static class Adult<E extends Entity> extends ChinchillaModel<E> {
        public ModelRenderer Back;
        public ModelRenderer ArmBaseLeft;
        public ModelRenderer ArmBaseRight;
        public ModelRenderer Tail3;
        public ModelRenderer LegLeft;
        public ModelRenderer LegRight;

        public Adult() {
            this.texWidth = 32;
            this.texHeight = 64;
            this.HandRight = new ModelRenderer(this, 24, 10);
            this.HandRight.mirror = true;
            this.HandRight.setPos(0.05F, 1.5F, -1.2F);
            this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.2275909337942703F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 0, 47);
            this.EarLeft.setPos(2.4F, -1.3F, -0.7F);
            this.EarLeft.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, -0.7285004590772052F, -0.5462880425584197F, 0.956091342937205F);
            this.ArmRight = new ModelRenderer(this, 24, 6);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-0.1F, 3.0F, 1.0F);
            this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.5462880425584197F, 0.0F, 0.04555309164612875F);
            this.Chest = new ModelRenderer(this, 0, 12);
            this.Chest.setPos(0.0F, -2.8F, -2.5F);
            this.Chest.addBox(-3.0F, 0.0F, -4.0F, 6.0F, 6.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.18203784630933073F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 16, 21);
            this.ThighLeft.setPos(2.7F, -0.8F, 1.7F);
            this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 22);
            this.Neck.setPos(0.0F, 3.1F, -3.7F);
            this.Neck.addBox(-2.0F, -3.0F, -2.0F, 4.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.5462880425584197F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 30);
            this.Head.setPos(0.0F, -0.5F, -0.9F);
            this.Head.addBox(-2.5F, -3.0F, -3.0F, 5.0F, 5.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.5462880425584197F, 0.0F, 0.0F);
            this.Tail3 = new ModelRenderer(this, 0, 58);
            this.Tail3.setPos(0.0F, 0.0F, 3.0F);
            this.Tail3.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail3, 0.9105382388075086F, 0.0F, 0.0F);
            this.ArmBaseRight = new ModelRenderer(this, 24, 0);
            this.ArmBaseRight.mirror = true;
            this.ArmBaseRight.setPos(-1.6F, 3.2F, -3.0F);
            this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseRight, 0.2275909337942703F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 10, 39);
            this.TopSnout.setPos(0.0F, 0.28F, -1.6F);
            this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.8196066007575706F, 0.0F, 0.0F);
            this.ArmLeft = new ModelRenderer(this, 24, 6);
            this.ArmLeft.setPos(-0.1F, 3.0F, 1.0F);
            this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.5462880425584197F, 0.0F, 0.04555309164612875F);
            this.ArmBaseLeft = new ModelRenderer(this, 24, 0);
            this.ArmBaseLeft.setPos(1.6F, 3.2F, -3.0F);
            this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmBaseLeft, 0.2275909337942703F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 39);
            this.Snout.setPos(0.0F, -0.6F, -3.0F);
            this.Snout.addBox(-1.5F, 0.0F, -1.25F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, 0.18203784630933073F, 0.0F, 0.0F);
            this.LegLeft = new ModelRenderer(this, 18, 29);
            this.LegLeft.setPos(0.0F, 4.0F, -1.5F);
            this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegLeft, 0.4098033003787853F, 0.0F, 0.0F);
            this.LegRight = new ModelRenderer(this, 18, 29);
            this.LegRight.mirror = true;
            this.LegRight.setPos(0.0F, 4.0F, -1.5F);
            this.LegRight.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(LegRight, 0.4098033003787853F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 16, 21);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.7F, -0.8F, 1.7F);
            this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 0, 45);
            this.Mouth.setPos(0.0F, 1.7F, 0.3F);
            this.Mouth.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.500909508638178F, 0.0F, 0.0F);
            this.EarRight = new ModelRenderer(this, 0, 47);
            this.EarRight.mirror = true;
            this.EarRight.setPos(-2.4F, -1.3F, -0.7F);
            this.EarRight.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, -0.7285004590772052F, 0.5462880425584197F, -0.956091342937205F);
            this.FootLeft = new ModelRenderer(this, 18, 34);
            this.FootLeft.setPos(-0.1F, 2.0F, 1.9F);
            this.FootLeft.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootLeft, -0.3642502295386026F, 0.0F, 0.0F);
            this.Back = new ModelRenderer(this, 6, 43);
            this.Back.setPos(0.0F, -2.6F, 2.5F);
            this.Back.addBox(-3.0F, 0.0F, 0.0F, 6.0F, 6.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Back, -0.0911061832922575F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 18, 34);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.1F, 2.0F, 1.9F);
            this.FootRight.addBox(-1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(FootRight, -0.3642502295386026F, 0.0F, 0.0F);
            this.HandLeft = new ModelRenderer(this, 24, 10);
            this.HandLeft.setPos(-0.05F, 1.5F, -1.2F);
            this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.2275909337942703F, 0.0F, 0.0F);
            this.Tail1 = new ModelRenderer(this, 0, 52);
            this.Tail1.setPos(0.0F, 3.4F, 2.0F);
            this.Tail1.addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.45535640450848164F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 10, 52);
            this.Tail2.setPos(0.0F, 1.5F, 2.0F);
            this.Tail2.addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.4098033003787853F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 19.0F, 0.0F);
            this.Body.addBox(-3.5F, -3.3F, -2.5F, 7.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.0911061832922575F, 0.0F, 0.0F);
            this.ArmRight.addChild(this.HandRight);
            this.Head.addChild(this.EarLeft);
            this.ArmBaseRight.addChild(this.ArmRight);
            this.Body.addChild(this.Chest);
            this.Body.addChild(this.ThighLeft);
            this.Chest.addChild(this.Neck);
            this.Neck.addChild(this.Head);
            this.Tail2.addChild(this.Tail3);
            this.Chest.addChild(this.ArmBaseRight);
            this.Snout.addChild(this.TopSnout);
            this.ArmBaseLeft.addChild(this.ArmLeft);
            this.Chest.addChild(this.ArmBaseLeft);
            this.Head.addChild(this.Snout);
            this.ThighLeft.addChild(this.LegLeft);
            this.ThighRight.addChild(this.LegRight);
            this.Body.addChild(this.ThighRight);
            this.Snout.addChild(this.Mouth);
            this.Head.addChild(this.EarRight);
            this.LegLeft.addChild(this.FootLeft);
            this.Body.addChild(this.Back);
            this.LegRight.addChild(this.FootRight);
            this.ArmLeft.addChild(this.HandLeft);
            this.Back.addChild(this.Tail1);
            this.Tail1.addChild(this.Tail2);
            this.saveBase();
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
            this.loadBase();
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.546F;
            this.Head.xRot = MathHelper.cos(limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.546F;
            this.Tail1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.455F;
            this.Tail2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.409F;
            this.Tail1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.5F) * 0.5F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting() && !isSwimming) {


            } else {
                float speed = 2f;
                float degree = 0.8f;
                this.Neck.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.546F;
                this.Head.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * - 0.4F) * 0.5F + 0.546F;
                this.Tail1.xRot = MathHelper.cos(1.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.5F) * 0.5F - 0.455F;
                this.Tail2.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 0.409F;
                this.Tail1.yRot = MathHelper.cos(4.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -0.5F) * 0.5F;
                this.Body.xRot = MathHelper.cos(4.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * 0.1F) * 0.5F -0.091F;
                this.Body.y = MathHelper.cos(2.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.5F) * 0.5F + 19.0F;
                this.Chest.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.5F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.182F;

                this.ArmBaseLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * - 1.2F) * 0.5F + 0.227F;
                this.ArmLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F - 0.546F;
                this.HandLeft.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F + 0.227F;
                this.ArmBaseRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.2F) * 0.5F + 0.227F;
                this.ArmRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -3F) * 0.5F - 0.546F;
                this.HandRight.xRot = MathHelper.cos(2.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 3F) * 0.5F + 0.227F;
                this.ThighLeft.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1.2F) * 0.5F;
                this.LegLeft.xRot = MathHelper.cos(7.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1F) * 0.5F + 0.409F;
                this.FootLeft.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -2F) * 0.5F -0.364F;
                this.ThighRight.xRot = MathHelper.cos(6.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * -1.2F) * 0.5F;
                this.LegRight.xRot = MathHelper.cos(7.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 1F) * 0.5F + 0.409F;
                this.FootRight.xRot = MathHelper.cos(3.0F + limbSwing * speed * 0.25F) * limbSwingAmount * (degree * 2F) * 0.5F -0.364F;

            }
        }
    }

    public static class Child<E extends Entity> extends ChinchillaModel<E> {
        public ModelRenderer Belly;

        public Child() {
            this.texWidth = 32;
            this.texHeight = 32;
            this.HandLeft = new ModelRenderer(this, 8, 6);
            this.HandLeft.setPos(0.0F, 1.6F, -0.2F);
            this.HandLeft.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandLeft, 0.0911061832922575F, 0.0F, 0.0F);
            this.Belly = new ModelRenderer(this, 14, 0);
            this.Belly.setPos(0.0F, 1.4F, -1.9F);
            this.Belly.addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Belly, -0.0911061832922575F, 0.0F, 0.0F);
            this.TopSnout = new ModelRenderer(this, 0, 26);
            this.TopSnout.setPos(0.0F, 0.0F, -0.3F);
            this.TopSnout.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(TopSnout, 0.7740534966278743F, 0.0F, 0.0F);
            this.Snout = new ModelRenderer(this, 0, 24);
            this.Snout.setPos(0.0F, 0.1F, -2.5F);
            this.Snout.addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Snout, -0.13665927909957545F, 0.0F, 0.0F);
            this.FootRight = new ModelRenderer(this, 9, 17);
            this.FootRight.mirror = true;
            this.FootRight.setPos(0.6F, 2.8F, 0.3F);
            this.FootRight.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Tail2 = new ModelRenderer(this, 14, 8);
            this.Tail2.setPos(0.0F, 2.0F, 2.0F);
            this.Tail2.addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail2, 0.7740534966278743F, 0.13665927909957545F, 0.0F);
            this.EarRight = new ModelRenderer(this, 8, 26);
            this.EarRight.mirror = true;
            this.EarRight.setPos(0.3F, 0.3F, -0.5F);
            this.EarRight.addBox(-2.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarRight, 0.0F, 0.3642502295386026F, -0.3642502295386026F);
            this.ArmLeft = new ModelRenderer(this, 10, 8);
            this.ArmLeft.setPos(0.8F, 1.7F, -1.2F);
            this.ArmLeft.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmLeft, -0.13665927909957545F, 0.0F, 0.0F);
            this.Body = new ModelRenderer(this, 0, 0);
            this.Body.setPos(0.0F, 21.8F, 0.0F);
            this.Body.addBox(-2.0F, -2.0F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Body, -0.0911061832922575F, 0.0F, 0.0F);
            this.Chest = new ModelRenderer(this, 0, 7);
            this.Chest.setPos(0.0F, -1.9F, -1.3F);
            this.Chest.addBox(-1.5F, 0.0F, -2.0F, 3.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Chest, 0.18203784630933073F, 0.0F, 0.0F);
            this.EarLeft = new ModelRenderer(this, 8, 26);
            this.EarLeft.setPos(-0.3F, 0.3F, -0.5F);
            this.EarLeft.addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(EarLeft, 0.0F, -0.3642502295386026F, 0.3642502295386026F);
            this.Tail1 = new ModelRenderer(this, 14, 4);
            this.Tail1.setPos(0.0F, -1.0F, 1.5F);
            this.Tail1.addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Tail1, -0.4098033003787853F, 0.0F, 0.0F);
            this.Head = new ModelRenderer(this, 0, 18);
            this.Head.setPos(0.0F, -0.2F, -1.5F);
            this.Head.addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.4098033003787853F, 0.0F, 0.0F);
            this.HandRight = new ModelRenderer(this, 8, 6);
            this.HandRight.setPos(0.0F, 1.6F, -0.2F);
            this.HandRight.addBox(-0.5F, 0.0F, -0.7F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(HandRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.FootLeft = new ModelRenderer(this, 9, 17);
            this.FootLeft.setPos(-0.6F, 2.8F, 0.3F);
            this.FootLeft.addBox(-0.5F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.Neck = new ModelRenderer(this, 0, 13);
            this.Neck.setPos(0.0F, 1.5F, -1.3F);
            this.Neck.addBox(-1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Neck, -0.4098033003787853F, 0.0F, 0.0F);
            this.ArmRight = new ModelRenderer(this, 10, 8);
            this.ArmRight.mirror = true;
            this.ArmRight.setPos(-0.8F, 1.7F, -1.2F);
            this.ArmRight.addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ArmRight, -0.13665927909957545F, 0.0F, 0.0F);
            this.Mouth = new ModelRenderer(this, 6, 24);
            this.Mouth.setPos(0.0F, 1.3F, 1.0F);
            this.Mouth.addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(Mouth, -0.3186971254089062F, 0.0F, 0.0F);
            this.ThighLeft = new ModelRenderer(this, 8, 12);
            this.ThighLeft.setPos(2.2F, -1.6F, 0.7F);
            this.ThighLeft.addBox(-2.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighLeft, 0.0911061832922575F, 0.0F, 0.0F);
            this.ThighRight = new ModelRenderer(this, 8, 12);
            this.ThighRight.mirror = true;
            this.ThighRight.setPos(-2.2F, -1.6F, 0.7F);
            this.ThighRight.addBox(0.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(ThighRight, 0.0911061832922575F, 0.0F, 0.0F);
            this.ArmLeft.addChild(this.HandLeft);
            this.Body.addChild(this.Belly);
            this.Snout.addChild(this.TopSnout);
            this.Head.addChild(this.Snout);
            this.ThighRight.addChild(this.FootRight);
            this.Tail1.addChild(this.Tail2);
            this.Head.addChild(this.EarRight);
            this.Chest.addChild(this.ArmLeft);
            this.Body.addChild(this.Chest);
            this.Head.addChild(this.EarLeft);
            this.Body.addChild(this.Tail1);
            this.Neck.addChild(this.Head);
            this.ArmRight.addChild(this.HandRight);
            this.ThighLeft.addChild(this.FootLeft);
            this.Chest.addChild(this.Neck);
            this.Chest.addChild(this.ArmRight);
            this.Snout.addChild(this.Mouth);
            this.Body.addChild(this.ThighLeft);
            this.Body.addChild(this.ThighRight);
            this.saveBase();
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
            this.loadBase();
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.loadBase();
        }
    }
}
