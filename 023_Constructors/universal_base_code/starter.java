import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a Wizard, a Warrior, or a Rogue?");
		myCharacter.role = sc.nextLine();
		
		if(myCharacter.role.equals("Wizard") || myCharacter.role.equals("wizard"))
		{
			System.out.println("You've chosen to be a Wizard!");
			myCharacter.role = "Wizard";
		}
		else if(myCharacter.role.equals("Warrior") || myCharacter.role.equals("warrior"))
		{
			System.out.println("You've chosen to be a Warrior!");
			myCharacter.role = "Warrior";
		}
		else if(myCharacter.role.equals("Rogue") || myCharacter.role.equals("rogue"))
		{
			System.out.println("You've chosen to be a Rogue!");
			myCharacter.role = "Rogue";
		}
		else
		{
			System.out.println("No correct role.");
			myCharacter.role = "No Role";
		}
		
		myCharacter x = new myCharacter();
		myCharacter y = new myCharacter(myCharacter.role);
		x.output();
		y.output();
		
	}
	
	
	
	}
