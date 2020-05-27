package ro.ase.csie.cts.g1091.seminar14.chain;

public class FIlterModule extends AbstractModule {

	public FIlterModule(String moduleName) {
		super(moduleName);
	}

	@Override
	public void processMessage(ChatMessage msg) {
		String[] violentWords = new String[] {"hate", "hit", "stupid"};
		
		for(String word : violentWords) {
			if(msg.getText().contains(word)) {
				System.out.println("Filtering: " + msg.getText());
				return;
			}
		}
		
		if(this.next != null)
			this.next.processMessage(msg);
	
	}
		
}
