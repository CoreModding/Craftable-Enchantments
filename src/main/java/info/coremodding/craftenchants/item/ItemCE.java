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

import info.coremodding.craftenchants.item.enchants.Enchants;
import info.coremodding.craftenchants.proxy.Proxy;

public abstract class ItemCE extends Item implements Enchants {    
    protected Enchantment enchantType;
    protected int enchantLevel;
    
    protected ItemCE(String unlocalName) {
        super();
        setCreativeTab(Proxy.tabMain);
        setUnlocalizedName(unlocalName);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf('.') + 1));
    }
    
    public boolean hasEnchantment() {
        return getEnchantmentType() != null && getEnchantmentLevel() > 0;
    }
    
    protected abstract void setEnchantment(Enchantment type, int level);
    
    public Enchantment getEnchantmentType() {
        return this.enchantType;
    }
    
    public int getEnchantmentLevel() {
        return this.enchantLevel;
    }
}
