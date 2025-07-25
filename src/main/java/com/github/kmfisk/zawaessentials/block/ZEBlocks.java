package com.github.kmfisk.zawaessentials.block;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.item.ZEItems;
import net.minecraft.Util;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
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
    public static final String[] WOOD_TYPES_LIST = new String[]{"acacia", "bamboo", "birch", "cherry", "dark_oak", "jungle", "mangrove", "oak", "spruce", "crimson", "warped"};

    public static final RegistryObject<Block> CUP_FEEDER = registerWithItem("cup_feeder", () -> new ZawaEnrichmentBlock(Block.box(2.0, 1.0, 2.0, 14.0, 16.0, 14.0), BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).noOcclusion()));
    public static final RegistryObject<Block> BELL_TOY = registerWithItem("bell_toy", () -> new ZawaEnrichmentBlock(Block.box(2.0, 1.0, 2.0, 14.0, 16.0, 14.0), BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).noOcclusion()));
    public static final Map<String, RegistryObject<Block>> HANGING_PERCHES = Util.make(new HashMap<>(), map -> {
        for (String woodType : WOOD_TYPES_LIST)
            map.put(woodType, registerWithItem(woodType + "_hanging_perch", () -> new HangingPerchBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion())));
    });
    public static final RegistryObject<Block> LARGE_BIRD_TOY = registerWithItem("large_bird_toy", () -> new ZawaEnrichmentBlock(Block.box(2.0, 1.0, 2.0, 14.0, 16.0, 14.0), BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).noOcclusion()));

    public static final Map<String, RegistryObject<Block>> CABLE_FENCES = Util.make(new HashMap<>(), map -> {
        for (String woodType : WOOD_TYPES_LIST)
            map.put(woodType, registerWithItem(woodType + "_cable_fence", () -> new ZawaFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 3.0F).sound(SoundType.WOOD))));
    });
    public static final Map<String, RegistryObject<Block>> CABLE_FENCE_GATES = Util.make(new HashMap<>(), map -> {
        for (String woodType : WOOD_TYPES_LIST)
            map.put(woodType, registerWithItem(woodType + "_cable_fence_gate", () -> new ZawaFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 3.0F).sound(SoundType.WOOD), WoodType.OAK)));
    });
    public static final Map<String, RegistryObject<Block>> STRIPPED_CABLE_FENCES = Util.make(new HashMap<>(), map -> {
        for (String woodType : WOOD_TYPES_LIST)
            map.put(woodType, registerWithItem("stripped_" + woodType + "_cable_fence", () -> new ZawaFenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 3.0F).sound(SoundType.WOOD))));
    });
    public static final Map<String, RegistryObject<Block>> STRIPPED_CABLE_FENCE_GATES = Util.make(new HashMap<>(), map -> {
        for (String woodType : WOOD_TYPES_LIST)
            map.put(woodType, registerWithItem("stripped_" + woodType + "_cable_fence_gate", () -> new ZawaFenceGateBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 3.0F).sound(SoundType.WOOD), WoodType.OAK)));
    });

    public static final Map<String, RegistryObject<Block>> BAG_RACKS = Util.make(new HashMap<>(), map -> {
        for (int i = 0; i < 16; i++) {
            DyeColor color = DyeColor.byId(i);
            map.put(color.getName(), registerWithItem(color.getName() + "_bag_rack", () -> new RotationalBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion())));
        }
    });
    public static final RegistryObject<Block> FLOODLIGHT = registerWithItem("floodlight", () -> new RotationalBlock(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).noCollission().noOcclusion().lightLevel(light -> 15).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SECURITY_CAMERA = registerWithItem("security_camera", () -> new RotationalBlock(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).noCollission().noOcclusion().sound(SoundType.STONE)));
    public static final Map<String, RegistryObject<Block>> T_SHIRT_RACKS = Util.make(new HashMap<>(), map -> {
        for (int i = 0; i < 16; i++) {
            DyeColor color = DyeColor.byId(i);
            map.put(color.getName(), registerWithItem(color.getName() + "_t_shirt_rack", () -> new RotationalBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion())));
        }
    });
    public static final Map<String, RegistryObject<Block>> ZOO_CUPS = Util.make(new HashMap<>(), map -> {
        for (int i = 0; i < 16; i++) {
            DyeColor color = DyeColor.byId(i);
            map.put(color.getName(), registerWithItem(color.getName() + "_zoo_cup", () -> new RotationalBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion())));
        }
    });

    public static final Map<String, RegistryObject<Block>> PLUSHIES = Util.make(new HashMap<>(), map -> {
        for (String plush : PLUSHIES_LIST)
            map.put(plush, REGISTRAR.register(plush + "_plush", () -> new PlushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOL).sound(SoundType.WOOL).noOcclusion())));
    });

    private static <T extends Block> RegistryObject<T> registerWithItem(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = REGISTRAR.register(name, block);
        ZEItems.DECORATIONS_REGISTRAR.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties()));
        return registryObject;
    }

    @OnlyIn(Dist.CLIENT)
    public static void setRenderLayers() {
        RenderType cutoutMipped = RenderType.cutoutMipped();
        ItemBlockRenderTypes.setRenderLayer(BELL_TOY.get(), cutoutMipped);
        ItemBlockRenderTypes.setRenderLayer(PLUSHIES.get("moho").get(), cutoutMipped);
        for (int i = 0; i < 16; i++)
            ItemBlockRenderTypes.setRenderLayer(T_SHIRT_RACKS.get(DyeColor.byId(i).getName()).get(), cutoutMipped);
    }
}
