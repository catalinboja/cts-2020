package ro.ase.csie.cts.g1092.seminar12.composite;

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
			node.defend();
	}

	@Override
	public void heal(int points) {
		//throw new UnsupportedOperationException();
		//or
		for(AbstractNode node : this.nodes) {
			if (node instanceof GameCharacter)
				node.heal(points);
		}
	}

	@Override
	public void addNode(AbstractNode newNode) {
		this.nodes.add(newNode);
	}

	@Override
	public AbstractNode getNode(int index) {
		if(index < this.nodes.size())
			return this.nodes.get(index);
		else
			return null;
	}

	@Override
	public void removeNode(String name) {
		int index = -1;
		for(AbstractNode node : this.nodes) {
			index += 1;
			if(node.name.equals(name))
			{
				break;
			}
		}
		if(this.nodes.get(index).name.equals(name)) {
			this.nodes.remove(index);
		}
	}
	
}
