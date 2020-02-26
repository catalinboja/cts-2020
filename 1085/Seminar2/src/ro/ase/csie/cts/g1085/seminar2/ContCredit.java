package ro.ase.csie.cts.g1085.seminar2;

import ro.ase.csie.cts.g1085.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1085.seminar2.exceptii.ExceptieTransferIlegal;

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
	public void transfer(double suma, Cont destinatie) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {
		if(destinatie instanceof ContBancar) {
			ContBancar cont = (ContBancar) destinatie;
			if(this.iban.equals(cont.iban))
				throw new ExceptieTransferIlegal("Conturi identice");
		}
		else
			throw new ExceptieTransferIlegal(
					"Contul nu este cont bancar");
		
		if(suma <= this.getBalanta())
			this.extrage(suma);
		else
			throw new ExceptieFonduriInsuficiente();
		
		destinatie.depune(suma);
		
	}

}
