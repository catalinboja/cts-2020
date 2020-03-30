package ro.ase.csie.cts.g1074.seminar7;

import java.util.ArrayList;

import ro.ase.csie.cts.g1074.seminar7.exceptii.ExceptieValoriStudent;

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
		this.note = new ArrayList<Integer>();
		for(int nota : note) {
			this.note.add(nota);
		}
		//this.note = note;
	}
	
	public float getMedie2Zecimale() throws ExceptieValoriStudent{
		
		if(this.note == null)
			throw new ExceptieValoriStudent();
		
		float suma = 0;
		for(int nota : this.note)
			suma += nota;
		
		float medie = suma/this.note.size();
		
		return ((int)(medie*100))/100.0f;
	}
}
