package ro.ase.csie.cts.g1084.seminar12.adapter;

public class AdaptorDisney2ACME implements InterfataCaractereACME{

	CaracterDisney caracter;

	public AdaptorDisney2ACME(CaracterDisney caracter) {
		super();
		this.caracter = caracter;
	}

	@Override
	public String getNume() {
		return caracter.getDenumire();
	}

	@Override
	public int getPuncteViata() {
		return (int) caracter.getNivelEnergie();
	}

	@Override
	public void getDescriere() {
		System.out.println(
				caracter.getDenumire() + " - " + caracter.getNivelEnergie());
	}

	@Override
	public void esteAtacat(int puncte) {
		caracter.interactioneaza(puncte);
	}

	@Override
	public void seVindeca(int puncte) {
		caracter.resetareEnergie();
	}
	
	
}
