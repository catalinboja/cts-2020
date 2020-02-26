package ro.ase.csie.cts.g1091.seminar2;

public abstract class BankAccount extends Account {
	protected double balance;
	protected String iban;
	
	@Override
	public double getBalance() {
		return this.balance;
	}
	
	public BankAccount(String iban, double balance) {
		this.iban = iban;
		this.balance = balance;
	}
	
	
}
