package ro.ase.csie.cts.g1084.seminar9.clientjoc;

import ro.ase.csie.cts.g1084.seminar9.simplefactory.CaracterJoc;
import ro.ase.csie.cts.g1084.seminar9.simplefactory.FactoryCaractereJoc;
import ro.ase.csie.cts.g1084.seminar9.simplefactory.PersonajNegativ;
import ro.ase.csie.cts.g1084.seminar9.simplefactory.PersonajPozitiv;
import ro.ase.csie.cts.g1084.seminar9.simplefactory.TipCaractere;
import ro.ase.csie.cts.g1084.seminar9.singleton.ContJucator;
import ro.ase.csie.cts.g1084.seminar9.singleton.ExceptieCreareJucator;

public class TestJoc {

	public static void main(String[] args) {
		
		//Singleton

		// nu mai este posibila creare de obiecte multiple
		/*
		 * ContJucator jucator1 = new ContJucator("Superman","123456"); ContJucator
		 * jucator2 = new ContJucator("Batman","123456");
		 * 
		 * ContJucator jucator3 = new ContJucator();
		 */

		try {

			//ContJucator jucator1 = ContJucator.getJucator("Superman", "123456");
			//ContJucator jucator2 = ContJucator.getJucator("Batman", "123456");

			//varianta in care se foloseste constructorul default
			ContJucator jucator1 = ContJucator.getJucator();
			ContJucator jucator2 = ContJucator.getJucator();
			
			System.out.println(jucator1);
			System.out.println(jucator2);
			
			ContJucator jucator3 = ContJucator.getJucator("Superman", "123456");

		} catch (ExceptieCreareJucator e) {
			System.out.println("S-a incercat crearea unui jucator diferit !");
		}
		
		//Simple Factory
/*		CaracterJoc caracterPozitiv1 = 
				new PersonajPozitiv();
		CaracterJoc caracterPozitiv2 = 
				new PersonajPozitiv();
		CaracterJoc caracterNegativ1 = 
				new PersonajNegativ();*/
		
		CaracterJoc caracterPozitiv1 = 
				FactoryCaractereJoc.getCaractereJoc(
						"Superman", TipCaractere.POZITIV);
		CaracterJoc caracterPozitiv2 = 
				FactoryCaractereJoc.getCaractereJoc(
						"Batman", TipCaractere.POZITIV);
		CaracterJoc caracterNegativ1 = 
				FactoryCaractereJoc.getCaractereJoc(
						"Joker", TipCaractere.NEGATIV);

	}

}
