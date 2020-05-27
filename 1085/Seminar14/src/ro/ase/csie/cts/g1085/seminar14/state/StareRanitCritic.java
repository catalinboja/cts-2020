package ro.ase.csie.cts.g1085.seminar14.state;

public class StareRanitCritic implements InterfataActiuniCaracter {

	@Override
	public void seMisca() {
		System.out.println("Sta pe loc");
	}

	@Override
	public void ataca(String inamic, int puncteAtac, CaracterJoc caracter) {
		System.out.println(
				"Cu greu il loveste pe " + inamic + " cu " + puncteAtac/10);
	}

}
