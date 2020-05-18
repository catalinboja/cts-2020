package ro.ase.cts.g1074.seminar11.decorator;

import ro.ase.cts.g1074.seminar11.adapter.CaracterACME;

public class DecoratorAlertaRanitCritic extends DecoratorCaracterACME {

	public DecoratorAlertaRanitCritic(CaracterACME caracter) {
		super(caracter);
	}
	
	@Override
	public void esteLovit(int puncte) {
		caracter.esteLovit(puncte);
		if(caracter.puncteViata < 100)
			System.out.println("Este ranit critic");
	}

}
