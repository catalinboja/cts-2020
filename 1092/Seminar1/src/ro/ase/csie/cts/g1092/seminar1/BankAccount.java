package ro.ase.csie.cts.g1092.seminar1;

public abstract class BankAccount extends Account{
	protected double balance;
	protected String iban;
	
	private BankAccount() {
		
	}
	
	public BankAccount(String iban, double balance) {
		this.iban = iban;
		this.balance = balance;
	}
	
	@Override
	public double getBalance() {
		return this.balance;
	}
}
