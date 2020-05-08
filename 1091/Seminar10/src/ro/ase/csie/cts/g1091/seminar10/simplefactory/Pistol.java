package ro.ase.csie.cts.g1091.seminar10.simplefactory;

public class Pistol extends AbstractWeapon{

	@Override
	public void shoot() {
		System.out.println("Pew pew");
	}
	
	public Pistol(String name) {
		this.name = name;
	}

}
