package ro.ase.csie.cts.g1085.seminar12.decorator;

public class DecoratorAlertaRanitCritic extends DecoratorAbstract{

	public DecoratorAlertaRanitCritic(CaracterAbstract caracter) {
		super(caracter);
	}

	@Override
	public void seApara(int puncte) {
		this.caracter.seApara(puncte);
		if(this.caracter.getPuncteViata() < 100)
			System.out.println("Alerta ! Caracterul este ranit critic !");
	}
	
}
