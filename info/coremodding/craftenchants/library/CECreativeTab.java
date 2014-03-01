/** 
  * Craftable Enchantments
  * CECreativeTab.java
  * //TODO File description
  * @copyright (C) 2014
  * @author Kevin O'Brien (AKA ShooShoSha)
  * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
  */
package info.coremodding.craftenchants.library;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CECreativeTab extends CreativeTabs {
    /**
     * @param lable
     */
    public CECreativeTab(String tabLabel) {
	super(tabLabel);
    }

    @Override
    public Item getTabIconItem() {
	return Item.getItemFromBlock(Blocks.anvil);
    }

}
