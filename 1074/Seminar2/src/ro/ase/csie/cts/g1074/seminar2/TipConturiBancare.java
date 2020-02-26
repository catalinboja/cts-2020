package ro.ase.csie.cts.g1074.seminar2;

public enum TipConturiBancare {
	CREDIT,
	DEPOZIT;
	
	public static TipConturiBancare getTip(int cod) 
			throws Exception {
		switch(cod) {
		case 1:
			return CREDIT;
		case 2:
			return DEPOZIT;
		default:
			throw new Exception("Tip gresit");	
		}
	}
	
	public String toString() {
		return "Cont de tip " + this.name();
	}
}
