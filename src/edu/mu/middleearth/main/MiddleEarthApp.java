package edu.mu.middleearth.main;
import edu.mu.middleearth.manager.CharacterManager;
import edu.mu.middleearth.singleton.MiddleEarthCouncil;

public class MiddleEarthApp {

	public static void main(String[] args) {
		
		CharacterManager manager = MiddleEarthCouncil.getInstance().getCharacterManager();

		        
		Menu menu = new Menu(manager);
		menu.display();
		    

}
}