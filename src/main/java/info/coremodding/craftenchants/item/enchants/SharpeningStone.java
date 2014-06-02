/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item.enchants;

import net.minecraft.enchantment.Enchantment;

import info.coremodding.craftenchants.item.ItemCE;

public class SharpeningStone extends ItemCE implements Enchants {
    public SharpeningStone() {
    	super("sharpeningstone");
    	setEnchantment(Enchantment.sharpness, 1);
    }
    @Override
    protected void setEnchantment(Enchantment type, int level) {
        this.enchantType = type;
        this.enchantLevel = level;
    }
}
