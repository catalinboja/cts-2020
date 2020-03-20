package ro.ase.csie.cts.g1091.seminar5.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1091.seminar5.NullGradesException;
import ro.ase.csie.cts.g1091.seminar5.Student;

public class TestStudent {
	
	//test fixture
	Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setup global");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("teardown global");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		
		//1. define input data
		ArrayList<Integer> inputGrades = 
				new ArrayList<>();
		
		student = new Student("", 0, inputGrades);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("teardown");
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetGradesAverageRightValues() throws NullGradesException{
		//1. define input data
		ArrayList<Integer> inputGrades = 
				new ArrayList<>();
		inputGrades.add(9);
		inputGrades.add(10);
		inputGrades.add(9);
		
		Student student = 
				new Student("John",20, inputGrades);
		
		//2. define the expected result
		float expectedAverage = 9.33f;
		
		//3. test the function & get the result
		float computedAverage = 
				student.getGradesAverage();
		
		//4. compare results & finish the test with fail/success
		assertEquals("The average is not ok for right values",
				expectedAverage, computedAverage,0.005);
	}
	
	@Test
	public void testGetGradesAverageNoGrades() throws NullGradesException {
		
		//1. define specific input data
		ArrayList<Integer> noGrades = 
				new ArrayList<>();
		student.setGrades(noGrades);
		
		//2. define the expected result
		float expectedAverage = 0.00f;
		
		//3.
		float computedAverage = 
				student.getGradesAverage();
		//4.
		assertEquals("Average for 0 grades",
				expectedAverage, computedAverage,0);
		
	}
	
	@Test
	public void testGetGradesAverageNullReference() {
		//1.
		student.setGrades(null);
		
		try {
			student.getGradesAverage();
			fail("We got no exception");
		}
		catch(NullGradesException err) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail("We got a different exception");
		}
		
	}
	
	@Test(expected = NullGradesException.class)
	public void testGetGradesAverageNullReferenceJunit4() 
			throws NullGradesException {

		student.setGrades(null);
		student.getGradesAverage();
		
	}

	
	
}
