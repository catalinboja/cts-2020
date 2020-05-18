package ro.ase.csie.cts.g1091.seminar10;

import java.util.ArrayList;

import ro.ase.csie.cts.g1091.seminar10.factory.AbstractWeaponsFactory;
import ro.ase.csie.cts.g1091.seminar10.factory.ChildThemeWeaponsFactory;
import ro.ase.csie.cts.g1091.seminar10.factory.NormalThemeWeaponsFactory;
import ro.ase.csie.cts.g1091.seminar10.prototype.Model3D;
import ro.ase.csie.cts.g1091.seminar10.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.g1091.seminar10.simplefactory.WeaponType;
import ro.ase.csie.cts.g1091.seminar10.simplefactory.WeaponsFactory;

public class TestGameClient {

	public static void main(String[] args) {
		
		
		
		ArrayList<AbstractWeapon> weapons = 
				new ArrayList<>();
		
		//without factory
		
/*		weapons.add(new Pistol());
		weapons.add(new MachineGun());
		weapons.add(new Rocket());*/
		
		//Simple Factory
		
		weapons.add(WeaponsFactory.getWeapon(WeaponType.PISTOL));
		weapons.add(WeaponsFactory.getWeapon(WeaponType.MACHINE_GUN));
		weapons.add(WeaponsFactory.getWeapon(WeaponType.ROCKET));
		
		for(AbstractWeapon weapon : weapons) {
			weapon.shoot();
		}
		
		//Factory Method
		
		int selectedTheme = 1;
		AbstractWeaponsFactory currentFactory = null;
		if(selectedTheme == 1)
			currentFactory = new ChildThemeWeaponsFactory();
		else
			currentFactory = new NormalThemeWeaponsFactory();
		
		ArrayList<AbstractWeapon> weaponsList = new ArrayList<>();
		
		weaponsList.add(currentFactory.getWeapon(WeaponType.PISTOL));
		weaponsList.add(currentFactory.getWeapon(WeaponType.MACHINE_GUN));
		
		System.out.println("------------------------------");
		for(AbstractWeapon weapon : weaponsList) {
			weapon.shoot();
		}
		
		//Prototype
		System.out.println("------------------------------");
		
/*		Model3D enemy1 = new Model3D("Soldier.dat", "Soldier");
		Model3D enemy2 = new Model3D("Soldier.dat", "Soldier");
		Model3D enemy3 = new Model3D("Soldier.dat", "Soldier");*/
		
		Model3D enemy = new Model3D("Soldier.dat", "Soldier");
		Model3D enemy2 = (Model3D) enemy.clone();
		Model3D enemy3 = (Model3D) enemy.clone();
		
	}

}
