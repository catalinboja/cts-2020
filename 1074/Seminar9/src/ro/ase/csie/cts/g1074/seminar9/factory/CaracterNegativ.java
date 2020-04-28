package ro.ase.csie.cts.g1074.seminar9.factory;

public class CaracterNegativ extends CaracterJocAbstract {

	public CaracterNegativ(String nume, int puncte) {
		super(nume, puncte);
	}

	@Override
	public String getDescriere() {
		return "Un caracter negativ " + numeCaracter;
	}

}
