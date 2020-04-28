package ro.ase.csie.cts.g1074.seminar9.factory;

public class CaracterPozitiv extends CaracterJocAbstract {

	public CaracterPozitiv(String nume) {
		super(nume, 1000);
	}

	@Override
	public String getDescriere() {
		return "Un caracter pozitiv " + numeCaracter;
	}

}
