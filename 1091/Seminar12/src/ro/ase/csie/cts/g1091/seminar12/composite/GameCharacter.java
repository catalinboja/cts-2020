package ro.ase.csie.cts.g1091.seminar12.composite;

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
		System.out.println(this.name + " is defending");
	}

	@Override
	public void heal(int points) {
		System.out.println(this.name + " is healing");
	}

	
	//version 1
/*	@Override
	public void add(AbstractNode newNode) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(String name) {
		throw new UnsupportedOperationException();
	}

	@Override
	public AbstractNode get(int index) {
		throw new UnsupportedOperationException();
	}
	*/
	

}
