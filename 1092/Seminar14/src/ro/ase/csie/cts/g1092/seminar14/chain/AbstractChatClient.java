package ro.ase.csie.cts.g1092.seminar14.chain;

public abstract class AbstractChatClient {
	
	AbstractChatClient next;
	
	String name;
	
	public AbstractChatClient(String name) {
		super();
		this.name = name;
	}

	public void setNext(AbstractChatClient next) {
		this.next = next;
	}
	
	public abstract void processMessage(ChatMessage msg);
}
