package ro.ase.csie.cts.g1092.seminar14;

import ro.ase.csie.cts.g1092.seminar14.chain.AbstractChatClient;
import ro.ase.csie.cts.g1092.seminar14.chain.ChatFilterModule;
import ro.ase.csie.cts.g1092.seminar14.chain.ChatMessage;
import ro.ase.csie.cts.g1092.seminar14.chain.LoggingChatModule;
import ro.ase.csie.cts.g1092.seminar14.chain.PlayerChatModule;
import ro.ase.csie.cts.g1092.seminar14.memento.Backups;
import ro.ase.csie.cts.g1092.seminar14.memento.PlayerCharacter;
import ro.ase.csie.cts.g1092.seminar14.state.GameCharacter;

public class TestGameClient {

	public static void main(String[] args) {
		
		//State
		GameCharacter superman = new GameCharacter("superman", 1000);
		superman.move();
		superman.fight("Joker", 500);
		superman.takeAHit(500);
		superman.move();
		superman.fight("Joker", 500);
		superman.takeAHit(450);
		
		superman.heal(1000);
		
		superman.move();
		superman.fight("Joker", 500);
		
		//Chain
		LoggingChatModule logging = new LoggingChatModule("Logging");
		ChatFilterModule filter = new ChatFilterModule("Filter");
		PlayerChatModule johnChat = new PlayerChatModule("John");
		
		logging.setNext(filter);
		filter.setNext(johnChat);
		
		AbstractChatClient chat = logging;
		
		chat.processMessage(new ChatMessage("Hello", "John", 100, false));
		chat.processMessage(new ChatMessage("I hate you", "John", 100, false));
		chat.processMessage(new ChatMessage("How are you ? ", "Alice", 100, false));
		
		//Memento
		PlayerCharacter superman2 = new PlayerCharacter("Superman", 500);
		Backups backup = new Backups();
		
		backup.addSave(superman2.save());
		superman.takeAHit(300);
		superman.takeAHit(300);
		backup.addSave(superman2.save());
		superman.takeAHit(100);
		superman2.reload(backup.getSave());
		
	}

}
