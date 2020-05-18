package ro.ase.csie.cts.g1084.seminar12;

import java.util.ArrayList;

import ro.ase.csie.cts.g1084.seminar12.adapter.AdaptorDisney2ACME;
import ro.ase.csie.cts.g1084.seminar12.adapter.CaracterACME;
import ro.ase.csie.cts.g1084.seminar12.adapter.CaracterDisney;
import ro.ase.csie.cts.g1084.seminar12.adapter.InterfataCaractereACME;
import ro.ase.csie.cts.g1084.seminar12.adapter.LooneyTune;

public class TestClientJoc {

	public static void main(String[] args) {
		
		ArrayList<InterfataCaractereACME> eroi = 
				new ArrayList<>();
		eroi.add(new CaracterACME("Superman", 1000));
		eroi.add(new CaracterACME("Batman", 800));
		
		for(InterfataCaractereACME erou : eroi) {
			erou.getDescriere();
			erou.esteAtacat(50);
		}
		
		CaracterDisney tweety = new LooneyTune("Teewty", 500);
		ArrayList<CaracterDisney> caractereDisney = 
				new ArrayList<>();
		caractereDisney.add(tweety);
		
		//Adapter
		//eroi.add(tweety);
		AdaptorDisney2ACME adaptorTweety = 
				new AdaptorDisney2ACME(tweety);
		eroi.add(adaptorTweety);
		
		System.out.println("------------------------");
		for(InterfataCaractereACME erou : eroi) {
			erou.getDescriere();
			erou.esteAtacat(50);
		}
		
		
		System.out.println("------------------------");
		
		
		//Decorator
		InterfataCaractereACME superman = 
				new CaracterACME("Superman", 1000);
		InterfataCaractereACME batman = 
				new CaracterACME("Batman", 1000);
		
		superman.getDescriere();
		superman.esteAtacat(200);
		superman.getDescriere();
		
		DecoratorScut supermanCuScut = 
				new DecoratorScut(superman, "Tip 1");
		supermanCuScut.esteAtacat(200);
		supermanCuScut.getDescriere();
		
		DecoratorRanitCritic batmanCuAlerta = 
				new DecoratorRanitCritic(batman);
		
		batmanCuAlerta.esteAtacat(950);
		batmanCuAlerta.getDescriere();
		
		DecoratorRanitCritic supermanCuScutCuAlerta  =
				new DecoratorRanitCritic(supermanCuScut);
		
		supermanCuScutCuAlerta.esteAtacat(1300);
		supermanCuScutCuAlerta.getDescriere();
		
		eroi.add(supermanCuScutCuAlerta);
		eroi.add(batmanCuAlerta);
	}

}
