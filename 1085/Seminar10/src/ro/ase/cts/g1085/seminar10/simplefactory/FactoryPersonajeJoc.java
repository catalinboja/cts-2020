package ro.ase.cts.g1085.seminar10.simplefactory;

public class FactoryPersonajeJoc {

	public static PersonajAbstract getPersonaj(TipPersonaj tip) {
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
