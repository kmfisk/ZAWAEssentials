package com.github.kmfisk.zawaessentials;

import com.github.kmfisk.zawaessentials.block.ZEBlocks;
import com.github.kmfisk.zawaessentials.entity.ZEEntities;
import com.github.kmfisk.zawaessentials.item.ZEItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ZawaEssentials.MOD_ID)
public class ZawaEssentials {
    public static final String MOD_ID = "zawaessentials";

    public ZawaEssentials() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ZEEntities.REGISTRAR.register(bus);
        ZEItems.REGISTRAR.register(bus);
        ZEBlocks.REGISTRAR.register(bus);

        bus.addListener(this::setup);
        bus.addListener(this::setupClient);
    }

    private void setup(final FMLCommonSetupEvent event) {
        ZEEntities.registerSpawnPlacements();
    }

    private void setupClient(final FMLClientSetupEvent event) {
        ZEBlocks.setRenderLayers();
    }
}
