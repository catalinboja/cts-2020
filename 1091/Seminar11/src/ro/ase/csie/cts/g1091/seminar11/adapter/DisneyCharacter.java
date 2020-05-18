package ro.ase.csie.cts.g1091.seminar11.adapter;

public abstract class DisneyCharacter {
	
	protected String name;
	protected float energy;
	
		
	public DisneyCharacter(String name, float energy) {
		super();
		this.name = name;
		this.energy = energy;
	}

	public String getDescription() {
		return this.name;
	}
	
	public float getEnergyLevel() {
		return this.energy;
	}
	
	public abstract void useMediKit(float points);
	public abstract void interact(float points);
	
}
