package info.coremodding.craftenchants.item.components;

import net.minecraft.enchantment.Enchantment;
import info.coremodding.craftenchants.item.ItemCE;

public class HorseHair extends ItemCE {

	public HorseHair(int id) {
		super(id);
		setName("horsehair");
		setEnchant(Enchantment.power, 2);
	}

}
