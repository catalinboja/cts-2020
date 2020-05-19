package ro.ase.csie.cts.g1085.seminar12.composite;

public abstract class NodAbstract {
	
	protected String nume;

	public NodAbstract(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}
	
	//metode specifice caracterelor jucatorilor
	public abstract void ataca(String inamic);
	public abstract void seApara();
	public abstract void seVindeca(int puncte);
	
	
	//metode specifice nodurilor composite
	
	//varianta 1
/*	public abstract void adaugaNod(NodAbstract nod);
	public abstract NodAbstract getNod(String nume);
	public abstract void stergeNod(int index);*/
	
	//varianta 2	
	public void adaugaNod(NodAbstract nod) {
		throw new UnsupportedOperationException();
	}

	public NodAbstract getNod(String nume) {
		throw new UnsupportedOperationException();
	}

	public void stergeNod(int index) {
		throw new UnsupportedOperationException();
	}
	
	
}
