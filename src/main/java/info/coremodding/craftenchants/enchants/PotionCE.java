/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.enchants;

import info.coremodding.craftenchants.library.Reference;

import net.minecraft.potion.Potion;

public class PotionCE extends Potion {

    public PotionCE(int id, boolean isHarmful, int color) {
        super(id, isHarmful, color);
    }
    
    protected void setName(String unlocalName) {
        setPotionName(Reference.MOD_ID + ":" + unlocalName);
    }
    
    public String getName() {
        return "potion." + super.getName();
    }
    
    protected void setIcon(int par1, int par2) {
        setIconIndex(par1, par2);
    }
}
