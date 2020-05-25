package ro.ase.csie.cts.g1092.seminar14.memento;

import java.util.ArrayList;

public class Backups {
	private ArrayList<PlayerMemento> mementos = new ArrayList<>();
	
	public void addSave(PlayerMemento memento) {
		this.mementos.add(memento);
	}
	
	public PlayerMemento getSave() {
		PlayerMemento memento = this.mementos.get(0);
		this.mementos.remove(0);
		return memento;
	}
}
