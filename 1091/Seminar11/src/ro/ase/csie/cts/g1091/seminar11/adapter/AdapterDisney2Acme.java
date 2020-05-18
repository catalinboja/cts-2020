package ro.ase.csie.cts.g1091.seminar11.adapter;

public class AdapterDisney2Acme implements AcmeCharacterInterface {
	
	DisneyCharacter disneyChar;
	
	public AdapterDisney2Acme(DisneyCharacter disneyChar) {
		super();
		this.disneyChar = disneyChar;
	}

	@Override
	public String getName() {
		return this.disneyChar.getDescription();
	}

	@Override
	public int getLifePoints() {
		return (int) this.disneyChar.getEnergyLevel();
	}

	@Override
	public void takeAHit(int points) {
		this.disneyChar.interact(points);
	}

	@Override
	public void heal(int points) {
		this.disneyChar.useMediKit(points);
	}

	@Override
	public void fight(String enemy) {
		System.out.println(this.disneyChar.getDescription() + " is fighting " + enemy);
	}
	
	

}
