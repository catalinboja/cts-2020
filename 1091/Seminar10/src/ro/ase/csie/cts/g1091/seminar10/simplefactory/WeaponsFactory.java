package ro.ase.csie.cts.g1091.seminar10.simplefactory;

public class WeaponsFactory {
	public static AbstractWeapon getWeapon(WeaponType type) {
		switch (type) {
		case PISTOL:
			return new Pistol("A4");
		case MACHINE_GUN:
			return new MachineGun(1000);
		case ROCKET:
			return new Rocket();
		default:
			throw new UnsupportedOperationException();
		}
	}
}
