package com.github.kmfisk.zawaessentials.block;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.item.ZEItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.util.Util;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.block.PlushBlock;
import org.zawamod.zawa.world.block.ZawaEnrichmentBlock;
import org.zawamod.zawa.world.block.ZawaFenceBlock;
import org.zawamod.zawa.world.block.ZawaFenceGateBlock;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static com.github.kmfisk.zawaessentials.ZawaEssentials.PLUSHIES_LIST;

public class ZEBlocks {
    public static final DeferredRegister<Block> REGISTRAR = DeferredRegister.create(ForgeRegistries.BLOCKS, ZawaEssentials.MOD_ID);
    public static final String[] WOOD_TYPES_LIST = new String[]{"acacia", "birch", "dark_oak", "jungle", "oak", "spruce", "crimson", "warped"};

    public static final RegistryObject<Block> CUP_FEEDER = registerWithItem("cup_feeder", () -> new ZawaEnrichmentBlock(Block.box(2.0, 1.0, 2.0, 14.0, 16.0, 14.0), AbstractBlock.Properties.of(Material.WOOD).noOcclusion()));
    public static final RegistryObject<Block> BELL_TOY = registerWithItem("bell_toy", () -> new ZawaEnrichmentBlock(Block.box(2.0, 1.0, 2.0, 14.0, 16.0, 14.0), AbstractBlock.Properties.of(Material.WOOD).noOcclusion()));
    public static final Map<String, RegistryObject<Block>> HANGING_PERCHES = Util.make(new HashMap<>(), map -> {
        for (String woodType : WOOD_TYPES_LIST)
            map.put(woodType, registerWithItem(woodType + "_hanging_perch", () -> new HangingPerchBlock(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion())));
    });
    public static final RegistryObject<Block> LARGE_BIRD_TOY = registerWithItem("large_bird_toy", () -> new ZawaEnrichmentBlock(Block.box(2.0, 1.0, 2.0, 14.0, 16.0, 14.0), AbstractBlock.Properties.of(Material.WOOD).noOcclusion()));

    public static final Map<String, RegistryObject<Block>> CABLE_FENCES = Util.make(new HashMap<>(), map -> {
        for (String woodType : WOOD_TYPES_LIST)
            map.put(woodType, registerWithItem(woodType + "_cable_fence", () -> new ZawaFenceBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))));
    });
    public static final Map<String, RegistryObject<Block>> CABLE_FENCE_GATES = Util.make(new HashMap<>(), map -> {
        for (String woodType : WOOD_TYPES_LIST)
            map.put(woodType, registerWithItem(woodType + "_cable_fence_gate", () -> new ZawaFenceGateBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))));
    });
    public static final Map<String, RegistryObject<Block>> STRIPPED_CABLE_FENCES = Util.make(new HashMap<>(), map -> {
        for (String woodType : WOOD_TYPES_LIST)
            map.put(woodType, registerWithItem("stripped_" + woodType + "_cable_fence", () -> new ZawaFenceBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))));
    });
    public static final Map<String, RegistryObject<Block>> STRIPPED_CABLE_FENCE_GATES = Util.make(new HashMap<>(), map -> {
        for (String woodType : WOOD_TYPES_LIST)
            map.put(woodType, registerWithItem("stripped_" + woodType + "_cable_fence_gate", () -> new ZawaFenceGateBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))));
    });

    public static final Map<String, RegistryObject<Block>> BAG_RACKS = Util.make(new HashMap<>(), map -> {
        for (int i = 0; i < 16; i++) {
            DyeColor color = DyeColor.byId(i);
            map.put(color.getName(), registerWithItem(color.getName() + "_bag_rack", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion())));
        }
    });
    public static final RegistryObject<Block> FLOODLIGHT = registerWithItem("floodlight", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.DECORATION).noCollission().noOcclusion().lightLevel(light -> 15).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SECURITY_CAMERA = registerWithItem("security_camera", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.DECORATION).noCollission().noOcclusion().sound(SoundType.STONE)));
    public static final Map<String, RegistryObject<Block>> T_SHIRT_RACKS = Util.make(new HashMap<>(), map -> {
        for (int i = 0; i < 16; i++) {
            DyeColor color = DyeColor.byId(i);
            map.put(color.getName(), registerWithItem(color.getName() + "_t_shirt_rack", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion())));
        }
    });
    public static final Map<String, RegistryObject<Block>> ZOO_CUPS = Util.make(new HashMap<>(), map -> {
        for (int i = 0; i < 16; i++) {
            DyeColor color = DyeColor.byId(i);
            map.put(color.getName(), registerWithItem(color.getName() + "_zoo_cup", () -> new RotationalBlock(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion())));
        }
    });

    public static final Map<String, RegistryObject<Block>> PLUSHIES = Util.make(new HashMap<>(), map -> {
        for (String plush : PLUSHIES_LIST)
            map.put(plush, REGISTRAR.register(plush + "_plush", () -> new PlushBlock(AbstractBlock.Properties.of(Material.WOOL).sound(SoundType.WOOL).noOcclusion())));
    });

    private static <T extends Block> RegistryObject<T> registerWithItem(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = REGISTRAR.register(name, block);
        ZEItems.REGISTRAR.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties().tab(Zawa.DECORATIONS_GROUP)));
        return registryObject;
    }

    @OnlyIn(Dist.CLIENT)
    public static void setRenderLayers() {
        RenderType cutoutMipped = RenderType.cutoutMipped();
        RenderTypeLookup.setRenderLayer(BELL_TOY.get(), cutoutMipped);
        RenderTypeLookup.setRenderLayer(PLUSHIES.get("moho").get(), cutoutMipped);
        for (int i = 0; i < 16; i++)
            RenderTypeLookup.setRenderLayer(T_SHIRT_RACKS.get(DyeColor.byId(i).getName()).get(), cutoutMipped);
    }
}
