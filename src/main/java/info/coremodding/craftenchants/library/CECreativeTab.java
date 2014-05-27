/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.library;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CECreativeTab extends CreativeTabs {
    private static final CECreativeTab mainTab = new CECreativeTab(Reference.MOD_ID);
    
    /**
     * @param tabLabel is the unlocalized name of the tab
     */
    private CECreativeTab(String tabLabel) {
        super(CreativeTabs.getNextID(), tabLabel);
    }
    
    /* Accessor methods for tabs */
    public static CECreativeTab getMainTab() {
        return mainTab;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return Item.getItemFromBlock(Blocks.anvil);
    }

}
