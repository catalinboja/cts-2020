package ro.ase.csie.cts.g1084.seminar5.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1084.seminar5.Student;

public class TestStudent {
	
	//test fixture
	Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setup global");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("teardown global");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		//1. definire date de test
		ArrayList<Integer> note = new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(9);
		
		student = new Student("Gigel", 20, note);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("teardown");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetMedieValoriCorecte() {
		//1. definire date de test
		ArrayList<Integer> note = new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(9);
		
		Student student = new Student("Gigel", 20, note);
		
		//2. definire rezultat asteptat
		float valoareAsteptata = 9.33f;
		
		//3. obtinem rezultatul
		float medieCalculata = student.getMedie();
		
		//4. verificare rezultat
		assertEquals("Medie incorecta pentru valori corecte",
				valoareAsteptata, medieCalculata,0.005);
	}
	
	@Test
	public void testGetMedieListaFaraNote() {
	
		//1.
		ArrayList<Integer> note = new ArrayList<>();
		student.setNote(note);
		
		//2. definire rezultat asteptat
		float valoareAsteptata = 0;
		
		//3.
		float medie = student.getMedie();
		
		//4.
		assertEquals("Studentul nu are note",
				valoareAsteptata, medie, 0);
		
		
	}

}
