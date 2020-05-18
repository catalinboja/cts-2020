package ro.ase.csie.cts.g1091.seminar11.adapter;

public interface AcmeCharacterInterface {
	
	public String getName();
	public int getLifePoints();
	
	public void takeAHit(int points);
	public void heal(int points);
	public void fight(String enemy);
	
}
