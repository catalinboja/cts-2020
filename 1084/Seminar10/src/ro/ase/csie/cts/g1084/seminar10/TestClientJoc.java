package ro.ase.csie.cts.g1084.seminar10;

import ro.ase.csie.cts.g1084.seminar10.builder.SuperErou;

public class TestClientJoc {

	public static void main(String[] args) {
		
		//1 creare si initializare
/*		SuperErou superman = 
				new SuperErou("Superman", true, false, 
						"Zboara", "", null, null);
		SuperErou batman = 
				new SuperErou("Batman", true, false, 
						"", "", null, null);
		SuperErou joker = 
				new SuperErou("Joker", false, false, 
						"", "", null, null);*/
		
		
		
		//1 creare 
/*		SuperErou superErou = 
				new SuperErou();*/
		//2 initializare
		//TODO: nu uita sa initializezi armele
/*		superErou.setNume("Catwoman");
		superErou.setEstePozitiv(true);*/
		//....
		
		
		//creare si initializare
		SuperErou Superman = 
				new SuperErou.SuperErouBuilder("Superman")
				.estePozitiv()
				.esteRanitCritic()
				.setSuperPutere("Zboara")
				.build();

		
		//Prototype
		
/*		Model3DCaracterJoc soldat1 = new Model3DCaracterJoc("Soldat.dat");
		Model3DCaracterJoc soldat2= new Model3DCaracterJoc("Soldat.dat");
		
		soldat1.setCuloare("Rosu");
		soldat2.setCuloare("Albastru");*/
		

		
		Model3DCaracterJoc soldatGeneric = 
				new Model3DCaracterJoc("Soldat.dat");
		Model3DCaracterJoc soldat3 = (Model3DCaracterJoc) soldatGeneric.clone();
		Model3DCaracterJoc soldat4 = (Model3DCaracterJoc) soldatGeneric.clone();
		Model3DCaracterJoc soldat5 = (Model3DCaracterJoc) soldatGeneric.clone();
		
		
		System.out.println("Start joc");
		
	}

}
