/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.event;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.item.ItemShears;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.EntityInteractEvent;

import info.coremodding.craftenchants.item.ModItems;

public class PlayerUsesItem {
        
    @ForgeSubscribe
    public void onShearUse(EntityInteractEvent interaction) {
        Entity target = interaction.target;
        Entity player = interaction.entityPlayer;
        if(target instanceof EntityHorse) {
            if (player != null) {
                Random random = new Random();
                int dropCount = random.nextInt(6) + 1;
                interaction.target.dropItem(ModItems.horseHair.itemID, dropCount);
            }
        }
    }
}
