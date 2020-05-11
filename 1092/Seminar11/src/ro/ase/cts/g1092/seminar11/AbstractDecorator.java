package ro.ase.cts.g1092.seminar11;

import ro.ase.cts.g1092.seminar11.adapter.ACMECharacterInterface;

public abstract class AbstractDecorator  implements ACMECharacterInterface {
	
	protected ACMECharacterInterface character;

	public AbstractDecorator(ACMECharacterInterface character) {
		super();
		this.character = character;
	}

	@Override
	public void getDetails() {
		this.character.getDetails();
	}

	@Override
	public void fight() {
		this.character.fight();
	}

	@Override
	public void takeAHit(int points) {
		this.character.takeAHit(points);
	}

	@Override
	public void heal(int points) {
		this.character.heal(points);
	}
		
}
