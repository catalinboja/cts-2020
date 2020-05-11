package ro.ase.cts.g1074.seminar11.adapter;

public class SuperErouACME extends CaracterACME {
	
	public SuperErouACME(String nume, int puncte) {
		this.nume = nume;
		this.puncteViata = puncte;
	}

	@Override
	public void esteLovit(int puncte) {
		this.puncteViata -= puncte;
		System.out.println("Caracterul ACME este lovit");
	}

	@Override
	public void seVindeca(int puncte) {
		this.puncteViata += puncte;
		System.out.println("Caracterul ACME se vindeca");
	}

}
