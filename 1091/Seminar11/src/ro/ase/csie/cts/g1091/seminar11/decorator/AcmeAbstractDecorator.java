package ro.ase.csie.cts.g1091.seminar11.decorator;

import ro.ase.csie.cts.g1091.seminar11.adapter.AcmeCharacterInterface;

public abstract class AcmeAbstractDecorator implements AcmeCharacterInterface{

	AcmeCharacterInterface superhero;

	public AcmeAbstractDecorator(AcmeCharacterInterface superhero) {
		super();
		this.superhero = superhero;
	}

	@Override
	public String getName() {
		return this.superhero.getName();
	}

	@Override
	public int getLifePoints() {

		return this.superhero.getLifePoints();
	}

	@Override
	public void takeAHit(int points) {
		this.superhero.takeAHit(points);
	}

	@Override
	public void heal(int points) {

		this.superhero.heal(points);
	}

	@Override
	public void fight(String enemy) {
		this.superhero.fight(enemy);
	}
	
}
