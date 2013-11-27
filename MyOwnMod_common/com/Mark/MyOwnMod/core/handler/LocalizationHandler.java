/** Mark Verbeek
*
* This class makes a language file possible. So the mod can easly be translated
* to other language.
* 
*/
package com.Mark.MyOwnMod.core.handler;

import com.Mark.MyOwnMod.core.helper.LocalizationHelper;
import com.Mark.MyOwnMod.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

// new method to 
public class LocalizationHandler {

	public static void init(){
		
		// iterate though all localeFiles
		for(String LocalizationFile : Localizations.localeFiles){
			
		/* Lets break down this peace of code. 
		* LanguageRegistry.instance() call the function intance in the LanguageRegistry class.
		* 
		* in
		*/	
			LanguageRegistry.instance().loadLocalization(LocalizationFile, LocalizationHelper.getLocaleFromFileName(LocalizationFile), LocalizationHelper.isXMLLanguageFile(LocalizationFile));
		}
	}
}
