package ro.ase.csie.cts.g1092.seminar7;

import java.util.ArrayList;

import ro.ase.csie.cts.g1092.seminar7.exceptions.StudentExceptionWrongInputValues;

public class Student {
	
	public static final int MIN_AGE = 14;
	public static final int MAX_AGE = 90;
	public static final int MIN_GRADE = 1;
	public static final int MAX_GRADE = 10;
	public static final int MIN_NAME_SIZE = 3;
	public static final int MAX_NAME_SIZE = 255;
	
	protected String name;
	protected int age;
	protected ArrayList<Integer> grades;
	
	
	public Student(String name, int age, ArrayList<Integer> grades) {
		super();
		this.name = name;
		this.age = age;
		this.grades = grades;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) throws StudentExceptionWrongInputValues {
		if(age < MIN_AGE || age > MAX_AGE)
			throw new StudentExceptionWrongInputValues();
		this.age = age;
	}


	public void setGrades(ArrayList<Integer> grades) {
		if(grades == null)
			this.grades = null;
		else {
		this.grades = (ArrayList<Integer>) grades.clone();
		//this.grades = grades;
		}
	}
	
	
	public int getGrade(int index) {
		return this.grades.get(index);
	}
	
	public int getNoGrades() {
		return this.grades.size();
	}
	
	public float getGradesAverage2Decimals() 
			throws StudentExceptionWrongInputValues {	
		
		if(this.grades == null)
			throw new StudentExceptionWrongInputValues();
		
		if(this.grades.size() == 0)
			throw new StudentExceptionWrongInputValues();
		
		float sum = 0;
		for(int grade : this.grades) {
			sum += grade;
		}
		
		float average = sum / this.grades.size();
		
		return ((int)(average*100) / 100.0f);
		
	}
	
}
