package ro.ase.csie.cts.g1092.seminar10.simplefactory;

//simple factory
public class WeaponFactory {
	
	public static WeaponInterface getWeapon(WeaponTypes type) {
		switch(type) {
		case PISTOL:
			return new Pistol("Model 1");
		case MACHINE_GUN:
			return new MachineGun(1000);
		case ROCKET:
			return new Rocket();
		default:
			throw new UnsupportedOperationException();	
		}
	}
}
