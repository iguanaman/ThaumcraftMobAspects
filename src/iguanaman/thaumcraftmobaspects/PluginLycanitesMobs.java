package iguanaman.thaumcraftmobaspects;

import cpw.mods.fml.common.Loader;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class PluginLycanitesMobs {

	public static void init()
	{

		if (Loader.isModLoaded("LycanitesMobs"))
		{
			// DEMON
			ThaumcraftApi.registerEntityTag("Asmodi", new AspectList().add(Aspect.METAL, 3).add(Aspect.MECHANISM, 2).add(Aspect.MIND, 1).add(Aspect.ENTROPY, 1));
			ThaumcraftApi.registerEntityTag("Behemoth", creatureAspects(4, Aspect.FIRE).add(Aspect.ENTROPY, 1));
			ThaumcraftApi.registerEntityTag("Belph", new AspectList().add(Aspect.FIRE, 2).add(Aspect.MAGIC, 1).add(Aspect.ENTROPY, 1));
			ThaumcraftApi.registerEntityTag("Cacodemon", new AspectList().add(Aspect.FLIGHT, 3).add(Aspect.AIR, 3).add(Aspect.ENERGY, 2).add(Aspect.ENTROPY, 1));
			ThaumcraftApi.registerEntityTag("NetherSoul", new AspectList().add(Aspect.FLIGHT, 2).add(Aspect.AIR, 2).add(Aspect.FIRE, 2).add(Aspect.ENERGY, 1));
			ThaumcraftApi.registerEntityTag("Pinky", new AspectList().add(Aspect.HUNGER, 2).add(Aspect.FLESH, 2).add(Aspect.GREED, 2));
			ThaumcraftApi.registerEntityTag("Trite", creatureAspects(2, Aspect.ENTROPY));
			
			// DESERT
			ThaumcraftApi.registerEntityTag("CryptZombie", new AspectList().add(Aspect.UNDEAD, 2).add(Aspect.MAN, 1).add(Aspect.EARTH, 1).add(Aspect.CLOTH, 1));
			
			// SWAMP
			ThaumcraftApi.registerEntityTag("GhoulZombie", new AspectList().add(Aspect.UNDEAD, 2).add(Aspect.MAN, 1).add(Aspect.EARTH, 1).add(Aspect.POISON, 1));
		}
		
	}	
    
    public static AspectList creatureAspects(int size, Aspect... aspects)
    {
    	return ThaumcraftMobAspects.creatureAspects(size, aspects);
    }

}
