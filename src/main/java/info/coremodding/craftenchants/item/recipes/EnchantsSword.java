/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.item.recipes;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

import info.coremodding.craftenchants.item.ItemCE;
import info.coremodding.craftenchants.item.enchants.FireOil;
import info.coremodding.craftenchants.item.enchants.SharpeningStone;

public class EnchantsSword implements IRecipe {
  private ItemCE enchantingItem;
  private ItemStack enchantableItem;
  
  @Override
  public boolean matches(InventoryCrafting craftingMatrix, World craftWorld) {
      boolean containsSword = false;
      boolean containsEnchant = false;
      ItemStack slottedItemStack;
      for (int slot = 0; slot < craftingMatrix.getSizeInventory(); slot++) {
          slottedItemStack = craftingMatrix.getStackInSlot(slot);
          if (slottedItemStack != null) {
              Item slottedItem = slottedItemStack.getItem();
              if (slottedItem instanceof ItemSword) {
                  enchantableItem = slottedItemStack.copy();
                  containsSword = true;
              }
              if (slottedItem instanceof SharpeningStone || slottedItem instanceof FireOil) {
                  enchantingItem = (ItemCE)slottedItem;
                  containsEnchant = true;
              }
          }
      }
      return containsEnchant && containsSword;
  }

  @Override
  public ItemStack getCraftingResult(InventoryCrafting inventorycrafting) {
      return applyEnchantment();
  }

  private ItemStack applyEnchantment() {
      if (!enchantableItem.isItemEnchanted())
          enchantableItem.addEnchantment(enchantingItem.getEnchantmentType(), enchantingItem.getEnchantmentLevel());
      return enchantableItem;
  }

  @Override
  public int getRecipeSize() {
      return 0;
  }

  @Override
  public ItemStack getRecipeOutput() {
      return null;
  }

}
