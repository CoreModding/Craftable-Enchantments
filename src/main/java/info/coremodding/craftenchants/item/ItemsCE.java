/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item;

import java.util.HashSet;
import java.util.Set;

import cpw.mods.fml.common.registry.GameRegistry;

import info.coremodding.craftenchants.item.components.HorseHair;
import info.coremodding.craftenchants.item.enchants.SharpeningStone;
import info.coremodding.craftenchants.item.recipes.EnchantsItem;

public class ItemsCE {
  public static Set<ItemCE> items = new HashSet<>();

  public static ItemCE horseHair;
  public static ItemCE sharpeningStone;

  public static void initialize() {
    createItems();
    registerItems();
    EnchantsItem.addRecipes();
  }

  public static void createItems() {
    items.add(horseHair = new HorseHair());
    items.add(sharpeningStone = new SharpeningStone());
  }

  public static void registerItems() {
    for (ItemCE item : items) {
      GameRegistry.registerItem(item, item.getUnlocalizedName());
    }
  }
}
