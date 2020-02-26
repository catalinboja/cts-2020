package ro.ase.csie.cts.g1085.seminar2;

public enum TipConturi {
	DEPOZIT, CREDIT;
	
	private double rataDobanda;
	
	public double getRataDobanda() {
		return this.rataDobanda;
	}
	public String toString() {
		return "Contul este de tip " + this.name();
	}
}
