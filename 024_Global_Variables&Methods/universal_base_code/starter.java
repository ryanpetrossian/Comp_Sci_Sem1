import pkg.*;
import java.util.Scanner;
import java.util.Random;

class myCharacter {
	public static String role = "rogue";
	public static int strength = 0;
	public static int dexterity = 0;
	public static int intelligence = 0;
	public static int consititution = 0;
	public static int charisma = 0;
	
	public static void myToString() {
		System.out.println("Your role is " + role + ".");
		System.out.println("Your strength trait is " + strength + ".");
		System.out.println("Your dexterity trait is " + dexterity + ".");
		System.out.println("Your intelligence trait is " + intelligence + ".");
		System.out.println("Your consititution trait is " + consititution + ".");
		System.out.println("Your charisma trait is " + charisma + ".");
	}
}

class starter {
	public static void main(String args[]) {
		myCharacter.myToString();
	}
}
