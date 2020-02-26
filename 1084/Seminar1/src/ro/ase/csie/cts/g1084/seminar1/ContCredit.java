package ro.ase.csie.cts.g1084.seminar1;

import ro.ase.csie.cts.g1084.seminar1.exceptii.ExceptieFonduriInsuficiente;

public class ContCredit extends ContBancar{
	
	private static final double MAX_CREDIT = 5000;

	public ContCredit(String iban) {
		super(iban, MAX_CREDIT);
	}

	@Override
	public void depune(double suma) {
		this.balanta += suma;
	}

	@Override
	public void retrage(double suma) throws ExceptieFonduriInsuficiente {
		if(suma > this.balanta) {
			throw new ExceptieFonduriInsuficiente();
		}
	}

	@Override
	public void transfer(double suma, Cont destinatie) {
		// TODO Auto-generated method stub
		
	}

}
