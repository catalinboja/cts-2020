package ro.ase.csie.cts.g1091.seminar6;

import java.util.ArrayList;

public class Student {

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

	public void setAge(int age) {
		this.age = age;
	}

	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}
	
	public int getNoGrades() {
		return this.grades.size();
	}
	
	public int getGrade(int index) {
		return this.grades.get(index);
	}
	
	public float getGradesMean2Decimals() {
		return 0;
	}
	
	
}
