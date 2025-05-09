package com.github.kmfisk.zawaessentials.client.model;

import com.github.kmfisk.zawaessentials.entity.GreaterPrairieChickenEntity;
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

public abstract class GreaterPrairieChickenModel extends ZawaBaseModel<GreaterPrairieChickenEntity> {
    public ModelPart Body;
    public ModelPart Chest;
    public ModelPart TailBase;
    public ModelPart Leg1Left;
    public ModelPart Leg1Right;
    public ModelPart Wing1Left;
    public ModelPart Wing1Right;
    public ModelPart Neck1;
    public ModelPart Neck2;
    public ModelPart BalloonL;
    public ModelPart NeckBackL;
    public ModelPart NeckBackR;
    public ModelPart Head;
    public ModelPart BeakTop;
    public ModelPart EarTuftLeft1;
    public ModelPart EarTuftRight1;
    public ModelPart BeakBottom;
    public ModelPart EarTuftLeft2;
    public ModelPart EarTuftLeft3;
    public ModelPart EarTuftRight2;
    public ModelPart EarTuftRight3;
    public ModelPart BalloonR;
    public ModelPart BalloonTuft1;
    public ModelPart BalloonTuft2;
    public ModelPart BalloonTuft3;
    public ModelPart BalloonTuft3_1;
    public ModelPart Tail2;
    public ModelPart TailCenter;
    public ModelPart Tail1Left;
    public ModelPart Tail1Right;
    public ModelPart Tail2Left;
    public ModelPart Tail3Left;
    public ModelPart Tail4Left;
    public ModelPart Tail2Right;
    public ModelPart Tail3Right;
    public ModelPart Tail4Right;
    public ModelPart Leg2Left;
    public ModelPart Toe1L;
    public ModelPart Toe2L;
    public ModelPart Toe3L;
    public ModelPart Toe4L;
    public ModelPart Leg2Right;
    public ModelPart Toe1R;
    public ModelPart Toe2R;
    public ModelPart Toe3R;
    public ModelPart Toe4R;
    public ModelPart Wing2Left;
    public ModelPart Wing2Left_1;
    private Iterable<ModelPart> parts;

    @Override
    public Iterable<ModelPart> parts() {
        if (this.parts == null) this.parts = ImmutableList.of(this.Body);
        return this.parts;
    }

