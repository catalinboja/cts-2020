package ro.ase.cts.prototype.factory;

import java.util.HashMap;

import ro.ase.cts.prototype.Asteroid;
import ro.ase.cts.prototype.Model3D;
import ro.ase.cts.prototype.NavaSpatiala;

public class PrototypeFactory {
	
	private static HashMap<String,Model3D> prototipuri = new HashMap<>();
	
	static {
		//incarca prototipuri
		
		System.out.println("Initializare prototipuri modele...");
		
		NavaSpatiala modelNava = new NavaSpatiala("Nava tip 1");
		modelNava.setId("nava");
		
		prototipuri.put("nava", modelNava);
		
		Asteroid modelAsteroid = new Asteroid();
		modelAsteroid.setId("asteroid");
		
		prototipuri.put("asteroid", modelAsteroid);
	}
	
	//metoda factory prototype
	public static Model3D getPrototip(String id){
		Model3D copiePrototip = null;
		Model3D prototip = prototipuri.get(id);
		if(prototip!=null)
			copiePrototip = (Model3D) prototip.clone();
		
		return copiePrototip;
		
	}

}
