package ro.ase.csie.cts.g1091.seminar14.chain;

public class PrivateChatModule extends AbstractModule {

	public PrivateChatModule(String moduleName) {
		super(moduleName);
	}

	@Override
	public void processMessage(ChatMessage msg) {
		if(! msg.getPlayerName().isEmpty()) {
			System.out.println("Send message to " + msg.playerName);
			System.out.println(msg.getText());
			return;
		}
		
		if( this.next != null)
			this.next.processMessage(msg);
	}

}
