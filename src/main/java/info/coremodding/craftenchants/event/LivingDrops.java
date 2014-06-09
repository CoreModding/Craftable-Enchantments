/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.event;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import scala.util.Random;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import info.coremodding.craftenchants.item.ItemsCE;

/**
 * Defines the events on entities dropping items. Specifically fires on the mobs' death.
 * 
 * @author shooshosha
 * 
 */
public class LivingDrops {
  /**
   * The chance an item will drop upon death. Values are directly proportional to the chance the
   * item actually drops. Range is between 0 inclusively and 100 inclusively.
   */
  private int deathDropChance;

  /**
   * Defines the items to drop based on the entity that fired the event and the chance the item will
   * drop based on this class's field.
   * 
   * @param event @see {@link LivingDeathEvent}
   */
  @SubscribeEvent
  public void onEntityLivingDeath(LivingDeathEvent event) {
    if (event.entity instanceof EntityHorse) {
      Random random = new Random();
      int dropChance = random.nextInt(100);
      if (dropChance < deathDropChance) {
        int dropCount = random.nextInt(3) + 1;
        event.entity.dropItem(ItemsCE.horseHair, dropCount);
      }
    }
  }

  /**
   * Default constructor. Uses the telescoping method of calling constructors with default values.
   */
  public LivingDrops() {
    this(5);
  }

  /**
   * Constructor that sets the value of deathDropChance.
   * 
   * @param deathDropChance the initial value of likelihood items will drop on death.
   */
  public LivingDrops(int deathDropChance) {
    this.deathDropChance = deathDropChance;
  }

  /**
   * Accessor method for getting the value of deathDropChance.
   * 
   * @return value of deathDropChance
   */
  public int getDeathDropChance() {
    return this.deathDropChance;
  }

  /**
   * Mutator method for setting the value of deathDropChance. Does simple error checking of the
   * range of the parameter. On success, changes the value otherwise leaves it unchanged.
   * 
   * @param deathDropChance possible new value to set likelihood items will drop on death.
   */
  public void setDeathDropChance(int deathDropChance) {
    if (0 <= deathDropChance && deathDropChance <= 100) {
      this.deathDropChance = deathDropChance;
    }
  }
}
