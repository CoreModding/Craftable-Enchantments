/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item.enchants;

import net.minecraft.enchantment.Enchantment;

import info.coremodding.craftenchants.item.ItemCE;

public class WoolPadding extends ItemCE implements Enchants {
  public WoolPadding() {
    super("woolpadding");
    setEnchantment(Enchantment.featherFalling, 2);
  }

}
