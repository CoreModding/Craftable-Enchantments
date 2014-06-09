/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;

import info.coremodding.craftenchants.CraftableEnchantments;
import info.coremodding.craftenchants.item.enchants.Enchants;
import info.coremodding.craftenchants.proxy.Proxy;

public abstract class ItemCE extends Item implements Enchants {
  private Enchantment enchantType;
  private int enchantLevel;

  protected ItemCE(String unlocalName) {
    super();
    setCreativeTab(Proxy.tabMain);
    setUnlocalizedName(unlocalName);
    setTextureName(CraftableEnchantments.ID + ":" + unlocalName);
  }

  public boolean hasEnchantment() {
    return getEnchantmentType() != null && getEnchantmentLevel() > 0;
  }

  protected void setEnchantment(Enchantment type, int level) {
    this.enchantType = type;
    this.enchantLevel = level;
  }

  public Enchantment getEnchantmentType() {
    return this.enchantType;
  }

  public int getEnchantmentLevel() {
    return this.enchantLevel;
  }
}
