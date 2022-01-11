import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick an integer.");
		int num1 = sc.nextInt();
		System.out.println("Pick another integer.");
		int num2 = sc.nextInt();
		boolean x = num1 != num2;
		if(x)
		{
			System.out.println("These values are different.");
		}
		else
		{
			System.out.println("These values are the same. I said pick another integer.");
		}
		}
	}
