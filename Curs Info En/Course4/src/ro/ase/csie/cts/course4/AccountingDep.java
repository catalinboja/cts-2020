package ro.ase.csie.cts.course4;

import ro.ase.csie.cts.course4.accounting.AccountingInterface;

public class AccountingDep implements AccountingInterface {
	@Override
	public void payTuition(String studentName) {
		System.out.println("Student " + studentName + 
				" is paying 500 RON");
	}
}
