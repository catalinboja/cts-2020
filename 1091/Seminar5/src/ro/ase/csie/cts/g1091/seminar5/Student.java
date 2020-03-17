package ro.ase.csie.cts.g1091.seminar5;

import java.util.ArrayList;

public class Student {

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
	
	
	public float getGradesAverage() {
		float sum = 0;
		for(int grade: this.grades) {
			sum += grade;
		}
		return sum/this.grades.size();
	}
	
	
}
