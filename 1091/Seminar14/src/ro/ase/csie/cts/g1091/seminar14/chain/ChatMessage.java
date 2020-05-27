package ro.ase.csie.cts.g1091.seminar14.chain;

public class ChatMessage {
	String text;
	int priority;
	String playerName;
	
	
	public ChatMessage(String text, int priority, String playerName) {
		super();
		this.text = text;
		this.priority = priority;
		this.playerName = playerName;
	}


	public String getText() {
		return text;
	}


	public int getPriority() {
		return priority;
	}


	public String getPlayerName() {
		return playerName;
	}
	
	
	
}
