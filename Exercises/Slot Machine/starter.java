import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("You have 100 virtual dollars!");
		int balance = 100;
		while (true) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("How much would you like to wager?");
		int wager = sc.nextInt();
		int roll1 = rand.nextInt(7)+1;
		int roll2 = rand.nextInt(7)+1;
		int roll3 = rand.nextInt(7)+1;
		
		System.out.println(roll1 + ", " + roll2 + ", " + roll3);
		
		if (roll1 == roll2 || roll2 == roll3 || roll1 == roll3)
			{
				System.out.println("Your wager has doubled!");
				balance = (balance + wager);
				wager = (wager *2);
				System.out.println("You now have " + balance + " virtual dollars with a " + wager + " dollar wager!");
			}
		else if (roll1 == roll2 && roll2 == roll3 && roll1 == roll3)
			{
				System.out.println("Jackpot! Your wager has tripled!");
				balance = (balance + wager);
				wager = (wager *3);
				System.out.println("You now have " + balance + " virtual dollars with a " + wager + " dollar wager!");
			}
		else
			{
				System.out.println("No matches, sorry!");
				balance = (balance - wager);
				System.out.println("You now have " + balance + " virtual dollars with a " + wager + " dollar wager!");
			}
			
			if (balance <= 0)
				{
					System.out.println("Looks like you're leaving " + balance + " dollars richer!");
					break;
				}
			
		System.out.println(" ");
		System.out.println("Would you like to keep playing or walk home with the money you've got?");
		sc.nextLine();
		String contgame = sc.nextLine();
		
		if(contgame.equals("Yes") || contgame.equals("yes") || contgame.equals("Y") || contgame.equals("y"))
			{
				System.out.println("Ah, a risk taker! I like you...");
				continue;
			}
		else if (contgame.equals("No") || contgame.equals("no") || contgame.equals("N") || contgame.equals("n"))
			{
				System.out.println("Looks like you're leaving " + balance + " dollars richer!");
				break;
			}
		}
	}
	
}

