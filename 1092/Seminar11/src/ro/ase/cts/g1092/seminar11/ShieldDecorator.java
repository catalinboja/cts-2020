package ro.ase.cts.g1092.seminar11;

import ro.ase.cts.g1092.seminar11.adapter.ACMECharacterInterface;

public class ShieldDecorator extends AbstractDecorator {
	
	String shieldType;

	public ShieldDecorator(ACMECharacterInterface character, String shield) {
		super(character);
		this.shieldType = shield;
	}

	@Override
	public void takeAHit(int points) {
		System.out.println("Is using a shield");
		this.character.takeAHit(points/2);
	}
	
	

}
