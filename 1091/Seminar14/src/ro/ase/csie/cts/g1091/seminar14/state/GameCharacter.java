package ro.ase.csie.cts.g1091.seminar14.state;

import javax.management.ListenerNotFoundException;

public class GameCharacter {
	
	String name;
	int lifePoints;
	
	CharacterActions currentState = null;
	
	
	public GameCharacter(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		
		this.currentState = new StateNormal();
	}
	
	
	public void setCurrentState(CharacterActions currentState) {
		this.currentState = currentState;
	}


	public void move() {
		System.out.println(this.name);
		this.currentState.relocate();
		
	}
	
	public void attack(String enemy, int points) {
		this.currentState.strike(enemy, points, this);
	}
	
	public void heal(int points) {
		this.lifePoints += points;
		if(this.lifePoints > 500)
			this.currentState = new StateWounded();
	}
	
	public void isHit(int points) {
		this.lifePoints -= points;
		if(lifePoints <= 500)
			this.currentState = new StateWounded();
		if(lifePoints < 100)
			this.currentState = new StateCritical();
	}
	
	public void fullHeal() {
		this.lifePoints = 1000;
		this.currentState = new StateNormal();
	}
	
	
}
