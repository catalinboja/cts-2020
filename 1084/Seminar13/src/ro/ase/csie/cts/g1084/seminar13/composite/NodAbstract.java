package ro.ase.csie.cts.g1084.seminar13.composite;

public abstract class NodAbstract {
	
	String nume;

	public NodAbstract(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}
	
	
	//metode specifice caracterelor din joc
	public abstract void ataca(String inamic);
	public abstract void seApara();
	public abstract void seVindeca(int puncte);
	
	//metode specifice grupurilor 
	
	//versiune 1
/*	public abstract void adauga(NodAbstract nod);
	public abstract void sterge(int index);
	public abstract NodAbstract get(String nume);*/
	
	
	//versiune 2
	public void adauga(NodAbstract nod) {
		throw new UnsupportedOperationException();
	}

	public void sterge(int index) {
		throw new UnsupportedOperationException();
	}

	public NodAbstract get(String nume) {
		throw new UnsupportedOperationException();
	}
	
	
}
