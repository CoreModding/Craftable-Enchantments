package info.coremodding.craftenchants.library;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

/**
 * The mod creative tab
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
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(Blocks.anvil);
    }
}
