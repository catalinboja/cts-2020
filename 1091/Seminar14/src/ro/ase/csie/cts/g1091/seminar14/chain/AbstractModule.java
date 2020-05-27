package ro.ase.csie.cts.g1091.seminar14.chain;

public abstract class AbstractModule {
	
	AbstractModule next;
	
	String moduleName;

	public AbstractModule(String moduleName) {
		super();
		this.moduleName = moduleName;
	}

	public void setNext(AbstractModule next) {
		this.next = next;
	}
	
	public abstract void processMessage(ChatMessage msg);
	
	
}
