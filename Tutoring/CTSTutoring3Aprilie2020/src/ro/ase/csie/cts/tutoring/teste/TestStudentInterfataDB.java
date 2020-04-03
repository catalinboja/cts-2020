package ro.ase.csie.cts.tutoring.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import ro.ase.csie.cts.tutoring.InterfataDB;
import ro.ase.csie.cts.tutoring.InterfataValidariStudent;
import ro.ase.csie.cts.tutoring.Student;
import ro.ase.csie.cts.tutoring.teste.stub.StubInterfataDB;

public class TestStudentInterfataDB {

	Student student;
	StubInterfataDB stubInterfataDB;
	
	@Before
	public void setUp() throws Exception {
		ArrayList<Integer> note = 
				new ArrayList<>(Arrays.asList(9,9,9));
		student = new Student("Anonim", 
				InterfataValidariStudent.VARSTA_MIN, note);
		
		stubInterfataDB = new StubInterfataDB();
	}

	//Right - cand inserarea are loc
	@Test
	public void testInsertStudentBazaDeDate() throws Exception {
		ArrayList<Integer> note = 
				new ArrayList<>(Arrays.asList(9,9,9));
		student = new Student("Gigel", 
				InterfataValidariStudent.VARSTA_MIN, note);
		
		student.setDB(new InterfataDB() {
			
			
			//metoda stub
			@Override
			public boolean insertStud(Student student) {
				return true;
			}
		});
		
		int rezultatObtinut = student.insertStudentBazaDeDate();
		int rezultatAsteptat = 1;
		
		assertEquals(rezultatAsteptat, rezultatObtinut);
		
	}
	
	
	//Right - cand inserarea NU are loc
		@Test
		public void testInsertStudentBazaDeDateRaspunsZero() throws Exception {
			
			student = new Student("Gigel", 
					InterfataValidariStudent.VARSTA_MIN, null);
			
			student.setDB(new InterfataDB() {
				
				
				//metoda stub
				@Override
				public boolean insertStud(Student student) {
					return false;
				}
			});
			
			int rezultatObtinut = student.insertStudentBazaDeDate();
			int rezultatAsteptat = 0;
			
			assertEquals(rezultatAsteptat, rezultatObtinut);
			
		}
		
		
		//Right - cand inserarea are loc
		//cu metoda stub din StubInterfataDB
		@Test
		public void testInsertStudentBazaDeDateCuStub() throws Exception {
			ArrayList<Integer> note = 
					new ArrayList<>(Arrays.asList(9,9,9));
			student = new Student("Gigel", 
					InterfataValidariStudent.VARSTA_MIN, note);
			
			student.setDB(stubInterfataDB);
			stubInterfataDB.setRaspunsAsteptatInsertStud(true);
			
			int rezultatObtinut = student.insertStudentBazaDeDate();
			int rezultatAsteptat = 1;
			
			assertEquals(rezultatAsteptat, rezultatObtinut);
			
		}

}
