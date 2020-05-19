package ro.ase.csie.cts.g1091.seminar12.composite;

import java.util.ArrayList;

public class Group extends AbstractNode {
	
	ArrayList<AbstractNode> nodes = new ArrayList<>();

	public Group(String name) {
		super(name);
	}

	@Override
	public void attack(String enemy) {
		for(AbstractNode node : this.nodes)
			node.attack(enemy);
	}

	@Override
	public void defend() {
		for(AbstractNode node : this.nodes)
			if(node instanceof GameCharacter)
				node.defend();
	}

	@Override
	public void heal(int points) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void add(AbstractNode newNode) {
		this.nodes.add(newNode);
	}

	@Override
	public void remove(String name) {
		AbstractNode ref = null;
		for(AbstractNode node : this.nodes) {
			if(node.name.equals(name))
				ref = node;
		}
		
		if(ref != null)
			this.nodes.remove(ref);
		
	}

	@Override
	public AbstractNode get(int index) {
		if(index >= 0 && index < this.nodes.size())
			return this.nodes.get(index);
		return null;
	}
	
	

}
