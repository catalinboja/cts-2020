package ro.ase.csie.cts.g1092.seminar14.memento;

public class PlayerMemento {
	
	//optional - make it an immutable class 
	final private  String name;
	final private int lifePoints;
	
	public PlayerMemento(String name, int lifePoints) {
		this.name = name;
		this.lifePoints = lifePoints;
	}

	public String getName() {
		return name;
	}

	public int getLifePoints() {
		return lifePoints;
	}
	
	
}
