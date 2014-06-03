/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.item.components;

import net.minecraft.enchantment.Enchantment;

import info.coremodding.craftenchants.item.ItemCE;

public class HorseHair extends ItemCE {

    public HorseHair() {
        super("horsehair");
        setMaxStackSize(16);
    }
    
    @Override
    protected void setEnchantment(Enchantment type, int level) {
        
    }

}
