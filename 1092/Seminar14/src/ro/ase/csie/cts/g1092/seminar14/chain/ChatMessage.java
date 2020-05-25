package ro.ase.csie.cts.g1092.seminar14.chain;

public class ChatMessage {
	private String text;
	private String toPlayer;
	private int priority;
	private boolean isForEveryone;
	
	public ChatMessage(String text, String toPlayer, int priority, boolean isForEveryone) {
		super();
		this.text = text;
		this.toPlayer = toPlayer;
		this.priority = priority;
		this.isForEveryone = isForEveryone;
	}

	public String getText() {
		return text;
	}

	public String getToPlayer() {
		return toPlayer;
	}

	public int getPriority() {
		return priority;
	}

	public boolean isForEveryone() {
		return isForEveryone;
	}
	
	
	
}
