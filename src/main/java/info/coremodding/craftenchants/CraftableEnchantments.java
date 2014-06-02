/**
 * Copyright 2014 by CoreModding under GNU Lesser General Public License (LGPLv3)
 * http://www.gnu.org/licenses/gpl.html
 * http://www.gnu.org/licenses/lgpl.html
 */
package info.coremodding.craftenchants;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import info.coremodding.craftenchants.event.PreInitializer;
import info.coremodding.craftenchants.proxy.Proxy;

@Mod(modid = CraftableEnchantments.ID, name = CraftableEnchantments.NAME)
public class CraftableEnchantments {
    public static final String NAME = "Craftable Enchantments";
    public static final String ID = "craftenchants";
    
    @Instance(ID)
    public static CraftableEnchantments instance;
    
    @SidedProxy(clientSide = Proxy.CLIENT, serverSide = Proxy.SERVER)
    public static Proxy proxy;
    
    
    @EventHandler
    public void preInitialization(FMLPreInitializationEvent preEvent) {
        PreInitializer.handle(preEvent);
    }
}
