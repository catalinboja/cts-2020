package ro.ase.cts.g1085.seminar10.simplefactory;

public class PersonajPozitiv extends PersonajAbstract{

	@Override
	public void faceCeva() {
		System.out.println("Salveaza pe cineva");
	}
	
	public PersonajPozitiv(String nume) {
		this.nume = nume;
	}

}
