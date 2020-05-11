package ro.ase.cts.g1092.seminar11.adapter;

public class ACMECharacter implements ACMECharacterInterface {
	
	public String name;
	int lifePoints;
	
	
	public ACMECharacter(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}

	@Override
	public void getDetails() {
		System.out.println(this.name + " - " + this.lifePoints);
	}

	@Override
	public void fight() {
		System.out.println(this.name + " is fighting");
	}
	
	@Override
	public void takeAHit(int points) {
		System.out.println(this.name + " is hit");
		this.lifePoints -= points;
	}

	@Override
	public void heal(int points) {
		System.out.println(this.name + " is healing");
		this.lifePoints += points;
	}

}
