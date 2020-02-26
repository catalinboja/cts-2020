package ro.ase.csie.cts.g1092.seminar2;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<BankAccount> accounts = 
				new ArrayList<>();
		
		Bank bank = new Bank("BCR");
		
		accounts.add(bank.openAccount(AccountTypes.SAVINGS));
		accounts.add(bank.openAccount(AccountTypes.SAVINGS));
		accounts.add(bank.openAccount(AccountTypes.CURRENT));
	}

}
