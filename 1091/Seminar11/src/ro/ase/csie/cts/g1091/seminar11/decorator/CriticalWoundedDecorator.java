package ro.ase.csie.cts.g1091.seminar11.decorator;

import ro.ase.csie.cts.g1091.seminar11.adapter.AcmeCharacterInterface;

public class CriticalWoundedDecorator extends AcmeAbstractDecorator{

	public CriticalWoundedDecorator(AcmeCharacterInterface superhero) {
		super(superhero);
	}

	@Override
	public void takeAHit(int points) {
		this.superhero.takeAHit(points);
		if(this.superhero.getLifePoints() < 100)
			System.out.println("You are in danger");
	}
	
	

}
