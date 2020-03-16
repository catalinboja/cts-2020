package ro.ase.csie.cts.g1092.seminar5.tests;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1092.seminar5.Student;

public class TestStudent {
	
	//test fixture
	Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("global setup");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("global teardown");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		
		//1 prepare the test - define the input data
		ArrayList<Integer> someGrades = new ArrayList<>();
		
		student = new Student(someGrades, 21, "John");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("teardown");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetGradesAverageForNormalCase() {
		
		//1 prepare the test - define the input data
		ArrayList<Integer> someGrades = new ArrayList<>();
		someGrades.add(10);
		someGrades.add(9);
		someGrades.add(9);
		
		Student student = new Student(someGrades, 21, "John");
		
		//2 define the expected value
		float expectedAverage = 9.33f;
		
		//3 get the function result
		float average = student.getGradesAverage();
		
		//4 asses the result
		assertEquals("Check the average algorithm",
				expectedAverage, average ,0.004);
	}
	
	@Test
	public void testGetGradesAverageForNoGrades() {

		//1
		ArrayList<Integer> noGrades = new ArrayList<>();
		student.setGrades(noGrades);
		
		//2 define the expected value
		float expectedAverage = 0;
		
		//3 get the function result
		float average = student.getGradesAverage();
		
		//4 asses the result
		assertEquals("Check the average algorithm for no grades",
				expectedAverage, average ,0);
	}
	

}
