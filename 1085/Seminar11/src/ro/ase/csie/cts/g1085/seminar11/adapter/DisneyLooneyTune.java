package ro.ase.csie.cts.g1085.seminar11.adapter;

public class DisneyLooneyTune extends CaracterDisney{

	public DisneyLooneyTune(String nume, float energie) {
		super(nume, energie);
	}

	@Override
	public void interactioneaza(float energie) {
		this.energie -= energie;
		System.out.println(this.nume + "a pierdut puncte energie");
	}

	@Override
	public void resetEnergie() {
		System.out.println("Reset energie la nivel maxim");
		this.energie = 2000;
	}
	
	

}
