package ro.ase.csie.cts.course4.accounting;

public class NewAccountingDep implements AccountingInterface{

	@Override
	public void payTuition(String studentName) {
		System.out.println(studentName + 
				" is paying online with its PayPal account");
	}

}
