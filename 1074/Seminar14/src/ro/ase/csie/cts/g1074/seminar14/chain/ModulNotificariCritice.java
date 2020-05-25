package ro.ase.csie.cts.g1074.seminar14.chain;

public class ModulNotificariCritice extends ModulProcesareNotificari {

	public ModulNotificariCritice(String denumireModul) {
		super(denumireModul);
		
	}

	@Override
	public void procesareNotificare(NotificareJoc notificare) {
		if(notificare.esteCritica) {
			System.out.println("Modul curent: " + this.denumireModul);
			System.out.println("Atentie !!!!!!!!" + notificare.text);
		}
		
		//notificarea va fi transmisa catre nodul urmator - intotdeauna
		if(this.next != null)
			this.next.procesareNotificare(notificare);
		
	}

}
