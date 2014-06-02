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

public class CreativeTabsCE extends CreativeTabs {
    private static final CreativeTabsCE mainTab = new CreativeTabsCE(Reference.MOD_ID);
    
    /**
     * @param tabLabel is the unlocalized name of the tab
     */
    private CreativeTabsCE(String tabLabel) {
        super(CreativeTabs.getNextID(), tabLabel);
    }
    
    /* Accessor methods for tabs */
    public static CreativeTabsCE getMainTab() {
        return mainTab;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return Item.getItemFromBlock(Blocks.anvil);
    }

}
