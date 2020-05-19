package ro.ase.csie.cts.g1085.seminar12.composite;

import java.util.ArrayList;

public class Grup  extends NodAbstract{

	ArrayList<NodAbstract> noduri  = new ArrayList<>();
	
	public Grup(String nume) {
		super(nume);
	}

	@Override
	public void ataca(String inamic) {
		for(NodAbstract nod : this.noduri)
			nod.ataca(inamic);
	}

	@Override
	public void seApara() {
		for(NodAbstract nod : this.noduri)
			if(nod instanceof CaracterJucator)
				nod.seApara();
	}

	@Override
	public void seVindeca(int puncte) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void adaugaNod(NodAbstract nod) {
		this.noduri.add(nod);
	}

	@Override
	public NodAbstract getNod(String nume) {
		NodAbstract ref = null;
		for(NodAbstract nod : this.noduri)
			if(nod.getNume().equals(nume))
				ref = nod;
		return ref;
	}

	@Override
	public void stergeNod(int index) {
		if(index >=0 && index < noduri.size())
			noduri.remove(index);
		
	}
	
	

}
