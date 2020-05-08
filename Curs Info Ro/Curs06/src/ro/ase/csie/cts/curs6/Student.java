package ro.ase.csie.cts.curs6;

import java.util.ArrayList;

/*
 * 
 * nume
 * 	- minim 3 caractere (doar litere din alfabet si spatiu)
 * 	- maxim 255 caractere
 * varsta
 *  - valori in intervalul [14, 90]
 * note
 * 	- valori in intervalul [1, 10] 
 * 
 * - metodele genereaza exceptii de tipul 
 */

public class Student {

	String nume;
	int varsta;
	ArrayList<Integer> note;
	
	/*
	 * Conformance: 
	 * 	- test cu valori corecte pentru care 
	 * 	astept un obiect initializat cu acele valori
	 * 	- test cu valori invalide <= exceptii custom - specifice
	 * 
	 * 
	 * Reference
	 * - test in care transmitem un ArrayList de note
	 * 	modificam o nota in ArrayList-ul extern 
	 * 		<= se modifica si notele studentului ?
	 * 
	 * 
	 */
	
	public Student(String nume, int varsta, 
			ArrayList<Integer> note) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.note = note;
	}
	
	public String getNume() {
		return nume;
	}
	
	/*
	 * Conformance
	 * - test cu valori corecte <= verific 
	 * 		daca numele este modificat dupa apelul lui setNume
	 * - test cu valori invalide <= exceptie particulara
	 * 
	 * 
	 */
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	
	/*
	 * Conformance:
	 * - testam metoda cu valori in intervalul [14, 90]
	 * 
	 * 
	 * Range:
	 * - teste cu valori din intervalele identificate in analiza
	 * 
	 * 
	 * 
	 */
	
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void setNote(ArrayList<Integer> note) {
		this.note = note;
	}
	
	
	/*
	 * 
	 * Conformance
	 * - test cu valori ok <= media sa fie calculata corect
	 * - de ex. pentru 9,9,10 media asteptata este 9.33
	 * 
	 * Existence
	 * - test cu note == null <= exceptie
	 * 
	 * Cardinalitate
	 * - test cu 0 note <= exceptie
	 * - test cu 1 nota <= media este nota respectiva
	 * - test cu >= 2 note <= media este calculata corect
	 * 
	 * 
	 */
	public float getMedie2Zecimale() {
		return 0;
	}
	
	/*
	 * 
	 * Conformance
	 * - test cu un sir de note random
	 * - de ex {9,7,8,10,9} <= nota minima 7
	 * 
	 * Ordering
	 * - test in care notele sunt sortate crescator/descresctator
	 * 	<= nota minima determinata corect
	 * - de ex {2,3,4,5,6,7} <= nota minima 2
	 * - de ex {7,6,5,4,3} <= nota minima 3
	 * 
	 * 
	 */
	public int getNotaMinima() {
		return 0;
	}
	
}
