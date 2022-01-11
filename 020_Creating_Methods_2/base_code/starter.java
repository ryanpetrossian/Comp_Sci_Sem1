import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int a, int b) {
		int x = a;
		int y = b;
		int power = (int) Math.pow(a,b);
		System.out.println(" ");
		System.out.println("The result is: " + power);
		return power;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int x = sc.nextInt();
		System.out.println("What is your exponent?");
		int y = sc.nextInt();
		
		pow(x,y); 
		
	}
}
