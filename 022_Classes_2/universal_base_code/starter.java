import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter character = new myCharacter();
		System.out.println(myCharacter.role);
		System.out.println("Stats: ");
		System.out.println("Strength: " + myCharacter.strength);
		System.out.println("Dexterity: " + myCharacter.dexterity);
		System.out.println("Intelligence: " + myCharacter.intelligence);
		System.out.println("Constitution: " + myCharacter.constitution);
		System.out.println("Charisma: " + myCharacter.charisma);


		
	}
}
