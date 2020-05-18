package ro.ase.csie.cts.g1092.seminar12.composite;

public abstract class AbstractNode {
	
	String name;

	public AbstractNode(String name) {
		super();
		this.name = name;
	}
	
	//characters specific methods
	public abstract void attack(String enemy);
	public abstract void defend();
	public abstract void heal(int points);
	
	//methods specific to the composite node
	//version 1
/*	public abstract void addNode(AbstractNode newNode);
	public abstract AbstractNode getNode(int index);
	public abstract void removeNode(String name);*/
	

	//version 2
	public void addNode(AbstractNode newNode) {
		throw new UnsupportedOperationException();
	}

	public AbstractNode getNode(int index) {
		throw new UnsupportedOperationException();
	}

	public void removeNode(String name) {
		throw new UnsupportedOperationException();
	}
	
}
