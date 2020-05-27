package ro.ase.csie.cts.g1084.seminar14.state;

public class StareRanitCritic implements InterfataActiuniCaracter {

	@Override
	public void seDeplaseaza() {
		System.out.println("NU se mai poate deplasa");
	}

	@Override
	public void ataca(String inamic, int puncte, CaracterJoc caracter) {
		System.out.println(caracter.nume + " abia il atinge pe " + inamic);
		System.out.println("Putere lovitura: " + puncte/10);
	}

}
