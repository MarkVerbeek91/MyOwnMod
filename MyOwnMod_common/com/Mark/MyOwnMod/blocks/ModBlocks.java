/** Mark Verbeek,
 * 
 * This file add my own block(s) to Minecraft.  
 */

 // say to which package this class belongs to
package com.Mark.MyOwnMod.blocks;

// import the Block class form the minecraft project
import net.minecraft.block.Block;

// import the Ids of the blocks 
import com.Mark.MyOwnMod.lib.BlockIds;

// import the Names of the blocks out a external file. 
import com.Mark.MyOwnMod.lib.Strings;

// import the class that registers my new block in the game
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

	// make a new block
	public static Block BaseBlock;
	
	// new method. 
	public static void init(){
	
		// Give the new block a id and class
		BaseBlock = new BaseBlock(BlockIds.BASEBLOCK_ID);
		
		// add the block to the game block registry. 
		// the second argument is the block name, which can be found in the sting.java file
		GameRegistry.registerBlock(BaseBlock, Strings.BASEBLOCK_NAME);
	}
	
}
