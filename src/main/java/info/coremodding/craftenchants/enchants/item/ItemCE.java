/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.enchants.item;

import info.coremodding.craftenchants.library.Reference;
import info.coremodding.craftenchants.proxy.Proxy;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCE extends Item {
	private Enchantment enchantType;
	private int enchantLevel;

    public ItemCE(int id) {
        super(id);
        setCreativeTab(Proxy.tab);
        setName("");
    }

    protected void setName(String unlocalName) {
        setUnlocalizedName(Reference.MOD_ID + ":" + unlocalName);
    }
    
    public String getName() {
        return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(Reference.MOD_ID));
    }
    
    protected void setEnchant(Enchantment enchantType, int enchantLevel) {
    	setEnchantType(enchantType);
    	setEnchantLevel(enchantLevel);
    }
    
    private void setEnchantType(Enchantment enchantType) {
    	this.enchantType = enchantType;
    }
    
    public Enchantment getEnchantType() {
    	return this.enchantType;
    }
    
    private void setEnchantLevel(int enchantLevel) {
    	this.enchantLevel = enchantLevel;
    }
    
    public int getEnchantLevel() {
    	return this.enchantLevel;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(getName());
    }

}
