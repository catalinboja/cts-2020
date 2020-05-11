package ro.ase.cts.g1074.seminar11.adapter;

public class CaracterDisney implements InterfataCaractereDisney {
	
	String denumire;
	float puncte;
	
	public CaracterDisney(String denumire, float puncte) {
		super();
		this.denumire = denumire;
		this.puncte = puncte;
	}

	@Override
	public void display() {
		System.out.println("Caracter Disney: " + denumire);
	}

	@Override
	public void pierde5PuncteViata() {
		this.puncte -= 5;
		System.out.println("Disney -");
	}

	@Override
	public void utilizeazaTrusaAjutor(int puncte) {
		this.puncte += puncte;
		System.out.println("Disney +");
	}
	
	
	
}
