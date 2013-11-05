package iguanaman.thaumcraftmobaspects;

import cpw.mods.fml.common.Loader;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class PluginSpecialMobs {

	public static void init()
	{

		if (Loader.isModLoaded("SpecialMobs"))
		{

			//CREEPERS
			AspectList creeperAspects = new AspectList().add(Aspect.PLANT, 2).add(Aspect.FIRE, 2);
			ThaumcraftApi.registerEntityTag("SpecialMobs.ArmorCreeper", creeperAspects.add(Aspect.ARMOR, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.DeathCreeper", creeperAspects.add(Aspect.DEATH, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.DirtCreeper", creeperAspects.add(Aspect.EARTH, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.DoomCreeper", creeperAspects.add(Aspect.ENERGY, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.EnderCreeper", creeperAspects.add(Aspect.ELDRITCH, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.FireCreeper", creeperAspects.add(Aspect.FIRE, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.JumpingCreeper", creeperAspects.add(Aspect.AIR, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.LightningCreeper", creeperAspects.add(Aspect.WEATHER, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.SpecialCreeper", creeperAspects);

			//ENDERMEN
			AspectList endermanAspects = new AspectList().add(Aspect.ELDRITCH, 4).add(Aspect.AIR, 2).add(Aspect.TRAVEL, 2);
			ThaumcraftApi.registerEntityTag("SpecialMobs.AncientEnderman", endermanAspects.add(Aspect.ELDRITCH, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.BlindingEnderman", endermanAspects.add(Aspect.DARKNESS, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.ConfusingEnderman", endermanAspects.add(Aspect.SENSES, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.CursedEnderman", endermanAspects.add(Aspect.SOUL, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.IcyEnderman", endermanAspects.add(Aspect.ICE, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.LightningEnderman", endermanAspects.add(Aspect.WEATHER, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.MirageEnderman", endermanAspects.add(Aspect.VOID, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.SpecialEnderman", endermanAspects);
			ThaumcraftApi.registerEntityTag("SpecialMobs.StrikeEnderman", endermanAspects.add(Aspect.ARMOR, 1));

			//GHASTS
			AspectList ghastAspects = new AspectList().add(Aspect.UNDEAD, 2).add(Aspect.FIRE, 2);
			ThaumcraftApi.registerEntityTag("SpecialMobs.BabyGhast", new AspectList().add(Aspect.UNDEAD, 1).add(Aspect.FIRE, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.FighterGhast", ghastAspects);
			ThaumcraftApi.registerEntityTag("SpecialMobs.GhastMount", ghastAspects);
			ThaumcraftApi.registerEntityTag("SpecialMobs.KingGhast", ghastAspects.add(Aspect.UNDEAD, 1).add(Aspect.FIRE, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.QueenGhast", ghastAspects.add(Aspect.UNDEAD, 2).add(Aspect.FIRE, 2));
			ThaumcraftApi.registerEntityTag("SpecialMobs.SpecialGhast", ghastAspects);
			
			//SKELETONS
			AspectList skeletonAspects = new AspectList().add(Aspect.UNDEAD, 3).add(Aspect.MAN, 1).add(Aspect.EARTH, 1);
			ThaumcraftApi.registerEntityTag("SpecialMobs.FireSkeleton", skeletonAspects.add(Aspect.FIRE, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.GatlingSkeleton", skeletonAspects.add(Aspect.MECHANISM, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.GiantSkeleton", new AspectList().add(Aspect.UNDEAD, 6).add(Aspect.MAN, 2).add(Aspect.EARTH, 2));
			ThaumcraftApi.registerEntityTag("SpecialMobs.PoisonSkeleton", skeletonAspects.add(Aspect.POISON, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.QuickSkeleton", skeletonAspects.add(Aspect.MOTION, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.SpecialSkeleton", skeletonAspects);
			ThaumcraftApi.registerEntityTag("SpecialMobs.SpitfireSkeleton", skeletonAspects);
			ThaumcraftApi.registerEntityTag("SpecialMobs.ThiefSkeleton", skeletonAspects.add(Aspect.GREED, 1));
			
			//SPIDERS
			AspectList spiderAspects = new AspectList().add(Aspect.BEAST, 3).add(Aspect.ENTROPY, 2);
			ThaumcraftApi.registerEntityTag("SpecialMobs.AngrySpider", spiderAspects.add(Aspect.ENTROPY, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.ArmorSpider", spiderAspects.add(Aspect.ARMOR, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.BabySpider", new AspectList().add(Aspect.BEAST, 1).add(Aspect.ENTROPY, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.DesertSpider", spiderAspects.add(Aspect.EARTH, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.FlyingSpider", spiderAspects.add(Aspect.FLIGHT, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.GiantSpider", new AspectList().add(Aspect.BEAST, 4).add(Aspect.ENTROPY, 3));
			ThaumcraftApi.registerEntityTag("SpecialMobs.MotherSpider", spiderAspects.add(Aspect.HEAL, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.PaleSpider", spiderAspects.add(Aspect.POISON, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.PoisonSpider", spiderAspects.add(Aspect.POISON, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.SmallSpider", new AspectList().add(Aspect.BEAST, 2).add(Aspect.ENTROPY, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.SpecialSpider", spiderAspects);
			ThaumcraftApi.registerEntityTag("SpecialMobs.SpeedySpider", spiderAspects.add(Aspect.MOTION, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.ToughSpider", spiderAspects.add(Aspect.LIFE, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.WitchSpider", spiderAspects.add(Aspect.MAGIC, 1));
			
			//ZOMBIES
			AspectList zombieAspects = new AspectList().add(Aspect.UNDEAD, 2).add(Aspect.MAN, 1).add(Aspect.EARTH, 1);
			ThaumcraftApi.registerEntityTag("SpecialMobs.FireZombie", zombieAspects.add(Aspect.FIRE, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.FishingZombie", zombieAspects.add(Aspect.TOOL, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.GiantZombie", new AspectList().add(Aspect.UNDEAD, 4).add(Aspect.MAN, 2).add(Aspect.EARTH, 2));
			ThaumcraftApi.registerEntityTag("SpecialMobs.HungryZombie", zombieAspects.add(Aspect.HUNGER, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.PlagueZombie", zombieAspects.add(Aspect.POISON, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.SpecialZombie", zombieAspects);
			ThaumcraftApi.registerEntityTag("SpecialMobs.SteveZombie", zombieAspects.add(Aspect.MAN, 1));
			
			//ZOMBIE PIGMEN
			AspectList zombiePigmanAspects = new AspectList().add(Aspect.UNDEAD, 4).add(Aspect.FIRE, 2);
			ThaumcraftApi.registerEntityTag("SpecialMobs.AngryZombiePigman", zombiePigmanAspects.add(Aspect.ENTROPY, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.ChargingZombiePigman", zombiePigmanAspects.add(Aspect.ENERGY, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.FishingZombiePigman", zombiePigmanAspects.add(Aspect.TOOL, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.GiantZombiePigman", new AspectList().add(Aspect.UNDEAD, 6).add(Aspect.FIRE, 3));
			ThaumcraftApi.registerEntityTag("SpecialMobs.HungryZombiePigman", zombiePigmanAspects.add(Aspect.HUNGER, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.JumpingZombiePigman", zombiePigmanAspects.add(Aspect.AIR, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.PlagueZombiePigman", zombiePigmanAspects.add(Aspect.POISON, 1));
			ThaumcraftApi.registerEntityTag("SpecialMobs.SpecialZombiePigman", zombiePigmanAspects);
			
		}
		
	}	
    
    public static AspectList creatureAspects(int size, Aspect... aspects)
    {
    	return ThaumcraftMobAspects.creatureAspects(size, aspects);
    }

}
