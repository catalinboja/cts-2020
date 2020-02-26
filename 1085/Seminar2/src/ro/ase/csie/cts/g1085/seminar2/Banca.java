package ro.ase.csie.cts.g1085.seminar2;

public class Banca {
	private String nume;
	private static int nextId = 0;
	
	public Banca(String nume) {
		super();
		this.nume = nume;
	}
	
	public ContBancar deschideCont(TipConturi tipCont) {
		String iban = this.nume + (++nextId);
		switch(tipCont) {
		case DEPOZIT:
			return new ContDepozit(iban);
		case CREDIT:
			return new ContCredit(iban);
		default:
			throw new UnsupportedOperationException();	
		}
	}
	
	
}
