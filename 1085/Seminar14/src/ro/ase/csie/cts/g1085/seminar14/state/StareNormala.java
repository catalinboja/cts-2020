package ro.ase.csie.cts.g1085.seminar14.state;

public class StareNormala implements InterfataActiuniCaracter{

	@Override
	public void seMisca() {
		System.out.println("Alearga");
	}

	@Override
	public void ataca(String inamic, int puncteAtac, CaracterJoc caracter) {
		System.out.println(caracter.nume + " ataca pe " + inamic + 
				" cu " + puncteAtac);
	}

}
