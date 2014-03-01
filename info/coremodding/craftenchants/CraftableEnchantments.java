/** 
 * Craftable Enchantments
 * CraftableEnchantments.java
 * //TODO File description
 * @copyright (C) 2014
 * @author Kevin O'Brien (AKA ShooShoSha)
 * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
 */
package info.coremodding.craftenchants;

import info.coremodding.craftenchants.event.PreInitializer;
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
public class CraftableEnchantments {
	@SuppressWarnings("javadoc")
	@Instance(Reference.MOD_ID)
	public static CraftableEnchantments instance;

	@SuppressWarnings("javadoc")
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;

	@SuppressWarnings({ "javadoc", "static-method", "unused" })
	@EventHandler
	public void preInitialization(FMLPreInitializationEvent preEvent) {
		PreInitializer.handle();
	}
}
