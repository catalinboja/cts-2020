package ro.ase.csie.cts.g1092.seminar2;

import ro.ase.csie.cts.g1092.seminar2.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1092.seminar2.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount {
	
	public static final double MAX_CREDIT = 5000;

	public CurrentAccount(String iban) {
		super(iban, MAX_CREDIT);
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount <= this.balance)
			this.balance -= amount;
		else
			throw new InsufficientFundsException();
	}

	@Override
	public void transfer(double amount, Account destination) 
				throws InsufficientFundsException, IllegalTransferException {
		
		if(destination instanceof  BankAccount)
		{
			BankAccount bAccount = (BankAccount) destination;
			if(this.iban.equals(bAccount.iban))
				throw new IllegalTransferException("The accounts are the same !");
		}
		else
			throw new IllegalTransferException("The destination is not a BankAccount");
		
		if(this.getBalance() >= amount)
			this.withdraw(amount);
		else
			throw new InsufficientFundsException();
		
		destination.deposit(amount);
		

	}

}
