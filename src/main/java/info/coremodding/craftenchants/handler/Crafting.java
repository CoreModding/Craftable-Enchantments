/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.handler;

import info.coremodding.craftenchants.enchants.item.recipes.EnchantArmor;
import info.coremodding.craftenchants.enchants.item.recipes.EnchantBow;
import info.coremodding.craftenchants.enchants.item.recipes.EnchantSword;
import info.coremodding.craftenchants.enchants.item.recipes.VanillaRecipes;

import cpw.mods.fml.common.registry.GameRegistry;

public class Crafting {
    
    public static void initialize() {
        GameRegistry.addRecipe(new EnchantSword());
        GameRegistry.addRecipe(new EnchantBow());
        GameRegistry.addRecipe(new EnchantArmor());
        
        VanillaRecipes.addRecipes();
    }
}