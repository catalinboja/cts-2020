package ro.ase.cts.g1074.seminar11;

import ro.ase.cts.g1074.seminar11.adapter.CaracterACME;

public abstract class DecoratorCaracterACME extends CaracterACME{
	
	CaracterACME caracter;
	
	public DecoratorCaracterACME(CaracterACME caracter) {
		this.caracter = caracter;
	}
	
	@Override
	public void afisareDetalii() {
		System.out.println(this.caracter.nume + " - " + this.caracter.puncteViata);
	}

	
	
	@Override
	public void esteLovit(int puncte) {
		caracter.esteLovit(puncte);
	}

	@Override
	public void seVindeca(int puncte) {
		caracter.seVindeca(puncte);
	}
}
