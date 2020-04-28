package ro.ase.csie.cts.g1074.seminar9;

import java.util.ArrayList;

import ro.ase.csie.cts.g1074.seminar9.factory.CaracterJocAbstract;
import ro.ase.csie.cts.g1074.seminar9.factory.FactoryCaractereJoc;
import ro.ase.csie.cts.g1074.seminar9.factory.TipuriCaractere;
import ro.ase.csie.cts.g1074.seminar9.singleton.ModulInterfataGrafica;
import ro.ase.csie.cts.g1074.seminar9.singleton.ModulSetariClient;

public class TestClientJoc {

	public static void main(String[] args) {
		
		ModulInterfataGrafica interfataGrafica = new ModulInterfataGrafica();
		ModulSetariClient setariClient = new ModulSetariClient();
		
		
		ArrayList<CaracterJocAbstract> personajeNivel1 = new ArrayList<>();
		
/*		CaracterPozitiv superman = new CaracterPozitiv();
		CaracterPozitiv batman = new CaracterPozitiv();
		CaracterNegativ joker = new CaracterNegativ();*/
		
		CaracterJocAbstract superman = FactoryCaractereJoc.getCaracter(
				TipuriCaractere.POZITIV, "Superman");
		CaracterJocAbstract batman = FactoryCaractereJoc.getCaracter(
				TipuriCaractere.POZITIV, "Batman");
		CaracterJocAbstract joker = FactoryCaractereJoc.getCaracter(
				TipuriCaractere.NEGATIV, "Joker");
		
		personajeNivel1.add(superman);
		personajeNivel1.add(batman);
		personajeNivel1.add(joker);
		
		for(CaracterJocAbstract personaj : personajeNivel1)
			System.out.println(personaj.getDescriere());
		
	}

}
