package com.peppamy.ascentexp.datagen;

import com.peppamy.ascentexp.init.AscentExperimentBlocks;
import com.peppamy.ascentexp.init.AscentExperimentItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
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
        RecipeProvider.offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AscentExperimentItems.RAW_CHARTIUM,
            RecipeCategory.BUILDING_BLOCKS,
            AscentExperimentBlocks.RAW_CHARTIUM_BLOCK);
        RecipeProvider.offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AscentExperimentItems.CHARTIUM_INGOT,
            RecipeCategory.BUILDING_BLOCKS,
            AscentExperimentBlocks.CHARTIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.CHARTIUM_SWORD)
            .pattern("#")
            .pattern("#")
            .pattern("/")
            .input('#', AscentExperimentItems.CHARTIUM_INGOT)
            .input('/', AscentExperimentItems.MYSTICK)
            .criterion(RecipeProvider.hasItem(AscentExperimentItems.CHARTIUM_INGOT),
                RecipeProvider.conditionsFromItem(AscentExperimentItems.CHARTIUM_INGOT))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.CHARTIUM_PICKAXE)
            .pattern("###")
            .pattern(" / ")
            .pattern(" / ")
            .input('#', AscentExperimentItems.CHARTIUM_INGOT)
            .input('/', AscentExperimentItems.MYSTICK)
            .criterion(RecipeProvider.hasItem(AscentExperimentItems.CHARTIUM_INGOT),
                RecipeProvider.conditionsFromItem(AscentExperimentItems.CHARTIUM_INGOT))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.CHARTIUM_AXE)
            .pattern("##")
            .pattern("#/")
            .pattern(" /")
            .input('#', AscentExperimentItems.CHARTIUM_INGOT)
            .input('/', AscentExperimentItems.MYSTICK)
            .criterion(RecipeProvider.hasItem(AscentExperimentItems.CHARTIUM_INGOT),
                RecipeProvider.conditionsFromItem(AscentExperimentItems.CHARTIUM_INGOT))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.CHARTIUM_SHOVEL)
            .pattern("#")
            .pattern("/")
            .pattern("/")
            .input('#', AscentExperimentItems.CHARTIUM_INGOT)
            .input('/', AscentExperimentItems.MYSTICK)
            .criterion(RecipeProvider.hasItem(AscentExperimentItems.CHARTIUM_INGOT),
                RecipeProvider.conditionsFromItem(AscentExperimentItems.CHARTIUM_INGOT))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.CHARTIUM_HOE)
            .pattern("##")
            .pattern(" /")
            .pattern(" /")
            .input('#', AscentExperimentItems.CHARTIUM_INGOT)
            .input('/', AscentExperimentItems.MYSTICK)
            .criterion(RecipeProvider.hasItem(AscentExperimentItems.CHARTIUM_INGOT),
                RecipeProvider.conditionsFromItem(AscentExperimentItems.CHARTIUM_INGOT))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.CHARTIUM_HELMET)
            .pattern("###")
            .pattern("# #")
            .input('#', AscentExperimentItems.CHARTIUM_INGOT)
            .criterion(RecipeProvider.hasItem(AscentExperimentItems.CHARTIUM_INGOT),
                RecipeProvider.conditionsFromItem(AscentExperimentItems.CHARTIUM_INGOT))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.CHARTIUM_CHESTPLATE)
            .pattern("# #")
            .pattern("###")
            .pattern("###")
            .input('#', AscentExperimentItems.CHARTIUM_INGOT)
            .criterion(RecipeProvider.hasItem(AscentExperimentItems.CHARTIUM_INGOT),
                RecipeProvider.conditionsFromItem(AscentExperimentItems.CHARTIUM_INGOT))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.CHARTIUM_LEGGINGS)
            .pattern("###")
            .pattern("# #")
            .pattern("# #")
            .input('#', AscentExperimentItems.CHARTIUM_INGOT)
            .criterion(RecipeProvider.hasItem(AscentExperimentItems.CHARTIUM_INGOT),
                RecipeProvider.conditionsFromItem(AscentExperimentItems.CHARTIUM_INGOT))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.CHARTIUM_BOOTS)
            .pattern("# #")
            .pattern("# #")
            .input('#', AscentExperimentItems.CHARTIUM_INGOT)
            .criterion(RecipeProvider.hasItem(AscentExperimentItems.CHARTIUM_INGOT),
                RecipeProvider.conditionsFromItem(AscentExperimentItems.CHARTIUM_INGOT))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentBlocks.CHARTIUM_BRICKS)
            .pattern("##")
            .pattern("##")
            .input('#', AscentExperimentItems.CHARTIUM_INGOT)
            .criterion(RecipeProvider.hasItem(AscentExperimentItems.CHARTIUM_INGOT),
                RecipeProvider.conditionsFromItem(AscentExperimentItems.CHARTIUM_INGOT))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentBlocks.CHARTIUM_BRICK_STAIRS, 8)
            .pattern("#  ")
            .pattern("## ")
            .pattern("###")
            .input('#', AscentExperimentBlocks.CHARTIUM_BRICKS)
            .criterion(RecipeProvider.hasItem(AscentExperimentBlocks.CHARTIUM_BRICKS),
                RecipeProvider.conditionsFromItem(AscentExperimentBlocks.CHARTIUM_BRICKS))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentBlocks.CHARTIUM_BRICK_SLAB, 6)
            .pattern("###")
            .input('#', AscentExperimentBlocks.CHARTIUM_BRICKS)
            .criterion(RecipeProvider.hasItem(AscentExperimentBlocks.CHARTIUM_BRICKS),
                RecipeProvider.conditionsFromItem(AscentExperimentBlocks.CHARTIUM_BRICKS))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentBlocks.POLISHED_ASTER_STONE, 4)
            .pattern("##")
            .pattern("##")
            .input('#', AscentExperimentBlocks.ASTER_STONE)
            .criterion(RecipeProvider.hasItem(AscentExperimentBlocks.ASTER_STONE),
                RecipeProvider.conditionsFromItem(AscentExperimentBlocks.ASTER_STONE))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentBlocks.POLISHED_ASTER_STONE_STAIRS, 8)
            .pattern("#  ")
            .pattern("## ")
            .pattern("###")
            .input('#', AscentExperimentBlocks.POLISHED_ASTER_STONE)
            .criterion(RecipeProvider.hasItem(AscentExperimentBlocks.POLISHED_ASTER_STONE),
                RecipeProvider.conditionsFromItem(AscentExperimentBlocks.POLISHED_ASTER_STONE))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentBlocks.POLISHED_ASTER_STONE_SLAB, 6)
            .pattern("###")
            .input('#', AscentExperimentBlocks.POLISHED_ASTER_STONE)
            .criterion(RecipeProvider.hasItem(AscentExperimentBlocks.POLISHED_ASTER_STONE),
                RecipeProvider.conditionsFromItem(AscentExperimentBlocks.POLISHED_ASTER_STONE))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentBlocks.ASTER_STONE_BRICKS, 4)
            .pattern("##")
            .pattern("##")
            .input('#', AscentExperimentBlocks.POLISHED_ASTER_STONE)
            .criterion(RecipeProvider.hasItem(AscentExperimentBlocks.POLISHED_ASTER_STONE),
                RecipeProvider.conditionsFromItem(AscentExperimentBlocks.POLISHED_ASTER_STONE))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentBlocks.ASTER_STONE_BRICK_STAIRS, 8)
            .pattern("#  ")
            .pattern("## ")
            .pattern("###")
            .input('#', AscentExperimentBlocks.ASTER_STONE_BRICKS)
            .criterion(RecipeProvider.hasItem(AscentExperimentBlocks.ASTER_STONE_BRICKS),
                RecipeProvider.conditionsFromItem(AscentExperimentBlocks.ASTER_STONE_BRICKS))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentBlocks.ASTER_STONE_BRICK_SLAB, 6)
            .pattern("###")
            .input('#', AscentExperimentBlocks.ASTER_STONE_BRICKS)
            .criterion(RecipeProvider.hasItem(AscentExperimentBlocks.ASTER_STONE_BRICKS),
                RecipeProvider.conditionsFromItem(AscentExperimentBlocks.ASTER_STONE_BRICKS))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentBlocks.ASTER_STONE_BRICK_WALL, 6)
            .pattern("###")
            .pattern("###")
            .input('#', AscentExperimentBlocks.ASTER_STONE_BRICKS)
            .criterion(RecipeProvider.hasItem(AscentExperimentBlocks.ASTER_STONE_BRICKS),
                RecipeProvider.conditionsFromItem(AscentExperimentBlocks.ASTER_STONE_BRICKS))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentBlocks.CHISELED_ASTER_STONE)
            .pattern("#")
            .pattern("#")
            .input('#', AscentExperimentBlocks.ASTER_STONE_BRICK_SLAB)
            .criterion(RecipeProvider.hasItem(AscentExperimentBlocks.ASTER_STONE_BRICK_SLAB),
                RecipeProvider.conditionsFromItem(AscentExperimentBlocks.ASTER_STONE_BRICK_SLAB))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentBlocks.ASTER_PILLAR, 2)
            .pattern("#")
            .pattern("#")
            .input('#', AscentExperimentBlocks.POLISHED_ASTER_STONE)
            .criterion(RecipeProvider.hasItem(AscentExperimentBlocks.POLISHED_ASTER_STONE),
                RecipeProvider.conditionsFromItem(AscentExperimentBlocks.POLISHED_ASTER_STONE))
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
        RecipeProvider.offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AscentExperimentItems.HEMATITE_CHUNK,
            RecipeCategory.BUILDING_BLOCKS,
            AscentExperimentBlocks.HEMATITE_BLOCK);
        RecipeProvider.offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, AscentExperimentItems.COKE,
            RecipeCategory.BUILDING_BLOCKS,
            AscentExperimentBlocks.COKE_BLOCK);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, AscentExperimentItems.HEMATITE_CATALYST, 4)
            .input(AscentExperimentItems.HEMATITE_CHUNK, 4)
            .input(AscentExperimentItems.COKE)
            .criterion(RecipeProvider.hasItem(AscentExperimentItems.HEMATITE_CHUNK),
                RecipeProvider.conditionsFromItem(AscentExperimentItems.HEMATITE_CHUNK))
            .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.TORCH, 8)
            .pattern("#")
            .pattern("/")
            .input('#', AscentExperimentItems.COKE)
            .input('/', ConventionalItemTags.WOODEN_RODS)
            .criterion(RecipeProvider.hasItem(Items.PAPER),
                RecipeProvider.conditionsFromItem(Items.PAPER))
            .offerTo(exporter);
    }
}
