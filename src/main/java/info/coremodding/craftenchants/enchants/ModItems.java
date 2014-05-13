/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.enchants;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.EnumToolMaterial;
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
import info.coremodding.craftenchants.library.ModIDs;

public class ModItems {
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