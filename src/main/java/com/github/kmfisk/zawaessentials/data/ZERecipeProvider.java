package com.github.kmfisk.zawaessentials.data;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.block.ZEBlocks;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonObject;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.world.block.ZawaBlocks;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ZERecipeProvider extends RecipeProvider {
    public ZERecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCES.get(WoodType.ACACIA.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.ACACIA_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCES.get(WoodType.BAMBOO.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.BAMBOO_BLOCK)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCES.get(WoodType.BIRCH.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.BIRCH_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCES.get(WoodType.CHERRY.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.CHERRY_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCES.get(WoodType.DARK_OAK.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.DARK_OAK_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCES.get(WoodType.JUNGLE.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.JUNGLE_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCES.get(WoodType.MANGROVE.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.MANGROVE_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCES.get(WoodType.OAK.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.OAK_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCES.get(WoodType.SPRUCE.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.SPRUCE_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCES.get(WoodType.CRIMSON.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.CRIMSON_STEM)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCES.get(WoodType.WARPED.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.WARPED_STEM)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());

        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCES.get(WoodType.ACACIA.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_ACACIA_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCES.get(WoodType.BAMBOO.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_BAMBOO_BLOCK)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCES.get(WoodType.BIRCH.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_BIRCH_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCES.get(WoodType.CHERRY.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_CHERRY_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCES.get(WoodType.DARK_OAK.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_DARK_OAK_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCES.get(WoodType.JUNGLE.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_JUNGLE_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCES.get(WoodType.MANGROVE.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_MANGROVE_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCES.get(WoodType.OAK.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_OAK_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCES.get(WoodType.SPRUCE.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_SPRUCE_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCES.get(WoodType.CRIMSON.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_CRIMSON_STEM)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCES.get(WoodType.WARPED.name()).get(), 3, ImmutableList.of("LRL", "LRL"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_WARPED_STEM)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());

        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCE_GATES.get(WoodType.ACACIA.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.ACACIA_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCE_GATES.get(WoodType.BAMBOO.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.BAMBOO_BLOCK)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCE_GATES.get(WoodType.BIRCH.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.BIRCH_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCE_GATES.get(WoodType.CHERRY.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.CHERRY_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCE_GATES.get(WoodType.DARK_OAK.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.DARK_OAK_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCE_GATES.get(WoodType.JUNGLE.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.JUNGLE_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCE_GATES.get(WoodType.MANGROVE.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.MANGROVE_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCE_GATES.get(WoodType.OAK.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.OAK_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCE_GATES.get(WoodType.SPRUCE.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.SPRUCE_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCE_GATES.get(WoodType.CRIMSON.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.CRIMSON_STEM)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.CABLE_FENCE_GATES.get(WoodType.WARPED.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.WARPED_STEM)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());

        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCE_GATES.get(WoodType.ACACIA.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_ACACIA_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCE_GATES.get(WoodType.BAMBOO.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_BAMBOO_BLOCK)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCE_GATES.get(WoodType.BIRCH.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_BIRCH_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCE_GATES.get(WoodType.CHERRY.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_CHERRY_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCE_GATES.get(WoodType.DARK_OAK.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_DARK_OAK_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCE_GATES.get(WoodType.JUNGLE.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_JUNGLE_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCE_GATES.get(WoodType.MANGROVE.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_MANGROVE_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCE_GATES.get(WoodType.OAK.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_OAK_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCE_GATES.get(WoodType.SPRUCE.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_SPRUCE_LOG)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCE_GATES.get(WoodType.CRIMSON.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_CRIMSON_STEM)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());
        shapedRecipeResult(consumer, ZEBlocks.STRIPPED_CABLE_FENCE_GATES.get(WoodType.WARPED.name()).get(), 1, ImmutableList.of("RLR", "RLR"), ImmutableMap.<Character, Ingredient>builder().put('L', Ingredient.of(Items.STRIPPED_WARPED_STEM)).put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());

        shapedRecipeResult(consumer, ZEBlocks.HANGING_PERCHES.get(WoodType.ACACIA.name()).get(), 1, ImmutableList.of("R R", "LSL", "D D"), ImmutableMap.<Character, Ingredient>builder().put('R', Ingredient.of(ZawaBlocks.ROPE.get())).put('L', Ingredient.of(Items.ACACIA_LOG)).put('S', Ingredient.of(Items.STICK)).put('D', Ingredient.of(Tags.Items.DYES_ORANGE)).build());
        shapedRecipeResult(consumer, ZEBlocks.HANGING_PERCHES.get(WoodType.BAMBOO.name()).get(), 1, ImmutableList.of("R R", "LSL", "D D"), ImmutableMap.<Character, Ingredient>builder().put('R', Ingredient.of(ZawaBlocks.ROPE.get())).put('L', Ingredient.of(Items.BAMBOO_BLOCK)).put('S', Ingredient.of(Items.STICK)).put('D', Ingredient.of(Tags.Items.DYES_YELLOW)).build());
        shapedRecipeResult(consumer, ZEBlocks.HANGING_PERCHES.get(WoodType.BIRCH.name()).get(), 1, ImmutableList.of("R R", "LSL", "D D"), ImmutableMap.<Character, Ingredient>builder().put('R', Ingredient.of(ZawaBlocks.ROPE.get())).put('L', Ingredient.of(Items.BIRCH_LOG)).put('S', Ingredient.of(Items.STICK)).put('D', Ingredient.of(Tags.Items.DYES_LIME)).build());
        shapedRecipeResult(consumer, ZEBlocks.HANGING_PERCHES.get(WoodType.CHERRY.name()).get(), 1, ImmutableList.of("R R", "LSL", "D D"), ImmutableMap.<Character, Ingredient>builder().put('R', Ingredient.of(ZawaBlocks.ROPE.get())).put('L', Ingredient.of(Items.CHERRY_LOG)).put('S', Ingredient.of(Items.STICK)).put('D', Ingredient.of(Tags.Items.DYES_PINK)).build());
        shapedRecipeResult(consumer, ZEBlocks.HANGING_PERCHES.get(WoodType.DARK_OAK.name()).get(), 1, ImmutableList.of("R R", "LSL", "D D"), ImmutableMap.<Character, Ingredient>builder().put('R', Ingredient.of(ZawaBlocks.ROPE.get())).put('L', Ingredient.of(Items.DARK_OAK_LOG)).put('S', Ingredient.of(Items.STICK)).put('D', Ingredient.of(Tags.Items.DYES_BLUE)).build());
        shapedRecipeResult(consumer, ZEBlocks.HANGING_PERCHES.get(WoodType.JUNGLE.name()).get(), 1, ImmutableList.of("R R", "LSL", "D D"), ImmutableMap.<Character, Ingredient>builder().put('R', Ingredient.of(ZawaBlocks.ROPE.get())).put('L', Ingredient.of(Items.JUNGLE_LOG)).put('S', Ingredient.of(Items.STICK)).put('D', Ingredient.of(Tags.Items.DYES_CYAN)).build());
        shapedRecipeResult(consumer, ZEBlocks.HANGING_PERCHES.get(WoodType.MANGROVE.name()).get(), 1, ImmutableList.of("R R", "LSL", "D D"), ImmutableMap.<Character, Ingredient>builder().put('R', Ingredient.of(ZawaBlocks.ROPE.get())).put('L', Ingredient.of(Items.MANGROVE_LOG)).put('S', Ingredient.of(Items.STICK)).put('D', Ingredient.of(Tags.Items.DYES_RED)).build());
        shapedRecipeResult(consumer, ZEBlocks.HANGING_PERCHES.get(WoodType.OAK.name()).get(), 1, ImmutableList.of("R R", "LSL", "D D"), ImmutableMap.<Character, Ingredient>builder().put('R', Ingredient.of(ZawaBlocks.ROPE.get())).put('L', Ingredient.of(Items.OAK_LOG)).put('S', Ingredient.of(Items.STICK)).put('D', Ingredient.of(Tags.Items.DYES_LIGHT_BLUE)).build());
        shapedRecipeResult(consumer, ZEBlocks.HANGING_PERCHES.get(WoodType.SPRUCE.name()).get(), 1, ImmutableList.of("R R", "LSL", "D D"), ImmutableMap.<Character, Ingredient>builder().put('R', Ingredient.of(ZawaBlocks.ROPE.get())).put('L', Ingredient.of(Items.SPRUCE_LOG)).put('S', Ingredient.of(Items.STICK)).put('D', Ingredient.of(Tags.Items.DYES_GREEN)).build());
        shapedRecipeResult(consumer, ZEBlocks.HANGING_PERCHES.get(WoodType.CRIMSON.name()).get(), 1, ImmutableList.of("R R", "LSL", "D D"), ImmutableMap.<Character, Ingredient>builder().put('R', Ingredient.of(ZawaBlocks.ROPE.get())).put('L', Ingredient.of(Items.CRIMSON_STEM)).put('S', Ingredient.of(Items.STICK)).put('D', Ingredient.of(Tags.Items.DYES_PURPLE)).build());
        shapedRecipeResult(consumer, ZEBlocks.HANGING_PERCHES.get(WoodType.WARPED.name()).get(), 1, ImmutableList.of("R R", "LSL", "D D"), ImmutableMap.<Character, Ingredient>builder().put('R', Ingredient.of(ZawaBlocks.ROPE.get())).put('L', Ingredient.of(Items.WARPED_STEM)).put('S', Ingredient.of(Items.STICK)).put('D', Ingredient.of(Tags.Items.DYES_MAGENTA)).build());

        shapedRecipeResult(consumer, ZEBlocks.BELL_TOY.get(), 1, ImmutableList.of("YRB", "BRL", " N "), ImmutableMap.<Character, Ingredient>builder()
                .put('Y', Ingredient.of(Tags.Items.DYES_YELLOW))
                .put('R', Ingredient.of(ZawaBlocks.ROPE.get()))
                .put('B', Ingredient.of(Items.BAMBOO))
                .put('L', Ingredient.of(Tags.Items.DYES_LIGHT_BLUE))
                .put('N', Ingredient.of(Items.GOLD_NUGGET)).build());

        shapedRecipeResult(consumer, ZEBlocks.CUP_FEEDER.get(), 1, ImmutableList.of("DBN", "GBR", "LB "), ImmutableMap.<Character, Ingredient>builder()
                .put('D', Ingredient.of(Tags.Items.DYES_RED))
                .put('B', Ingredient.of(Items.BOWL))
                .put('N', Ingredient.of(Items.IRON_NUGGET))
                .put('G', Ingredient.of(Tags.Items.DYES_LIME))
                .put('R', Ingredient.of(ZawaBlocks.ROPE.get()))
                .put('L', Ingredient.of(Tags.Items.DYES_LIGHT_BLUE)).build());

        shapedRecipeResult(consumer, ZEBlocks.FLOODLIGHT.get(), 8, ImmutableList.of("GGG", "PTG", " IN"), ImmutableMap.<Character, Ingredient>builder()
                .put('G', Ingredient.of(Items.GRAY_CONCRETE))
                .put('P', Ingredient.of(Items.GLASS_PANE))
                .put('T', Ingredient.of(Items.TORCH))
                .put('I', Ingredient.of(Items.IRON_INGOT))
                .put('N', Ingredient.of(Items.IRON_NUGGET)).build());

        shapedRecipeResult(consumer, ZEBlocks.LARGE_BIRD_TOY.get(), 2, ImmutableList.of("PLN", "LPR", "PL "), ImmutableMap.<Character, Ingredient>builder()
                .put('P', Ingredient.of(ItemTags.WOODEN_SLABS))
                .put('L', Ingredient.of(Items.LEATHER))
                .put('N', Ingredient.of(Items.IRON_NUGGET))
                .put('R', Ingredient.of(ZawaBlocks.ROPE.get())).build());

        shapedRecipeResult(consumer, ZEBlocks.SECURITY_CAMERA.get(), 8, ImmutableList.of("GGG", "PRG", " IN"), ImmutableMap.<Character, Ingredient>builder()
                .put('G', Ingredient.of(Items.GRAY_CONCRETE))
                .put('P', Ingredient.of(Items.BLACK_STAINED_GLASS_PANE))
                .put('R', Ingredient.of(Items.REDSTONE_BLOCK))
                .put('I', Ingredient.of(Items.IRON_INGOT))
                .put('N', Ingredient.of(Items.IRON_NUGGET)).build());

    }

    public static void shapedRecipeResult(Consumer<FinishedRecipe> consumer, ItemLike iItemProvider, int outputNum, List<String> recipe, Map<Character, Ingredient> recipeMapKey) {
        namedShapedRecipeResult(consumer, ForgeRegistries.ITEMS.getKey(iItemProvider.asItem()).getPath(), iItemProvider, outputNum, recipe, recipeMapKey);
    }

    public static void namedShapedRecipeResult(Consumer<FinishedRecipe> consumer, String id, ItemLike iItemProvider, int outputNum, List<String> recipe, Map<Character, Ingredient> recipeMapKey) {
        consumer.accept(new ShapedRecipeBuilder.Result(
                new ResourceLocation(ZawaEssentials.MOD_ID, id),
                iItemProvider.asItem(),
                outputNum,
                ZawaEssentials.MOD_ID,
                CraftingBookCategory.MISC,
                recipe,
                recipeMapKey,
                null,
                null,
                false
        ) {
            @Override
            public JsonObject serializeAdvancement() {
                return null;
            }
        });
    }
}
