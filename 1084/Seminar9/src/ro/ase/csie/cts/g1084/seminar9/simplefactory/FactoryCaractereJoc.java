package ro.ase.csie.cts.g1084.seminar9.simplefactory;


//implementare simple factory
//permite gestiunea eficienta a crearii de obiecte dintr-o familie/framework
public class FactoryCaractereJoc {
	
	public static CaracterJoc getCaractereJoc(
			String nume, TipCaractere tip) {
		switch(tip) {
		case POZITIV:
			return new PersonajPozitiv(nume, 100);
		case NEGATIV:
			return new PersonajNegativ(nume);
		default:
				throw new UnsupportedOperationException();
		}
	}
}
