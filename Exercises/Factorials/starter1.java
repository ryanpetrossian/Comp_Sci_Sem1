import java.util.Scanner;

class starter1 {
	public static void main(String args[]) {
		// The while loop one
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer.");
		int c = sc.nextInt();
        int fact = 1;
        int i = 1;
        while(i<=c)
        {
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial of "+c+" is: "+fact);
 }  
}  

