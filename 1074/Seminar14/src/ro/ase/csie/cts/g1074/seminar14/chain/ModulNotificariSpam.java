package ro.ase.csie.cts.g1074.seminar14.chain;

public class ModulNotificariSpam extends ModulProcesareNotificari {

	public ModulNotificariSpam(String denumireModul) {
		super(denumireModul);
	}

	@Override
	public void procesareNotificare(NotificareJoc notificare) {
		if(notificare.prioritate == 0) {
			System.out.println("Eliminare notificare " + notificare.text);
		}
		else
			if(this.next != null)
				this.next.procesareNotificare(notificare);
	}

}
