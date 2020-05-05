package ro.ase.csie.cts.g1092.seminar10.simplefactory;

public class MachineGun implements WeaponInterface {
	
	int noBullets;
	
	public MachineGun(int noBullets) {
		super();
		this.noBullets = noBullets;
	}

	@Override
	public void shoot(String target) {
		System.out.println("Ta Ta Ta Ta on " + target);
	}

	@Override
	public void reload() {
		System.out.println("Reloading...");
	}

}
