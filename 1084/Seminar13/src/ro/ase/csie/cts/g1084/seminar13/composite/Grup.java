package ro.ase.csie.cts.g1084.seminar13.composite;

import java.util.ArrayList;

public class Grup extends NodAbstract {
	
	ArrayList<NodAbstract> noduri = new ArrayList<>();

	public Grup(String nume) {
		super(nume);
	}

	@Override
	public void ataca(String inamic) {
		for(NodAbstract nod : noduri)
			nod.ataca(inamic);
	}

	@Override
	public void seApara() {
		for(NodAbstract nod : noduri)
			if(nod instanceof CaracterJoc)
				nod.seApara();
	}

	@Override
	public void seVindeca(int puncte) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void adauga(NodAbstract nod) {
		this.noduri.add(nod);
	}

	@Override
	public void sterge(int index) {
		if(index >=0 && index < this.noduri.size())
			this.noduri.remove(index);
	}

	@Override
	public NodAbstract get(String nume) {
		NodAbstract ref = null;
		for(NodAbstract nod : noduri)
			if(nod.nume.equals(nume))
				ref = nod;
		return ref;
	}
	
	

}
