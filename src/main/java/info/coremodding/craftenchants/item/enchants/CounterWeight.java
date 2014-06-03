/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.item.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;

import info.coremodding.craftenchants.item.ItemCE;

public class CounterWeight extends ItemCE implements Enchants {
  private Item.ToolMaterial enchantMaterial;
  
  /**
   * Main constructor for Counterweight. Applied to a weapon, attributes Knockback.
   * @param id Unique identifier for the item in the registry
   * @param enchantMaterial Key ingredient the enchantment uses.
   */
  public CounterWeight() {
    super("counterweight");
    setEnchantment(Enchantment.knockback, getMaterialEnchantmentLevel());
  }
  
  public int getMaterialEnchantmentLevel() {
    return this.enchantMaterial.getHarvestLevel();
  }

}
