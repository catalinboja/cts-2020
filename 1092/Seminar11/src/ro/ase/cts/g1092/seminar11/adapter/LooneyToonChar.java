package ro.ase.cts.g1092.seminar11.adapter;

public class LooneyToonChar extends DisneyCharacter{

	public LooneyToonChar(String name, float energy) {
		super(name, energy);
	}

	@Override
	public void restoreEnergy() {
		this.energy = 500;
	}
	
}
