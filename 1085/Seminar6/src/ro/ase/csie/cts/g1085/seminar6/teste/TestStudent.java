package ro.ase.csie.cts.g1085.seminar6.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1085.seminar6.Student;
import ro.ase.csie.cts.g1085.seminar6.exceptii.ExceptieStudentValoriInvalide;

public class TestStudent {

	// test fixture
	public static final String NUME = "Gigel";
	public static final int VARSTA = 20;
	public static final ArrayList<Integer> NOTE = new ArrayList<>();

	public Student student;

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

	// Right din Right-BICEP
	// Conformance din CORRECT

	@Test
	public void testConstructorRightInitializareObiect() {
		String nume = "Gigel";
		int varsta = 20;
		ArrayList<Integer> note = new ArrayList<>();
		note.add(9);
		note.add(10);

		Student student = new Student(nume, varsta, note);

		assertEquals("Numele nu este initializat corect", nume, student.getNume());
		assertEquals("Varsta nu este initializata corect", varsta, student.getVarsta());
		for (int i = 0; i < note.size(); i++) {
			assertEquals("Nota nu este initializata corect", (int) note.get(i), student.getNota(i));
		}
	}

	@Test
	public void testConstructorRightCreareObiect() {	
		try {
			Student student = 
				new Student(NUME, VARSTA, NOTE);
			assertNotNull(student);
		}
		catch(Exception e) {
			fail("NU trebuia sa primim exceptie pentru valori OK");
		}
	}
	
	@Test
	public void testSetVarstaRight() {
		int varstaModificata = 30;
		//int varstaModificata = VARSTA++;
		//int varstaModificata = student.getVarsta() + 1;
		
		student.setVarsta(varstaModificata);
		
		assertEquals(varstaModificata, student.getVarsta());
	}
	
	@Test
	public void testGetMedie2Zecimale() {
		ArrayList<Integer> note = 
				new ArrayList<>();
		note.add(9);
		note.add(9);
		note.add(10);
		student.setNote(note);
		
		float medieAsteptata = 9.33f;
		
		float medieCalculata = student.getMedie2Zecimale();
		
		assertEquals("Media nu este calculata corect",
				medieAsteptata, medieCalculata, 0);
	}
	
	//Error condition - Right-BICEP
	//Conformance pentru valori invalide
	
	@Test(expected = ExceptieStudentValoriInvalide.class)
	public void testConstructorEroare() {
		String numeInvalid = "I";
		int varstaInvalida = -5;
		ArrayList<Integer> note = null;
		
		Student student = new Student(numeInvalid, 
				varstaInvalida, note);
	}

}
