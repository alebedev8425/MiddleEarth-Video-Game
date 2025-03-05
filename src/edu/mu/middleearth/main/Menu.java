package edu.mu.middleearth.main;

import java.util.Scanner;

import edu.mu.middleearth.characters.*;
import edu.mu.middleearth.characters.MiddleEarthCharacter;
import edu.mu.middleearth.manager.CharacterManager;

public class Menu {
	  private Scanner scanner;
	    private CharacterManager manager;

	    /**
	     * constructs a Menu with a given CharacterManager.
	     *
	     * @param manager of type CharacterManager to use for the CRUD operations
	     */
	    public Menu(CharacterManager manager) {
	        this.manager = manager;
	        this.scanner = new Scanner(System.in);
	    }

	    /**
	     * displays menu and processes user choices
	     */
	    public void display() {
	        int choice = 0;
	        do {
	            System.out.println("\n--- Middle-Earth Character Management ---");
	            System.out.println("1. Add a new character.");
	            System.out.println("2. View all characters.");
	            System.out.println("3. Update a character.");
	            System.out.println("4. Delete a character.");
	            System.out.println("5. Attack a character.");
	            System.out.println("6. Exit.");
	            System.out.print("Enter your choice: ");
	            try {
	                choice = Integer.parseInt(scanner.nextLine());
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter a number.");
	                continue;
	            }
	            switch (choice) {
	                case 1:
	                    addCharacter();
	                    break;
	                case 2:
	                    manager.displayAllCharacters();
	                    break;
	                case 3:
	                    updateCharacter();
	                    break;
	                case 4:
	                    deleteCharacter();
	                    break;
	                case 5:
	                    attackCharacter();
	                    break;
	                case 6:
	                    System.out.println("Exiting menu.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 6);
	    }

	    private void addCharacter() {
	        System.out.print("Enter character name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter character race (Elf, Dwarf, Human, Orc, Wizard): ");
	        String race = scanner.nextLine();
	        System.out.print("Enter health: ");
	        double health = Double.parseDouble(scanner.nextLine());
	        System.out.print("Enter power: ");
	        double power = Double.parseDouble(scanner.nextLine());

	        MiddleEarthCharacter character = null;
	        switch (race.toLowerCase()) {
	            case "elf":
	                character = new Elf(name, health, power);
	                break;
	            case "dwarf":
	                character = new Dwarf(name, health, power);
	                break;
	            case "human":
	                character = new Human(name, health, power);
	                break;
	            case "orc":
	                character = new Orc(name, health, power);
	                break;
	            case "wizard":
	                character = new Wizard(name, health, power);
	                break;
	            default:
	                System.out.println("Invalid race entered.");
	                return;
	        }
	        manager.addCharacter(character);
	        System.out.println("Character added successfully!");
	    }
	    
	    private void attackCharacter() {
	        System.out.print("Enter the name of the attacking character: ");
	        String attackerName = scanner.nextLine();
	        MiddleEarthCharacter attacker = manager.getCharacter(attackerName);
	        if (attacker == null) {
	            System.out.println("Attacker not found.");
	            return;
	        }
	        System.out.print("Enter the name of the target character: ");
	        String targetName = scanner.nextLine();
	        MiddleEarthCharacter target = manager.getCharacter(targetName);
	        if (target == null) {
	            System.out.println("Target not found.");
	            return;
	        }
	        System.out.println("\n" + attacker.getName() + " (" + attacker.getRace() + ") attacks " 
	                + target.getName() + " (" + target.getRace() + ")");
	        if (attacker.attack(target)) {
	            System.out.println("Attack successful! " + target.getName() 
	                    + "'s new health is: " + target.getHealth());
	        } else {
	            System.out.println("Attack was ineffective.");
	        }
	    }


	    
	    
}
