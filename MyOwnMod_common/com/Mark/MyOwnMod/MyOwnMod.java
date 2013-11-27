/**Mod by Mark Verbeek, 
 * 
 * This mod only adds one block to minecraft. 
 * 
 * Special thanks to MouseTutorials. which makes this mod posible. 
 *  
 */

package com.Mark.MyOwnMod;

import java.io.File;

import com.Mark.MyOwnMod.blocks.ModBlocks;
import com.Mark.MyOwnMod.core.handler.ConfigurationHandler;
import com.Mark.MyOwnMod.core.handler.LocalizationHandler;
import com.Mark.MyOwnMod.core.proxy.CommonProxy;
import com.Mark.MyOwnMod.lib.References;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


// get the Mod references rigtht, so Forge can load the mod
@Mod( 
		name = References.MODNAME,
		modid = References.MODID,
		version = References.VERSION
		)

// make the mod Clientsede only
@NetworkMod(
		clientSideRequired = true,
		serverSideRequired = false
		)

// here start the mod him self
public class MyOwnMod {

		// set the proxy right, do not know yet what this implies
		@SidedProxy(
				clientSide = References.CLIENT_PROXY_LOCATION,
				serverSide = References.COMMON_PROXY_LOCATION
				)
		public static CommonProxy proxy;
	
		// this function runs before the game. So initialise all new blocks and stuff
		@EventHandler
		public void preInit(FMLPreInitializationEvent event){
			
			//
			ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + References.MODID + File.separator + References.MODID + ".cfg"));
			
			
			// adds localizations
			LocalizationHandler.init();
			
			
			// this method loads all blocks
			ModBlocks.init();
		}
		
		// this function initialises the mod
		@EventHandler
		public void init(FMLInitializationEvent event){
			
		}
		
		// don't know
		@EventHandler
		public void postInit(FMLPostInitializationEvent event){
			
		}
}
