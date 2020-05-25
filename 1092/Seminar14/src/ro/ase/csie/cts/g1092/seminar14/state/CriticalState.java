package ro.ase.csie.cts.g1092.seminar14.state;

public class CriticalState implements CharacterActionsInterface {

	@Override
	public void moveOnScreen() {
		System.out.println("Is laying down");
	}

	@Override
	public void attack(String enemy, int points) {
		System.out.println("You just touch it for " + points/10);
	}

}
