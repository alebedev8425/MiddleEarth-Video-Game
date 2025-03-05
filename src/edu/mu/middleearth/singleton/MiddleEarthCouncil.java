package edu.mu.middleearth.singleton;

import edu.mu.middleearth.manager.CharacterManager;

public class MiddleEarthCouncil {

	
	/**
	 * private static instance of MiddleEarthCoucil initialized to null
	 */
	private static MiddleEarthCouncil instance = null;
	
	/**
	 * private initialization of characterManager
	 */
	private CharacterManager characterManager;
	
	/**
	 * private constructor to prevent instantiation from outside  
	 */
	private MiddleEarthCouncil() {
		characterManager = new CharacterManager();
	}
	
	/**
	 * public static method to provide access to the single instance
	 * @return returns the single instance
	 */
	public static MiddleEarthCouncil getInstance() {
		if (instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance; 
	}
	
	/**
	 * method to provide access to character manager
	 * @return returns the characterManager
	 */
	public CharacterManager getCharacterManager() {
		return characterManager;
	}
}
