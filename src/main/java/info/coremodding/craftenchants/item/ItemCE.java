/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import info.coremodding.craftenchants.library.Reference;
import info.coremodding.craftenchants.proxy.Proxy;

public class ItemCE extends Item {
    private Enchantment enchantType;
    private int enchantLevel;
    
    protected ItemCE(String unlocalName) {
        super();
        setCreativeTab(Proxy.tabMain);
        setName(unlocalName);
    }
    
    private void setName(String unlocalName) {
        setUnlocalizedName(Reference.MOD_ID + ":" + unlocalName);
    }
    
    public String getName() {
        return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(Reference.MOD_ID));
    }
    
    protected void setEnchantmentTypeLevel(Enchantment enchantType, int enchantLevel) {
        setEnchantmentType(enchantType);
        setEnchantmentLevel(enchantLevel);
    }
    
    private void setEnchantmentType(Enchantment enchantType) {
        this.enchantType = enchantType;
    }
    
    public Enchantment getEnchantmentType() {
        return this.enchantType;
    }
    
    private void setEnchantmentLevel(int enchantLevel) {
        this.enchantLevel = enchantLevel;
    }
    
    public int getEnchantmentLevel() {
        return this.enchantLevel;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":")));
    }
}
