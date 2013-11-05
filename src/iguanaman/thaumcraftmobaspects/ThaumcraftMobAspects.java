package iguanaman.thaumcraftmobaspects;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGravel;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.material.Material;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.potion.Potion;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.ConfigCategory;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import org.modstats.ModstatInfo;
import org.modstats.Modstats;

import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

import com.google.common.base.Optional;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid="ThaumcraftMobAspects", name="Thaumcraft Mob Aspects", version="1.6.X-1b", 
dependencies="required-after:Thaumcraft;after:MoCreatures;after:LycanitesMobs;after:SpecialMobs")
@NetworkMod(clientSideRequired=true, serverSideRequired=true)
@ModstatInfo(prefix="tcmobaspec")
public class ThaumcraftMobAspects {
	
    // The instance of your mod that Forge uses.
    @Instance("ThaumcraftMobAspects")
    public static ThaumcraftMobAspects instance;

    @EventHandler
    public void load(FMLInitializationEvent event) {
    	Modstats.instance().getReporter().registerMod(this);

		ThaumcraftApi.registerEntityTag("the_iguana_man", bossAspects(5, Aspect.MAN, Aspect.MIND, Aspect.SOUL, Aspect.LIFE, Aspect.MAGIC, Aspect.ELDRITCH, Aspect.ENERGY, Aspect.HUNGER));
		ThaumcraftApi.registerEntityTag("XanderGryphon", bossAspects(5, Aspect.MAN, Aspect.MIND, Aspect.SOUL, Aspect.LIFE, Aspect.MAGIC, Aspect.ELDRITCH, Aspect.ENERGY, Aspect.HUNGER));
		
		PluginLycanitesMobs.init();
		PluginMoCreatures.init();
		PluginSpecialMobs.init();
		PluginTwilightForest.init();
		
    }
    
    public static AspectList creatureAspects(int size, Aspect... aspects)
    {
    	int sizeMod =  Math.max(Math.round((float)size / (float)aspects.length), 1);
    	AspectList result =  new AspectList().add(Aspect.BEAST, size);
    	for (Aspect aspect : aspects) result.add(aspect, sizeMod);
    	return result;
    }
    
    public static AspectList bossAspects(int amount, Aspect... aspects)
    {
    	AspectList result =  new AspectList()
    	.add(Aspect.EARTH, amount)
    	.add(Aspect.AIR, amount)
    	.add(Aspect.FIRE, amount)
    	.add(Aspect.ENTROPY, amount)
    	.add(Aspect.WATER, amount)
    	.add(Aspect.ORDER, amount)
    	;
    	
    	for (Aspect aspect : aspects) result.add(aspect, amount);
    	
    	return result;
    }
	
}