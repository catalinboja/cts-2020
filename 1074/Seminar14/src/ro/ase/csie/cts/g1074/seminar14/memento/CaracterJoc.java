package ro.ase.csie.cts.g1074.seminar14.memento;

public class CaracterJoc {
	
	String nume;
	int puncteViata;
	
	
	public CaracterJoc(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;

	}
	
	public void merge() {
		System.out.println(this.nume);
	}
	
	public void ataca(String inamic, int puncteAtac) {
		System.out.println(this.nume);
	}
	
	public void esteLovit(int puncte) {
		System.out.println("Este lovit cu " + puncte);
		this.puncteViata -= puncte;
	}
	
	public void seVindecaTotal() {
		this.puncteViata = 1000;
	}
	
	
	public MementoCaracterJoc salvare() {
		return new MementoCaracterJoc(this.nume, this.puncteViata);
	}
	
	public void reincarcaStare(MementoCaracterJoc salvareAnterioara) {
		this.nume = salvareAnterioara.getNume();
		this.puncteViata = salvareAnterioara.getPuncteViata();
	}

}
