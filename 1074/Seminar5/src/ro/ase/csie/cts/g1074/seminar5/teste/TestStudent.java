package ro.ase.csie.cts.g1074.seminar5.teste;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1074.seminar5.Student;

public class TestStudent {
	
	//test fixture
	private Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Apel setup - global");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Apel teardown - global");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Apel setup");
		student = new Student(0,"",null);
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
	public void testGetMedieValoriNormale() {
		//1 pregatire test - definire date de test
		ArrayList<Integer> note = new ArrayList<>();
		note.add(10);
		note.add(9);
		Student student = new Student(21,"Gigel",note);
		
		//2 definire rezultat asteptat
		float medieAsteptata = 9.5f;
		
		//3 testare metoda si obtinere rezultat
		float medieCalculata = student.getMedieNote();
		
		//4 verificare rezultate
		assertEquals("Media nu este calculata corect",
				medieAsteptata, medieCalculata, 0);
	}
	
	@Test
	public void testGetMedieLipsaNote() {
		//1 pregatire
		ArrayList<Integer> note = new ArrayList<>();
		student.setNote(note);
		
		//2 
		float medieAsteptata = 0;
		
		//3
		float medieCalculata = student.getMedieNote();
		
		assertEquals("Media calculata pentru 0 note",
				medieAsteptata, medieCalculata,0);
		
	}
	
}
