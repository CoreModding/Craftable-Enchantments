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

public class EntityInteract {
  private int shearDropChance;

  /**
   * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a
   * pig.
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

  public int getShearDropChance() {
    return this.shearDropChance;
  }

  public void setShearDropChance(int shearDropChance) {
    if (0 <= shearDropChance && shearDropChance <= 100) {
      this.shearDropChance = shearDropChance;
    }
  }

  public EntityInteract() {
    this(50);
  }

  public EntityInteract(int shearDropChance) {
    this.shearDropChance = shearDropChance;
  }
}
