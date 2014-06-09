/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.enchants.item.enchants;

import info.coremodding.craftenchants.enchants.ItemCE;

import net.minecraft.enchantment.Enchantment;

public class BlastResistPad extends ItemCE {
    public BlastResistPad(int id) {
        super(id);
        setName("blastresistpad");
        setEnchant(Enchantment.blastProtection, 2);
    }

}
