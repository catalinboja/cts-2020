package ro.ase.csie.cts.g1084.seminar7.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1084.seminar7.InterfataValidariStudent;
import ro.ase.csie.cts.g1084.seminar7.Student;
import ro.ase.csie.cts.g1084.seminar7.exceptii.ExceptieStudentValoriInvalide;

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

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//Right sau Conformance
	@Test
	public void testGetMedie2ZecimaleRight() throws ExceptieStudentValoriInvalide {
		
		ArrayList<Integer> note = 
				new ArrayList<>(Arrays.asList(9,9,10));
		
		try {
			student.setNote(note);
		} catch (ExceptieStudentValoriInvalide e) {
			fail("Exceptie generata de setNote");
		}
		
		float medieAsteptata = 9.33f;
		float medieCalculata = student.getMedie2Zecimale();
		
		assertEquals(medieAsteptata, medieCalculata, 0);
	}
	
	//Existence
	// - resursa nu exista
	// - ref note este null
	//Error Condition
	
	@Test(expected = ExceptieStudentValoriInvalide.class)
	public void testGetMedie2ZecimaleExistenceNoteNull() throws ExceptieStudentValoriInvalide {
		ArrayList<Integer> noteNull = null;
		
		try {
			student.setNote(noteNull);
		} catch (ExceptieStudentValoriInvalide e) {
			fail("Exceptia a fost generat de setNote");
		}
		
		student.getMedie2Zecimale();	
	}
	
	//Ordering
	@Test
	public void testGetMedie2ZecimaleNoteSortateCrescator() throws ExceptieStudentValoriInvalide {
		ArrayList<Integer> note = 
				new ArrayList<>(Arrays.asList(5,6,7,8,9));
		student.setNote(note);
		
		float medieAsteptata = 7;
		float medieCalculata = student.getMedie2Zecimale();
		
		assertEquals(medieAsteptata, medieCalculata, 0);	
	}
	
	//Cardinalitate
	// - cardinalitate 0
	@Test
	public void testGetMedie2ZecimaleNoteZeroNote() throws ExceptieStudentValoriInvalide {
		ArrayList<Integer> note = new ArrayList<>();
		student.setNote(note);
		
		float medieAsteptata = 0;
		float medieCalculata = student.getMedie2Zecimale();
		
		assertEquals(medieAsteptata, medieCalculata, 0);
		
	}
	
	//Cardinalitate
	// - cardinalitate 1
	@Test
	public void testGetMedie2ZecimaleNoteONota() throws ExceptieStudentValoriInvalide {
		
		int notaUnica = InterfataValidariStudent.NOTA_MIN;
		ArrayList<Integer> note = new ArrayList<>();
		note.add(notaUnica);
		
		student.setNote(note);
		
		float medieAsteptata = notaUnica;
		float medieCalculata = student.getMedie2Zecimale();
		
		assertEquals(medieAsteptata, medieCalculata, 0);
		
	}

}
