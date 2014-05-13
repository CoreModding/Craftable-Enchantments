/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.enchants.item;

import info.coremodding.craftenchants.enchants.ItemCE;

import net.minecraft.enchantment.Enchantment;

public class Snorkle extends ItemCE {
    public Snorkle(int id) {
        super(id);
        setName("snorkle");
        setEnchant(Enchantment.respiration, 2);
    }

}
