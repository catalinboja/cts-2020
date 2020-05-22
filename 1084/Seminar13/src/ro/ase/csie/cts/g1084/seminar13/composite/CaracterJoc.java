package ro.ase.csie.cts.g1084.seminar13.composite;

public class CaracterJoc extends NodAbstract {

	public CaracterJoc(String nume) {
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

	
	//versiune 1
/*	@Override
	public void adauga(NodAbstract nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void sterge(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public NodAbstract get(String nume) {
		throw new UnsupportedOperationException();
	}*/

}
