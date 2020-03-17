package ro.ase.csie.cts.g1085.seminar5.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1085.seminar5.Student;

public class TestStudent {
	
	//test fixture
	Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Apel setup global");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Apel teardown global");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Apel setup");
		
		//1. Definire date de intrare
		ArrayList<Integer> note = new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(9);
		
		student = new Student("Gigel",21,note);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Apel teardown");
	}
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetMedieNoteCuValoriCorecte() {
		//1. Definire date de intrare
		ArrayList<Integer> note = new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(9);
		
		Student student = new Student("Gigel",21,note);
		
		//2. Definire rezultat asteptat
		float medieAsteptata = 9.33f;
		
		//3. Obtinem rezultatul de la functia testata
		float medieCalculata = student.getMedieNote();
		
		//4. verificare rezultat
		assertEquals("Verifica algoritmul. Nu este ok", 
				(float)medieAsteptata, (float)medieCalculata, 0.005);
	}
	
	@Test
	public void testGetMedieNoteFaraNote() {
		
		//1. pregatire date de test
		ArrayList<Integer> note = new ArrayList<>();
		student.setNote(note);
		
		//2. Definire rezultat asteptat
		float medieAsteptata = 0;
		
		//3. Calculam media
		float medieCalculata = student.getMedieNote();
		
		//4. verificam
		assertEquals("Test medie fara note", 
				medieAsteptata, medieCalculata, 0);
		
	}

}
