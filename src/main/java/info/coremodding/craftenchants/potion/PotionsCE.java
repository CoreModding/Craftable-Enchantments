/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.potion;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;

import info.coremodding.craftenchants.event.CraftableEnchantmentsEventHooks;

public class PotionsCE {
  public static Set<PotionCE> potions = new HashSet<>();
  
  public static PotionCE fireOil;
  public static PotionCE fireResistantCream;
  
  public static void initialize() {
    expandPotions();
    createPotions();
  }
  
  private static void expandPotions() {
    Potion[] potionTypes = null;
    for(Field f : Potion.class.getDeclaredFields()) {
      f.setAccessible(true);
      try {
        if (f.getName().equals("potionTypes") || f.getName().equals("field_76425_a")) {
          Field modField = Field.class.getDeclaredField("modifiers");
          modField.setAccessible(true);
          modField.setInt(f,  f.getModifiers() & ~Modifier.FINAL);
          
          potionTypes = (Potion[])f.get(null);
          final Potion[] newPotionTypes = new Potion[256];
          System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
          f.set(null, newPotionTypes);
        }
      } catch (Exception e) {
        System.err.println("Severe error, please report this to the mod author:");
        System.err.println(e);
      }
    }
    MinecraftForge.EVENT_BUS.register(new CraftableEnchantmentsEventHooks());
  }
  
  private static void createPotions() {
    potions.add(fireOil = new FireOil(33));
    potions.add(fireResistantCream = new FireResistantCream(34));
  }
}
