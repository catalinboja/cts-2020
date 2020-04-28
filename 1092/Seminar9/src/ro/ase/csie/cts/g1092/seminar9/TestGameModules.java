package ro.ase.csie.cts.g1092.seminar9;

import ro.ase.csie.cts.g1092.seminar9.singleton.DataModule;
import ro.ase.csie.cts.g1092.seminar9.singleton.InterfaceModule;
import ro.ase.csie.cts.g1092.seminar9.singleton.Logger;

public class TestGameModules {

	public static void main(String[] args) {
		
		//Singleton
		
		//Logger log = Logger.getTheLogger();
		
		InterfaceModule guiModule= new InterfaceModule();
		DataModule dataModule = new DataModule();

		
		//log.write("Starting the app");
		
		//Builder
		
/*		//1 create the object
		SuperHero superHero = new SuperHero();
		//2 init the object
		superHero.setName("Superman");
		//after 1000 lines of code
		//......
		superHero.setLifePoints(1000);*/
		
		
		//create & init
/*		SuperHero batman = 
				new SuperHero("Batman", 1000, true, false, "", null, "Fly");*/
		
		
		
		SuperHero batman = 
				new SuperHero.SuperHeroBuilder("Batman", 500)
				.isCriticalWounded()
				.addRightHandWeapon("Pistol")
				.build();
		
	}

}
