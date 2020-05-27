package ro.ase.csie.cts.g1091.seminar14;

import ro.ase.csie.cts.g1091.seminar14.chain.AbstractModule;
import ro.ase.csie.cts.g1091.seminar14.chain.BroadcastModule;
import ro.ase.csie.cts.g1091.seminar14.chain.ChatMessage;
import ro.ase.csie.cts.g1091.seminar14.chain.FIlterModule;
import ro.ase.csie.cts.g1091.seminar14.chain.PrivateChatModule;
import ro.ase.csie.cts.g1091.seminar14.command.AsyncTask;
import ro.ase.csie.cts.g1091.seminar14.command.BackupModule;
import ro.ase.csie.cts.g1091.seminar14.command.ForumModule;
import ro.ase.csie.cts.g1091.seminar14.command.GameUpdateModule;
import ro.ase.csie.cts.g1091.seminar14.command.TaskManager;
import ro.ase.csie.cts.g1091.seminar14.state.GameCharacter;

public class TestGameClient {
	
	public static void main(String[] args) {
		
		//State
		GameCharacter superman = new GameCharacter("Superman", 1000);
		superman.move();
		superman.attack("Joker", 200);
		
		superman.isHit(100);
		superman.move();
		superman.attack("Joker", 200);
		
		superman.isHit(500);
		superman.move();
		superman.attack("Joker", 200);
		
		superman.isHit(350);
		superman.move();
		superman.attack("Joker", 200);
		
		superman.fullHeal();
		superman.move();
		superman.attack("Joker", 200);
		
		//Chain
		FIlterModule filter = new FIlterModule("Filter");
		PrivateChatModule playerChat = new PrivateChatModule("Player chat");
		BroadcastModule broadcast = new BroadcastModule("Broadcast");
		
		filter.setNext(playerChat);
		playerChat.setNext(broadcast);
		
		AbstractModule chatChain = filter;
		
		chatChain.processMessage(new ChatMessage("Hello", 1, "John"));
		chatChain.processMessage(new ChatMessage("I hate you", 1, "John"));
		chatChain.processMessage(new ChatMessage("How are you today ?", 1, ""));
		
		
		//Command
		TaskManager manager = new TaskManager();
		
		ForumModule forum = new ForumModule();
		BackupModule backup = new BackupModule();
		GameUpdateModule update = new GameUpdateModule();
		
		manager.addTask(new AsyncTask("Updating game", update));
		manager.addTask(new AsyncTask("Updating game", update));
		manager.addTask(new AsyncTask("Forum update", forum));
		
		System.out.println("The game goes on");
		
		manager.addTask(new AsyncTask("Backup", backup));
		
		//should be o different thread
		manager.executeTasks();
		
	}
}
