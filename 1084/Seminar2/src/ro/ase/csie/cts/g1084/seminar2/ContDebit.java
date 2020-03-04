package ro.ase.csie.cts.g1084.seminar2;

import ro.ase.csie.cts.g1084.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1084.seminar2.exceptii.ExceptieTransferIlegal;

public class ContDebit extends ContBancar 
	implements Profitabil {
	
	public final static double BALANTA_MINIMA = 100;

	public ContDebit(String iban) {
		super(iban, BALANTA_MINIMA);
	}

	@Override
	public void adaugaDobanda(
			double rataDobandaValoareAbsoluta) {
		this.balanta *= (1+rataDobandaValoareAbsoluta);
	}

	@Override
	public void depune(double suma) {
		this.balanta += suma;
	}

	@Override
	/*
	 * 
	 * @return 
	 * (non-Javadoc)
	 * @see ro.ase.csie.cts.g1084.seminar2.Cont#retrage(double)
	 */
	public void retrage(double suma) throws ExceptieFonduriInsuficiente {
		if(this.balanta-suma < BALANTA_MINIMA)
			throw new ExceptieFonduriInsuficiente();
		else
			this.balanta -= suma;
	}

	@Override
	public void transfer(double suma, Cont destinatie) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {
		if(!(destinatie instanceof ContBancar))
			throw new ExceptieTransferIlegal("Contul nu este bancar !");
		
		//verificare referinte
		//TODO: verificare IBAN
		if(this == destinatie)
			throw new ExceptieTransferIlegal("Conturi identice");
		
		this.retrage(suma);
		destinatie.depune(suma);
		
	}

}
