package ro.ase.csie.cts.g1091.seminar14.state;

public interface CharacterActions {
	
	//if you need the object reference you can define an attribute here (abstract class)
	
	public void relocate();
	
	//or you can ask for it for specific methods
	public void strike(String enemy, int points, GameCharacter character);
}
