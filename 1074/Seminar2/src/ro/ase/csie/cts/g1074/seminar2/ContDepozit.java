package ro.ase.csie.cts.g1074.seminar2;

import ro.ase.csie.cts.g1074.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.g1074.seminar2.exceptii.ExceptieTransferIlegal;

public class ContDepozit 
	extends ContBancar implements Profitabil{
	
	public static final double MIN_BALANTA = 100;

	public ContDepozit(String iban) {
		super(iban, MIN_BALANTA);
	}

	@Override
	public void adaugaDobanda(double dobandaProcentuala) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrage(double suma) throws ExceptieFonduriInsuficiente {
		if(this.balanta-suma >= MIN_BALANTA)
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
		//verific doar referintele
		if(this == destinatie)
			throw new ExceptieTransferIlegal("Conturile sunt identice");
		this.retrage(suma);
		destinatie.depune(suma);
	}

}
