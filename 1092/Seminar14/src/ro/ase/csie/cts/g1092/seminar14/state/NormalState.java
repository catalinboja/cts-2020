package ro.ase.csie.cts.g1092.seminar14.state;

public class NormalState implements CharacterActionsInterface {

	@Override
	public void moveOnScreen() {
		System.out.println("Is running");
	}

	@Override
	public void attack(String enemy, int points) {
		System.out.println("Hits " + enemy + " with points: " + points);;
	}

}
