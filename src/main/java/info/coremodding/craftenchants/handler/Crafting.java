/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import cpw.mods.fml.common.ICraftingHandler;
import cpw.mods.fml.common.registry.GameRegistry;

import info.coremodding.craftenchants.crafting.SharpenedTool;
import info.coremodding.craftenchants.crafting.VanillaRecipes;

public class Crafting implements ICraftingHandler {
    
    @SuppressWarnings("unchecked")
    public static void initialize() {
        GameRegistry.registerCraftingHandler(new Crafting());
        
        CraftingManager.getInstance().getRecipeList().add(new SharpenedTool());
        
        VanillaRecipes.addRecipes();
    }

    /**
     * @see cpw.mods.fml.common.ICraftingHandler#onCrafting(net.minecraft.entity.player.EntityPlayer, net.minecraft.item.ItemStack, net.minecraft.inventory.IInventory)
     */
    @Override
    public void onCrafting(EntityPlayer player, ItemStack item, IInventory craftMatrix) {
        if (player.worldObj.isRemote) {
            System.out.println();
        }
    }

    /**
     * @see cpw.mods.fml.common.ICraftingHandler#onSmelting(net.minecraft.entity.player.EntityPlayer, net.minecraft.item.ItemStack)
     */
    @Override
    public void onSmelting(EntityPlayer player, ItemStack item) {

    }

}
