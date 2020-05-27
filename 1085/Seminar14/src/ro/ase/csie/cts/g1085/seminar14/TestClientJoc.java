package ro.ase.csie.cts.g1085.seminar14;

import ro.ase.csie.cts.g1085.seminar14.chain.MesajChat;
import ro.ase.csie.cts.g1085.seminar14.chain.ModulAbstract;
import ro.ase.csie.cts.g1085.seminar14.chain.ModulChatGlobal;
import ro.ase.csie.cts.g1085.seminar14.chain.ModulChatPrivat;
import ro.ase.csie.cts.g1085.seminar14.chain.ModulFiltru;
import ro.ase.csie.cts.g1085.seminar14.state.CaracterJoc;

public class TestClientJoc {
	
	public static void main(String[] args) {
		
		//State
		
		CaracterJoc superman = new CaracterJoc("Superman",1000);
		
		superman.seDeplaseaza();
		superman.ataca("Joker", 200);
		
		superman.esteLovit(200);
		
		superman.seDeplaseaza();
		superman.ataca("Joker", 200);
		
		superman.esteLovit(400);
		superman.seDeplaseaza();
		superman.ataca("Joker", 200);
		
		superman.esteLovit(350);
		superman.seDeplaseaza();
		superman.ataca("Joker", 200);
		
		superman.seVindeca(300);
		superman.seDeplaseaza();
		superman.ataca("Joker", 200);
		
		//Chain
		
		ModulFiltru filtru = new ModulFiltru("Filtru");
		ModulChatPrivat chatPrivat = new ModulChatPrivat("Chat privat");
		ModulChatGlobal global = new ModulChatGlobal("Chat joc");
		
		filtru.setNext(chatPrivat);
		chatPrivat.setNext(global);
		
		ModulAbstract chainChat = filtru;
		
		chainChat.procesareMesaj(new MesajChat("Salut", 1, "Gigel"));
		chainChat.procesareMesaj(new MesajChat("@#$%#$^ te urasc", 1, "Gigel"));
		chainChat.procesareMesaj(new MesajChat("Ce mai faceti ?", 1, ""));
	}
}
