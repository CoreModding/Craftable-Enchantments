/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.event;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

/**
 * Keeps track and registers the events for the mod.
 * 
 * @author shooshosha
 * 
 */
public class Events {
  /**
   * Static instances of the events for this mod. They are then registered individually to the
   * appropriate event buses.
   */
  private static LivingDrops livingDropsEvent = new LivingDrops(50);
  private static EntityInteract entityInteractEvents = new EntityInteract(5);

  /**
   * Adds instances of events to the event buses of forge and FML. See fields of this class.
   */
  public static void initialize() {
    registerFMLEvents();
    registerForgeEvents();

  }

  /**
   * Adds instances of events to the FML event bus. See fields of this class.
   */
  private static void registerFMLEvents() {
    FMLCommonHandler.instance().bus().register(livingDropsEvent);
    FMLCommonHandler.instance().bus().register(entityInteractEvents);
  }

  /**
   * Adds instances of events to the Forge event bus. See fields of this class.
   */
  private static void registerForgeEvents() {
    MinecraftForge.EVENT_BUS.register(livingDropsEvent);
    MinecraftForge.EVENT_BUS.register(entityInteractEvents);
  }
}
