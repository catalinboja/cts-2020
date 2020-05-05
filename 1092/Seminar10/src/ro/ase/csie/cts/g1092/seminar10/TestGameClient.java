package ro.ase.csie.cts.g1092.seminar10;

import java.util.ArrayList;

import ro.ase.csie.cts.g1092.seminar10.factory.DarkModeThemeWeaponFactory;
import ro.ase.csie.cts.g1092.seminar10.factory.StandardWeaponFactory;
import ro.ase.csie.cts.g1092.seminar10.factory.WeaponsFactoryInterface;
import ro.ase.csie.cts.g1092.seminar10.simplefactory.MachineGun;
import ro.ase.csie.cts.g1092.seminar10.simplefactory.Pistol;
import ro.ase.csie.cts.g1092.seminar10.simplefactory.Rocket;
import ro.ase.csie.cts.g1092.seminar10.simplefactory.WeaponFactory;
import ro.ase.csie.cts.g1092.seminar10.simplefactory.WeaponInterface;
import ro.ase.csie.cts.g1092.seminar10.simplefactory.WeaponTypes;

public class TestGameClient {
	
	public static void main(String[] args) {
		
/*		Pistol pistol = new Pistol();
		MachineGun mg = new MachineGun();
		Rocket rocket = new Rocket();*/
		
		
		//Simple Factory
		
		Pistol pistol = (Pistol) WeaponFactory.getWeapon(WeaponTypes.PISTOL);
		MachineGun mg = (MachineGun) WeaponFactory.getWeapon(WeaponTypes.MACHINE_GUN);
		Rocket rocket = (Rocket) WeaponFactory.getWeapon(WeaponTypes.ROCKET);
		
		ArrayList<WeaponInterface> availableWeapons = new ArrayList<>();
		availableWeapons.add(pistol);
		availableWeapons.add(mg);
		availableWeapons.add(rocket);
		
		//Factory Method
		int selectedTheme = 1;
		WeaponsFactoryInterface currentWeaponsFactory;
		if(selectedTheme == 1)
			currentWeaponsFactory = new StandardWeaponFactory();
		else
			currentWeaponsFactory = new DarkModeThemeWeaponFactory();
		
		Pistol pistol2 = (Pistol) currentWeaponsFactory.getWeapon(WeaponTypes.PISTOL);
		
		//Prototype
		
/*		Model3D soldier1 = new Model3D("Soldier.dat", "Enemy");
		Model3D soldier2 = new Model3D("Soldier.dat", "Enemy");
		Model3D soldier3 = new Model3D("Soldier.dat", "Enemy");*/
		
		Model3D soldierPrototype = new Model3D("Soldier.dat", "Enemy");
		Model3D soldier2 = (Model3D) soldierPrototype.clone();
		Model3D soldier3 = (Model3D) soldierPrototype.clone();
		
		
		
	}
	
}
