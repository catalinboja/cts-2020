package ro.ase.csie.cts.g1084.seminar12.adapter;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class CaracterACME implements InterfataCaractereACME{
	
	protected String nume;
	protected int puncteViata;
	
	public CaracterACME(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}

	@Override
	public String getNume() {
		return nume;
	}

	@Override
	public int getPuncteViata() {
		return puncteViata;
	}

	@Override
	public void getDescriere() {
		System.out.println(nume + " - " + puncteViata);
	}

	@Override
	public void esteAtacat(int puncte) {
		System.out.println(nume + " este atacat");
		this.puncteViata -= puncte;
	}

	@Override
	public void seVindeca(int puncte) {
		System.out.println(nume + " se vindeca");
		this.puncteViata += puncte;
	}
	
	
	
}
