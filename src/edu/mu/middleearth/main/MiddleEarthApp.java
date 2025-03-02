package edu.mu.middleearth.main;
import edu.mu.middleearth.characters.*;

public class MiddleEarthApp {

	public static void main(String[] args) {
		/*
		 * test code for middleearthcharacter functions, delete as necessary; 
		 * 1 of each type of race
		 */
		Dwarf mydwarf = new Dwarf("tyrion", 100, 32.2);
		Wizard mywizard =new Wizard("gandolf",100, 10);
		Human myhuman = new Human("bob",100,15);
		Orc myorc = new Orc("orcus",100,25);
		Elf myelf = new Elf("alfonso",100,5);
		
		mydwarf.displayInfo();//test display info 
		System.out.println("race is: "+mydwarf.getRace()); //test race 
		
		
		myhuman.attack(mywizard); 
		mywizard.displayInfo();  //info after attack, should be lower than initial health stat
		
	}//delete test code whenever necessary!!

}
