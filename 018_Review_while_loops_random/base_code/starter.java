import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int guess = 0;
		int secret = rand.nextInt(1000)+1;
		int success = 0;
		
		while (success == 0)
     {
        System.out.println("Pick a number betwen 1 and 1000.");
        guess = sc.nextInt();

           if (guess < 1 || guess > 1000)
           {
              System.out.println("Invalid input.");
           }

           else if (guess == secret)
           {
              success++;
              System.out.println("Congratulations you won!");
           }
           else if (guess < secret)
           {
              System.out.println("Your guess is too low!");
           }
           else if (guess > secret)
           {
              System.out.println("Your guess is too high!");
           }   
    }
    

		



		
	}
}
