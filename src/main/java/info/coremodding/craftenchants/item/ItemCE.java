/** 
  * Craftable-Enchantments
  * ItemCE.java
  * //TODO File description
  * @copyright (C) 2014
  * @author Kevin O'Brien (AKA ShooShoSha)
  * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
  */
package info.coremodding.craftenchants.item;

import net.minecraft.item.Item;

import info.coremodding.craftenchants.library.Reference;
import info.coremodding.craftenchants.proxy.CommonProxy;

public class ItemCE extends Item {
    protected String unlocalName;
    
    public ItemCE(int id) {
	super(id);
	setCreativeTab(CommonProxy.tab);
	setUnlocalizedName(unlocalName);
    }
    public void setName(String unlocalName) {
	setUnlocalizedName(Reference.MOD_ID + ":" + unlocalName);
    }

}
