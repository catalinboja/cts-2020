package ro.ase.csie.cts.g1074.seminar12.composite;

public class CaracterJoc extends NodAbstractStructura {

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

	//pentru varianta in care clasa parinte doar defineste aceste metode
/*	@Override
	public void adaugaComponenta(NodAbstractStructura componenta) {
		throw new UnsupportedOperationException();
	}

	@Override
	public NodAbstractStructura getComponenta(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void stergeComponenta(int index) {
		throw new UnsupportedOperationException();	
	}*/

}
