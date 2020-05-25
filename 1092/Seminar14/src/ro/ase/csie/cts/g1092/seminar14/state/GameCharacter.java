package ro.ase.csie.cts.g1092.seminar14.state;

public class GameCharacter {
	private  String name;
	private int lifePoints;
	
	CharacterActionsInterface currentState = null;
	
	//an option - to allow others to interfere with your object state	
	private void setCurrentState(CharacterActionsInterface currentState) {
		this.currentState = currentState;
	}
	
	public GameCharacter(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		//we start with an initial state
		this.currentState = new NormalState();
	}
	
	public void move() {
		this.currentState.moveOnScreen();
	}
	
	public void fight(String enemy, int points) {
		this.currentState.attack(enemy, points);
	}
	
	public void heal(int points) {
		this.lifePoints += points;
		if(this.lifePoints > 500 && this.lifePoints <=800)
			this.currentState = new WoundedState();
		if(this.lifePoints > 800)
			this.currentState = new NormalState();	
	}
	
	public void takeAHit(int points) {
		this.lifePoints -= points;
		if(this.lifePoints < 200)
			this.currentState = new CriticalState();
		else if(this.lifePoints < 800)
			this.currentState = new WoundedState();
	}
	
}
