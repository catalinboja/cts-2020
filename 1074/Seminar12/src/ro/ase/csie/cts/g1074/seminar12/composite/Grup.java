package ro.ase.csie.cts.g1074.seminar12.composite;

import java.util.ArrayList;

public class Grup extends NodAbstractStructura{
	
	ArrayList<NodAbstractStructura> noduri = new ArrayList<>();

	public Grup(String nume) {
		super(nume);
	}

	@Override
	public void ataca(String inamic) {
		for(NodAbstractStructura nod : this.noduri) {
			nod.ataca(inamic);
		}
	}

	@Override
	public void seApara() {
		for(NodAbstractStructura nod : this.noduri) {
			nod.seApara();
		}
		
	}

	@Override
	public void seVindeca(int puncte) {
		//alegem sa nu implementam metoda la nivel de grup
		throw new UnsupportedOperationException();
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return super.getNume();
	}

	@Override
	public void adaugaComponenta(NodAbstractStructura componenta) {
		this.noduri.add(componenta);
	}

	@Override
	public NodAbstractStructura getComponenta(int index) {
		if(index < this.noduri.size())
			return this.noduri.get(index);
		else
			return null;
	}

	@Override
	public void stergeComponenta(int index) {
		if(index < this.noduri.size())
			this.noduri.remove(index);
	}
	
	

}
