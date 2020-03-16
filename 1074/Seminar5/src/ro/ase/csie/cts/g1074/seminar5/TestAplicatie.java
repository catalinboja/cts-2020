package ro.ase.csie.cts.g1074.seminar5;

import java.util.ArrayList;

public class TestAplicatie {

	public static void main(String[] args) {
		
		ArrayList<Integer> note = new ArrayList<>();
		note.add(10);
		note.add(10);
		note.add(9);
		Student s1 = new Student(21, "Gigel", note);
		
/*		float medie  = s1.getMedieNote();
		if(medie == 9.66)
			System.out.println("Functia este ok");
		else
			System.out.println("Avem un bug");*/
		
		System.out.println("Media studentului este " + s1.getMedieNote());
		
	}

}
