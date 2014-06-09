/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import scala.util.Random;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import info.coremodding.craftenchants.item.ItemsCE;

/**
 * Defines the events of when the player interacts with an entity.
 * 
 * @author shooshosha
 * 
 */
public class EntityInteract {
  /**
   * The likelihood an item drops if the {@link Items.shears} are used. Values are directly
   * proportional to the chance the item actually drops. Range is between 0 inclusively and 100
   * inclusively.
   */
  private int shearDropChance;

  /**
   * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a
   * pig.
   * 
   * @param interaction @see {@link EntityInteractEvent}
   */
  @SubscribeEvent
  public void interact(EntityInteractEvent interaction) {
    EntityPlayer player = interaction.entityPlayer;
    Entity target = interaction.target;
    ItemStack itemInHand = player.inventory.getCurrentItem();

    if (itemInHand != null && itemInHand.getItem().equals(Items.shears)) {
      if (target instanceof EntityHorse) {
        EntityHorse horseTarget = (EntityHorse) target;
        if (horseTarget.getTemper() > 0) {
          Random random = new Random();
          int dropChance = random.nextInt(100);
          if (dropChance < this.shearDropChance) {
            int dropCount = random.nextInt(3) + 1;
            target.dropItem(ItemsCE.horseHair, dropCount);
            horseTarget.increaseTemper(-dropCount);
          }
        }
      }
    }
  }

  /**
   * Default constructor. Uses the telescoping method of calling constructors with default values.
   */
  public EntityInteract() {
    this(50);
  }

  /**
   * Constructor that sets the value of deathDropChance.
   * 
   * @param deathDropChance the initial value of likelihood items will drop on death.
   */
  public EntityInteract(int shearDropChance) {
    this.shearDropChance = shearDropChance;
  }

  /**
   * Accessor method for getting the value of deathDropChance.
   * 
   * @return value of deathDropChance
   */
  public int getShearDropChance() {
    return this.shearDropChance;
  }

  /**
   * Mutator method for setting the value of deathDropChance. Does simple error checking of the
   * range of the parameter. On success, changes the value otherwise leaves it unchanged.
   * 
   * @param deathDropChance possible new value to set likelihood items will drop on death.
   */
  public void setShearDropChance(int shearDropChance) {
    if (0 <= shearDropChance && shearDropChance <= 100) {
      this.shearDropChance = shearDropChance;
    }
  }
}
