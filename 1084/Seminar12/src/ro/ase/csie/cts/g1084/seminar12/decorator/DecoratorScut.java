package ro.ase.csie.cts.g1084.seminar12.decorator;

import ro.ase.csie.cts.g1084.seminar12.adapter.InterfataCaractereACME;

public class DecoratorScut extends DecoratorACME{
	
	String scut;

	public DecoratorScut(InterfataCaractereACME erou, String scut) {
		super(erou);
		this.scut = scut;
	}

	@Override
	public void esteAtacat(int puncte) {
		System.out.println("Se apara cu un scut " + scut);
		super.esteAtacat(puncte/2);
	}
	
	
	public InterfataCaractereACME eliminaScut() {
		return this.erou;
	}

}
