package ro.ase.csie.cts.g1084.seminar2;

public abstract class ContBancar extends Cont{
	protected String iban;
	protected double balanta;
	
	@Override
	public double getBalanta() {
		return this.balanta;
	}

	public ContBancar(String iban, double balanta) {
		super();
		this.iban = iban;
		this.balanta = balanta;
	}
	
}
