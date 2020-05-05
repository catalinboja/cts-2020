package ro.ase.csie.cts.g1092.seminar10.factory;

import ro.ase.csie.cts.g1092.seminar10.simplefactory.WeaponInterface;
import ro.ase.csie.cts.g1092.seminar10.simplefactory.WeaponTypes;

public interface WeaponsFactoryInterface {
	
	public WeaponInterface getWeapon(WeaponTypes type);
	
}
