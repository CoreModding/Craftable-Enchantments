/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CEItemRecipe {
    public static final Object[] sharpeningStone = new Object[] {
                                                                 "FFF",
                                                                 "FSF",
                                                                 "FFF",
                                                                 'F',
                                                                 new ItemStack(Items.flint),
                                                                 'S',
                                                                 new ItemStack(Blocks.stone) };

    public static final Object[] armorKit = new Object[] {
                                                          "LLL",
                                                          "LWL",
                                                          "LLL",
                                                          'L',
                                                          new ItemStack(Items.leather, 1),
                                                          'W', Blocks.wool };

    public static final Object[] woolPadding = new Object[] {
                                                             "   ",
                                                             "WRW",
                                                             "WRW",
                                                             'W',
                                                             Blocks.wool,
                                                             'R',
                                                             new ItemStack(Items.string) };

    public static final Object[] ironStuds = new Object[] {
                                                           "   ",
                                                           "I I",
                                                           "L L",
                                                           'I',
                                                           new ItemStack(Items.iron_ingot),
                                                           'L',
                                                           new ItemStack(Items.leather) };

    public static final Object[] stoneCounterweight = new Object[] {
                                                                    "WWW",
                                                                    "WSW",
                                                                    "WWW",
                                                                    'W',
                                                                    Blocks.wool,
                                                                    'S',
                                                                    Blocks.stone };

    public static final Object[] ironCounterweight = new Object[] {
                                                                   "WWW",
                                                                   "WIW",
                                                                   "WWW",
                                                                   'W',
                                                                   Blocks.wool,
                                                                   'I',
                                                                   Blocks.iron_block };

    public static final Object[] blastResistPad = new Object[] {
                                                                "III",
                                                                "ISI",
                                                                "III",
                                                                'I',
                                                                new ItemStack(Items.iron_ingot),
                                                                'S',
                                                                Blocks.stone };

    public static final Object[] snorkle = new Object[] {
                                                         "GGS",
                                                         "GGG",
                                                         "III",
                                                         'G',
                                                         Blocks.glass,
                                                         'S',
                                                         new ItemStack(Items.reeds),
                                                         'I',
                                                         new ItemStack(Items.iron_ingot) };

    public static final Object[] reinforcedNock = new Object[] { "H  ", " H ",
                                                                "  H", 'H',
                                                                Items.melon };
}
