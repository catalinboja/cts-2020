package ro.ase.csie.cts.course6;

import java.util.ArrayList;

import ro.ase.csie.cts.course6.exceptions.StudentWrongValuesException;

/*
 * age in [14, 90]
 * name at least 3 chars without digits (only letters)
 * name at most 255
 * grades in [1, 10]
 * 
 * for any wrong input data the methods will throw 
 * 	a specific Exception - StudentWrongValuesException
 */

public class Student {
	
	public static final int AGE_MIN = 14;
	public static final int AGE_MAX = 90;
	public static final int GRADE_MIN = 1;
	public static final int GRADE_MAX = 10;
	public static final int NAME_MIN_LEGTH = 3;
	
	String name;
	int age;
	ArrayList<Integer> grades;
	
	
	public Student(String name, int age, 
			ArrayList<Integer> grades) {
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


	public void setAge(int age) {
		this.age = age;
	}


	public ArrayList<Integer> getGrades() {
		return grades;
	}


	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}
	
	public float getGradesMean2Decimals() 
			throws StudentWrongValuesException {
		return 0;
	}
	
}
