/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item.recipes;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

import info.coremodding.craftenchants.item.ItemCE;
import info.coremodding.craftenchants.item.enchants.ReinforcedNock;

public class EnchantsArmor implements IRecipe {
  private ItemCE enchantingItem;
  private ItemStack enchantableArmor;

  /**
   * @see net.minecraft.item.crafting.IRecipe#matches(net.minecraft.inventory.InventoryCrafting,
   *      net.minecraft.world.World)
   */
  @Override
  public boolean matches(InventoryCrafting craftingMatrix, World craftWorld) {
    boolean containsArmor = false;
    boolean containsEnchant = false;
    ItemStack slottedItemStack;
    for (int slot = 0; slot < craftingMatrix.getSizeInventory(); slot++) {
      slottedItemStack = craftingMatrix.getStackInSlot(slot);
      if (slottedItemStack != null) {
        Item slottedItem = slottedItemStack.getItem();
        if (slottedItem instanceof ItemArmor) {
          enchantableArmor = slottedItemStack.copy();
          containsArmor = true;
        }
        if (slottedItem instanceof ReinforcedNock) {
          enchantingItem = (ItemCE) slottedItem;
          containsEnchant = true;
        }
      }
    }

    return containsEnchant && containsArmor;
  }

  /**
   * @see net.minecraft.item.crafting.IRecipe#getCraftingResult(net.minecraft.inventory.InventoryCrafting)
   */
  @Override
  public ItemStack getCraftingResult(InventoryCrafting inventorycrafting) {
    return applyEnchantment();
  }

  private ItemStack applyEnchantment() {
    return shouldEnchant() ? applyEnchant() : null;
  }

  private boolean shouldEnchant() {
    boolean willEnchant = false;
    if (((ItemArmor) (enchantableArmor.getItem())).armorType == 0) {
      if (enchantingItem.getEnchantmentType().equals(Enchantment.respiration))
        willEnchant = true;
    }
    if (((ItemArmor) (enchantableArmor.getItem())).armorType == 1) {
      if (enchantingItem.getEnchantmentType().equals(Enchantment.blastProtection))
        willEnchant = true;
      if (enchantingItem.getEnchantmentType().equals(Enchantment.thorns))
        willEnchant = true;
    }
    if (((ItemArmor) (enchantableArmor.getItem())).armorType == 3) {
      if (enchantingItem.getEnchantmentType().equals(Enchantment.featherFalling))
        willEnchant = true;
    }
    return !enchantableArmor.isItemEnchanted() && willEnchant;
  }

  private ItemStack applyEnchant() {
    enchantableArmor.addEnchantment(enchantingItem.getEnchantmentType(),
        enchantingItem.getEnchantmentLevel());
    return enchantableArmor;
  }

  /**
   * @see net.minecraft.item.crafting.IRecipe#getRecipeSize()
   */
  @Override
  public int getRecipeSize() {
    // TODO Auto-generated method stub
    return 0;
  }

  /**
   * @see net.minecraft.item.crafting.IRecipe#getRecipeOutput()
   */
  @Override
  public ItemStack getRecipeOutput() {
    // TODO Auto-generated method stub
    return null;
  }

}
