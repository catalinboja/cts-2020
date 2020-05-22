package ro.ase.csie.cts.g1074.seminar13.observer;

import java.util.ArrayList;

public class ModulMonitorizareConexiune {
	
	ArrayList<InterfataStareConexiuneListener> observatori = 
			new ArrayList<>();
	
	//metode specifice unui Observabil
	public void registerObservator(InterfataStareConexiuneListener listener) {
		this.observatori.add(listener);
	}
	
	public void unregisterObservator(InterfataStareConexiuneListener listener) {
		this.observatori.remove(listener);
	}
	
	//metoda care lanseaza evenimentul si care notifica observatorii
	public void notificareConexiunePierduta() {
		for(InterfataStareConexiuneListener observator : this.observatori)
			observator.conexiunePierduta(System.currentTimeMillis() + "");
	}
	
	public void notificareConexiuneActiva() {
		for(InterfataStareConexiuneListener observator : this.observatori)
			observator.conexiuneActiva();
	}
	
}
