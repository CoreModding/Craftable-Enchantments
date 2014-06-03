/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.event;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import info.coremodding.craftenchants.potion.PotionsCE;

public final class PreInitializer {

  public static void handle(FMLPreInitializationEvent event) {
    // TODO configuration handler
    // TODO version handler
    PotionsCE.initialize();
    
  }

}
