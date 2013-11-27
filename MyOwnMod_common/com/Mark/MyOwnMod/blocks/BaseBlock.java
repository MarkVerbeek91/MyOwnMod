/** Mark Verbeek
 * 
 * This file sets the propetys of the block. 
 * 
 */
package com.Mark.MyOwnMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

import com.Mark.MyOwnMod.lib.References;
import com.Mark.MyOwnMod.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BaseBlock extends Block {

	// set the properties of the new block, more can be added.
	public BaseBlock(int id){
		super(id, Material.rock);							// set how the material behaves
		this.setHardness(0F);								// set how hard it is to mine
		this.setResistance(25F);							// set blast resistance
		this.setCreativeTab(CreativeTabs.tabCombat);		// which tab in the creative menu it is shown
		this.setUnlocalizedName(Strings.BASEBLOCK_NAME);	// give the block his name
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		
		// set the block icon. 
		blockIcon = iconRegister.registerIcon(String.format("%s:%s", References.MODID.toLowerCase(), getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	// a method to get rid of the extension.
	protected String getUnwrappedUnlocalizedName(String name){
		
		return name.substring(name.indexOf(".") + 1);
	}

}
