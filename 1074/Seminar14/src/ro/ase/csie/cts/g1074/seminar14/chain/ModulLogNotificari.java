package ro.ase.csie.cts.g1074.seminar14.chain;

public class ModulLogNotificari extends ModulProcesareNotificari {

	public ModulLogNotificari(String denumireModul) {
		super(denumireModul);
	}

	@Override
	public void procesareNotificare(NotificareJoc notificare) {
		System.out.println("Salvare in BD a notificarii " + notificare.text);
		if(this.next != null) {
			this.next.procesareNotificare(notificare);
		}
	}

}
