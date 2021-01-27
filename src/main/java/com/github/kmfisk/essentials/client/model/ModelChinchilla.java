package com.github.kmfisk.essentials.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.soggymustache.bookworm.client.animation.part.BookwormModelRenderer;
import org.zawamod.client.model.base.ZAWAModelBase;

/**
 * Chinchilla - fisk
 * Created using Tabula 7.1.0
 */
public class ModelChinchilla extends ZAWAModelBase {
    public BookwormModelRenderer Body;
    public BookwormModelRenderer Chest;
    public BookwormModelRenderer Back;
    public BookwormModelRenderer ThighLeft;
    public BookwormModelRenderer ThighRight;
    public BookwormModelRenderer Neck;
    public BookwormModelRenderer ArmBaseLeft;
    public BookwormModelRenderer ArmBaseRight;
    public BookwormModelRenderer Head;
    public BookwormModelRenderer Snout;
    public BookwormModelRenderer EarLeft;
    public BookwormModelRenderer EarRight;
    public BookwormModelRenderer TopSnout;
    public BookwormModelRenderer Mouth;
    public BookwormModelRenderer ArmLeft;
    public BookwormModelRenderer HandLeft;
    public BookwormModelRenderer ArmRight;
    public BookwormModelRenderer HandRight;
    public BookwormModelRenderer Tail1;
    public BookwormModelRenderer Tail2;
    public BookwormModelRenderer Tail3;
    public BookwormModelRenderer LegLeft;
    public BookwormModelRenderer FootLeft;
    public BookwormModelRenderer LegRight;
    public BookwormModelRenderer FootRight;

