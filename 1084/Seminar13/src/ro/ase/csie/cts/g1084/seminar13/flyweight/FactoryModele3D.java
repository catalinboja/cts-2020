package ro.ase.csie.cts.g1084.seminar13.flyweight;

import java.util.HashMap;

public class FactoryModele3D {
	
	static HashMap<String, InterfataFlyModel3D> modele;
	
	//eager instantiation
	static {
		modele = new HashMap<>();
		modele.put("Copac", new FlyModel3D("copac.img", "Copac"));
		modele.put("Soldat", new FlyModel3D("soldat.img", "Soldat"));
	}
	
	public static InterfataFlyModel3D getModel(String tip) {
		InterfataFlyModel3D model = modele.get(tip);
		
		//pentru lazy
		/*if(model == null) {
			model = new FlyModel3D(tip+".img", tip);
			modele.put(tip, model);
		}*/
		
		return model;
	}
}
