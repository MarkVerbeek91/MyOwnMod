/** Mark Verbeek
*   
* This class makes a config file where all block id are stored. This to make 
* easy altering of block id a lot easer in case if there is a block id 
* conflict.   
* 
*/  
package com.Mark.MyOwnMod.core.handler;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.Mark.MyOwnMod.lib.BlockIds;
import com.Mark.MyOwnMod.lib.References;
import com.Mark.MyOwnMod.lib.Strings;

import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {

	static Configuration config = new Configuration();
	
	public static void init(File file){
		
		config = new Configuration(file);
		
		try{
			
			config.load();
			
			BlockIds.BASEBLOCK_ID = config.getBlock(Strings.BASEBLOCK_NAME, BlockIds.BASEBLOCK_ID_DEFAULT).getInt(BlockIds.BASEBLOCK_ID_DEFAULT);
		}
		
		catch(Exception e){
			
			FMLLog.log(Level.SEVERE, e, References.MODID + " has trouble loading the config");
		}
		
		finally{
			
			config.save();
		}
	}
}
