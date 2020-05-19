package ro.ase.csie.cts.g1085.seminar12.decorator;

public class DecoratorScut extends DecoratorAbstract{

	String tipScut;
	
	public DecoratorScut(CaracterAbstract caracter, String tipScut) {
		super(caracter);
		this.tipScut = tipScut;
	}

	@Override
	public void seApara(int puncte) {
		System.out.println(this.caracter.getNume() + 
				" foloseste un scut de tip " + this.tipScut);
		this.caracter.seApara(puncte/2);
	}

	
	
}
