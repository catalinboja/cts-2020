package ro.ase.csie.cts.g1085.seminar11.adapter;

public class CaracterACME implements InterfataCaractereACME {

	protected String nume;
	protected int puncteViata;
	
	
	public CaracterACME(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}


	@Override
	public String getNume() {
		return this.nume;
	}


	@Override
	public int getPuncteViata() {
		return this.puncteViata;
	}


	@Override
	public void getDescriere() {
		System.out.println(this.nume + " - " + this.puncteViata);
	}


	@Override
	public void esteAtacat(int puncteLovitura) {
		System.out.println(this.nume + " este atacat");
		this.puncteViata -= puncteLovitura;
	}


	@Override
	public void seVindeca(int puncte) {
		System.out.println(this.nume + " se vindeca");
		this.puncteViata += puncte;
	}
	
	
	
}
