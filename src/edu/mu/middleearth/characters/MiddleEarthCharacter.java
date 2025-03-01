package edu.mu.middleearth.characters;

public abstract class MiddleEarthCharacter {
/*
 * Fields for MiddleEarthChracter
 */
	String name;
	double health; 
	double power; 
	
	/*
	 * Constructors for MiddleEarthCharacter
	 * @param String
	 * @param double 
	 * @param double
	 */
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name; 
		this.health = health;
		this.power = power; 
	}
	
	/*
	 * Attack is performed on target, each attack differs the amount of health lost from target.
	 * @param MiddleEarthCharacter
	 * @return boolean
	 */
	 public abstract Boolean attack(MiddleEarthCharacter target);
	
	 /*
	  * Get race of character
	  */
	 public abstract String getRace();
	 
	 /*
	  * displays info name health and power of character
	  */
	 public void displayInfo() {
	System.out.println("name: "+this.name+"\n");
	System.out.println("health: "+this.health+"\n");
	System.out.println("power: "+this.power+"\n");
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}
	 
	 
	 
}
