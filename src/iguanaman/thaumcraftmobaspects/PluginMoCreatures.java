package iguanaman.thaumcraftmobaspects;

import cpw.mods.fml.common.Loader;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class PluginMoCreatures {

	public static void init()
	{

		if (Loader.isModLoaded("MoCreatures"))
		{
			ThaumcraftApi.registerEntityTag("MoCreatures.Ant", creatureAspects(1, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.Bear", creatureAspects(3, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.Bee", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT));
			ThaumcraftApi.registerEntityTag("MoCreatures.BigCat", creatureAspects(3, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.BigGolem", new AspectList().add(Aspect.METAL, 4).add(Aspect.MECHANISM, 2).add(Aspect.GREED, 1));
			ThaumcraftApi.registerEntityTag("MoCreatures.Bird", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT));
			ThaumcraftApi.registerEntityTag("MoCreatures.Boar", creatureAspects(2, Aspect.EARTH).add(Aspect.WEAPON, 1));
			ThaumcraftApi.registerEntityTag("MoCreatures.Bunny", creatureAspects(2, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.ButterFly", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT));
			ThaumcraftApi.registerEntityTag("MoCreatures.Crab", creatureAspects(2, Aspect.EARTH, Aspect.WATER));
			ThaumcraftApi.registerEntityTag("MoCreatures.Cricket", creatureAspects(1, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.Crocodile", creatureAspects(3, Aspect.WATER, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.Deer", creatureAspects(2, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.Dolphin", creatureAspects(3, Aspect.WATER));
			ThaumcraftApi.registerEntityTag("MoCreatures.DragonFly", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT));
			ThaumcraftApi.registerEntityTag("MoCreatures.Duck", creatureAspects(2, Aspect.EARTH, Aspect.FLIGHT));
			ThaumcraftApi.registerEntityTag("MoCreatures.Egg", new AspectList().add(Aspect.SEED, 1).add(Aspect.LIFE, 1).add(Aspect.BEAST, 1));
			ThaumcraftApi.registerEntityTag("MoCreatures.Elephant", creatureAspects(4, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.Firefly", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT));
			ThaumcraftApi.registerEntityTag("MoCreatures.Fishbowl", new AspectList().add(Aspect.WATER, 1).add(Aspect.CRYSTAL, 1));
			ThaumcraftApi.registerEntityTag("MoCreatures.Fishy", creatureAspects(1, Aspect.WATER));
			ThaumcraftApi.registerEntityTag("MoCreatures.FlameWraith", new AspectList().add(Aspect.SOUL, 3).add(Aspect.FIRE, 3));
			ThaumcraftApi.registerEntityTag("MoCreatures.Fly", creatureAspects(1, Aspect.AIR, Aspect.FLIGHT));
			ThaumcraftApi.registerEntityTag("MoCreatures.Fox", creatureAspects(2, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.Goat", creatureAspects(2, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.HellRat", new AspectList().add(Aspect.BEAST, 2).add(Aspect.FIRE, 1));
			ThaumcraftApi.registerEntityTag("MoCreatures.HorseMob", new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.EARTH, 1).add(Aspect.AIR, 1));
			ThaumcraftApi.registerEntityTag("MoCreatures.JellyFish", creatureAspects(2, Aspect.WATER));
			ThaumcraftApi.registerEntityTag("MoCreatures.Kitty", creatureAspects(2, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.KittyBed", new AspectList().add(Aspect.CLOTH, 1).add(Aspect.TREE, 1));
			ThaumcraftApi.registerEntityTag("MoCreatures.KomodoDragon", new AspectList().add(Aspect.BEAST, 3).add(Aspect.POISON, 2));
			ThaumcraftApi.registerEntityTag("MoCreatures.LitterBox", new AspectList().add(Aspect.EARTH, 1).add(Aspect.TREE, 1));
			ThaumcraftApi.registerEntityTag("MoCreatures.Maggot", creatureAspects(1, Aspect.EARTH, Aspect.ENTROPY));
			ThaumcraftApi.registerEntityTag("MoCreatures.MediumFish", creatureAspects(2, Aspect.WATER));
			ThaumcraftApi.registerEntityTag("MoCreatures.MiniGolem", new AspectList().add(Aspect.METAL, 2).add(Aspect.MECHANISM, 1).add(Aspect.GREED, 1));
			ThaumcraftApi.registerEntityTag("MoCreatures.Mouse", creatureAspects(1, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.Ogre", new AspectList().add(Aspect.BEAST, 4).add(Aspect.DARKNESS, 3));
			ThaumcraftApi.registerEntityTag("MoCreatures.Ostrich", creatureAspects(2, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.PetScorpion", new AspectList().add(Aspect.BEAST, 3).add(Aspect.WEAPON, 1).add(Aspect.POISON, 1));
			ThaumcraftApi.registerEntityTag("MoCreatures.Piranha", creatureAspects(1, Aspect.WATER));
			ThaumcraftApi.registerEntityTag("MoCreatures.Raccoon", creatureAspects(2, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.Rat", creatureAspects(2, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.Ray", creatureAspects(2, Aspect.WATER));
			ThaumcraftApi.registerEntityTag("MoCreatures.Roach", creatureAspects(1, Aspect.EARTH, Aspect.ENTROPY));
			ThaumcraftApi.registerEntityTag("MoCreatures.Scorpion", new AspectList().add(Aspect.BEAST, 3).add(Aspect.WEAPON, 1).add(Aspect.POISON, 1));
			ThaumcraftApi.registerEntityTag("MoCreatures.Shark", creatureAspects(3, Aspect.WATER));
			ThaumcraftApi.registerEntityTag("MoCreatures.SilverSkeleton", new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.METAL, 1).add(Aspect.ARMOR, 1));
			ThaumcraftApi.registerEntityTag("MoCreatures.SmallFish", creatureAspects(1, Aspect.WATER));
			ThaumcraftApi.registerEntityTag("MoCreatures.Snail", creatureAspects(1, Aspect.SLIME));
			ThaumcraftApi.registerEntityTag("MoCreatures.Snake", creatureAspects(2, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.Turkey", creatureAspects(2, Aspect.FLIGHT, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.Turtle", creatureAspects(2, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.WWolf", creatureAspects(3, Aspect.EARTH));
			ThaumcraftApi.registerEntityTag("MoCreatures.Werewolf", new AspectList().add(Aspect.BEAST, 3).add(Aspect.MAN, 3));
			ThaumcraftApi.registerEntityTag("MoCreatures.WildHorse", new AspectList().add(Aspect.BEAST, 4).add(Aspect.EARTH, 1).add(Aspect.AIR, 1));
			ThaumcraftApi.registerEntityTag("MoCreatures.Wraith", new AspectList().add(Aspect.SOUL, 3).add(Aspect.ENTROPY, 3));
			ThaumcraftApi.registerEntityTag("MoCreatures.Wyvern", new AspectList().add(Aspect.BEAST, 5).add(Aspect.FLIGHT, 3).add(Aspect.AIR, 3));
		}
	}	
    
    public static AspectList creatureAspects(int size, Aspect... aspects)
    {
    	return ThaumcraftMobAspects.creatureAspects(size, aspects);
    }

}
