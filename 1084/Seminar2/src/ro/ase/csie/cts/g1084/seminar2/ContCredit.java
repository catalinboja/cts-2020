package ro.ase.csie.cts.g1084.seminar2;

import ro.ase.csie.cts.g1084.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1084.seminar2.exceptii.ExceptieTransferIlegal;

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
		else
			this.balanta -= suma;
	}

	@Override
	public void transfer(double suma, Cont destinatie) 
			throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {
		
		
		if(destinatie instanceof ContBancar) {
			//down-cast
			ContBancar cb = (ContBancar) destinatie;
			if(this.iban.equals(cb.iban))
				throw new ExceptieTransferIlegal("Conturi identice !");
		}
		else
			throw new ExceptieTransferIlegal("Destinatie nu este ContBancar");
		
		
		this.retrage(suma);
		destinatie.depune(suma);


	}

}
