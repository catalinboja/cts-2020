package ro.ase.cts.g1092.seminar11.adapter;

import ro.ase.cts.g1092.seminar11.decorator.AbstractDecorator;

public class HitAlertDecorator  extends AbstractDecorator{

	public HitAlertDecorator(ACMECharacterInterface character) {
		super(character);
	}

	@Override
	public void takeAHit(int points) {
		if(points > 500)
			System.out.println("Visual alert the player");
		this.character.takeAHit(points);
	}
	
}
