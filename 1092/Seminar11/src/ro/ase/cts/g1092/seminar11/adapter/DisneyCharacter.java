package ro.ase.cts.g1092.seminar11.adapter;

public abstract class DisneyCharacter {
	
	String name;
	float energy;
	
	public DisneyCharacter(String name, float energy) {
		super();
		this.name = name;
		this.energy = energy;
	}
	
	public void getInfo() {
		System.out.println("Name : " + this.name);
	}
	public void interact(int energy) {
		System.out.println("The character is losing energy");
		this.energy -= energy;
	}
	
	public abstract void restoreEnergy();
	
	
}
