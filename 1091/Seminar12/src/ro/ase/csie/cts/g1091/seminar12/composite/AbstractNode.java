package ro.ase.csie.cts.g1091.seminar12.composite;

public abstract class AbstractNode {

	protected String name;

	public AbstractNode(String name) {
		super();
		this.name = name;
	}
	
	//methods specific to the game characters
	
	public void getName() {
		System.out.println("Name: " + name);
	}
	
	public abstract void attack(String enemy);
	public abstract void defend();
	public abstract void heal(int points);
	
	//methods specific to the composite node
	
	//version 1
/*	public abstract void add(AbstractNode newNode);
	public abstract void remove(String name);
	public abstract AbstractNode get(int index);*/
	
	//version 2
	public void add(AbstractNode newNode) {
		throw new UnsupportedOperationException();
	}

	public void remove(String name) {
		throw new UnsupportedOperationException();
	}

	public AbstractNode get(int index) {
		throw new UnsupportedOperationException();
	}
	
}
