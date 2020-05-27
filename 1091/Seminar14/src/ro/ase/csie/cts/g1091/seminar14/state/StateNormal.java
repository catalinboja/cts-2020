package ro.ase.csie.cts.g1091.seminar14.state;

public class StateNormal implements CharacterActions {

	@Override
	public void relocate() {
		System.out.println("Is running");
	}

	@Override
	public void strike(String enemy, int points, GameCharacter character) {
		System.out.println(character.name + " is attacking " + enemy + " with " + points);
	}

}
