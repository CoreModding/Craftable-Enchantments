/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class CEItems {
    public static Item sharpeningStone;
    
    public static void initialize() {
	createItems();
	registerItems();
	addRecipes();
    }
    
    public static void createItems() {
	sharpeningStone = new SharpeningStone();
    }
    
    public static void registerItems() {
	GameRegistry.registerItem(sharpeningStone, sharpeningStone.getUnlocalizedName());
    }
    
    public static void addRecipes() {
	GameRegistry.addRecipe(Items.enchanted_book.getEnchantedItemStack(new EnchantmentData(Enchantment.sharpness, 1)),
		CEItemRecipe.sharpeningStone);
	GameRegistry.addRecipe(Items.enchanted_book.getEnchantedItemStack(new EnchantmentData(Enchantment.protection, 2)),
		CEItemRecipe.armorKit);
	GameRegistry.addRecipe(Items.enchanted_book.getEnchantedItemStack(new EnchantmentData(Enchantment.featherFalling, 2)),
		CEItemRecipe.woolPadding);
    }
}
