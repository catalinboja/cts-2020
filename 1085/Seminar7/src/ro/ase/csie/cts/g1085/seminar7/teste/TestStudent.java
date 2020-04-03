package ro.ase.csie.cts.g1085.seminar7.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1085.seminar7.InterfataReguliValidareStudent;
import ro.ase.csie.cts.g1085.seminar7.Student;
import ro.ase.csie.cts.g1085.seminar7.exceptii.ExceptieStudentValoriInvalide;

public class TestStudent {
	
	//test fixture
	Student student;
	
	public static final String NUME;
	public static final int VARSTA = 
			InterfataReguliValidareStudent.VARSTA_MIN;
	public static final ArrayList<Integer> NOTE;
	public static final int NR_NOTE_INITIALE = 3;
	
	static {
		
		String numeGenerat = "";
		for(int i = 0; 
				i < InterfataReguliValidareStudent.NUME_MIN; i++)
			numeGenerat += "A";
		NUME = numeGenerat;
		
		NOTE = new ArrayList<>();
		for(int i = 0; i < NR_NOTE_INITIALE; i++)
			NOTE.add(InterfataReguliValidareStudent.NOTA_MIN);
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	
	//Right
	@Test
	public void testGetMedie2ZecimaleRight() throws ExceptieStudentValoriInvalide {
		ArrayList<Integer> note = 
				new ArrayList<>(Arrays.asList(9,9,10));
		
		try {
			student.setNote(note);
		} catch (ExceptieStudentValoriInvalide e) {
			fail("Am primit exceptie de la setNote");
		}
		
		float medieAsteptata = 9.33f;
		float medieCalculata = student.getMedie2Zecimale();
		
		assertEquals(medieAsteptata, medieCalculata, 0);
	}
	
	//Existence
	//test pentru note == null (nu avem colectia note)
	//Error Condition
	
	@Test(expected = ExceptieStudentValoriInvalide.class)
	public void testGetMedie2ZecimaleNoteNull() throws ExceptieStudentValoriInvalide {
		ArrayList<Integer> note = null;
		
		try {
			student.setNote(null);
		} catch (ExceptieStudentValoriInvalide e) {
			fail("Am primit exceptia de la setNote");
		}
		
		student.getMedie2Zecimale();	
	}
	
	//Ordering
	// - test cu notele sortate crescator
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
	// - a nu se confunda cu test Existence pentru null
	
	@Test(expected = ExceptieStudentValoriInvalide.class)
	public void testGetMedie2ZecimaleZeroNote() throws ExceptieStudentValoriInvalide {
		ArrayList<Integer> note = 
				new ArrayList<>();
		
		try {
			student.setNote(note);
		} catch (ExceptieStudentValoriInvalide e) {
			fail("Am primit exceptia de la setNote");
		}
		
		student.getMedie2Zecimale();
	}
	
	//Cardinalitate
	// - cardinalitate 1
	@Test
	public void testGetMedie2ZecimaleONota() throws ExceptieStudentValoriInvalide {
		int nota = InterfataReguliValidareStudent.NOTA_MIN;
		ArrayList<Integer> note = 
				new ArrayList<>(Arrays.asList(nota));
		
		student.setNote(note);
		
		float medieCalculata = student.getMedie2Zecimale();
		
		assertEquals(nota, medieCalculata, 0);
		
	}
}
