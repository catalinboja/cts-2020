package ro.ase.csie.cts.g1074.seminar13.strategy;

public class ModulPuncteBonus {
	
	InterfataCalculPuncteBonus strategieCurenta = null;
	
	//optional
	public ModulPuncteBonus(InterfataCalculPuncteBonus strategieCurenta) {
		super();
		this.strategieCurenta = strategieCurenta;
	}
	

	public void setStrategieCurenta(InterfataCalculPuncteBonus strategieCurenta) {
		this.strategieCurenta = strategieCurenta;
	}

	public int getPuncteBonusJucator(String nume, int timpJoc) {
		if(strategieCurenta != null) {
			return strategieCurenta.getPuncteBonus();
		}
		else
			throw new UnsupportedOperationException();
	}
	
}
