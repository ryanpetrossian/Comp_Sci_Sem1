import java.util.Scanner;
import java.util.Random;

//This one is the for loop

class starter {
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
    	int num1 = 0;
    	int num2 = 0;
    	String  primes = "";
    	for (num1 = 1; num1 <= a; num1++)  	   
    	{ 		 		  
        	int count = 0; 
        	
        	for(num2 = num1; num2 >= 1; num2 --)
        	{
	    		if(num1 % num2 == 0)
	    		{
					count = count + 1;
	    		}
			}
				if (count == 2)
				{
	    			primes = primes + num1 + " ";
				}	
    	}	
    	System.out.println(primes);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer.");
		int a = sc.nextInt();
		
		checkPrime(a);
		printPrimes(a);
	}
}
