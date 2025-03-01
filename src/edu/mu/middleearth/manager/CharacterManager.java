package edu.mu.middleearth.manager;

import edu.mu.middleearth.characters.MiddleEarthCharacter;

public class CharacterManager {
	
	MiddleEarthCharacter[] characters;
	int size;
	private static final int INITIAL_CAPACITY = 10;
	
	/**
	 * 
	 */
	
	public CharacterManager() {
		characters = new MiddleEarthCharacter[INITIAL_CAPACITY];
		size = 0;
	
	}
	/**
	 * 
	 * @param c
	 * @return
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
	
	

}
