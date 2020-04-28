package ro.ase.csie.cts.g1074.seminar9.factory;

public abstract class CaracterJocAbstract {
	
	String numeCaracter;
	int puncteViata;
	
	public CaracterJocAbstract(String nume, int puncteViata) {
		this.numeCaracter = nume;
	}
	
	public abstract String getDescriere();
}
