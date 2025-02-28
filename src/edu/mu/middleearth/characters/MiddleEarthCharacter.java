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
	 public void displayinfo() {
	System.out.println("name: "+this.name+"\n");
	System.out.println("health: "+this.health+"\n");
	System.out.println("power: "+this.power+"\n");
	 }
	 
	 
}
