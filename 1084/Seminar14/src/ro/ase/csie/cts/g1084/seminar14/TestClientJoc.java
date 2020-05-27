package ro.ase.csie.cts.g1084.seminar14;

import ro.ase.csie.cts.g1084.seminar14.chain.MesajChat;
import ro.ase.csie.cts.g1084.seminar14.chain.ModulChatAbstract;
import ro.ase.csie.cts.g1084.seminar14.chain.ModulChatGlobal;
import ro.ase.csie.cts.g1084.seminar14.chain.ModulChatPrivat;
import ro.ase.csie.cts.g1084.seminar14.chain.ModulFiltru;
import ro.ase.csie.cts.g1084.seminar14.command.ModulBackupDate;
import ro.ase.csie.cts.g1084.seminar14.command.ModulUpdateForum;
import ro.ase.csie.cts.g1084.seminar14.command.TaskAsincron;
import ro.ase.csie.cts.g1084.seminar14.command.TaskManager;
import ro.ase.csie.cts.g1084.seminar14.state.CaracterJoc;

public class TestClientJoc {

	public static void main(String[] args) {
		
		//State
		
		CaracterJoc superman = new CaracterJoc("Superman", 1000);
		superman.merge();
		superman.ataca("Joker", 100);
		
		superman.esteLovit(200);
		superman.merge();
		superman.ataca("Joker", 100);
		
		superman.esteLovit(400);
		superman.merge();
		superman.ataca("Joker", 100);
		
		
		superman.esteLovit(360);
		superman.merge();
		superman.ataca("Joker", 100);
		
		superman.seVindeca(300);
		superman.merge();
		superman.ataca("Joker", 100);
		
		//Chain
		ModulFiltru filtru = new ModulFiltru("Filtru");
		ModulChatPrivat privat = new ModulChatPrivat("Chat privat");
		ModulChatGlobal global = new ModulChatGlobal("Global");
		
		filtru.setNext(privat);
		privat.setNext(global);
		
		ModulChatAbstract chat = filtru;
		
		chat.procesareMesajChat(new MesajChat("Salut", 1, "Gigel"));
		chat.procesareMesajChat(new MesajChat("Gigel te urasc", 1, "Gigel"));
		chat.procesareMesajChat(new MesajChat("Sper sa aveti o zi buna", 1, ""));
		
		//Command
		TaskManager manager = new TaskManager();
		System.out.println("Jocul ruleaza fara probleme");
		System.out.println("Lansare autosave");
		manager.adaugaTask(
				new TaskAsincron("Backup", 1000, new ModulBackupDate()));
		System.out.println("Jocul ruleaza fara probleme");
		System.out.println("Lansare update forum");
		manager.adaugaTask(
				new TaskAsincron("Update forum", 1000, new ModulUpdateForum()));
		System.out.println("Jocul ruleaza fara probleme");
		manager.executaTask();
		System.out.println("Jocul ruleaza fara probleme");
		manager.executaTask();
		System.out.println("Jocul ruleaza fara probleme");
	}

}
