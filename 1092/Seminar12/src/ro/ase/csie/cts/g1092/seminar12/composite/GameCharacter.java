package ro.ase.csie.cts.g1092.seminar12.composite;

public class GameCharacter extends AbstractNode {

	public GameCharacter(String name) {
		super(name);
	}

	@Override
	public void attack(String enemy) {
		System.out.println(this.name + " attacks " + enemy);
	}

	@Override
	public void defend() {
		System.out.println(this.name + "  is defending");
	}

	@Override
	public void heal(int points) {
		System.out.println(this.name + "  is healing");
	}

/*	@Override
	public void addNode(AbstractNode newNode) {
		throw new UnsupportedOperationException();
	}

	@Override
	public AbstractNode getNode(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeNode(String name) {
		throw new UnsupportedOperationException();
	}*/

}
