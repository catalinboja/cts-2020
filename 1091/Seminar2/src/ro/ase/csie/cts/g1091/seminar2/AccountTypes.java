package ro.ase.csie.cts.g1091.seminar2;

public enum AccountTypes {
	CURRENT, SAVINGS;
	
	private double interestRate = 0;
	public String toString() {
		return "The account type is " + this.name();
	}
}
