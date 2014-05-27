/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.enchants;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;

import info.coremodding.craftenchants.enchants.item.ArmorKit;
import info.coremodding.craftenchants.enchants.item.BlastResistPad;
import info.coremodding.craftenchants.enchants.item.Counterweight;
import info.coremodding.craftenchants.enchants.item.ReinforcedNock;
import info.coremodding.craftenchants.enchants.item.SharpeningStone;
import info.coremodding.craftenchants.enchants.item.Snorkle;
import info.coremodding.craftenchants.enchants.item.Studs;
import info.coremodding.craftenchants.enchants.item.WoolPadding;
import info.coremodding.craftenchants.enchants.item.component.HorseHair;
import info.coremodding.craftenchants.enchants.potion.FireOil;
import info.coremodding.craftenchants.enchants.potion.FlameResistantCream;
import info.coremodding.craftenchants.library.ModIDs;

public class Enchants {
    public static class Items {
        // Collection of all items
        public static Set<ItemCE> items = new HashSet<>();
        
        /**
         *  Instances of all items
         */
        public static ItemCE armorKit;
        public static ItemCE blastResistPad;
        
        public static ItemCE ironCounterweight;
        public static ItemCE ironStuds;
        public static ItemCE reinforcedNock;
        public static ItemCE sharpeningStone;
        public static ItemCE snorkle;
        public static ItemCE stoneCounterweight;
        public static ItemCE woolPadding;
        public static ItemCE horseHair;

        public static void initialize() {
            createItems();
            registerItems();
        }

        private static void createItems() {
            items.add(armorKit = new ArmorKit(ModIDs.Items.Default.armorKit));
            items.add(blastResistPad = new BlastResistPad(ModIDs.Items.Default.blastResistPad));
            items.add(ironCounterweight = new Counterweight(ModIDs.Items.Default.ironCounterweight, EnumToolMaterial.IRON));
            items.add(ironStuds = new Studs(ModIDs.Items.Default.ironStuds, EnumToolMaterial.IRON));
            items.add(reinforcedNock = new ReinforcedNock(ModIDs.Items.Default.reinforcedNock));
            items.add(sharpeningStone = new SharpeningStone(ModIDs.Items.Default.sharpeningStone));
            items.add(snorkle = new Snorkle(ModIDs.Items.Default.snorkle));
            items.add(stoneCounterweight = new Counterweight(ModIDs.Items.Default.stoneCounterweight, EnumToolMaterial.STONE));
            items.add(woolPadding = new WoolPadding(ModIDs.Items.Default.woolPadding));
            items.add(horseHair = new HorseHair(ModIDs.Items.Default.horseHair));
        }

        private static void registerItems() {
            for (ItemCE item : items) {
                GameRegistry.registerItem(item, item.getUnlocalizedName());
            }
        }
    }
    
    public static class Potions {
        //Collection of all potions
        public static Set<PotionCE> potions = new HashSet<>();
        
        //Instances of all potions
        public static PotionCE fireOil;
        public static PotionCE flameResistantCream;
        
        public static void initialize() {
            registerPotions();
            createPotions();
        }
        
        private static void createPotions() {
            potions.add(fireOil = new FireOil(ModIDs.Potions.Default.fireOil));
            potions.add(flameResistantCream = new FlameResistantCream(ModIDs.Potions.Default.flameResistantCream));
        }
        
        private static void registerPotions() {
            Potion[] potionTypes = null;

            for (Field f : Potion.class.getDeclaredFields()) {
                f.setAccessible(true);
                try {
                    if (f.getName().equals("potionTypes") || f.getName().equals("field_76425_a")) {
                        Field modfield = Field.class.getDeclaredField("modifiers");
                        modfield.setAccessible(true);
                        modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);

                        potionTypes = (Potion[])f.get(null);
                        final Potion[] newPotionTypes = new Potion[256];
                        System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
                        f.set(null, newPotionTypes);
                    }
                } catch (Exception e) {
                    System.err.println("Severe error, please report this to the mod author:");
                    System.err.println(e);
                }
            }

            MinecraftForge.EVENT_BUS.register(null);
        }
    }
    
    private Enchants() {
        //No construction of object
    }
}
