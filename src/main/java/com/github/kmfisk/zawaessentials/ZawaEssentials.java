package com.github.kmfisk.zawaessentials;

import com.github.kmfisk.zawaessentials.block.ZEBlocks;
import com.github.kmfisk.zawaessentials.client.model.ZEModelLayers;
import com.github.kmfisk.zawaessentials.data.ZEBlockLoot;
import com.github.kmfisk.zawaessentials.data.ZEEntityLoot;
import com.github.kmfisk.zawaessentials.data.ZERecipeProvider;
import com.github.kmfisk.zawaessentials.entity.ZEEntities;
import com.github.kmfisk.zawaessentials.item.ZEItems;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.util.Tuple;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.zawamod.zawa.Zawa;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

@Mod(ZawaEssentials.MOD_ID)
public class ZawaEssentials {
    public static final String MOD_ID = "zawaessentials";
    public static final String[] PLUSHIES_LIST = new String[]{"blue_budgerigar", "chinchilla", "cockatiel", "green_budgerigar", "maned_wolf", "moho", "prairie_chicken", "sun_conure"};

    public ZawaEssentials() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ZEEntities.REGISTRY.initialize();
        ZEItems.ITEMS_REGISTRAR.register(bus);
        ZEItems.DECORATIONS_REGISTRAR.register(bus);
        ZEBlocks.REGISTRAR.register(bus);

        bus.addListener(this::addCreativeTabs);
        bus.addListener(this::setup);
        bus.addListener(this::gatherData);
        bus.addListener(this::registerLayerDefinitions);
        bus.addListener(this::setupClient);
    }

    private void addCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == Zawa.ITEMS_GROUP.getKey()) {
            ZEItems.ITEMS_REGISTRAR.getEntries().forEach(item -> event.accept(item.get()));
        }
        if (event.getTabKey() == Zawa.DECORATIONS_GROUP.getKey()) {
            ZEItems.DECORATIONS_REGISTRAR.getEntries().forEach(item -> event.accept(item.get()));
        }
        if (event.getTabKey() == Zawa.ENTITIES_GROUP.getKey()) {
            ZEEntities.REGISTRY.itemRegistrar.getEntries().forEach(item -> event.accept(item.get()));
        }
    }

    private void setup(final FMLCommonSetupEvent event) {
        ZEEntities.registerSpawnPlacements();
    }

    private void gatherData(final GatherDataEvent event) {
        System.out.println("Generating zawa Data!");
        DataGenerator dataGenerator = event.getGenerator();
        PackOutput packOutput = dataGenerator.getPackOutput();
//        ZETagsProviders.ZEBlockTagsProvider blockTagsProvider = new ZETagsProviders.ZEBlockTagsProvider(packOutput, event.getLookupProvider(), event.getExistingFileHelper());
//        dataGenerator.addProvider(event.includeServer(), blockTagsProvider);
//        dataGenerator.addProvider(event.includeServer(), new ZETagsProviders.ZEItemTagsProvider(packOutput, event.getLookupProvider(), blockTagsProvider, event.getExistingFileHelper()));
        dataGenerator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(), List.of(
                new LootTableProvider.SubProviderEntry(ZEBlockLoot::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(ZEEntityLoot::new, LootContextParamSets.ENTITY))));
        dataGenerator.addProvider(event.includeServer(), new ZERecipeProvider(packOutput));
    }

    private void setupClient(final FMLClientSetupEvent event) {
        ZEEntities.registerRenderers();
        ZEBlocks.setRenderLayers();
    }

    public void registerLayerDefinitions(final EntityRenderersEvent.RegisterLayerDefinitions event) {
        for (Tuple<ModelLayerLocation, Supplier<LayerDefinition>> layer : ZEModelLayers.MODEL_LAYERS_LIST) {
            event.registerLayerDefinition(layer.getA(), layer.getB());
        }
    }
}
