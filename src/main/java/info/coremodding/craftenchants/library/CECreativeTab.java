/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.library;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

/**
 * The mod creative tab.
 */
public class CECreativeTab extends CreativeTabs
{
    
    /**
     * The class constructor
     * @param tabLabel Denotes the name to give the tab. It is defined by itemGroup.craftenchants in the lang file.
     */
    public CECreativeTab(String tabLabel) {
		super(CreativeTabs.getNextID(),tabLabel);
    }
    
    @Override
    public int getTabIconItemIndex() {
        return Block.anvil.blockID;
    }
}
