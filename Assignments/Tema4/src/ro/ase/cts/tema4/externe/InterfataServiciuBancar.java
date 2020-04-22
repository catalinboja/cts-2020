package ro.ase.cts.tema4.externe;

public interface InterfataServiciuBancar {
	
	/*
	 * 
	 * @return true if the iban is OK
	 * @return false if the iban is not OK
	 * 
	 */
	public abstract boolean esteIBANValid(String iban);
	
	
	/*
	 * 
	 * @return 1 if the payment succeeded 
	 * @return 0 if the payment was not processed by the service
	 * @return -1 if the payment was rejected by the bank
	 * 
	 * throws PaymentsException if the destinationIBAN or the sourceIBAN are not ok
	 * 
	 */
	
	public abstract int plataOnline(String sourceIBAN, String destinationIBAN) throws ExceptiePlata;
	
	

}
