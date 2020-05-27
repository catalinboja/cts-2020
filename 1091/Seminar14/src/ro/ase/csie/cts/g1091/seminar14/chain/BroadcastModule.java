package ro.ase.csie.cts.g1091.seminar14.chain;

public class BroadcastModule extends AbstractModule{

	public BroadcastModule(String moduleName) {
		super(moduleName);
	}

	@Override
	public void processMessage(ChatMessage msg) {
		System.out.println("Send to everyone: " + msg.getText());
		
		if(this.next != null)
			this.next.processMessage(msg);
	}

}
