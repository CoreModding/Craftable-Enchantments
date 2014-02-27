/** 
  * Craftable Enchantments
  * SharpeningStone.java
  * //TODO File description
  * @copyright (C) 2014
  * @author Kevin O'Brien (AKA ShooShoSha)
  * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
  */
package info.coremodding.craftenchants.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import info.coremodding.craftenchants.proxy.CommonProxy;

public class SharpeningStone extends Item {
    public SharpeningStone() {
	super(2000);
	setUnlocalizedName("sharpeningstone");
	setCreativeTab(CommonProxy.tab);
    }
    
    public void registerIcons(IconRegister reg) {
	if (itemID == CEItems.sharpeningStone.itemID) {
	    this.itemIcon = reg.registerIcon(getUnlocalizedName());
	}
    }
}
