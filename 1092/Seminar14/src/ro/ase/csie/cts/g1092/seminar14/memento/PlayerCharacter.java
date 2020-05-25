package ro.ase.csie.cts.g1092.seminar14.memento;

public class PlayerCharacter {
	private  String name;
	private int lifePoints;
	
	public PlayerCharacter(String name, int lifePoints) {
		this.name = name;
		this.lifePoints = lifePoints;
	}
	
	public PlayerMemento save() {
		return new PlayerMemento(name, lifePoints);
	}
	
	public void reload(PlayerMemento memento) {
		this.name = memento.getName();
		this.lifePoints = memento.getLifePoints();
	}
	
	public void move() {
	}
	
	public void fight(String enemy, int points) {
	}
	
	public void heal(int points) {
		this.lifePoints += points;
	}
	
	public void takeAHit(int points) {
		this.lifePoints -= points;
	}
	
}
