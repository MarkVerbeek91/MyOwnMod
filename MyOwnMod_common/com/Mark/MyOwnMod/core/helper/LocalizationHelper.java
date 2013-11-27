package com.Mark.MyOwnMod.core.helper;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHelper {

	// 
	public static boolean isXMLLanguageFile(String filename){
		
		return filename.endsWith(".xml");
	}

	public static String getLocaleFromFileName(String filename){
		
		return filename.substring(filename.lastIndexOf("/"), filename.lastIndexOf("."));
	}
	
	public static String getLocalizationString(String key){
		
		return LanguageRegistry.instance().getStringLocalization(key);
	}
}

