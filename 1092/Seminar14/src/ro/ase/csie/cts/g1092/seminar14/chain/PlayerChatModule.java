package ro.ase.csie.cts.g1092.seminar14.chain;

public class PlayerChatModule extends AbstractChatClient {

	public PlayerChatModule(String name) {
		super(name);
	}

	@Override
	public void processMessage(ChatMessage msg) {
		if(msg.getToPlayer().equals(this.name) ) {
			System.out.println("Message received for " + this.name + ": " + msg.getText());
			return;
		}
		
		if(this.next != null)
			this.next.processMessage(msg);
	}

}
