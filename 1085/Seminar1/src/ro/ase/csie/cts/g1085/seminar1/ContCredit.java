package ro.ase.csie.cts.g1085.seminar1;

import ro.ase.csie.cts.g1085.seminar1.exceptii.ExceptieFonduriInsuficiente;

public class ContCredit extends ContBancar{
	
	public static final double MAX_CREDIT = 5000;

	public ContCredit(String iban) {
		super(iban, MAX_CREDIT);
	}

	@Override
	public void depune(double suma) {
		this.balanta += suma;
	}

	@Override
	public void extrage(double suma) throws ExceptieFonduriInsuficiente {
		if(suma <= this.balanta)
			this.balanta -= suma;
		else
			throw new ExceptieFonduriInsuficiente();
	}

	@Override
	public void transfer(double suma, Cont destinatie) {
		// TODO Auto-generated method stub
		
	}

}
