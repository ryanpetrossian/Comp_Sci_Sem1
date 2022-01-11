import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write your name.");
		String name = sc.nextLine();
		
		System.out.println("How many times do you want your name to be displayed on the screen?");
		int count = sc.nextInt();
		
		int c = 0;
		while(true)
		{
		System.out.println(name);
		if(c == count)
		{
		break;
		}
		c = c + 1;
		} 



		
	}
}
