package ro.ase.csie.cts.g1074.seminar6;

import java.util.ArrayList;

import ro.ase.csie.cts.g1074.seminar6.exceptii.ExceptieValoriStudent;

/*
 * varsta admisa este cuprinsa in intervalul [14, 90]
 * numele trebuie sa contina minim 2 caractere si sa NU contina cifre
 * notele sunt valori intregi cuprinse in intervalul [1, 10]
 * media trebuie sa fie trunchiata la 2 zecimale
 * 
 * pentru valori invalide metodele genereaza o exceptie 
 * 	de tip ExceptieValoriStudent
 */

public class Student {
	
	public static final int VARSTA_MIN = 14;
	public static final int VARSTA_MAX = 90;
	
	int varsta;
	String nume;
	ArrayList<Integer> note;
	
	public Student(int varsta, String nume, ArrayList<Integer> note) {
		super();
		this.varsta = varsta;
		this.nume = nume;
		this.note = note;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) throws ExceptieValoriStudent {
		if(varsta < VARSTA_MIN || varsta > VARSTA_MAX)
			throw new ExceptieValoriStudent();
		this.varsta = varsta;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getNota(int index) {
		return note.get(index);
	}
	
	public int getNrNote() {
		return note.size();
	}

	public void setNote(ArrayList<Integer> note) {
		this.note = note;
	}
	
	public float getMedie2Zecimale() throws ExceptieValoriStudent{
		return 0;
	}
}
