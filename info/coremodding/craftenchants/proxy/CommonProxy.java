/** 
 * Craftable Enchantments
 * CommonProxy.java
 * //TODO File description
 * @copyright (C) 2014
 * @author Kevin O'Brien (AKA ShooShoSha)
 * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
 */
package info.coremodding.craftenchants.proxy;

import net.minecraft.creativetab.CreativeTabs;

import info.coremodding.craftenchants.library.CECreativeTab;
import info.coremodding.craftenchants.library.Reference;


/**
 * The mod common proxy
 */
public class CommonProxy {
	
    /**
     * The mod creative tab
     */
    public static CreativeTabs tab = new CECreativeTab(Reference.MOD_ID);
}
