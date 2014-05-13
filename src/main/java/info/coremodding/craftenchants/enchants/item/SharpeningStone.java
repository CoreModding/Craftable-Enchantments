/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.enchants.item;

import net.minecraft.enchantment.Enchantment;

public class SharpeningStone extends ItemCE {
    
    public SharpeningStone(int id) {
        super(id);
        setName("sharpeningstone");
        setEnchant(Enchantment.sharpness, 1);
    }
}
