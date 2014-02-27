/** 
  * Craftable-Enchantments
  * ModItem.java
  * //TODO File description
  * @copyright (C) 2014
  * @author Kevin O'Brien (AKA ShooShoSha)
  * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
  */
package info.coremodding.craftenchants.item;

import info.coremodding.craftenchants.proxy.CommonProxy;

import net.minecraft.item.Item;

public abstract class ModItem extends Item {
    protected String unlocalName;
    
    public ModItem(int id) {
	super(id);
	setCreativeTab(CommonProxy.tab);
	setUnlocalizedName(unlocalName);
    }

}
