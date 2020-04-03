package ro.ase.csie.cts.tutoring.teste.stub;

import ro.ase.csie.cts.tutoring.InterfataDB;
import ro.ase.csie.cts.tutoring.Student;

public class StubInterfataDB implements InterfataDB{

	private boolean raspunsInsertStud = false;
	
	public void setRaspunsAsteptatInsertStud(boolean raspuns) {
		this.raspunsInsertStud = raspuns;
	}
	
	@Override
	public boolean insertStud(Student student) {
		return raspunsInsertStud;
	}

}
