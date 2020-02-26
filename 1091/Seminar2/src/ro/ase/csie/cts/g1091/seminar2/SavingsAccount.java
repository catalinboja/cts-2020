package ro.ase.csie.cts.g1091.seminar2;

import ro.ase.csie.cts.g1091.seminar2.exeptions.IllegalTransferException;
import ro.ase.csie.cts.g1091.seminar2.exeptions.InsufficientFundsException;

public class SavingsAccount 
	extends BankAccount implements Profitable{
	
	public static final double MIN_BALANCE = 100;

	public SavingsAccount(String iban) {
		super(iban, MIN_BALANCE);
	}

	@Override
	public void addInterest(double interestRatePercentage) {
		this.balance *= (1 + interestRatePercentage/100);
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance - amount < MIN_BALANCE)
			throw new InsufficientFundsException();
		this.balance -= amount;
	}

	@Override
	public void transfer(double amount, Account destination)
			throws InsufficientFundsException, IllegalTransferException {
		//just check the references - we accept the risks
		if(this == destination)
			throw new IllegalTransferException("Same accunt");
		this.withdraw(amount);
		destination.deposit(amount);
	}

}
