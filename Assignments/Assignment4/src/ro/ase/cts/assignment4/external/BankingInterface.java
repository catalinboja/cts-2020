package ro.ase.cts.assignment4.external;

public interface BankingInterface {
	
	/*
	 * 
	 * @return true if the iban is OK
	 * @return false if the iban is not OK
	 * 
	 */
	public abstract boolean isValidIBAN(String iban);
	
	
	/*
	 * 
	 * @return 1 if the payment succeeded 
	 * @return 0 if the payment was not processed by the service
	 * @return -1 if the payment was rejected by the bank
	 * 
	 * throws PaymentsException if the destinationIBAN or the sourceIBAN are not ok
	 * 
	 */
	
	public abstract int payOnline(String sourceIBAN, String destinationIBAN) throws PaymentsException;
	
	

}
