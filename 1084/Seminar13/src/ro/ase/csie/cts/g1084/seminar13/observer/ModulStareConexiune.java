package ro.ase.csie.cts.g1084.seminar13.observer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Observable;

public class ModulStareConexiune {
	
	ArrayList<NotificareConexiune> event = new ArrayList<>();
	
	public void addListener(NotificareConexiune listener) {
		event.add(listener);
	}
	
	public void removeListener(NotificareConexiune listener) {
		event.remove(listener);
	}
	
	public void notificareConexiunePierduta() {
		for(NotificareConexiune observator : event)
			observator.conexiuneInchisa();
	}
	
}
