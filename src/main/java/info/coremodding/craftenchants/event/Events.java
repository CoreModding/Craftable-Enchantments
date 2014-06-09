/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.event;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

public class Events {
  private static LivingDrops livingDropsEvent = new LivingDrops(50);
  private static EntityInteract entityInteractEvents = new EntityInteract(5);
  
  public static void initialize() {
    registerFMLEvents();
    registerForgeEvents();
    
  }

  /**
   * 
   */
  private static void registerFMLEvents() {
    FMLCommonHandler.instance().bus().register(livingDropsEvent);
    FMLCommonHandler.instance().bus().register(entityInteractEvents);
  }

  /**
   * 
   */
  private static void registerForgeEvents() {
    // TODO Implement method registerForgeEvents
    MinecraftForge.EVENT_BUS.register(livingDropsEvent);
    MinecraftForge.EVENT_BUS.register(entityInteractEvents);
  }
}
