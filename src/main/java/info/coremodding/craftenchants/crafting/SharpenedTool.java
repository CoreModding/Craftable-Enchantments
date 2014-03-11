/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.crafting;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

import info.coremodding.craftenchants.item.enchants.SharpeningStone;

public class SharpenedTool implements IRecipe {
    private int toolSlotNumber;
    /**
     * 
     */
    public SharpenedTool() {
        // TODO Implement constructor SharpenedTool
    }

    /* (non-Javadoc)
     * @see net.minecraft.item.crafting.IRecipe#matches(net.minecraft.inventory.InventoryCrafting, net.minecraft.world.World)
     */
    @Override
    public boolean matches(InventoryCrafting craftingMatrix, World craftWorld) {
        ItemStack slottedItemStack;
        int numberOfTools = 0;
        int numberOfEnchants = 0;
        for(int slot = 0; slot < craftingMatrix.getSizeInventory(); slot++) {
            slottedItemStack = craftingMatrix.getStackInSlot(slot);
            if (slottedItemStack != null) {
                if (slottedItemStack.getItem() instanceof ItemTool) {
                    numberOfTools++;
                    toolSlotNumber = slot;
                }
                if (slottedItemStack.getItem() instanceof SharpeningStone) {
                    numberOfEnchants++;
                }
            }
        }
        return  numberOfTools == 1 && numberOfEnchants == 1;
    }

    /* (non-Javadoc)
     * @see net.minecraft.item.crafting.IRecipe#getCraftingResult(net.minecraft.inventory.InventoryCrafting)
     */
    @Override
    public ItemStack getCraftingResult(InventoryCrafting craftingMatrix) {
        ItemStack sharpenedTool = craftingMatrix.getStackInSlot(toolSlotNumber);
        sharpenedTool.addEnchantment(Enchantment.sharpness, 1);
        return sharpenedTool;
    }

    /* (non-Javadoc)
     * @see net.minecraft.item.crafting.IRecipe#getRecipeSize()
     */
    @Override
    public int getRecipeSize() {
        return 1;
    }

    /* (non-Javadoc)
     * @see net.minecraft.item.crafting.IRecipe#getRecipeOutput()
     */
    @Override
    public ItemStack getRecipeOutput() {
        // TODO Implement method getRecipeOutput
        return null;
    }

}
