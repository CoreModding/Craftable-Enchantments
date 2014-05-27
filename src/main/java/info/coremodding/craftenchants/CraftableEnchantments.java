/** 
 * Craftable Enchantments
 * CraftableEnchantments.java
 * //TODO File description
 * @copyright (C) 2014
 * @author Kevin O'Brien (AKA ShooShoSha)
 * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
 */
package info.coremodding.craftenchants;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import info.coremodding.craftenchants.event.PreInitializer;
import info.coremodding.craftenchants.library.Reference;
import info.coremodding.craftenchants.proxy.Proxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME)
public class CraftableEnchantments {
    @Instance(Reference.MOD_ID)
    public static CraftableEnchantments instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static Proxy proxy;
    
    
    @EventHandler
    public void preInitialization(FMLPreInitializationEvent preEvent) {
        PreInitializer.handle(preEvent);
    }
}
