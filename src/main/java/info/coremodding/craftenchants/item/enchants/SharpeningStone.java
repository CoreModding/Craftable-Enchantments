package info.coremodding.craftenchants.item.enchants;

import info.coremodding.craftenchants.proxy.CommonProxy;
import net.minecraft.item.Item;

/**
 * The sharpening stone item class.
 */
public class SharpeningStone extends Item
{
    
    /**
     * The main constructor.
     */
    public SharpeningStone()
    {
        super(25650);//TODO Implement proper ID handling.
        setUnlocalizedName("SharpeningStone");
        setCreativeTab(CommonProxy.tab);
    }
}
