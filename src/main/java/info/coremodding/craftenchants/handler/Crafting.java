/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.handler;

import info.coremodding.craftenchants.item.recipes.EnchantsArmor;
import info.coremodding.craftenchants.item.recipes.EnchantsBow;
import info.coremodding.craftenchants.item.recipes.EnchantsSword;
import info.coremodding.craftenchants.item.recipes.EnchantsItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class Crafting {
    
    public static void initialize() {
        GameRegistry.addRecipe(new EnchantsSword());
        GameRegistry.addRecipe(new EnchantsBow());
        GameRegistry.addRecipe(new EnchantsArmor());
        
        EnchantsItem.addRecipes();
    }
}