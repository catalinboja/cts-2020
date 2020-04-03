package ro.ase.csie.cts.g1091.seminar7.tests;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1091.seminar7.Student;
import ro.ase.csie.cts.g1091.seminar7.exceptions.StudentInvalidDataException;

public class TestStudent {
	
	//test fixture
	Student student;
	
	public static final String NAME = "John Doe";
	public static final int AGE = Student.MIN_AGE;
	public static final ArrayList<Integer> GRADES;
	
	static {
		GRADES = new ArrayList<>();
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		int noGrades = 3;
		for(int i = 0; i < noGrades; i++)
			GRADES.add(Student.MAX_GRADE);
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
	
	//Right test
	//Existence test for grades - you have a collection
	@Test
	public void testGetGradesMean2DecimalsRight() 
			throws StudentInvalidDataException {
		
		ArrayList<Integer> grades = 
				new ArrayList<>(Arrays.asList(9,9,10));
		student.setGrades(grades);
		
		float expectedValue = 9.33f;
		float computedValue = 
				student.getGradesMean2Decimals();
		
		assertEquals(expectedValue, computedValue,0);	
	}
	
	//Existence - you don't have the collection
	//grades reference is null
	//Error Condition
	
	@Test(expected = StudentInvalidDataException.class)
	public void testGetGradesMean2DecimalsExistenceNullGrades() 
			throws StudentInvalidDataException {
		
		ArrayList<Integer> nullGrades = null;
		
		try {
			student.setGrades(nullGrades);
		} catch (StudentInvalidDataException e) {
			fail("We got an exception from setGrades");
		}
		
		student.getGradesMean2Decimals();	
	}
	
	//Ordering - grades are ordered ascending
	@Test
	public void testGetGradesMean2DecimalsAscOrdering() 
				throws StudentInvalidDataException {
		ArrayList<Integer> grades =
				new ArrayList<>(Arrays.asList(5,6,7,8,9));
		student.setGrades(grades);
		
		float expectedAverage = 7;
		float computedAverage = 
				student.getGradesMean2Decimals();
		
		assertEquals(expectedAverage, computedAverage,0);
	}
	
	//Cardinality - 0
	@Test
	public void testGetGradesMean2DecimalsCardinalityZero() 
				throws StudentInvalidDataException {
		ArrayList<Integer> grades = new ArrayList<>();
		student.setGrades(grades);
		
		float expectedAverage = 0;
		float computedAverage = 
				student.getGradesMean2Decimals();
		assertEquals(expectedAverage,computedAverage,0);
		
	}
	
	//Cardinality
	@Test
	public void testGetGradesMean2DecimalsCardinalityOne() throws StudentInvalidDataException {
		ArrayList<Integer> grades = 
			new ArrayList<>(Arrays.asList(Student.MIN_GRADE));
		student.setGrades(grades);
		
		float expectedAverage = Student.MIN_GRADE;
		float computedAverage = 
				student.getGradesMean2Decimals();
		
		assertEquals(expectedAverage, computedAverage,0);
	}
	
	//Reference - shallow-copy vs. deep-copy
	//Changing the external array will not affect the student
	@Test
	public void testSetGradesReferenceDeepCopy() throws StudentInvalidDataException {
		ArrayList<Integer> initialGrades = 
				new ArrayList<>(Arrays.asList(8,9,10));
		
		student.setGrades(initialGrades);
		
		ArrayList<Integer> studentGrades = 
				new ArrayList<>();
		for(int i = 0; i < student.getNoGrades(); i++) {
			studentGrades.add(student.getGrade(i));
		}
		
		//change a value in the external collection
		initialGrades.set(0, 5);
		
		for(int i = 0; i < student.getNoGrades(); i++) {
			assertEquals((int)studentGrades.get(i), 
					student.getGrade(i));
		}
		
	}
	

}
