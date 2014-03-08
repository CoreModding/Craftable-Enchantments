package info.coremodding.craftenchants.item;

import info.coremodding.craftenchants.proxy.CommonProxy;
import net.minecraft.item.Item;

/**
 * The sharpening stone item class
 */
class SharpeningStone extends Item
{
    
    /**
     * The main constructor
     */
    public SharpeningStone()
    {
        super();
        setUnlocalizedName("SharpeningStone");
        setCreativeTab(CommonProxy.tab);
    }
}
