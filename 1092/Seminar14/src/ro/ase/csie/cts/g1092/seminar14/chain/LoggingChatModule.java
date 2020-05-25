package ro.ase.csie.cts.g1092.seminar14.chain;

public class LoggingChatModule extends AbstractChatClient {

	public LoggingChatModule(String name) {
		super(name);
	}

	@Override
	public void processMessage(ChatMessage msg) {
		System.out.println("Logging " + msg.getText());
		if(this.next  != null)
			this.next.processMessage(msg);
	}

}
