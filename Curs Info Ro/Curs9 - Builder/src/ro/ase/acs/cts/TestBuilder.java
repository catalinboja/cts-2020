package ro.ase.acs.cts;

import ro.ase.acs.cts.builder.DispozitivMobil;
import ro.ase.acs.cts.builder.DispozitivMobil.DispozitivMobilBuilder;
import ro.ase.acs.cts.builder2.ACMESmartDeviceBuilder;
import ro.ase.acs.cts.builder2.ConfiguratorDispozitiv;
import ro.ase.acs.cts.builder3.DispozitivMobilVer3;
import ro.ase.acs.cts.module.DisplaySuperAmoled;
import ro.ase.acs.cts.module.GPSIntern;
import ro.ase.acs.cts.module.SDCard;
import ro.ase.acs.cts.module.TelCoSIMCard;

public class TestBuilder {
	public static void main(String[] args){
		
		//creare & initializare obiect
		SmartDevice smartphone = new SmartDevice(
				"1",
				"2",
				true,
				new TelCoSIMCard(),
				new GPSIntern(),
				new DisplaySuperAmoled(5.1),
				new SDCard(64));
				
		SmartDevice smartphone2 = new SmartDevice(
				"3310",
				"Nokia",
				true,
				null,
				null,
				null,
				null);
		
		//1. creare obiect
		SmartDevice smartphone3 = new SmartDevice();
		//TO DO: nu uita sa si initializezi
		//2. initializare
		smartphone3.setModel("X5");
		
		//peste 1000 de linii de cod
		smartphone3.setProducator("Samsung");
		
		
		DispozitivMobil dMobil = 
				new DispozitivMobilBuilder("X", "Samsung")
				.adaugaWiFi()
				.adaugaCardMemorie(new SDCard(64))
				.build();
		
		DispozitivMobilVer3 dMobil3 = 
				new DispozitivMobilVer3.DispozitivMobilBuilder("X", "Samsung")
				.adaugaWiFi()
				.build();
		
		
		
	
	}

}
