package edu.mu.middleearth.manager;

import edu.mu.middleearth.characters.MiddleEarthCharacter;

public class CharacterManager {
	
	MiddleEarthCharacter[] characters;
	int size;
	private static final int INITIAL_CAPACITY = 10;
	
	/**
	 * CharacterManager default constructor
	 */
	
	public CharacterManager() {
		characters = new MiddleEarthCharacter[INITIAL_CAPACITY];
		size = 0;
	
	}
	/**
	 * addCharacter method adds a character to the characters array, if it overfills it doubles the size of the array
	 * @param c this is the input MiddleEarthCharacter to be added
	 * @return boolean returns false if character addition did not work and true if it did
	 */
	
	public boolean addCharacter(MiddleEarthCharacter c) {
		if (c == null) {
			return false;
		} else if (size >= characters.length){
			MiddleEarthCharacter[] newCharacters = new MiddleEarthCharacter[characters.length * 2];
			for (int i = 0; i < characters.length; i++) {
				newCharacters[i] = characters[i];
			}
			characters = newCharacters;
		}
		characters[size++] = c;
		return true;
		
	}
	/**
	 * this method allows retrieval of a character from the characters array
	 * @param name the name of the character that should be retrieved
	 * @return returns the character  if found in the array, returns null if not
	 */
	
	public MiddleEarthCharacter getCharacter(String name) {
		if (name == null) {
			return null;
		}
		for (int i = 0; i < size; i++) {
			if (characters[i].getName().equalsIgnoreCase(name)) {
				return characters[i];
			}
		}
		return null;
	}

	/**
	 * updateCharacter method allows the update details of a character already stored in the system
	 * @param character the MiddleEarthCharacter that should be updated
	 * @param name the name of the character
	 * @param health the health of the character
	 * @param power the power of the character
	 * @return boolean returns true if update was successful, and false if not
	 */

	public boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power) {
	    if (character == null) {
            return false;
        }
        boolean updatedOrNot = false;
        if (!character.getName().equals(name)) {
            character.setName(name);
            updatedOrNot = true;
        }
        if (character.getHealth() != health) {
            character.setHealth(health);
            updatedOrNot = true;
        }
        if (character.getPower() != power) {
            character.setPower(power);
            updatedOrNot = true;
        }
        
        return updatedOrNot;
        
}
	/**
	 * deleteCharacter method allows deletion of a character stored in the system
	 * @param character inputs the character that should be deleted
	 * @return boolean returns true if deletion was successful, and false if not
	 */

	public boolean deleteCharacter(MiddleEarthCharacter character) {
		 if (character == null) {
	            return false;
	        }
	        for (int i = 0; i < size; i++) {
	            if (characters[i] == character) {
	                // Shift elements left.
	                for (int j = i; j < size - 1; j++) {
	                    characters[j] = characters[j + 1];
	                }
	                characters[size - 1] = null;
	                size--;
	                return true;
	            }
	        }
	        return false;
	}
	
	/**
	 * this method allows displaying of all characters stored in the system
	 */
	
    public void displayAllCharacters() {
        if (size == 0) {
            System.out.println("No characters to display.");
        }
        for (int i = 0; i < size; i++) {
            characters[i].displayInfo();
        }
    }
	
}
	
	