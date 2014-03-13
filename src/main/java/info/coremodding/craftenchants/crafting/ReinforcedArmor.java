/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.crafting;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

import info.coremodding.craftenchants.item.enchants.ArmorKit;

public class ReinforcedArmor implements IRecipe {
    private int armorSlotNumber;

    /**
     * 
     */
    public ReinforcedArmor() {
        // TODO Implement constructor ReinforcedArmor
    }

    /**
     * @see net.minecraft.item.crafting.IRecipe#matches(net.minecraft.inventory.InventoryCrafting, net.minecraft.world.World)
     */
    @Override
    public boolean matches(InventoryCrafting craftingMatrix, World craftWorld) {
        // TODO Implement method matches
        ItemStack slottedItemStack;
        int numberOfArmor = 0;
        int numberOfEnchants = 0;
        
        for(int slot = 0; slot < craftingMatrix.getSizeInventory(); slot++) {
            slottedItemStack = craftingMatrix.getStackInSlot(slot);
            if (slottedItemStack != null) {
                if (slottedItemStack.getItem() instanceof ItemArmor) {
                    numberOfArmor++;
                    armorSlotNumber = slot;
                }
                if (slottedItemStack.getItem() instanceof ArmorKit) {
                    numberOfEnchants++;
                }
            }
        }
        return numberOfEnchants == 1 && numberOfArmor == 1;
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