    public ModelChinchilla() {
        this.textureWidth = 32;
        this.textureHeight = 64;
        this.FootLeft = new BookwormModelRenderer(this, 18, 34, "FootLeft");
        this.FootLeft.setRotationPoint(-0.1F, 2.0F, 1.9F);
        this.FootLeft.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(FootLeft, -0.36425021489121656F, 0.0F, 0.0F);
        this.ThighRight = new BookwormModelRenderer(this, 16, 21, "ThighRight");
        this.ThighRight.mirror = true;
        this.ThighRight.setRotationPoint(-2.7F, -0.8F, 1.7F);
        this.ThighRight.addBox(-1.5F, 0.0F, -2.0F, 3, 4, 4, 0.0F);
        this.Tail2 = new BookwormModelRenderer(this, 10, 52, "Tail2");
        this.Tail2.setRotationPoint(0.0F, 1.5F, 2.0F);
        this.Tail2.addBox(-1.5F, -3.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(Tail2, 0.40980330836826856F, 0.0F, 0.0F);
        this.Back = new BookwormModelRenderer(this, 6, 43, "Back");
        this.Back.setRotationPoint(0.0F, -2.6F, 2.5F);
        this.Back.addBox(-3.0F, 0.0F, 0.0F, 6, 6, 2, 0.0F);
        this.setRotateAngle(Back, -0.091106186954104F, 0.0F, 0.0F);
        this.HandLeft = new BookwormModelRenderer(this, 24, 10, "HandLeft");
        this.HandLeft.setRotationPoint(-0.05F, 1.5F, -1.2F);
        this.HandLeft.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
        this.setRotateAngle(HandLeft, 0.22759093446006054F, 0.0F, 0.0F);
        this.ArmBaseLeft = new BookwormModelRenderer(this, 24, 0, "ArmBaseLeft");
        this.ArmBaseLeft.setRotationPoint(1.6F, 3.2F, -3.0F);
        this.ArmBaseLeft.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ArmBaseLeft, 0.22759093446006054F, 0.0F, 0.0F);
        this.HandRight = new BookwormModelRenderer(this, 24, 10, "HandRight");
        this.HandRight.mirror = true;
        this.HandRight.setRotationPoint(0.05F, 1.5F, -1.2F);
        this.HandRight.addBox(-1.0F, 0.0F, -1.5F, 2, 1, 2, 0.0F);
        this.setRotateAngle(HandRight, 0.22759093446006054F, 0.0F, 0.0F);
        this.Head = new BookwormModelRenderer(this, 0, 30, "Head");
        this.Head.setRotationPoint(0.0F, -0.5F, -0.9F);
        this.Head.addBox(-2.5F, -3.0F, -3.0F, 5, 5, 4, 0.0F);
        this.setRotateAngle(Head, 0.5462880558742251F, 0.0F, 0.0F);
        this.EarLeft = new BookwormModelRenderer(this, 0, 47, "EarLeft");
        this.EarLeft.setRotationPoint(2.4F, -1.3F, -0.7F);
        this.EarLeft.addBox(-1.0F, -3.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(EarLeft, -0.7285004297824331F, -0.5462880558742251F, 0.9560913642424937F);
        this.FootRight = new BookwormModelRenderer(this, 18, 34, "FootRight");
        this.FootRight.mirror = true;
        this.FootRight.setRotationPoint(0.1F, 2.0F, 1.9F);
        this.FootRight.addBox(-1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(FootRight, -0.36425021489121656F, 0.0F, 0.0F);
        this.Tail1 = new BookwormModelRenderer(this, 0, 52, "Tail1");
        this.Tail1.setRotationPoint(0.0F, 3.4F, 2.0F);
        this.Tail1.addBox(-1.0F, -1.5F, -1.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Tail1, -0.4553564018453205F, 0.0F, 0.0F);
        this.EarRight = new BookwormModelRenderer(this, 0, 47, "EarRight");
        this.EarRight.mirror = true;
        this.EarRight.setRotationPoint(-2.4F, -1.3F, -0.7F);
        this.EarRight.addBox(-1.0F, -3.0F, 0.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(EarRight, -0.7285004297824331F, 0.5462880558742251F, -0.9560913642424937F);
        this.Chest = new BookwormModelRenderer(this, 0, 12, "Chest");
        this.Chest.setRotationPoint(0.0F, -2.8F, -2.5F);
        this.Chest.addBox(-3.0F, 0.0F, -4.0F, 6, 6, 4, 0.0F);
        this.setRotateAngle(Chest, 0.18203784098300857F, 0.0F, 0.0F);
        this.Mouth = new BookwormModelRenderer(this, 0, 45, "Mouth");
        this.Mouth.setRotationPoint(0.0F, 1.7F, 0.3F);
        this.Mouth.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(Mouth, -0.5009094953223726F, 0.0F, 0.0F);
        this.Snout = new BookwormModelRenderer(this, 0, 39, "Snout");
        this.Snout.setRotationPoint(0.0F, -0.6F, -3.0F);
        this.Snout.addBox(-1.5F, 0.0F, -1.25F, 3, 2, 2, 0.0F);
        this.setRotateAngle(Snout, 0.18203784098300857F, 0.0F, 0.0F);
        this.ThighLeft = new BookwormModelRenderer(this, 16, 21, "ThighLeft");
        this.ThighLeft.setRotationPoint(2.7F, -0.8F, 1.7F);
        this.ThighLeft.addBox(-1.5F, 0.0F, -2.0F, 3, 4, 4, 0.0F);
        this.LegRight = new BookwormModelRenderer(this, 18, 29, "LegRight");
        this.LegRight.mirror = true;
        this.LegRight.setRotationPoint(0.0F, 4.0F, -1.5F);
        this.LegRight.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(LegRight, 0.40980330836826856F, 0.0F, 0.0F);
        this.Tail3 = new BookwormModelRenderer(this, 0, 58, "Tail3");
        this.Tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Tail3.addBox(-1.0F, -3.0F, 0.0F, 2, 3, 3, 0.0F);
        this.setRotateAngle(Tail3, 0.9105382707654417F, 0.0F, 0.0F);
        this.LegLeft = new BookwormModelRenderer(this, 18, 29, "LegLeft");
        this.LegLeft.setRotationPoint(0.0F, 4.0F, -1.5F);
        this.LegLeft.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(LegLeft, 0.40980330836826856F, 0.0F, 0.0F);
        this.Neck = new BookwormModelRenderer(this, 0, 22, "Neck");
        this.Neck.setRotationPoint(0.0F, 3.1F, -3.7F);
        this.Neck.addBox(-2.0F, -3.0F, -2.0F, 4, 5, 3, 0.0F);
        this.setRotateAngle(Neck, -0.5462880558742251F, 0.0F, 0.0F);
        this.ArmRight = new BookwormModelRenderer(this, 24, 6, "ArmRight");
        this.ArmRight.mirror = true;
        this.ArmRight.setRotationPoint(-0.1F, 3.0F, 1.0F);
        this.ArmRight.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ArmRight, -0.5462880558742251F, 0.0F, 0.045553093477052F);
        this.Body = new BookwormModelRenderer(this, 0, 0, "Body");
        this.Body.setRotationPoint(0.0F, 20.4F, 0.0F);
        this.Body.addBox(-3.5F, -3.3F, -2.5F, 7, 7, 5, 0.0F);
        this.setRotateAngle(Body, -0.091106186954104F, 0.0F, 0.0F);
        this.ArmLeft = new BookwormModelRenderer(this, 24, 6, "ArmLeft");
        this.ArmLeft.setRotationPoint(-0.1F, 3.0F, 1.0F);
        this.ArmLeft.addBox(-1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(ArmLeft, -0.5462880558742251F, 0.0F, 0.045553093477052F);
        this.ArmBaseRight = new BookwormModelRenderer(this, 24, 0, "ArmBaseRight");
        this.ArmBaseRight.mirror = true;
        this.ArmBaseRight.setRotationPoint(-1.6F, 3.2F, -3.0F);
        this.ArmBaseRight.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(ArmBaseRight, 0.22759093446006054F, 0.0F, 0.0F);
        this.TopSnout = new BookwormModelRenderer(this, 10, 39, "TopSnout");
        this.TopSnout.setRotationPoint(0.0F, 0.28F, -1.6F);
        this.TopSnout.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(TopSnout, 0.8196066167365371F, 0.0F, 0.0F);
        this.LegLeft.addChild(this.FootLeft);
        this.Body.addChild(this.ThighRight);
        this.Tail1.addChild(this.Tail2);
        this.Body.addChild(this.Back);
        this.ArmLeft.addChild(this.HandLeft);
        this.Chest.addChild(this.ArmBaseLeft);
        this.ArmRight.addChild(this.HandRight);
        this.Neck.addChild(this.Head);
        this.Head.addChild(this.EarLeft);
        this.LegRight.addChild(this.FootRight);
        this.Back.addChild(this.Tail1);
        this.Head.addChild(this.EarRight);
        this.Body.addChild(this.Chest);
        this.Snout.addChild(this.Mouth);
        this.Head.addChild(this.Snout);
        this.Body.addChild(this.ThighLeft);
        this.ThighRight.addChild(this.LegRight);
        this.Tail2.addChild(this.Tail3);
        this.ThighLeft.addChild(this.LegLeft);
        this.Chest.addChild(this.Neck);
        this.ArmBaseRight.addChild(this.ArmRight);
        this.ArmBaseLeft.addChild(this.ArmLeft);
        this.Chest.addChild(this.ArmBaseRight);
        this.Snout.addChild(this.TopSnout);
        this.save();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 0.7D, 0.7D);
        GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
