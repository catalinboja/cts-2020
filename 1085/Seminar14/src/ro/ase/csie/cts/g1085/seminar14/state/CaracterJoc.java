package ro.ase.csie.cts.g1085.seminar14.state;

public class CaracterJoc {
	
	String nume;
	int puncteViata;
	
	InterfataActiuniCaracter stareCurenta;
	
	public CaracterJoc(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.stareCurenta = new StareNormala();
	}
	
	public void seDeplaseaza() {
		this.stareCurenta.seMisca();
	}
	
	public void ataca(String inamic, int puncte) {
		this.stareCurenta.ataca(inamic, puncte, this);
	}
	
	public void seVindeca(int puncte) {
		this.puncteViata += puncte;
		if(this.puncteViata >= 500)
			this.stareCurenta = new StareNormala();
		else
			if(this.puncteViata >= 100)
				this.stareCurenta = new StareRanit();
	}
	
	public void esteLovit(int puncte) {
		this.puncteViata -= puncte;
		
		if(this.puncteViata < 100)
			this.stareCurenta = new StareRanitCritic();
		else
			if(this.puncteViata < 500)
				this.stareCurenta = new StareRanit();
	}
	
}
