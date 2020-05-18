package ro.ase.csie.cts.g1091.seminar11;

import ro.ase.csie.cts.g1091.seminar11.adapter.AcmeCharacterInterface;

public class ShieldDecorator extends AcmeAbstractDecorator{
	
	String shield;

	public ShieldDecorator(AcmeCharacterInterface superhero, String shield) {
		super(superhero);
		this.shield = shield;
	}

	@Override
	public void takeAHit(int points) {
		System.out.println("Is using a shield");
		this.superhero.takeAHit(points/2);
	}
	
	

}
