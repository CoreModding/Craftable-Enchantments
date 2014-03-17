/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.crafting;

import info.coremodding.craftenchants.item.ItemCE;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class EnchantArmor implements IRecipe {
	private ItemCE enchantingItem;
	private ItemStack enchantableArmor;
	/* (non-Javadoc)
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
			}
		}
		
		return containsEnchant && containsArmor;
	}

	/* (non-Javadoc)
	 * @see net.minecraft.item.crafting.IRecipe#getCraftingResult(net.minecraft.inventory.InventoryCrafting)
	 */
	@Override
	public ItemStack getCraftingResult(InventoryCrafting inventorycrafting) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see net.minecraft.item.crafting.IRecipe#getRecipeSize()
	 */
	@Override
	public int getRecipeSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see net.minecraft.item.crafting.IRecipe#getRecipeOutput()
	 */
	@Override
	public ItemStack getRecipeOutput() {
		// TODO Auto-generated method stub
		return null;
	}

}
