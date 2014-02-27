/** 
  * Craftable Enchantments
  * CECreativeTab.java
  * //TODO File description
  * @copyright (C) 2014
  * @author Kevin O'Brien (AKA ShooShoSha)
  * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
  */
package info.coremodding.craftenchants.library;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class CECreativeTab extends CreativeTabs {
    /**
     * @param lable
     */
    public CECreativeTab(String tabLabel) {
	super(CreativeTabs.getNextID(),tabLabel);
    }
    
    @Override
    public int getTabIconItemIndex() {
        return Block.anvil.blockID;
    }

}
