package com.github.kmfisk.essentials;

import com.github.kmfisk.essentials.entity.EntityRosella;
import com.github.kmfisk.essentials.init.ModEntities;
import com.github.kmfisk.essentials.init.ModItems;
import com.github.kmfisk.essentials.proxy.CommonProxy;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.registries.IForgeRegistry;
import org.zawamod.entity.base.ZAWABaseWater;
import org.zawamod.entity.core.DietHandler;
import org.zawamod.entity.water.EntityFishBase;
import org.zawamod.init.ZAWAItems;

@Mod(modid = Essentials.MODID, name = Essentials.NAME, version = Essentials.VERSION, acceptedMinecraftVersions = Essentials.ACCEPTED_VERSIONS,
        dependencies = Essentials.DEPENDS)
public class Essentials {
    public static final String MODID = "essentials";
    public static final String NAME = "Essentials";
    public static final String VERSION = "@VERSION@";
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";
    public static final String CLIENT_PROXY = "com.github.kmfisk.essentials.proxy.ClientProxy";
    public static final String SERVER_PROXY = "com.github.kmfisk.essentials.proxy.ServerProxy";
    public static final String DEPENDS = "required-after:bookworm@[1.12.2-2.5.2];required-after:zawa@[1.12.2-2.1.0];";

    @Mod.Instance
    public static Essentials instance;

    @SidedProxy(clientSide = Essentials.CLIENT_PROXY, serverSide = Essentials.SERVER_PROXY)
    public static CommonProxy PROXY;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        PROXY.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        PROXY.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        DietHandler.DIET_MAP.put(EntityRosella.class, DietHandler.PARROT);

        ZAWAItems.SPAWN_EGG_DATA.put(EntityRosella.class, new ItemStack(ModItems.ROSELLA_SPAWN_EGG));

        PROXY.postInit(event);
    }

    @Mod.EventBusSubscriber(modid = Essentials.MODID)
    public static class Handlers {
        @SubscribeEvent
        public static void registerEntities(final RegistryEvent.Register<EntityEntry> event) {
            final IForgeRegistry<EntityEntry> registry = event.getRegistry();
            int id = 0;
            for (ModEntities.EntityContainer a : ModEntities.CONTAINERS) {
                EntityEntry entry = EntityEntryBuilder.create().entity(a.entityClass).id(new ResourceLocation(Essentials.MODID, a.entityName), id++).name(Essentials.MODID + "." + a.entityName).tracker(1024, 1, true).build();
                if (ZAWABaseWater.class.isAssignableFrom(a.entityClass) || EntityFishBase.class.isAssignableFrom(a.entityClass)) {
                    EntitySpawnPlacementRegistry.setPlacementType(a.entityClass, EntityLiving.SpawnPlacementType.IN_WATER);
                }
                registry.register(entry);
            }
        }
    }
}
