package ro.ase.csie.cts.g1074.seminar13.flyweight;

import java.util.HashMap;

public class FactoryFlyweight {
	
	private static HashMap<TipModel3D, InterfataFlyModel3D> modele3D = 
			new HashMap<>();
	
	//versiune eager instantiation
/*	static {
		getModel(TipModel3D.COPAC);
		getModel(TipModel3D.SOLDAT);
		getModel(TipModel3D.STANCA);
	}*/
	
	public static InterfataFlyModel3D getModel(TipModel3D tip) {
		//versiune lazy instantiation
		InterfataFlyModel3D model = modele3D.get(tip);
		
		if(model == null) {		
			switch(tip) {
			case COPAC:
				model = new FlyModel3D("copac.img", "Copac");
				break;
			case STANCA:
				model = new FlyModel3D("stanca.img", "Stanca");
				break;
			case SOLDAT:
				model = new FlyModel3D("soldat.img", "Soldat");
				break;
			default:
					throw new UnsupportedOperationException();		
			}
			
			modele3D.put(tip, model);	
		}
		
		return model;
	}
	
	
}
