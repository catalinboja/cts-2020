package ro.ase.csie.cts.g1091.seminar11.adapter;

public class DisneyLooneyTune extends DisneyCharacter{

	public DisneyLooneyTune(String name, float energy) {
		super(name, energy);
	}

	@Override
	public void useMediKit(float points) {
		System.out.println(this.name + " is using magic to heal");
		this.energy += points;
	}

	@Override
	public void interact(float points) {
		System.out.println(this.name + " is doing something");
		this.energy -= points;
	}

}
