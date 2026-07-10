package com.peppamy.ascentexp.datagen;

import com.peppamy.ascentexp.init.AscentExperimentBlocks;
import com.peppamy.ascentexp.init.AscentExperimentItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class AscentExperimentBlockLootTableGenerator extends FabricBlockLootTableProvider {

    protected AscentExperimentBlockLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(AscentExperimentBlocks.SAPPHIRE_BLOCK);
        addDrop(AscentExperimentBlocks.BLOOD_RUTILE_BLOCK);
        addDrop(AscentExperimentBlocks.CHARTIUM_BLOCK);
        addDrop(AscentExperimentBlocks.ASTER_STONE);
        addDrop(AscentExperimentBlocks.CHARTIUM_BRICKS);
        addDrop(AscentExperimentBlocks.RAW_CHARTIUM_BLOCK);
        addDrop(AscentExperimentBlocks.HEMATITE_BLOCK);
        addDrop(AscentExperimentBlocks.COKE_BLOCK);
        this.addDrop(AscentExperimentBlocks.SAPPHIRE_ORE, block -> this.oreDrops(block, AscentExperimentItems.SAPPHIRE));
        this.addDrop(AscentExperimentBlocks.DEEPSLATE_SAPPHIRE_ORE, block -> this.oreDrops(block, AscentExperimentItems.SAPPHIRE));
        this.addDrop(AscentExperimentBlocks.BLACKSTONE_RUTILE_ORE, block -> this.oreDrops(block, AscentExperimentItems.BLOOD_RUTILE));
        this.addDrop(AscentExperimentBlocks.BASALT_RUTILE_ORE, block -> this.oreDrops(block, AscentExperimentItems.BLOOD_RUTILE));
        this.addDrop(AscentExperimentBlocks.CHARTIUM_ORE, block -> this.oreDrops(block, AscentExperimentItems.RAW_CHARTIUM));
        this.addDrop(AscentExperimentBlocks.COMPASSION_PLANT, block -> this.drops(block, AscentExperimentItems.COMPASSION_FRUIT));
        this.addDrop(AscentExperimentBlocks.FRUITING_COMPASSION_LEAVES, block -> this.drops(block, AscentExperimentItems.COMPASSION_FRUIT));
        this.addDrop(AscentExperimentBlocks.HEMATITE_ORE, block -> this.oreDrops(block, AscentExperimentItems.HEMATITE_CHUNK));
        this.addDrop(AscentExperimentBlocks.DEEPSLATE_HEMATITE_ORE, block -> this.oreDrops(block, AscentExperimentItems.HEMATITE_CHUNK));
        this.addDrop(AscentExperimentBlocks.COKE_ORE, block -> this.oreDrops(block, AscentExperimentItems.COKE));
        this.addDrop(AscentExperimentBlocks.BASALT_COKE_ORE, block -> this.oreDrops(block, AscentExperimentItems.COKE));
    }
}
