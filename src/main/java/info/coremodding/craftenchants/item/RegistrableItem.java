/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants.item;

import net.minecraft.creativetab.CreativeTabs;

public interface RegistrableItem {
    void setName(String unlocalName);
    void setTexture();
    void setTab(CreativeTabs tab);
    void addToGame();
    void addRecipe();
}
