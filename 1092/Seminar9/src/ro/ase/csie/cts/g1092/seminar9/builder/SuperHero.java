package ro.ase.csie.cts.g1092.seminar9.builder;

public class SuperHero {
	
	String name;
	int lifePoints;
	boolean isPositive = true;
	boolean isCriticalWounded = false;
	String leftHandWeapon;
	String rightHandWeapon;
	String superPower;
	
	private SuperHero() {
		
	}

	private SuperHero(String name, int lifePoints, boolean isPositive, boolean isCriticalWounded, String leftHandWeapon,
			String rightHandWeapon, String superPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isPositive = isPositive;
		this.isCriticalWounded = isCriticalWounded;
		this.leftHandWeapon = leftHandWeapon;
		this.rightHandWeapon = rightHandWeapon;
		this.superPower = superPower;
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

	private void setCriticalWounded(boolean isCriticalWounded) {
		this.isCriticalWounded = isCriticalWounded;
	}

	private void setLeftHandWeapon(String leftHandWeapon) {
		this.leftHandWeapon = leftHandWeapon;
	}

	private void setRightHandWeapon(String rightHandWeapon) {
		this.rightHandWeapon = rightHandWeapon;
	}

	private void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	public String getName() {
		return name;
	}

	public int getLifePoints() {
		return lifePoints;
	}

	public boolean isPositive() {
		return isPositive;
	}

	public boolean isCriticalWounded() {
		return isCriticalWounded;
	}

	public String getLeftHandWeapon() {
		return leftHandWeapon;
	}

	public String getRightHandWeapon() {
		return rightHandWeapon;
	}

	public String getSuperPower() {
		return superPower;
	}
	
	public static class SuperHeroBuilder {
		private SuperHero superHero = null;
		
		//ask for the minum required attributes - around 2 or 3 max
		public SuperHeroBuilder(String name, int lifePoints) {
			superHero = new SuperHero();
			superHero.setName(name);
			superHero.setLifePoints(lifePoints);
		}
		
		public SuperHeroBuilder addRightHandWeapon(String weapon) {
			superHero.setRightHandWeapon(weapon);
			return this;
		}
		
		public SuperHeroBuilder isABadGuy() {
			superHero.setPositive(false);
			return this;
		}
		
		public SuperHeroBuilder isCriticalWounded() {
			superHero.setPositive(true);
			return this;
		}
		
		//do this for all the other attributes
		
		//a must
		public SuperHero build() {
			return this.superHero;
		}
		
	}
	
}
