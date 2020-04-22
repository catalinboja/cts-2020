package ro.ase.cts.tema4;

import ro.ase.cts.tema4.exceptii.ExceptieCont;
import ro.ase.cts.tema4.exceptii.ExceptieIbanInvalid;
import ro.ase.cts.tema4.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.cts.tema4.exceptii.ExceptieServiciuBancar;
import ro.ase.cts.tema4.externe.InterfataServiciuBancar;
import ro.ase.cts.tema4.externe.ExceptiePlata;

public class Cont {
	
	String iban;
	String titular;
	double balanta;
	
	InterfataServiciuBancar serviciuBancar;

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) throws ExceptieIbanInvalid, ExceptieServiciuBancar {
		if(this.serviciuBancar == null)
			throw new ExceptieServiciuBancar();
		if(serviciuBancar.esteIBANValid(iban))
			this.iban = iban;
		else
			throw new ExceptieIbanInvalid();
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getBalanta() {
		return balanta;
	}

	public void setBalanta(double balanta) {
		this.balanta = balanta;
	}

	public void setBankService(InterfataServiciuBancar paymentService) {
		this.serviciuBancar = paymentService;
	}

	public Cont(String iban, String titular, double balanta, InterfataServiciuBancar paymentService) throws ExceptieIbanInvalid, ExceptieServiciuBancar {
		this.setIban(iban);
		this.setTitular(titular);
		this.setBalanta(balanta);
	}
	
	
	public void plata(String destinationIBAN, double suma) throws ExceptieFonduriInsuficiente, ExceptieServiciuBancar, ExceptieIbanInvalid, ExceptieCont {
		if(this.balanta < suma)
			throw new ExceptieFonduriInsuficiente();
		
		if(this.serviciuBancar == null)
			throw new ExceptieServiciuBancar();
		
		if(!this.serviciuBancar.esteIBANValid(destinationIBAN))
			throw new ExceptieIbanInvalid();
		
		try {
			int rezultat = this.serviciuBancar.plataOnline(this.iban, destinationIBAN);
			
			switch(rezultat) {
			case 1:
				this.balanta -= suma;
				break;
			case 0:
				throw new ExceptieServiciuBancar();
			case -1:
				throw new ExceptieCont();
			default:
				throw new UnsupportedOperationException();	
			}
			
		} catch (ExceptiePlata e) {
			throw new ExceptieCont();
		}
	}
}
