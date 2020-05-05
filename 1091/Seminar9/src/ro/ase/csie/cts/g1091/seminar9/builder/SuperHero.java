package ro.ase.csie.cts.g1091.seminar9.builder;

public class SuperHero {
	
	String name;
	int lifePoints;
	boolean isPositive = true;
	boolean criticalWounded = false;
	String rightHandWeapon;
	String leftHandWeapon;
	String superPower;
	String superSuperPower;
	
	
	private SuperHero(String name, int lifePoints, boolean isPositive, boolean criticalWounded, String rightHandWeapon,
			String leftHandWeapon, String superPower, String superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isPositive = isPositive;
		this.criticalWounded = criticalWounded;
		this.rightHandWeapon = rightHandWeapon;
		this.leftHandWeapon = leftHandWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
	private SuperHero() {
		
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	private void setPositive(boolean isPositive) {
		this.isPositive = isPositive;
	}

	private void setCriticalWounded(boolean criticalWounded) {
		this.criticalWounded = criticalWounded;
	}

	private void setRightHandWeapon(String rightHandWeapon) {
		this.rightHandWeapon = rightHandWeapon;
	}

	private void setLeftHandWeapon(String leftHandWeapon) {
		this.leftHandWeapon = leftHandWeapon;
	}

	private void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	private void setSuperSuperPower(String superSuperPower) {
		this.superSuperPower = superSuperPower;
	}
	
	
	//the builder
	public static class SuperHeroBuilder {
		
		SuperHero superhero = null;
		
		public SuperHeroBuilder(String name, int lifePoints) {
			superhero = new SuperHero();
			superhero.setName(name);
			superhero.setLifePoints(lifePoints);
		}
		
		public SuperHeroBuilder isPositive() {
			this.superhero.setPositive(true);
			return this;
		}
		
		public SuperHeroBuilder isNegativeCharacter() {
			this.superhero.setPositive(false);
			return this;
		}
		
		public SuperHeroBuilder isWounded() {
			this.superhero.setCriticalWounded(true);
			return this;
		}
		
		public SuperHeroBuilder setRightHandWeapon(String weapon) {
			this.superhero.setRightHandWeapon(weapon);
			return this;
		}
		
		public SuperHeroBuilder setSuperPower(String power) {
			this.superhero.setSuperPower(power);
			return this;
		}
		
		//and the others
		
		
		public SuperHero build() {
			return this.superhero;
		}
		
	}
	

}
