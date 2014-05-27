/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item;

import net.minecraft.item.Item;

import info.coremodding.craftenchants.proxy.Proxy;

public class SharpeningStone extends Item {
    public SharpeningStone() {
    	super();
    	setUnlocalizedName("sharpeningstone");
    	setCreativeTab(Proxy.tabMain);
    }
}
