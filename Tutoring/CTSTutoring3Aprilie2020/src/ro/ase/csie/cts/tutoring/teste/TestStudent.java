package ro.ase.csie.cts.tutoring.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.tutoring.InterfataValidariStudent;
import ro.ase.csie.cts.tutoring.Student;

public class TestStudent {
	//test fixture
		Student student;
		
	public static final String NUME;
		public static final int VARSTA = 
				InterfataValidariStudent.VARSTA_MIN;
		public static final ArrayList<Integer> NOTE = 
				new ArrayList<>();
		public static final int NR_NOTE = 3;
		
		static {
			String numeInitial = "";
			for(int i = 0; i < InterfataValidariStudent.DIM_NUME_MIN; i++)
				numeInitial+= "A";
			NUME = numeInitial;
		}

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			
			for(int i = 0;i < NR_NOTE; i++)
				NOTE.add(InterfataValidariStudent.NOTA_MAX);
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}

		@Before
		public void setUp() throws Exception {
			student  = new Student(NUME, VARSTA, NOTE);
		}

		@After
		public void tearDown() throws Exception {
		}

}
