/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.proxy;

import net.minecraft.creativetab.CreativeTabs;

import info.coremodding.craftenchants.library.CECreativeTab;
import info.coremodding.craftenchants.library.Reference;


public class CommonProxy implements Proxy {
    public static CreativeTabs tab = new CECreativeTab(Reference.MOD_ID);
}
