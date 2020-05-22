package ro.ase.csie.cts.g1084.seminar13;

import java.util.ArrayList;
import java.util.Random;

import javax.management.ObjectInstance;

import ro.ase.csie.cts.g1084.seminar13.composite.CaracterJoc;
import ro.ase.csie.cts.g1084.seminar13.composite.Grup;
import ro.ase.csie.cts.g1084.seminar13.flyweight.DetaliiAfisareEcran;
import ro.ase.csie.cts.g1084.seminar13.flyweight.FactoryModele3D;
import ro.ase.csie.cts.g1084.seminar13.flyweight.InterfataFlyModel3D;

public class TestClientJoc {
	
	public static void main(String[] args) {
		
		//Composite
		CaracterJoc superman = new CaracterJoc("Superman");
		CaracterJoc batman = new CaracterJoc("Batman");
		
		Grup echipa1 = new Grup("Echipa Rosie");
		echipa1.adauga(batman);
		echipa1.adauga(superman);
		
		Grup echipa2 = new Grup("Super echipa");
		echipa2.adauga(echipa1);
		echipa2.adauga(new CaracterJoc("Catwoman"));
		
		echipa2.ataca("Joker");
		echipa2.seApara();
		echipa2.get("Catwoman").seVindeca(100);
		
		//Flyweight
		ArrayList<InterfataFlyModel3D> obiecteEcran = new ArrayList<>();
		obiecteEcran.add(FactoryModele3D.getModel("Copac"));
		obiecteEcran.add(FactoryModele3D.getModel("Copac"));
		obiecteEcran.add(FactoryModele3D.getModel("Copac"));
		obiecteEcran.add(FactoryModele3D.getModel("Soldat"));
		obiecteEcran.add(FactoryModele3D.getModel("Soldat"));
		
		String[] culori = new String[] {"albastru", "verde", "rosu"};
		Random random = new Random();
		
		for(InterfataFlyModel3D model : obiecteEcran) {
			DetaliiAfisareEcran detalii = 
					new DetaliiAfisareEcran(random.nextInt(100),
							random.nextInt(100), culori[random.nextInt(3)]);
			model.afisareEcranModel3D(detalii);
		}
	
		
		//Observer
		ModulStareConexiune stareConexiune = new ModulStareConexiune();
		
		stareConexiune.notificareConexiunePierduta();
		
		ModulInstantaJoc instantJoc = new ModulInstantaJoc();
		
		stareConexiune.addListener(instantJoc);
		stareConexiune.addListener(new ModulInterfataJoc());
		
		stareConexiune.notificareConexiunePierduta();
		
		stareConexiune.removeListener(instantJoc);
		
		stareConexiune.notificareConexiunePierduta();
		
		stareConexiune.addListener(new NotificareConexiune() {
			@Override
			public void conexiuneInchisa() {
				System.out.println(
						"Observator eveniment. Conexiune pierduta");
			}
		});
		
		stareConexiune.notificareConexiunePierduta();
		
	}
}
