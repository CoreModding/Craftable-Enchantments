/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.item.components;

import info.coremodding.craftenchants.item.ItemCE;

public class HorseHair extends ItemCE {

    /**
     * @param unlocalName is the name of the item despite locale
     */
    protected HorseHair(String unlocalName) {
        super(unlocalName);
        setMaxStackSize(16);
    }

}
