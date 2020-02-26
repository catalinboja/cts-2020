package ro.ase.csie.cts.g1074.seminar2;

public abstract class ContBancar extends Cont {
	protected String iban;
	protected double balanta;
	
	public ContBancar(String iban, double balanta) {
		this.iban = iban;
		this.balanta =balanta;
	}
	
	@Override
	public double getBalanta() {
		return this.balanta;
	}
}
