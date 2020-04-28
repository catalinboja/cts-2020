package ro.ase.csie.cts.g1074.seminar9.factory;

public class FactoryCaractereJoc {
	
	public static CaracterJocAbstract getCaracter(TipuriCaractere tip, String nume) {
		switch(tip) {
		case POZITIV:
			return new CaracterPozitiv(nume);
		case NEGATIV:
			return new CaracterNegativ(nume, 500);
		default:
				throw new UnsupportedOperationException();
		}
	}
}
