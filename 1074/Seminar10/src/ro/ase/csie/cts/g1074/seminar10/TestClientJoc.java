package ro.ase.csie.cts.g1074.seminar10;

import ro.ase.csie.cts.g1074.seminar10.builder.SuperErou;
import ro.ase.csie.cts.g1074.seminar10.prototype.Model3D;

public class TestClientJoc {

	public static void main(String[] args) {
		
		//Problema Builder
		
		// creare & initializare de obiecte
/*		SuperErou superman = 
				new SuperErou("Superman", 1000, true, false, null, null, "", "");
		SuperErou batman = 
				new SuperErou("Batman", 1000, true, false, null, null, "", "");
		SuperErou joker = 
				new SuperErou("Joker", 1000, true, false, null, null, "", "");*/
		
		
/*		//1. creare
		SuperErou superman2 = 
				new SuperErou();
		//2. initializare
		superman2.setNume("Superman");
		superman2.setPuncteViata(1000);
		//TODO: nu uita sa modifici si celelalte atribute
		//..... alte instructiuni
		superman2.setEstePozitiv(false);*/
		
		
		//Builder
		SuperErou superman = 
				new SuperErou.SuperErouBuilder("Superman", 500)
				.setEstePozitiv()
				.setEsteRanitCritic()
				.build();
		//superman.setEstePozitiv(true);
		
		//Prototype
		
/*		Model3D soldat1 = 
				new Model3D("Soldat.dat", "Soldat");
		Model3D soldat2 = 
				new Model3D("Soldat.dat", "Soldat");
		Model3D soldat3 = 
				new Model3D("Soldat.dat", "Soldat");*/
		
		Model3D prototipSoldat = new Model3D("Soldat.dat", "Soldat");
		Model3D soldat1 = (Model3D) prototipSoldat.clone();
		Model3D soldat2 = (Model3D) prototipSoldat.clone();		
		Model3D soldat3 = (Model3D) prototipSoldat.clone();
		
	}

}
