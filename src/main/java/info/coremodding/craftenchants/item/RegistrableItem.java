/**
 * Craftable Enchantments
 * RegistrableItem.java
 * //TODO File description
 * @copyright (C) 2014
 * @author Kevin O'Brien (AKA ShooShoSha)
 * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
 */
package info.coremodding.craftenchants.item;

import net.minecraft.creativetab.CreativeTabs;

@SuppressWarnings("javadoc")
public interface RegistrableItem {
    void addRecipe();

    void addToGame();

    void setName(String unlocalName);

    void setTab(CreativeTabs tab);

    void setTexture();
}
