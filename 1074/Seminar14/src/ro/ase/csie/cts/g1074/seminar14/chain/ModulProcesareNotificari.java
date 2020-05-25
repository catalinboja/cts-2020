package ro.ase.csie.cts.g1074.seminar14.chain;

public abstract class ModulProcesareNotificari {
	
	protected ModulProcesareNotificari next;
	protected String denumireModul;
	
	public ModulProcesareNotificari(String denumireModul) {
		super();
		this.denumireModul = denumireModul;
	}
	
	public void setNext(ModulProcesareNotificari next) {
		this.next = next;
	}

	public abstract void procesareNotificare(NotificareJoc notificare);
	
}
