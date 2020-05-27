package ro.ase.csie.cts.g1084.seminar14.state;

public class CaracterJoc {
	
	String nume;
	int puncteViata;
	
	InterfataActiuniCaracter stareCurenta = null;
	
	public CaracterJoc(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		
		this.stareCurenta = new StareNormal();
	}
	
	
	private void setStareCurenta(InterfataActiuniCaracter stareCurenta) {
		this.stareCurenta = stareCurenta;
	}

	public void merge() {
		this.stareCurenta.seDeplaseaza();
	}
	
	public void ataca(String inamic, int puncte) {
		this.stareCurenta.ataca(inamic, puncte, this);
		
	}
	
	public void seVindeca(int puncte) {
		this.puncteViata += puncte;
		if(this.puncteViata < 500)
			this.setStareCurenta(new StareRanit());
		else
			if(this.puncteViata < 1000)
				this.setStareCurenta(new StareNormal());
	}
	
	public void esteLovit(int puncte) {
		this.puncteViata -= puncte;
		if(this.puncteViata < 50)
			this.setStareCurenta(new StareRanitCritic());
		else
			if(this.puncteViata < 500)
				this.setStareCurenta(new StareRanit());
	}
	
	
}
