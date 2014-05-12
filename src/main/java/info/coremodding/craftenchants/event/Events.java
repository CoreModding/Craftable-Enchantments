/**
  * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
  * http://www.gnu.org/licenses/gpl.html
  * http://www.gnu.org/licenses/lgpl.html
  */
package info.coremodding.craftenchants.event;

import net.minecraftforge.common.MinecraftForge;

public class Events {
    public static void initialize() {
        MinecraftForge.EVENT_BUS.register(new LivingDrops());
        MinecraftForge.EVENT_BUS.register(new PlayerUsesItem());
    }
}
