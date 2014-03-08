package info.coremodding.craftenchants.item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Craftable enchantment items
 */
public class CEItems
{
    
    private static Item sharpeningStone;
    
    private static void addRecipes()
    {
        GameRegistry.addRecipe(Items.enchanted_book
                .getEnchantedItemStack(new EnchantmentData(
                        Enchantment.sharpness, 1)),
                CEItemRecipe.sharpeningStone);
        GameRegistry.addRecipe(Items.enchanted_book
                .getEnchantedItemStack(new EnchantmentData(
                        Enchantment.protection, 2)), CEItemRecipe.armorKit);
        GameRegistry.addRecipe(Items.enchanted_book
                .getEnchantedItemStack(new EnchantmentData(
                        Enchantment.featherFalling, 2)),
                CEItemRecipe.woolPadding);
    }
    
    private static void createItems()
    {
        sharpeningStone = new SharpeningStone();
    }
    
    /**
     * Initializes stuff
     */
    public static void initialize()
    {
        createItems();
        registerItems();
        addRecipes();
    }
    
    private static void registerItems()
    {
        GameRegistry.registerItem(sharpeningStone,
                sharpeningStone.getUnlocalizedName());
    }
}
