package ro.ase.csie.cts.g1074.seminar14;

import ro.ase.csie.cts.g1074.seminar14.chain.ModulLogNotificari;
import ro.ase.csie.cts.g1074.seminar14.chain.ModulNotificariCritice;
import ro.ase.csie.cts.g1074.seminar14.chain.ModulNotificariSpam;
import ro.ase.csie.cts.g1074.seminar14.chain.ModulProcesareNotificari;
import ro.ase.csie.cts.g1074.seminar14.chain.NotificareJoc;
import ro.ase.csie.cts.g1074.seminar14.state.Caracter;

public class TestClientJoc {
	
	public static void main(String[] args) {
		
		//State
		Caracter superman = new Caracter("Superman", 1000);
		superman.merge();
		superman.ataca("Joker", 500);
		superman.esteLovit(500);
		superman.merge();
		superman.ataca("Joker", 500);
		superman.esteLovit(450);
		superman.merge();
		superman.ataca("Joker", 500);
		superman.seVindecaTotal();
		superman.merge();
		superman.ataca("Joker", 500);
		
		//Chain
		ModulLogNotificari logging = new ModulLogNotificari("Log notificari");
		ModulNotificariCritice critice = new ModulNotificariCritice("Critice");
		ModulNotificariSpam spam = new ModulNotificariSpam("Filtru spam");
		
		logging.setNext(spam);
		spam.setNext(critice);
		
		ModulProcesareNotificari chainNotificari = logging;
		
		chainNotificari.procesareNotificare(new NotificareJoc(
				"Conexiune pierduta", 100, true));
		chainNotificari.procesareNotificare(new NotificareJoc(
				"Conexiune pierduta ******", 0, true));
		chainNotificari.procesareNotificare(new NotificareJoc(
				"Salvare joc", 50, false));
		
		
	}
	
}
