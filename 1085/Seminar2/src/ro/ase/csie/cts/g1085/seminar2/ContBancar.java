package ro.ase.csie.cts.g1085.seminar2;

public abstract class ContBancar extends Cont{
	protected double balanta;
	protected String iban;
	
	@Override
	public double getBalanta() {
		return this.balanta;
	}
	
	public ContBancar(String iban, double balanta) {
		this.iban = iban;
		this.balanta = balanta;
	}
}
