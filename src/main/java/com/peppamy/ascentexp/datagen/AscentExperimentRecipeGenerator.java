package com.peppamy.ascentexp.datagen;

import com.peppamy.ascentexp.init.AscentExperimentBlocks;
import com.peppamy.ascentexp.init.AscentExperimentItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class AscentExperimentRecipeGenerator extends FabricRecipeProvider {
    public AscentExperimentRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE_AXE)
                .pattern("##")
                .pattern("#/")
                .pattern(" /")
                .input('#', AscentExperimentItems.SAPPHIRE).criterion(RecipeProvider.hasItem(AscentExperimentItems.SAPPHIRE), RecipeProvider.conditionsFromItem(AscentExperimentItems.SAPPHIRE))
                .input('/', Items.STICK).criterion(RecipeProvider.hasItem(Items.STICK), RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE_HOE)
                .pattern("##")
                .pattern(" /")
                .pattern(" /")
                .input('#', AscentExperimentItems.SAPPHIRE).criterion(RecipeProvider.hasItem(AscentExperimentItems.SAPPHIRE), RecipeProvider.conditionsFromItem(AscentExperimentItems.SAPPHIRE))
                .input('/', Items.STICK).criterion(RecipeProvider.hasItem(Items.STICK), RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE_PICKAXE)
                .pattern("###")
                .pattern(" / ")
                .pattern(" / ")
                .input('#', AscentExperimentItems.SAPPHIRE).criterion(RecipeProvider.hasItem(AscentExperimentItems.SAPPHIRE), RecipeProvider.conditionsFromItem(AscentExperimentItems.SAPPHIRE))
                .input('/', Items.STICK).criterion(RecipeProvider.hasItem(Items.STICK), RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE_SHOVEL)
                .pattern("#")
                .pattern("/")
                .pattern("/")
                .input('#', AscentExperimentItems.SAPPHIRE).criterion(RecipeProvider.hasItem(AscentExperimentItems.SAPPHIRE), RecipeProvider.conditionsFromItem(AscentExperimentItems.SAPPHIRE))
                .input('/', Items.STICK).criterion(RecipeProvider.hasItem(Items.STICK), RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE_SWORD)
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .input('#', AscentExperimentItems.SAPPHIRE).criterion(RecipeProvider.hasItem(AscentExperimentItems.SAPPHIRE), RecipeProvider.conditionsFromItem(AscentExperimentItems.SAPPHIRE))
                .input('/', Items.STICK).criterion(RecipeProvider.hasItem(Items.STICK), RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        RecipeProvider.offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE, RecipeCategory.BUILDING_BLOCKS, AscentExperimentBlocks.SAPPHIRE_BLOCK);
    }
}
