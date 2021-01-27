package com.github.kmfisk.essentials.init;

import com.github.kmfisk.essentials.client.render.entity.*;
import com.github.kmfisk.essentials.entity.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.zawamod.configuration.ZAWAConfig;
import org.zawamod.configuration.ZAWASpawnConfiguration;
import org.zawamod.util.BiomeEdit;

import java.util.ArrayList;
import java.util.List;

public class ModEntities {
    public static final List<EntityContainer> CONTAINERS = new ArrayList<>();

    static {
        add(EntityAmazonParrot.class, "amazonparrot");
        add(EntityBudgerigar.class, "budgerigar");
        add(EntityCaique.class, "caique");
        add(EntityChinchilla.class, "chinchilla");
        add(EntityCockatiel.class, "cockatiel");
        add(EntityCongoGrayParrot.class, "congograyparrot");
        add(EntityConure.class, "conure");
        add(EntityEclectusParrot.class, "eclectusparrot");
        add(EntityGreenCheekConure.class, "greencheekconure");
        add(EntityHawaiiOo.class, "hawaiioo");
        add(EntityHawkHeadedParrot.class, "hawkheadedparrot");
        add(EntityKakapo.class, "kakapo");
        add(EntityKakariki.class, "kakariki");
        add(EntityKea.class, "kea");
        add(EntityManedWolf.class, "manedwolf");
        add(EntityPoicephalus.class, "poicephalus");
        add(EntityRingneckParrot.class, "ringneckparrot");
        add(EntityRosella.class, "rosella");
    }

    private static void add(Class<? extends Entity> entityClass, String entityNameIn) {
        CONTAINERS.add(new EntityContainer(entityClass, entityNameIn));
    }

    public static class EntityContainer {
        public Class<? extends Entity> entityClass;
        public String entityName;

        public EntityContainer(Class<? extends Entity> EntityClass, String entityNameIn) {
            this.entityClass = EntityClass;
            this.entityName = entityNameIn;
        }
    }

    public static void init() {
        if (ZAWAConfig.serverOptions.canSpawn) {
            // BiomeEdit(add, remove)
            ZAWASpawnConfiguration.edits.put(EntityAmazonParrot.class, new BiomeEdit(new String[0], new String[0]));

            // excludeBiomesByType(listOfBiomes, biomeTypesToRemove...)
            // getAllBiomesOf(biomeTypes...)
            // SpawnUtils.mergeBiomes(biomes...)
            // SpawnUtils.getBiomesOfType(biomeType)
            ZAWASpawnConfiguration.add(EntityAmazonParrot.class, "AmazonParrots", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityBudgerigar.class, "Budgerigars", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityCaique.class, "Caiques", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityChinchilla.class, "Chinchillas", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityCockatiel.class, "Cockatiels", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityCongoGrayParrot.class, "CongoGrayParrots", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityConure.class, "Conures", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityEclectusParrot.class, "EclectusParrots", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityGreenCheekConure.class, "GreenCheekConures", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityHawaiiOo.class, "HawaiiOoBirds", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityHawkHeadedParrot.class, "HawkHeadedParrots", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityKakapo.class, "KakapoBirds", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityKakariki.class, "KakarikiBirds", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityKea.class, "KeaBirds", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityManedWolf.class, "ManedWolves", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityPoicephalus.class, "PoicephalusBirds", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityRingneckParrot.class, "RingneckParrots", 10, 1, 1, EnumCreatureType.CREATURE);
            ZAWASpawnConfiguration.add(EntityRosella.class, "Rosellas", 10, 1, 1, EnumCreatureType.CREATURE);
        }

//        LootTableList.register(EntityAmazon.LOOT);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityAmazonParrot.class, RenderAmazonParrot::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityBudgerigar.class, RenderBudgerigar::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityCaique.class, RenderCaique::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityChinchilla.class, RenderChinchilla::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityCockatiel.class, RenderCockatiel::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityCongoGrayParrot.class, RenderCongoGrayParrot::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityConure.class, RenderConure::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityEclectusParrot.class, RenderEclectusParrot::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityGreenCheekConure.class, RenderGreenCheekConure::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHawaiiOo.class, RenderHawaiiOo::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHawkHeadedParrot.class, RenderHawkHeadedParrot::new);
//        RenderingRegistry.registerEntityRenderingHandler(EntityKakapo.class, RenderKakapo::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityKakariki.class, RenderKakariki::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityKea.class, RenderKea::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityManedWolf.class, RenderManedWolf::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityPoicephalus.class, RenderPoicephalus::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityRingneckParrot.class, RenderRingneckParrot::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityRosella.class, RenderRosella::new);
    }
}
