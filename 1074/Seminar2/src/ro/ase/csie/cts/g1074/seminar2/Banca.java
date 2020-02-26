package ro.ase.csie.cts.g1074.seminar2;

public class Banca {
	protected String denumire;
	private static int nextId = 0;
	
	public Banca(String denumire) {
		super();
		this.denumire = denumire;
	}
	
	public ContBancar deschideCont(
			TipConturiBancare tip) {
		nextId+=1;
		String iban = 
				this.denumire + nextId;
		switch(tip) {
		case DEPOZIT:
			return new ContDepozit(iban);
		case CREDIT:
			return new ContCredit(iban);
		default:
			throw new UnsupportedOperationException();	
		}
	}
	
}
