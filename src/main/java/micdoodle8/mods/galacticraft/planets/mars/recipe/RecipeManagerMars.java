package micdoodle8.mods.galacticraft.planets.mars.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;

import micdoodle8.mods.galacticraft.core.blocks.GCBlocks;
import micdoodle8.mods.galacticraft.core.items.GCItems;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import micdoodle8.mods.galacticraft.core.util.RecipeUtil;
import micdoodle8.mods.galacticraft.planets.mars.blocks.BlockMachineMars;
import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks;
import micdoodle8.mods.galacticraft.planets.mars.items.MarsItems;

public class RecipeManagerMars {

    public static void loadRecipes() {
        RecipeManagerMars.addUniversalRecipes();
    }

    private static void addUniversalRecipes() {
        OreDictionary.registerOre("ingotDesh", new ItemStack(MarsItems.marsItemBasic, 1, 2));
        OreDictionary.registerOre("compressedDesh", new ItemStack(MarsItems.marsItemBasic, 1, 5));
        final Object meteoricIronIngot = ConfigManagerCore.recipesRequireGCAdvancedMetals ? GCItems.meteoricIronIngot
                : "ingotMeteoricIron";
        final Object deshIngot = ConfigManagerCore.recipesRequireGCAdvancedMetals
                ? new ItemStack(MarsItems.marsItemBasic, 1, 2)
                : "ingotDesh";
        final Object deshPlate = ConfigManagerCore.recipesRequireGCAdvancedMetals
                ? new ItemStack(MarsItems.marsItemBasic, 1, 5)
                : "compressedDesh";

        RecipeUtil.addRecipe(
                new ItemStack(MarsItems.deshBoots),
                new Object[] { "X X", "X X", 'X', new ItemStack(MarsItems.marsItemBasic, 1, 2) });

        RecipeUtil.addRecipe(
                new ItemStack(MarsBlocks.marsBlock, 1, 8),
                new Object[] { "XXX", "XXX", "XXX", 'X', deshIngot });

        RecipeUtil.addRecipe(
                new ItemStack(MarsBlocks.machine, 1, 0),
                new Object[] { "XWX", "XZX", "WVW", 'V', GCItems.oxygenConcentrator, 'W', deshPlate, 'X', deshIngot,
                        'Z', new ItemStack(GCItems.canister) });

        RecipeUtil.addRecipe(
                new ItemStack(MarsBlocks.machine, 1, 4),
                new Object[] { "XYX", "XZX", "XYX", 'X', deshPlate, 'Y', new ItemStack(MarsItems.marsItemBasic, 1, 3),
                        'Z', Items.bed });
        // Gas liquefier
        RecipeUtil.addRecipe(
                new ItemStack(MarsBlocks.machineT2, 1, 0),
                new Object[] { "TVS", "FWS", "PXO", 'T',
                        new ItemStack(GCItems.oxTankHeavy, 1, GCItems.oxTankHeavy.getMaxDamage()), 'V',
                        GCItems.oxygenVent, 'F', new ItemStack(GCBlocks.oxygenPipe, 1, 0), 'X',
                        new ItemStack(GCItems.basicItem, 1, 10), 'W', new ItemStack(MarsItems.marsItemBasic, 1, 6), 'O',
                        new ItemStack(GCBlocks.oxygenCompressor, 1, 0), 'P',
                        new ItemStack(GCBlocks.oxygenCompressor, 1, 4), 'S',
                        new ItemStack(GCItems.oxTankMedium, 1, GCItems.oxTankMedium.getMaxDamage()) });
        // Methane Synthesizer
        RecipeUtil.addRecipe(
                new ItemStack(MarsBlocks.machineT2, 1, 4),
                new Object[] { "TVT", "FWF", "CXO", 'T',
                        new ItemStack(GCItems.oxTankHeavy, 1, GCItems.oxTankHeavy.getMaxDamage()), 'V',
                        GCItems.oxygenVent, 'F', new ItemStack(GCBlocks.oxygenPipe, 1, 0), 'X',
                        new ItemStack(GCItems.basicItem, 1, 10), 'W', new ItemStack(MarsItems.marsItemBasic, 1, 6), 'O',
                        new ItemStack(GCBlocks.oxygenCompressor, 1, 0), 'C',
                        new ItemStack(GCBlocks.machineTiered, 1, 4) });
        // Water Electrolyzer
        RecipeUtil.addRecipe(
                new ItemStack(MarsBlocks.machineT2, 1, 8),
                new Object[] { "TVT", "FWF", "BXB", 'T',
                        new ItemStack(GCItems.oxTankHeavy, 1, GCItems.oxTankHeavy.getMaxDamage()), 'V',
                        GCItems.oxygenVent, 'F', new ItemStack(GCBlocks.oxygenPipe, 1, 0), 'X',
                        new ItemStack(GCItems.basicItem, 1, 10), 'W', new ItemStack(MarsItems.marsItemBasic, 1, 6), 'B',
                        new ItemStack(GCItems.basicItem, 1, 6) });
        // Fluid Manipulator - crafting item
        RecipeUtil.addRecipe(
                new ItemStack(MarsItems.marsItemBasic, 1, 6),
                new Object[] { "MXM", "SWS", "MXM", 'S', Items.slime_ball, 'X', GCItems.oxygenFan, 'M',
                        meteoricIronIngot, 'W', new ItemStack(GCItems.basicItem, 1, 14) });

        RecipeUtil.addRecipe(
                new ItemStack(MarsBlocks.hydrogenPipe, 6, 0),
                new Object[] { "CCC", "   ", "CCC", 'C', "ingotCopper" });

        RecipeUtil.addRecipe(new ItemStack(MarsItems.marsItemBasic, 1, 1), new Object[] { "X", "X", 'X', deshIngot });

        RecipeUtil.addRecipe(
                new ItemStack(MarsItems.marsItemBasic, 1, 4),
                new Object[] { "XWX", "XYX", " Z ", 'W', Items.diamond, 'X', Items.leather, 'Y', Items.slime_ball, 'Z',
                        Blocks.chest });

        RecipeUtil.addRecipe(
                new ItemStack(MarsItems.deshSword),
                new Object[] { "X", "X", "Y", 'X', new ItemStack(MarsItems.marsItemBasic, 1, 2), 'Y',
                        new ItemStack(MarsItems.marsItemBasic, 1, 1) });

        RecipeUtil.addRecipe(
                new ItemStack(MarsItems.deshPickaxe),
                new Object[] { "XXX", " Y ", " Y ", 'X', new ItemStack(MarsItems.marsItemBasic, 1, 2), 'Y',
                        new ItemStack(MarsItems.marsItemBasic, 1, 1) });

        RecipeUtil.addRecipe(
                new ItemStack(MarsItems.deshSpade),
                new Object[] { "X", "Y", "Y", 'X', new ItemStack(MarsItems.marsItemBasic, 1, 2), 'Y',
                        new ItemStack(MarsItems.marsItemBasic, 1, 1) });

        RecipeUtil.addRecipe(
                new ItemStack(MarsItems.deshHoe),
                new Object[] { "XX", "Y ", "Y ", 'X', new ItemStack(MarsItems.marsItemBasic, 1, 2), 'Y',
                        new ItemStack(MarsItems.marsItemBasic, 1, 1) });

        RecipeUtil.addRecipe(
                new ItemStack(MarsItems.deshHoe),
                new Object[] { "XX", " Y", " Y", 'X', new ItemStack(MarsItems.marsItemBasic, 1, 2), 'Y',
                        new ItemStack(MarsItems.marsItemBasic, 1, 1) });

        RecipeUtil.addRecipe(
                new ItemStack(MarsItems.deshAxe),
                new Object[] { "XX", "XY", " Y", 'X', new ItemStack(MarsItems.marsItemBasic, 1, 2), 'Y',
                        new ItemStack(MarsItems.marsItemBasic, 1, 1) });

        RecipeUtil.addRecipe(
                new ItemStack(MarsItems.deshAxe),
                new Object[] { "XX", "YX", "Y ", 'X', new ItemStack(MarsItems.marsItemBasic, 1, 2), 'Y',
                        new ItemStack(MarsItems.marsItemBasic, 1, 1) });

        RecipeUtil.addRecipe(
                new ItemStack(MarsItems.deshHelmet),
                new Object[] { "XXX", "X X", 'X', new ItemStack(MarsItems.marsItemBasic, 1, 2) });

        RecipeUtil.addRecipe(
                new ItemStack(MarsItems.deshChestplate),
                new Object[] { "X X", "XXX", "XXX", 'X', new ItemStack(MarsItems.marsItemBasic, 1, 2) });

        RecipeUtil.addRecipe(
                new ItemStack(MarsItems.deshLeggings),
                new Object[] { "XXX", "X X", "X X", 'X', new ItemStack(MarsItems.marsItemBasic, 1, 2) });

        RecipeUtil.addRecipe(
                new ItemStack(MarsItems.marsItemBasic, 9, 2),
                new Object[] { "X", 'X', new ItemStack(MarsBlocks.marsBlock, 1, 8) });

        // Mars Cobblestone Stairs
        RecipeUtil.addRecipe(
                new ItemStack(MarsBlocks.marsCobblestoneStairs, 4),
                new Object[] { "  X", " XX", "XXX", 'X', new ItemStack(MarsBlocks.marsBlock, 1, 4) });
        RecipeUtil.addRecipe(
                new ItemStack(MarsBlocks.marsCobblestoneStairs, 4),
                new Object[] { "X  ", "XX ", "XXX", 'X', new ItemStack(MarsBlocks.marsBlock, 1, 4) });

        // Mars Dungeon Brick Stairs
        RecipeUtil.addRecipe(
                new ItemStack(MarsBlocks.marsBricksStairs, 4),
                new Object[] { "  X", " XX", "XXX", 'X', new ItemStack(MarsBlocks.marsBlock, 1, 7) });
        RecipeUtil.addRecipe(
                new ItemStack(MarsBlocks.marsBricksStairs, 4),
                new Object[] { "X  ", "XX ", "XXX", 'X', new ItemStack(MarsBlocks.marsBlock, 1, 7) });

        // Slab Block
        RecipeUtil.addRecipe(
                new ItemStack(GCBlocks.slabGCHalf, 6, 4),
                new Object[] { "XXX", 'X', new ItemStack(MarsBlocks.marsBlock, 1, 4) });
        RecipeUtil.addRecipe(
                new ItemStack(GCBlocks.slabGCHalf, 6, 5),
                new Object[] { "XXX", 'X', new ItemStack(MarsBlocks.marsBlock, 1, 7) });

        // Wall Block
        RecipeUtil.addRecipe(
                new ItemStack(GCBlocks.wallGC, 6, 4),
                new Object[] { "XXX", "XXX", 'X', new ItemStack(MarsBlocks.marsBlock, 1, 4) });
        RecipeUtil.addRecipe(
                new ItemStack(GCBlocks.wallGC, 6, 5),
                new Object[] { "XXX", "XXX", 'X', new ItemStack(MarsBlocks.marsBlock, 1, 7) });

        CraftingManager.getInstance()
                .addShapelessRecipe(new ItemStack(MarsItems.carbonFragments, 8, 0), new ItemStack(Items.coal, 1, 0));

        CraftingManager.getInstance()
                .addShapelessRecipe(new ItemStack(MarsItems.carbonFragments, 4, 0), new ItemStack(Items.coal, 1, 1));

        // Smelting
        FurnaceRecipes.smelting().func_151394_a(
                new ItemStack(MarsItems.marsItemBasic, 1, 0),
                new ItemStack(MarsItems.marsItemBasic, 1, 2),
                0.2F);
        FurnaceRecipes.smelting().func_151394_a(
                new ItemStack(MarsBlocks.marsBlock, 1, 4),
                new ItemStack(MarsBlocks.marsBlock, 1, 9),
                0.0F);
        FurnaceRecipes.smelting()
                .func_151394_a(new ItemStack(MarsBlocks.marsBlock, 1, 0), new ItemStack(GCItems.basicItem, 1, 3), 1.0F);
        FurnaceRecipes.smelting()
                .func_151394_a(new ItemStack(MarsBlocks.marsBlock, 1, 1), new ItemStack(GCItems.basicItem, 1, 4), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(
                new ItemStack(MarsBlocks.marsBlock, 1, 2),
                new ItemStack(MarsItems.marsItemBasic, 1, 2),
                0.2F);
        FurnaceRecipes.smelting()
                .func_151394_a(new ItemStack(MarsBlocks.marsBlock, 1, 3), new ItemStack(Items.iron_ingot), 0.2F);

        RecipeUtil.addRecipe(
                new ItemStack(MarsBlocks.machine, 1, BlockMachineMars.LAUNCH_CONTROLLER_METADATA),
                new Object[] { "ZVZ", "YXY", "ZWZ", 'V', new ItemStack(GCItems.basicItem, 1, 19), 'W',
                        new ItemStack(GCBlocks.aluminumWire, 1, 0), 'X', new ItemStack(GCItems.basicItem, 1, 14), 'Y',
                        deshPlate, 'Z', deshIngot });
    }
}
