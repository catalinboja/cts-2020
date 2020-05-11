package ro.ase.cts.g1074.seminar11.adapter;

public abstract class CaracterACME {
	public String nume;
	public int puncteViata;
	
	public void afisareDetalii() {
		System.out.println(this.nume + " - " + this.puncteViata);
	}
	
	public abstract void esteLovit(int puncte);
	public abstract void seVindeca(int puncte);
}
