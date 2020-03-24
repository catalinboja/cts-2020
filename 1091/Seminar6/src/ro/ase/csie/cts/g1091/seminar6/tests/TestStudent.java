package ro.ase.csie.cts.g1091.seminar6.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1091.seminar6.Student;
import ro.ase.csie.cts.g1091.seminar6.exceptions.StudentBadValueException;

public class TestStudent {
	
	//test fixture
	
	public static final String NAME = "Bob";
	public static final int AGE = 21;
	public static final ArrayList<Integer> GRADES = 
			new ArrayList<>();
	
	public Student student;

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
	
	//Right from Right-BICEP
	//Conformance from CORRECT
	
	@Test
	public void testConstructorRightInitAttributes() {
		String initialName = "Bob";
		int initialAge = 21;
		ArrayList<Integer> initialGrades = 
				new ArrayList<>();
		initialGrades.add(9);
		initialGrades.add(10);
		
		Student student = 
				new Student(initialName, initialAge, initialGrades);
		
		assertEquals(initialName, student.getName());
		assertEquals(initialAge, student.getAge());
		for(int i = 0;i < initialGrades.size(); i++) {
			assertEquals((int)initialGrades.get(i), 
					student.getGrade(i));
		}
		
	}
	
	@Test
	public void testConstructorRightCreateObjects() {
		try {
			Student student = new Student(NAME, AGE, GRADES);
			assertNotNull(student);		
		}
		catch(Exception e) {
			fail("The ctor is throwing an exception for Right values");
		}	
	}
	
	
	@Test
	public void testGetGradesMean2DecimalsRight() {
		ArrayList<Integer> newGrades = 
				new ArrayList<>();
		newGrades.add(9);
		newGrades.add(9);
		newGrades.add(10);
		student.setGrades(newGrades);
		
		float expectedAverage = 9.33f;
		
		float computedAverage = 
				student.getGradesMean2Decimals();
		
		assertEquals(expectedAverage, computedAverage, 0);
	}
	
	
	//Error Conditions - from Right-BICEP
	//Conformance - for wrong values you should throw exceptions
	
	@Test(expected = StudentBadValueException.class)
	public void testConstructorBadValuesError() {
		int wrongAge = -23;
		String wrongName = "J";
		ArrayList<Integer> noGrades = null;
		
		Student student = new Student(wrongName, 
				wrongAge, noGrades);
	}
	
	
	

}
