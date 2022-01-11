import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("The given number "+num+" is Even ");
        }
        else
        {
            System.out.println("The given number "+num+" is Odd ");
		}
		
		if(num % 3 == 0 && num % 4 == 0 && num % 5 == 0)
        {
            System.out.println("The given number "+num+" is divisible by 3, 4, AND 5.");
        }
        else
        {
            System.out.println("The given number "+num+" is not divisible by 3, 4, AND 5.");
		}
	}
}
