package ro.ase.csie.cts.g1092.seminar5;

import java.util.ArrayList;

public class Student {
	
	private ArrayList<Integer> grades;
	int age;
	String name;
	
	public Student(ArrayList<Integer> grades, int age, String name) {
		super();
		this.grades = grades;
		this.age = age;
		this.name = name;
	}

	public ArrayList<Integer> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public float getGradesAverage() {
		float sum = 0;
		for(int grade : this.grades) {
			sum += grade;
		}
		return sum/this.grades.size();
		
	}
	
	
}
 