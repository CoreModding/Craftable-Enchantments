/**
 * Craftable Enchantments
 * PreInitializer.java
 * //TODO File description
 * @copyright (C) 2014
 * @author Kevin O'Brien (AKA ShooShoSha)
 * @license <a href="http://www.gnu.org/licenses/">GNU Lesser General Public License</a>
 */
package info.coremodding.craftenchants.event;

import info.coremodding.craftenchants.item.CEItems;

@SuppressWarnings("javadoc")
public final class PreInitializer {

    public static void handle() {
        CEItems.initialize();
    }

}
