package ro.ase.csie.cts.g1085.seminar11;

import java.util.ArrayList;

import ro.ase.csie.cts.g1085.seminar11.prototype.Model3DCaracter;

public class TestClientJoc {

	public static void main(String[] args) {
		
/*		Model3DCaracter soldat1 = 
				new Model3DCaracter("Soldat 1", "Soldat.3d");
		Model3DCaracter soldat2 = 
				new Model3DCaracter("Soldat 2", "Soldat.3d");
		Model3DCaracter soldat3 = 
				new Model3DCaracter("Soldat 3", "Soldat.3d");*/
		
		//cu prototype
		
		Model3DCaracter soldat = 
				new Model3DCaracter("Soldat", "Soldat.3d");
		
		Model3DCaracter soldat1 = (Model3DCaracter) soldat.clone();
		soldat1.setNume("Soldat 1");
		Model3DCaracter soldat2 = (Model3DCaracter) soldat.clone();
		soldat2.setNume("Soldat 2");
		Model3DCaracter soldat3 = (Model3DCaracter) soldat.clone();
		soldat3.setNume("Soldat 3");
		
		System.out.println("Caractere generate");
		
		System.out.println("-----------------------------------");
		
		//Adapter
		ArrayList<InterfataCaractereACME> supereroi = 
				new ArrayList<>();
		supereroi.add(new CaracterACME("Superman", 1000));
		supereroi.add(new CaracterACME("Batman", 1000));
		
		for(InterfataCaractereACME erou : supereroi) {
			erou.getDescriere();
			erou.esteAtacat(100);
		}
		
		ArrayList<CaracterDisney> eroiDisney = 
				new ArrayList<>();
		DisneyLooneyTune tweety = new DisneyLooneyTune("Tweety", 2000);
		eroiDisney.add(tweety);
		
		
		//Adaptor
		//supereroi.add(tweety);
		
		System.out.println("-----------------------------------");
		
		AdaptorDisney2Acme adaptorTweety = 
				new AdaptorDisney2Acme(tweety);
		supereroi.add(adaptorTweety);
		
		for(InterfataCaractereACME erou : supereroi) {
			erou.getDescriere();
			erou.esteAtacat(100);
		}
		
	}

}
