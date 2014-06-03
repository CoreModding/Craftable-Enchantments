/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

import info.coremodding.craftenchants.item.components.HorseHair;
import info.coremodding.craftenchants.item.enchants.ArmorKit;
import info.coremodding.craftenchants.item.enchants.BlastResistPad;
import info.coremodding.craftenchants.item.enchants.CounterWeight;
import info.coremodding.craftenchants.item.enchants.FireOil;
import info.coremodding.craftenchants.item.enchants.ReinforcedNock;
import info.coremodding.craftenchants.item.enchants.SharpeningStone;
import info.coremodding.craftenchants.item.enchants.Snorkle;
import info.coremodding.craftenchants.item.enchants.Studs;
import info.coremodding.craftenchants.item.enchants.WoolPadding;
import info.coremodding.craftenchants.item.recipes.EnchantsItem;

public class ItemsCE {
  public static Set<ItemCE> items = new HashSet<>();

  /* Component items */
  public static ItemCE horseHair;
  
  /* Enchantment items */
  public static ItemCE armorKit;
  public static ItemCE blastResistPad;
  public static ItemCE counterWeightIron;
  public static ItemCE counterWeightStone;
  public static ItemCE fireOil;
  public static ItemCE reinforcedNock;
  public static ItemCE sharpeningStone;
  public static ItemCE snorkle;
  public static ItemCE studsIron;
  public static ItemCE woolPadding;

  public static void initialize() {
    createItems();
    registerItems();
    EnchantsItem.addRecipes();
  }

  public static void createItems() {
    items.add(horseHair = new HorseHair());
    
    items.add(armorKit = new ArmorKit());
    items.add(blastResistPad = new BlastResistPad());
    items.add(counterWeightIron = new CounterWeight(Item.ToolMaterial.IRON));
    items.add(counterWeightStone = new CounterWeight(Item.ToolMaterial.STONE));
    items.add(fireOil = new FireOil());
    items.add(reinforcedNock = new ReinforcedNock());
    items.add(sharpeningStone = new SharpeningStone());
    items.add(snorkle = new Snorkle());
    items.add(studsIron = new Studs(Item.ToolMaterial.IRON));
    items.add(woolPadding = new WoolPadding());
  }

  public static void registerItems() {
    for (ItemCE item : items) {
      GameRegistry.registerItem(item, item.getUnlocalizedName());
    }
  }
}
