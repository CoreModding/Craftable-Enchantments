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
     */
    public CECreativeTab()
    {
        super(Reference.MOD_ID);
    }
    
    @Override
    public int getTabIconItemIndex() {
        return Block.anvil.blockID;
    }
}
