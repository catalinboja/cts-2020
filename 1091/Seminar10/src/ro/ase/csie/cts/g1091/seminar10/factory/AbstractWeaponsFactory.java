package ro.ase.csie.cts.g1091.seminar10.factory;

import ro.ase.csie.cts.g1091.seminar10.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1091.seminar10.simplefactory.WeaponType;

public abstract class AbstractWeaponsFactory {
	public abstract AbstractWeapon getWeapon(WeaponType type);
}
