package ro.ase.cts.g1085.seminar10;

import java.util.ArrayList;

import ro.ase.cts.g1085.seminar10.builder.SuperErou;
import ro.ase.cts.g1085.seminar10.factory.FactoryAbstractPersonaje;
import ro.ase.cts.g1085.seminar10.factory.FactoryPersonajeDisney;
import ro.ase.cts.g1085.seminar10.factory.FactoryPersonajePixar;
import ro.ase.cts.g1085.seminar10.simplefactory.FactoryPersonajeJoc;
import ro.ase.cts.g1085.seminar10.simplefactory.PersonajAbstract;
import ro.ase.cts.g1085.seminar10.simplefactory.TipPersonaj;

public class TestClientJoc {

	public static void main(String[] args) {
		
		ArrayList<PersonajAbstract> personaje = 
				 new ArrayList<>();
		
/*		personaje.add(new PersonajPozitiv());
		personaje.add(new PersonajNegativ());
		personaje.add(new PersonajNeutru());
		
		for(PersonajAbstract pers : personaje)
			pers.faceCeva();*/
		
		
		//Simple factory
		personaje.add(
				FactoryPersonajeJoc.getPersonaj(TipPersonaj.POZITIV));
		personaje.add(
				FactoryPersonajeJoc.getPersonaj(TipPersonaj.NEGATIV));
		personaje.add(
				FactoryPersonajeJoc.getPersonaj(TipPersonaj.NEUTRU));
		
		for(PersonajAbstract pers : personaje)
			pers.faceCeva();
		
		//Factory method
		FactoryAbstractPersonaje factory = null;
		int optiuneJucator = 1;
		if(optiuneJucator == 1)
			factory = new FactoryPersonajeDisney();
		else
			factory = new FactoryPersonajePixar();
		
		personaje.clear();
		
		personaje.add(
				factory.getPersonaj(TipPersonaj.POZITIV));
		personaje.add(
				factory.getPersonaj(TipPersonaj.NEGATIV));
		personaje.add(
				factory.getPersonaj(TipPersonaj.NEUTRU));
		
		System.out.println("--------------------");
		
		for(PersonajAbstract pers : personaje)
			pers.faceCeva();
		
		//Builder
		SuperErou superman = 
				new SuperErou.BuilderSuperErou("Superman", 1000)
				.setEstePozitiv()
				.setEsteRanit()
				.setArmaManaDreapta("Pistol")
				.build();
		
		SuperErou joker = 
				new SuperErou.BuilderSuperErou("Joker", 1000)
				.setEsteNegativ()
				.setArmaManaDreapta("Pistol")
				.setArmaManaStanga("Pistol")
				.build();
		
	}

}
