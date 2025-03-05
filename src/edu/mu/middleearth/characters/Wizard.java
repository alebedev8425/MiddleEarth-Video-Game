package edu.mu.middleearth.characters;

public class Wizard extends MiddleEarthCharacter {
	
	/**
	 * Calls MiddleEarthCharacter constructor 
	 */
	public Wizard(String name, double health, double power) {
		super(name, health, power);
	}

	/**
	 * Function uses getRace() on the parameter(target) then compares the string values to determine 
	 * effectiveness of attack. 
	 *  *1.5 against dwarf, *0 against wizard and human, *1 for everything else
	 * @param MiddleEarthCharacter target of the attack
	 * @return boolean true for successful attack, false for unsuccessful attack
	 */
	
	@Override
	public Boolean attack(MiddleEarthCharacter target) {
		if (target.getRace().equals("dwarf")) { 
			target.health -= (this.power *1.5);
			return true;
			}
			
			if (target.getRace().equals("human") || target.getRace().equals("wizard")) {
				return false; 
			}
			
			target.health -= this.power; 
			return true; 
	}
	
	/**
	 * returns race as a string. Important for attack function as the all lower case name is used 
	 * for comparison. 
	 */

	@Override
	public String getRace() {
		
		return "wizard";
	}

}
