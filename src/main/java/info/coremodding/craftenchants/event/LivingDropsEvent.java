package info.coremodding.craftenchants.event;

import java.util.Random;

import info.coremodding.craftenchants.item.enchants.HorseHair;
import info.coremodding.craftenchants.library.ModIDs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;

public class LivingDropsEvent {

	@ForgeSubscribe
	public void onEntityLivingDeath(LivingDeathEvent event) {
		if(event.entity instanceof EntityHorse)
		{
			Random random = new Random();
			int randomint = random.nextInt(100);
			if(randomint < 5) {
			event.entity.dropItem(16428, 0);
			}
		}
	}
}
