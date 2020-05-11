package ro.ase.cts.g1092.seminar11.adapter;

public class Disney2AcmeAdapter  implements ACMECharacterInterface{
	
	DisneyCharacter character;
	
	public Disney2AcmeAdapter(DisneyCharacter character) {
		super();
		this.character = character;
	}

	@Override
	public void getDetails() {
		this.character.getInfo();
	}

	@Override
	public void fight() {
		this.character.interact(0);
	}

	@Override
	public void takeAHit(int points) {
		this.character.interact(points);
	}

	@Override
	public void heal(int points) {
		this.character.restoreEnergy();
	}
	
	
	
	
}
