/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.enchants.item.recipes;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

import info.coremodding.craftenchants.enchants.ItemsCE;
import info.coremodding.craftenchants.library.ModRecipes;

public class VanillaRecipes {
  public static void addRecipes() {
    addItemRecipes();
  }

  private static void addItemRecipes() {
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.armorKit), ModRecipes.Items.armorKit);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.blastResistPad),
        ModRecipes.Items.blastResistPad);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.ironCounterweight),
        ModRecipes.Items.ironCounterweight);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.ironStuds), ModRecipes.Items.ironStuds);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.reinforcedNock),
        ModRecipes.Items.reinforcedNock);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.sharpeningStone),
        ModRecipes.Items.sharpeningStone);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.snorkle), ModRecipes.Items.snorkle);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.stoneCounterweight),
        ModRecipes.Items.stoneCounterweight);
    GameRegistry.addShapedRecipe(new ItemStack(ItemsCE.woolPadding), ModRecipes.Items.woolPadding);
  }
}
