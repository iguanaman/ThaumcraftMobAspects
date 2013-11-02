package iguanaman.thaumcraftmobaspects;

import cpw.mods.fml.common.Loader;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class PluginTwilightForest {

	public static void init()
	{

		if (Loader.isModLoaded("TwilightForest"))
		{
			ThaumcraftApi.registerEntityTag("TwilightForest.Bighorn Sheep", creatureAspects(2, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("TwilightForest.Block&Chain Goblin", creatureAspects(2, Aspect.EARTH).add(Aspect.WEAPON, 1).add(Aspect.ARMOR, 1));
			//ThaumcraftApi.registerEntityTag("TwilightForest.Boggard", );
			ThaumcraftApi.registerEntityTag("TwilightForest.Death Tome", new AspectList().add(Aspect.MIND, 3).add(Aspect.SOUL, 2).add(Aspect.TRAP, 1));
			ThaumcraftApi.registerEntityTag("TwilightForest.Fire Beetle", creatureAspects(2, Aspect.FIRE));
			ThaumcraftApi.registerEntityTag("TwilightForest.Firefly", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT));
			ThaumcraftApi.registerEntityTag("TwilightForest.Forest Bunny", creatureAspects(2, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("TwilightForest.Forest Raven", creatureAspects(2, Aspect.AIR, Aspect.FLIGHT));
			ThaumcraftApi.registerEntityTag("TwilightForest.Forest Squirrel", creatureAspects(2, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("TwilightForest.Hedge Spider", new AspectList().add(Aspect.BEAST, 3).add(Aspect.ENTROPY, 2));
			ThaumcraftApi.registerEntityTag("TwilightForest.Helmet Crab", creatureAspects(2, Aspect.EARTH, Aspect.WATER));
			ThaumcraftApi.registerEntityTag("TwilightForest.Hostile Wolf", creatureAspects(3, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("TwilightForest.Hydra", bossAspects(7, Aspect.ARMOR, Aspect.GREED));
			ThaumcraftApi.registerEntityTag("TwilightForest.HydraHead", bossAspects(7, Aspect.WEAPON, Aspect.ENERGY, Aspect.MIND));
			ThaumcraftApi.registerEntityTag("TwilightForest.King Spider", new AspectList().add(Aspect.BEAST, 6).add(Aspect.ENTROPY, 4));
			//ThaumcraftApi.registerEntityTag("TwilightForest.Knight Phantom", );
			ThaumcraftApi.registerEntityTag("TwilightForest.Lich Minion", new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.MAN, 2).add(Aspect.EARTH, 2));
			ThaumcraftApi.registerEntityTag("TwilightForest.Lower Goblin Knight", creatureAspects(2, Aspect.EARTH).add(Aspect.WEAPON, 1).add(Aspect.ARMOR, 1));
			ThaumcraftApi.registerEntityTag("TwilightForest.Loyal Zombie", new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.MAN, 2).add(Aspect.EARTH, 2));
			ThaumcraftApi.registerEntityTag("TwilightForest.Maze Slime", new AspectList().add(Aspect.SLIME, 2).add(Aspect.WATER, 2));
			ThaumcraftApi.registerEntityTag("TwilightForest.Mini Ghast", new AspectList().add(Aspect.UNDEAD, 2).add(Aspect.FIRE, 1));
			ThaumcraftApi.registerEntityTag("TwilightForest.Minoshroom", bossAspects(6, Aspect.MAN, Aspect.BEAST, Aspect.PLANT, Aspect.GREED, Aspect.DARKNESS).add(Aspect.WEAPON, 1));
			ThaumcraftApi.registerEntityTag("TwilightForest.Minotaur", creatureAspects(3, Aspect.EARTH).add(Aspect.WEAPON, 1));
			ThaumcraftApi.registerEntityTag("TwilightForest.Mist Wolf", creatureAspects(3, Aspect.EARTH).add(Aspect.DARKNESS, 2));
			ThaumcraftApi.registerEntityTag("TwilightForest.Mosquito Swarm", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT));
			ThaumcraftApi.registerEntityTag("TwilightForest.Naga", bossAspects(7, Aspect.BEAST, Aspect.POISON));
			ThaumcraftApi.registerEntityTag("TwilightForest.Penguin", creatureAspects(3, Aspect.ICE).add(Aspect.WATER, 2));
			ThaumcraftApi.registerEntityTag("TwilightForest.Pinch Beetle", creatureAspects(2, Aspect.EARTH).add(Aspect.WEAPON, 2));
			ThaumcraftApi.registerEntityTag("TwilightForest.Questing Ram", creatureAspects(4, Aspect.EARTH).add(Aspect.CLOTH, 4));
			ThaumcraftApi.registerEntityTag("TwilightForest.Redcap", creatureAspects(2, Aspect.EARTH).add(Aspect.METAL, 1));
			ThaumcraftApi.registerEntityTag("TwilightForest.Redcap Sapper", creatureAspects(2, Aspect.EARTH).add(Aspect.METAL, 1));
			ThaumcraftApi.registerEntityTag("TwilightForest.Redscale Broodling", creatureAspects(1, Aspect.ENTROPY));
			ThaumcraftApi.registerEntityTag("TwilightForest.Skeleton Druid", new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.MAN, 2).add(Aspect.EARTH, 1).add(Aspect.POISON, 1).add(Aspect.MAGIC, 1));
			ThaumcraftApi.registerEntityTag("TwilightForest.Slime Beetle", creatureAspects(2, Aspect.SLIME));
			ThaumcraftApi.registerEntityTag("TwilightForest.Swarm Spider", creatureAspects(1, Aspect.ENTROPY));
			ThaumcraftApi.registerEntityTag("TwilightForest.Tiny Bird", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT));
			ThaumcraftApi.registerEntityTag("TwilightForest.Tower Boss", bossAspects(10, Aspect.UNDEAD, Aspect.FLIGHT, Aspect.ENTROPY));
			ThaumcraftApi.registerEntityTag("TwilightForest.Tower Ghast", new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.FIRE, 2));
			ThaumcraftApi.registerEntityTag("TwilightForest.Tower Golem", new AspectList().add(Aspect.METAL, 4).add(Aspect.EARTH, 3));
			ThaumcraftApi.registerEntityTag("TwilightForest.Tower Termite", creatureAspects(1, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("TwilightForest.Twilight Kobold", creatureAspects(2, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("TwilightForest.Twilight Lich", bossAspects(10, Aspect.UNDEAD, Aspect.MAGIC, Aspect.MIND));
			ThaumcraftApi.registerEntityTag("TwilightForest.Twilight Wraith", new AspectList().add(Aspect.SOUL, 3).add(Aspect.GREED, 3).add(Aspect.DARKNESS, 2));
			ThaumcraftApi.registerEntityTag("TwilightForest.Upper Goblin Knight", creatureAspects(2, Aspect.EARTH).add(Aspect.WEAPON, 1).add(Aspect.ARMOR, 1));
			ThaumcraftApi.registerEntityTag("TwilightForest.Wild Boar", creatureAspects(2, Aspect.EARTH).add(Aspect.WEAPON, 1));
			ThaumcraftApi.registerEntityTag("TwilightForest.Wild Deer", creatureAspects(2, Aspect.EARTH));
		}
		
	}
    
    public static AspectList creatureAspects(int size, Aspect... aspects)
    {
    	return ThaumcraftMobAspects.creatureAspects(size, aspects);
    }
    
    public static AspectList bossAspects(int amount, Aspect... aspects)
    {
    	return ThaumcraftMobAspects.bossAspects(amount, aspects);
    }

}
