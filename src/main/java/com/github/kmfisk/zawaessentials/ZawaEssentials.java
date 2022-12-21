package com.github.kmfisk.zawaessentials;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ZawaEssentials.MOD_ID)
public class ZawaEssentials
{
    public static final String MOD_ID = "zawaessentials";

    public ZawaEssentials() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::setup);
        bus.addListener(this::registerAttributes);
        bus.addListener(this::setupClient);
    }

    private void registerAttributes(final EntityAttributeCreationEvent event) {}
    private void setup(final FMLCommonSetupEvent event) {}
    private void setupClient(final FMLClientSetupEvent event) {}
}
