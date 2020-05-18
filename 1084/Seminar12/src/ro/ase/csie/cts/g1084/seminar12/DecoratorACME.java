package ro.ase.csie.cts.g1084.seminar12;

import ro.ase.csie.cts.g1084.seminar12.adapter.InterfataCaractereACME;

public abstract class DecoratorACME implements InterfataCaractereACME{

	InterfataCaractereACME erou;

	public DecoratorACME(InterfataCaractereACME erou) {
		super();
		this.erou = erou;
	}

	@Override
	public String getNume() {
		return erou.getNume();
	}

	@Override
	public int getPuncteViata() {
		return erou.getPuncteViata();
	}

	@Override
	public void getDescriere() {
		erou.getDescriere();
	}

	@Override
	public void esteAtacat(int puncte) {
		erou.esteAtacat(puncte);
	}

	@Override
	public void seVindeca(int puncte) {
		erou.seVindeca(puncte);
		
	}
	
	
	
}
