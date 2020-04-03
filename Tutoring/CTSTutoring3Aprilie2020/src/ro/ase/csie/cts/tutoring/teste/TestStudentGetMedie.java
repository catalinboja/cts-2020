package ro.ase.csie.cts.tutoring.teste;

import static org.junit.Assert.*;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.tutoring.InterfataValidariStudent;
import ro.ase.csie.cts.tutoring.Student;
import ro.ase.csie.cts.tutoring.exceptii.ExceptieStudentValoriInvalide;
import ro.ase.csie.cts.tutoring.teste.categorii.TesteImportante;

public class TestStudentGetMedie {

	
	//test fixture
	Student student;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ArrayList<Integer> note = 
				new ArrayList<>(Arrays.asList(9,9,9));
		student = new Student("Anonim", 
				InterfataValidariStudent.VARSTA_MIN, note);
	}
	
	
	//Cross-Check
	@Category(TesteImportante.class)
	@Test
	public void testGetMedie2ZecimaleCross() throws ExceptieStudentValoriInvalide {
		ArrayList<Integer> note = 
				new ArrayList<>(Arrays.asList(9,9,10));
		student.setNote(note);
		
		//obtin rezultat prin alta metoda
		float suma = 0;
		for(int nota : note)
			suma += nota;
		float medie = suma/note.size();
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.DOWN);
		
		String medieFormatata = df.format(medie);
		
		float medieAsteptata = Float.parseFloat(medieFormatata);
		
		float medieCalculata = student.getMedie2Zecimale();
		
		assertEquals(medieAsteptata, medieCalculata, 0);
		
	}
	
	//Inverse Relation
	@Test
	public void testGetMedie2ZecimaleInverse() throws ExceptieStudentValoriInvalide {
		ArrayList<Integer> note = 
				new ArrayList<>(Arrays.asList(9,9,10));
		student.setNote(note);
		
		//se bazeaza pe faptul ca relatia inversa dintre medie 
		//	si datele de intrare este medie*nrElemente ~= sumaElemente
		float suma = 0;
		for(int nota : note)
			suma += nota;
		
		float medieCalculata = student.getMedie2Zecimale();
		
		float valoareRelInversa = medieCalculata * note.size();
		
		assertEquals(suma, valoareRelInversa, 0.05);
	}
	
}
