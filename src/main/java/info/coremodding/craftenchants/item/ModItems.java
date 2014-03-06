/** 
  * Craftable Enchantments
  * CEItems.java
  * //TODO File description
  * @copyright (C) 2014
  * @author Kevin O'Brien (AKA ShooShoSha)
  * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
  */
package info.coremodding.craftenchants.item;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

import info.coremodding.craftenchants.item.enchants.ArmorKit;
import info.coremodding.craftenchants.item.enchants.BlastResistPad;
import info.coremodding.craftenchants.item.enchants.IronCounterweight;
import info.coremodding.craftenchants.item.enchants.IronStuds;
import info.coremodding.craftenchants.item.enchants.ReinforcedNock;
import info.coremodding.craftenchants.item.enchants.SharpeningStone;
import info.coremodding.craftenchants.item.enchants.Snorkle;
import info.coremodding.craftenchants.item.enchants.StoneCounterweight;
import info.coremodding.craftenchants.item.enchants.WoolPadding;

public class ModItems {
    //Collection of all items
    public static Set<ItemCE> items = new HashSet<>();
    //Instances of all items
    public static ItemCE armorKit;
    public static ItemCE blastResistPad;
    public static ItemCE ironCounterweight;
    public static ItemCE ironStuds;
    public static ItemCE reinforcedNock;
    public static ItemCE sharpeningStone;
    public static ItemCE snorkle;
    public static ItemCE stoneCounterweight;
    public static ItemCE woolPadding;
    
    //Map items to recipes
    public static Map<ItemCE, Object[]> recipeOutput = new TreeMap<>();
    
    public static void initialize() {
	createItems();
	registerItems();
	addRecipes();
    }
    
    private static void createItems() {
	items.add(armorKit = new ArmorKit(ModIDs.Items.Default.armorKit));
	items.add(blastResistPad = new BlastResistPad(ModIDs.Items.Default.blastResistPad));
	items.add(ironCounterweight = new IronCounterweight(ModIDs.Items.Default.ironCounterweight));
	items.add(ironStuds = new IronStuds(ModIDs.Items.Default.ironStuds));
	items.add(reinforcedNock = new ReinforcedNock(ModIDs.Items.Default.reinforcedNock));
	items.add(sharpeningStone = new SharpeningStone(ModIDs.Items.Default.sharpeningStone));
	items.add(snorkle = new Snorkle(ModIDs.Items.Default.snorkle));
	items.add(stoneCounterweight = new StoneCounterweight(ModIDs.Items.Default.stoneCounterweight));
	items.add(woolPadding = new WoolPadding(ModIDs.Items.Default.woolPadding));
    }
    
    private static void registerItems() {
	for(ItemCE item : items) {
	    GameRegistry.registerItem(item, item.getUnlocalizedName());
	}
    }
    
    private static void addRecipes() {
	GameRegistry.addShapedRecipe(new ItemStack(sharpeningStone), ModRecipes.Items.sharpeningStone);
    }
    
}
