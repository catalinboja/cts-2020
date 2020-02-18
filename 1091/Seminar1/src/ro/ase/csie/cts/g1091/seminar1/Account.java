package ro.ase.csie.cts.g1091.seminar1;

import ro.ase.csie.cts.g1091.seminar1.exeptions.InsufficientFundsException;

public abstract class Account {
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount) throws InsufficientFundsException;
	public abstract double getBalance();
	public abstract void transfer(
			double amount, Account destination);
}
