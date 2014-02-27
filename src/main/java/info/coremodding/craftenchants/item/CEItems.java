/** 
  * Craftable Enchantments
  * CEItems.java
  * //TODO File description
  * @copyright (C) 2014
  * @author Kevin O'Brien (AKA ShooShoSha)
  * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
  */
package info.coremodding.craftenchants.item;

import info.coremodding.craftenchants.item.enchants.SharpeningStone;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CEItems {
    public static Item sharpeningStone;
    
    public static void initialize() {
	createItems();
	registerItems();
	nameItems();
	addRecipes();
    }
    
    public static void createItems() {
	sharpeningStone = new SharpeningStone();
    }
    
    public static void registerItems() {
	GameRegistry.registerItem(sharpeningStone, sharpeningStone.getUnlocalizedName());
    }
    
    public static void nameItems() {
	LanguageRegistry.addName(sharpeningStone, "Sharpening Stone");
    }
    
    public static void addRecipes() {
	GameRegistry.addShapedRecipe(new ItemStack(sharpeningStone), Recipe.sharpeningStone);
    }
}
