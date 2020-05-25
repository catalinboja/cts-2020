package ro.ase.csie.cts.g1092.seminar14.chain;

public class ChatFilterModule extends AbstractChatClient {

	public ChatFilterModule(String name) {
		super(name);
	}

	@Override
	public void processMessage(ChatMessage msg) {

		String[] violentWords = new String[] { "hate", "push", "hit" };

		for (String word : violentWords) {
			if (msg.getText().contains(word)) {
				System.out.println("This message has been filtered: " + msg.getText());
				return;
			}
		}

		if (this.next != null)
			this.next.processMessage(msg);
	}

}
