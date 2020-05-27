package ro.ase.csie.cts.g1091.seminar14.state;

public class StateCritical implements CharacterActions{

	@Override
	public void relocate() {
		System.out.println("Is just laying down");
	}

	@Override
	public void strike(String enemy, int points, GameCharacter character) {
		System.out.println("Hits " + enemy + " with a weak strike of " + points/10);
	}

}
