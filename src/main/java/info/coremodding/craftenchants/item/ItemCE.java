/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item;

import net.minecraft.item.Item;

import info.coremodding.craftenchants.library.Reference;
import info.coremodding.craftenchants.proxy.CommonProxy;

public class ItemCE extends Item {
    protected String unlocalName;

    public ItemCE(int id) {
        super(id);
        setCreativeTab(CommonProxy.tab);
        setUnlocalizedName(unlocalName);
    }

    public void setName(String unlocalName) {
        setUnlocalizedName(Reference.MOD_ID + ":" + unlocalName);
    }

}
