package ro.ase.csie.cts.g1092.seminar2;

import ro.ase.csie.cts.g1092.seminar2.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1092.seminar2.exceptions.InsufficientFundsException;

public class SavingsAccount 
	extends BankAccount implements Profitable{
	
	public static final double MIN_BALANCE = 100;

	public SavingsAccount(String iban) {
		super(iban, MIN_BALANCE);
	}

	@Override
	public void addInterest(double interestRatePercent) {
		this.balance *= (1 + interestRatePercent/100);
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance-amount < MIN_BALANCE)
			throw new InsufficientFundsException();
		else
			this.balance -= amount;
	}

	@Override
	public void transfer(double amount, Account destination)
			throws InsufficientFundsException, IllegalTransferException {
		if(this == destination)
			throw new IllegalTransferException("Same accounts");
		if(! (destination instanceof BankAccount))
			throw new IllegalTransferException();
		this.withdraw(amount);
		destination.deposit(amount);
	}

}
