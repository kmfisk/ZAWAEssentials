package com.github.kmfisk.essentials.items;

import com.github.kmfisk.essentials.Essentials;
import com.github.kmfisk.essentials.init.ModItems;
import net.minecraft.util.ResourceLocation;
import org.zawamod.entity.painting.EntityZooPainting;
import org.zawamod.init.items.ItemCustomSpawnEgg;

public class ItemSpawnEggEssentials extends ItemCustomSpawnEgg {
    public ItemSpawnEggEssentials(String unloc, EntityZooPainting.EnumArt art) {
        super(unloc, Essentials.MODID, art);
        this.setRegistryName(new ResourceLocation(Essentials.MODID, unloc));
        ModItems.ITEMS.add(this);
    }

    public ItemSpawnEggEssentials(String u) {
        super(u, Essentials.MODID);
        this.setRegistryName(new ResourceLocation(Essentials.MODID, u));
        ModItems.ITEMS.add(this);
    }
}
