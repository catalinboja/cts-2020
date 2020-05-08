package ro.ase.csie.cts.course7.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.course7.Student;
import ro.ase.csie.cts.course7.exceptions.StudentWrongValuesException;

public class TestStudent {
	

	//test fixture
	public static final String INITIAL_NAME = "John";
	public static final int INITIAL_AGE;
	public static final ArrayList<Integer> GRADES;
	public static final ArrayList<Integer> PERF_GRADES = 
			new ArrayList<>();
	
	Student student;
	
	static {
		INITIAL_AGE = Student.AGE_MIN + 1;
		GRADES = new ArrayList<>();
		
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		GRADES.add(Student.GRADE_MAX);
		GRADES.add(Student.GRADE_MAX - 1);
		
		int maxNumberOfGrades = 100000;
		for(int i = 0; i< maxNumberOfGrades; i++) {
			PERF_GRADES.add(Student.GRADE_MAX);
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(
				INITIAL_NAME, INITIAL_AGE, GRADES);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test(expected = StudentWrongValuesException.class)
	public void testSetAgeErrorNegativeValue() throws StudentWrongValuesException {
		int negativeAge = -20;
		student.setAge(negativeAge);
	}
	
	@Test(timeout = 1000)
	public void testGetGradesMean2DecimalsPerformance() throws StudentWrongValuesException {

		//don't init the data here - you affect the timeout
		student.setGrades(PERF_GRADES);
		
		student.getGradesMean2Decimals();
		
/*		float expectedAverage = Student.GRADE_MAX;
		
		float obtainedAverage = student.getGradesMean2Decimals();
		
		assertEquals(expectedAverage, obtainedAverage, 0);*/
	}

}
