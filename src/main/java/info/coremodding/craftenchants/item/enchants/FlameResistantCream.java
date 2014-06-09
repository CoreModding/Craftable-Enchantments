/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item.enchants;

import net.minecraft.enchantment.Enchantment;

import info.coremodding.craftenchants.item.ItemCE;


public class FlameResistantCream extends ItemCE {

  public FlameResistantCream(int id) {
    super(id, "flameresistantcream");
    setEnchantment(Enchantment.fireProtection, 2);
  }

}
