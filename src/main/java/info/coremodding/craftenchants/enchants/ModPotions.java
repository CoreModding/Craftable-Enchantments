/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.enchants;

import java.util.HashSet;
import java.util.Set;

import info.coremodding.craftenchants.enchants.potion.FireOil;
import info.coremodding.craftenchants.enchants.potion.FlameResistantCream;
import info.coremodding.craftenchants.library.ModIDs;

public class ModPotions {
    //Collection of all potions
    public static Set<PotionCE> potions = new HashSet<>();
    
    //Instances of all potions
    public static PotionCE fireOil;
    public static PotionCE flameResistantCream;
    
    public static void initialize() {
        createPotions();
        registerPotions();
    }
    
    private static void createPotions() {
        potions.add(fireOil = new FireOil(ModIDs.Potions.Default.fireOil));
        potions.add(flameResistantCream = new FlameResistantCream(ModIDs.Potions.Default.flameResistantCream));
    }
    
    private static void registerPotions() {
        
    }
}
