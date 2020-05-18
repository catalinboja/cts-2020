package ro.ase.csie.cts.g1084.seminar12;

import ro.ase.csie.cts.g1084.seminar12.adapter.InterfataCaractereACME;

public class DecoratorRanitCritic extends DecoratorACME{

	public DecoratorRanitCritic(InterfataCaractereACME erou) {
		super(erou);
	}

	@Override
	public void esteAtacat(int puncte) {
		super.esteAtacat(puncte);
		if(this.erou.getPuncteViata() < 100)
			System.out.println("Atentie ! Este ranit critic");
	}
	
	

}
