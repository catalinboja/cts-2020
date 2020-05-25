package ro.ase.csie.cts.g1092.seminar14.state;

public class WoundedState implements CharacterActionsInterface {

	@Override
	public void moveOnScreen() {
		System.out.println("Is slowly moving");
	}

	@Override
	public void attack(String enemy, int points) {
		System.out.println("We almost missed " + enemy + ". It got points: " + points/2);
	}

}
