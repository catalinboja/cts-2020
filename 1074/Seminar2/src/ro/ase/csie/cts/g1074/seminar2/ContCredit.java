package ro.ase.csie.cts.g1074.seminar2;

import ro.ase.csie.cts.g1074.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1074.seminar2.exceptii.ExceptieTransferIlegal;

public class ContCredit extends ContBancar{
	
	public static final double MAX_CREDIT = 5000;

	public ContCredit(String iban) {
		super(iban, MAX_CREDIT);
	}

	@Override
	public void retrage(double suma) throws ExceptieFonduriInsuficiente {
		if(suma <= this.balanta)
			this.balanta -= suma;
		else
			throw new ExceptieFonduriInsuficiente();
	}

	@Override
	public void depune(double suma) {
		this.balanta += suma;
	}

	@Override
	public void transfer(double suma, Cont destinatie) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {
		if(destinatie instanceof ContBancar)
		{
			//down-cast
			ContBancar cb = (ContBancar) destinatie;
			if(this.iban.equals(cb.iban))
				throw new ExceptieTransferIlegal("Conturile sunt identice");		
		}
		else
			throw new ExceptieTransferIlegal("Destinatia nu este cont bancar");
		this.retrage(suma);
		destinatie.depune(suma);

		
	}

}
