package ro.ase.csie.cts.g1084.seminar6.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1084.seminar6.Student;
import ro.ase.csie.cts.g1084.seminar6.exceptii.ExceptieStudentVarstaInvalida;

public class TestStudent {
	
	//test fixture
	public static final String NUME = "Gigel";
	public static final int VARSTA = 20;
	public static final ArrayList<Integer> NOTE = 
			new ArrayList<>();
	
	Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		NOTE.add(9);
		NOTE.add(10);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(NUME, VARSTA, NOTE);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//Right - Right-BICEP
	//Conformance - CORRECT
	
	@Test
	public void testConstructorRightInitializareAtribute() {
		String nume = "Gigel";
		int varsta = 20;
		ArrayList<Integer> note = new ArrayList<>();
		note.add(9);
		note.add(10);
		
		Student student = new Student(nume, varsta, note);
		
		assertEquals("Numele nu este initializat corect", 
				nume, student.getNume());
		assertEquals("Varsta nu este initializata corect",
				varsta, student.getVarsta());
		for(int i = 0; i < note.size(); i++) {
			assertEquals("Nota nu este initializata corect",
					(int)note.get(i), student.getNota(i));
		}	
	}
	
	@Test
	public void testConstructorRightCreareObiect() {
		try {
			Student student = new Student(NUME, VARSTA, NOTE);		
			assertNotNull(student);
		}
		catch(Exception e) {
			fail("Constructorul a generat exceptie pentru valori OK");
		}			
	}
	
	@Test
	public void testSetVarstaRight() {
		//int varstaDiferita = 25;
		int varstaDiferita = VARSTA + 1;
		
		student.setVarsta(varstaDiferita);
		
		assertEquals(varstaDiferita, student.getVarsta());
	}
	
	@Test
	public void testGetMedie2ZecimaleRight() {
		ArrayList<Integer> note = 
				new ArrayList<>();
		note.add(9);
		note.add(9);
		note.add(10);
		
		student.setNote(note);
		
		float medieAsteptata = 9.33f;
		
		float medieCalculata = student.getMedie2Zecimale();
		
		assertEquals(medieAsteptata, medieCalculata, 0);
	}
	
	//Error condition
	@Test(expected = ExceptieStudentVarstaInvalida.class)
	public void testSetVarstaConditiiEroare() {
		
		int varstaInvalida = -23;
		
		student.setVarsta(varstaInvalida);
		
/*		try {
			student.setVarsta(varstaInvalida);
			fail("Nu am primit exceptie !");
		}
		catch(ExceptieStudentVarstaInvalida e) {
			assertTrue(true);
		}*/
		
		
	}

}
