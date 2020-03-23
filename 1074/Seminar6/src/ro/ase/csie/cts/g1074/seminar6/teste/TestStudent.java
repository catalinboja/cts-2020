package ro.ase.csie.cts.g1074.seminar6.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1074.seminar6.Student;
import ro.ase.csie.cts.g1074.seminar6.exceptii.ExceptieValoriStudent;

public class TestStudent {

	// test fixture
	public static final String NUME = "Gigel";
	public static final int VARSTA = 18;
	public static ArrayList<Integer> noteInitiale;

	public Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		noteInitiale = new ArrayList<>();
		noteInitiale.add(9);
		noteInitiale.add(10);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(VARSTA, NUME, noteInitiale);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	// Conformance din CORRECT ~ Right din Right-BICEP

	@Test
	public void testConstructorRight() {
		String nume = "Gigel";
		int varsta = 21;
		ArrayList<Integer> note = new ArrayList<>();
		note.add(9);
		note.add(10);

		Student student = new Student(varsta, nume, note);

		assertEquals(nume, student.getNume());
		assertEquals(varsta, student.getVarsta());
		// simplificam testarea pentru note
		assertEquals(note.size(), student.getNrNote());
	}

	@Test
	public void testConstructorRightCreareObiect() {
		try {
			Student student = new Student(VARSTA, NUME, noteInitiale);
			assertNotNull(student);
		} catch (Exception e) {
			fail("Constructorul a generat exceptie pentru valori ok");
		}
	}
	
	@Test
	public void testSetNumeRight() {
		String numeNou = "Ionut";
		//String numeTest = NUME + " Popescu";
		
		student.setNume(numeNou);
		
		assertEquals("Test modificare nume prin setNume",
				numeNou, student.getNume());
	}
	
	@Test
	public void testGetMedieRight() {
		ArrayList<Integer> note = 
				new ArrayList<>();
		note.add(9);
		note.add(9);
		note.add(10);
		student.setNote(note);
		
		float medieAsteptata = 9.33f;
		
		float medieCalculata = 0;
		
		try {
			
			medieCalculata = student.getMedie2Zecimale();
			assertEquals(medieAsteptata, medieCalculata, 0);
			
		} catch (ExceptieValoriStudent e) {
			fail("Nu trebuia sa genereze exceptie !");
		}
	}
	
	//teste pentru Exceptii
	//Error conditions din BICEP 
	
	@Test(expected = ExceptieValoriStudent.class)
	public void testSetVarstaExceptie() throws ExceptieValoriStudent{
		
		int varstaGresita = 5;	
		student.setVarsta(varstaGresita);
		
	}

}
