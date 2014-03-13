/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.crafting;

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
    private int enchantableItemSlot;
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
                containsSword = itemInSlot instanceof ItemSword;
                containsArmor = itemInSlot instanceof ItemArmor;
                containsBow = itemInSlot instanceof ItemBow;
                containsEnchant = itemInSlot instanceof ItemCE;
            }
        }
        return false;
    }

    /**
     * @see net.minecraft.item.crafting.IRecipe#getCraftingResult(net.minecraft.inventory.InventoryCrafting)
     */
    @Override
    public ItemStack getCraftingResult(InventoryCrafting inventorycrafting) {
        // TODO Implement method getCraftingResult
        return null;
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

}
