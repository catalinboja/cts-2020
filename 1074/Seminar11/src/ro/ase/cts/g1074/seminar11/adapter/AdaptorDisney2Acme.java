package ro.ase.cts.g1074.seminar11.adapter;

public class AdaptorDisney2Acme extends CaracterACME implements InterfataCaractereDisney {

	
	public AdaptorDisney2Acme(String nume, int puncte) {
		this.nume = nume;
		this.puncteViata = puncte;
	}
	
	@Override
	public void display() {
		System.out.println("Caracter Disney: " + this.nume);
	}

	@Override
	public void pierde5PuncteViata() {
		this.puncteViata -= 5;
		System.out.println("Disney -");
	}

	@Override
	public void utilizeazaTrusaAjutor(int puncte) {
		this.puncteViata += puncte;
		System.out.println("Disney +");
	}

	@Override
	public void esteLovit(int puncte) {
		//implementarea foloseste metodele din contextul existent
		for(int i = 0 ; i < puncte / 5  + 1; i++)
			this.pierde5PuncteViata();
	}

	@Override
	public void seVindeca(int puncte) {
		//implementarea foloseste metodele din contextul existent
		this.utilizeazaTrusaAjutor(puncte);
	}
	
}
