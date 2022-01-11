import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Guess a number between 1 and 1000.");
		int num1 = sc.nextInt();
		int rand_num1 = rand.nextInt(1000)+1;
		if(num1 == rand_num1)
		{
			System.out.println("You guessed it!");
		}
		else if(num1 <= rand_num1)
		{
			System.out.println("Higher.");
		}
		else if(num1 >= rand_num1)
		{
			System.out.println("Lower.");
		}
	}
}
