package ro.ase.csie.cts.g1085.seminar12.composite;

public class CaracterJucator extends NodAbstract {

	public CaracterJucator(String nume) {
		super(nume);
	}

	@Override
	public void ataca(String inamic) {
		System.out.println(this.nume + " ataca pe " + inamic);
	}

	@Override
	public void seApara() {
		System.out.println(this.nume + " se apara ");
	}

	@Override
	public void seVindeca(int puncte) {
		System.out.println(this.nume + " se vindeca ");
	}

	//varianta 1
/*	@Override
	public void adaugaNod(NodAbstract nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public NodAbstract getNod(String nume) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void stergeNod(int index) {
		throw new UnsupportedOperationException();
	}*/
	
}
