package info.coremodding.craftenchants.event;

import java.util.Random;

import info.coremodding.craftenchants.item.ModItems;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class LivingDrops {

	@ForgeSubscribe
	public void onEntityLivingDeath(LivingDeathEvent event) {
		if(event.entity instanceof EntityHorse)
		{
			Random random = new Random();
			int dropChance = random.nextInt(100);
			if(dropChance < 5) {
			    int dropCount = random.nextInt(3) + 1;
			    event.entity.dropItem(ModItems.horseHair.itemID, dropCount);
			}
		}
	}
}
