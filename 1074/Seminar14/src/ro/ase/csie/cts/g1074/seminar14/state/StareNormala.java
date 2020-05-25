package ro.ase.csie.cts.g1074.seminar14.state;

public class StareNormala implements InterfataStareCaracter {

	@Override
	public void seDeplaseaza() {
		System.out.println("Merge normal");
	}

	@Override
	public void ataca(String inamic, int puncteAtac) {
		System.out.println("Ataca pe " + inamic + " cu " + puncteAtac + " puncte");
	}

}
