/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.crafting;

import info.coremodding.craftenchants.enchants.item.ItemCE;
import info.coremodding.craftenchants.enchants.item.SharpeningStone;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class EnchantSword implements IRecipe {
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
				if (slottedItem instanceof SharpeningStone) {
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
			enchantableItem.addEnchantment(enchantingItem.getEnchantType(), enchantingItem.getEnchantLevel());
		return enchantableItem;
	}

	@Override
	public int getRecipeSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemStack getRecipeOutput() {
		// TODO Auto-generated method stub
		return null;
	}
}