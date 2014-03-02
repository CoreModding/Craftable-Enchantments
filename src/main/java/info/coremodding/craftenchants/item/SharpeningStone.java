/**
 * Craftable Enchantments
 * SharpeningStone.java
 * //TODO File description
 * @copyright (C) 2014
 * @author Kevin O'Brien (AKA ShooShoSha)
 * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
 */
package info.coremodding.craftenchants.item;

import info.coremodding.craftenchants.proxy.CommonProxy;
import net.minecraft.item.Item;

/**
 * The sharpening stone item class
 */
class SharpeningStone extends Item {
    /**
     * The main constructor
     */
    public SharpeningStone() {
        super();
        setUnlocalizedName("SharpeningStone");
        setCreativeTab(CommonProxy.tab);
    }
}
