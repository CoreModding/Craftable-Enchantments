/**
 * Craftable Enchantments
 * CEItems.java
 * //TODO File description
 * @copyright (C) 2014
 * @author Kevin O'Brien (AKA ShooShoSha)
 * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
 */
package info.coremodding.craftenchants.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

@SuppressWarnings("javadoc")
public class CEItems {
    private static Item sharpeningStone;

    private static void addRecipes() {
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

    private static void createItems() {
        sharpeningStone = new SharpeningStone();
    }

    public static void initialize() {
        createItems();
        registerItems();
        addRecipes();
    }

    private static void registerItems() {
        GameRegistry.registerItem(sharpeningStone,
                sharpeningStone.getUnlocalizedName());
    }
}
