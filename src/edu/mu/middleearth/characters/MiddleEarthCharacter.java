package edu.mu.middleearth.characters;

public abstract class MiddleEarthCharacter {
/**
 * Fields for MiddleEarthChracter
 */
	String name;
	double health; 
	double power; 
	
	/**
	 * Constructor for MiddleEarthCharacter
	 * @param String name of the character
	 * @param double  health of the character
	 * @param double power of the character
	 */
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name; 
		this.health = health;
		this.power = power; 
	}
	
	/**
	 * Attack is performed on target, each attack differs the amount of health lost from target.
	 * @param MiddleEarthCharacter target of the attack
	 * @return boolean
	 */
	 public abstract Boolean attack(MiddleEarthCharacter target);
	
	 /**
	  * Get race of character
	  * @return String
	  */
	 public abstract String getRace();
	 
	 /**
	  * displays info name health and power of character
	  */
	 public void displayInfo() {
	System.out.println("name: "+this.name+"\n");
	System.out.println("health: "+this.health+"\n");
	System.out.println("power: "+this.power+"\n");
	 }
	 
	/**
	 * getter function for the name
	 * @return name of the character
	 */

	public String getName() {
		return name;
	}
	
	/**
	 * setter for the name
	 * @param name of the character
	 */

	public void setName(String name) {
		this.name = name;
	}
	/**
	 * getter for the health
	 * @return health of the character
	 */

	public double getHealth() {
		return health;
	}
	
	/**
	 * setter for the health
	 * @param health of the character
	 */

	public void setHealth(double health) {
		this.health = health;
	}
	
	/**
	 * getter for the power
	 * @return power of the character
	 */

	public double getPower() {
		return power;
	}
	
	/**
	 * setter for the power
	 * @param power of the character
	 */

	public void setPower(double power) {
		this.power = power;
	}
	 
	 
	 
}
