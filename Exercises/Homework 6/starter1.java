import java.util.Scanner;
import java.util.Random;

//I submitted one with a for loop and one with a while loop
//This one is the while loop

class starter1 {
	public static boolean checkPrime(int a) {
		int x = a;
		boolean flag = false;
    	while (x <= a / 2) 
    		{
    		if (a % x == 0) 
    			{
        		flag = true;
    			break;
    			}
    		++a;
    		}
    	return flag;
		
	}
	
	public static void printPrimes(int a) {
    	int num1;
		int num2 = 1;
		int num3;

		while (num2 <= a) 
		{
			num3 = 0;
			num1 = 2;
		while (num1 <= num2 / 2) 
		{
    		if (num2 % num1 == 0) 
    		{
    			num3++;
    			break;
    		}
    	num1++;
		}
		if (num3 == 0 && num2 != 1) 
		{
	 		System.out.print(num2 + " ");
		}
		num2++;
	}

}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer.");
		int a = sc.nextInt();
		
		checkPrime(a);
		printPrimes(a);
	}
}
