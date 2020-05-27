package ro.ase.csie.cts.g1084.seminar14.state;

public class StareNormal implements InterfataActiuniCaracter {

	@Override
	public void seDeplaseaza() {
		System.out.println("Caracterul alearga");
	}

	@Override
	public void ataca(String inamic, int puncte, CaracterJoc caracter) {
		System.out.println(caracter.nume + " ataca pe  " + inamic);
		System.out.println("Lovitura are " + puncte + " puncte.");
	}

}
