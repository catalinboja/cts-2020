package ro.ase.csie.cts.g1092.seminar2;

public enum AccountTypes {
	SAVINGS, CURRENT;
	
	@Override
	public String toString() {
		return "The account type is " + this.name();
	}
	
	public static AccountTypes getType(int id) {
		switch(id) {
		case 1:
			return SAVINGS;
		case 2:
			return AccountTypes.CURRENT;
		default:
			throw new UnsupportedOperationException();
		}
	
	}
}
