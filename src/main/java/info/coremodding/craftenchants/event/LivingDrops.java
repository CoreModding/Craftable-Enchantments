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

public class LivingDrops {
  @SubscribeEvent
  public void onEntityLivingDeath(LivingDeathEvent event) {
    if (event.entity instanceof EntityHorse) {
      Random random = new Random();
      int dropChance = random.nextInt(100);
      if (dropChance < 50) {
        int dropCount = random.nextInt(3) + 1;
        event.entity.dropItem(ItemsCE.horseHair, dropCount);
      }
    }
  }
}
