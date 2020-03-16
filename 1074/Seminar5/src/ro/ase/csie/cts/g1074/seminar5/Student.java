package ro.ase.csie.cts.g1074.seminar5;

import java.util.ArrayList;

public class Student {
	int varsta = 0;
	String nume = "";
	ArrayList<Integer> note = null;

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public ArrayList<Integer> getNote() {
		return note;
	}

	public void setNote(ArrayList<Integer> note) {
		this.note = note;
	}

	public Student(int varsta, String nume, ArrayList<Integer> note) {
		super();
		this.varsta = varsta;
		this.nume = nume;
		this.note = note;
	}

	public float getMedieNote() {
		if (this.note.size() > 0) {
			float suma = 0;
			for (int nota : this.note)
				suma += nota;

			return suma / this.note.size();
		} else
			return 0;
	}

}
