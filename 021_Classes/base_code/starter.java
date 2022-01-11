import java.util.Scanner;
import java.util.Random;

class character {
	String role = new String("Wizard");
	int strength = 10;
	int dexterity = 10;
	int intelligence = 10;
	int constitution = 10;
	int charisma = 10;
}

class starter {
	public static void main(String args[]) {
		character myCharacter = new character();
		
		System.out.println(myCharacter.role);
		System.out.println("Stats: ");
		System.out.println("Strength: " + myCharacter.strength);
		System.out.println("Dexterity: " + myCharacter.dexterity);
		System.out.println("Intelligence: " + myCharacter.intelligence);
		System.out.println("Constitution: " + myCharacter.constitution);
		System.out.println("Charisma: " + myCharacter.charisma);



		
	}
}
