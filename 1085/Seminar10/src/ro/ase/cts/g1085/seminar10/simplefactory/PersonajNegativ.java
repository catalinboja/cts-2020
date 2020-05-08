package ro.ase.cts.g1085.seminar10.simplefactory;

public class PersonajNegativ extends PersonajAbstract{

	@Override
	public void faceCeva() {
		System.out.println("Fura diamante");
	}
	
	public PersonajNegativ(int puncteViata) {
		this.puncteViata = puncteViata;
	}

}
