/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

import info.coremodding.craftenchants.library.Reference;
import info.coremodding.craftenchants.proxy.CommonProxy;

public class ItemCE extends Item {

    public ItemCE(int id) {
        super(id);
        setCreativeTab(CommonProxy.tab);
        setName("");
    }

    public void setName(String unlocalName) {
        setUnlocalizedName(Reference.MOD_ID + ":" + unlocalName);
    }
    
    public String getName() {
        return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(Reference.MOD_ID));
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(getName());
    }

}
