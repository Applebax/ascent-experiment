package com.peppamy.ascentexp.datagen;

import com.peppamy.ascentexp.init.AscentExperimentBlocks;
import com.peppamy.ascentexp.init.AscentExperimentItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class AscentExperimentRecipeGenerator extends FabricRecipeProvider {
    public AscentExperimentRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        RecipeProvider.offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE,
                                                        RecipeCategory.BUILDING_BLOCKS,
                                                        AscentExperimentBlocks.SAPPHIRE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE_SWORD)
                               .pattern("#")
                               .pattern("#")
                               .pattern("/")
                               .input('#', AscentExperimentItems.SAPPHIRE)
                               .input('/', ConventionalItemTags.WOODEN_RODS)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.SAPPHIRE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.SAPPHIRE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE_PICKAXE)
                               .pattern("###")
                               .pattern(" / ")
                               .pattern(" / ")
                               .input('#', AscentExperimentItems.SAPPHIRE)
                               .input('/', ConventionalItemTags.WOODEN_RODS)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.SAPPHIRE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.SAPPHIRE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE_AXE)
                               .pattern("##")
                               .pattern("#/")
                               .pattern(" /")
                               .input('#', AscentExperimentItems.SAPPHIRE)
                               .input('/', ConventionalItemTags.WOODEN_RODS)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.SAPPHIRE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.SAPPHIRE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE_SHOVEL)
                               .pattern("#")
                               .pattern("/")
                               .pattern("/")
                               .input('#', AscentExperimentItems.SAPPHIRE)
                               .input('/', ConventionalItemTags.WOODEN_RODS)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.SAPPHIRE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.SAPPHIRE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE_HOE)
                               .pattern("##")
                               .pattern(" /")
                               .pattern(" /")
                               .input('#', AscentExperimentItems.SAPPHIRE)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.SAPPHIRE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.SAPPHIRE))
                               .input('/', ConventionalItemTags.WOODEN_RODS)
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE_HELMET)
                               .pattern("###")
                               .pattern("# #")
                               .input('#', AscentExperimentItems.SAPPHIRE)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.SAPPHIRE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.SAPPHIRE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE_CHESTPLATE)
                               .pattern("# #")
                               .pattern("###")
                               .pattern("###")
                               .input('#', AscentExperimentItems.SAPPHIRE)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.SAPPHIRE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.SAPPHIRE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE_LEGGINGS)
                               .pattern("###")
                               .pattern("# #")
                               .pattern("# #")
                               .input('#', AscentExperimentItems.SAPPHIRE)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.SAPPHIRE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.SAPPHIRE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SAPPHIRE_BOOTS)
                               .pattern("# #")
                               .pattern("# #")
                               .input('#', AscentExperimentItems.SAPPHIRE)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.SAPPHIRE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.SAPPHIRE))
                               .offerTo(exporter);
        RecipeProvider.offerReversibleCompactingRecipes(exporter,
                                                        RecipeCategory.MISC,
                                                        AscentExperimentItems.BLOOD_RUTILE,
                                                        RecipeCategory.BUILDING_BLOCKS,
                                                        AscentExperimentBlocks.BLOOD_RUTILE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.BLOOD_RUTILE_SWORD)
                               .pattern("#")
                               .pattern("#")
                               .pattern("/")
                               .input('#', AscentExperimentItems.BLOOD_RUTILE)
                               .input('/', AscentExperimentItems.MYSTICK)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.BLOOD_RUTILE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.BLOOD_RUTILE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.BLOOD_RUTILE_PICKAXE)
                               .pattern("###")
                               .pattern(" / ")
                               .pattern(" / ")
                               .input('#', AscentExperimentItems.BLOOD_RUTILE)
                               .input('/', AscentExperimentItems.MYSTICK)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.BLOOD_RUTILE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.BLOOD_RUTILE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.BLOOD_RUTILE_AXE)
                               .pattern("##")
                               .pattern("#/")
                               .pattern(" /")
                               .input('#', AscentExperimentItems.BLOOD_RUTILE)
                               .input('/', AscentExperimentItems.MYSTICK)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.BLOOD_RUTILE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.BLOOD_RUTILE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.BLOOD_RUTILE_SHOVEL)
                               .pattern("#")
                               .pattern("/")
                               .pattern("/")
                               .input('#', AscentExperimentItems.BLOOD_RUTILE)
                               .input('/', AscentExperimentItems.MYSTICK)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.BLOOD_RUTILE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.BLOOD_RUTILE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.BLOOD_RUTILE_HOE)
                               .pattern("##")
                               .pattern(" /")
                               .pattern(" /")
                               .input('#', AscentExperimentItems.BLOOD_RUTILE)
                               .input('/', AscentExperimentItems.MYSTICK)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.BLOOD_RUTILE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.BLOOD_RUTILE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.BLOOD_RUTILE_HELMET)
                               .pattern("###")
                               .pattern("# #")
                               .input('#', AscentExperimentItems.BLOOD_RUTILE)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.BLOOD_RUTILE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.BLOOD_RUTILE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.BLOOD_RUTILE_CHESTPLATE)
                               .pattern("# #")
                               .pattern("###")
                               .pattern("###")
                               .input('#', AscentExperimentItems.BLOOD_RUTILE)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.BLOOD_RUTILE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.BLOOD_RUTILE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.BLOOD_RUTILE_LEGGINGS)
                               .pattern("###")
                               .pattern("# #")
                               .pattern("# #")
                               .input('#', AscentExperimentItems.BLOOD_RUTILE)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.BLOOD_RUTILE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.BLOOD_RUTILE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.BLOOD_RUTILE_BOOTS)
                               .pattern("# #")
                               .pattern("# #")
                               .input('#', AscentExperimentItems.BLOOD_RUTILE)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.BLOOD_RUTILE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.BLOOD_RUTILE))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.HEART_BADGE)
                               .pattern(" . ")
                               .pattern("=#=")
                               .pattern(" , ")
                               .input('#', AscentExperimentBlocks.BLOOD_RUTILE_BLOCK)
                               .criterion(RecipeProvider.hasItem(AscentExperimentItems.BLOOD_RUTILE),
                                          RecipeProvider.conditionsFromItem(AscentExperimentItems.BLOOD_RUTILE))
                               .input('=', ItemTags.WOODEN_SLABS)
                               .input(',', Items.IRON_NUGGET)
                               .input('.', Items.GHAST_TEAR)
                               .criterion(RecipeProvider.hasItem(Items.GHAST_TEAR),
                                          RecipeProvider.conditionsFromItem(Items.GHAST_TEAR))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.LIFE_PATCH, 3)
                               .pattern("###")
                               .pattern("bHb")
                               .pattern("###")
                               .input('#', Items.PAPER)
                               .input('b', ConventionalItemTags.BEETROOT_CROPS)
                               .input('H', ConventionalItemTags.HONEY_DRINKS)
                               .criterion(RecipeProvider.hasItem(Items.PAPER),
                                          RecipeProvider.conditionsFromItem(Items.PAPER))
                               .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.SUPER_LIFE_PATCH, 6)
                               .pattern("###")
                               .pattern("...")
                               .pattern("###")
                               .input('#', AscentExperimentItems.LIFE_PATCH)
                               .input('.', Items.GHAST_TEAR)
                               .criterion(RecipeProvider.hasItem(Items.PAPER),
                                          RecipeProvider.conditionsFromItem(Items.PAPER))
                               .offerTo(exporter);
    }
}
