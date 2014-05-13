/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.enchants.item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.EnumToolMaterial;
import info.coremodding.craftenchants.item.ItemCE;

public class Studs extends ItemCE {
    private EnumToolMaterial enchantMaterial;
    
    /**
     * @param id
     * @param enchantMaterial
     */
    public Studs(int id, EnumToolMaterial enchantMaterial) {
        super(id);
        this.enchantMaterial = enchantMaterial;
        setName(this.enchantMaterial.toString().toLowerCase() + "studs");
        setEnchant(Enchantment.thorns, getEnchantLevel());
    }
    
    public int getEnchantLevel() {
        return this.enchantMaterial.getHarvestLevel();
    }
}
