package ro.ase.csie.cts.g1085.seminar14.state;

public class StareRanit implements InterfataActiuniCaracter {

	@Override
	public void seMisca() {
		System.out.println("Se misca cu dificultate");
	}

	@Override
	public void ataca(String inamic, int puncteAtac, CaracterJoc caracter) {
		System.out.println(caracter.nume + " il atinge pe " + inamic + 
				" cu " + puncteAtac/2);
	}

}
