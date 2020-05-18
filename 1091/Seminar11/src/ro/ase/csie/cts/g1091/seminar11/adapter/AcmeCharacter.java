package ro.ase.csie.cts.g1091.seminar11.adapter;

public class AcmeCharacter implements AcmeCharacterInterface{
	
	protected String name;
	protected int lifePoints;
	
	public AcmeCharacter(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getLifePoints() {
		return this.lifePoints;
	}

	@Override
	public void takeAHit(int points) {
		System.out.println(this.name + " was hit ");
		this.lifePoints -= points;
	}

	@Override
	public void heal(int points) {
		System.out.println(this.name + " is healing ");
		this.lifePoints += points;
	}

	@Override
	public void fight(String enemy) {
		System.out.println(this.name + " is fighting with " + enemy);
	}
	
	
}
