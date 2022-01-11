import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static String role;
	public static String setRole(String role) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a Wizard, a Warrior, or a Rogue?");
		role=sc.nextLine();
		
		if(role.equals("Wizard") || role.equals("wizard"))
		{
			System.out.println("You've chosen to be a Wizard!");
		}
		else if(role.equals("Warrior") || role.equals("warrior"))
		{
			System.out.println("You've chosen to be a Warrior!");
		}
		else if(role.equals("Rogue") || role.equals("rogue"))
		{
			System.out.println("You've chosen to be a Rogue!");
		}
		else
		{
			System.out.println("You've chosen not to choose. Kindly leave.");
		}
		return role;
	}
	public static int setStrength(int strength) {
		return strength;
	}
	public static int setDexterity(int dexterity) {
		return dexterity;
	}
	public static int setIntelligence(int intelligence) {
		return intelligence;
	}
	public static int setConstitution(int constitution) {
		return constitution;
	}
	public static int setCharisma(int charisma) {
		return charisma;
	}
	public static boolean setAll(String role, int strength, int dexterity, int intelligence, int constitution, int charisma) {
		return true;
	}
	
	
	public static void main(String args[]) {
		String a = role;
		
		setRole(a);
		setStrength(0);
		setDexterity(0);
		setIntelligence(0);
		setConstitution(0);
		setCharisma(0);
		setAll(a , 0, 0, 0, 0, 0);


		
	}
	
}
