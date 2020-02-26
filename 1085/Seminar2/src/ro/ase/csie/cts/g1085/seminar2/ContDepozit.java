package ro.ase.csie.cts.g1085.seminar2;

import ro.ase.csie.cts.g1085.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1085.seminar2.exceptii.ExceptieTransferIlegal;

public class ContDepozit 
	extends ContBancar implements Profitabil{
	
	public static final double BALANTA_MINIMA = 100;

	public ContDepozit(String iban) {
		super(iban, BALANTA_MINIMA);
	}

	@Override
	public void adaugaDobanda(double rataDobanziiInProcente) {
		this.balanta *= (1 + rataDobanziiInProcente/100);
	}

	@Override
	public void depune(double suma) {
		this.balanta += suma;
	}

	@Override
	public void extrage(double suma) throws ExceptieFonduriInsuficiente {
		if(this.balanta - suma < BALANTA_MINIMA)
			throw new ExceptieFonduriInsuficiente();
		this.balanta -= suma;
	}

	@Override
	public void transfer(double suma, Cont destinatie) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {
		if(this == destinatie)
			throw new ExceptieTransferIlegal("Conturi identice");
		this.extrage(suma);
		destinatie.depune(suma);
	}

}
