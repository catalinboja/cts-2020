package ro.ase.csie.cts.g1091.seminar10.factory;

import ro.ase.csie.cts.g1091.seminar10.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1091.seminar10.simplefactory.MachineGun;
import ro.ase.csie.cts.g1091.seminar10.simplefactory.Pistol;
import ro.ase.csie.cts.g1091.seminar10.simplefactory.Rocket;
import ro.ase.csie.cts.g1091.seminar10.simplefactory.SnowballPistol;
import ro.ase.csie.cts.g1091.seminar10.simplefactory.WeaponType;

public class ChildThemeWeaponsFactory extends AbstractWeaponsFactory {

	@Override
	public AbstractWeapon getWeapon(WeaponType type) {
		switch (type) {
		case PISTOL:
			return new SnowballPistol();			//return a snowball pistol
		case MACHINE_GUN:
			return new MachineGun(1000);
		case ROCKET:
			return new Rocket();
		default:
			throw new UnsupportedOperationException();
		}
	}

}
