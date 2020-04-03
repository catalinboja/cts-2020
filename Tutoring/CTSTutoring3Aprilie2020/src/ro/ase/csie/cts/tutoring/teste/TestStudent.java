package ro.ase.csie.cts.tutoring.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.tutoring.InterfataValidariStudent;
import ro.ase.csie.cts.tutoring.Student;
import ro.ase.csie.cts.tutoring.exceptii.ExceptieStudentValoriInvalide;
import ro.ase.csie.cts.tutoring.teste.categorii.TesteImportante;
import ro.ase.csie.cts.tutoring.teste.categorii.TestePerformanta;

public class TestStudent {
	//test fixture
		Student student;
		
public static final String NUME;
	public static final int VARSTA = 
			InterfataValidariStudent.VARSTA_MIN;
	public static final ArrayList<Integer> NOTE = 
			new ArrayList<>();
	public static final int NR_NOTE = 3;
	
	
	//pentru teste de performanta
	public static final int NR_MAXIM_NOTE = 100000;
	public static final ArrayList<Integer> NOTE_TEST_PERF = 
			new ArrayList<>();

	
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
		
		for(int i = 0 ;i < NR_MAXIM_NOTE; i++)
			NOTE_TEST_PERF.add(InterfataValidariStudent.NOTA_MAX);
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
		
	//Range
	// verifica metoda pentru valori de intrare din spatiul posibil
	//- varsta are valori in [Integer.MIN_VALUE, Integer.MAX_VALUE]
	//test pentru varsta = 0
	
	//Range pt 0
	//Error Condition
	@Test(expected = ExceptieStudentValoriInvalide.class)
	public void testSetVarstaRangeZero() throws ExceptieStudentValoriInvalide {
		int varstaZero = 0;
		student.setVarsta(varstaZero);
	}
	
	//Range pt o valoare intre VARSTA_MIN si VARSTA_MAX
	//Right
	@Category(TesteImportante.class)
	@Test
	public void testSetVarstaRangeValoareValida() {
		int varsta = InterfataValidariStudent.VARSTA_MIN + 1;
		
		try {
			student.setVarsta(varsta);
			int varstaStudent = student.getVarsta();
			
			assertEquals("Test valoare valida", 
					varsta , varstaStudent);
			
		} catch (ExceptieStudentValoriInvalide e) {
			fail("Metoda a generat exceptie pentru valori valide");
		}	
	}
	

	//Boundary - verificam limitele valorilor valide
	//lower limit - VARSTA_MIN
	//Range pentru VARSTA_MIN
	//Right
	
	@Category(TesteImportante.class)
	@Test
	public void testSetVarstaBoundaryLimitaInferioara() throws ExceptieStudentValoriInvalide {
		int limitaInferioara = InterfataValidariStudent.VARSTA_MIN;
		
		student.setVarsta(limitaInferioara);
		int varstaStudent = student.getVarsta();
		
		assertEquals(limitaInferioara, varstaStudent);
	}
	
	//Boundary - verificam limitele valorilor valide
	//upper limit - VARSTA_MAX
	//Range pentru VARSTA_MAX
	//Right
	
	@Test
	public void testSetVarstaBoundaryLimitaSuperioara() throws ExceptieStudentValoriInvalide {
		int limitaSuperioara = 
				InterfataValidariStudent.VARSTA_MAX;
		
		student.setVarsta(limitaSuperioara);
		int varstaStudent = student.getVarsta();
		
		assertEquals(limitaSuperioara, varstaStudent);
	}
	
	
	//Reference
	
	
	//Time/Performance
	@Category({TestePerformanta.class, TesteImportante.class})
	@Test(timeout = 1000)
	public void testGetMedie2Zecimale() throws ExceptieStudentValoriInvalide {
		
		//NU generam datele de test in testul unitar
		
		//si asta influenteaza - o ignoram
		student.setNote(NOTE_TEST_PERF);
		
		float medieAsteptata = InterfataValidariStudent.NOTA_MAX;
		
		float medieCalculata = student.getMedie2Zecimale();
		
		assertEquals(medieAsteptata, medieCalculata,0);	
	}

}
