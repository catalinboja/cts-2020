package ro.ase.csie.cts.g1092.seminar10.simplefactory;

public class Pistol implements WeaponInterface {

	String model; 
	
	public Pistol(String model) {
		this.model = model;
	}
	
	@Override
	public void shoot(String target) {
		System.out.println("Pew Pew on " + target);
	}

	@Override
	public void reload() {
		System.out.println("Reloading...");
	}

}
