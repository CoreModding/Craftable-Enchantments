/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.enchants.item;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.EnumToolMaterial;

public class Counterweight extends ItemCE {
    private EnumToolMaterial enchantMaterial;
    /**
     * Main constructor for Counterweight. Applied to a weapon, attributes Knockback.
     * @param id Unique identifier for the item in the registry
     * @param enchantMaterial Key ingredient the enchantment uses.
     */
    public Counterweight(int id, EnumToolMaterial enchantMaterial) {
        super(id);
        this.enchantMaterial = enchantMaterial;
        setName(this.enchantMaterial.toString().toLowerCase() + "counterweight");
        setEnchant(Enchantment.knockback, getEnchantLevel());
    }
    
    public int getEnchantLevel() {
        return this.enchantMaterial.getHarvestLevel();
    }

}
