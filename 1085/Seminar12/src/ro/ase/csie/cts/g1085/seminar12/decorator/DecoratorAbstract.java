package ro.ase.csie.cts.g1085.seminar12.decorator;

public abstract class DecoratorAbstract extends CaracterAbstract {

	CaracterAbstract caracter = null;
	
	public DecoratorAbstract(CaracterAbstract caracter) {
		super("", 0);
		this.caracter = caracter;
	}

	@Override
	public void ataca() {
		this.caracter.ataca();
	}

	@Override
	public void seApara(int puncte) {
		this.caracter.seApara(puncte);
	}

	@Override
	public void seVindeca(int puncte) {
		this.caracter.seVindeca(puncte);
	}
	
	

}
