package ro.ase.csie.cts.g1091.seminar10.simplefactory;

public class MachineGun extends AbstractWeapon{

	@Override
	public void shoot() {
		System.out.println("Ta Ta Ta");
	}
	
	public MachineGun(int noBullets) {
		this.noBullets = noBullets;
	}

}
