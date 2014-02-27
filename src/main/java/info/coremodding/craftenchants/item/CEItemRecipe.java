/** 
  * Craftable Enchantments
  * CEItemRecipe.java
  * //TODO File description
  * @copyright (C) 2014
  * @author Kevin O'Brien (AKA ShooShoSha)
  * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
  */
package info.coremodding.craftenchants.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CEItemRecipe {
    public static final Object[] sharpeningStone = new Object[] {
	"FFF",
	"FSF",
	"FFF",
	'F', new ItemStack(Item.flint),
	'S', new ItemStack(Block.stone)
    };
    
    public static final Object[] armorKit = new Object[] {
	"LLL", 
	"LWL", 
	"LLL",
	'L', new ItemStack(Item.leather, 1),
	'W', Block.cloth
    };
    
    public static final Object[] woolPadding = new Object[] {
	"   ",
	"WRW",
	"WRW",
	'W', Block.cloth,
	'R', new ItemStack(Item.silk)
    };
    
    public static final Object[] ironStuds = new Object[] {
	"   ",
	"I I",
	"L L",
	'I', new ItemStack(Item.ingotIron),
	'L', new ItemStack(Item.leather)
    };
    
    public static final Object[] stoneCounterweight = new Object[] {
	"WWW",
	"WSW",
	"WWW",
	'W', Block.cloth,
	'S', Block.stone
    };
    
    public static final Object[] ironCounterweight = new Object[] {
	"WWW",
	"WIW",
	"WWW",
	'W', Block.cloth,
	'I', Block.blockIron
    };
    
    public static final Object[] blastResistPad = new Object[] {
	"III",
	"ISI",
	"III",
	'I', new ItemStack(Item.ingotIron),
	'S', Block.stone
    };
    
    public static final Object[] snorkle = new Object[] {
	"GGS",
	"GGG",
	"III",
	'G', Block.glass,
	'S', new ItemStack(Item.reed),
	'I', new ItemStack(Item.ingotIron)
    };
    
    public static final Object[] reinforcedNock = new Object[] {
	"H  ",
	" H ",
	"  H",
	'H', Item.melon
    };
}
