package ro.ase.csie.cts.g1091.seminar7;

import java.util.ArrayList;

import ro.ase.csie.cts.g1091.seminar7.exceptions.StudentInvalidDataException;

/*
 * age is in [14, 90]
 * name size is at least 3 chars but no more than 255
 * each grade is in [1, 10]
 * 
 */

public class Student {
	
	public static final int MIN_AGE = 14;
	public static final int MAX_AGE = 90;
	public static final int MIN_GRADE = 1;
	public static final int MAX_GRADE = 10;
	public static final int MIN_NAME_SIZE = 3;
	public static final int MAX_NAME_SIZE = 255;

	String name;
	int age;
	ArrayList<Integer> grades;
	
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

	public void setAge(int age) throws StudentInvalidDataException{
		this.age = age;
	}

	public void setGrades(ArrayList<Integer> grades) 
				throws StudentInvalidDataException {
		
		if(grades == null)
			this.grades = null;
		else
			this.grades = (ArrayList<Integer>) grades.clone();
		//this.grades = grades;
	}
	
	public int getNoGrades() {
		return this.grades.size();
	}
	
	public int getGrade(int index) {
		return this.grades.get(index);
	}
	
	public float getGradesMean2Decimals() 
				throws StudentInvalidDataException{
		
		if(this.grades == null)
			throw new StudentInvalidDataException();
		
		float sum = 0;
		for(int grade : this.grades)
			sum += grade;
		
		float average = sum / this.grades.size();
		
		return (int)(average * 100)/100.0f;
	}
	
}
