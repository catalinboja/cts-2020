package ro.ase.csie.cts.g1085.seminar11.adapter;

public abstract class CaracterDisney {
	
	protected String nume;
	public float energie;
	
	
	public CaracterDisney(String nume, float energie) {
		super();
		this.nume = nume;
		this.energie = energie;
	}
	
	public String getInfo() {
		return this.nume;
	}
	
	public abstract void interactioneaza(float energie);
	public abstract void resetEnergie();
	
	
}
