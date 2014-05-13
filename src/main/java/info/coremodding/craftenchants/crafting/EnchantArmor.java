/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.crafting;

import info.coremodding.craftenchants.enchants.item.ItemCE;
import info.coremodding.craftenchants.enchants.item.ReinforcedNock;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class EnchantArmor implements IRecipe {
	private ItemCE enchantingItem;
	private ItemStack enchantableArmor;
	
	/**
	 * @see net.minecraft.item.crafting.IRecipe#matches(net.minecraft.inventory.InventoryCrafting, net.minecraft.world.World)
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
					enchantingItem = (ItemCE)slottedItem;
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
		if (((ItemArmor)(enchantableArmor.getItem())).armorType == 0) {
			if (enchantingItem.getEnchantType().equals(Enchantment.respiration)) willEnchant = true;
		}
		if (((ItemArmor)(enchantableArmor.getItem())).armorType == 1) {
			if (enchantingItem.getEnchantType().equals(Enchantment.blastProtection)) willEnchant = true;
			if (enchantingItem.getEnchantType().equals(Enchantment.thorns)) willEnchant = true;
		}
		if (((ItemArmor)(enchantableArmor.getItem())).armorType == 3) {
			if (enchantingItem.getEnchantType().equals(Enchantment.featherFalling)) willEnchant = true;
		}
		return !enchantableArmor.isItemEnchanted() && willEnchant;
	}
	
	private ItemStack applyEnchant() {
		enchantableArmor.addEnchantment(enchantingItem.getEnchantType(), enchantingItem.getEnchantLevel());
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
