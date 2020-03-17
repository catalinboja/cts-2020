package ro.ase.csie.cts.g1085.seminar5;

import java.util.ArrayList;

public class Student {
	String nume;
	int varsta;
	ArrayList<Integer> note;

	public Student(String nume, int varsta, ArrayList<Integer> note) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.note = note;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public ArrayList<Integer> getNote() {
		return note;
	}

	public void setNote(ArrayList<Integer> note) {
		this.note = note;
	}

	public float getMedieNote() {
		if (this.note.size() > 0) {
			float suma = 0;
			for (int nota : this.note) {
				suma += nota;
			}
			return suma / this.note.size();
		} else
			return 0;
	}

}
