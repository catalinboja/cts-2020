package ro.ase.csie.cts.g1092.seminar7.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1092.seminar7.Student;
import ro.ase.csie.cts.g1092.seminar7.exceptions.StudentExceptionWrongInputValues;

public class TestStudent {
	
	//test fixture
	Student student;
	
	public static final String NAME = "John Doe";
	public static final int AGE = Student.MAX_AGE;
	public static final ArrayList<Integer> GRADES = 
			new ArrayList<>();
	
	public static final int NO_GRADES = 3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		for(int i = 0; i < NO_GRADES; i++)
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
	
	//Right or Conformance test
	@Test
	public void testGetGradesAverage2DecimalsRight() {
		ArrayList<Integer> grades = 
				 new ArrayList<>(Arrays.asList(9,9,10));
		student.setGrades(grades);
		
		float expectedAverage = 9.33f;
		float computedAverage = 0;
		try {
			computedAverage = student.getGradesAverage2Decimals();
		} catch (StudentExceptionWrongInputValues e) {
			fail("We don't expect an exception");
		}
		
		assertEquals(expectedAverage, computedAverage, 0);
	}
	
	//Error Condition
	//Existence - we test for null grades - the reference don't exist
	
	@Test(expected = StudentExceptionWrongInputValues.class)
	public void testGetGradesAverage2DecimalsErrorGradesDontExist() 
			throws StudentExceptionWrongInputValues {
		ArrayList<Integer> noGrades = null;
		student.setGrades(noGrades);
		student.getGradesAverage2Decimals();
	}
	
	//Cardinality
	// for Cardinality = 0
	//Error Condition - based on our choice - specs
	
	@Test(expected = StudentExceptionWrongInputValues.class)
	public void testGetGradesAverage2DecimalsCardinalityZero() 
				throws StudentExceptionWrongInputValues {
		
		ArrayList<Integer> emptyGrades = 
				new ArrayList<>();
		student.setGrades(emptyGrades);
		
		student.getGradesAverage2Decimals();
		
	}
	
	//Cardinality
	// for Cardinality = 1
	@Test
	public void testGetGradesAverage2DecimalsCardinalityOne() 
			throws StudentExceptionWrongInputValues {
		
		Random random = new Random();
		int theGrade = random.nextInt(
				Student.MAX_GRADE - Student.MIN_GRADE + 1) 
				+  Student.MIN_GRADE;
		
		ArrayList<Integer> grades = 
				new ArrayList<>(Arrays.asList(theGrade));
		student.setGrades(grades);
		
		float expectedAverage = theGrade;
		float computedAverage = student.getGradesAverage2Decimals();

		assertEquals(expectedAverage, computedAverage, 0);
	}

	//Ordering - ascending | descending | random lists
	@Test
	public void testGetGradesAverage2DecimalsAscSortedList() 
			throws StudentExceptionWrongInputValues {
		ArrayList<Integer> grades = 
				new ArrayList<>(Arrays.asList(5,6,7,8,9));
		student.setGrades(grades);
		
		float expected = 7;
		float computed = student.getGradesAverage2Decimals();
		
		assertEquals(expected, computed, 0);	
	}
	
	//Reference - check if the external entity exists
	// - test if the external entity is influencing the object state (values)
	//	 shallow-copy vs. deep-copy
	// we expect deep-copy
	@Test
	public  void testSetGradesShallowCopy() {
		ArrayList<Integer> inputGrades = 
				new ArrayList<>(Arrays.asList(9,8,10));
		
		student.setGrades(inputGrades);
		ArrayList<Integer> studentGrades = new ArrayList<>();
		for(int i = 0 ; i <student.getNoGrades();i++)
			studentGrades.add(student.getGrade(i));
		
		//alternative
		//studentGrades = (ArrayList<Integer>) inputGrades.clone();
		
		//changing the external reference
		inputGrades.set(0, 10);
		
		for(int i = 0; i < student.getNoGrades(); i++) {
			assertEquals((int)studentGrades.get(i), student.getGrade(i));
		}
		
	}
	
	
	
	
	
}
