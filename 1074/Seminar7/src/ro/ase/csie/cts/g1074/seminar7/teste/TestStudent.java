package ro.ase.csie.cts.g1074.seminar7.teste;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1074.seminar7.Student;
import ro.ase.csie.cts.g1074.seminar7.exceptii.ExceptieValoriStudent;

public class TestStudent {
	
	public static final String NUME = "Anonim";
	public static final int VARSTA = 20;
	public static final ArrayList<Integer> NOTE = new 
			ArrayList<>();
	
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
		student = new Student(VARSTA, NUME, NOTE);
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
	public void testGetMedie2ZecimaleRight() {
		ArrayList<Integer> note = new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(9);
		
		student.setNote(note);
		
		float medieAsteptata = 9.33f;
		float medieCalculata = 0;
		try {
			medieCalculata = student.getMedie2Zecimale();
		} catch (ExceptieValoriStudent e) {
			fail("NU trebuia sa primesc exceptie");
		}
		
		assertEquals(medieAsteptata, medieCalculata, 0);
	}
	
	//Error Condition
	//Existence - cazul cand notele nu exista
	
	@Test(expected = ExceptieValoriStudent.class)
	public void testGetMedie2ZecimaleError() throws ExceptieValoriStudent {
		student.setNote(null);

		student.getMedie2Zecimale();
		
//pt JUnit 3
/*		try {
		student.getMedie2Zecimale();
		fail("Nu am primit exceptie");
		}
		catch(ExceptieValoriStudent e) {
			assertTrue(true);
		}
		catch(Exception e) {
			fail("Am primit alt tip de exceptie");
		}*/
	}
	
	//Ordering - notele sunt sortate crescator
	//TO DO: - Ordering pentru sir descrescator
	//TO DO: - Ordering pentru sir care nu este sortat
	
	@Test
	public void testGetMedie2ZecimaleOrderingSortateCrescator() {
		ArrayList<Integer> note = new ArrayList<>();
		note.add(5);
		note.add(6);
		note.add(7);
		note.add(8);
		
		student.setNote(note);
		
		float medieAsteptata = 6.50f;
		
		float medieCalculata = 0;
		try {
			medieCalculata = student.getMedie2Zecimale();
		} catch (ExceptieValoriStudent e) {
			fail("Nu trebuia sa genereze exceptie");
		}
		
		assertEquals(medieAsteptata, medieCalculata, 0);
	}
	
	//Boundary - testam limitele intervalului de valori admise
	@Test
	public void testSetVarstaBoundaryLimitaInferioara() throws ExceptieValoriStudent {
		
		student.setVarsta(Student.VARSTA_MIN);
		
		int varstaAsteptata = Student.VARSTA_MIN;
		
		assertEquals(varstaAsteptata, student.getVarsta());
	}
	
	@Test
	public void testSetVarstaBoundaryLimitaSuperioara() throws ExceptieValoriStudent {
		
		student.setVarsta(Student.VARSTA_MAX);
		
		int varstaAsteptata = Student.VARSTA_MAX;
		
		assertEquals(varstaAsteptata, student.getVarsta());
	}
	
	@Test
	public void testSetNumeBoundaryLimitaInferioara() {
		String numeTest = "Io";
		
		student.setNume(numeTest);
		
		assertEquals(numeTest, student.getNume());
	}
	
	//Cardinality
	// Cardinalitate 0 - colectia are 0 elemente
	// Cardinalitate 1 - colectia are 1 element
	// Cardinalitate 2 - colectia are 2 elemente
	// ...
	@Test
	public void testGetMedie2ZecimaleCardinalitateZero() throws ExceptieValoriStudent {
		ArrayList<Integer> note = new ArrayList<>();
		student.setNote(note);
		
		float medieAsteptata = 0;
		float medieCalculata = student.getMedie2Zecimale();
		
		assertEquals(medieAsteptata, medieCalculata, 0);
		
	}
	
	@Test
	public void testGetMedie2ZecimaleCardinalitateUnu() throws ExceptieValoriStudent {
		ArrayList<Integer> note = new ArrayList<>();
		int nota = 10;
		note.add(nota);
		student.setNote(note);
		
		float medieCalculata = student.getMedie2Zecimale();
		
		assertEquals(nota, medieCalculata, 0);	
	}
	
	//Reference
	//- testam cum este gestionata referinta externa shallow-copy vs deep-copy
	//- pentru note colectia primita trebuie copiata la nivel de continut
	
	@Test
	public void testSetNoteReference() {
		ArrayList<Integer> note =  new ArrayList<>();
		
		int nota1 = 9;
		int nota2 = 10;
		
		note.add(nota1);
		note.add(nota2);
		
		student.setNote(note);
		ArrayList<Integer> noteStudent = new ArrayList<>();
		for(int i = 0;i < student.getNrNote(); i++)
			noteStudent.add(student.getNota(i));
			
		note.set(0, 5);
		note.set(1, 7);
		
		ArrayList<Integer> noteStudentActualizate = new ArrayList<>();
		for(int i = 0;i < student.getNrNote(); i++)
			noteStudentActualizate.add(student.getNota(i));
		
		assertArrayEquals(noteStudent.toArray(), 
				noteStudentActualizate.toArray());
		
		
	}
	
	

}
