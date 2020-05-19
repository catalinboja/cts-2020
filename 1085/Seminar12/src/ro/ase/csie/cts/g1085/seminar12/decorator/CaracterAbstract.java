package ro.ase.csie.cts.g1085.seminar12.decorator;

public abstract class CaracterAbstract {
	
	String nume;
	int puncteViata;
	
	
	public CaracterAbstract(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}

	public String getNume() {
		return nume;
	}

	public int getPuncteViata() {
		return puncteViata;
	}
	
	public abstract void ataca();
	public abstract void seApara(int puncte);
	public abstract void seVindeca(int puncte);
	
}
