package ro.ase.csie.cts.g1092.seminar10.factory;

import ro.ase.csie.cts.g1092.seminar10.simplefactory.DarkThemePistol;
import ro.ase.csie.cts.g1092.seminar10.simplefactory.MachineGun;
import ro.ase.csie.cts.g1092.seminar10.simplefactory.Pistol;
import ro.ase.csie.cts.g1092.seminar10.simplefactory.Rocket;
import ro.ase.csie.cts.g1092.seminar10.simplefactory.WeaponInterface;
import ro.ase.csie.cts.g1092.seminar10.simplefactory.WeaponTypes;

public class DarkModeThemeWeaponFactory  implements WeaponsFactoryInterface {

	@Override
	public WeaponInterface getWeapon(WeaponTypes type) {
		switch(type) {
		case PISTOL:
			return new DarkThemePistol("Model 1");
		case MACHINE_GUN:
			return new MachineGun(1000);
		case ROCKET:
			return new Rocket();
		default:
			throw new UnsupportedOperationException();	
		}
	}

}
