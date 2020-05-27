package ro.ase.csie.cts.g1091.seminar14.state;

public class StateWounded implements CharacterActions {

	@Override
	public void relocate() {
		System.out.println("Is moving slowly");
	}

	@Override
	public void strike(String enemy, int points, GameCharacter character) {
		System.out.println(character.name + " almost missed " + enemy + " with " + points/2);
	}

}
