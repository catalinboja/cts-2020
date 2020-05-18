package ro.ase.csie.cts.g1074.seminar12.composite;

public abstract class NodAbstractStructura {
	
	String nume;
	
	public String getNume() {
		return nume;
	}
	
	
	public NodAbstractStructura(String nume) {
		super();
		this.nume = nume;
	}


	//metode specifice unui jucator
	public abstract void ataca(String inamic);
	public abstract void seApara();
	public abstract void seVindeca(int puncte);
	
	//varianta 1 - doar le definim
	//metode specifice unui nod intermediar - composite
/*	public abstract void adaugaComponenta(NodAbstractStructura componenta);
	public abstract NodAbstractStructura getComponenta(int index);
	public abstract void stergeComponenta(int index);*/
	
	//varianta 2 - le si implementam
	public void adaugaComponenta(NodAbstractStructura componenta) {
		throw new UnsupportedOperationException();
	}

	public NodAbstractStructura getComponenta(int index) {
		throw new UnsupportedOperationException();
	}

	public void stergeComponenta(int index) {
		throw new UnsupportedOperationException();	
	}

}
