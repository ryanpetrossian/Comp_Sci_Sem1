import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name=sc.nextLine();
		
		System.out.println("What is your title?");
		String title=sc.nextLine();
		
		System.out.println("Are you a Wizard, a Warrior, or a Rogue?");
		String role=sc.nextLine();
		
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
		
		System.out.println("You have 25 points to spend on the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.print("Strength (1-10): ");
		int s = sc.nextInt();
		
		if(s>10)
		{
			System.out.println("Please input a smaller value.");
			s = sc.nextInt();
		}
		
		System.out.println("You have " + (25-s) + " points left to spend.");
		System.out.print("Dexterity (1-10): ");
		int d = sc.nextInt();
		
			if(d>10 || d>(25-s))
		{
			System.out.println("Please input a smaller value.");
			d = sc.nextInt();
		}
		
		System.out.println("You have " + (25-(s+d)) + " points left to spend.");
		System.out.print("Intelligence (1-10): ");
		int i = sc.nextInt();
		
			if(i>10 || i>(25-(s+d)))
		{
			System.out.println("Please input a smaller value.");
			i = sc.nextInt();
		}
		
		System.out.println("You have " + (25-(s+d+i)) + " points left to spend.");
		System.out.print("Constitution (1-10): ");
		int c = sc.nextInt();
		
			if(c>10 || c>(25-(s+d+i)))
		{
			System.out.println("Please input a smaller value.");
			c = sc.nextInt();
		}
		
		System.out.println("You have " + (25-(s+d+i+c)) + " points left to spend.");
		System.out.print("Charisma (1-10): ");
		int h = sc.nextInt();
		
			if(h>10 || h>(25-(s+d+i+c)))
		{
			System.out.println("Please input a smaller value.");
			h = sc.nextInt();
		}
		
		System.out.println("You have " + (25-(s+d+i+c+h)) + " points to spend next time.");
		
		System.out.println(" ");
		System.out.println("You are " + name + ", the " + title + " of CVHS.");
		System.out.println(" ");
		System.out.println("You are a " + role + " with the following stats:");
		System.out.println(" ");
		System.out.println("Strength - " + s);
		System.out.println("Dexterity - " + d);
		System.out.println("Intelligence - " + i);
		System.out.println("Constitution - " + c);
		System.out.println("Charisma - " + h);
		System.out.println(" ");
		System.out.println("Good luck on your quest!");
		
	}
}
