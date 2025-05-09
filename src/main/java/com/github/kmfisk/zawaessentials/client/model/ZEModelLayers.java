package com.github.kmfisk.zawaessentials.client.model;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.client.render.entity.AustralianRingneckParrotRenderer;
import com.google.common.collect.Sets;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Tuple;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

@OnlyIn(Dist.CLIENT)
public class ZEModelLayers {
    public static final Set<ModelLayerLocation> ALL_MODELS = Sets.newHashSet();
    public static final List<Tuple<ModelLayerLocation, Supplier<LayerDefinition>>> MODEL_LAYERS_LIST = new ArrayList<>();
    public static final ModelLayerLocation AUSTRALIAN_RINGNECK_PARROT_ADULT = register("australian_ringneck_parrot", "adult", ParrotBaseModel.Adult::createBodyLayer);
    public static final ModelLayerLocation AUSTRALIAN_RINGNECK_PARROT_FLYING = register("australian_ringneck_parrot", "flying", ParrotBaseModel.Flying::createBodyLayer);
    public static final ModelLayerLocation AUSTRALIAN_RINGNECK_PARROT_CHILD = register("australian_ringneck_parrot", "child", ParrotBaseModel.Child::createBodyLayer);
    public static final ModelLayerLocation BUDGERIGAR_ADULT = register("budgerigar", "adult", BudgerigarModel.Adult::createBodyLayer);
    public static final ModelLayerLocation BUDGERIGAR_FLYING = register("budgerigar", "flying", BudgerigarModel.Flying::createBodyLayer);
    public static final ModelLayerLocation CAIQUE_ADULT = register("caique", "adult", ParrotBaseModel.Adult::createBodyLayer);
    public static final ModelLayerLocation CAIQUE_FLYING = register("caique", "flying", ParrotBaseModel.Flying::createBodyLayer);
    public static final ModelLayerLocation CAIQUE_CHILD = register("caique", "child", ParrotBaseModel.Child::createBodyLayer);
    public static final ModelLayerLocation CHINCHILLA_ADULT = register("chinchilla", "adult", ChinchillaModel.Adult::createBodyLayer);
    public static final ModelLayerLocation CHINCHILLA_CHILD = register("chinchilla", "child", ChinchillaModel.Child::createBodyLayer);
    public static final ModelLayerLocation COCKATIEL_ADULT = register("cockatiel", "adult", CockatielModel.Adult::createBodyLayer);
    public static final ModelLayerLocation COCKATIEL_FLYING = register("cockatiel", "flying", CockatielModel.Flying::createBodyLayer);
    public static final ModelLayerLocation COCKATIEL_CHILD = register("cockatiel", "child", CockatielModel.Child::createBodyLayer);
    public static final ModelLayerLocation CONGO_GRAY_PARROT_ADULT = register("congo_gray_parrot", "adult", ParrotBaseModel.Adult::createBodyLayer);
    public static final ModelLayerLocation CONGO_GRAY_PARROT_FLYING = register("congo_gray_parrot", "flying", ParrotBaseModel.Flying::createBodyLayer);
    public static final ModelLayerLocation CONGO_GRAY_PARROT_CHILD = register("congo_gray_parrot", "child", ParrotBaseModel.Child::createBodyLayer);
    public static final ModelLayerLocation CONURE_ADULT = register("conure", "adult", ParrotBaseModel.Adult::createBodyLayer);
    public static final ModelLayerLocation CONURE_FLYING = register("conure", "flying", ParrotBaseModel.Flying::createBodyLayer);
    public static final ModelLayerLocation CONURE_CHILD = register("conure", "child", ParrotBaseModel.Child::createBodyLayer);
    public static final ModelLayerLocation ECLECTUS_ADULT = register("eclectus", "adult", ParrotBaseModel.Adult::createBodyLayer);
    public static final ModelLayerLocation ECLECTUS_FLYING = register("eclectus", "flying", ParrotBaseModel.Flying::createBodyLayer);
    public static final ModelLayerLocation ECLECTUS_CHILD = register("eclectus", "child", ParrotBaseModel.Child::createBodyLayer);
    public static final ModelLayerLocation GREATER_PRAIRIE_CHICKEN_ADULT = register("greater_prairie_chicken", "adult", GreaterPrairieChickenModel.Adult::createBodyLayer);
    public static final ModelLayerLocation GREATER_PRAIRIE_CHICKEN_CHILD = register("greater_prairie_chicken", "child", GreaterPrairieChickenModel.Child::createBodyLayer);
    public static final ModelLayerLocation GREEN_CHEEK_CONURE_ADULT = register("green_cheek_conure", "adult", ParrotBaseModel.Adult::createBodyLayer);
    public static final ModelLayerLocation GREEN_CHEEK_CONURE_FLYING = register("green_cheek_conure", "flying", ParrotBaseModel.Flying::createBodyLayer);
    public static final ModelLayerLocation GREEN_CHEEK_CONURE_CHILD = register("green_cheek_conure", "child", ParrotBaseModel.Child::createBodyLayer);
    public static final ModelLayerLocation HAWK_HEADED_PARROT_ADULT = register("hawk_headed_parrot", "adult", HawkHeadedParrotModel.Adult::createBodyLayer);
    public static final ModelLayerLocation HAWK_HEADED_PARROT_FLYING = register("hawk_headed_parrot", "flying", HawkHeadedParrotModel.Flying::createBodyLayer);
    public static final ModelLayerLocation HAWK_HEADED_PARROT_CHILD = register("hawk_headed_parrot", "child", HawkHeadedParrotModel.Child::createBodyLayer);
    public static final ModelLayerLocation KAKARIKI_ADULT = register("kakariki", "adult", ParrotBaseModel.Adult::createBodyLayer);
    public static final ModelLayerLocation KAKARIKI_FLYING = register("kakariki", "flying", ParrotBaseModel.Flying::createBodyLayer);
    public static final ModelLayerLocation KAKARIKI_CHILD = register("kakariki", "child", ParrotBaseModel.Child::createBodyLayer);
    public static final ModelLayerLocation KEA_ADULT = register("kea", "adult", KeaModel.Adult::createBodyLayer);
    public static final ModelLayerLocation KEA_FLYING = register("kea", "flying", KeaModel.Flying::createBodyLayer);
    public static final ModelLayerLocation KEA_CHILD = register("kea", "child", KeaModel.Child::createBodyLayer);
    public static final ModelLayerLocation MANED_WOLF_ADULT = register("maned_wolf", "adult", ManedWolfModel.Adult::createBodyLayer);
    public static final ModelLayerLocation MANED_WOLF_CHILD = register("maned_wolf", "child", ManedWolfModel.Child::createBodyLayer);
    public static final ModelLayerLocation MOHO_ADULT = register("moho", "adult", MohoModel.Adult::createBodyLayer);
    public static final ModelLayerLocation MOHO_FLYING = register("moho", "flying", MohoModel.Flying::createBodyLayer);
    public static final ModelLayerLocation MOHO_CHILD = register("moho", "child", MohoModel.Child::createBodyLayer);
    public static final ModelLayerLocation POICEPHALUS_PARROT_ADULT = register("poicephalus_parrot", "adult", ParrotBaseModel.Adult::createBodyLayer);
    public static final ModelLayerLocation POICEPHALUS_PARROT_FLYING = register("poicephalus_parrot", "flying", ParrotBaseModel.Flying::createBodyLayer);
    public static final ModelLayerLocation POICEPHALUS_PARROT_CHILD = register("poicephalus_parrot", "child", ParrotBaseModel.Child::createBodyLayer);
    public static final ModelLayerLocation QUAKER_PARAKEET_ADULT = register("quaker_parakeet", "adult", ParrotBaseModel.Adult::createBodyLayer);
    public static final ModelLayerLocation QUAKER_PARAKEET_FLYING = register("quaker_parakeet", "flying", ParrotBaseModel.Flying::createBodyLayer);
    public static final ModelLayerLocation QUAKER_PARAKEET_CHILD = register("quaker_parakeet", "child", ParrotBaseModel.Child::createBodyLayer);
    public static final ModelLayerLocation RINGNECK_PARROT_ADULT = register("ringneck_parrot", "adult", ParrotBaseModel.Adult::createBodyLayer);
    public static final ModelLayerLocation RINGNECK_PARROT_FLYING = register("ringneck_parrot", "flying", ParrotBaseModel.Flying::createBodyLayer);
    public static final ModelLayerLocation RINGNECK_PARROT_CHILD = register("ringneck_parrot", "child", ParrotBaseModel.Child::createBodyLayer);
    public static final ModelLayerLocation ROSELLA_ADULT = register("rosella", "adult", ParrotBaseModel.Adult::createBodyLayer);
    public static final ModelLayerLocation ROSELLA_FLYING = register("rosella", "flying", ParrotBaseModel.Flying::createBodyLayer);
    public static final ModelLayerLocation ROSELLA_CHILD = register("rosella", "child", ParrotBaseModel.Child::createBodyLayer);

    public ZEModelLayers() {
    }

    private static ModelLayerLocation register(String path, Supplier<LayerDefinition> layerDefinition) {
        return register(path, "main", layerDefinition);
    }

    private static ModelLayerLocation register(String path, String model, Supplier<LayerDefinition> layerDefinition) {
        ModelLayerLocation modellayerlocation = createLocation(path, model);
        MODEL_LAYERS_LIST.add(new Tuple<>(modellayerlocation, layerDefinition));
        if (!ALL_MODELS.add(modellayerlocation))
            throw new IllegalStateException("Duplicate registration for " + modellayerlocation);
        else return modellayerlocation;
    }

    private static ModelLayerLocation createLocation(String path, String model) {
        return new ModelLayerLocation(new ResourceLocation(ZawaEssentials.MOD_ID, path), model);
    }
}
