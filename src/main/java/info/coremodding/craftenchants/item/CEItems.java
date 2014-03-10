package info.coremodding.craftenchants.item;

import info.coremodding.craftenchants.item.enchants.SharpeningStone;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Craftable enchantment items that may be made in the Craftable Enchantments mod. This class keeps references to all
 * items used in the game as well as initializes each item through construction and registration. Once initialization
 * executes, each item may be used as a reference.
 */
public class CEItems
{
    /**
     * Listing of all items used in this mod.
     */
    private static Item sharpeningStone;
    
    /**
     * Registers the recipes to the game.
     * @see CEItemRecipe
     */
    private static void addRecipes()
    {
        //TODO Add recipes.
    }
    
    /**
     * Constructs the items in game.
     */
    private static void createItems()
    {
        sharpeningStone = new SharpeningStone();
    }
    
    /**
     * Initializes the items through construction and registration.
     */
    public static void initialize()
    {
        createItems();
        registerItems();
        addRecipes();
    }
    
    /**
     * Adds constructed objects to the game registry for use.
     */
    private static void registerItems()
    {
        GameRegistry.registerItem(sharpeningStone,
                sharpeningStone.getUnlocalizedName());
    }
}
