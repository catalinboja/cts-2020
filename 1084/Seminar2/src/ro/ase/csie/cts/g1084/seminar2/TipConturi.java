package ro.ase.csie.cts.g1084.seminar2;

public enum TipConturi {
	CREDIT, DEBIT;
	
	private int gradRisc;
	public int getRisc() {return gradRisc;}
	@Override
	public String toString() {
		return "Contul este de tip " + this.name();
	}
}
