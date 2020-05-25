package ro.ase.csie.cts.g1074.seminar14.state;

public class StareRanitCritic  implements InterfataStareCaracter {
	
	@Override
	public void seDeplaseaza() {
		System.out.println("Se misca foarte greu. Este ranit");
	}

	@Override
	public void ataca(String inamic, int puncteAtac) {
		System.out.println("Ataca pe " + inamic + " cu " + puncteAtac/4 + " puncte");
	}
}
