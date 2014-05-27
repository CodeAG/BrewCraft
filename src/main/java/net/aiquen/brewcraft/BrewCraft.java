package net.aiquen.brewcraft;

/**
 * Basic imports for the mod to work at all
 */
//Bunch of super classes we depend on
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
//Helperclasses
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
//Oredict to try to work with other mod nicely
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
//Initialization events
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
//Super class to the mod and event handlers
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
//Game registry that keeps track of our stuff later
import cpw.mods.fml.common.registry.GameRegistry;
//Tell the game which class does what for server/client
import cpw.mods.fml.common.SidedProxy;

/**
 * Mod specifik imports
 */
//info about the mod
import net.aiquen.brewcraft.lib.BrewCraftStatics;

//liquids
import net.aiquen.brewcraft.liquids.BrewCraftBeerBlock;
import net.aiquen.brewcraft.liquids.BrewCraftVortBlock;

//items
import net.aiquen.brewcraft.items.BrewCraftHops;
import net.aiquen.brewcraft.items.BrewCraftMalt;
import net.aiquen.brewcraft.items.BrewCraftYeast;

/**
 * @author aiquen
 * Baseclass for the mod. Minecraft loads this one
 *
 */
@Mod(modid=BrewCraftStatics.modID, name=BrewCraftStatics.modName, version=BrewCraftStatics.modVersion)
public class BrewCraft {

	/**
	 * All static variables needed to load the mod
	 */
	@Instance(value=BrewCraftStatics.modID)
	public static BrewCraft instance;
	public static final String modString=BrewCraftStatics.modString;
	
	//liquid blocks
	public static Block liquidBeer;
	public static Block liquidVort;
	
	//items
	
	

}
