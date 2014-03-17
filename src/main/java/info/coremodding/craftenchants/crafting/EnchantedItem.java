/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.crafting;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import info.coremodding.craftenchants.item.ItemCE;

public class EnchantedItem implements IRecipe {
    private ItemStack enchantableItem;
    private ItemCE enchantingItem;
    private Enchantment enchantType;
    private int enchantLevel;
    private boolean containsSword = false;
    private boolean containsArmor = false;
    private boolean containsBow = false;
    private boolean containsEnchant = false;
    
    /**
     * @see net.minecraft.item.crafting.IRecipe#matches(net.minecraft.inventory.InventoryCrafting, net.minecraft.world.World)
     */
    @Override
    public boolean matches(InventoryCrafting craftingMatrix, World craftingWorld) {
        ItemStack slottedItemStack;
        
        
        for (int slot = 0; slot < craftingMatrix.getSizeInventory(); slot++) {
            slottedItemStack = craftingMatrix.getStackInSlot(slot);
            if (slottedItemStack != null) {
                Item itemInSlot = slottedItemStack.getItem();
                if (itemInSlot instanceof ItemSword) {
                	containsSword = true;
                	enchantableItem = slottedItemStack.copy();
                }
                if (itemInSlot instanceof ItemArmor) {
                	containsArmor = true;
                	enchantableItem = slottedItemStack.copy();
                }
                if (itemInSlot instanceof ItemBow) {
                	containsBow = true;
                	enchantableItem = slottedItemStack.copy();
                }
                if (itemInSlot instanceof ItemCE) {
                	containsEnchant = true;
                	enchantingItem = (ItemCE)slottedItemStack.getItem();
                }
            }
        }
        return containsEnchant && (containsSword || containsArmor || containsBow);
    }

    /**
     * @see net.minecraft.item.crafting.IRecipe#getCraftingResult(net.minecraft.inventory.InventoryCrafting)
     */
    @Override
    public ItemStack getCraftingResult(InventoryCrafting inventorycrafting) {
        return applyEnchantment();
    }

	/**
     * @see net.minecraft.item.crafting.IRecipe#getRecipeSize()
     */
    @Override
    public int getRecipeSize() {
        // TODO Implement method getRecipeSize
        return 0;
    }

    /**
     * @see net.minecraft.item.crafting.IRecipe#getRecipeOutput()
     */
    @Override
    public ItemStack getRecipeOutput() { 
        // TODO Implement method getRecipeOutput
        return null;
    }
    
    private ItemStack applyEnchantment() {
    	if (enchantableItem.isItemEnchanted()) {
    		enchantableItem = null;
    	} else {
    		enchantType = enchantingItem.getEnchantType();
    		enchantLevel = enchantingItem.getEnchantLevel();
    		enchantableItem.addEnchantment(enchantType, enchantLevel);
    		containsArmor = containsBow = containsSword = containsEnchant = false;
    	}
    	return enchantableItem;
    }

}