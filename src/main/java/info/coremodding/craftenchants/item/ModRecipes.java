/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item;

import java.util.HashSet;
import java.util.Set;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModRecipes {

    public static class Items {
        public static Set<Object[]> list = new HashSet<>();

        public static final Object[] armorKit = new Object[] { "LLL", "LWL", "LLL", 'L',
                                                              new ItemStack(Item.leather, 1), 'W', Block.cloth };

        public static final Object[] blastResistPad = new Object[] { "III", "ISI", "III", 'I',
                                                                    new ItemStack(Item.ingotIron), 'S', Block.stone };

        public static final Object[] ironStuds = new Object[] { "   ", "I I", "L L", 'I',
                                                               new ItemStack(Item.ingotIron), 'L',
                                                               new ItemStack(Item.leather) };

        public static final Object[] ironCounterweight = new Object[] { "WWW", "WIW", "WWW", 'W', Block.cloth, 'I',
                                                                       Block.blockIron };

        // TODO Find horse hair; melons are not hair!
        public static final Object[] reinforcedNock = new Object[] { "H  ", " H ", "  H", 'H', Item.melon };

        public static final Object[] sharpeningStone = new Object[] { "FFF", "FSF", "FFF", 'F',
                                                                     new ItemStack(Item.flint), 'S',
                                                                     new ItemStack(Block.stone) };

        public static final Object[] snorkle = new Object[] { "GGS", "GGG", "III", 'G', Block.glass, 'S',
                                                             new ItemStack(Item.reed), 'I',
                                                             new ItemStack(Item.ingotIron) };

        public static final Object[] stoneCounterweight = new Object[] { "WWW", "WSW", "WWW", 'W', Block.cloth, 'S',
                                                                        Block.stone };

        public static final Object[] woolPadding = new Object[] { "   ", "WRW", "WRW", 'W', Block.cloth, 'R',
                                                                 new ItemStack(Item.silk) };

        public static void itemizeRecipes() {
            list.add(armorKit);
            list.add(blastResistPad);
            list.add(ironCounterweight);
            list.add(ironStuds);
            list.add(reinforcedNock);
            list.add(sharpeningStone);
            list.add(snorkle);
            list.add(stoneCounterweight);
            list.add(woolPadding);
        }
    }
    
    public static class Output {
        public static ItemStack sharpStoneSword = new ItemStack(Item.swordStone);
        public static ItemStack sharpIronSword = new ItemStack(Item.swordIron);
        public static ItemStack sharpDiamondSword = new ItemStack(Item.swordDiamond);
        
        public static void initialize() {
            addEnchantments();
            registerRecipes();
        }
        
        private static void addEnchantments() {
            addSwordEnchantments();
        }
        
        private static void registerRecipes() {
            GameRegistry.addShapelessRecipe(sharpStoneSword, Item.swordStone, ModItems.sharpeningStone);
            GameRegistry.addShapelessRecipe(sharpIronSword, Item.swordIron, ModItems.sharpeningStone);
            GameRegistry.addShapelessRecipe(sharpDiamondSword, Item.swordDiamond, ModItems.sharpeningStone);
        }
        
        private static void addSwordEnchantments() {
            sharpStoneSword.addEnchantment(Enchantment.sharpness, 1);
            sharpIronSword.addEnchantment(Enchantment.sharpness, 1);
            sharpDiamondSword.addEnchantment(Enchantment.sharpness, 1);
        }
    }
}
