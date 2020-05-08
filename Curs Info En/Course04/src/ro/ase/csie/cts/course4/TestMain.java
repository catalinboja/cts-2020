package ro.ase.csie.cts.course4;

import ro.ase.csie.cts.course4.accounting.NewAccountingDep;

public class TestMain {

	public static void main(String[] args) {
		
		
		Student student = new Student("John", 18);
		
		//student.setAccDep(new AccountingDep());
		student.setAccDep(new NewAccountingDep());
		
		try {
			student.payTuition();
		} catch (MissingRefException e) {
		}
		student.takeOOPExam("Vader");
		student.saveToDB();
	}

}
