package ro.ase.csie.cts.g1085.seminar14.state;

public interface InterfataActiuniCaracter {
	
	//daca aveti nevoie de obiectul in sine
	//varianta 1
	//CaracterJoc caracter;		//trebuie clasa abstracta
	
	public void seMisca();
	
	//varianta 2 - cereti referinta prin metode
	public void ataca(String inamic, int puncteAtac, CaracterJoc caracter);
	
}
