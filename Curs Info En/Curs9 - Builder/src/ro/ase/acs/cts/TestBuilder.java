package ro.ase.acs.cts;

import ro.ase.acs.cts.builder.DispozitivMobil;
import ro.ase.acs.cts.builder.DispozitivMobil.DispozitivMobilBuilder;
import ro.ase.acs.cts.builder2.ACMESmartDeviceBuilder;
import ro.ase.acs.cts.builder2.ConfiguratorDispozitiv;
import ro.ase.acs.cts.module.DisplaySuperAmoled;
import ro.ase.acs.cts.module.GPSIntern;
import ro.ase.acs.cts.module.SDCard;
import ro.ase.acs.cts.module.TelCoSIMCard;

public class TestBuilder {
	public static void main(String[] args){
		
		
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
		
		SmartDevice smartphone3 = new SmartDevice();
		smartphone3.setModel("X1");
		//TO DO: don't forget to init SIM, manufacturer and .....
		
		
		
		DispozitivMobil smartphone4 = 
				new DispozitivMobil.DispozitivMobilBuilder("X6", "Samsung")
				.adaugaWiFi()
				.adaugaModulGPS(new GPSIntern())
				.build();
		
	
	}

}
