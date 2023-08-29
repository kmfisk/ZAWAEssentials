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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.zawamod.zawa.Zawa;
import org.zawamod.zawa.world.block.PlushBlock;
import org.zawamod.zawa.world.block.ZawaFenceBlock;
import org.zawamod.zawa.world.block.ZawaFenceGateBlock;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ZEBlocks {
    public static final DeferredRegister<Block> REGISTRAR = DeferredRegister.create(ForgeRegistries.BLOCKS, ZawaEssentials.MOD_ID);

    public static final RegistryObject<Block> CUP_FEEDER = registerWithItem("cup_feeder", () -> new Block(AbstractBlock.Properties.of(Material.STONE)));

    public static final RegistryObject<Block> BELL_TOY = registerWithItem("bell_toy", () -> new Block(AbstractBlock.Properties.of(Material.STONE)));
    public static final Map<String, RegistryObject<Block>> HANGING_PERCHES = new HashMap<>();
    public static final RegistryObject<Block> LARGE_BIRD_TOY = registerWithItem("large_bird_toy", () -> new Block(AbstractBlock.Properties.of(Material.STONE)));

    public static final Map<String, RegistryObject<Block>> CABLE_FENCES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CABLE_FENCE_GATES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> STRIPPED_CABLE_FENCES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> STRIPPED_CABLE_FENCE_GATES = new HashMap<>();

    public static final Map<String, RegistryObject<Block>> BAG_RACKS = new HashMap<>();
    public static final RegistryObject<Block> FLOODLIGHT = registerWithItem("floodlight", () -> new Block(AbstractBlock.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> SECURITY_CAMERA = registerWithItem("security_camera", () -> new Block(AbstractBlock.Properties.of(Material.STONE)));
    public static final Map<String, RegistryObject<Block>> T_SHIRT_RACKS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ZOO_CUPS = new HashMap<>();

    public static final Map<String, RegistryObject<Block>> PLUSHIES = new HashMap<>();

    static {
        for (String plush : new String[]{"blue_budgerigar", "chinchilla", "cockatiel", "green_budgerigar", "maned_wolf",
                "moho", "prairie_chicken", "sun_conure"})
            PLUSHIES.put(plush, registerWithItem(plush + "_plush", () -> new PlushBlock(AbstractBlock.Properties.of(Material.WOOL).sound(SoundType.WOOL))));


        for (String woodType : new String[]{"acacia", "birch", "dark_oak", "jungle", "oak", "spruce", "crimson", "warped"}) {
            HANGING_PERCHES.put(woodType, registerWithItem(woodType + "_hanging_perch", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion())));
            CABLE_FENCES.put(woodType, registerWithItem(woodType + "_cable_fence", () -> new ZawaFenceBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))));
            CABLE_FENCE_GATES.put(woodType, registerWithItem(woodType + "_cable_fence_gate", () -> new ZawaFenceGateBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))));
            STRIPPED_CABLE_FENCES.put(woodType, registerWithItem("stripped_" + woodType + "_cable_fence", () -> new ZawaFenceBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))));
            STRIPPED_CABLE_FENCE_GATES.put(woodType, registerWithItem("stripped_" + woodType + "_cable_fence_gate", () -> new ZawaFenceGateBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(2.0F, 3.0F).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE))));
        }

        for (int i = 0; i < 16; i++) {
            DyeColor color = DyeColor.byId(i);
            BAG_RACKS.put(color.getName(), registerWithItem(color.getName() + "_bag_rack", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion())));
            T_SHIRT_RACKS.put(color.getName(), registerWithItem(color.getName() + "_t_shirt_rack", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion())));
            ZOO_CUPS.put(color.getName(), registerWithItem(color.getName() + "_zoo_cup", () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD).noOcclusion())));
        }
    }

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
        for (int i = 0; i < 16; i++) RenderTypeLookup.setRenderLayer(T_SHIRT_RACKS.get(DyeColor.byId(i).getName()).get(), cutoutMipped);
    }
}
