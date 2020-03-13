package ro.ase.csie.cts.course4;

import ro.ase.csie.cts.course4.accounting.AccountingInterface;
import ro.ase.csie.cts.course4.accounting.NewAccountingDep;

public class Student {
	private String name;
	private int age;
	
	private AccountingInterface accDep;
	
	
	
	public void setAccDep(AccountingInterface accDep) {
		this.accDep = accDep;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
		this.setAccDep(new NewAccountingDep());
		
	}
/*	void payTuition(){ 
		System.out.println("Student " + this.name + 
				" is paying 1 RON");
	}*/
	
	void payTuition() throws MissingRefException{ 
		if(accDep != null)
			accDep.payTuition(this.name);
		else
			throw new MissingRefException();
	}
	
	void takeOOPExam(String prof){ 
		System.out.println("Student " + this.name + 
				" is taking the OOP exam on computer");
	}
	void saveToDB(){ 
		System.out.println("Save student");
		System.out.println(this.name + ";" + this.age);
	}
}
