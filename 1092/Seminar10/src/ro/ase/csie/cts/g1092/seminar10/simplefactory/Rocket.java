package ro.ase.csie.cts.g1092.seminar10.simplefactory;

public class Rocket implements WeaponInterface{

	@Override
	public void shoot(String target) {
		System.out.println("Booom on " + target);
	}

	@Override
	public void reload() {
		System.out.println("Reloading...");
	}
}
