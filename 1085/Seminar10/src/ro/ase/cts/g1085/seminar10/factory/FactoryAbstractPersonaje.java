package ro.ase.cts.g1085.seminar10.factory;

import ro.ase.cts.g1085.seminar10.simplefactory.PersonajAbstract;
import ro.ase.cts.g1085.seminar10.simplefactory.TipPersonaj;

public abstract class FactoryAbstractPersonaje {
	public abstract PersonajAbstract getPersonaj(TipPersonaj tip);
	
}
