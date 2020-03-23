package ro.ase.csie.cts.g1092.seminar6.tests;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1092.seminar6.Student;
import ro.ase.csie.cts.g1092.seminar6.exceptions.StudentExceptionWrongInputValues;

public class TestStudent {
	
	//test fixture 
	public static final String NAME = "John";
	public static final int AGE = 21;
	public static final ArrayList<Integer> GRADES = new ArrayList<>();
	
	Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		GRADES.add(9);
		GRADES.add(10);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(NAME, AGE, GRADES);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	// Right from Right-BICEP
	// Conformance from CORRECT

	@Test
	public void testConstructorRight() {
		String name = "John";
		int age = 21;
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(9);
		grades.add(10);

		Student student = new Student(name, age, grades);

		assertEquals(name, student.getName());
		assertEquals(age, student.getAge());
		for (int i = 0; i < grades.size(); i++) {
			assertEquals((int) grades.get(i), student.getGrade(i));
		}
	}
	
	@Test
	public void testConstructorRightObjectCreation() {
		try {
			Student student = new Student(NAME, AGE, GRADES);
			assertNotNull(student);
		}
		catch(Exception e) {
			fail("The constructor is throwing an exception for Right value");
		}
	}
	
	@Test
	public void testSetAgeRight() throws StudentExceptionWrongInputValues {
		int newAgeValue = 25;
		//int newAgeValue = AGE + 1;
		
		student.setAge(newAgeValue);
		
		assertEquals(newAgeValue, student.getAge());			
	}
	
	@Test
	public void testGetGradesAverage2DecimalsRight() {
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(9);
		grades.add(9);
		grades.add(10);
		
		student.setGrades(grades);
		
		float expectedAverage = 9.33f;
		float computedAverage;
		try {
			
			computedAverage = student.getGradesAverage2Decimals();
			assertEquals(expectedAverage, computedAverage, 0);
			
		} catch (StudentExceptionWrongInputValues e) {
			fail("We got an exception for right values");
		}
	}
	
	//Error conditions 
	@Test(expected = StudentExceptionWrongInputValues.class)
	public void testSetAgeError() throws StudentExceptionWrongInputValues {
		int wrongAge = 0;
		
		student.setAge(wrongAge);
	}

}
