/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.item.recipes;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipesCE {
  public static void initialize() {
    addCraftingRecipes();
  }
  
  private static void addCraftingRecipes() {
    EnchantsItem.addRecipes();
    
    GameRegistry.addRecipe(new EnchantsArmor());
    GameRegistry.addRecipe(new EnchantsBow());
    GameRegistry.addRecipe(new EnchantsSword());
  }
}
