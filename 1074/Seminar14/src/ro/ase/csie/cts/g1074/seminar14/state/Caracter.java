package ro.ase.csie.cts.g1074.seminar14.state;

public class Caracter {
	
	String nume;
	int puncteViata;
	
	private InterfataStareCaracter stareCurenta;
	
	//daca nu se doreste modificarea starii din exterior atunci metoda nu este publica
	public  void setStareCurenta(InterfataStareCaracter stare) {
		this.stareCurenta = stare;
	}
	
	
	public Caracter(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		
		//implicit obiectul este creat in stare normala
		this.setStareCurenta(new StareNormala());
	}
	
	public void merge() {
		System.out.println(this.nume);
		this.stareCurenta.seDeplaseaza();
	}
	
	public void ataca(String inamic, int puncteAtac) {
		System.out.println(this.nume);
		this.stareCurenta.ataca(inamic, puncteAtac);
	}
	
	public void esteLovit(int puncte) {
		System.out.println("Este lovit cu " + puncte);
		this.puncteViata -= puncte;
		if(this.puncteViata <= 100)
			this.setStareCurenta(new StareRanitCritic());
	}
	
	public void seVindecaTotal() {
		this.puncteViata = 1000;
		this.setStareCurenta(new StareNormala());
	}
	

}
