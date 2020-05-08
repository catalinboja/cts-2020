package ro.ase.cts.g1085.seminar10.factory;

import ro.ase.cts.g1085.seminar10.simplefactory.PersonajAbstract;
import ro.ase.cts.g1085.seminar10.simplefactory.PersonajNegativ;
import ro.ase.cts.g1085.seminar10.simplefactory.PersonajNeutru;
import ro.ase.cts.g1085.seminar10.simplefactory.PersonajPozitiv;
import ro.ase.cts.g1085.seminar10.simplefactory.TipPersonaj;

public class FactoryPersonajePixar extends FactoryAbstractPersonaje{

	@Override
	public PersonajAbstract getPersonaj(TipPersonaj tip) {
		switch (tip) {
		case POZITIV:
			return new PersonajPozitiv("Anonim");
		case NEGATIV:
			return new PersonajNegativ(500);
		case NEUTRU:
			return new PersonajNeutru();
		default:
			throw new UnsupportedOperationException();
		}
	}

}
