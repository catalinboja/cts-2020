package ro.ase.csie.cts.g1084.seminar14.state;

public class StareRanit implements InterfataActiuniCaracter {

	@Override
	public void seDeplaseaza() {
		System.out.println("Se misca cu greutate");
	}

	@Override
	public void ataca(String inamic, int puncte, CaracterJoc caracter) {
		System.out.println(caracter.nume + " il loveste cu greu pe " + inamic);
		System.out.println("Putere lovitura: " + puncte/2);
	}

}
