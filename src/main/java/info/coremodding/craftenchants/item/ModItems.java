/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

import info.coremodding.craftenchants.item.enchants.ArmorKit;
import info.coremodding.craftenchants.item.enchants.BlastResistPad;
import info.coremodding.craftenchants.item.enchants.Counterweight;
import info.coremodding.craftenchants.item.enchants.IronStuds;
import info.coremodding.craftenchants.item.enchants.ReinforcedNock;
import info.coremodding.craftenchants.item.enchants.SharpeningStone;
import info.coremodding.craftenchants.item.enchants.Snorkle;
import info.coremodding.craftenchants.item.enchants.WoolPadding;

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

    public static void initialize() {
        createItems();
        registerItems();
        addRecipes();
    }

    private static void createItems() {
        items.add(armorKit = new ArmorKit(ModIDs.Items.Default.armorKit));
        items.add(blastResistPad = new BlastResistPad(ModIDs.Items.Default.blastResistPad));
        items.add(ironCounterweight = new Counterweight(ModIDs.Items.ironCounterweight, EnumToolMaterial.IRON));
        items.add(ironStuds = new IronStuds(ModIDs.Items.Default.ironStuds));
        items.add(reinforcedNock = new ReinforcedNock(ModIDs.Items.Default.reinforcedNock));
        items.add(sharpeningStone = new SharpeningStone(ModIDs.Items.Default.sharpeningStone));
        items.add(snorkle = new Snorkle(ModIDs.Items.Default.snorkle));
        items.add(stoneCounterweight = new Counterweight(ModIDs.Items.stoneCounterweight, EnumToolMaterial.STONE));
        items.add(woolPadding = new WoolPadding(ModIDs.Items.Default.woolPadding));
    }

    private static void registerItems() {
        for (ItemCE item : items) {
            GameRegistry.registerItem(item, item.getUnlocalizedName());
        }
    }

    private static void addRecipes() {
        GameRegistry.addShapedRecipe(new ItemStack(armorKit), ModRecipes.Items.armorKit);
        GameRegistry.addShapedRecipe(new ItemStack(blastResistPad), ModRecipes.Items.blastResistPad);
        GameRegistry.addShapedRecipe(new ItemStack(ironCounterweight), ModRecipes.Items.ironCounterweight);
        GameRegistry.addShapedRecipe(new ItemStack(ironStuds), ModRecipes.Items.ironStuds);
        GameRegistry.addShapedRecipe(new ItemStack(reinforcedNock), ModRecipes.Items.reinforcedNock);
        GameRegistry.addShapedRecipe(new ItemStack(sharpeningStone), ModRecipes.Items.sharpeningStone);
        GameRegistry.addShapedRecipe(new ItemStack(snorkle), ModRecipes.Items.snorkle);
        GameRegistry.addShapedRecipe(new ItemStack(stoneCounterweight), ModRecipes.Items.stoneCounterweight);
        GameRegistry.addShapedRecipe(new ItemStack(woolPadding), ModRecipes.Items.woolPadding);
        
    }

}
