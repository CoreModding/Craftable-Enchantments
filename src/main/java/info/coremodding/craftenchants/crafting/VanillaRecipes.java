/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.crafting;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

import info.coremodding.craftenchants.enchants.Enchants;
import info.coremodding.craftenchants.library.ModRecipes;

public class VanillaRecipes {
    public static void addRecipes() {
        addItemRecipes();
    }
    
    private static void addItemRecipes() {
        GameRegistry.addShapedRecipe(new ItemStack(Enchants.Items.armorKit), ModRecipes.Items.armorKit);
        GameRegistry.addShapedRecipe(new ItemStack(Enchants.Items.blastResistPad), ModRecipes.Items.blastResistPad);
        GameRegistry.addShapedRecipe(new ItemStack(Enchants.Items.ironCounterweight), ModRecipes.Items.ironCounterweight);
        GameRegistry.addShapedRecipe(new ItemStack(Enchants.Items.ironStuds), ModRecipes.Items.ironStuds);
        GameRegistry.addShapedRecipe(new ItemStack(Enchants.Items.reinforcedNock), ModRecipes.Items.reinforcedNock);
        GameRegistry.addShapedRecipe(new ItemStack(Enchants.Items.sharpeningStone), ModRecipes.Items.sharpeningStone);
        GameRegistry.addShapedRecipe(new ItemStack(Enchants.Items.snorkle), ModRecipes.Items.snorkle);
        GameRegistry.addShapedRecipe(new ItemStack(Enchants.Items.stoneCounterweight), ModRecipes.Items.stoneCounterweight);
        GameRegistry.addShapedRecipe(new ItemStack(Enchants.Items.woolPadding), ModRecipes.Items.woolPadding);
    }
}
