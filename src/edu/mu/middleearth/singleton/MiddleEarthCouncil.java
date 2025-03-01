package edu.mu.middleearth.singleton;

import edu.mu.middleearth.manager.CharacterManager;

public class MiddleEarthCouncil {

	
	// private static variable to hold the single instance
	private static MiddleEarthCouncil instance = null;
	
	// character Manager instance for managing the characters
	private CharacterManager characterManager;
	
	// private constructor to prevent instantiation from outside 
	private MiddleEarthCouncil() {
		characterManager = new CharacterManager();
	}
	
	// Public static method to provide access to the single instance
	public static MiddleEarthCouncil getInstance() {
		if (instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance; 
	}
	
	// method to provide access to character manager
	public CharacterManager getCharacterManager() {
		return characterManager;
	}
}
