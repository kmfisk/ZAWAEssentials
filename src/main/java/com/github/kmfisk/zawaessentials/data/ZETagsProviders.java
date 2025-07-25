package com.github.kmfisk.zawaessentials.data;

import com.github.kmfisk.zawaessentials.ZawaEssentials;
import com.github.kmfisk.zawaessentials.block.ZEBlocks;
import com.github.kmfisk.zawaessentials.entity.ZEEntities;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import org.zawamod.zawa.tags.ZawaEntityTypeTags;

import java.util.concurrent.CompletableFuture;

public class ZETagsProviders {
    public static class ZEEntityTypeTagsProvider extends EntityTypeTagsProvider {
        public ZEEntityTypeTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, ZawaEssentials.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            tag(ZawaEntityTypeTags.SPECIES_VARIANTS).add(
                    ZEEntities.AUSTRALIAN_RINGNECK_PARROT.get(),
                    ZEEntities.CAIQUE.get(),
                    ZEEntities.CONURE.get(),
                    ZEEntities.ECLECTUS.get(),
                    ZEEntities.GREEN_CHEEK_CONURE.get(),
                    ZEEntities.KAKARIKI.get(),
                    ZEEntities.MOHO.get(),
                    ZEEntities.POICEPHALUS_PARROT.get(),
                    ZEEntities.RINGNECK_PARROT.get(),
                    ZEEntities.ROSELLA.get()
            );
            tag(ZawaEntityTypeTags.ZOO_ANIMALS).add(
                    ZEEntities.AUSTRALIAN_RINGNECK_PARROT.get(),
                    ZEEntities.BUDGERIGAR.get(),
                    ZEEntities.CAIQUE.get(),
                    ZEEntities.CHINCHILLA.get(),
                    ZEEntities.COCKATIEL.get(),
                    ZEEntities.CONGO_GRAY_PARROT.get(),
                    ZEEntities.CONURE.get(),
                    ZEEntities.ECLECTUS.get(),
                    ZEEntities.GREATER_PRAIRIE_CHICKEN.get(),
                    ZEEntities.GREEN_CHEEK_CONURE.get(),
                    ZEEntities.HAWK_HEADED_PARROT.get(),
                    ZEEntities.KAKARIKI.get(),
                    ZEEntities.KEA.get(),
                    ZEEntities.MANED_WOLF.get(),
                    ZEEntities.MOHO.get(),
                    ZEEntities.POICEPHALUS_PARROT.get(),
                    ZEEntities.QUAKER_PARAKEET.get(),
                    ZEEntities.RINGNECK_PARROT.get(),
                    ZEEntities.ROSELLA.get()
            );
        }
    }

    public static class ZEBlockTagsProvider extends BlockTagsProvider {
        public ZEBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, ZawaEssentials.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            ZEBlocks.CABLE_FENCES.forEach((string, block) -> tag(BlockTags.MINEABLE_WITH_AXE).add(block.get()));
            ZEBlocks.STRIPPED_CABLE_FENCES.forEach((string, block) -> tag(BlockTags.MINEABLE_WITH_AXE).add(block.get()));
            ZEBlocks.CABLE_FENCE_GATES.forEach((string, block) -> tag(BlockTags.MINEABLE_WITH_AXE).add(block.get()));
            ZEBlocks.STRIPPED_CABLE_FENCE_GATES.forEach((string, block) -> tag(BlockTags.MINEABLE_WITH_AXE).add(block.get()));
            ZEBlocks.HANGING_PERCHES.forEach((string, block) -> tag(BlockTags.MINEABLE_WITH_AXE).add(block.get()));
        }
    }
}
