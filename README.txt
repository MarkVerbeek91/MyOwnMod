Project done by Mark Verbeek,

Name of project: Simple Minecraft Mod. 

Goals of this project:
1. Learn a bit of Java
2. Learn how to use Eclipse as programming environment
3. Learn how to setup a "professional" mod
4. Add a block to Minecraft

This project is Mod for Minecraft. Minecraft is a pc game written in Java so also this mod is written in Java. 

Because there are already many mods for Minecraft a kind of API is written for it. This API name forge makes modding a lot easer. 

About the folders in this project. 
Because how Minecraft is set-up, there are a lot of folders in folders. In MyOwnMod_common are the classes found that makes this mod. The MyOwnMod_resources only contains a texture file. 

Unfortunately it's not possible to show any of my mod other than the code. 

About the code:
In the folder MyOwnMod_common\com\Mark\MyOwnMod\blocks: 
	BaseBlock.Java is the class for a new block.
	ModBlocks.Java is the class that adds the new block to the game
	
In the folder MyOwnMod_common\com\Mark\MyOwnMod\core are the files that set-up the core of the game. So add language file support, config file support and make the file client sided not server sided.

The folder MyOwnMod_common\com\Mark\MyOwnMod\lib, are all the library classes. 
	The BlockIds.Java contains the default blockIds. 
	The Localizations.Java contains all the locations to language file
	References.Java is the Mod info class. 
	Strings.Java makes it possible to get all names of the block and items this mod adds together in a clear fashion.

This library, language file and config file are part of the "professionalism" of the mod. 

About goal number 2. On my pc the work environment works and I can test my mod. A screenshot is added to main folder to seen that a block is added. You got to trust me on that the block is actually added by me ;)

Hopefully this READMY was useful. So not, you can contact me on mark.verbeek91@gmail.com

Greetings Mark