package ro.ase.cts.g1074.seminar11;

import ro.ase.cts.g1074.seminar11.adapter.CaracterACME;

public class DecoratorCuScut extends DecoratorCaracterACME {
	
	String tipScut;
	

	public DecoratorCuScut(CaracterACME caracter, String scut) {
		super(caracter);
		this.tipScut = scut;
	}
	
	@Override
	public void esteLovit(int puncte) {
		System.out.println("Eroul foloseste scutul  de tip " + tipScut);
		caracter.esteLovit(puncte/2);
	}

}