    public static class Adult extends GreaterPrairieChickenModel {
        public Adult(ModelPart root) {
            this.Body = root.getChild("Body");
            this.TailBase = this.Body.getChild("TailBase");
            this.Tail2 = this.TailBase.getChild("Tail2");
            this.TailCenter = this.Tail2.getChild("TailCenter");
            this.Tail1Right = this.TailCenter.getChild("Tail1Right");
            this.Tail2Right = this.Tail1Right.getChild("Tail2Right");
            this.Tail3Right = this.Tail2Right.getChild("Tail3Right");
            this.Tail4Right = this.Tail3Right.getChild("Tail4Right");

            this.Tail1Left = this.TailCenter.getChild("Tail1Left");
            this.Tail2Left = this.Tail1Left.getChild("Tail2Left");
            this.Tail3Left = this.Tail2Left.getChild("Tail3Left");
            this.Tail4Left = this.Tail3Left.getChild("Tail4Left");

            this.Wing1Left = this.Body.getChild("Wing1Left");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");

            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.Wing2Left_1 = this.Wing1Right.getChild("Wing2Left_1");

            this.Chest = this.Body.getChild("Chest");
            this.Neck1 = this.Chest.getChild("Neck1");
            this.Neck2 = this.Neck1.getChild("Neck2");
            this.Head = this.Neck2.getChild("Head");
            this.EarTuftLeft1 = this.Head.getChild("EarTuftLeft1");
            this.EarTuftLeft3 = this.EarTuftLeft1.getChild("EarTuftLeft3");

            this.EarTuftLeft2 = this.EarTuftLeft1.getChild("EarTuftLeft2");

            this.BeakTop = this.Head.getChild("BeakTop");
            this.BeakBottom = this.BeakTop.getChild("BeakBottom");

            this.EarTuftRight1 = this.Head.getChild("EarTuftRight1");
            this.EarTuftRight2 = this.EarTuftRight1.getChild("EarTuftRight2");

            this.EarTuftRight3 = this.EarTuftRight1.getChild("EarTuftRight3");

            this.NeckBackL = this.Neck2.getChild("NeckBackL");

            this.NeckBackR = this.Neck2.getChild("NeckBackR");

            this.BalloonL = this.Neck1.getChild("BalloonL");
            this.BalloonR = this.BalloonL.getChild("BalloonR");

            this.BalloonTuft1 = this.BalloonL.getChild("BalloonTuft1");
            this.BalloonTuft2 = this.BalloonTuft1.getChild("BalloonTuft2");
            this.BalloonTuft3 = this.BalloonTuft2.getChild("BalloonTuft3");
            this.BalloonTuft3_1 = this.BalloonTuft3.getChild("BalloonTuft3_1");

            this.Leg1Left = this.Body.getChild("Leg1Left");
            this.Leg2Left = this.Leg1Left.getChild("Leg2Left");
            this.Toe1L = this.Leg2Left.getChild("Toe1L");
            this.Toe2L = this.Toe1L.getChild("Toe2L");

            this.Toe3L = this.Toe1L.getChild("Toe3L");

            this.Toe4L = this.Toe1L.getChild("Toe4L");

            this.Leg1Right = this.Body.getChild("Leg1Right");
            this.Leg2Right = this.Leg1Right.getChild("Leg2Right");
            this.Toe1R = this.Leg2Right.getChild("Toe1R");
            this.Toe4R = this.Toe1R.getChild("Toe4R");

            this.Toe3R = this.Toe1R.getChild("Toe3R");

            this.Toe2R = this.Toe1R.getChild("Toe2R");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6), PartPose.offsetAndRotation(0.0F, 18.9F, 0.0F, -0.36425021489121656F, 0.0F, 0.0F));
            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(0, 26).addBox(-2.5F, 0.0F, -1.5F, 5, 5, 4), PartPose.offsetAndRotation(0.0F, -2.3F, 2.3F, -0.27314402793711257F, 0.0F, 0.0F));
            PartDefinition Tail2 = TailBase.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(14, 35).addBox(-1.5F, 0.0F, 0.0F, 3, 4, 4), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.136659280431156F, 0.0F, 0.0F));
            PartDefinition TailCenter = Tail2.addOrReplaceChild("TailCenter", CubeListBuilder.create().texOffs(18, 29).addBox(-1.0F, 0.0F, 0.0F, 2, 1, 5), PartPose.offsetAndRotation(0.0F, 0.4F, 2.8F, 0.045553093477052F, 0.0F, 0.0F));
            PartDefinition Tail1Right = TailCenter.addOrReplaceChild("Tail1Right", CubeListBuilder.create().texOffs(18, 29).mirror(true).addBox(-2.0F, 0.0F, 0.0F, 2, 1, 5), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -0.045553093477052F, -0.045553093477052F, 0.0F));

            PartDefinition Tail1Left = TailCenter.addOrReplaceChild("Tail1Left", CubeListBuilder.create().texOffs(18, 29).addBox(0.0F, 0.0F, 0.0F, 2, 1, 5), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.045553093477052F, 0.045553093477052F, 0.0F));

            PartDefinition Wing1Left = Body.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(22, 43).addBox(-2.0F, -2.5F, 0.0F, 2, 5, 3), PartPose.offsetAndRotation(3.0F, 0.0F, -2.75F, 0.0F, 0.36425021489121656F, 0.0F));

            PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(22, 43).mirror(true).addBox(0.0F, -2.5F, 0.0F, 2, 5, 3), PartPose.offsetAndRotation(-3.0F, 0.0F, -2.75F, 0.0F, -0.36425021489121656F, 0.0F));

            PartDefinition Chest = Body.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 12).addBox(-2.5F, -4.0F, 0.0F, 5, 4, 4), PartPose.offsetAndRotation(0.0F, 2.5F, -3.0F, 0.8651597102135892F, 0.0F, 0.0F));
            PartDefinition Neck1 = Chest.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 20).addBox(-2.0F, -2.0F, 0.0F, 4, 2, 4), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.5009094953223726F, 0.0F, 0.0F));
            PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(6, 35).addBox(-1.0F, -3.0F, 0.0F, 2, 3, 2), PartPose.offsetAndRotation(0.0F, -2.0F, 0.3F, -0.27314402793711257F, 0.0F, 0.0F));
            PartDefinition Head = Neck2.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 48).addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3), PartPose.offsetAndRotation(0.0F, -2.6F, 1.0F, 0.36425021489121656F, 0.0F, 0.0F));
            PartDefinition EarTuftLeft1 = Head.addOrReplaceChild("EarTuftLeft1", CubeListBuilder.create().texOffs(18, 12).addBox(-1.0F, -2.5F, 0.0F, 1, 3, 1), PartPose.offsetAndRotation(0.9F, -1.4F, 0.8F, -0.40980330836826856F, -0.091106186954104F, 0.136659280431156F));

            PartDefinition BeakTop = Head.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, 0.0F, -1.3F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, -0.5F, -1.8F, 0.27314402793711257F, 0.0F, 0.0F));

            PartDefinition EarTuftRight1 = Head.addOrReplaceChild("EarTuftRight1", CubeListBuilder.create().texOffs(18, 12).mirror(true).addBox(0.0F, -2.5F, 0.0F, 1, 3, 1), PartPose.offsetAndRotation(-0.9F, -1.4F, 0.8F, -0.40980330836826856F, 0.091106186954104F, -0.136659280431156F));

            PartDefinition NeckBackL = Neck2.addOrReplaceChild("NeckBackL", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2), PartPose.offsetAndRotation(0.3F, -3.0F, 0.3F, 0.27314402793711257F, 0.0F, 0.0F));

            PartDefinition NeckBackR = Neck2.addOrReplaceChild("NeckBackR", CubeListBuilder.create().texOffs(0, 38).mirror(true).addBox(-1.0F, 0.0F, 0.0F, 2, 4, 2), PartPose.offsetAndRotation(-0.3F, -3.0F, 0.3F, 0.27314402793711257F, 0.0F, 0.0F));

            PartDefinition BalloonL = Neck1.addOrReplaceChild("BalloonL", CubeListBuilder.create().texOffs(25, 12).addBox(-2.0F, 0.0F, 0.0F, 4, 4, 3), PartPose.offsetAndRotation(0.2F, -3.3F, 0.2F, -0.36425021489121656F, 0.0F, 0.0F));
            PartDefinition BalloonR = BalloonL.addOrReplaceChild("BalloonR", CubeListBuilder.create().texOffs(25, 12).mirror(true).addBox(-1.99F, 0.0F, 0.0F, 4, 4, 3), PartPose.offset(-0.3F, 0.0F, 0.0F));

            PartDefinition BalloonTuft1 = BalloonL.addOrReplaceChild("BalloonTuft1", CubeListBuilder.create().texOffs(18, 19).addBox(-0.5F, 0.0F, 0.0F, 1, 3, 1), PartPose.offsetAndRotation(-0.2F, 1.1F, 0.0F, -0.136659280431156F, 0.0F, 0.0F));

            PartDefinition Leg1Left = Body.addOrReplaceChild("Leg1Left", CubeListBuilder.create().texOffs(21, 0).addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(1.5F, 1.3F, -0.3F, 0.7740535232594852F, 0.0F, 0.0F));
            PartDefinition Leg2Left = Leg1Left.addOrReplaceChild("Leg2Left", CubeListBuilder.create().texOffs(30, 1).addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, -0.5918411493512771F, 0.0F, 0.0F));
            PartDefinition Toe1L = Leg2Left.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(35, 0).addBox(-0.5F, -0.5F, -2.4F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.36425021489121656F, 0.0F, 0.0F));
            PartDefinition Toe2L = Toe1L.addOrReplaceChild("Toe2L", CubeListBuilder.create().texOffs(35, 0).addBox(-1.0F, -0.5F, -2.0F, 1, 1, 2), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.091106186954104F, -0.4553564018453205F, 0.0F));

            PartDefinition Toe3L = Toe1L.addOrReplaceChild("Toe3L", CubeListBuilder.create().texOffs(35, 0).addBox(0.0F, -0.5F, -2.0F, 1, 1, 2), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, 0.091106186954104F, 0.4553564018453205F, 0.0F));

            PartDefinition Toe4L = Toe1L.addOrReplaceChild("Toe4L", CubeListBuilder.create().texOffs(35, 4).addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, -0.22759093446006054F, 0.0F, 0.0F));

            PartDefinition Leg1Right = Body.addOrReplaceChild("Leg1Right", CubeListBuilder.create().texOffs(21, 0).mirror(true).addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(-1.5F, 1.3F, -0.3F, 0.7740535232594852F, 0.0F, 0.0F));
            PartDefinition Leg2Right = Leg1Right.addOrReplaceChild("Leg2Right", CubeListBuilder.create().texOffs(30, 1).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1), PartPose.offsetAndRotation(0.0F, 2.0F, 0.5F, -0.5918411493512771F, 0.0F, 0.0F));
            PartDefinition Toe1R = Leg2Right.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(35, 0).mirror(true).addBox(-0.5F, -0.5F, -2.4F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, 0.36425021489121656F, 0.0F, 0.0F));
            PartDefinition Toe4R = Toe1R.addOrReplaceChild("Toe4R", CubeListBuilder.create().texOffs(35, 4).mirror(true).addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, 0.0F, -0.5F, -0.22759093446006054F, 0.0F, 0.0F));

            PartDefinition Toe3R = Toe1R.addOrReplaceChild("Toe3R", CubeListBuilder.create().texOffs(35, 0).mirror(true).addBox(0.0F, -0.5F, -2.0F, 1, 1, 2), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, 0.091106186954104F, 0.4553564018453205F, 0.0F));

            PartDefinition Toe2R = Toe1R.addOrReplaceChild("Toe2R", CubeListBuilder.create().texOffs(35, 0).mirror(true).addBox(-1.0F, -0.5F, -2.0F, 1, 1, 2), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.091106186954104F, -0.4553564018453205F, 0.0F));

            PartDefinition EarTuftRight2 = EarTuftRight1.addOrReplaceChild("EarTuftRight2", CubeListBuilder.create().texOffs(14, 12).mirror(true).addBox(0.0F, -2.0F, 0.0F, 1, 2, 1), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.091106186954104F, -0.045553093477052F, -0.136659280431156F));
            PartDefinition EarTuftLeft3 = EarTuftLeft1.addOrReplaceChild("EarTuftLeft3", CubeListBuilder.create().texOffs(18, 16).addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1), PartPose.offsetAndRotation(-0.5F, 0.7F, -0.1F, -0.22759093446006054F, -0.045553093477052F, 0.045553093477052F));
            PartDefinition Wing2Left_1 = Wing1Right.addOrReplaceChild("Wing2Left_1", CubeListBuilder.create().texOffs(12, 43).mirror(true).addBox(0.0F, -2.5F, 0.0F, 2, 5, 3), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 0.7285004297824331F, 0.0F));
            PartDefinition Tail2Right = Tail1Right.addOrReplaceChild("Tail2Right", CubeListBuilder.create().texOffs(18, 29).mirror(true).addBox(-2.0F, 0.0F, 0.0F, 2, 1, 5), PartPose.offsetAndRotation(-0.3F, 0.0F, -0.2F, -0.045553093477052F, 0.0F, 0.0F));
            PartDefinition Tail3Right = Tail2Right.addOrReplaceChild("Tail3Right", CubeListBuilder.create().texOffs(18, 29).mirror(true).addBox(-2.0F, 0.0F, 0.0F, 2, 1, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.045553093477052F, -0.045553093477052F, 0.0F));
            PartDefinition Tail4Right = Tail3Right.addOrReplaceChild("Tail4Right", CubeListBuilder.create().texOffs(18, 29).mirror(true).addBox(-2.0F, 0.0F, 0.0F, 2, 1, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.045553093477052F, -0.045553093477052F, 0.0F));
            PartDefinition Tail2Left = Tail1Left.addOrReplaceChild("Tail2Left", CubeListBuilder.create().texOffs(18, 29).addBox(0.0F, 0.0F, 0.0F, 2, 1, 5), PartPose.offsetAndRotation(0.3F, 0.0F, -0.2F, -0.045553093477052F, 0.0F, 0.0F));
            PartDefinition Wing2Left = Wing1Left.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(12, 43).addBox(-2.0F, -2.5F, 0.0F, 2, 5, 3), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, -0.7285004297824331F, 0.0F));
            PartDefinition Tail3Left = Tail2Left.addOrReplaceChild("Tail3Left", CubeListBuilder.create().texOffs(18, 29).addBox(0.0F, 0.0F, 0.0F, 2, 1, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.045553093477052F, 0.045553093477052F, 0.0F));
            PartDefinition Tail4Left = Tail3Left.addOrReplaceChild("Tail4Left", CubeListBuilder.create().texOffs(18, 29).addBox(0.0F, 0.0F, 0.0F, 2, 1, 5), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.045553093477052F, 0.045553093477052F, 0.0F));
            PartDefinition BalloonTuft2 = BalloonTuft1.addOrReplaceChild("BalloonTuft2", CubeListBuilder.create().texOffs(18, 19).addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 1.1383037381507017F, 0.0F, 0.0F));
            PartDefinition BalloonTuft3 = BalloonTuft2.addOrReplaceChild("BalloonTuft3", CubeListBuilder.create().texOffs(17, 23).addBox(-0.5F, 0.0F, 0.0F, 1, 3, 2), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.31869712141416456F, 0.0F, 0.0F));
            PartDefinition BalloonTuft3_1 = BalloonTuft3.addOrReplaceChild("BalloonTuft3_1", CubeListBuilder.create().texOffs(17, 23).addBox(-0.5F, 0.0F, 0.0F, 1, 2, 2), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.4553564018453205F, 0.0F, 0.0F));
            PartDefinition EarTuftRight3 = EarTuftRight1.addOrReplaceChild("EarTuftRight3", CubeListBuilder.create().texOffs(18, 16).mirror(true).addBox(-0.5F, -2.0F, 0.0F, 1, 2, 1), PartPose.offsetAndRotation(0.5F, 0.7F, -0.1F, -0.22759093446006054F, 0.045553093477052F, -0.045553093477052F));
            PartDefinition EarTuftLeft2 = EarTuftLeft1.addOrReplaceChild("EarTuftLeft2", CubeListBuilder.create().texOffs(14, 12).addBox(-1.0F, -2.0F, 0.0F, 1, 2, 1), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.091106186954104F, 0.045553093477052F, 0.136659280431156F));
            PartDefinition BeakBottom = BeakTop.addOrReplaceChild("BeakBottom", CubeListBuilder.create().texOffs(6, 44).addBox(-0.5F, -1.0F, -1.3F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, 1.6F, 0.0F, -0.36425021489121656F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 64, 64);
        }

        @Override
        public void setupAnim(GreaterPrairieChickenEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            this.Neck2.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.yRot = netHeadYaw / (180F / (float) Math.PI) * 0.25F;
            this.Head.xRot = (headPitch / (180F / (float) Math.PI)) + 0.364F;
            this.Head.zRot = headPitch / (180F / (float) Math.PI) * 0.05F;
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.0f;
            float degree = 1.0f;
            this.Neck1.xRot = Mth.cos(3F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * 0.2F) * 0.5F + -0.50F;
            this.Neck2.xRot = Mth.cos(4F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + -0.27F;
            this.Head.xRot = Mth.cos(4F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.36F;
            this.TailBase.xRot = Mth.cos(4F + limbSwing * speed * 0.07F) * limbSwingAmount * (degree * -0.2F) * 0.5F - 0.27F;
        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.6f;
            float degree = 0.7f;

            if (isSwimming) {
                limbSwing = (float) entity.tickCount;
                limbSwingAmount = 0.3F;
            }

            if (entity.isSprinting() && !isSwimming) {
                // todo: sprint anim?

            } else {
                this.Body.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.364F;
                this.Body.yRot = Mth.cos(3F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 0.25F) * 0.5F;
                this.Body.y = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.9F) * 0.5F + 18.9F;
                this.Chest.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.2F) * 0.5F + +0.86F;
                this.Neck1.xRot = Mth.cos(4F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.2F) * 0.7F + -0.50F;
                this.Neck2.xRot = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.4F) * 0.5F + -0.27F;
                this.Head.xRot = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * 0.5F) * 0.5F + 0.36F;
                this.Head.z = Mth.cos(2F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.6F) * 0.5F + 1.0F;

                this.Leg1Left.xRot = Mth.cos(3F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2.8F) * 0.5F + 0.77F;
                this.Leg2Left.xRot = Mth.cos(1F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2.3F) * 0.5F - 0.59F;
                this.Toe1L.xRot = Mth.cos(6.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2.3F) * 0.5F + 0.36F;
                this.Leg1Right.xRot = Mth.cos(3F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2.8F) * 0.5F + 0.77F;
                this.Leg2Right.xRot = Mth.cos(1F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * -2.3F) * 0.5F - 0.59F;
                this.Toe1R.xRot = Mth.cos(6.5F + limbSwing * speed * 0.3F) * limbSwingAmount * (degree * 2.3F) * 0.5F + 0.36F;

                this.TailBase.xRot = Mth.cos(3F + limbSwing * speed * 0.6F) * limbSwingAmount * (degree * -0.1F) * 0.5F - 0.27F;
            }
        }
    }

    public static class Child extends GreaterPrairieChickenModel {
        public ModelPart HeadBase;
        public ModelPart NeckLower;
        public ModelPart HeadTop;

        public Child(ModelPart root) {
            this.Body = root.getChild("Body");
            this.TailBase = this.Body.getChild("TailBase");

            this.Neck1 = this.Body.getChild("Neck1");
            this.NeckLower = this.Neck1.getChild("NeckLower");

            this.HeadBase = this.Neck1.getChild("HeadBase");
            this.HeadTop = this.HeadBase.getChild("HeadTop");

            this.BeakTop = this.HeadBase.getChild("BeakTop");
            this.BeakBottom = this.BeakTop.getChild("BeakBottom");

            this.Wing1Left = this.Body.getChild("Wing1Left");
            this.Wing2Left = this.Wing1Left.getChild("Wing2Left");

            this.Leg1Right = this.Body.getChild("Leg1Right");
            this.Leg2Right = this.Leg1Right.getChild("Leg2Right");
            this.Toe1R = this.Leg2Right.getChild("Toe1R");

            this.Wing1Right = this.Body.getChild("Wing1Right");
            this.Wing2Left_1 = this.Wing1Right.getChild("Wing2Left_1");

            this.Leg1Left = this.Body.getChild("Leg1Left");
            this.Leg2Left = this.Leg1Left.getChild("Leg2Left");
            this.Toe1L = this.Leg2Left.getChild("Toe1L");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshDefinition = new MeshDefinition();
            PartDefinition partDefinition = meshDefinition.getRoot();

            PartDefinition Body = partDefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4), PartPose.offsetAndRotation(0.0F, 20.1F, 0.0F, -0.136659280431156F, 0.0F, 0.0F));
            PartDefinition TailBase = Body.addOrReplaceChild("TailBase", CubeListBuilder.create().texOffs(0, 9).addBox(-1.5F, 0.0F, 0.0F, 3, 3, 2), PartPose.offsetAndRotation(0.0F, -1.7F, 2.0F, -0.5918411493512771F, 0.0F, 0.0F));

            PartDefinition Neck1 = Body.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -2.0F, -1.0F, 2, 4, 2), PartPose.offsetAndRotation(0.0F, -0.7F, -1.1F, 0.8196066167365371F, 0.0F, 0.0F));
            PartDefinition NeckLower = Neck1.addOrReplaceChild("NeckLower", CubeListBuilder.create().texOffs(13, 0).addBox(-1.0F, 0.0F, 0.0F, 2, 3, 1), PartPose.offsetAndRotation(0.0F, -1.9F, -1.6F, -0.22759093446006054F, 0.0F, 0.0F));

            PartDefinition HeadBase = Neck1.addOrReplaceChild("HeadBase", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, -0.5F, -2.5F, 3, 1, 3), PartPose.offsetAndRotation(0.0F, -0.6F, -0.1F, -0.6373942428283291F, 0.0F, 0.0F));

            PartDefinition Wing1Left = Body.addOrReplaceChild("Wing1Left", CubeListBuilder.create().texOffs(9, 18).addBox(-1.0F, -1.5F, 0.0F, 1, 3, 2), PartPose.offsetAndRotation(2.0F, 0.0F, -1.6F, 0.0F, 0.22759093446006054F, 0.0F));

            PartDefinition Leg1Right = Body.addOrReplaceChild("Leg1Right", CubeListBuilder.create().texOffs(10, 8).addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(-1.1F, 0.3F, 0.0F, 0.27314402793711257F, 0.0F, 0.0F));

            PartDefinition Wing1Right = Body.addOrReplaceChild("Wing1Right", CubeListBuilder.create().texOffs(9, 18).mirror(true).addBox(0.0F, -1.5F, 0.0F, 1, 3, 2), PartPose.offsetAndRotation(-2.0F, 0.0F, -1.6F, 0.0F, -0.22759093446006054F, 0.0F));

            PartDefinition Leg1Left = Body.addOrReplaceChild("Leg1Left", CubeListBuilder.create().texOffs(10, 8).addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2), PartPose.offsetAndRotation(1.1F, 0.3F, 0.0F, 0.27314402793711257F, 0.0F, 0.0F));

            PartDefinition Leg2Left = Leg1Left.addOrReplaceChild("Leg2Left", CubeListBuilder.create().texOffs(10, 12).addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1), PartPose.offsetAndRotation(0.0F, 1.5F, 0.7F, -0.27314402793711257F, 0.0F, 0.0F));
            PartDefinition Wing2Left = Wing1Left.addOrReplaceChild("Wing2Left", CubeListBuilder.create().texOffs(12, 23).addBox(-1.0F, -1.5F, 0.0F, 1, 3, 2), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -0.27314402793711257F, 0.0F));
            PartDefinition HeadTop = HeadBase.addOrReplaceChild("HeadTop", CubeListBuilder.create().texOffs(0, 24).addBox(-1.5F, 0.0F, -3.0F, 3, 2, 3), PartPose.offset(0.0F, -2.5F, 0.4F));
            PartDefinition BeakTop = HeadBase.addOrReplaceChild("BeakTop", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, -1.2F, -2.5F, 0.27314402793711257F, 0.0F, 0.0F));
            PartDefinition Wing2Left_1 = Wing1Right.addOrReplaceChild("Wing2Left_1", CubeListBuilder.create().texOffs(12, 23).mirror(true).addBox(0.0F, -1.5F, 0.0F, 1, 3, 2), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.27314402793711257F, 0.0F));
            PartDefinition BeakBottom = BeakTop.addOrReplaceChild("BeakBottom", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1), PartPose.offsetAndRotation(0.0F, 0.8F, 0.5F, -0.6373942428283291F, 0.0F, 0.0F));
            PartDefinition Leg2Right = Leg1Right.addOrReplaceChild("Leg2Right", CubeListBuilder.create().texOffs(10, 12).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 2, 1), PartPose.offsetAndRotation(0.0F, 1.5F, 0.7F, -0.27314402793711257F, 0.0F, 0.0F));
            PartDefinition Toe1L = Leg2Left.addOrReplaceChild("Toe1L", CubeListBuilder.create().texOffs(8, 15).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, 1.4F, -0.6F, 0.136659280431156F, 0.0F, 0.0F));
            PartDefinition Toe1R = Leg2Right.addOrReplaceChild("Toe1R", CubeListBuilder.create().texOffs(8, 15).mirror(true).addBox(-0.5F, 0.0F, -1.0F, 1, 1, 2), PartPose.offsetAndRotation(0.0F, 1.4F, -0.6F, 0.136659280431156F, 0.0F, 0.0F));

            return LayerDefinition.create(meshDefinition, 32, 32);
        }

        @Override
        public void setupAnim(GreaterPrairieChickenEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        }

        @Override
        public void playIdleAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.6f;
            float degree = 0.7f;
            this.Neck1.xRot = Mth.cos(2F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -0.1F) * 0.5F + 0.819F;
            this.HeadBase.xRot = Mth.cos(1F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.1F) * 0.5F - 0.63F;

        }

        @Override
        public void playMovementAnimation(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            float speed = 1.6f;
            float degree = 0.7f;
            this.Body.yRot = Mth.cos(3F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 0.25F) * 0.5F;
            this.Body.y = Mth.cos(3F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.3F) * 0.5F + 20.1F;
            this.Neck1.xRot = Mth.cos(3F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -0.2F) * 0.5F + 0.819F;
            this.HeadBase.xRot = Mth.cos(2F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * 0.2F) * 0.5F - 0.63F;
            this.HeadBase.z = Mth.cos(1F + limbSwing * speed * 0.4F) * limbSwingAmount * (degree * -1F) * 0.5F - 0.1F;

            this.Leg1Left.xRot = Mth.cos(1F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * -2.8F) * 0.5F + 0.273F;
            this.Leg1Right.xRot = Mth.cos(1F + limbSwing * speed * 0.2F) * limbSwingAmount * (degree * 2.8F) * 0.5F + 0.273F;
        }
    }
}
