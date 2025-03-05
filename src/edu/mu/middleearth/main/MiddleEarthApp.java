package edu.mu.middleearth.main;
import edu.mu.middleearth.manager.CharacterManager;
import edu.mu.middleearth.singleton.MiddleEarthCouncil;

public class MiddleEarthApp {

	public static void main(String[] args) {
		
		/**
		 * create a CharacterManager instance using singleton class MiddleEarthCouncil
		 */
		
		CharacterManager manager = MiddleEarthCouncil.getInstance().getCharacterManager();

		/**
		 * create a menu object and run the display method
		 */
		        
		Menu menu = new Menu(manager);
		menu.display();
		    

}
}