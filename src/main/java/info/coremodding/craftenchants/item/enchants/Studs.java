/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;

import info.coremodding.craftenchants.item.ItemCE;

public class Studs extends ItemCE implements Enchants {
  private Item.ToolMaterial enchantMaterial;
  
  public Studs(Item.ToolMaterial enchantMaterial) {
    super(enchantMaterial.toString().toLowerCase() + "studs");
    this.enchantMaterial = enchantMaterial;
    setEnchantment(Enchantment.thorns, getMaterialEnchantmentLevel());
  }
  
  public int getMaterialEnchantmentLevel() {
    return this.enchantMaterial.getHarvestLevel();
  }
}
