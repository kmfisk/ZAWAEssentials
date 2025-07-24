package com.github.kmfisk.zawaessentials.data;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.block.ZEBlocks;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.stream.Collectors;

import static com.github.kmfisk.zawaessentials.ZawaEssentials.PLUSHIES_LIST;

public class ZEBlockLoot extends VanillaBlockLoot {
    @Override
    protected void generate() {
        dropSelf(ZEBlocks.BELL_TOY.get());
        dropSelf(ZEBlocks.CUP_FEEDER.get());
        dropSelf(ZEBlocks.BELL_TOY.get());
        dropSelf(ZEBlocks.LARGE_BIRD_TOY.get());
        dropSelf(ZEBlocks.FLOODLIGHT.get());
        dropSelf(ZEBlocks.SECURITY_CAMERA.get());

        for (String woodType : ZEBlocks.WOOD_TYPES_LIST) {
            dropSelf(ZEBlocks.HANGING_PERCHES.get(woodType).get());
            dropSelf(ZEBlocks.CABLE_FENCES.get(woodType).get());
            dropSelf(ZEBlocks.CABLE_FENCE_GATES.get(woodType).get());
            dropSelf(ZEBlocks.STRIPPED_CABLE_FENCES.get(woodType).get());
            dropSelf(ZEBlocks.STRIPPED_CABLE_FENCE_GATES.get(woodType).get());
        }

        for (int i = 0; i < 16; i++) {
            DyeColor color = DyeColor.byId(i);
            dropSelf(ZEBlocks.BAG_RACKS.get(color.getName()).get());
            dropSelf(ZEBlocks.T_SHIRT_RACKS.get(color.getName()).get());
            dropSelf(ZEBlocks.ZOO_CUPS.get(color.getName()).get());
        }

        for (String plush : PLUSHIES_LIST) dropSelf(ZEBlocks.PLUSHIES.get(plush).get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getEntries().stream()
                .filter(e -> e.getKey().location().getNamespace().equals(ZawaEssentials.MOD_ID))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }
}
