package info.coremodding.craftenchants;

import info.coremodding.craftenchants.item.CEItems;
import info.coremodding.craftenchants.library.Reference;
import info.coremodding.craftenchants.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * The main mod class
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME)
public class CraftableEnchantments
{
    
    /**
     * The instance of the class forge uses
     */
    @Instance(Reference.MOD_ID)
    public static CraftableEnchantments instance;
    
    /**
     * Forge's instance of the mod proxy
     */
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy           proxy;
    
    /**
     * @param preEvent
     *            The event that triggered the method
     */
    @SuppressWarnings("static-method")
    @EventHandler
    public void preInitialization(FMLPreInitializationEvent preEvent)
    {
        CEItems.initialize();
    }
}
